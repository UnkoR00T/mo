package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.f1;
import p083nUl.a0;
import s5.w;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.p implements d, w.a {
    private f F;
    private Resources G;

    class a implements ua.g.b {
        a() {
        }

        @Override // ua.g.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.D0().C(bundle);
            return bundle;
        }
    }

    class b implements a0 {
        b() {
        }

        @Override // p083nUl.a0
        public void a(Context context) {
            f fVarD0 = c.this.D0();
            fVarD0.u();
            fVarD0.y(c.this.k().a("androidx:appcompat"));
        }
    }

    public c() {
        F0();
    }

    private void F0() {
        k().c("androidx:appcompat", new a());
        Y(new b());
    }

    private boolean M0(KeyEvent keyEvent) {
        return false;
    }

    public f D0() {
        if (this.F == null) {
            this.F = f.j(this, this);
        }
        return this.F;
    }

    public androidx.appcompat.app.a E0() {
        return D0().t();
    }

    public void G0(w wVar) {
        wVar.g(this);
    }

    protected void H0(e6.h hVar) {
    }

    protected void I0(int i15) {
    }

    public void J0(w wVar) {
    }

    @Deprecated
    public void K0() {
    }

    public boolean L0() {
        Intent intentG = g();
        if (intentG == null) {
            return false;
        }
        if (!O0(intentG)) {
            N0(intentG);
            return true;
        }
        w wVarI = w.i(this);
        G0(wVarI);
        J0(wVarI);
        wVarI.j();
        try {
            s5.b.s(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void N0(Intent intent) {
        s5.j.e(this, intent);
    }

    public boolean O0(Intent intent) {
        return s5.j.f(this, intent);
    }

    @Override // CON.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        D0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(D0().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarE0 = E0();
        if (getWindow().hasFeature(0)) {
            if (aVarE0 == null || !aVarE0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // s5.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarE0 = E0();
        if (keyCode == 82 && aVarE0 != null && aVarE0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i15) {
        return (T) D0().l(i15);
    }

    @Override // s5.w.a
    public Intent g() {
        return s5.j.a(this);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return D0().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.G == null && f1.c()) {
            this.G = new f1(this, super.getResources());
        }
        Resources resources = this.G;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        D0().v();
    }

    @Override // CON.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        D0().x(configuration);
        if (this.G != null) {
            this.G.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        K0();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        D0().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i15, KeyEvent keyEvent) {
        if (M0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i15, keyEvent);
    }

    @Override // androidx.fragment.app.p, CON.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i15, MenuItem menuItem) {
        if (super.onMenuItemSelected(i15, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarE0 = E0();
        if (menuItem.getItemId() != 16908332 || aVarE0 == null || (aVarE0.i() & 4) == 0) {
            return false;
        }
        return L0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i15, Menu menu) {
        return super.onMenuOpened(i15, menu);
    }

    @Override // CON.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i15, Menu menu) {
        super.onPanelClosed(i15, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        D0().A(bundle);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        D0().B();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onStart() {
        super.onStart();
        D0().D();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onStop() {
        super.onStop();
        D0().E();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i15) {
        super.onTitleChanged(charSequence, i15);
        D0().O(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarE0 = E0();
        if (getWindow().hasFeature(0)) {
            if (aVarE0 == null || !aVarE0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void r(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void s(androidx.appcompat.view.b bVar) {
    }

    @Override // CON.p, android.app.Activity
    public void setContentView(int i15) {
        h0();
        D0().I(i15);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i15) {
        super.setTheme(i15);
        D0().N(i15);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b z(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public c(int i15) {
        super(i15);
        F0();
    }

    @Override // CON.p, android.app.Activity
    public void setContentView(View view) {
        h0();
        D0().J(view);
    }

    @Override // CON.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        D0().K(view, layoutParams);
    }
}
