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
public final class p0 extends w {
    public p0(i iVar) {
        super(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p002Aux.y
    public final Object a(w0 w0Var, int i15, int i16, e eVar) throws Throwable {
        o0 o0Var;
        w0 w0Var2;
        if (eVar instanceof o0) {
            o0Var = (o0) eVar;
            int i17 = o0Var.f98k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                o0Var.f98k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                o0Var = new o0(this, (d) eVar);
            }
        } else {
            o0Var = new o0(this, (d) eVar);
        }
        Object objB = o0Var.f96h;
        Object objE = b.e();
        int i18 = o0Var.f98k;
        try {
            if (i18 == 0) {
                u.b(objB);
                g gVar = this.f130a.f83071b;
                o0Var.f92d = w0Var;
                o0Var.f94f = i15;
                o0Var.f95g = i16;
                o0Var.f98k = 1;
                gVar.getClass();
                if (g.d(gVar, o0Var) != objE) {
                }
                return objE;
            }
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var = o0Var.f93e;
                w0Var2 = o0Var.f92d;
                try {
                    u.b(objB);
                    w0Var.f5127g = (ic.g) objB;
                } catch (c unused) {
                    w0Var2.f5127g = null;
                }
                return i0.f148189a;
            }
            i16 = o0Var.f95g;
            i15 = o0Var.f94f;
            w0Var = o0Var.f92d;
            u.b(objB);
            g gVar2 = this.f130a.f83071b;
            ic.g gVar3 = new ic.g();
            Integer numE = vq.b.e(i15);
            Integer numE2 = vq.b.e(i16);
            o0Var.f92d = w0Var;
            o0Var.f93e = w0Var;
            o0Var.f98k = 2;
            gVar2.getClass();
            objB = g.b(gVar2, gVar3, numE, numE2, o0Var);
            if (objB != objE) {
                w0Var2 = w0Var;
                w0Var.f5127g = (ic.g) objB;
                return i0.f148189a;
            }
            return objE;
        } catch (c unused2) {
            w0Var2 = w0Var;
            w0Var2.f5127g = null;
        }
    }
}
