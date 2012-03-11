package com.example.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class ProjectActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Create an object of type SplashHandler
          SplashHandler mHandler = new SplashHandler();
          // set the layout for this activity
          setContentView(R.layout.main);
          // Create a Message object
          Message msg = new Message();
          //Assign a unique code to the message.
          //Later, this code will be used to identify the message in Handler class.
          msg.what = 0;
          // Send the message with a delay of 3 seconds(3000 = 3 sec).
          mHandler.sendMessageDelayed(msg, 4000);
      }     
      
      // Handler class implementation to handle the message
      private class SplashHandler extends Handler {
          
          //This method is used to handle received messages
          public void handleMessage(Message msg)
            {
              // switch to identify the message by its code
              switch (msg.what)
              {
              default:
              case 0:
                super.handleMessage(msg);
                
                Intent next = new Intent();  //Create an intent to start the new activity.
                next.setClass(ProjectActivity.this,GridvActivity.class);
                startActivity(next);							 // Our intention is to start MainActivity
                ProjectActivity.this.finish();				// finish the current activity
              }
            }
      }    
     

          
      } 
          
   