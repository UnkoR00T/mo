package q11;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import i50.BaseScaffoldData;
import java.util.List;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lq11/c;", "viewModel", "Loq/i0;", "p", "(Lq11/c;Lm2/r;I)V", "Lq11/c$a$c;", "state", "l", "(Lq11/c$a$c;Lm2/r;I)V", "Lq11/c$a$a;", "y", "(Lq11/c$a$a;Lm2/r;I)V", "Lq11/c$a;", "screenState", "Li70/p;", "snackBarState", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f163727a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f163728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f163729b;

        public b(er.l lVar, List list) {
            this.f163728a = lVar;
            this.f163729b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f163728a.b(this.f163729b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f163730a;

        public c(List list) {
            this.f163730a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f163730a.get(i15);
            rVar.X(796734725);
            n50.h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<oq.i0> {
        d(Object obj) {
            super(0, obj, q11.c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((q11.c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(q11.c.a.Error error, int i15, p076m2.r rVar, int i16) {
        y(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final q11.c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1443426273);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1443426273, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesDataLoaded (CertificatesScreen.kt:97)");
            }
            i50.s.r(initialized.getScreenModel().getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-512012718, true, new er.q() { // from class: q11.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            f20.d.d(initialized.getScreenModel().getBottomSheetVisible(), initialized.getScreenModel().e(), rVarH, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q11.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(final q11.c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-512012718, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesDataLoaded.<anonymous> (CertificatesScreen.kt:101)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            y30.m.g(initialized.getScreenModel().getControllersData(), rVar, y30.n.Switch.f223693f);
            rVar.x();
            if (initialized.getScreenModel().getTopAlert().getIsVisible()) {
                rVar.X(-756147291);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                c30.e.c(null, initialized.getScreenModel().getTopAlert().getAlertData(), rVar, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            } else {
                rVar.X(-760379194);
            }
            rVar.R();
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i17).getSpacing200());
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: q11.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.n(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 491);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(q11.c.a.Initialized initialized, f1.q0 q0Var) {
        List<n50.k> listA = initialized.a();
        q0Var.j(listA.size(), null, new b(a.f163727a, listA), y2.m.b(802480018, true, new c(listA)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(q11.c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final q11.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        boolean z15;
        p076m2.r rVarH = rVar.h(588129260);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z16 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(588129260, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesScreen (CertificatesScreen.kt:39)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            p076m2.r rVar3 = rVarH;
            Object objE = rVar3.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVar3.v(objE);
            }
            al alVar = (al) objE;
            final q11.c.a aVarQ = q(f6VarC);
            if (fr.t.c(aVarQ, q11.c.a.b.f163600a)) {
                rVar3.X(-1743451376);
                rVar3.R();
                z15 = true;
            } else if (aVarQ instanceof q11.c.a.Initialized) {
                rVar3.X(1787671040);
                g30.v vVar = ((q11.c.a.Initialized) aVarQ).getScreenModel().getBottomSheetVisible() ? g30.v.EXPANDED : g30.v.HIDDEN;
                boolean zG = rVar3.G(aVarQ);
                Object objE2 = rVar3.E();
                if (zG || objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: q11.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t.s(aVarQ, (g30.v) obj);
                        }
                    };
                    rVar3.v(objE2);
                }
                ModalSheetState modalSheetState = new ModalSheetState(vVar, true, (er.l) objE2);
                boolean zG2 = rVar3.G(aVarQ);
                Object objE3 = rVar3.E();
                if (zG2 || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: q11.p
                        @Override // er.a
                        public final Object a() {
                            return t.t(aVarQ);
                        }
                    };
                    rVar3.v(objE3);
                }
                z15 = true;
                g30.t.f(new ModalBottomSheetData(modalSheetState, null, (er.a) objE3, null, 10, null), k70.a.f108864a.b(rVar3, k70.a.f108865b).getZero(), false, null, null, y2.m.d(-1146818830, true, new er.p() { // from class: q11.q
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.u(aVarQ, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), y2.m.d(-1820885615, true, new er.p() { // from class: q11.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.v(aVarQ, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), rVar3, 1769472 | ModalBottomSheetData.f70192e, 28);
                rVar3 = rVar3;
                boolean zG3 = rVar3.G(aVarQ);
                Object objE4 = rVar3.E();
                if (zG3 || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: q11.s
                        @Override // er.a
                        public final Object a() {
                            return t.w(aVarQ);
                        }
                    };
                    rVar3.v(objE4);
                }
                p088nul.q0.g(false, (er.a) objE4, rVar3, 0, 1);
                rVar3.R();
            } else {
                z15 = true;
                if (!(aVarQ instanceof q11.c.a.Error)) {
                    rVar3.X(-1743452495);
                    rVar3.R();
                    throw new oq.p();
                }
                rVar3.X(-1743412602);
                y((q11.c.a.Error) aVarQ, rVar3, 0);
                rVar3.R();
            }
            i70.p pVarR = r(f6VarB);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVar3.G(cVar))) {
                z16 = z15;
            }
            Object objE5 = rVar3.E();
            if (z16 || objE5 == companion.a()) {
                objE5 = new d(cVar);
                rVar3.v(objE5);
            }
            p076m2.r rVar4 = rVar3;
            i70.m.d(alVar, pVarR, (er.a) ((mr.g) objE5), null, null, rVar4, 6, 24);
            rVar2 = rVar4;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q11.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.x(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final q11.c.a q(f6<? extends q11.c.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(q11.c.a aVar, g30.v vVar) {
        if (vVar == g30.v.HIDDEN) {
            ((q11.c.a.Initialized) aVar).getScreenModel().e().a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(q11.c.a aVar) {
        ((q11.c.a.Initialized) aVar).getScreenModel().e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(q11.c.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1146818830, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesScreen.<anonymous> (CertificatesScreen.kt:65)");
            }
            q11.c.a.Initialized initialized = (q11.c.a.Initialized) aVar;
            h.j(initialized.getScreenModel().getInfotipModel(), initialized.getScreenModel().e(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(q11.c.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1820885615, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.CertificatesScreen.<anonymous> (CertificatesScreen.kt:72)");
            }
            l((q11.c.a.Initialized) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(q11.c.a aVar) {
        q11.c.a.Initialized initialized = (q11.c.a.Initialized) aVar;
        if (initialized.getScreenModel().getBottomSheetVisible()) {
            initialized.getScreenModel().e().a();
        } else {
            initialized.getScreenModel().d().a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(q11.c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void y(final q11.c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1156813344);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1156813344, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.certificates.ErrorScreen (CertificatesScreen.kt:144)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: q11.i
                    @Override // er.a
                    public final Object a() {
                        return t.z();
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
            d5VarM.a(new er.p() { // from class: q11.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.A(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z() {
        return oq.i0.f148189a;
    }
}
