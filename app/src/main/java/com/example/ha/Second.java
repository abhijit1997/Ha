package com.example.ha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class Second extends AppCompatActivity {
    private LayoutInflater layoutInflater1;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final Button test1 = (Button) findViewById(R.id.pune);
        test1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                layoutInflater1 = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater1.inflate(R.layout.popup, null);
                final PopupWindow popupWindow = new PopupWindow(popupView, 400, 400, true);
                Button dismiss = (Button) findViewById(R.id.dismiss);
                dismiss.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(test1, 50, -30);

            }
        });
    }
public void next1(View view){
    Intent intent1=new Intent(this,third.class);
    startActivity(intent1);



}


}
