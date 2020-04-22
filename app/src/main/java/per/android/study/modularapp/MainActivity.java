package per.android.study.modularapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

import per.android.study.actions.Actions;
import per.android.study.routerlib.routerpath.LoginPath;

public class MainActivity extends AppCompatActivity {

    Button btn_go_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_go_login = findViewById(R.id.btn_go_login);
        btn_go_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(Actions.openLoginIntent(MainActivity.this));
                ARouter.getInstance().build(LoginPath.LOGINACTIVITY).navigation();

            }
        });


    }
}
