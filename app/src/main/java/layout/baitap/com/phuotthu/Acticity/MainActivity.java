package layout.baitap.com.phuotthu.Acticity;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.Database.Database;
import layout.baitap.com.phuotthu.Database.User;
import layout.baitap.com.phuotthu.Fragment.FragmentAccount;
import layout.baitap.com.phuotthu.Fragment.FragmentHome;
import layout.baitap.com.phuotthu.Fragment.FragmentNotification;
import layout.baitap.com.phuotthu.Fragment.FragmentSaved;
import layout.baitap.com.phuotthu.R;

public class MainActivity extends FragmentActivity {

    Database database;
    ArrayList<User> userArr;
    private TextView tv_home, tv_saved, tv_notification, tv_setting_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userArr = new ArrayList<>();
        createDatabase();
        insertDatabase();
        init();


    }

    private void init() {
        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_saved = (TextView) findViewById(R.id.tv_saved);
        tv_notification = (TextView) findViewById(R.id.tv_notification);
        tv_setting_account =(TextView) findViewById(R.id.tv_account);


        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentHome());
            }
        });
        tv_saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentSaved());
            }
        });
        tv_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentNotification());
            }
        });
        tv_setting_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentAccount());
            }
        });
    }

    public void addFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }

    private void createDatabase(){

        //tạo database
        database = new Database(this, "night_fury.sql",null,1);
        //tạo bảng user
        database.QueryData("CREATE TABLE IF NOT EXISTS user(Id INTEGER PRIMARY KEY AUTOINCREMENT, UserName VARCHAR(100), PassWord VARCHAR(100))");
        //tạo bảng địa điểm
        database.QueryData("CREATE TABLE IF NOT EXISTS diadiem(Id INTEGER PRIMARY KEY AUTOINCREMENT, dia_diem VARCHAR(100),chitiet VARCHAR(10000),hinhanh VARCHAR(100))");
        // tạo bảng comment
        database.QueryData("CREATE TABLE IF NOT EXISTS comment(Id INTEGER PRIMARY KEY AUTOINCREMENT,noidung VARCHAR(10000), id_user INTEGER, id_diadiem INTEGER)");

    }
    private void insertDatabase(){
        //database.QueryData("INSERT INTO user VALUES(null, 'Admin','12345')");

    }

    private ArrayList selectDatabaseUser(){
        // select data
        Cursor dataCongViec = database.GetData("SELECT * FROM user");
        while(dataCongViec.moveToNext()){
            int id = dataCongViec.getInt(0);
            String username = dataCongViec.getString(1);
            String password = dataCongViec.getString(2);
            userArr.add(new User(id,username,password));

        }
        return userArr;

    }


}
