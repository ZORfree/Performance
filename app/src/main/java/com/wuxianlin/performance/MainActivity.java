package com.wuxianlin.performance;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
//        setContentView(R.layout.activity_main);
        dialog_2();
    }


    private String [] item = {"游戏","运动","电影","旅游","看书"};
    public void dialog_2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("请选择");
        builder.setItems(item, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "选择了"+item[which], Toast.LENGTH_SHORT).show();
                MainActivity.this.finish();
            }
        });
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                MainActivity.this.finish();
            }
        });
        AlertDialog alertDialog = builder.create();
//        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
    }
}
