package cv;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p027coN.a2;
import p027coN.m2;
import p027coN.x2;
import p027coN.y2;
import p028con.k3;
import p028con.m3;
import pq.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p000AUx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.i f38143a;

    public e(hc.i iVar) {
        this.f38143a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[Catch: all -> 0x00f2, Exception -> 0x00f5, TryCatch #13 {Exception -> 0x00f5, all -> 0x00f2, blocks: (B:32:0x00a6, B:34:0x00ae, B:36:0x00b8, B:38:0x00bc, B:39:0x00dd, B:40:0x00de, B:41:0x00f1, B:46:0x00f8, B:47:0x0115), top: B:78:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[Catch: all -> 0x00f2, Exception -> 0x00f5, TryCatch #13 {Exception -> 0x00f5, all -> 0x00f2, blocks: (B:32:0x00a6, B:34:0x00ae, B:36:0x00b8, B:38:0x00bc, B:39:0x00dd, B:40:0x00de, B:41:0x00f1, B:46:0x00f8, B:47:0x0115), top: B:78:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: all -> 0x00f2, Exception -> 0x00f5, TryCatch #13 {Exception -> 0x00f5, all -> 0x00f2, blocks: (B:32:0x00a6, B:34:0x00ae, B:36:0x00b8, B:38:0x00bc, B:39:0x00dd, B:40:0x00de, B:41:0x00f1, B:46:0x00f8, B:47:0x0115), top: B:78:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[Catch: all -> 0x00f2, Exception -> 0x00f5, TryCatch #13 {Exception -> 0x00f5, all -> 0x00f2, blocks: (B:32:0x00a6, B:34:0x00ae, B:36:0x00b8, B:38:0x00bc, B:39:0x00dd, B:40:0x00de, B:41:0x00f1, B:46:0x00f8, B:47:0x0115), top: B:78:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8 A[Catch: all -> 0x00f2, Exception -> 0x00f5, TryCatch #13 {Exception -> 0x00f5, all -> 0x00f2, blocks: (B:32:0x00a6, B:34:0x00ae, B:36:0x00b8, B:38:0x00bc, B:39:0x00dd, B:40:0x00de, B:41:0x00f1, B:46:0x00f8, B:47:0x0115), top: B:78:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00de, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00f8, please report this as an issue */
    @Override // p000AUx.d
    public final Object a(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Throwable {
        b bVar;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        m2 m2Var;
        m3 m3Var;
        k3 k3Var2 = k3Var;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i15 = bVar.f38129m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f38129m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f38127k;
        Object objE = uq.b.e();
        int i16 = bVar.f38129m;
        if (i16 == 0) {
            u.b(obj);
            byte[] bArr14 = new byte[8];
            n.o(bArr, bArr14, 0, 0, 0, 12, null);
            bArr3 = new byte[8];
            n.o(bArr2, bArr3, 0, 0, 0, 12, null);
            byte[] bArrH = n.H(bArr14, bArr3);
            try {
                try {
                    a2 a2Var = new a2(k3Var2.f37125c, bArrH);
                    hc.i iVar = this.f38143a;
                    bVar.f38121d = k3Var2;
                    bArr4 = bArr;
                    try {
                        bVar.f38122e = bArr4;
                        bArr5 = bArr2;
                        try {
                            bVar.f38123f = bArr5;
                            bVar.f38124g = bArr14;
                            bVar.f38125h = bArr3;
                            bVar.f38126j = bArrH;
                            bVar.f38129m = 1;
                            Object objA = iVar.a(a2Var, bVar);
                            if (objA == objE) {
                                return objE;
                            }
                            bArr8 = bArrH;
                            obj = objA;
                            bArr10 = bArr14;
                            bArr11 = bArr4;
                            m2Var = (m2) obj;
                            m3Var = m2Var.f28660c;
                            if (m3Var != m3.Ok) {
                                n.B(bArr8, (byte) 0, 0, 0, 6, null);
                                n.B(bArr11, (byte) 0, 0, 0, 6, null);
                                n.B(bArr5, (byte) 0, 0, 0, 6, null);
                                n.B(bArr10, (byte) 0, 0, 0, 6, null);
                                n.B(bArr3, (byte) 0, 0, 0, 6, null);
                                return i0.f148189a;
                            }
                            if ((m2Var.f28658a & 65280) != 25344) {
                                throw new gc.f("Pin change failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
                            }
                            if (m3Var == m3.AuthMethodBlocked) {
                                throw new gc.e("Pin change failed! " + m2Var.f28660c);
                            }
                            throw new gc.g("Pin change failed: " + k3Var2.name() + " has been blocked " + k3Var2.name());
                        } catch (Exception e15) {
                            e = e15;
                            bArr8 = bArrH;
                            bArr7 = bArr14;
                            bArr9 = bArr3;
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            bArr6 = bArrH;
                            bArr7 = bArr14;
                            bArr12 = bArr4;
                            bArr13 = bArr5;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        bArr5 = bArr2;
                        bArr8 = bArrH;
                        bArr7 = bArr14;
                        bArr9 = bArr3;
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        bArr5 = bArr2;
                        bArr6 = bArrH;
                        bArr7 = bArr14;
                        bArr12 = bArr4;
                        bArr13 = bArr5;
                        n.B(bArr6, (byte) 0, 0, 0, 6, null);
                        n.B(bArr12, (byte) 0, 0, 0, 6, null);
                        n.B(bArr13, (byte) 0, 0, 0, 6, null);
                        n.B(bArr7, (byte) 0, 0, 0, 6, null);
                        n.B(bArr3, (byte) 0, 0, 0, 6, null);
                        throw th;
                    }
                } catch (Exception e17) {
                    e = e17;
                    bArr4 = bArr;
                } catch (Throwable th6) {
                    th = th6;
                    bArr4 = bArr;
                }
            } catch (Exception e18) {
                e = e18;
                bArr4 = bArr;
            } catch (Throwable th7) {
                th = th7;
                bArr4 = bArr;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr8 = bVar.f38126j;
            bArr9 = bVar.f38125h;
            bArr7 = bVar.f38124g;
            byte[] bArr15 = bVar.f38123f;
            byte[] bArr16 = bVar.f38122e;
            k3Var2 = bVar.f38121d;
            try {
                u.b(obj);
                bArr3 = bArr9;
                bArr10 = bArr7;
                bArr5 = bArr15;
                bArr11 = bArr16;
                try {
                    m2Var = (m2) obj;
                    m3Var = m2Var.f28660c;
                    if (m3Var != m3.Ok) {
                        n.B(bArr8, (byte) 0, 0, 0, 6, null);
                        n.B(bArr11, (byte) 0, 0, 0, 6, null);
                        n.B(bArr5, (byte) 0, 0, 0, 6, null);
                        n.B(bArr10, (byte) 0, 0, 0, 6, null);
                        n.B(bArr3, (byte) 0, 0, 0, 6, null);
                        return i0.f148189a;
                    }
                    if ((m2Var.f28658a & 65280) != 25344) {
                        throw new gc.f("Pin change failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
                    }
                    if (m3Var == m3.AuthMethodBlocked) {
                        throw new gc.e("Pin change failed! " + m2Var.f28660c);
                    }
                    throw new gc.g("Pin change failed: " + k3Var2.name() + " has been blocked " + k3Var2.name());
                } catch (Exception e19) {
                    e = e19;
                    bArr9 = bArr3;
                    bArr4 = bArr11;
                    bArr7 = bArr10;
                    try {
                        throw e;
                    } catch (Throwable th8) {
                        th = th8;
                        bArr6 = bArr8;
                        bArr3 = bArr9;
                        bArr12 = bArr4;
                        bArr13 = bArr5;
                        n.B(bArr6, (byte) 0, 0, 0, 6, null);
                        n.B(bArr12, (byte) 0, 0, 0, 6, null);
                        n.B(bArr13, (byte) 0, 0, 0, 6, null);
                        n.B(bArr7, (byte) 0, 0, 0, 6, null);
                        n.B(bArr3, (byte) 0, 0, 0, 6, null);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    bArr6 = bArr8;
                    bArr3 = bArr3;
                    bArr13 = bArr5;
                    bArr7 = bArr10;
                    bArr12 = bArr11;
                }
            } catch (Exception e25) {
                e = e25;
                bArr5 = bArr15;
                bArr4 = bArr16;
                throw e;
            } catch (Throwable th10) {
                th = th10;
                bArr6 = bArr8;
                bArr3 = bArr9;
                bArr13 = bArr15;
                bArr12 = bArr16;
            }
        }
        n.B(bArr6, (byte) 0, 0, 0, 6, null);
        n.B(bArr12, (byte) 0, 0, 0, 6, null);
        n.B(bArr13, (byte) 0, 0, 0, 6, null);
        n.B(bArr7, (byte) 0, 0, 0, 6, null);
        n.B(bArr3, (byte) 0, 0, 0, 6, null);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7 A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0119 A[Catch: all -> 0x00ef, Exception -> 0x00f5, TryCatch #8 {Exception -> 0x00f5, all -> 0x00ef, blocks: (B:33:0x00ab, B:35:0x00b3, B:37:0x00b7, B:39:0x00c1, B:41:0x00c5, B:42:0x00da, B:43:0x00db, B:44:0x00ee, B:49:0x00fb, B:50:0x0118, B:51:0x0119, B:52:0x0121), top: B:93:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00fb, please report this as an issue */
    @Override // p000AUx.d
    public final Object b(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Throwable {
        c cVar;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        byte[] bArr15;
        byte[] bArr16;
        m2 m2Var;
        m3 m3Var;
        k3 k3Var2 = k3Var;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f38138m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f38138m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object obj = cVar.f38136k;
        Object objE = uq.b.e();
        int i16 = cVar.f38138m;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr10 = cVar.f38135j;
            bArr12 = cVar.f38134h;
            bArr11 = cVar.f38133g;
            byte[] bArr17 = cVar.f38132f;
            byte[] bArr18 = cVar.f38131e;
            k3Var2 = cVar.f38130d;
            try {
                u.b(obj);
                bArr15 = bArr10;
                bArr14 = bArr12;
                bArr13 = bArr11;
                bArr5 = bArr17;
                bArr16 = bArr18;
                try {
                    m2Var = (m2) obj;
                    m3Var = m2Var.f28660c;
                    if (m3Var != m3.Ok) {
                        n.B(bArr16, (byte) 0, 0, 0, 6, null);
                        n.B(bArr5, (byte) 0, 0, 0, 6, null);
                        n.B(bArr13, (byte) 0, 0, 0, 6, null);
                        n.B(bArr14, (byte) 0, 0, 0, 6, null);
                        n.B(bArr15, (byte) 0, 0, 0, 6, null);
                        return i0.f148189a;
                    }
                    if (m3Var != m3.WrongLength) {
                        throw new gc.f("Pin reset failed, wrong pin length", null);
                    }
                    if ((m2Var.f28658a & 65280) != 25344) {
                        throw new gc.f("Pin reset failed: PUK tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
                    }
                    if (m3Var == m3.AuthMethodBlocked) {
                        throw new gc.g("Pin reset failed: PUK has been blocked " + k3Var2.name());
                    }
                    throw new gc.e("Pin reset failed! " + m2Var.f28660c);
                } catch (Exception e15) {
                    e = e15;
                    bArr10 = bArr15;
                    bArr12 = bArr14;
                    bArr11 = bArr13;
                    bArr4 = bArr16;
                    try {
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        bArr3 = bArr11;
                        bArr7 = bArr4;
                        bArr9 = bArr5;
                        bArr8 = bArr12;
                        bArr6 = bArr10;
                        n.B(bArr7, (byte) 0, 0, 0, 6, null);
                        n.B(bArr9, (byte) 0, 0, 0, 6, null);
                        n.B(bArr3, (byte) 0, 0, 0, 6, null);
                        n.B(bArr8, (byte) 0, 0, 0, 6, null);
                        n.B(bArr6, (byte) 0, 0, 0, 6, null);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bArr10 = bArr15;
                    bArr12 = bArr14;
                    bArr7 = bArr16;
                    bArr3 = bArr13;
                    bArr9 = bArr5;
                    bArr8 = bArr12;
                    bArr6 = bArr10;
                    n.B(bArr7, (byte) 0, 0, 0, 6, null);
                    n.B(bArr9, (byte) 0, 0, 0, 6, null);
                    n.B(bArr3, (byte) 0, 0, 0, 6, null);
                    n.B(bArr8, (byte) 0, 0, 0, 6, null);
                    n.B(bArr6, (byte) 0, 0, 0, 6, null);
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                bArr5 = bArr17;
                bArr4 = bArr18;
                throw e;
            } catch (Throwable th6) {
                th = th6;
                bArr9 = bArr17;
                bArr7 = bArr18;
                bArr3 = bArr11;
                bArr8 = bArr12;
                bArr6 = bArr10;
                n.B(bArr7, (byte) 0, 0, 0, 6, null);
                n.B(bArr9, (byte) 0, 0, 0, 6, null);
                n.B(bArr3, (byte) 0, 0, 0, 6, null);
                n.B(bArr8, (byte) 0, 0, 0, 6, null);
                n.B(bArr6, (byte) 0, 0, 0, 6, null);
                throw th;
            }
        }
        u.b(obj);
        bArr3 = new byte[8];
        byte[] bArr19 = new byte[8];
        n.o(bArr, bArr3, 0, 0, 0, 12, null);
        n.o(bArr2, bArr19, 0, 0, 0, 12, null);
        byte[] bArrH = n.H(bArr3, bArr19);
        try {
            try {
                x2 x2Var = new x2(k3Var2.f37125c, bArrH);
                hc.i iVar = this.f38143a;
                cVar.f38130d = k3Var2;
                bArr4 = bArr;
                try {
                    cVar.f38131e = bArr4;
                    bArr5 = bArr2;
                    try {
                        cVar.f38132f = bArr5;
                        cVar.f38133g = bArr3;
                        cVar.f38134h = bArr19;
                        cVar.f38135j = bArrH;
                        cVar.f38138m = 1;
                        Object objA = iVar.a(x2Var, cVar);
                        if (objA == objE) {
                            return objE;
                        }
                        bArr13 = bArr3;
                        bArr14 = bArr19;
                        bArr15 = bArrH;
                        obj = objA;
                        bArr16 = bArr4;
                        m2Var = (m2) obj;
                        m3Var = m2Var.f28660c;
                        if (m3Var != m3.Ok) {
                            n.B(bArr16, (byte) 0, 0, 0, 6, null);
                            n.B(bArr5, (byte) 0, 0, 0, 6, null);
                            n.B(bArr13, (byte) 0, 0, 0, 6, null);
                            n.B(bArr14, (byte) 0, 0, 0, 6, null);
                            n.B(bArr15, (byte) 0, 0, 0, 6, null);
                            return i0.f148189a;
                        }
                        if (m3Var != m3.WrongLength) {
                            throw new gc.f("Pin reset failed, wrong pin length", null);
                        }
                        if ((m2Var.f28658a & 65280) != 25344) {
                            throw new gc.f("Pin reset failed: PUK tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
                        }
                        if (m3Var == m3.AuthMethodBlocked) {
                            throw new gc.g("Pin reset failed: PUK has been blocked " + k3Var2.name());
                        }
                        throw new gc.e("Pin reset failed! " + m2Var.f28660c);
                    } catch (Exception e17) {
                        e = e17;
                        bArr10 = bArrH;
                        bArr11 = bArr3;
                        bArr12 = bArr19;
                        throw e;
                    } catch (Throwable th7) {
                        th = th7;
                        bArr6 = bArrH;
                        bArr7 = bArr4;
                        bArr8 = bArr19;
                        bArr9 = bArr5;
                        n.B(bArr7, (byte) 0, 0, 0, 6, null);
                        n.B(bArr9, (byte) 0, 0, 0, 6, null);
                        n.B(bArr3, (byte) 0, 0, 0, 6, null);
                        n.B(bArr8, (byte) 0, 0, 0, 6, null);
                        n.B(bArr6, (byte) 0, 0, 0, 6, null);
                        throw th;
                    }
                } catch (Exception e18) {
                    e = e18;
                    bArr5 = bArr2;
                    bArr10 = bArrH;
                    bArr11 = bArr3;
                    bArr12 = bArr19;
                    throw e;
                } catch (Throwable th8) {
                    th = th8;
                    bArr5 = bArr2;
                    bArr6 = bArrH;
                    bArr7 = bArr4;
                    bArr8 = bArr19;
                    bArr9 = bArr5;
                    n.B(bArr7, (byte) 0, 0, 0, 6, null);
                    n.B(bArr9, (byte) 0, 0, 0, 6, null);
                    n.B(bArr3, (byte) 0, 0, 0, 6, null);
                    n.B(bArr8, (byte) 0, 0, 0, 6, null);
                    n.B(bArr6, (byte) 0, 0, 0, 6, null);
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                bArr4 = bArr;
            } catch (Throwable th9) {
                th = th9;
                bArr4 = bArr;
            }
        } catch (Exception e25) {
            e = e25;
            bArr4 = bArr;
        } catch (Throwable th10) {
            th = th10;
            bArr4 = bArr;
        }
        n.B(bArr7, (byte) 0, 0, 0, 6, null);
        n.B(bArr9, (byte) 0, 0, 0, 6, null);
        n.B(bArr3, (byte) 0, 0, 0, 6, null);
        n.B(bArr8, (byte) 0, 0, 0, 6, null);
        n.B(bArr6, (byte) 0, 0, 0, 6, null);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object c(k3 k3Var, vq.d dVar) throws Throwable {
        a aVar;
        int i15;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i16 = aVar.f38120f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f38120f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object objA = aVar.f38118d;
        Object objE = uq.b.e();
        int i17 = aVar.f38120f;
        if (i17 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37125c, null);
            hc.i iVar = this.f38143a;
            aVar.f38120f = 1;
            objA = iVar.a(y2Var, aVar);
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
            throw new gc.e("No info available for PIN that is already authenticated " + m2Var.f28660c);
        }
        int i18 = m2Var.f28658a;
        if ((65280 & i18) == 25344) {
            i15 = i18 & 15;
        } else {
            if (m3Var != m3.AuthMethodBlocked) {
                throw new gc.e("Could not get PIN verification counter! " + m2Var.f28660c);
            }
            i15 = 0;
        }
        return vq.b.e(i15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object d(k3 k3Var, byte[] bArr, vq.d dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f38142g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f38142g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object objA = dVar2.f38140e;
        Object objE = uq.b.e();
        int i16 = dVar2.f38142g;
        if (i16 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37125c, n.H(bArr, new byte[8 - bArr.length]));
            hc.i iVar = this.f38143a;
            dVar2.f38139d = k3Var;
            dVar2.f38142g = 1;
            objA = iVar.a(y2Var, dVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3Var = dVar2.f38139d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            return i0.f148189a;
        }
        if (m3Var == m3.WrongLength) {
            throw new gc.f("Pin verification failed, wrong pin length", null);
        }
        if ((m2Var.f28658a & 65280) == 25344) {
            throw new gc.f("Pin verification failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
        }
        if (m3Var != m3.AuthMethodBlocked) {
            throw new gc.e("Pin verification failed! " + m2Var.f28660c);
        }
        throw new gc.g("Pin verification failed: " + k3Var.name() + " has been blocked " + k3Var.name());
    }

    @Override // p000AUx.d
    public final Object e(k3 k3Var, tq.e eVar) {
        return i0.f148189a;
    }
}
