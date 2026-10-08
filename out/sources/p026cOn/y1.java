package p026cOn;

import gc.e;
import hc.g;
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
public final class y1 extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f24762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f24764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f24765e;

    public y1(i iVar) {
        super(iVar);
        this.f24762b = iVar;
        this.f24763c = "53534344";
        this.f24764d = new s1(iVar);
        this.f24765e = new w1(iVar);
    }

    @Override // hc.g
    public final d a() {
        return this.f24764d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hc.g
    public final Object f(vq.d dVar) throws Throwable {
        x1 x1Var;
        if (dVar instanceof x1) {
            x1Var = (x1) dVar;
            int i15 = x1Var.f24761f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                x1Var.f24761f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                x1Var = new x1(this, dVar);
            }
        } else {
            x1Var = new x1(this, dVar);
        }
        Object objA = x1Var.f24759d;
        Object objE = b.e();
        int i16 = x1Var.f24761f;
        if (i16 == 0) {
            u.b(objA);
            i iVar = this.f24762b;
            if (iVar.f83073d != i3.SSCD) {
                r2 r2Var = new r2(this.f24763c);
                x1Var.f24761f = 1;
                objA = iVar.a(r2Var, x1Var);
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
            i iVar2 = this.f24762b;
            i3 i3Var = i3.SSCD;
            iVar2.getClass();
            iVar2.f83073d = i3Var;
            return i0.f148189a;
        }
        throw new e("Error selecting application DF, desc: " + m2Var.f28660c + ", code: " + m2Var.f28658a + ", data: " + m2Var.f28659b);
    }

    @Override // hc.g
    public final p000AUx.e g() {
        return this.f24765e;
    }
}
