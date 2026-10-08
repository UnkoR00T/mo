package r42;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lr42/d;", "viewModel", "Loq/i0;", "u", "(Lr42/d;Lm2/r;I)V", "Lr42/d$a;", "screenData", "n", "(Lr42/d$a;Lm2/r;I)V", "Lr42/d$a$b;", "m", "(Lr42/d$a$b;Lm2/r;I)V", "j", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171721a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(DefaultSingleCardData defaultSingleCardData) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f171722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f171723b;

        public b(er.l lVar, List list) {
            this.f171722a = lVar;
            this.f171723b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f171722a.b(this.f171723b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f171724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a.Initialized f171725b;

        public c(List list, d.a.Initialized initialized) {
            this.f171724a = list;
            this.f171725b = initialized;
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
            DefaultSingleCardData defaultSingleCardData = (DefaultSingleCardData) this.f171724a.get(i15);
            rVar.X(-2059208678);
            h0.v(defaultSingleCardData, null, rVar, 0, 2);
            if (fr.t.c(pq.v.x0(this.f171725b.b()), defaultSingleCardData)) {
                rVar.X(-2059103930);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            } else {
                rVar.X(-2062468918);
            }
            rVar.R();
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

    private static final void j(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1696620112);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1696620112, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsHeader (PaymentsInstallmentsScreen.kt:111)");
            }
            p114t0.k.g(initialized.a().getIsVisible(), null, null, null, null, y2.m.d(-893829694, true, new er.q() { // from class: r42.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.k(initialized, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 30);
            Label title = initialized.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r42.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.a.Initialized initialized, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-893829694, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsHeader.<anonymous>.<anonymous> (PaymentsInstallmentsScreen.kt:113)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, companion);
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
        c30.e.c(null, initialized.a().a(), rVar, c30.b.e.f22961j << 3, 1);
        r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-745240825);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-745240825, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsInitializedScreen (PaymentsInstallmentsScreen.kt:50)");
            }
            final boolean z15 = ((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).orientation == 1;
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1013065344, true, new er.q() { // from class: r42.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.p(z15, initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: r42.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void n(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(249221591);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(249221591, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsInitializedScreen (PaymentsInstallmentsScreen.kt:39)");
            }
            if (fr.t.c(aVar, d.a.C4365a.f171696a)) {
                rVarH.X(-1016214309);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(-1016216372);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1016212222);
                m((d.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: r42.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.o(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d.a aVar, int i15, p076m2.r rVar, int i16) {
        n(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final boolean z15, final d.a.Initialized initialized, final d.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1013065344, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsInitializedScreen.<anonymous>.<anonymous> (PaymentsInstallmentsScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(w0.i.d(mVarL, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            if (z15) {
                rVar.X(1523987311);
                j(initialized, rVar, 0);
            } else {
                rVar.X(1521217368);
            }
            rVar.R();
            f3.m mVarB = d1.h0.b(i0Var, companion, 1.0f, false, 2, null);
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i17).getSpacing100());
            boolean zA = rVar.a(z15) | rVar.G(initialized) | rVar.G(initialized2);
            Object objE = rVar.E();
            if (zA || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: r42.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.q(z15, initialized2, initialized, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarB, null, null, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 494);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized2.getTotalAmountLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p114t0.k.e(i0Var, initialized2.c().getIsVisible(), null, null, null, null, y2.m.d(-350954382, true, new er.q() { // from class: r42.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.s(initialized2, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(initialized2.getToPaymentButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 q(boolean z15, d.a.Initialized initialized, final d.a.Initialized initialized2, q0 q0Var) {
        q0 q0Var2;
        if (z15) {
            q0Var2 = q0Var;
        } else {
            q0Var2 = q0Var;
            q0.c(q0Var2, null, null, y2.m.b(1873701146, true, new er.q() { // from class: r42.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.r(initialized2, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        List<DefaultSingleCardData> listB = initialized.b();
        q0Var2.j(listB.size(), null, new b(a.f171721a, listB), y2.m.b(802480018, true, new c(listB, initialized)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(d.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1873701146, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsInitializedScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsInstallmentsScreen.kt:75)");
            }
            j(initialized, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(d.a.Initialized initialized, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-350954382, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsInitializedScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsInstallmentsScreen.kt:92)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, companion);
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
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
        j70.h.g(null, null, initialized.c().a(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void u(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1241224255);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1241224255, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.installments.PaymentsInstallmentsScreen (PaymentsInstallmentsScreen.kt:33)");
            }
            n(v(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r42.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.w(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a v(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(d dVar, int i15, p076m2.r rVar, int i16) {
        u(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
