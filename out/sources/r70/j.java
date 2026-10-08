package r70;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import er.p;
import f3.m;
import l3.d0;
import l3.y;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.C6459rc;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr70/a;", "data", "", "isExpanded", "Ll3/d0;", "previousFocusRequester", "Loq/i0;", "i", "(Lr70/a;ZLl3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f172275a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(725284969);
            if (t.k()) {
                t.o(725284969, i15, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton.<anonymous>.<anonymous> (BaseFloatingActionButton.kt:63)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f172276a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1336596333);
            if (t.k()) {
                t.o(1336596333, i15, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton.<anonymous>.<anonymous> (BaseFloatingActionButton.kt:83)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:109:0x0232  */
    /* JADX WARN: Code duplicated, block: B:111:0x0237  */
    /* JADX WARN: Code duplicated, block: B:113:0x0246  */
    /* JADX WARN: Code duplicated, block: B:116:0x0250  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0105  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    public static final void i(final BaseFloatingActionButtonData baseFloatingActionButtonData, final boolean z15, d0 d0Var, r rVar, final int i15, final int i16) {
        int i17;
        d0 d0Var2;
        boolean z16;
        final d0 d0Var3;
        d5 d5VarM;
        final d0 d0Var4;
        Object objE;
        r.Companion companion;
        l lVar;
        f6<Boolean> f6VarA;
        k70.a aVar;
        int i18;
        float spacing200;
        BaseFloatingActionButtonData.InterfaceC4389a fabType;
        final d0 d0Var5;
        m.Companion companion2;
        m mVarA;
        boolean z17;
        Object objE2;
        d0 d0Var6;
        boolean z18;
        Object objE3;
        m mVarA2;
        boolean z19;
        Object objE4;
        boolean z25;
        Object objE5;
        r rVarH = rVar.h(-450150422);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(baseFloatingActionButtonData) : rVarH.G(baseFloatingActionButtonData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                d0Var2 = d0Var;
                i17 |= rVarH.W(d0Var2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i19 != 0) {
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (t.k()) {
                    t.o(-450150422, i17, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton (BaseFloatingActionButton.kt:30)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                lVar = (l) objE;
                f6VarA = b1.f.a(lVar, rVarH, 6);
                aVar = k70.a.f108864a;
                i18 = k70.a.f108865b;
                spacing200 = aVar.b(rVarH, i18).getSpacing200();
                fabType = baseFloatingActionButtonData.getFabType();
                if (fabType instanceof BaseFloatingActionButtonData.InterfaceC4389a.Icon) {
                    rVarH.X(-1542899081);
                    mVarA2 = m.INSTANCE;
                    if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(baseFloatingActionButtonData))) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE4 = rVarH.E();
                    if (z19 || objE4 == companion.a()) {
                        objE4 = new er.l() { // from class: r70.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(baseFloatingActionButtonData, (i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    m mVarW = s.w(v.a(mVarA2, (er.l) objE4), f6VarA, spacing200, 0.0f, 4, null);
                    if (d0Var4 != null) {
                        rVarH.X(-1542572000);
                        if ((i17 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objE5 = rVarH.E();
                        if (z25 || objE5 == companion.a()) {
                            objE5 = new er.l() { // from class: r70.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.k(d0Var4, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        mVarA2 = y.a(mVarA2, (er.l) objE5);
                        rVarH.R();
                    } else {
                        rVarH.X(-1542480426);
                        rVarH.R();
                    }
                    m mVarU = mVarW.u(mVarA2);
                    y2 radius200 = aVar.e(rVarH, i18).getRadius200();
                    long primary = aVar.a(rVarH, i18).getBase().getPrimary();
                    d0Var6 = d0Var4;
                    C6459rc.o(baseFloatingActionButtonData.c(), mVarU, radius200, primary, 0L, null, lVar, y2.m.d(463730864, true, new p() { // from class: r70.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.l(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 14155776, 48);
                    rVarH.R();
                } else {
                    d0Var5 = d0Var4;
                    if (fabType instanceof BaseFloatingActionButtonData.InterfaceC4389a.Extended) {
                        rVarH.X(1197154090);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1541884389);
                    companion2 = m.INSTANCE;
                    if (d0Var5 != null) {
                        rVarH.X(-1541321088);
                        if ((i17 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objE3 = rVarH.E();
                        if (z18 || objE3 == companion.a()) {
                            objE3 = new er.l() { // from class: r70.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.m(d0Var5, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        mVarA = y.a(companion2, (er.l) objE3);
                        rVarH.R();
                    } else {
                        rVarH.X(-1541229514);
                        rVarH.R();
                        mVarA = companion2;
                    }
                    m mVarU2 = companion2.u(mVarA);
                    if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(baseFloatingActionButtonData))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17 || objE2 == companion.a()) {
                        objE2 = new er.l() { // from class: r70.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.n(baseFloatingActionButtonData, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarW2 = s.w(v.a(mVarU2, (er.l) objE2), f6VarA, spacing200, 0.0f, 4, null);
                    y2 radius201 = aVar.e(rVarH, i18).getRadius200();
                    long primary2 = aVar.a(rVarH, i18).getBase().getPrimary();
                    d0Var6 = d0Var5;
                    C6459rc.j(y2.m.d(-172422827, true, new p() { // from class: r70.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.o(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), y2.m.d(-599692556, true, new p() { // from class: r70.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.p(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), baseFloatingActionButtonData.c(), mVarW2, z15, radius201, primary2, 0L, null, lVar, rVarH, ((i17 << 9) & 57344) | 805306422, MLKEMEngine.KyberPolyBytes);
                    rVarH = rVarH;
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                d0Var3 = d0Var6;
            } else {
                rVarH.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: r70.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.q(baseFloatingActionButtonData, z15, d0Var3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        d0Var2 = d0Var;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            if (i19 != 0) {
                d0Var4 = null;
            } else {
                d0Var4 = d0Var2;
            }
            if (t.k()) {
                t.o(-450150422, i17, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton (BaseFloatingActionButton.kt:30)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            lVar = (l) objE;
            f6VarA = b1.f.a(lVar, rVarH, 6);
            aVar = k70.a.f108864a;
            i18 = k70.a.f108865b;
            spacing200 = aVar.b(rVarH, i18).getSpacing200();
            fabType = baseFloatingActionButtonData.getFabType();
            if (fabType instanceof BaseFloatingActionButtonData.InterfaceC4389a.Icon) {
                rVarH.X(-1542899081);
                mVarA2 = m.INSTANCE;
                if ((i17 & 14) != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objE4 = rVarH.E();
                if (z19) {
                    objE4 = new er.l() { // from class: r70.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.j(baseFloatingActionButtonData, (i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new er.l() { // from class: r70.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.j(baseFloatingActionButtonData, (i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarW3 = s.w(v.a(mVarA2, (er.l) objE4), f6VarA, spacing200, 0.0f, 4, null);
                if (d0Var4 != null) {
                    rVarH.X(-1542572000);
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objE5 = rVarH.E();
                    if (z25) {
                        objE5 = new er.l() { // from class: r70.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.k(d0Var4, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.l() { // from class: r70.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.k(d0Var4, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    mVarA2 = y.a(mVarA2, (er.l) objE5);
                    rVarH.R();
                } else {
                    rVarH.X(-1542480426);
                    rVarH.R();
                }
                m mVarU3 = mVarW3.u(mVarA2);
                y2 radius202 = aVar.e(rVarH, i18).getRadius200();
                long primary3 = aVar.a(rVarH, i18).getBase().getPrimary();
                d0Var6 = d0Var4;
                C6459rc.o(baseFloatingActionButtonData.c(), mVarU3, radius202, primary3, 0L, null, lVar, y2.m.d(463730864, true, new p() { // from class: r70.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.l(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 14155776, 48);
                rVarH.R();
            } else {
                d0Var5 = d0Var4;
                if (fabType instanceof BaseFloatingActionButtonData.InterfaceC4389a.Extended) {
                    rVarH.X(1197154090);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1541884389);
                companion2 = m.INSTANCE;
                if (d0Var5 != null) {
                    rVarH.X(-1541321088);
                    if ((i17 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = new er.l() { // from class: r70.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.m(d0Var5, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: r70.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.m(d0Var5, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    mVarA = y.a(companion2, (er.l) objE3);
                    rVarH.R();
                } else {
                    rVarH.X(-1541229514);
                    rVarH.R();
                    mVarA = companion2;
                }
                m mVarU4 = companion2.u(mVarA);
                if ((i17 & 14) != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = new er.l() { // from class: r70.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.n(baseFloatingActionButtonData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: r70.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.n(baseFloatingActionButtonData, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarW4 = s.w(v.a(mVarU4, (er.l) objE2), f6VarA, spacing200, 0.0f, 4, null);
                y2 radius203 = aVar.e(rVarH, i18).getRadius200();
                long primary4 = aVar.a(rVarH, i18).getBase().getPrimary();
                d0Var6 = d0Var5;
                C6459rc.j(y2.m.d(-172422827, true, new p() { // from class: r70.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.o(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(-599692556, true, new p() { // from class: r70.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.p(baseFloatingActionButtonData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), baseFloatingActionButtonData.c(), mVarW4, z15, radius203, primary4, 0L, null, lVar, rVarH, ((i17 << 9) & 57344) | 805306422, MLKEMEngine.KyberPolyBytes);
                rVarH = rVarH;
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
            d0Var3 = d0Var6;
        } else {
            rVarH.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: r70.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.q(baseFloatingActionButtonData, z15, d0Var3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(BaseFloatingActionButtonData baseFloatingActionButtonData, i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.c0(i0Var, ((BaseFloatingActionButtonData.InterfaceC4389a.Icon) baseFloatingActionButtonData.getFabType()).getContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(BaseFloatingActionButtonData baseFloatingActionButtonData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(463730864, i15, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton.<anonymous> (BaseFloatingActionButton.kt:58)");
            }
            d40.h.f(null, new d40.b.C0864b(null, baseFloatingActionButtonData.getIconResId(), d40.i.f.f39709e, a.f172275a, null, null, 33, null), false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(BaseFloatingActionButtonData baseFloatingActionButtonData, i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.c0(i0Var, ((BaseFloatingActionButtonData.InterfaceC4389a.Extended) baseFloatingActionButtonData.getFabType()).getLabel().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(BaseFloatingActionButtonData baseFloatingActionButtonData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-172422827, i15, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton.<anonymous> (BaseFloatingActionButton.kt:71)");
            }
            Label label = ((BaseFloatingActionButtonData.InterfaceC4389a.Extended) baseFloatingActionButtonData.getFabType()).getLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(BaseFloatingActionButtonData baseFloatingActionButtonData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-599692556, i15, -1, "pl.gov.coi.common.ui.unmapped.fab.BaseFloatingActionButton.<anonymous> (BaseFloatingActionButton.kt:78)");
            }
            d40.h.f(null, new d40.b.C0864b(null, baseFloatingActionButtonData.getIconResId(), d40.i.f.f39709e, b.f172276a, null, null, 33, null), false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(BaseFloatingActionButtonData baseFloatingActionButtonData, boolean z15, d0 d0Var, int i15, int i16, r rVar, int i17) {
        i(baseFloatingActionButtonData, z15, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
