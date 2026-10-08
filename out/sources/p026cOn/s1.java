package p026cOn;

import gc.e;
import gc.f;
import gc.g;
import hc.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p000AUx.d;
import p027coN.a2;
import p027coN.b2;
import p027coN.m2;
import p027coN.y2;
import p028con.k3;
import p028con.m3;
import pq.n;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f24746a;

    public s1(i iVar) {
        this.f24746a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p000AUx.d
    public final Object a(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Throwable {
        p1 p1Var;
        byte[] bArr3;
        k3 k3Var2 = k3Var;
        if (dVar instanceof p1) {
            p1Var = (p1) dVar;
            int i15 = p1Var.f24736h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                p1Var.f24736h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                p1Var = new p1(this, dVar);
            }
        } else {
            p1Var = new p1(this, dVar);
        }
        p1 p1Var2 = p1Var;
        Object objA = p1Var2.f24734f;
        Object objE = b.e();
        int i16 = p1Var2.f24736h;
        if (i16 == 0) {
            u.b(objA);
            byte[] bArr4 = new byte[bArr.length + bArr2.length];
            n.o(bArr, bArr4, 0, 0, 0, 12, null);
            n.o(bArr2, bArr4, bArr.length, 0, 0, 12, null);
            a2 a2Var = new a2(k3Var2.f37126d, bArr4);
            i iVar = this.f24746a;
            p1Var2.f24732d = k3Var2;
            p1Var2.f24733e = bArr4;
            p1Var2.f24736h = 1;
            objA = iVar.a(a2Var, p1Var2);
            if (objA == objE) {
                return objE;
            }
            bArr3 = bArr4;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr5 = p1Var2.f24733e;
            k3 k3Var3 = p1Var2.f24732d;
            u.b(objA);
            bArr3 = bArr5;
            k3Var2 = k3Var3;
        }
        m2 m2Var = (m2) objA;
        n.B(bArr3, (byte) 0, 0, 0, 6, null);
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            return i0.f148189a;
        }
        if (m3Var == m3.WrongLength) {
            throw new f("Pin change failed, wrong pin length", null);
        }
        if ((m2Var.f28658a & 65280) == 25344) {
            throw new f("Pin change failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
        }
        if (m3Var != m3.AuthMethodBlocked) {
            throw new e("Pin change failed! " + m2Var.f28660c);
        }
        throw new g("Pin change failed: " + k3Var2.name() + " has been blocked " + k3Var2.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r9 == r1) goto L21;
     */
    @Override // p000AUx.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p028con.k3 r6, byte[] r7, byte[] r8, vq.d r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p026cOn.q1
            if (r0 == 0) goto L13
            r0 = r9
            cOn.q1 r0 = (p026cOn.q1) r0
            int r1 = r0.f24741h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24741h = r1
            goto L18
        L13:
            cOn.q1 r0 = new cOn.q1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f24739f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f24741h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            byte[] r8 = r0.f24738e
            con.k3 r6 = r0.f24737d
            oq.u.b(r9)
            goto L4e
        L3c:
            oq.u.b(r9)
            con.k3 r9 = p028con.k3.Puk
            r0.f24737d = r6
            r0.f24738e = r8
            r0.f24741h = r4
            java.lang.Object r7 = r5.d(r9, r7, r0)
            if (r7 != r1) goto L4e
            goto L64
        L4e:
            coN.l2 r7 = new coN.l2
            byte r6 = r6.f37126d
            r7.<init>(r6, r8)
            hc.i r6 = r5.f24746a
            r8 = 0
            r0.f24737d = r8
            r0.f24738e = r8
            r0.f24741h = r3
            java.lang.Object r9 = r6.a(r7, r0)
            if (r9 != r1) goto L65
        L64:
            return r1
        L65:
            coN.m2 r9 = (p027coN.m2) r9
            con.m3 r6 = r9.f28660c
            con.m3 r7 = p028con.m3.Ok
            if (r6 != r7) goto L70
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L70:
            gc.e r6 = new gc.e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Pin reset failed! "
            r7.<init>(r8)
            con.m3 r8 = r9.f28660c
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p026cOn.s1.b(con.k3, byte[], byte[], vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object c(k3 k3Var, vq.d dVar) throws Throwable {
        n1 n1Var;
        int i15;
        if (dVar instanceof n1) {
            n1Var = (n1) dVar;
            int i16 = n1Var.f24728f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                n1Var.f24728f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                n1Var = new n1(this, dVar);
            }
        } else {
            n1Var = new n1(this, dVar);
        }
        Object objA = n1Var.f24726d;
        Object objE = b.e();
        int i17 = n1Var.f24728f;
        if (i17 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37126d, null);
            i iVar = this.f24746a;
            n1Var.f24728f = 1;
            objA = iVar.a(y2Var, n1Var);
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
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            throw new e("No info available for PIN that is already authenticated " + m2Var.f28660c);
        }
        int i18 = m2Var.f28658a;
        if ((65280 & i18) == 25344) {
            i15 = i18 & 15;
        } else {
            if (m3Var != m3.AuthMethodBlocked) {
                throw new e("Could not get PIN verification counter! " + m2Var.f28660c);
            }
            i15 = 0;
        }
        return vq.b.e(i15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object d(k3 k3Var, byte[] bArr, vq.d dVar) throws Throwable {
        r1 r1Var;
        if (dVar instanceof r1) {
            r1Var = (r1) dVar;
            int i15 = r1Var.f24745g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                r1Var.f24745g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                r1Var = new r1(this, dVar);
            }
        } else {
            r1Var = new r1(this, dVar);
        }
        Object objA = r1Var.f24743e;
        Object objE = b.e();
        int i16 = r1Var.f24745g;
        if (i16 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37126d, bArr);
            i iVar = this.f24746a;
            r1Var.f24742d = k3Var;
            r1Var.f24745g = 1;
            objA = iVar.a(y2Var, r1Var);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3Var = r1Var.f24742d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            return i0.f148189a;
        }
        if (m3Var == m3.WrongLength) {
            throw new f("Pin verification failed, wrong pin length", null);
        }
        if ((m2Var.f28658a & 65280) == 25344) {
            throw new f("Pin verification failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
        }
        if (m3Var != m3.AuthMethodBlocked) {
            throw new e("Pin verification failed! " + m2Var.f28660c);
        }
        throw new g("Pin verification failed: " + k3Var.name() + " has been blocked " + k3Var.name());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object e(k3 k3Var, tq.e eVar) throws Throwable {
        o1 o1Var;
        if (eVar instanceof o1) {
            o1Var = (o1) eVar;
            int i15 = o1Var.f24731f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                o1Var.f24731f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                o1Var = new o1(this, (vq.d) eVar);
            }
        } else {
            o1Var = new o1(this, (vq.d) eVar);
        }
        Object objA = o1Var.f24729d;
        Object objE = b.e();
        int i16 = o1Var.f24731f;
        if (i16 == 0) {
            u.b(objA);
            b2 b2Var = new b2(k3Var.f37126d);
            i iVar = this.f24746a;
            o1Var.f24731f = 1;
            objA = iVar.a(b2Var, o1Var);
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
        if (m1.f24725a[m2Var.f28660c.ordinal()] == 1) {
            return i0.f148189a;
        }
        throw new e("Pin logout failed! " + m2Var.f28660c);
    }
}
