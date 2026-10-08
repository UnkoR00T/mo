package i30;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import b1.k;
import b1.l;
import c5.h;
import d1.a3;
import d1.x;
import d40.i;
import er.p;
import f3.j;
import f3.m;
import l3.o;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import t70.y;
import w0.r1;
import y40.MenuData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li30/a;", "data", "", "invisibleToUser", "clearFocusOnClick", "Loq/i0;", "f", "(Li30/a;ZZLm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x022c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236  */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0251  */
    /* JADX WARN: Code duplicated, block: B:95:0x025c  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void f(final ButtonIconData buttonIconData, boolean z15, boolean z16, r rVar, final int i15, final int i16) {
        int i17;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        boolean z19;
        final boolean z25;
        final boolean z26;
        d5 d5VarM;
        boolean z27;
        final boolean z28;
        final Context context;
        final o oVar;
        Object objE;
        r.Companion companion;
        l lVar;
        Object objE2;
        final cx.a aVar;
        f6<Boolean> f6VarA;
        m mVarL;
        k70.a aVar2;
        int i25;
        boolean z29;
        boolean zG;
        Object objE3;
        boolean zG2;
        Object objE4;
        boolean z35;
        boolean zG3;
        Object objE5;
        er.a<androidx.compose.ui.node.c> aVarB;
        MenuData menuData;
        r rVarH = rVar.h(1173437255);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(buttonIconData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i26 = i16 & 2;
        if (i26 == 0) {
            if ((i15 & 48) == 0) {
                z17 = z15;
                i17 |= rVarH.a(z17) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i17 & 147) != 146) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i26 != 0) {
                        z27 = false;
                    } else {
                        z27 = z17;
                    }
                    if (i18 != 0) {
                        z28 = true;
                    } else {
                        z28 = z18;
                    }
                    if (t.k()) {
                        t.o(1173437255, i17, -1, "pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon (ButtonIcon.kt:41)");
                    }
                    context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                    oVar = (o) rVarH.N(g1.g());
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = k.a();
                        rVarH.v(objE);
                    }
                    lVar = (l) objE;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    f6VarA = b1.f.a(lVar, rVarH, 6);
                    mVarL = m.INSTANCE;
                    aVar2 = k70.a.f108864a;
                    i25 = k70.a.f108865b;
                    z29 = z27;
                    m mVarT = androidx.compose.foundation.layout.d.t(a3.l(mVarL, a3.e(aVar2.b(rVarH, i25).getZero())), aVar2.b(rVarH, i25).getSpacing300());
                    zG = rVarH.G(buttonIconData) | rVarH.G(context);
                    objE3 = rVarH.E();
                    if (zG || objE3 == companion.a()) {
                        objE3 = new er.l() { // from class: i30.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.g(buttonIconData, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    m mVarD = v.d(mVarT, false, (er.l) objE3, 1, null);
                    if (z29) {
                        rVarH.X(1131165661);
                        rVarH.R();
                    } else {
                        rVarH.X(1131223662);
                        zG2 = rVarH.G(buttonIconData);
                        objE4 = rVarH.E();
                        if (zG2 || objE4 == companion.a()) {
                            objE4 = new er.l() { // from class: i30.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h(buttonIconData, (i0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        m mVarA = k3.f.a(s.o(v.d(mVarL, false, (er.l) objE4, 1, null), f6VarA, h.j(aVar2.b(rVarH, i25).getSpacing150())), l1.h.i());
                        r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                        boolean zG4 = rVarH.G(aVar) | rVarH.G(buttonIconData);
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zG3 = zG4 | z35 | rVarH.G(oVar);
                        objE5 = rVarH.E();
                        if (zG3 || objE5 == companion.a()) {
                            objE5 = new er.a() { // from class: i30.d
                                @Override // er.a
                                public final Object a() {
                                    return g.i(aVar, buttonIconData, z28, oVar);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, false, null, null, (er.a) objE5, 28, null);
                        rVarH.R();
                    }
                    m mVarU = mVarD.u(mVarL);
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    m mVarE = j.e(rVarH, mVarU);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion2.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarI, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    x xVar = x.f39368a;
                    d40.h.f(null, new d40.b.C0864b(null, buttonIconData.getIconResId(), i.f.f39709e, buttonIconData.b(), null, null, 33, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                    menuData = buttonIconData.getMenuData();
                    if (menuData == null) {
                        rVarH.X(161474288);
                    } else {
                        rVarH.X(161474289);
                        y40.l.j(menuData, rVarH, 0);
                    }
                    rVarH.R();
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    z25 = z29;
                    z26 = z28;
                } else {
                    rVarH.O();
                    z25 = z17;
                    z26 = z18;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: i30.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.k(buttonIconData, z25, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z18 = z16;
            if ((i17 & 147) != 146) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i26 != 0) {
                    z27 = false;
                } else {
                    z27 = z17;
                }
                if (i18 != 0) {
                    z28 = true;
                } else {
                    z28 = z18;
                }
                if (t.k()) {
                    t.o(1173437255, i17, -1, "pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon (ButtonIcon.kt:41)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                oVar = (o) rVarH.N(g1.g());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                lVar = (l) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                f6VarA = b1.f.a(lVar, rVarH, 6);
                mVarL = m.INSTANCE;
                aVar2 = k70.a.f108864a;
                i25 = k70.a.f108865b;
                z29 = z27;
                m mVarT2 = androidx.compose.foundation.layout.d.t(a3.l(mVarL, a3.e(aVar2.b(rVarH, i25).getZero())), aVar2.b(rVarH, i25).getSpacing300());
                zG = rVarH.G(buttonIconData) | rVarH.G(context);
                objE3 = rVarH.E();
                if (zG) {
                    objE3 = new er.l() { // from class: i30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.g(buttonIconData, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: i30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.g(buttonIconData, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarD2 = v.d(mVarT2, false, (er.l) objE3, 1, null);
                if (z29) {
                    rVarH.X(1131165661);
                    rVarH.R();
                } else {
                    rVarH.X(1131223662);
                    zG2 = rVarH.G(buttonIconData);
                    objE4 = rVarH.E();
                    if (zG2) {
                        objE4 = new er.l() { // from class: i30.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h(buttonIconData, (i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new er.l() { // from class: i30.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h(buttonIconData, (i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    m mVarA2 = k3.f.a(s.o(v.d(mVarL, false, (er.l) objE4, 1, null), f6VarA, h.j(aVar2.b(rVarH, i25).getSpacing150())), l1.h.i());
                    r1 r1VarE2 = s.E(0.0f, rVarH, 0, 1);
                    boolean zG5 = rVarH.G(aVar) | rVarH.G(buttonIconData);
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zG3 = zG5 | z35 | rVarH.G(oVar);
                    objE5 = rVarH.E();
                    if (zG3) {
                        objE5 = new er.a() { // from class: i30.d
                            @Override // er.a
                            public final Object a() {
                                return g.i(aVar, buttonIconData, z28, oVar);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: i30.d
                            @Override // er.a
                            public final Object a() {
                                return g.i(aVar, buttonIconData, z28, oVar);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    mVarL = androidx.compose.foundation.b.l(mVarA2, lVar, r1VarE2, false, null, null, (er.a) objE5, 28, null);
                    rVarH.R();
                }
                m mVarU2 = mVarD2.u(mVarL);
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarU2);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                x xVar2 = x.f39368a;
                d40.h.f(null, new d40.b.C0864b(null, buttonIconData.getIconResId(), i.f.f39709e, buttonIconData.b(), null, null, 33, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                menuData = buttonIconData.getMenuData();
                if (menuData == null) {
                    rVarH.X(161474288);
                } else {
                    rVarH.X(161474289);
                    y40.l.j(menuData, rVarH, 0);
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z25 = z29;
                z26 = z28;
            } else {
                rVarH.O();
                z25 = z17;
                z26 = z18;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: i30.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.k(buttonIconData, z25, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z17 = z15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z18 = z16;
                if (rVarH.a(z18)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i17 & 147) != 146) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i26 != 0) {
                    z27 = false;
                } else {
                    z27 = z17;
                }
                if (i18 != 0) {
                    z28 = true;
                } else {
                    z28 = z18;
                }
                if (t.k()) {
                    t.o(1173437255, i17, -1, "pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon (ButtonIcon.kt:41)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                oVar = (o) rVarH.N(g1.g());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                lVar = (l) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                f6VarA = b1.f.a(lVar, rVarH, 6);
                mVarL = m.INSTANCE;
                aVar2 = k70.a.f108864a;
                i25 = k70.a.f108865b;
                z29 = z27;
                m mVarT3 = androidx.compose.foundation.layout.d.t(a3.l(mVarL, a3.e(aVar2.b(rVarH, i25).getZero())), aVar2.b(rVarH, i25).getSpacing300());
                zG = rVarH.G(buttonIconData) | rVarH.G(context);
                objE3 = rVarH.E();
                if (zG) {
                    objE3 = new er.l() { // from class: i30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.g(buttonIconData, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: i30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.g(buttonIconData, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarD3 = v.d(mVarT3, false, (er.l) objE3, 1, null);
                if (z29) {
                    rVarH.X(1131165661);
                    rVarH.R();
                } else {
                    rVarH.X(1131223662);
                    zG2 = rVarH.G(buttonIconData);
                    objE4 = rVarH.E();
                    if (zG2) {
                        objE4 = new er.l() { // from class: i30.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h(buttonIconData, (i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new er.l() { // from class: i30.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h(buttonIconData, (i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    m mVarA3 = k3.f.a(s.o(v.d(mVarL, false, (er.l) objE4, 1, null), f6VarA, h.j(aVar2.b(rVarH, i25).getSpacing150())), l1.h.i());
                    r1 r1VarE3 = s.E(0.0f, rVarH, 0, 1);
                    boolean zG6 = rVarH.G(aVar) | rVarH.G(buttonIconData);
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zG3 = zG6 | z35 | rVarH.G(oVar);
                    objE5 = rVarH.E();
                    if (zG3) {
                        objE5 = new er.a() { // from class: i30.d
                            @Override // er.a
                            public final Object a() {
                                return g.i(aVar, buttonIconData, z28, oVar);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: i30.d
                            @Override // er.a
                            public final Object a() {
                                return g.i(aVar, buttonIconData, z28, oVar);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    mVarL = androidx.compose.foundation.b.l(mVarA3, lVar, r1VarE3, false, null, null, (er.a) objE5, 28, null);
                    rVarH.R();
                }
                m mVarU3 = mVarD3.u(mVarL);
                w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                m mVarE3 = j.e(rVarH, mVarU3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI3, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                x xVar3 = x.f39368a;
                d40.h.f(null, new d40.b.C0864b(null, buttonIconData.getIconResId(), i.f.f39709e, buttonIconData.b(), null, null, 33, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                menuData = buttonIconData.getMenuData();
                if (menuData == null) {
                    rVarH.X(161474288);
                } else {
                    rVarH.X(161474289);
                    y40.l.j(menuData, rVarH, 0);
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z25 = z29;
                z26 = z28;
            } else {
                rVarH.O();
                z25 = z17;
                z26 = z18;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: i30.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.k(buttonIconData, z25, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z18 = z16;
        if ((i17 & 147) != 146) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            if (i26 != 0) {
                z27 = false;
            } else {
                z27 = z17;
            }
            if (i18 != 0) {
                z28 = true;
            } else {
                z28 = z18;
            }
            if (t.k()) {
                t.o(1173437255, i17, -1, "pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon (ButtonIcon.kt:41)");
            }
            context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            oVar = (o) rVarH.N(g1.g());
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            lVar = (l) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = s.I();
                rVarH.v(objE2);
            }
            aVar = (cx.a) objE2;
            f6VarA = b1.f.a(lVar, rVarH, 6);
            mVarL = m.INSTANCE;
            aVar2 = k70.a.f108864a;
            i25 = k70.a.f108865b;
            z29 = z27;
            m mVarT4 = androidx.compose.foundation.layout.d.t(a3.l(mVarL, a3.e(aVar2.b(rVarH, i25).getZero())), aVar2.b(rVarH, i25).getSpacing300());
            zG = rVarH.G(buttonIconData) | rVarH.G(context);
            objE3 = rVarH.E();
            if (zG) {
                objE3 = new er.l() { // from class: i30.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.g(buttonIconData, context, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: i30.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.g(buttonIconData, context, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarD4 = v.d(mVarT4, false, (er.l) objE3, 1, null);
            if (z29) {
                rVarH.X(1131165661);
                rVarH.R();
            } else {
                rVarH.X(1131223662);
                zG2 = rVarH.G(buttonIconData);
                objE4 = rVarH.E();
                if (zG2) {
                    objE4 = new er.l() { // from class: i30.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.h(buttonIconData, (i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new er.l() { // from class: i30.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.h(buttonIconData, (i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarA4 = k3.f.a(s.o(v.d(mVarL, false, (er.l) objE4, 1, null), f6VarA, h.j(aVar2.b(rVarH, i25).getSpacing150())), l1.h.i());
                r1 r1VarE4 = s.E(0.0f, rVarH, 0, 1);
                boolean zG7 = rVarH.G(aVar) | rVarH.G(buttonIconData);
                if ((i17 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zG3 = zG7 | z35 | rVarH.G(oVar);
                objE5 = rVarH.E();
                if (zG3) {
                    objE5 = new er.a() { // from class: i30.d
                        @Override // er.a
                        public final Object a() {
                            return g.i(aVar, buttonIconData, z28, oVar);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: i30.d
                        @Override // er.a
                        public final Object a() {
                            return g.i(aVar, buttonIconData, z28, oVar);
                        }
                    };
                    rVarH.v(objE5);
                }
                mVarL = androidx.compose.foundation.b.l(mVarA4, lVar, r1VarE4, false, null, null, (er.a) objE5, 28, null);
                rVarH.R();
            }
            m mVarU4 = mVarD4.u(mVarL);
            w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            m mVarE4 = j.e(rVarH, mVarU4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI4, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            x xVar4 = x.f39368a;
            d40.h.f(null, new d40.b.C0864b(null, buttonIconData.getIconResId(), i.f.f39709e, buttonIconData.b(), null, null, 33, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
            menuData = buttonIconData.getMenuData();
            if (menuData == null) {
                rVarH.X(161474288);
            } else {
                rVarH.X(161474289);
                y40.l.j(menuData, rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z25 = z29;
            z26 = z28;
        } else {
            rVarH.O();
            z25 = z17;
            z26 = z18;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: i30.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.k(buttonIconData, z25, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(ButtonIconData buttonIconData, Context context, i0 i0Var) {
        g0.a(i0Var, true);
        String testTag = buttonIconData.getTestTag();
        if (testTag == null) {
            testTag = y.a(Integer.valueOf(buttonIconData.getIconResId()), context);
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(ButtonIconData buttonIconData, i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.c0(i0Var, buttonIconData.getContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(cx.a aVar, final ButtonIconData buttonIconData, final boolean z15, final o oVar) {
        cx.a.a(aVar, 0L, new er.a() { // from class: i30.f
            @Override // er.a
            public final Object a() {
                return g.j(buttonIconData, z15, oVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(ButtonIconData buttonIconData, boolean z15, o oVar) {
        buttonIconData.e().a();
        if (z15) {
            oVar.B(true);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(ButtonIconData buttonIconData, boolean z15, boolean z16, int i15, int i16, r rVar, int i17) {
        f(buttonIconData, z15, z16, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
