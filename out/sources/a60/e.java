package a60;

import b5.v;
import d1.p3;
import er.p;
import er.q;
import j70.h;
import l3.d0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.Function0;
import p046f2.rr;
import p046f2.ur;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import x50.i;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx50/i$c;", "data", "Lf2/ur;", "scrollBehavior", "Ll3/d0;", "nextFocusRequester", "previousFocusRequester", "lastElementFocusRequester", "Loq/i0;", "e", "(Lx50/i$c;Lf2/ur;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void e(final i.Small small, final ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        int i17;
        d0 d0Var4;
        int i18;
        d0 d0Var5;
        int i19;
        int i25;
        d0 d0Var6;
        int i26;
        boolean z15;
        r rVar2;
        final d0 d0Var7;
        final d0 d0Var8;
        final d0 d0Var9;
        d5 d5VarM;
        r rVarH = rVar.h(-1388885946);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(small) : rVarH.G(small) ? 4 : 2) | i15;
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
                            d0Var4 = null;
                        }
                        if (i18 != 0) {
                            d0Var5 = null;
                        }
                        if (i25 != 0) {
                            d0Var6 = null;
                        }
                        if (t.k()) {
                            t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                        }
                        final d0 d0Var10 = d0Var6;
                        final d0 d0Var11 = d0Var4;
                        final d0 d0Var12 = d0Var5;
                        rVar2 = rVarH;
                        Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return e.f(small, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return e.g(small, d0Var10, d0Var11, d0Var12, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return e.h(small, d0Var11, d0Var12, d0Var10, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                        if (t.k()) {
                            t.n();
                        }
                        d0Var9 = d0Var10;
                        d0Var8 = d0Var12;
                        d0Var7 = d0Var11;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        d0Var7 = d0Var4;
                        d0Var8 = d0Var5;
                        d0Var9 = d0Var6;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a60.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                    }
                    final d0 d0Var13 = d0Var6;
                    final d0 d0Var14 = d0Var4;
                    final d0 d0Var15 = d0Var5;
                    rVar2 = rVarH;
                    Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.f(small, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.g(small, d0Var13, d0Var14, d0Var15, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return e.h(small, d0Var14, d0Var15, d0Var13, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var9 = d0Var13;
                    d0Var8 = d0Var15;
                    d0Var7 = d0Var14;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a60.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                    }
                    final d0 d0Var16 = d0Var6;
                    final d0 d0Var17 = d0Var4;
                    final d0 d0Var18 = d0Var5;
                    rVar2 = rVarH;
                    Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.f(small, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.g(small, d0Var16, d0Var17, d0Var18, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return e.h(small, d0Var17, d0Var18, d0Var16, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var9 = d0Var16;
                    d0Var8 = d0Var18;
                    d0Var7 = d0Var17;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a60.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                    d0Var4 = null;
                }
                if (i18 != 0) {
                    d0Var5 = null;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                }
                final d0 d0Var19 = d0Var6;
                final d0 d0Var110 = d0Var4;
                final d0 d0Var111 = d0Var5;
                rVar2 = rVarH;
                Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.f(small, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g(small, d0Var19, d0Var110, d0Var111, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return e.h(small, d0Var110, d0Var111, d0Var19, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                if (t.k()) {
                    t.n();
                }
                d0Var9 = d0Var19;
                d0Var8 = d0Var111;
                d0Var7 = d0Var110;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a60.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                    }
                    final d0 d0Var112 = d0Var6;
                    final d0 d0Var113 = d0Var4;
                    final d0 d0Var114 = d0Var5;
                    rVar2 = rVarH;
                    Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.f(small, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.g(small, d0Var112, d0Var113, d0Var114, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return e.h(small, d0Var113, d0Var114, d0Var112, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                    if (t.k()) {
                        t.n();
                    }
                    d0Var9 = d0Var112;
                    d0Var8 = d0Var114;
                    d0Var7 = d0Var113;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a60.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                    d0Var4 = null;
                }
                if (i18 != 0) {
                    d0Var5 = null;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                }
                final d0 d0Var115 = d0Var6;
                final d0 d0Var116 = d0Var4;
                final d0 d0Var117 = d0Var5;
                rVar2 = rVarH;
                Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.f(small, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g(small, d0Var115, d0Var116, d0Var117, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return e.h(small, d0Var116, d0Var117, d0Var115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                if (t.k()) {
                    t.n();
                }
                d0Var9 = d0Var115;
                d0Var8 = d0Var117;
                d0Var7 = d0Var116;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a60.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                    d0Var4 = null;
                }
                if (i18 != 0) {
                    d0Var5 = null;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
                }
                final d0 d0Var118 = d0Var6;
                final d0 d0Var119 = d0Var4;
                final d0 d0Var1110 = d0Var5;
                rVar2 = rVarH;
                Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.f(small, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g(small, d0Var118, d0Var119, d0Var1110, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return e.h(small, d0Var119, d0Var1110, d0Var118, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
                if (t.k()) {
                    t.n();
                }
                d0Var9 = d0Var118;
                d0Var8 = d0Var1110;
                d0Var7 = d0Var119;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a60.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                d0Var4 = null;
            }
            if (i18 != 0) {
                d0Var5 = null;
            }
            if (i25 != 0) {
                d0Var6 = null;
            }
            if (t.k()) {
                t.o(-1388885946, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar (SmallTopAppBar.kt:24)");
            }
            final d0 d0Var1111 = d0Var6;
            final d0 d0Var1112 = d0Var4;
            final d0 d0Var1113 = d0Var5;
            rVar2 = rVarH;
            Function0.y(m.d(1587081986, true, new p() { // from class: a60.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.f(small, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, m.d(238948416, true, new p() { // from class: a60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(small, d0Var1111, d0Var1112, d0Var1113, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), m.d(-688071625, true, new q() { // from class: a60.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return e.h(small, d0Var1112, d0Var1113, d0Var1111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), 0.0f, null, rr.f57664a.s(small.b().B(rVarH, 0).m20unboximpl(), small.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, null, rVar2, (29360128 & (i17 << 18)) | 3462, 306);
            if (t.k()) {
                t.n();
            }
            d0Var9 = d0Var1111;
            d0Var8 = d0Var1113;
            d0Var7 = d0Var1112;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            d0Var7 = d0Var4;
            d0Var8 = d0Var5;
            d0Var9 = d0Var6;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a60.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.i(small, urVar, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(i.Small small, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1587081986, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar.<anonymous> (SmallTopAppBar.kt:31)");
            }
            Label title = small.getTitle();
            if (title == null) {
                rVar.X(1759483078);
                rVar.R();
            } else {
                rVar.X(1759483079);
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                h.g(null, null, title, title, null, aVar.a(rVar, i16).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, small.getAccessibilityReadMode(), rVar, 0, 1597440, MLKEMEngine.KyberPolyBytes, 11976659);
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
    public static final i0 g(i.Small small, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(238948416, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar.<anonymous> (SmallTopAppBar.kt:45)");
            }
            x50.h.h(small.getNavigationButtonData(), small.getMenuType() == null ? d0Var : null, small.getMenuType() == null ? d0Var2 : null, d0Var3, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i.Small small, d0 d0Var, d0 d0Var2, d0 d0Var3, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-688071625, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.small.SmallTopAppBar.<anonymous> (SmallTopAppBar.kt:52)");
            }
            x50.a menuType = small.getMenuType();
            if (small.getNavigationButtonData() != null) {
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
    public static final i0 i(i.Small small, ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        e(small, urVar, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
