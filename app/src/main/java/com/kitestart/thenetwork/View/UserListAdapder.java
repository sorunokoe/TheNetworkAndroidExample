package com.kitestart.thenetwork.View;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kitestart.thenetwork.Model.UserModel;
import com.kitestart.thenetwork.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class UserListAdapder extends ArrayAdapter<UserModel>{

        private Context mContext;
        private List<UserModel> userList;

    public UserListAdapder(Context context, ArrayList<UserModel> list) {
        super(context, 0 , list);
        mContext = context;
        userList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        UserModel user = userList.get(position);

        TextView name = listItem.findViewById(R.id.nameTextView);
        TextView status = listItem.findViewById(R.id.statusTextView);

        name.setText( user.getName() );
        status.setText( user.getStatus() );


        return listItem;

    }
}