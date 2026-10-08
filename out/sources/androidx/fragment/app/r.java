package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<?> f12661a;

    private r(t<?> tVar) {
        this.f12661a = tVar;
    }

    public static r b(t<?> tVar) {
        return new r((t) i6.i.h(tVar, "callbacks == null"));
    }

    public void a(o oVar) {
        FragmentManager fragmentManager = this.f12661a.getFragmentManager();
        t<?> tVar = this.f12661a;
        fragmentManager.m(tVar, tVar, oVar);
    }

    public void c() {
        this.f12661a.getFragmentManager().y();
    }

    public boolean d(MenuItem menuItem) {
        return this.f12661a.getFragmentManager().B(menuItem);
    }

    public void e() {
        this.f12661a.getFragmentManager().C();
    }

    public void f() {
        this.f12661a.getFragmentManager().E();
    }

    public void g() {
        this.f12661a.getFragmentManager().N();
    }

    public void h() {
        this.f12661a.getFragmentManager().R();
    }

    public void i() {
        this.f12661a.getFragmentManager().S();
    }

    public void j() {
        this.f12661a.getFragmentManager().U();
    }

    public boolean k() {
        return this.f12661a.getFragmentManager().b0(true);
    }

    public FragmentManager l() {
        return this.f12661a.getFragmentManager();
    }

    public void m() {
        this.f12661a.getFragmentManager().V0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f12661a.getFragmentManager().z0().onCreateView(view, str, context, attributeSet);
    }
}
