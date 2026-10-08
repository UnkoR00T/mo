package yu3;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lyu3/h;", "viewModel", "Loq/i0;", "q", "(Lyu3/h;Lm2/r;I)V", "Lyu3/h$a$b;", "data", "k", "(Lyu3/h$a$b;Lm2/r;I)V", "", "Lz30/a;", "i", "(Ljava/util/List;Lm2/r;I)V", "Ld1/d3;", "paddingValues", "t", "(Lyu3/h$a$b;Ld1/d3;Lm2/r;I)V", "Lyu3/h$a;", "state", "confirmationdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h.a.Initialized f229872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f229873g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f229872f = initialized;
            this.f229873g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229871e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f229872f.getScrollToPicker()) {
                    j1.a aVar = this.f229873g;
                    this.f229871e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f229872f.g().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f229872f, this.f229873g, eVar);
        }
    }

    private static final void i(final List<FileBottomSheetItemData> list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-6882273);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-6882273, i16, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.BottomSheetContent (ConfirmationDocumentScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(-1664933515);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                z30.e.d(list.get(i17), rVarH, FileBottomSheetItemData.f232760e);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yu3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.j(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(List list, int i15, p076m2.r rVar, int i16) {
        i(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final h.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(832977907);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(832977907, i16, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.ConfirmationDocumentContent (ConfirmationDocumentScreen.kt:45)");
            }
            cb4.i dialogVmsAdapter = initialized.getDialogVmsAdapter();
            if (dialogVmsAdapter == null) {
                rVarH.X(-1076095514);
            } else {
                rVarH.X(1627855227);
                dialogVmsAdapter.b(rVarH, 0);
            }
            rVarH.R();
            g30.m.j(initialized.getBottomSheetData(), initialized.getScaffoldData(), 0.0f, null, null, y2.m.d(662069807, true, new er.p() { // from class: yu3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1423951118, true, new er.p() { // from class: yu3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1993569226, true, new er.q() { // from class: yu3.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14352384 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 28);
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: yu3.m
                    @Override // er.a
                    public final Object a() {
                        return q.o(initialized);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yu3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(h.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(662069807, i15, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.ConfirmationDocumentContent.<anonymous> (ConfirmationDocumentScreen.kt:53)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 m(h.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1423951118, i15, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.ConfirmationDocumentContent.<anonymous> (ConfirmationDocumentScreen.kt:50)");
            }
            i(initialized.b(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(h.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1993569226, i15, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.ConfirmationDocumentContent.<anonymous> (ConfirmationDocumentScreen.kt:51)");
            }
            t(initialized, d3Var, rVar, (i15 << 3) & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(h.a.Initialized initialized) {
        initialized.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(h.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-873677614);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-873677614, i16, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.ConfirmationDocumentScreen (ConfirmationDocumentScreen.kt:36)");
            }
            h.a aVarR = r(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarR instanceof h.a.Error) {
                rVarH.X(-2085556870);
                ((h.a.Error) aVarR).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarR instanceof h.a.Initialized)) {
                    rVarH.X(-2085559681);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2085554694);
                k((h.a.Initialized) aVarR, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: yu3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.s(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.a r(f6<? extends h.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(h hVar, int i15, p076m2.r rVar, int i16) {
        q(hVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final h.a.Initialized initialized, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(426287088);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(426287088, i16, -1, "pl.gov.coi.mobywatel.segment.contract.confirmationdocument.presentation.InnerContent (ConfirmationDocumentScreen.kt:74)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(initialized.getScrollToPicker());
            boolean zG = rVarH.G(initialized) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(initialized, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var), null, rVarH, 0, 1), rVarH, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = initialized.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar2.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar2.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            m40.c.c(j1.e.b(companion2, aVar), initialized.getPickerData(), rVarH, FilePickerData.f131319k << 3, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yu3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.u(initialized, d3Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(h.a.Initialized initialized, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        t(initialized, d3Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
