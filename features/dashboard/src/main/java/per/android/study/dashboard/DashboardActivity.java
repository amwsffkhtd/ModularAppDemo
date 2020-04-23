package per.android.study.dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import per.android.study.routerlib.routerpath.DashboardPath;
import per.android.study.routerlib.routerpath.LoginPath;

@Route(path = DashboardPath.DASHBOARDACTIVITY)
public class DashboardActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        Button btn_go_login = findViewById(R.id.btn_login);
        btn_go_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(Actions.openLoginIntent(MainActivity.this));
                ARouter.getInstance().build(LoginPath.LOGINACTIVITY).navigation();

            }
        });
    }
}
