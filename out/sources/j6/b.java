package j6;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f99616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f99617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2340b f99618c;

    public interface a {
    }

    /* JADX INFO: renamed from: j6.b$b, reason: collision with other inner class name */
    public interface InterfaceC2340b {
        void onActionProviderVisibilityChanged(boolean z15);
    }

    public b(Context context) {
        this.f99616a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f99618c = null;
        this.f99617b = null;
    }

    public void i(a aVar) {
        this.f99617b = aVar;
    }

    public void j(InterfaceC2340b interfaceC2340b) {
        if (this.f99618c != null && interfaceC2340b != null) {
            c2.g("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f99618c = interfaceC2340b;
    }
}
