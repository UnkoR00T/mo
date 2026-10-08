package p002Aux;

import gc.c;
import hc.g;
import hc.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import tq.e;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends w {
    public l0(i iVar) {
        super(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p002Aux.y
    public final Object a(w0 w0Var, int i15, int i16, e eVar) throws Throwable {
        k0 k0Var;
        w0 w0Var2;
        if (eVar instanceof k0) {
            k0Var = (k0) eVar;
            int i17 = k0Var.f85k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                k0Var.f85k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                k0Var = new k0(this, (d) eVar);
            }
        } else {
            k0Var = new k0(this, (d) eVar);
        }
        Object objB = k0Var.f83h;
        Object objE = b.e();
        int i18 = k0Var.f85k;
        try {
            if (i18 == 0) {
                u.b(objB);
                g gVar = this.f130a.f83071b;
                k0Var.f79d = w0Var;
                k0Var.f81f = i15;
                k0Var.f82g = i16;
                k0Var.f85k = 1;
                gVar.getClass();
                if (g.d(gVar, k0Var) != objE) {
                }
                return objE;
            }
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var = k0Var.f80e;
                w0Var2 = k0Var.f79d;
                try {
                    u.b(objB);
                    w0Var.f5125e = (ic.e) objB;
                } catch (c unused) {
                    w0Var2.f5125e = null;
                }
                return i0.f148189a;
            }
            i16 = k0Var.f82g;
            i15 = k0Var.f81f;
            w0Var = k0Var.f79d;
            u.b(objB);
            g gVar2 = this.f130a.f83071b;
            ic.e eVar2 = new ic.e();
            Integer numE = vq.b.e(i15);
            Integer numE2 = vq.b.e(i16);
            k0Var.f79d = w0Var;
            k0Var.f80e = w0Var;
            k0Var.f85k = 2;
            gVar2.getClass();
            objB = g.b(gVar2, eVar2, numE, numE2, k0Var);
            if (objB != objE) {
                w0Var2 = w0Var;
                w0Var.f5125e = (ic.e) objB;
                return i0.f148189a;
            }
            return objE;
        } catch (c unused2) {
            w0Var2 = w0Var;
            w0Var2.f5125e = null;
        }
    }
}
