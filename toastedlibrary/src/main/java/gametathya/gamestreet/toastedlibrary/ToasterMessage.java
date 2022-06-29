package gametathya.gamestreet.toastedlibrary;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

    public static void submitHighScore(Context context  , int highScore){
        Intent newIntent = new Intent(Intent.ACTION_VIEW);
        Bundle bundle = new Bundle();
        bundle.putString("highScore", String.valueOf(highScore));
        newIntent.putExtra("data", bundle);

        //newIntent.setData(Uri.parse("Rana Ranvijay"));
        newIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        newIntent.setComponent (new ComponentName("com.example.flutter_to_native1" , "com.example.flutter_to_native1.MyBroadcastReceiver"));

        context.sendBroadcast(newIntent);
    }


}
