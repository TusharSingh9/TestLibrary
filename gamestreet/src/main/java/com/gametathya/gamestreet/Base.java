package com.gametathya.gamestreet;

import java.util.Objects;

public class Base {
   private static Base b=null;
   private Base(){

    }

    public static Base getInstance()
    {
        if (b == null)
            b = new Base();

        return b;
    }


    Boolean eanble=false;

   public void enableGameStreet(boolean value){
    eanble=value;
   }

   public long getUserId(){
    return 0l;
   }

      public void addHighScore(){

      }

}
