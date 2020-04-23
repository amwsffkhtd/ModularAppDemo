package per.android.study.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import per.android.study.routerlib.routerpath.LoginPath;

public class MainLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login_activity);


        Button btn_go_login = findViewById(R.id.btn_go_login);
        btn_go_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(Actions.openLoginIntent(MainActivity.this));
                ARouter.getInstance().build(LoginPath.LOGINACTIVITY).navigation();

            }
        });
    }
}
