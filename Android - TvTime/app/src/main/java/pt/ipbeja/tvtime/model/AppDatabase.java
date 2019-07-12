package pt.ipbeja.tvtime.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {User.class, Serie.class, Visto.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDAO getUserDAO();
    public abstract SeriesDAO getSeriesDAO();
    public abstract VistosDAO getVistosDAO();



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
                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES ('Backlist', 4, '8,1'," +
                                    "'Uma nova criadora de perfis do FBI, Elizabeth Keen, teve toda a sua vida arrancada quando um criminoso misterioso, Raymond Reddington, que escapou da captura por décadas, se entrega e insiste em falar apenas com ela.' , 'https://m.media-amazon.com/images/M/MV5BNTIxODc2Mzk3Nl5BMl5BanBnXkFtZTgwMTE5MjQxMDE@._V1_.jpg', 'true')");

                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES('Riverdale', 3, '7,3'," +
                                    "'After the death of one of the rich and popular Blossom twins on the 4th of July, the small town of Riverdale investigates the murder. The series starts in September, the beginning of a new school year, that brings with it new students, relationships, and reveals the mysteries of the past 4th of July.' , 'https://m.media-amazon.com/images/M/MV5BOGQxZDljZTktMzNlMC00NDFjLWI0ZmMtMmU0OTFkMDU0ZjNjXkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_SY1000_CR0,0,666,1000_AL_.jpg','true')");

                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES('American Dad', 2, '7,4'," +
                                    "'Stan Smith, who works for the C.I.A. and is constantly on the alert for terrorist activity, will go to extremes to protect his beloved America from harm; as evidenced by the terror-alert color code on his fridge, and his frequent knee-jerk reaction of shooting holes in the toaster whenever the toast pops up. In addition to Stans wife and teenage children, the Smith household has two rather unconventional members. There is Roger, the sarcastic space alien who rescued Stan from Area 51, who deeply resents the fact that he is not allowed to leave the house, and therefore, has been reduced to drinking wine and smoking cigarettes, and Klaus, a lascivious, German-speaking goldfish; the result of a C.I.A. experiment gone seriously wrong, where the C.I.A. tried to give a fish a German man is brain. Stans son is a dorky teenager who tries to be cool. His wife has had a past life of sex and drugs.' , 'https://m.media-amazon.com/images/M/MV5BNDRkOWIyOTUtMjg5YS00OTJjLTgwNGYtMjgxMTA0NWQ2NGI3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SY1000_CR0,0,666,1000_AL_.jpg','false')");

                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES('The Walking Dead', 1, '8,3'," +
                                    "'Sheriff Deputy Rick Grimes gets shot and falls into a coma. When awoken he finds himself in a Zombie Apocalypse. Not knowing what to do he sets out to find his family, after he is done that he gets connected to a group to become the leader. He takes charge and tries to help this group of people survive, find a place to live, and get them food. This show is all about survival, the risks, and the things you willll have to do to survive' , 'https://m.media-amazon.com/images/M/MV5BZmFlMTA0MmUtNWVmOC00ZmE1LWFmMDYtZTJhYjJhNGVjYTU5XkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_.jpg','false')");

                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES('Game of Thrones', 3, '9,4'," +
                                    "'In the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea.' , 'https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg')");

                            db.execSQL("INSERT INTO Serie(nomeSerie, idCategoria, Imdb, descricao, imagem, visto) " +
                                    "VALUES('The Chilling Adventures of Sabrina', 3, '7,7'," +
                                    "'Reimagines the origin and adventures of Sabrina: the Teenage Witch as a dark coming-of-age story that traffics in horror, the occult and, of course, witchcraft. Tonally in the vein of Rosemarys Baby and The Exorcist, this adaptation finds Sabrina Spellman wrestling to reconcile her dual nature - half-witch, half-mortal - while standing against the evil forces that threaten her, her family and the daylight world humans inhabit.' , 'https://m.media-amazon.com/images/M/MV5BMTg3MjY1MDUxMV5BMl5BanBnXkFtZTgwMzczNTU2NzM@._V1_SY1000_CR0,0,675,1000_AL_.jpg','false')");

                            db.execSQL("INSERT INTO User(password, email, nacionalidade)"+ "VALUES('123','teste','Potuguesa')");
                            db.execSQL("INSERT INTO User(password, email, nacionalidade)"+ "VALUES('123','123','123')");


                            db.execSQL("INSERT INTO Visto (idUser, idSerie, visto)" + "VALUES(1, 1, 'true')");
                        }
                    })

                    .build();
        }
        return INSTANCE;
    }

}


