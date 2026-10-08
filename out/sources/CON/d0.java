package CON;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import j6.i1;
import j6.z0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCON/d0;", "LCON/c0;", "<init>", "()V", "LCON/v0;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Loq/i0;", "a", "(LCON/v0;LCON/v0;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d0 extends c0 {
    @Override // CON.b0, CON.y, CON.f0
    public void a(v0 statusBarStyle, v0 navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        v0 v0Var;
        z0.b(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) == 0 && attributes.width == -2 && attributes.height == -2) {
            v0Var = navigationBarStyle;
        } else {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int iD = statusBarStyle.d(statusBarIsDark);
            v0Var = navigationBarStyle;
            int iD2 = v0Var.d(navigationBarIsDark);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new n6.d(viewGroup.getContext(), pq.v.q(new n6.a(2, iD), new n6.a(1, iD2), new n6.a(4, iD2), new n6.a(8, iD2))));
        }
        window.setNavigationBarContrastEnforced(v0Var.getNightMode() == 0);
        i1 i1Var = new i1(window, view);
        i1Var.b(!statusBarIsDark);
        i1Var.a(!navigationBarIsDark);
    }
}
