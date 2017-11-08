package layout.baitap.com.phuotthu.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KIMANH on 11/8/2017.
 */

public class Database extends SQLiteOpenHelper{

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // truy vấn không trả kết quả : CREATE, INSERT, UPDATE, DELETE
    public void QueryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }



    // truy vấn trả về kết quả : SELECT
    public Cursor GetData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return  database.rawQuery(sql, null);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
