package lb0;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Llb0/n;", "viewModel", "Loq/i0;", "B", "(Llb0/n;Lm2/r;I)V", "Llb0/n$a$d;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "hideSnackBar", "x", "(Llb0/n$a$d;Li70/p;Ler/a;Lm2/r;I)V", "Llb0/n$a$e;", "I", "(Llb0/n$a$e;Lm2/r;I)V", "Llb0/n$a$b$b;", "t", "(Llb0/n$a$b$b;Lm2/r;I)V", "Llb0/n$a$b$a;", "p", "(Llb0/n$a$b$a;Lm2/r;I)V", "Llb0/n$a$a;", "F", "(Llb0/n$a$a;Lm2/r;I)V", "Llb0/n$a;", "screenState", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, n.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((n) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(n.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        x(initialized, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void B(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2010130221);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2010130221, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceScreen (DrivingLicenceScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(nVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            n.a aVarC = C(f6VarC);
            if (fr.t.c(aVarC, n.a.c.f117526a)) {
                rVarH.X(1000152036);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarC instanceof n.a.Initialized) {
                rVarH.X(1000154407);
                n.a.Initialized initialized = (n.a.Initialized) aVarC;
                i70.p pVarD = D(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(nVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(nVar);
                    rVarH.v(objE);
                }
                x(initialized, pVarD, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            } else if (aVarC instanceof n.a.Error) {
                rVarH.X(1000160562);
                F((n.a.Error) aVarC, rVarH, 0);
                rVarH.R();
            } else if (aVarC instanceof n.a.InitializedInfoPage) {
                rVarH.X(1000163514);
                I((n.a.InitializedInfoPage) aVarC, rVarH, 0);
                rVarH.R();
            } else if (aVarC instanceof n.a.b.List) {
                rVarH.X(1000166496);
                t((n.a.b.List) aVarC, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarC instanceof n.a.b.Details)) {
                    rVarH.X(1000150020);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1000169763);
                p((n.a.b.Details) aVarC, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.E(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a C(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p D(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(n nVar, int i15, p076m2.r rVar, int i16) {
        B(nVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void F(final n.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(964383929);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(964383929, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.ErrorScreen (DrivingLicenceScreen.kt:147)");
            }
            error.getError().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lb0.p
                    @Override // er.a
                    public final Object a() {
                        return d0.G();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.H(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(n.a.Error error, int i15, p076m2.r rVar, int i16) {
        F(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void I(final n.a.InitializedInfoPage initializedInfoPage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1026222401);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initializedInfoPage) : rVarH.G(initializedInfoPage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1026222401, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.InitializedInfoPage (DrivingLicenceScreen.kt:85)");
            }
            rVar2 = rVarH;
            i50.s.r(initializedInfoPage.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1990597612, true, new er.q() { // from class: lb0.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.J(initializedInfoPage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.L(initializedInfoPage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final n.a.InitializedInfoPage initializedInfoPage, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1990597612, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.InitializedInfoPage.<anonymous> (DrivingLicenceScreen.kt:87)");
            }
            f3.m mVarS = t70.i.S(t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0), null, rVar, 0, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            s40.g.c(initializedInfoPage.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
            rVar.x();
            boolean zG = rVar.G(initializedInfoPage);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lb0.s
                    @Override // er.a
                    public final Object a() {
                        return d0.K(initializedInfoPage);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(n.a.InitializedInfoPage initializedInfoPage) {
        initializedInfoPage.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(n.a.InitializedInfoPage initializedInfoPage, int i15, p076m2.r rVar, int i16) {
        I(initializedInfoPage, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final n.a.b.Details details, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(205371187);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(details) : rVarH.G(details) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(205371187, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceHistoryDetails (DrivingLicenceScreen.kt:127)");
            }
            rVar2 = rVarH;
            i50.s.r(details.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-75658970, true, new er.q() { // from class: lb0.z
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.q(details, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.s(details, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final n.a.b.Details details, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-75658970, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceHistoryDetails.<anonymous> (DrivingLicenceScreen.kt:129)");
            }
            f3.m mVarS = t70.i.S(t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0), null, rVar, 0, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o20.i.p(details.getScreenData(), null, rVar, BaseDocumentData.f140741h, 2);
            rVar.x();
            boolean zG = rVar.G(details);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lb0.t
                    @Override // er.a
                    public final Object a() {
                        return d0.r(details);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(n.a.b.Details details) {
        details.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(n.a.b.Details details, int i15, p076m2.r rVar, int i16) {
        p(details, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final n.a.b.List list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1890868737);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(list) : rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1890868737, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceHistoryList (DrivingLicenceScreen.kt:106)");
            }
            rVar2 = rVarH;
            i50.s.r(list.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(394307122, true, new er.q() { // from class: lb0.b0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.u(list, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.w(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(final n.a.b.List list, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(394307122, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceHistoryList.<anonymous> (DrivingLicenceScreen.kt:108)");
            }
            f3.m mVarS = t70.i.S(t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0), null, rVar, 0, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.i.d(list.getDrivingLicences(), null, null, rVar, 0, 6);
            rVar.x();
            boolean zG = rVar.G(list);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lb0.r
                    @Override // er.a
                    public final Object a() {
                        return d0.v(list);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(n.a.b.List list) {
        list.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(n.a.b.List list, int i15, p076m2.r rVar, int i16) {
        t(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(final n.a.Initialized initialized, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1747867432);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1747867432, i16, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceInitializedContent (DrivingLicenceScreen.kt:58)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(-1303714830, true, new er.p() { // from class: lb0.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.y(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(800169243, true, new er.q() { // from class: lb0.x
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.z(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-1464093679);
            } else {
                rVarH.X(368413168);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lb0.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.A(initialized, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1303714830, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceInitializedContent.<anonymous> (DrivingLicenceScreen.kt:68)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(n.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(800169243, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.screen.DrivingLicenceInitializedContent.<anonymous> (DrivingLicenceScreen.kt:71)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            o20.i.m(initialized.getScreenData(), rVar, BaseDocumentData.f140741h);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
