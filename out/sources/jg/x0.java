package jg;

import android.os.Bundle;
import android.os.IBinder;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f102570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102571e;

    public x0(c cVar, int i15) {
        this.f102570d = cVar;
        this.f102571e = i15;
    }

    @Override // jg.n
    public final void K0(int i15, IBinder iBinder, Bundle bundle) {
        s.m(this.f102570d, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f102570d.K(i15, iBinder, bundle, this.f102571e);
        this.f102570d = null;
    }

    @Override // jg.n
    public final void f2(int i15, Bundle bundle) {
        c2.k("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // jg.n
    public final void i0(int i15, IBinder iBinder, b1 b1Var) {
        c cVar = this.f102570d;
        s.m(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.l(b1Var);
        cVar.S(b1Var);
        K0(i15, iBinder, b1Var.f102405a);
    }
}
