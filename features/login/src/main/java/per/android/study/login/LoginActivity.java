package per.android.study.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import per.android.study.routerlib.routerpath.LoginPath;

@Route(path = LoginPath.LOGINACTIVITY)
public class LoginActivity  extends AppCompatActivity {

    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this,DetailActivity.class);
//                startActivity(intent);

                ARouter.getInstance().build(LoginPath.DETAILACTIVITY).navigation();
            }
        });
    }
}
