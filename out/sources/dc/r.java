package dc;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40771a = ub.w.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i15, boolean z15) {
        if (i15 == 0) {
            return z15;
        }
        return i15 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z15) {
        try {
            if (z15 == b(a(context, cls.getName()), false)) {
                ub.w.e().a(f40771a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z15 ? 1 : 2, 1);
            ub.w wVarE = ub.w.e();
            String str = f40771a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(cls.getName());
            sb5.append(" ");
            sb5.append(z15 ? "enabled" : "disabled");
            wVarE.a(str, sb5.toString());
        } catch (Exception e15) {
            ub.w wVarE2 = ub.w.e();
            String str2 = f40771a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(cls.getName());
            sb6.append("could not be ");
            sb6.append(z15 ? "enabled" : "disabled");
            wVarE2.b(str2, sb6.toString(), e15);
        }
    }
}
