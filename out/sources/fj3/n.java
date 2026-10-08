package fj3;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import ju.p0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p143z0.e2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfj3/f;", "viewModel", "Loq/i0;", "h", "(Lfj3/f;Lm2/r;I)V", "Lfj3/f$a;", "data", "k", "(Lfj3/f$a;Lm2/r;I)V", "vehiclehistory_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f.Data f64311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y0 f64312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p0 f64313h;

        /* JADX INFO: renamed from: fj3.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C1435a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f64314e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f64315f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ f1.q f64316g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1435a(y0 y0Var, f1.q qVar, tq.e<? super C1435a> eVar) {
                super(2, eVar);
                this.f64315f = y0Var;
                this.f64316g = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f64314e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    y0 y0Var = this.f64315f;
                    float offset = this.f64316g.getOffset();
                    this.f64314e = 1;
                    if (e2.b(y0Var, offset, null, this, 2, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C1435a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C1435a(this.f64315f, this.f64316g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.Data data, y0 y0Var, p0 p0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f64311f = data;
            this.f64312g = y0Var;
            this.f64313h = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f1.q qVar;
            uq.b.e();
            if (this.f64310e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f64311f.getOdometerData().getIsOdometerDataExpanded() && (qVar = (f1.q) pq.v.z0(this.f64312g.C().j())) != null) {
                ju.k.d(this.f64313h, null, null, new C1435a(this.f64312g, qVar, null), 3, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f64311f, this.f64312g, this.f64313h, eVar);
        }
    }

    public static final void h(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-300054266);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-300054266, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreen (VehicleHistoryAbroadDetailsScreen.kt:28)");
            }
            f.Data dataI = i(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            int i17 = BaseScaffoldData.f89350g;
            int i18 = AccordionData.f16343b;
            k(dataI, rVarH, i17 | i18 | i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fj3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data i(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f fVar, int i15, p076m2.r rVar, int i16) {
        h(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final f.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-280222205);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-280222205, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreenContent (VehicleHistoryAbroadDetailsScreen.kt:37)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final p0 p0Var = (p0) objE;
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1068227504, true, new er.q() { // from class: fj3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.l(data, y0VarC, p0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fj3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final f.Data data, y0 y0Var, p0 p0Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1068227504, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreenContent.<anonymous> (VehicleHistoryAbroadDetailsScreen.kt:45)");
            }
            Boolean boolValueOf = Boolean.valueOf(data.getOdometerData().getIsOdometerDataExpanded());
            boolean zG = rVar.G(data) | rVar.W(y0Var) | rVar.G(p0Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(data, y0Var, p0Var, null);
                rVar.v(objE);
            }
            Function0.d(boolValueOf, (er.p) objE, rVar, 0);
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG2 = rVar.G(data);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: fj3.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.m(data, (q0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f1.d.c(mVarP, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE2, rVar, 0, 504);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final f.Data data, q0 q0Var) {
        final f.Data.ScreenTechnicalData technicalData = data.getTechnicalData();
        if (technicalData != null) {
            q0.c(q0Var, null, null, y2.m.b(1691160443, true, new er.q() { // from class: fj3.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.n(technicalData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0.c(q0Var, null, null, y2.m.b(-1875363771, true, new er.q() { // from class: fj3.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n.o(data, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final AccordionData odometerAccordionData = data.getOdometerData().getOdometerAccordionData();
        if (odometerAccordionData != null) {
            q0.c(q0Var, null, null, y2.m.b(-136075351, true, new er.q() { // from class: fj3.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.p(odometerAccordionData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(f.Data.ScreenTechnicalData screenTechnicalData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1691160443, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryAbroadDetailsScreen.kt:69)");
            }
            m30.i.d(screenTechnicalData.getMainTechnicalData(), null, null, rVar, 0, 6);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            b30.j.g(screenTechnicalData.getAdditionalAccordionData(), rVar, AccordionData.f16343b);
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
    public static final i0 o(f.Data data, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1875363771, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryAbroadDetailsScreen.kt:78)");
            }
            Label riskLabel = data.getRiskLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, riskLabel, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            m30.i.d(data.getAbroadDataList(), null, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(AccordionData accordionData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-136075351, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.abroad.details.VehicleHistoryAbroadDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryAbroadDetailsScreen.kt:88)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            b30.j.g(accordionData, rVar, AccordionData.f16343b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(f.Data data, int i15, p076m2.r rVar, int i16) {
        k(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
