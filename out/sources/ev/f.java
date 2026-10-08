package ev;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p027coN.c2;
import p027coN.d2;
import p027coN.m2;
import p027coN.y2;
import p028con.k3;
import p028con.m3;
import pq.n;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p000AUx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.i f53754a;

    public f(hc.i iVar) {
        this.f53754a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p000AUx.d
    public final Object a(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Exception {
        c cVar;
        Throwable th4;
        byte[] bArr3;
        byte[] bArr4;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f53743h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f53743h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object objA = cVar.f53741f;
        Object objE = uq.b.e();
        int i16 = cVar.f53743h;
        try {
            try {
                if (i16 == 0) {
                    u.b(objA);
                    c2 c2Var = new c2(k3Var.f37124b, bArr2);
                    hc.i iVar = this.f53754a;
                    cVar.f53739d = bArr;
                    cVar.f53740e = bArr2;
                    cVar.f53743h = 1;
                    objA = iVar.a(c2Var, cVar);
                    if (objA == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr2 = cVar.f53740e;
                    bArr = cVar.f53739d;
                    u.b(objA);
                }
                byte[] bArr5 = bArr;
                byte[] bArr6 = bArr2;
                try {
                    m2 m2Var = (m2) objA;
                    if (m2Var.f28660c == m3.Ok) {
                        n.B(bArr6, (byte) 0, 0, 0, 6, null);
                        n.B(bArr5, (byte) 0, 0, 0, 6, null);
                        return i0.f148189a;
                    }
                    throw new gc.e("Pin change failed! " + m2Var.f28660c);
                } catch (Exception e15) {
                    throw e15;
                } catch (Throwable th5) {
                    th4 = th5;
                    bArr3 = bArr5;
                    bArr4 = bArr6;
                    n.B(bArr4, (byte) 0, 0, 0, 6, null);
                    n.B(bArr3, (byte) 0, 0, 0, 6, null);
                    throw th4;
                }
            } catch (Throwable th6) {
                th4 = th6;
                bArr3 = bArr;
                bArr4 = bArr2;
            }
        } catch (Exception e16) {
            throw e16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: all -> 0x0062, Exception -> 0x0067, TRY_LEAVE, TryCatch #7 {Exception -> 0x0067, all -> 0x0062, blocks: (B:23:0x005e, B:38:0x00b2, B:40:0x00ba, B:54:0x010c, B:55:0x011f), top: B:68:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: all -> 0x0106, Exception -> 0x0109, TRY_ENTER, TryCatch #6 {Exception -> 0x0109, all -> 0x0106, blocks: (B:44:0x00d7, B:48:0x00f2, B:49:0x0105), top: B:69:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010c A[Catch: all -> 0x0062, Exception -> 0x0067, TRY_ENTER, TryCatch #7 {Exception -> 0x0067, all -> 0x0062, blocks: (B:23:0x005e, B:38:0x00b2, B:40:0x00ba, B:54:0x010c, B:55:0x011f), top: B:68:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x010c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [ev.f] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // p000AUx.d
    public final Object b(k3 k3Var, byte[] bArr, byte[] bArr2, vq.d dVar) throws Exception {
        d dVar2;
        ?? r15;
        ?? r16;
        k3 k3Var2;
        ?? r17;
        k3 k3Var3;
        ?? r18;
        m2 m2Var;
        Object objA;
        m2 m2Var2;
        ?? r19;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f53749j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f53749j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f53747g;
        Object objE = uq.b.e();
        int i16 = dVar2.f53749j;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    k3 k3Var4 = k3.Puk;
                    k3Var2 = k3Var;
                    dVar2.f53744d = k3Var2;
                    dVar2.f53745e = bArr;
                    byte[] bArr3 = bArr2;
                    dVar2.f53746f = bArr3;
                    dVar2.f53749j = 1;
                    if (d(k3Var4, bArr, dVar2) != objE) {
                        r15 = bArr;
                        r16 = bArr3;
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m2Var2 = (m2) dVar2.f53746f;
                        byte[] bArr4 = dVar2.f53745e;
                        byte[] bArr5 = (byte[]) dVar2.f53744d;
                        try {
                            u.b(obj);
                            r16 = bArr4;
                            r19 = bArr5;
                            try {
                                if (((m2) obj).f28660c == m3.Ok) {
                                    n.B(r19, (byte) 0, 0, 0, 6, null);
                                    n.B(r16, (byte) 0, 0, 0, 6, null);
                                    return i0.f148189a;
                                }
                                throw new gc.e("Pin reset failed! " + m2Var2.f28660c);
                            } catch (Exception e15) {
                                e = e15;
                                throw e;
                            } catch (Throwable th4) {
                                th = th4;
                                r15 = r19;
                                n.B(r15, (byte) 0, 0, 0, 6, null);
                                n.B(r16, (byte) 0, 0, 0, 6, null);
                                throw th;
                            }
                        } catch (Exception e16) {
                            throw e16;
                        }
                    }
                    byte[] bArr6 = (byte[]) dVar2.f53746f;
                    byte[] bArr7 = dVar2.f53745e;
                    k3Var3 = (k3) dVar2.f53744d;
                    try {
                        u.b(obj);
                        r18 = bArr6;
                        r17 = bArr7;
                        m2Var = (m2) obj;
                        if (m2Var.f28660c == m3.Ok) {
                            throw new gc.e("Pin reset failed! " + m2Var.f28660c);
                        }
                        c2 c2Var = new c2(k3Var3.f37124b, r18);
                        hc.i iVar = this.f53754a;
                        dVar2.f53744d = r17;
                        dVar2.f53745e = r18;
                        dVar2.f53746f = m2Var;
                        dVar2.f53749j = 3;
                        objA = iVar.a(c2Var, dVar2);
                        if (objA != objE) {
                            obj = objA;
                            m2Var2 = m2Var;
                            r16 = r18;
                            r19 = r17;
                            if (((m2) obj).f28660c == m3.Ok) {
                                n.B(r19, (byte) 0, 0, 0, 6, null);
                                n.B(r16, (byte) 0, 0, 0, 6, null);
                                return i0.f148189a;
                            }
                            throw new gc.e("Pin reset failed! " + m2Var2.f28660c);
                        }
                        return objE;
                    } catch (Exception e17) {
                        throw e17;
                    } catch (Throwable th5) {
                        th = th5;
                        r16 = bArr6;
                        r15 = bArr7;
                        n.B(r15, (byte) 0, 0, 0, 6, null);
                        n.B(r16, (byte) 0, 0, 0, 6, null);
                        throw th;
                    }
                }
                byte[] bArr8 = (byte[]) dVar2.f53746f;
                byte[] bArr9 = dVar2.f53745e;
                k3 k3Var5 = (k3) dVar2.f53744d;
                u.b(obj);
                r16 = bArr8;
                r15 = bArr9;
                k3Var2 = k3Var5;
                d2 d2Var = new d2(k3Var2.f37124b);
                hc.i iVar2 = this.f53754a;
                dVar2.f53744d = k3Var2;
                dVar2.f53745e = r15;
                dVar2.f53746f = r16;
                dVar2.f53749j = 2;
                Object objA2 = iVar2.a(d2Var, dVar2);
                if (objA2 != objE) {
                    r17 = r15;
                    obj = objA2;
                    k3Var3 = k3Var2;
                    r18 = r16;
                    m2Var = (m2) obj;
                    if (m2Var.f28660c == m3.Ok) {
                        throw new gc.e("Pin reset failed! " + m2Var.f28660c);
                    }
                    c2 c2Var2 = new c2(k3Var3.f37124b, r18);
                    hc.i iVar3 = this.f53754a;
                    dVar2.f53744d = r17;
                    dVar2.f53745e = r18;
                    dVar2.f53746f = m2Var;
                    dVar2.f53749j = 3;
                    objA = iVar3.a(c2Var2, dVar2);
                    if (objA != objE) {
                        obj = objA;
                        m2Var2 = m2Var;
                        r16 = r18;
                        r19 = r17;
                        if (((m2) obj).f28660c == m3.Ok) {
                            n.B(r19, (byte) 0, 0, 0, 6, null);
                            n.B(r16, (byte) 0, 0, 0, 6, null);
                            return i0.f148189a;
                        }
                        throw new gc.e("Pin reset failed! " + m2Var2.f28660c);
                    }
                }
                return objE;
            } catch (Exception e18) {
                e = e18;
                throw e;
            } catch (Throwable th6) {
                th = th6;
                n.B(r15, (byte) 0, 0, 0, 6, null);
                n.B(r16, (byte) 0, 0, 0, 6, null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r15 = dVar2;
            r16 = objE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000AUx.d
    public final Object c(k3 k3Var, vq.d dVar) throws Throwable {
        b bVar;
        int i15;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i16 = bVar.f53738f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f53738f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object objA = bVar.f53736d;
        Object objE = uq.b.e();
        int i17 = bVar.f53738f;
        if (i17 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37124b, null);
            hc.i iVar = this.f53754a;
            bVar.f53738f = 1;
            objA = iVar.a(y2Var, bVar);
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
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i15 = eVar.f53753g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f53753g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object objA = eVar.f53751e;
        Object objE = uq.b.e();
        int i16 = eVar.f53753g;
        if (i16 == 0) {
            u.b(objA);
            y2 y2Var = new y2(k3Var.f37124b, bArr);
            hc.i iVar = this.f53754a;
            eVar.f53750d = k3Var;
            eVar.f53753g = 1;
            objA = iVar.a(y2Var, eVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k3Var = eVar.f53750d;
            u.b(objA);
        }
        m2 m2Var = (m2) objA;
        m3 m3Var = m2Var.f28660c;
        if (m3Var == m3.Ok) {
            return i0.f148189a;
        }
        int i17 = m2Var.f28658a;
        if ((65280 & i17) == 25344) {
            if ((i17 & 15) != 0) {
                throw new gc.f("Pin verification failed: tries left = " + (m2Var.f28658a & 15), vq.b.e(m2Var.f28658a & 15));
            }
            throw new gc.g("Pin verification failed: " + k3Var.name() + " has been blocked " + k3Var.name());
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
