package pt.ipbeja.tvtime.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {User.class, Series.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDAO getUserDAO();
    public abstract SeriesDAO getSeriesDAO();

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
                            db.execSQL("INSERT INTO Series(nomeSerie, idCategoria, Imdb, descricao, imagem) " +
                                    "VALUES ('Backlist', 4, '8,1'," +
                                    "'Uma nova criadora de perfis do FBI, Elizabeth Keen, teve toda a sua vida arrancada quando um criminoso misterioso, Raymond Reddington, que escapou da captura por décadas, se entrega e insiste em falar apenas com ela.' , 'https://m.media-amazon.com/images/M/MV5BNTIxODc2Mzk3Nl5BMl5BanBnXkFtZTgwMTE5MjQxMDE@._V1_.jpg')");
                        }
                    })
                    .build();
        }
        return INSTANCE;
    }


}


