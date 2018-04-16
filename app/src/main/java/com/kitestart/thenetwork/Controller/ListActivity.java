package com.kitestart.thenetwork.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.kitestart.thenetwork.Model.UserModel;
import com.kitestart.thenetwork.R;
import com.kitestart.thenetwork.View.UserListAdapder;

public class ListActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = findViewById(R.id.userList);
        createUsers();


        UserListAdapder adapder = new UserListAdapder(this, UserModel.allUsers);
        list.setAdapter(adapder);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(getApplicationContext(), DetailUserActivity.class);

                intent.putExtra("name", UserModel.allUsers.get(position).getName().toString());
                intent.putExtra("status", UserModel.allUsers.get(position).getStatus().toString());
                intent.putExtra("long", UserModel.allUsers.get(position).getLongitude().toString());
                intent.putExtra("lat", UserModel.allUsers.get(position).getLatitude().toString());

                startActivity(intent);

                //Toast.makeText(ListActivity.this, UserModel.allUsers.get(position).getName().toString(), Toast.LENGTH_SHORT).show();

            }
        });


    }
    void createUsers(){
        UserModel u1 = new UserModel("Tom", 12, "Hello Worbhsdb", "-34", " 151");
        UserModel u2 = new UserModel("Jerry", 23, "Abc TOm is shit", "13.434", "14.242");

        UserModel.allUsers.add(u1);
        UserModel.allUsers.add(u2);

    }
}
