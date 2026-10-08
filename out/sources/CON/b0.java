package CON;

import android.view.View;
import android.view.Window;
import j6.i1;
import j6.z0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCON/b0;", "LCON/a0;", "<init>", "()V", "LCON/v0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Loq/i0;", "a", "(LCON/v0;LCON/v0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
class b0 extends a0 {
    @Override // CON.y, CON.f0
    public void a(v0 statusBarStyle, v0 navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        z0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.d(navigationBarIsDark));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode() == 0);
        i1 i1Var = new i1(window, view);
        i1Var.b(!statusBarIsDark);
        i1Var.a(true ^ navigationBarIsDark);
    }
}
