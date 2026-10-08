package cv;

import fu.r;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p005Con.h1;
import p005Con.i1;
import p027coN.j2;
import p027coN.m2;
import p027coN.t2;
import p027coN.v2;
import p027coN.w2;
import p028con.h3;
import p028con.j3;
import p028con.m3;
import p028con.o3;
import p028con.p3;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p000AUx.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.i f38155a;

    public j(hc.i iVar) {
        this.f38155a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0085, please report this as an issue */
    @Override // p000AUx.e
    public final Object a(byte[] bArr, o3 o3Var, p3 p3Var, vq.d dVar) throws Throwable {
        g gVar;
        p3 p3Var2;
        m2 m2Var;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i15 = gVar.f38148g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f38148g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, dVar);
            }
        } else {
            gVar = new g(this, dVar);
        }
        Object objA = gVar.f38146e;
        Object objE = uq.b.e();
        int i16 = gVar.f38148g;
        if (i16 == 0) {
            u.b(objA);
            w2 w2Var = new w2(bArr);
            hc.i iVar = this.f38155a;
            gVar.f38145d = p3Var;
            gVar.f38148g = 1;
            objA = iVar.a(w2Var, gVar);
            if (objA != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            p3Var = gVar.f38145d;
            u.b(objA);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3Var2 = gVar.f38145d;
            u.b(objA);
        }
        m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            return p3Var2 == p3.ECDSA_X962 ? h1.a(m2Var.f28659b) : m2Var.f28659b;
        }
        throw new gc.e("Apdu exception: unexpected response - " + m2Var.f28660c.name());
        m2 m2Var2 = (m2) objA;
        if (m2Var2.f28660c != m3.Ok) {
            throw new gc.e("Apdu exception: unexpected response - " + m2Var2.f28660c.name());
        }
        j2 j2Var = new j2(null);
        hc.i iVar2 = this.f38155a;
        gVar.f38145d = p3Var;
        gVar.f38148g = 2;
        objA = iVar2.a(j2Var, gVar);
        if (objA != objE) {
            p3Var2 = p3Var;
            m2Var = (m2) objA;
            if (m2Var.f28660c == m3.Ok) {
                if (p3Var2 == p3.ECDSA_X962) {
                }
            }
            throw new gc.e("Apdu exception: unexpected response - " + m2Var.f28660c.name());
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object b(h3 h3Var, o3 o3Var, j3 j3Var, vq.d dVar) throws Throwable {
        i iVar;
        int i15;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i16 = iVar.f38154f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f38154f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(this, dVar);
            }
        } else {
            iVar = new i(this, dVar);
        }
        Object objA = iVar.f38152d;
        Object objE = uq.b.e();
        int i17 = iVar.f38154f;
        if (i17 == 0) {
            u.b(objA);
            if (o3Var == o3.RSA2048) {
                i15 = f.f38144a[j3Var.ordinal()] == 1 ? 66 : 82;
            } else {
                i15 = o3Var == o3.ECDSA_256 ? 68 : 84;
            }
            t2 t2Var = new t2((byte) h3Var.n(), vq.b.b((byte) i15));
            hc.i iVar2 = this.f38155a;
            iVar.f38154f = 1;
            objA = iVar2.a(t2Var, iVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            return i0.f148189a;
        }
        throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object c(h3 h3Var, vq.d dVar) throws Throwable {
        h hVar;
        int iR0;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i15 = hVar.f38151f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f38151f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object objA = hVar.f38149d;
        Object objE = uq.b.e();
        int i16 = hVar.f38151f;
        if (i16 == 0) {
            u.b(objA);
            v2 v2Var = new v2(h3Var.o().f37125c);
            hc.i iVar = this.f38155a;
            hVar.f38151f = 1;
            objA = iVar.a(v2Var, hVar);
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
        if (m2Var.f28660c != m3.Ok) {
            throw new gc.e("Apdu exception: unexpected response  - " + m2Var.f28660c.name());
        }
        byte[] bArr = m2Var.f28659b;
        if (bArr.length != 0 && (iR0 = r.r0(i1.a(bArr), "df2f", 0, false, 6, null)) > 0) {
            int i17 = (iR0 / 2) + 3;
            byte[] bArr2 = m2Var.f28659b;
            if (i17 < bArr2.length) {
                return vq.b.a(bArr2[i17] == 1);
            }
        }
        throw new gc.e("Apdu Exception: Unexpected content received");
    }
}
