package pt.ipbeja.tvtime.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDAO getUserDAO();

    private static AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context){
    if (INSTANCE == null) {
        INSTANCE = Room.databaseBuilder(
                context.getApplicationContext(),
                AppDatabase.class,
                "UserDB")
                .allowMainThreadQueries()

                // inserir coisas na base de dados
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        //Meter codigo sql
                        db.execSQL("");

                    }
                })
                .build();
    }
    return INSTANCE;
    }


}


