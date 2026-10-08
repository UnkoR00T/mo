package b01;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.util.List;
import n50.h0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lb01/i;", "viewModel", "Loq/i0;", "f", "(Lb01/i;Lm2/r;I)V", "Lb01/i$a$b;", "data", "i", "(Lb01/i$a$b;Lm2/r;I)V", "Lb01/i$a;", "state", "applicationforms_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15785a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f15786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f15787b;

        public b(er.l lVar, List list) {
            this.f15786a = lVar;
            this.f15787b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f15786a.b(this.f15787b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f15788a;

        public c(List list) {
            this.f15788a = list;
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
            if (t.k()) {
                t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f15788a.get(i15);
            rVar.X(294607473);
            h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    public static final void f(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(835818240);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(835818240, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.list.ApplicationFormListScreen (ApplicationFormListScreen.kt:25)");
            }
            i.a aVarG = g(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarG, i.a.C0370a.f15800a)) {
                rVarH.X(1936012064);
                rVarH.R();
            } else {
                if (!(aVarG instanceof i.a.Initialized)) {
                    rVarH.X(62449339);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(62454450);
                i((i.a.Initialized) aVarG, rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: b01.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.h(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a g(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i iVar, int i15, p076m2.r rVar, int i16) {
        f(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final i.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1578786985);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1578786985, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.list.ApplicationFormListScreenContent (ApplicationFormListScreen.kt:37)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1604368124, true, new er.q() { // from class: b01.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: b01.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final i.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1604368124, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.list.ApplicationFormListScreenContent.<anonymous> (ApplicationFormListScreen.kt:41)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarH = a3.h(aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            d1.i.f fVarR = d1.i.f39152a.r(aVar.b(rVar, i17).getSpacing100());
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: b01.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.k(initialized, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarL, null, d3VarH, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 490);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i.a.Initialized initialized, q0 q0Var) {
        List<n50.k> listB = initialized.b();
        q0Var.j(listB.size(), null, new b(a.f15785a, listB), y2.m.b(802480018, true, new c(listB)));
        final c30.b.c alertData = initialized.getAlertData();
        if (alertData != null) {
            q0.c(q0Var, null, null, y2.m.b(1207648662, true, new er.q() { // from class: b01.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.l(alertData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c30.b.c cVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1207648662, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.list.ApplicationFormListScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationFormListScreen.kt:56)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            c30.e.c(null, cVar, rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(i.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
