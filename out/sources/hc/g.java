package hc;

import ic.p;
import ic.q;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p027coN.m2;
import p027coN.n2;
import p027coN.p2;
import p027coN.q2;
import p028con.i3;
import p028con.m3;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f83066a;

    public g(i iVar) {
        this.f83066a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:32:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(hc.g r21, ic.q r22, java.lang.Integer r23, java.lang.Integer r24, vq.d r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.g.b(hc.g, ic.q, java.lang.Integer, java.lang.Integer, vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(hc.g r6, ic.q r7, vq.d r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.g.c(hc.g, ic.q, vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(g gVar, vq.d dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f83057g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f83057g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar2 = new d(gVar, dVar);
            }
        } else {
            dVar2 = new d(gVar, dVar);
        }
        Object objA = dVar2.f83055e;
        Object objE = uq.b.e();
        int i16 = dVar2.f83057g;
        if (i16 == 0) {
            u.b(objA);
            i iVar = gVar.f83066a;
            p2 p2Var = new p2();
            dVar2.f83054d = gVar;
            dVar2.f83057g = 1;
            objA = iVar.a(p2Var, dVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = dVar2.f83054d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            i iVar2 = gVar.f83066a;
            i3 i3Var = i3.MRTD;
            iVar2.getClass();
            iVar2.f83073d = i3Var;
            return i0.f148189a;
        }
        throw new gc.e("Error selecting application DF, desc: " + m2Var.f28660c + ", code: " + m2Var.f28658a + ", data: " + m2Var.f28659b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object h(g gVar, vq.d dVar) throws Throwable {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i15 = eVar.f83061g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f83061g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(gVar, dVar);
            }
        } else {
            eVar = new e(gVar, dVar);
        }
        Object objA = eVar.f83059e;
        Object objE = uq.b.e();
        int i16 = eVar.f83061g;
        if (i16 == 0) {
            u.b(objA);
            i iVar = gVar.f83066a;
            q2 q2Var = new q2();
            eVar.f83058d = gVar;
            eVar.f83061g = 1;
            objA = iVar.a(q2Var, eVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = eVar.f83058d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            i iVar2 = gVar.f83066a;
            i3 i3Var = i3.MF;
            iVar2.getClass();
            iVar2.f83073d = i3Var;
            return i0.f148189a;
        }
        throw new gc.e("Error selecting application MF, desc: " + m2Var.f28660c + ", code: " + m2Var.f28658a + ", data: " + m2Var.f28659b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(g gVar, vq.d dVar) throws Throwable {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i15 = fVar.f83065g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f83065g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(gVar, dVar);
            }
        } else {
            fVar = new f(gVar, dVar);
        }
        Object obj = fVar.f83063e;
        Object objE = uq.b.e();
        int i16 = fVar.f83065g;
        if (i16 == 0) {
            u.b(obj);
            fVar.f83062d = gVar;
            fVar.f83065g = 1;
            if (h(gVar, fVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = fVar.f83062d;
            u.b(obj);
        }
        i iVar = gVar.f83066a;
        i3 i3Var = i3.SSCD;
        iVar.getClass();
        iVar.f83073d = i3Var;
        return i0.f148189a;
    }

    public p000AUx.d a() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q qVar, vq.d dVar) throws Throwable {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f83053g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f83053g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object objA = cVar.f83051e;
        Object objE = uq.b.e();
        int i16 = cVar.f83053g;
        if (i16 == 0) {
            u.b(objA);
            n2 n2Var = new n2(qVar, null);
            i iVar = this.f83066a;
            cVar.f83050d = qVar;
            cVar.f83053g = 1;
            objA = iVar.a(n2Var, cVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = cVar.f83050d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            return m2Var.f28659b;
        }
        if (m3Var != m3.FileNotFound && (m3Var != m3.SecurityStatusNotSatisfied || !(qVar instanceof p))) {
            throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
        }
        throw new gc.c("File " + qVar.getName() + " not present");
    }

    public Object f(vq.d dVar) {
        return i(this, dVar);
    }

    public p000AUx.e g() {
        return null;
    }
}
