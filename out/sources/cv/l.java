package cv;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p027coN.m2;
import p027coN.r2;
import p028con.i3;
import p028con.m3;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends hc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.i f38159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f38160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f38161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38162e;

    public l(hc.i iVar) {
        super(iVar);
        this.f38159b = iVar;
        this.f38160c = new e(iVar);
        this.f38161d = new j(iVar);
        this.f38162e = "A0000000180C000001634200";
    }

    @Override // hc.g
    public final p000AUx.d a() {
        return this.f38160c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hc.g
    public final Object f(vq.d dVar) throws Throwable {
        k kVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i15 = kVar.f38158f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f38158f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(this, dVar);
            }
        } else {
            kVar = new k(this, dVar);
        }
        Object objA = kVar.f38156d;
        Object objE = uq.b.e();
        int i16 = kVar.f38158f;
        if (i16 == 0) {
            u.b(objA);
            hc.i iVar = this.f38159b;
            if (iVar.f83073d != i3.SSCD) {
                r2 r2Var = new r2(this.f38162e);
                kVar.f38158f = 1;
                objA = iVar.a(r2Var, kVar);
                if (objA == objE) {
                    return objE;
                }
            }
            return i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(objA);
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            hc.i iVar2 = this.f38159b;
            i3 i3Var = i3.SSCD;
            iVar2.getClass();
            iVar2.f83073d = i3Var;
            return i0.f148189a;
        }
        throw new gc.e("Error selecting application DF, desc: " + m2Var.f28660c + ", code: " + m2Var.f28658a + ", data: " + m2Var.f28659b);
    }

    @Override // hc.g
    public final p000AUx.e g() {
        return this.f38161d;
    }
}
