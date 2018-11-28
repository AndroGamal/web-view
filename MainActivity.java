package com.example.andro.htmljavascript;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
WebView g;
Button j;
int i=0;
long []v={500,1000};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       j=findViewById(R.id.w);
       j.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               WebView browser=findViewById(R.id.a);
               browser.getSettings().setJavaScriptEnabled(true);
               browser.loadUrl("file:///storage/sdcard0/mail.html");//your page

           }
       });

       // g.loadUrl("file:///storage/sdcard0/t.html");
        //f.notify(1,m.build());
    }
}
