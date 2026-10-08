package z50;

import b5.v;
import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import er.l;
import er.p;
import er.q;
import f3.j;
import h60.g;
import j70.h;
import l3.d0;
import mx.Label;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.Function0;
import p046f2.nr;
import p046f2.rr;
import p046f2.ur;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import x50.i;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx50/i$b;", "data", "Lf2/ur;", "scrollBehavior", "Ll3/d0;", "nextFocusRequester", "previousFocusRequester", "lastElementFocusRequester", "Loq/i0;", "f", "(Lx50/i$b;Lf2/ur;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void f(final i.Medium medium, final ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        int i17;
        d0 d0Var4;
        int i18;
        d0 d0Var5;
        int i19;
        int i25;
        d0 d0Var6;
        int i26;
        boolean z15;
        final d0 d0Var7;
        final d0 d0Var8;
        final d0 d0Var9;
        d5 d5VarM;
        final d0 d0Var10;
        final d0 d0Var11;
        final d0 d0Var12;
        r rVarH = rVar.h(2012365864);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(medium) : rVarH.G(medium) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(urVar) ? 32 : 16;
        }
        int i27 = i16 & 4;
        if (i27 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                d0Var4 = d0Var;
                i17 |= rVarH.W(d0Var4) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var5 = d0Var2;
                    if (rVarH.W(d0Var5)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        d0Var6 = d0Var3;
                        if (rVarH.W(d0Var6)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i27 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var4;
                        }
                        if (i18 != 0) {
                            d0Var11 = null;
                        } else {
                            d0Var11 = d0Var5;
                        }
                        if (i25 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var6;
                        }
                        if (t.k()) {
                            t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                        }
                        nr nrVarS = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                        rVarH = rVarH;
                        d0 d0Var13 = d0Var10;
                        d0 d0Var14 = d0Var11;
                        d0 d0Var15 = d0Var12;
                        Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), 0.0f, 0.0f, null, nrVarS, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                        if (t.k()) {
                            t.n();
                        }
                        d0Var7 = d0Var13;
                        d0Var8 = d0Var14;
                        d0Var9 = d0Var15;
                    } else {
                        rVarH.O();
                        d0Var7 = d0Var4;
                        d0Var8 = d0Var5;
                        d0Var9 = d0Var6;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: z50.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                d0Var6 = d0Var3;
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                    }
                    nr nrVarS2 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                    rVarH = rVarH;
                    d0 d0Var16 = d0Var10;
                    d0 d0Var17 = d0Var11;
                    d0 d0Var18 = d0Var12;
                    Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, 0.0f, null, nrVarS2, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var16;
                    d0Var8 = d0Var17;
                    d0Var9 = d0Var18;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: z50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var5 = d0Var2;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                    }
                    nr nrVarS3 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                    rVarH = rVarH;
                    d0 d0Var19 = d0Var10;
                    d0 d0Var110 = d0Var11;
                    d0 d0Var111 = d0Var12;
                    Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, 0.0f, null, nrVarS3, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var19;
                    d0Var8 = d0Var110;
                    d0Var9 = d0Var111;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: z50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d0Var6 = d0Var3;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var12 = null;
                } else {
                    d0Var12 = d0Var6;
                }
                if (t.k()) {
                    t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                }
                nr nrVarS4 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                rVarH = rVarH;
                d0 d0Var112 = d0Var10;
                d0 d0Var113 = d0Var11;
                d0 d0Var114 = d0Var12;
                Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, 0.0f, null, nrVarS4, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var112;
                d0Var8 = d0Var113;
                d0Var9 = d0Var114;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: z50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        d0Var4 = d0Var;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                d0Var5 = d0Var2;
                if (rVarH.W(d0Var5)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                    }
                    nr nrVarS5 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                    rVarH = rVarH;
                    d0 d0Var115 = d0Var10;
                    d0 d0Var116 = d0Var11;
                    d0 d0Var117 = d0Var12;
                    Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, 0.0f, null, nrVarS5, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var115;
                    d0Var8 = d0Var116;
                    d0Var9 = d0Var117;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: z50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d0Var6 = d0Var3;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var12 = null;
                } else {
                    d0Var12 = d0Var6;
                }
                if (t.k()) {
                    t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                }
                nr nrVarS6 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                rVarH = rVarH;
                d0 d0Var118 = d0Var10;
                d0 d0Var119 = d0Var11;
                d0 d0Var1110 = d0Var12;
                Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, 0.0f, null, nrVarS6, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var118;
                d0Var8 = d0Var119;
                d0Var9 = d0Var1110;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: z50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        d0Var5 = d0Var2;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                d0Var6 = d0Var3;
                if (rVarH.W(d0Var6)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var12 = null;
                } else {
                    d0Var12 = d0Var6;
                }
                if (t.k()) {
                    t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
                }
                nr nrVarS7 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
                rVarH = rVarH;
                d0 d0Var1111 = d0Var10;
                d0 d0Var1112 = d0Var11;
                d0 d0Var1113 = d0Var12;
                Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, 0.0f, null, nrVarS7, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var1111;
                d0Var8 = d0Var1112;
                d0Var9 = d0Var1113;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: z50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        d0Var6 = d0Var3;
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i27 != 0) {
                d0Var10 = null;
            } else {
                d0Var10 = d0Var4;
            }
            if (i18 != 0) {
                d0Var11 = null;
            } else {
                d0Var11 = d0Var5;
            }
            if (i25 != 0) {
                d0Var12 = null;
            } else {
                d0Var12 = d0Var6;
            }
            if (t.k()) {
                t.o(2012365864, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar (MediumTopAppBar.kt:33)");
            }
            nr nrVarS8 = rr.f57664a.s(medium.b().B(rVarH, 0).m20unboximpl(), medium.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60);
            rVarH = rVarH;
            d0 d0Var1114 = d0Var10;
            d0 d0Var1115 = d0Var11;
            d0 d0Var1116 = d0Var12;
            Function0.u(m.d(1890266159, true, new p() { // from class: z50.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(urVar, medium, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, m.d(-1917627411, true, new p() { // from class: z50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(medium, d0Var12, d0Var10, d0Var11, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), m.d(56153892, true, new q() { // from class: z50.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.j(medium, d0Var10, d0Var11, d0Var12, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), 0.0f, 0.0f, null, nrVarS8, urVar, rVarH, ((i17 << 21) & 234881024) | 3462, 114);
            if (t.k()) {
                t.n();
            }
            d0Var7 = d0Var1114;
            d0Var8 = d0Var1115;
            d0Var9 = d0Var1116;
        } else {
            rVarH.O();
            d0Var7 = d0Var4;
            d0Var8 = d0Var5;
            d0Var9 = d0Var6;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: z50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(medium, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ur urVar, final i.Medium medium, r rVar, int i15) {
        int i16;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1890266159, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar.<anonymous> (MediumTopAppBar.kt:40)");
            }
            if (urVar.getState().g() < 0.35d) {
                rVar2.X(1603003872);
                Label title = medium.getTitle();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                i16 = 1601306963;
                h.g(null, null, title, null, null, aVar.a(rVar2, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVar2, i17).g(), null, null, false, false, medium.getAccessibilityReadMode(), rVar, 0, 1597440, MLKEMEngine.KyberPolyBytes, 11976667);
                rVar2 = rVar;
            } else {
                i16 = 1601306963;
                rVar2.X(1601306963);
            }
            rVar2.R();
            if (urVar.getState().g() > 0.75d) {
                rVar2.X(1603411274);
                f3.m.Companion companion = f3.m.INSTANCE;
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar2, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT = rVar2.t();
                f3.m mVarE = j.e(rVar2, mVarH);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB);
                } else {
                    rVar2.u();
                }
                r rVarC = n6.c(rVar2);
                n6.i(rVarC, w0VarB, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                q3 q3Var = q3.f39261a;
                boolean zG = rVar2.G(medium);
                Object objE = rVar2.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: z50.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h(medium, (n4.i0) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f3.m mVarD = n4.v.d(companion, false, (l) objE, 1, null);
                Label title2 = medium.getTitle();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                h.g(mVarD, null, title2, null, null, aVar2.a(rVar2, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 1, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, medium.getAccessibilityReadMode(), rVar, 0, 1597440, 0, 16170970);
                rVar2 = rVar;
                rVar2.x();
            } else {
                rVar2.X(i16);
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i.Medium medium, n4.i0 i0Var) {
        f0.n0(i0Var, medium.getTitle().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(i.Medium medium, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1917627411, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar.<anonymous> (MediumTopAppBar.kt:70)");
            }
            if (medium.getNavigationButtonData() != null) {
                rVar.X(-298968972);
                x50.h.h(medium.getNavigationButtonData(), medium.getMenuType() == null ? d0Var : null, medium.getMenuType() == null ? d0Var2 : null, d0Var3, rVar, 0, 0);
                rVar.R();
            } else {
                if (medium.getSygnetVisible()) {
                    rVar.X(-298959627);
                    h60.f.e(a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), null, Integer.valueOf(a30.a.f2274d), g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 3072, 0, 4082);
                } else {
                    rVar.X(-680830763);
                }
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(i.Medium medium, d0 d0Var, d0 d0Var2, d0 d0Var3, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(56153892, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.medium.MediumTopAppBar.<anonymous> (MediumTopAppBar.kt:84)");
            }
            x50.a menuType = medium.getMenuType();
            if (medium.getNavigationButtonData() != null) {
                d0Var2 = null;
            }
            x50.h.f(menuType, d0Var, d0Var2, d0Var3, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i.Medium medium, ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        f(medium, urVar, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
