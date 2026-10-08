package fk;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import sk.a0;
import sk.c0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0.b f64380a;

    private o(c0.b bVar) {
        this.f64380a = bVar;
    }

    private synchronized c0.c c(sk.y yVar, i0 i0Var) {
        int iG;
        iG = g();
        if (i0Var == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return c0.c.f0().G(yVar).H(iG).J(sk.z.ENABLED).I(i0Var).build();
    }

    private synchronized boolean e(int i15) {
        Iterator<c0.c> it = this.f64380a.J().iterator();
        while (it.hasNext()) {
            if (it.next().b0() == i15) {
                return true;
            }
        }
        return false;
    }

    private synchronized c0.c f(a0 a0Var) {
        return c(x.k(a0Var), a0Var.a0());
    }

    private synchronized int g() {
        int iC;
        iC = nk.t.c();
        while (e(iC)) {
            iC = nk.t.c();
        }
        return iC;
    }

    public static o i() {
        return new o(c0.e0());
    }

    public static o j(n nVar) {
        return new o(nVar.h().b());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z15) {
        c0.c cVarF;
        try {
            cVarF = f(a0Var);
            this.f64380a.G(cVarF);
            if (z15) {
                this.f64380a.K(cVarF.b0());
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return cVarF.b0();
    }

    public synchronized n d() {
        return n.e(this.f64380a.build());
    }

    public synchronized o h(int i15) {
        for (int i16 = 0; i16 < this.f64380a.I(); i16++) {
            c0.c cVarH = this.f64380a.H(i16);
            if (cVarH.b0() == i15) {
                if (!cVarH.d0().equals(sk.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i15);
                }
                this.f64380a.K(i15);
            }
        }
        throw new GeneralSecurityException("key not found: " + i15);
        return this;
    }
}
