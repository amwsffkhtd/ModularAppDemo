package per.android.study.actions;

import android.content.Context;
import android.content.Intent;

public class Actions {
    public static Intent openLoginIntent(Context context){
        return internalIntent(context,"per.android.study.login.open");
    }
    public static Intent openDashboardIntent(Context context){
        return internalIntent(context,"per.android.study.dashboard.open");
    }
    private static Intent internalIntent(Context context,String action){
        Intent intent= new Intent(action);
        String packageName = context.getPackageName();
        intent.setPackage(packageName);
        return intent;
    }
}
