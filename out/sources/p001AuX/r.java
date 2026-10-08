package p001AuX;

import hc.i;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p000AUx.e;
import p005Con.h1;
import p027coN.j2;
import p027coN.m2;
import p027coN.o2;
import p028con.h3;
import p028con.m3;
import p028con.o3;
import p028con.p3;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class r implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f49a;

    public r(i iVar) {
        this.f49a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object a(byte[] bArr, o3 o3Var, p3 p3Var, d dVar) throws Throwable {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i15 = oVar.f40h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f40h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(this, dVar);
            }
        } else {
            oVar = new o(this, dVar);
        }
        Object objA = oVar.f38f;
        Object objE = b.e();
        int i16 = oVar.f40h;
        if (i16 == 0) {
            u.b(objA);
            j2 j2Var = new j2(bArr);
            i iVar = this.f49a;
            oVar.f36d = o3Var;
            oVar.f37e = p3Var;
            oVar.f40h = 1;
            objA = iVar.a(j2Var, oVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3Var = oVar.f37e;
            o3Var = oVar.f36d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            return p3Var == p3.ECDSA_PLAIN ? h1.b(m2Var.f28659b, o3Var.f37147a) : m2Var.f28659b;
        }
        throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r8 == r0) goto L27;
     */
    @Override // p000AUx.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p028con.h3 r5, p028con.o3 r6, p028con.j3 r7, vq.d r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r7 = r8 instanceof p001AuX.q
            if (r7 == 0) goto L13
            r7 = r8
            AuX.q r7 = (p001AuX.q) r7
            int r0 = r7.f48h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f48h = r0
            goto L18
        L13:
            AuX.q r7 = new AuX.q
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f46f
            java.lang.Object r0 = uq.b.e()
            int r1 = r7.f48h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            oq.u.b(r8)
            goto L86
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            con.o3 r6 = r7.f45e
            con.h3 r5 = r7.f44d
            oq.u.b(r8)
            goto L57
        L3c:
            oq.u.b(r8)
            coN.o2 r8 = new coN.o2
            ic.q r1 = r5.e()
            r8.<init>(r1)
            hc.i r1 = r4.f49a
            r7.f44d = r5
            r7.f45e = r6
            r7.f48h = r3
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L57
            goto L85
        L57:
            coN.m2 r8 = (p027coN.m2) r8
            con.m3 r1 = r8.f28660c
            con.m3 r3 = p028con.m3.Ok
            if (r1 != r3) goto L91
            coN.t2 r8 = new coN.t2
            int r5 = r5.g()
            byte r5 = (byte) r5
            con.o3 r1 = p028con.o3.RSA2048
            if (r6 != r1) goto L6d
            r6 = -118(0xffffffffffffff8a, float:NaN)
            goto L6f
        L6d:
            r6 = -52
        L6f:
            java.lang.Byte r6 = vq.b.b(r6)
            r8.<init>(r5, r6)
            hc.i r5 = r4.f49a
            r6 = 0
            r7.f44d = r6
            r7.f45e = r6
            r7.f48h = r2
            java.lang.Object r8 = r5.a(r8, r7)
            if (r8 != r0) goto L86
        L85:
            return r0
        L86:
            coN.m2 r8 = (p027coN.m2) r8
            con.m3 r5 = r8.f28660c
            con.m3 r6 = p028con.m3.Ok
            if (r5 != r6) goto L91
            oq.i0 r5 = oq.i0.f148189a
            return r5
        L91:
            gc.e r5 = new gc.e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Apdu Exception: unexpected response - "
            r6.<init>(r7)
            con.m3 r7 = r8.f28660c
            java.lang.String r7 = r7.name()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p001AuX.r.b(con.h3, con.o3, con.j3, vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object c(h3 h3Var, d dVar) throws Throwable {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i15 = pVar.f43f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f43f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(this, dVar);
            }
        } else {
            pVar = new p(this, dVar);
        }
        Object objA = pVar.f41d;
        Object objE = b.e();
        int i16 = pVar.f43f;
        boolean z15 = true;
        if (i16 == 0) {
            u.b(objA);
            o2 o2Var = new o2(h3Var.e());
            i iVar = this.f49a;
            pVar.f43f = 1;
            objA = iVar.a(o2Var, pVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        int iOrdinal = ((m2) objA).f28660c.ordinal();
        if (iOrdinal == 5) {
            z15 = false;
        } else if (iOrdinal != 24) {
            throw new gc.e("Could not select private key directory.");
        }
        return vq.b.a(z15);
    }
}
