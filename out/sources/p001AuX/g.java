package p001AuX;

import gc.e;
import hc.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p000AUx.d;
import p027coN.m2;
import p027coN.r2;
import p028con.i3;
import p028con.m3;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends hc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f10b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f12d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f13e;

    public g(i iVar) {
        super(iVar);
        this.f10b = iVar;
        this.f11c = "A000000167455349474E";
        this.f12d = new n(iVar);
        this.f13e = new r(iVar);
    }

    @Override // hc.g
    public final d a() {
        return this.f12d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hc.g
    public final Object f(vq.d dVar) throws Throwable {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i15 = fVar.f9f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f9f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, dVar);
            }
        } else {
            fVar = new f(this, dVar);
        }
        Object objA = fVar.f7d;
        Object objE = b.e();
        int i16 = fVar.f9f;
        if (i16 == 0) {
            u.b(objA);
            i iVar = this.f10b;
            r2 r2Var = new r2(this.f11c);
            fVar.f9f = 1;
            objA = iVar.a(r2Var, fVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            i iVar2 = this.f10b;
            i3 i3Var = i3.SSCD;
            iVar2.getClass();
            iVar2.f83073d = i3Var;
            return i0.f148189a;
        }
        throw new e("Error selecting application DF, desc: " + m2Var.f28660c + ", code: " + m2Var.f28658a + ", data: " + m2Var.f28659b);
    }

    @Override // hc.g
    public final p000AUx.e g() {
        return this.f13e;
    }
}
