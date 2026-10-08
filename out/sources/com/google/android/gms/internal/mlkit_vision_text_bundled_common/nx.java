package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class nx implements ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jx f30541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ky f30542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mv f30544d;

    private nx(ky kyVar, mv mvVar, jx jxVar) {
        this.f30542b = kyVar;
        this.f30543c = jxVar instanceof yv;
        this.f30544d = mvVar;
        this.f30541a = jxVar;
    }

    static nx i(ky kyVar, mv mvVar, jx jxVar) {
        return new nx(kyVar, mvVar, jxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final int a(Object obj) {
        int iB = ((bw) obj).zbc.b();
        return this.f30543c ? iB + ((yv) obj).zbb.c() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void b(Object obj, Object obj2) {
        wx.u(this.f30542b, obj, obj2);
        if (this.f30543c) {
            wx.t(this.f30544d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final Object b0() {
        jx jxVar = this.f30541a;
        return jxVar instanceof bw ? ((bw) jxVar).x() : jxVar.e().S1();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void c(Object obj, xy xyVar) {
        Iterator itG = ((yv) obj).zbb.g();
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            pv pvVar = (pv) entry.getKey();
            if (pvVar.b0() != wy.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            pvVar.K1();
            pvVar.x1();
            if (entry instanceof pw) {
                pvVar.m();
                xyVar.p(32149011, ((pw) entry).a().b());
            } else {
                pvVar.m();
                xyVar.p(32149011, entry.getValue());
            }
        }
        ((bw) obj).zbc.k(xyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final boolean d(Object obj) {
        return ((yv) obj).zbb.m();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void e(Object obj, byte[] bArr, int i15, int i16, lu luVar) throws mw {
        int iK;
        bw bwVar = (bw) obj;
        ly lyVarF = bwVar.zbc;
        if (lyVarF == ly.c()) {
            lyVarF = ly.f();
            bwVar.zbc = lyVarF;
        }
        ly lyVar = lyVarF;
        qv qvVarE = ((yv) obj).E();
        aw awVarC = null;
        while (i15 < i16) {
            int iK2 = mu.k(bArr, i15, luVar);
            int i17 = luVar.f30480a;
            if (i17 == 11) {
                int i18 = i16;
                lu luVar2 = luVar;
                int i19 = 0;
                yu yuVar = null;
                while (true) {
                    if (iK2 >= i18) {
                        iK = iK2;
                        break;
                    }
                    iK = mu.k(bArr, iK2, luVar2);
                    int i25 = luVar2.f30480a;
                    int i26 = i25 >>> 3;
                    int i27 = i25 & 7;
                    if (i26 == 2) {
                        if (i27 != 0) {
                            if (i25 != 12) {
                                break;
                                break;
                            }
                            iK2 = mu.q(i25, bArr, iK, i18, luVar2);
                        } else {
                            iK2 = mu.k(bArr, iK, luVar2);
                            i19 = luVar2.f30480a;
                            awVarC = luVar2.f30483d.c(this.f30541a, i19);
                        }
                    } else {
                        if (i26 == 3) {
                            if (awVarC != null) {
                                iK2 = mu.e(rx.a().b(awVarC.f30358a.getClass()), bArr, iK, i18, luVar2);
                                qvVarE.j(awVarC.f30359b, luVar2.f30482c);
                            } else if (i27 == 2) {
                                iK2 = mu.a(bArr, iK, luVar2);
                                yuVar = (yu) luVar2.f30482c;
                            }
                        }
                        if (i25 != 12) {
                            break;
                        } else {
                            iK2 = mu.q(i25, bArr, iK, i18, luVar2);
                        }
                    }
                }
                if (yuVar != null) {
                    lyVar.j((i19 << 3) | 2, yuVar);
                }
                i15 = iK;
                i16 = i18;
                luVar = luVar2;
            } else if ((i17 & 7) == 2) {
                awVarC = luVar.f30483d.c(this.f30541a, i17 >>> 3);
                if (awVarC != null) {
                    i15 = mu.e(rx.a().b(awVarC.f30358a.getClass()), bArr, iK2, i16, luVar);
                    qvVarE.j(awVarC.f30359b, luVar.f30482c);
                } else {
                    i15 = mu.j(i17, bArr, iK2, i16, lyVar, luVar);
                }
            } else {
                i15 = mu.q(i17, bArr, iK2, i16, luVar);
            }
        }
        if (i15 != i16) {
            throw new mw("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void f(Object obj) {
        this.f30542b.b(obj);
        this.f30544d.a(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final boolean g(Object obj, Object obj2) {
        if (!((bw) obj).zbc.equals(((bw) obj2).zbc)) {
            return false;
        }
        if (this.f30543c) {
            return ((yv) obj).zbb.equals(((yv) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final int h(Object obj) {
        int iHashCode = ((bw) obj).zbc.hashCode();
        return this.f30543c ? (iHashCode * 53) + ((yv) obj).zbb.f30564a.hashCode() : iHashCode;
    }
}
