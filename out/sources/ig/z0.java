package ig;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import io.sentry.android.core.c2;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends th.d implements hg.f.a, hg.f.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final hg.a.AbstractC1948a f92294k = sh.e.f181650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f92295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f92296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hg.a.AbstractC1948a f92297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f92298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jg.e f92299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sh.f f92300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y0 f92301j;

    public z0(Context context, Handler handler, jg.e eVar) {
        hg.a.AbstractC1948a abstractC1948a = f92294k;
        this.f92295d = context;
        this.f92296e = handler;
        this.f92299h = (jg.e) jg.s.m(eVar, "ClientSettings must not be null");
        this.f92298g = eVar.e();
        this.f92297f = abstractC1948a;
    }

    @Override // th.f
    public final void k2(th.l lVar) {
        this.f92296e.post(new x0(this, lVar));
    }

    public final void m3(y0 y0Var) {
        sh.f fVar = this.f92300i;
        if (fVar != null) {
            fVar.disconnect();
        }
        jg.e eVar = this.f92299h;
        eVar.i(Integer.valueOf(System.identityHashCode(this)));
        hg.a.AbstractC1948a abstractC1948a = this.f92297f;
        Context context = this.f92295d;
        Handler handler = this.f92296e;
        this.f92300i = (sh.f) abstractC1948a.a(context, handler.getLooper(), eVar, eVar.g(), this, this);
        this.f92301j = y0Var;
        Set set = this.f92298g;
        if (set == null || set.isEmpty()) {
            handler.post(new w0(this));
        } else {
            this.f92300i.h();
        }
    }

    public final void n3() {
        sh.f fVar = this.f92300i;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    final /* synthetic */ void o3(th.l lVar) {
        gg.a aVarH = lVar.h();
        if (aVarH.y()) {
            jg.n0 n0Var = (jg.n0) jg.s.l(lVar.m());
            gg.a aVarM = n0Var.m();
            if (!aVarM.y()) {
                String strValueOf = String.valueOf(aVarM);
                c2.k("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                this.f92301j.b(aVarM);
                this.f92300i.disconnect();
                return;
            }
            this.f92301j.a(n0Var.h(), this.f92298g);
        } else {
            this.f92301j.b(aVarH);
        }
        this.f92300i.disconnect();
    }

    @Override // ig.d
    public final void onConnected(Bundle bundle) {
        this.f92300i.f(this);
    }

    @Override // ig.m
    public final void onConnectionFailed(gg.a aVar) {
        this.f92301j.b(aVar);
    }

    @Override // ig.d
    public final void onConnectionSuspended(int i15) {
        this.f92301j.c(i15);
    }

    final /* synthetic */ y0 p3() {
        return this.f92301j;
    }
}
