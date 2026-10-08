package ei1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import f1.y0;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardConfig;
import n50.SingleCardLabel;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import p144z20.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lei1/c;", "viewModel", "Loq/i0;", "p", "(Lei1/c;Lm2/r;I)V", "Lei1/c$a;", "data", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51625a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-431895813);
            if (p076m2.t.k()) {
                p076m2.t.o(-431895813, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:169)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DashboardServiceEntry f51626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f6<ei1.c.Data> f51627b;

        b(DashboardServiceEntry dashboardServiceEntry, f6<ei1.c.Data> f6Var) {
            this.f51626a = dashboardServiceEntry;
            this.f51627b = f6Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            s.q(this.f51627b).getScreenState().getOtherServiceSection().a().b(this.f51626a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f51628a = new c();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(DashboardServiceEntry dashboardServiceEntry) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f51629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f51630b;

        public d(er.l lVar, List list) {
            this.f51629a = lVar;
            this.f51630b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f51629a.b(this.f51630b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f51631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f6 f51632b;

        public e(List list, f6 f6Var) {
            this.f51631a = list;
            this.f51632b = f6Var;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
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
            DashboardServiceEntry dashboardServiceEntry = (DashboardServiceEntry) this.f51631a.get(i15);
            rVar.X(2052507934);
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(dashboardServiceEntry.getName(), mx.b.c(dashboardServiceEntry.getType().name()) + "Tag"), mx.b.b(s.q(this.f51632b).getScreenState().getAddServiceContentDescription() + ' ' + dashboardServiceEntry.getName(), ""), null, 0, 0, null, 60, null)), null, 5, null);
            int i18 = jz.a.f106904y1;
            Label labelB = mx.b.b(s.q(this.f51632b).getScreenState().getAddServiceContentDescription() + ' ' + dashboardServiceEntry.getName(), "");
            a aVar = a.f51625a;
            boolean zW = rVar.W(this.f51632b) | rVar.G(dashboardServiceEntry);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(dashboardServiceEntry, this.f51632b);
                rVar.v(objE);
            }
            n50.h0.v(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, new LeadingSection(false, new n50.d.IconButton(new ButtonIconData(null, i18, aVar, null, labelB, (er.a) objE, 9, null)), null, 5, null), null, null, 3327, null), null, rVar, 0, 2);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final f6 f6Var, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1621732358, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:125)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-2022626009, true, new er.p() { // from class: ei1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.B(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2022626009, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:126)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.n(mVarH, aVar.b(rVar, i16).getSpacing100()), null, q(f6Var).getScreenState().getUserServiceSection().getEmptyFavouritesLabel(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026010);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(f6 f6Var, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1043350403, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:140)");
            }
            Label otherServiceListHeader = q(f6Var).getScreenState().getOtherServiceSection().getOtherServiceListHeader();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, aVar.b(rVar, i16).getSpacing100(), 5, null), null, otherServiceListHeader, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final f6 f6Var, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2063090493, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:180)");
            }
            x30.c.c(null, 0.0f, y2.m.d(233046046, true, new er.p() { // from class: ei1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.E(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(233046046, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:181)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.n(mVarH, aVar.b(rVar, i16).getSpacing100()), null, q(f6Var).getScreenState().getUserServiceSection().getEmptyAllServicesLabel(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026010);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(ei1.c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final ei1.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1938842995);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1938842995, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent (ServicesFavouritesScreen.kt:46)");
            }
            final f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(cVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ei1.d
                    @Override // er.a
                    public final Object a() {
                        return s.r(cVar);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(q(f6VarC).getScreenState().getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1262430394, true, new er.q() { // from class: ei1.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.s(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ei1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.F(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ei1.c.Data q(f6<ei1.c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(ei1.c cVar) {
        cVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1262430394, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous> (ServicesFavouritesScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.r(companion, 0.0f, d3Var2.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            boolean zW = rVar.W(f6Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: ei1.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.t(f6Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVar.v(objE);
            }
            final p144z20.c cVarA = Function2.a((er.p) objE, rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i17).getSpacing100());
            d3 d3VarG = a3.g(0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null);
            f3.m mVarG = t70.s.G(a3.p(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), cVarA, rVar, p144z20.c.f232335g << 3);
            y0 lazyListState = cVarA.getLazyListState();
            boolean zW2 = rVar.W(f6Var) | rVar.G(cVarA);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: ei1.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.u(cVarA, f6Var, (f1.q0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f1.d.c(mVarG, lazyListState, d3VarG, false, fVarR, null, null, false, null, (er.l) objE2, rVar, 0, 488);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(f6 f6Var, int i15, int i16) {
        q(f6Var).getScreenState().d().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final p144z20.c cVar, final f6 f6Var, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(1532444485, true, new er.q() { // from class: ei1.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.v(f6Var, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(-2138176836, true, new er.q() { // from class: ei1.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.w(f6Var, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (!q(f6Var).getScreenState().getUserServiceSection().c().isEmpty()) {
            p144z20.b.b(q0Var, q(f6Var).getScreenState().getUserServiceSection().c(), y2.m.b(1843154077, true, new er.r() { // from class: ei1.p
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return s.x(cVar, f6Var, (f3.m) obj, (DefaultSingleCardData) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), cVar, new er.l() { // from class: ei1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return s.z((DefaultSingleCardData) obj);
                }
            });
        } else {
            f1.q0.c(q0Var, null, null, y2.m.b(1621732358, true, new er.q() { // from class: ei1.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.A(f6Var, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        f1.q0.c(q0Var, null, null, y2.m.b(-1043350403, true, new er.q() { // from class: ei1.e
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.C(f6Var, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (!q(f6Var).getScreenState().getOtherServiceSection().b().isEmpty()) {
            List<DashboardServiceEntry> listB = q(f6Var).getScreenState().getOtherServiceSection().b();
            q0Var.j(listB.size(), null, new d(c.f51628a, listB), y2.m.b(802480018, true, new e(listB, f6Var)));
        } else {
            f1.q0.c(q0Var, null, null, y2.m.b(2063090493, true, new er.q() { // from class: ei1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.D(f6Var, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(f6 f6Var, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1532444485, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:77)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, q(f6Var).getScreenState().getInfoLabel(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(f6 f6Var, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2138176836, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:85)");
            }
            Label userServiceListHeader = q(f6Var).getScreenState().getUserServiceSection().getUserServiceListHeader();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.p(f3.m.INSTANCE, 0.0f, aVar.b(rVar, i16).getSpacing200(), 1, null), null, userServiceListHeader, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(p144z20.c cVar, final f6 f6Var, f3.m mVar, DefaultSingleCardData defaultSingleCardData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(mVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVar.W(defaultSingleCardData) ? 32 : 16;
        }
        int i17 = i16;
        if (rVar.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1843154077, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.favourites.ServicesFavouritesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServicesFavouritesScreen.kt:99)");
            }
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVar);
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
            f3.m.Companion companion2 = f3.m.INSTANCE;
            int iIndexOf = q(f6Var).getScreenState().getUserServiceSection().c().indexOf(defaultSingleCardData);
            int size = q(f6Var).getScreenState().getUserServiceSection().c().size();
            boolean z15 = cVar.c() != null;
            String text = fi1.c.a(defaultSingleCardData).getText();
            boolean zW = rVar.W(f6Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: ei1.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.y(f6Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVar.v(objE);
            }
            n50.h0.v(defaultSingleCardData, new SingleCardConfig(t70.i.m(companion2, iIndexOf, size, z15, text, (er.p) objE, rVar, 6), false, 2, null), rVar, ((i17 >> 3) & 14) | (SingleCardConfig.f132071c << 3), 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(f6 f6Var, int i15, int i16) {
        q(f6Var).getScreenState().d().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object z(DefaultSingleCardData defaultSingleCardData) {
        return fi1.c.a(defaultSingleCardData).getText();
    }
}
