package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.p016lifecycle.p0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import androidx.p016lifecycle.y0;
import p7.CreationExtras;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class g0 implements androidx.p016lifecycle.h, ua.j, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f12524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f12525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f12526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w0.c f12527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.p016lifecycle.s f12528e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ua.i f12529f = null;

    g0(o oVar, x0 x0Var, Runnable runnable) {
        this.f12524a = oVar;
        this.f12525b = x0Var;
        this.f12526c = runnable;
    }

    @Override // androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.j getLifecycle() {
        c();
        return this.f12528e;
    }

    void b(androidx.lifecycle.j.a aVar) {
        this.f12528e.i(aVar);
    }

    void c() {
        if (this.f12528e == null) {
            this.f12528e = new androidx.p016lifecycle.s(this);
            ua.i iVarA = ua.i.a(this);
            this.f12529f = iVarA;
            iVarA.c();
            this.f12526c.run();
        }
    }

    boolean d() {
        return this.f12528e != null;
    }

    void e(Bundle bundle) {
        this.f12529f.d(bundle);
    }

    void f(Bundle bundle) {
        this.f12529f.e(bundle);
    }

    void g(androidx.lifecycle.j.b bVar) {
        this.f12528e.n(bVar);
    }

    @Override // androidx.p016lifecycle.y0
    public x0 h() {
        c();
        return this.f12525b;
    }

    @Override // ua.j
    public ua.g k() {
        c();
        return this.f12529f.getSavedStateRegistry();
    }

    @Override // androidx.p016lifecycle.h
    public w0.c w() {
        Application application;
        w0.c cVarW = this.f12524a.w();
        if (!cVarW.equals(this.f12524a.f12620y0)) {
            this.f12527d = cVarW;
            return cVarW;
        }
        if (this.f12527d == null) {
            Context applicationContext = this.f12524a.z1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            o oVar = this.f12524a;
            this.f12527d = new p0(application, oVar, oVar.v());
        }
        return this.f12527d;
    }

    @Override // androidx.p016lifecycle.h
    public CreationExtras x() {
        Application application;
        Context applicationContext = this.f12524a.z1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        p7.d dVar = new p7.d();
        if (application != null) {
            dVar.c(w0.a.f12845h, application);
        }
        dVar.c(androidx.p016lifecycle.l0.f12795a, this.f12524a);
        dVar.c(androidx.p016lifecycle.l0.f12796b, this);
        if (this.f12524a.v() != null) {
            dVar.c(androidx.p016lifecycle.l0.f12797c, this.f12524a.v());
        }
        return dVar;
    }
}
