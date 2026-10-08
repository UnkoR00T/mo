package i11;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.List;
import ju.p0;
import k40.EmptyStateData;
import l11.CasesTimelineItem;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Li11/c;", "viewModel", "Loq/i0;", "j", "(Li11/c;Lm2/r;I)V", "Li11/c$a;", "state", "m", "(Li11/c$a;Lm2/r;I)V", "Li11/c$a$a;", "o", "(Li11/c$a$a;Lm2/r;I)V", "Li11/c$a$c;", "r", "(Li11/c$a$c;Lm2/r;I)V", "cases_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f88234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i11.c.a.Initialized f88235g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, i11.c.a.Initialized initialized, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f88234f = y0Var;
            this.f88235g = initialized;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f88233e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!this.f88234f.e() && !this.f88235g.getEndReached()) {
                this.f88235g.e().a();
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
            return new a(this.f88234f, this.f88235g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f88236a;

        public b(List list) {
            this.f88236a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f88236a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f88237a;

        public c(List list) {
            this.f88237a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17 = (i16 & 6) == 0 ? i16 | (rVar.W(eVar) ? 4 : 2) : i16;
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            CasesTimelineItem casesTimelineItem = (CasesTimelineItem) this.f88237a.get(i15);
            rVar.X(-1718901123);
            if (i15 != 0) {
                rVar.X(-1718899667);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            } else {
                rVar.X(-1721970062);
            }
            rVar.R();
            j70.h.g(null, null, casesTimelineItem.getDate(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVar, k70.a.f108865b).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            rVar.X(1468581351);
            for (DefaultSingleCardData defaultSingleCardData : casesTimelineItem.a()) {
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                h0.v(defaultSingleCardData, null, rVar, 0, 2);
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
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

    public static final void j(final i11.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1574384151);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1574384151, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreen (CasesListScreen.kt:31)");
            }
            m(k(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i11.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i11.c.a k(f6<? extends i11.c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(i11.c cVar, int i15, p076m2.r rVar, int i16) {
        j(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final i11.c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1110888262);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1110888262, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenContent (CasesListScreen.kt:38)");
            }
            if (aVar instanceof i11.c.a.b) {
                rVarH.X(1883240830);
                rVarH.R();
            } else if (aVar instanceof i11.c.a.Empty) {
                rVarH.X(1883242325);
                o((i11.c.a.Empty) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof i11.c.a.Initialized)) {
                    rVarH.X(1883239186);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1883244731);
                r((i11.c.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: i11.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(i11.c.a aVar, int i15, p076m2.r rVar, int i16) {
        m(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final i11.c.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-927790017);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-927790017, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenEmpty (CasesListScreen.kt:45)");
            }
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(466366764, true, new er.q() { // from class: i11.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.p(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: i11.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(i11.c.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(466366764, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenEmpty.<anonymous> (CasesListScreen.kt:50)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            q40.i.b(empty.b(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 q(i11.c.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        o(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final i11.c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1397300273);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1397300273, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenInitialized (CasesListScreen.kt:59)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(y0VarC.e() && !initialized.getEndReached());
            boolean zW = rVarH.W(y0VarC) | rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, initialized, null);
                rVarH.v(objE);
            }
            Function0.d(boolValueOf, (er.p) objE, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(85542302, true, new er.q() { // from class: i11.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.s(y0VarC, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: i11.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.w(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(y0 y0Var, final i11.c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(85542302, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenInitialized.<anonymous> (CasesListScreen.kt:71)");
            }
            f3.m mVarN = t70.s.n(f3.m.INSTANCE, rVar, 6);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i11.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.t(initialized, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarN, y0Var, d3Var, false, null, null, null, false, null, (er.l) objE, rVar, (i16 << 6) & 896, 504);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final i11.c.a.Initialized initialized, q0 q0Var) {
        if (initialized.getShowInfoBanner()) {
            q0.c(q0Var, null, null, y2.m.b(-1048895794, true, new er.q() { // from class: i11.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.u(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        List<CasesTimelineItem> listC = initialized.c();
        q0Var.j(listC.size(), null, new b(listC), y2.m.b(2039820996, true, new c(listC)));
        q0.c(q0Var, null, null, y2.m.b(-86256653, true, new er.q() { // from class: i11.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return m.v(initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(i11.c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1048895794, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesListScreen.kt:78)");
            }
            c30.e.c(null, initialized.getAlertData(), rVar, 0, 1);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(i11.c.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-86256653, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.caseslist.CasesListScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesListScreen.kt:98)");
            }
            j11.c.b(initialized.getPageIndicatorData(), rVar, EmptyStateData.f108236d);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(i11.c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        r(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
