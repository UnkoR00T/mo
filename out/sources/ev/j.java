package ev;

import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p005Con.h1;
import p027coN.j2;
import p027coN.m2;
import p028con.m3;
import p028con.o3;
import p028con.p3;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p000AUx.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.i f53769a;

    public j(hc.i iVar) {
        this.f53769a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.e
    public final Object a(byte[] bArr, o3 o3Var, p3 p3Var, vq.d dVar) throws Throwable {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i15 = gVar.f53758g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f53758g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, dVar);
            }
        } else {
            gVar = new g(this, dVar);
        }
        Object objA = gVar.f53756e;
        Object objE = uq.b.e();
        int i16 = gVar.f53758g;
        if (i16 == 0) {
            u.b(objA);
            j2 j2Var = new j2(bArr);
            hc.i iVar = this.f53769a;
            gVar.f53755d = p3Var;
            gVar.f53758g = 1;
            objA = iVar.a(j2Var, gVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3Var = gVar.f53755d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        if (m2Var.f28660c == m3.Ok) {
            return p3Var == p3.ECDSA_X962 ? h1.a(m2Var.f28659b) : m2Var.f28659b;
        }
        throw new gc.e("Apdu Exception: unexpected response - " + m2Var.f28660c.name());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (r13 == r1) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00e6, please report this as an issue */
    @Override // p000AUx.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p028con.h3 r10, p028con.o3 r11, p028con.j3 r12, vq.d r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ev.j.b(con.h3, con.o3, con.j3, vq.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // p000AUx.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p028con.h3 r8, vq.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ev.h
            if (r0 == 0) goto L13
            r0 = r9
            ev.h r0 = (ev.h) r0
            int r1 = r0.f53762g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53762g = r1
            goto L18
        L13:
            ev.h r0 = new ev.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f53760e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f53762g
            java.lang.String r3 = "Could not select private key directory."
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            oq.u.b(r9)
            goto L7e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            con.h3 r8 = r0.f53759d
            oq.u.b(r9)
            goto L56
        L3d:
            oq.u.b(r9)
            coN.o2 r9 = new coN.o2
            ic.q r2 = r8.b()
            r9.<init>(r2)
            hc.i r2 = r7.f53769a
            r0.f53759d = r8
            r0.f53762g = r6
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L56
            goto L7d
        L56:
            coN.m2 r9 = (p027coN.m2) r9
            con.m3 r9 = r9.f28660c
            con.m3 r2 = p028con.m3.InactivePrivateKey
            if (r9 != r2) goto L63
            java.lang.Boolean r8 = vq.b.a(r4)
            return r8
        L63:
            con.m3 r2 = p028con.m3.Ok
            if (r9 != r2) goto L9a
            coN.o2 r9 = new coN.o2
            ic.q r8 = r8.e()
            r9.<init>(r8)
            hc.i r8 = r7.f53769a
            r2 = 0
            r0.f53759d = r2
            r0.f53762g = r5
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            coN.m2 r9 = (p027coN.m2) r9
            con.m3 r8 = r9.f28660c
            int r8 = r8.ordinal()
            r9 = 5
            if (r8 == r9) goto L95
            r9 = 24
            if (r8 != r9) goto L8f
            r4 = r6
            goto L95
        L8f:
            gc.e r8 = new gc.e
            r8.<init>(r3)
            throw r8
        L95:
            java.lang.Boolean r8 = vq.b.a(r4)
            return r8
        L9a:
            gc.e r8 = new gc.e
            r8.<init>(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ev.j.c(con.h3, vq.d):java.lang.Object");
    }
}
