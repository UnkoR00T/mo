package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    boolean a();

    boolean b();

    Context c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    boolean f();

    void g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    void j(int i15);

    int k();

    j6.v0 l(int i15, long j15);

    void m(boolean z15);

    void n();

    void o(boolean z15);

    void p();

    void q(s0 s0Var);

    void r(Drawable drawable);

    void s(int i15);

    void setIcon(int i15);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i15);

    int u();

    void v();
}
