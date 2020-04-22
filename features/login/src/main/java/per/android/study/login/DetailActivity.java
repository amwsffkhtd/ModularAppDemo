package per.android.study.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import per.android.study.actions.Actions;
import per.android.study.routerlib.routerpath.DashboardPath;
import per.android.study.routerlib.routerpath.LoginPath;

@Route(path = LoginPath.DETAILACTIVITY)
public class DetailActivity extends AppCompatActivity {
    private Button btn_dashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);


        btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(DashboardPath.DASHBOARDACTIVITY).navigation();
            }
        });
    }
}
