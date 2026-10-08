package p001AuX;

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
import uq.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f35a;

    public n(i iVar) {
        this.f35a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p000AUx.d
    public final Object a(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Throwable {
        k kVar;
        byte[] bArr3;
        k3 k3Var2 = k3Var;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i15 = kVar.f25h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f25h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(this, dVar);
            }
        } else {
            kVar = new k(this, dVar);
        }
        k kVar2 = kVar;
        Object objA = kVar2.f23f;
        Object objE = b.e();
        int i16 = kVar2.f25h;
        if (i16 == 0) {
            u.b(objA);
            byte[] bArr4 = new byte[bArr.length + bArr2.length];
            pq.n.o(bArr, bArr4, 0, 0, 0, 12, null);
            pq.n.o(bArr2, bArr4, bArr.length, 0, 0, 12, null);
            a2 a2Var = new a2(k3Var2.f37123a, bArr4);
            i iVar = this.f35a;
            kVar2.f21d = k3Var2;
            kVar2.f22e = bArr4;
            kVar2.f25h = 1;
            objA = iVar.a(a2Var, kVar2);
            if (objA == objE) {
                return objE;
            }
            bArr3 = bArr4;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr5 = kVar2.f22e;
            k3 k3Var3 = kVar2.f21d;
            u.b(objA);
            bArr3 = bArr5;
            k3Var2 = k3Var3;
        }
        m2 m2Var = (m2) objA;
        pq.n.B(bArr3, (byte) 0, 0, 0, 6, null);
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
            boolean r0 = r9 instanceof p001AuX.l
            if (r0 == 0) goto L13
            r0 = r9
            AuX.l r0 = (p001AuX.l) r0
            int r1 = r0.f30h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30h = r1
            goto L18
        L13:
            AuX.l r0 = new AuX.l
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f28f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f30h
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
            byte[] r8 = r0.f27e
            con.k3 r6 = r0.f26d
            oq.u.b(r9)
            goto L4e
        L3c:
            oq.u.b(r9)
            con.k3 r9 = p028con.k3.Puk
            r0.f26d = r6
            r0.f27e = r8
            r0.f30h = r4
            java.lang.Object r7 = r5.d(r9, r7, r0)
            if (r7 != r1) goto L4e
            goto L64
        L4e:
            coN.l2 r7 = new coN.l2
            byte r6 = r6.f37123a
            r7.<init>(r6, r8)
            hc.i r6 = r5.f35a
            r8 = 0
            r0.f26d = r8
            r0.f27e = r8
            r0.f30h = r3
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
        throw new UnsupportedOperationException("Method not decompiled: p001AuX.n.b(con.k3, byte[], byte[], vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object c(k3 k3Var, vq.d dVar) throws Throwable {
        i iVar;
        int i15;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i16 = iVar.f17f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f17f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(this, dVar);
            }
        } else {
            iVar = new i(this, dVar);
        }
        Object objA = iVar.f15d;
        Object objE = b.e();
        int i17 = iVar.f17f;
        if (i17 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37123a, null);
            i iVar2 = this.f35a;
            iVar.f17f = 1;
            objA = iVar2.a(y2Var, iVar);
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
        m mVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i15 = mVar.f34g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f34g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(this, dVar);
            }
        } else {
            mVar = new m(this, dVar);
        }
        Object objA = mVar.f32e;
        Object objE = b.e();
        int i16 = mVar.f34g;
        if (i16 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37123a, bArr);
            i iVar = this.f35a;
            mVar.f31d = k3Var;
            mVar.f34g = 1;
            objA = iVar.a(y2Var, mVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3Var = mVar.f31d;
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
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f20f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f20f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, (vq.d) eVar);
            }
        } else {
            jVar = new j(this, (vq.d) eVar);
        }
        Object objA = jVar.f18d;
        Object objE = b.e();
        int i16 = jVar.f20f;
        if (i16 == 0) {
            u.b(objA);
            b2 b2Var = new b2(k3Var.f37123a);
            i iVar = this.f35a;
            jVar.f20f = 1;
            objA = iVar.a(b2Var, jVar);
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
        if (h.f14a[m2Var.f28660c.ordinal()] == 1) {
            return i0.f148189a;
        }
        throw new e("Pin logout failed! " + m2Var.f28660c);
    }
}
