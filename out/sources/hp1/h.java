package hp1;

import androidx.p016lifecycle.y0;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
import fr.q;
import fr.q0;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p7.CreationExtras;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\n\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhp1/i;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "close", "o", "(Lhp1/i;Ler/a;Lm2/r;II)V", "Lkotlin/Function1;", "Lp50/a;", "showSnackBar", "h", "(Ler/l;Ler/a;Lm2/r;II)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.l<p50.a, i0> {
        a(Object obj) {
            super(1, obj, i.class, "showSnackBar", "showSnackBar(Lpl/gov/coi/common/ui/ds/snackbar/SnackBarData;)V", 0);
        }

        public final void E(p50.a aVar) {
            ((i) this.f66391b).y(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p50.a aVar) {
            E(aVar);
            return i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void h(er.l<? super p50.a, i0> lVar, er.a<i0> aVar, r rVar, final int i15, final int i16) {
        er.l<? super p50.a, i0> lVar2;
        int i17;
        final er.a<i0> aVar2;
        boolean z15;
        r rVar2;
        final er.l<? super p50.a, i0> lVar3;
        d5 d5VarM;
        final er.l<? super p50.a, i0> lVar4;
        er.a<i0> aVar3;
        Object objE;
        Object objE2;
        r rVarH = rVar.h(50441811);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            lVar2 = lVar;
        } else if ((i15 & 6) == 0) {
            lVar2 = lVar;
            i17 = (rVarH.G(lVar2) ? 4 : 2) | i15;
        } else {
            lVar2 = lVar;
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.l() { // from class: hp1.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.i((p50.a) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    lVar4 = (er.l) objE2;
                } else {
                    lVar4 = lVar2;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: hp1.b
                            @Override // er.a
                            public final Object a() {
                                return h.j();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar3 = (er.a) objE;
                } else {
                    aVar3 = aVar2;
                }
                if (t.k()) {
                    t.o(50441811, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.snackBar.DeveloperSnackBarContent (DeveloperSnackBarScreen.kt:40)");
                }
                lVar3 = lVar4;
                er.a<i0> aVar4 = aVar3;
                rVar2 = rVarH;
                s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar3), mx.b.b("SnackBarScreen", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1946466688, true, new er.q() { // from class: hp1.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return h.k(lVar4, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
                if (t.k()) {
                    t.n();
                }
                aVar2 = aVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar3 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: hp1.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.n(lVar3, aVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        aVar2 = aVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: hp1.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.i((p50.a) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                lVar4 = (er.l) objE2;
            } else {
                lVar4 = lVar2;
            }
            if (i19 != 0) {
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: hp1.b
                        @Override // er.a
                        public final Object a() {
                            return h.j();
                        }
                    };
                    rVarH.v(objE);
                }
                aVar3 = (er.a) objE;
            } else {
                aVar3 = aVar2;
            }
            if (t.k()) {
                t.o(50441811, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.snackBar.DeveloperSnackBarContent (DeveloperSnackBarScreen.kt:40)");
            }
            lVar3 = lVar4;
            er.a<i0> aVar5 = aVar3;
            rVar2 = rVarH;
            s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar3), mx.b.b("SnackBarScreen", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1946466688, true, new er.q() { // from class: hp1.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.k(lVar4, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
            aVar2 = aVar5;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            lVar3 = lVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: hp1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.n(lVar3, aVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(p50.a aVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final er.l lVar, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1946466688, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.snackBar.DeveloperSnackBarContent.<anonymous> (DeveloperSnackBarScreen.kt:52)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(mVarL, aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.k(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar2 = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(mx.b.b("Show SnackBar", ""), null, 2, null);
            boolean zW = rVar.W(lVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: hp1.e
                    @Override // er.a
                    public final Object a() {
                        return h.l(lVar);
                    }
                };
                rVar.v(objE);
            }
            h30.q.p(new ButtonData(null, null, large, withText, aVar2, null, (er.a) objE, 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            k30.a.Large large2 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText2 = new k30.c.WithText(mx.b.b("Show Multi Line SnackBar", ""), null, 2, null);
            boolean zW2 = rVar.W(lVar);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: hp1.f
                    @Override // er.a
                    public final Object a() {
                        return h.m(lVar);
                    }
                };
                rVar.v(objE2);
            }
            h30.q.p(new ButtonData(null, null, large2, withText2, aVar2, null, (er.a) objE2, 35, null), false, null, rVar, 0, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.l lVar) {
        lVar.b(new p50.a.DefaultWithIcon(new Label("SnackBar message", "TAG_L"), false, null, null, 14, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.l lVar) {
        lVar.b(new p50.a.DefaultWithIcon(new Label("Very long multi line\nSnackBar message", "TAG_T"), false, null, null, 14, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(er.l lVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        h(lVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public static final void o(i iVar, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        final i iVar2 = iVar;
        r rVarH = rVar.h(1727623084);
        if ((i15 & 6) == 0) {
            if ((i16 & 1) != 0) {
                i18 = 2;
            } else {
                if ((i15 & 8) == 0 ? rVarH.W(iVar2) : rVarH.G(iVar2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
            }
            i17 = i18 | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i19 = i17;
        boolean z15 = true;
        if (rVarH.r((i19 & 19) != 18, i19 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 1) != 0) {
                    i19 &= -15;
                }
            } else if ((i16 & 1) != 0) {
                y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
                if (y0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                iVar2 = (i) q7.d.c(q0.c(j.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
                i19 &= -15;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1727623084, i19, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.snackBar.DeveloperSnackBarScreen (DeveloperSnackBarScreen.kt:29)");
            }
            if ((((i19 & 14) ^ 6) <= 4 || !rVarH.G(iVar2)) && (i19 & 6) != 4) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new a(iVar2);
                rVarH.v(objE);
            }
            h((er.l) ((mr.g) objE), aVar, rVarH, i19 & 112, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: hp1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.p(iVar2, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(i iVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        o(iVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
