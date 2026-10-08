package uy0;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u4.FontWeight;
import wy0.AirQualityRating;
import wy0.PmIndicatorTable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Luy0/e;", "viewModel", "Loq/i0;", "p", "(Luy0/e;Lm2/r;I)V", "Luy0/e$a$b;", "data", "j", "(Luy0/e$a$b;Lm2/r;I)V", "Lf1/q0;", "Lwy0/d;", "x", "(Lf1/q0;Lwy0/d;)V", "s", "(Lwy0/d;Lm2/r;I)V", "Lwy0/a;", "ratingData", "u", "(Lwy0/a;Lm2/r;I)V", "Luy0/e$a;", "state", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202189a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(AirQualityRating airQualityRating) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f202190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f202191b;

        public b(er.l lVar, List list) {
            this.f202190a = lVar;
            this.f202191b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f202190a.b(this.f202191b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f202192a;

        public c(List list) {
            this.f202192a = list;
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
            AirQualityRating airQualityRating = (AirQualityRating) this.f202192a.get(i15);
            rVar.X(1551655823);
            f3.m.Companion companion = f3.m.INSTANCE;
            vb.h(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 0.0f, 0L, rVar, 6, 6);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            o.u(airQualityRating, rVar, d40.b.f39676g);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
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

    public static final void j(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-867439068);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-867439068, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.LegendInitialized (LegendScreen.kt:42)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-721318191, true, new er.q() { // from class: uy0.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.k(y0VarC, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32702);
            rVarH = rVarH;
            q0.g(false, initialized.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uy0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(y0 y0Var, final e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-721318191, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.LegendInitialized.<anonymous> (LegendScreen.kt:48)");
            }
            f3.m mVarP = a3.p(a3.l(f3.m.INSTANCE, d3Var), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: uy0.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.l(initialized, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarP, y0Var, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 508);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final e.a.Initialized initialized, f1.q0 q0Var) {
        PmIndicatorTable pmIndicatorTable = initialized.getPmIndicatorTable();
        if (pmIndicatorTable != null) {
            x(q0Var, pmIndicatorTable);
        }
        f1.q0.c(q0Var, null, null, y2.m.b(-1387418010, true, new er.q() { // from class: uy0.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.m(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(955768541, true, new er.q() { // from class: uy0.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.n(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1387418010, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.LegendInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegendScreen.kt:59)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getDustIndicatorDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(955768541, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.LegendInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LegendScreen.kt:68)");
            }
            Label bottomScreenInfoLabel = initialized.getBottomScreenInfoLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, bottomScreenInfoLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-802265342);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-802265342, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.LegendScreen (LegendScreen.kt:33)");
            }
            e.a aVarQ = q(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarQ, e.a.C5259a.f202169a)) {
                rVarH.X(2117125126);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof e.a.Initialized)) {
                    rVarH.X(2117123307);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2117126713);
                j((e.a.Initialized) aVarQ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: uy0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.r(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a q(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e eVar, int i15, p076m2.r rVar, int i16) {
        p(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void s(final PmIndicatorTable pmIndicatorTable, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1107711380);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(pmIndicatorTable) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1107711380, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.RateDictionaryTableHeader (LegendScreen.kt:99)");
            }
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarE = iVar.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(fVarE, companion2.l(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarC = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarB2 = m3.b(iVar.j(), companion2.l(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing500()), rVarH, 0);
            j70.h.g(null, null, pmIndicatorTable.getRatingHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH.x();
            f3.m mVarC2 = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarB3 = m3.b(iVar.j(), companion2.l(), rVarH, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarB3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            rVar2 = rVarH;
            j70.h.g(null, null, pmIndicatorTable.getAirQualityHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33554427);
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uy0.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.t(pmIndicatorTable, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(PmIndicatorTable pmIndicatorTable, int i15, p076m2.r rVar, int i16) {
        s(pmIndicatorTable, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final AirQualityRating airQualityRating, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-714244068);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(airQualityRating) : rVarH.G(airQualityRating) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-714244068, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.RateDictionaryTableItem (LegendScreen.kt:125)");
            }
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarE = iVar.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(fVarE, companion2.l(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarC = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarB2 = m3.b(iVar.j(), companion2.l(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d40.h.f(null, airQualityRating.getIconData(), false, rVarH, d40.b.f39676g << 3, 5);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, airQualityRating.getRatingLabel(), null, null, 0L, 0L, null, FontWeight.INSTANCE.a(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 100663296, 0, 0, 33029883);
            rVarH.x();
            f3.m mVarC2 = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarB3 = m3.b(iVar.j(), companion2.l(), rVarH, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarB3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            rVar2 = rVarH;
            j70.h.g(null, null, airQualityRating.getAirQualityLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uy0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.v(airQualityRating, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(AirQualityRating airQualityRating, int i15, p076m2.r rVar, int i16) {
        u(airQualityRating, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void x(f1.q0 q0Var, final PmIndicatorTable pmIndicatorTable) {
        f1.q0.c(q0Var, null, null, y2.m.b(-1366337820, true, new er.q() { // from class: uy0.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o.y(pmIndicatorTable, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        List<AirQualityRating> listB = pmIndicatorTable.b();
        q0Var.j(listB.size(), null, new b(a.f202189a, listB), y2.m.b(802480018, true, new c(listB)));
        f1.q0.c(q0Var, null, null, uy0.b.f202160a.b(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(PmIndicatorTable pmIndicatorTable, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1366337820, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.legend.rateDictionaryTable.<anonymous> (LegendScreen.kt:85)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            s(pmIndicatorTable, rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
