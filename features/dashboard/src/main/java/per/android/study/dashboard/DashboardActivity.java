package per.android.study.dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

import per.android.study.routerlib.routerpath.DashboardPath;
import per.android.study.routerlib.routerpath.LoginPath;

@Route(path = DashboardPath.DASHBOARDACTIVITY)
public class DashboardActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
    }
}
