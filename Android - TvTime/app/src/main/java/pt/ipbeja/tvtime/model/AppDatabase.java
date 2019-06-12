package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(version = 1, entities = {User.class})
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
                .build();
    }
    return INSTANCE;
    }


}


