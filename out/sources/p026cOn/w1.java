package p026cOn;

import fu.r;
import hc.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p000AUx.e;
import p005Con.h1;
import p005Con.i1;
import p027coN.j2;
import p027coN.m2;
import p027coN.t2;
import p027coN.u2;
import p028con.h3;
import p028con.j3;
import p028con.m3;
import p028con.o3;
import p028con.p3;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f24758a;

    public w1(i iVar) {
        this.f24758a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object a(byte[] bArr, o3 o3Var, p3 p3Var, d dVar) throws Throwable {
        t1 t1Var;
        if (dVar instanceof t1) {
            t1Var = (t1) dVar;
            int i15 = t1Var.f24751h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                t1Var.f24751h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                t1Var = new t1(this, dVar);
            }
        } else {
            t1Var = new t1(this, dVar);
        }
        Object objA = t1Var.f24749f;
        Object objE = b.e();
        int i16 = t1Var.f24751h;
        if (i16 == 0) {
            u.b(objA);
            j2 j2Var = new j2(bArr);
            i iVar = this.f24758a;
            t1Var.f24747d = o3Var;
            t1Var.f24748e = p3Var;
            t1Var.f24751h = 1;
            objA = iVar.a(j2Var, t1Var);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3Var = t1Var.f24748e;
            o3Var = t1Var.f24747d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            return p3Var == p3.ECDSA_PLAIN ? h1.b(m2Var.f28659b, o3Var.f37147a) : m2Var.f28659b;
        }
        throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object b(h3 h3Var, o3 o3Var, j3 j3Var, d dVar) throws Throwable {
        v1 v1Var;
        if (dVar instanceof v1) {
            v1Var = (v1) dVar;
            int i15 = v1Var.f24757f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                v1Var.f24757f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                v1Var = new v1(this, dVar);
            }
        } else {
            v1Var = new v1(this, dVar);
        }
        Object objA = v1Var.f24755d;
        Object objE = b.e();
        int i16 = v1Var.f24757f;
        if (i16 == 0) {
            u.b(objA);
            t2 t2Var = new t2((byte) h3Var.k(), null);
            i iVar = this.f24758a;
            v1Var.f24757f = 1;
            objA = iVar.a(t2Var, v1Var);
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
            return i0.f148189a;
        }
        throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object c(h3 h3Var, d dVar) throws Throwable {
        u1 u1Var;
        int iR0;
        if (dVar instanceof u1) {
            u1Var = (u1) dVar;
            int i15 = u1Var.f24754f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                u1Var.f24754f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                u1Var = new u1(this, dVar);
            }
        } else {
            u1Var = new u1(this, dVar);
        }
        Object objA = u1Var.f24752d;
        Object objE = b.e();
        int i16 = u1Var.f24754f;
        if (i16 == 0) {
            u.b(objA);
            u2 u2Var = new u2(h3Var.o().f37126d);
            i iVar = this.f24758a;
            u1Var.f24754f = 1;
            objA = iVar.a(u2Var, u1Var);
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
        if (bArr.length != 0 && (iR0 = r.r0(i1.a(bArr), "8201", 0, false, 6, null)) > 0) {
            int i17 = (iR0 / 2) + 2;
            byte[] bArr2 = m2Var.f28659b;
            if (i17 < bArr2.length) {
                return vq.b.a(bArr2[i17] == 0);
            }
        }
        throw new gc.e("Apdu Exception: Unexpected content received");
    }
}
