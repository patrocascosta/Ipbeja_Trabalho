package pt.ipbeja.tvtime;

import java.util.ArrayList;
import java.util.List;

public class source {
    private static List<User>  loginEmailPass;

    public static List<User> getLoginEmailPass(){
      if (loginEmailPass == null) {
          loginEmailPass = new ArrayList<>();
          loginEmailPass.add(new User(01,"123","user1@email.pt","Portuguesa"));

      }

    return loginEmailPass;

    }
public static List<Series> serieImage;
    public static List<Series>  getSerieImage(){
        if(serieImage == null){
         serieImage = new ArrayList<>

        }



}



}
