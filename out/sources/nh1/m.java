package nh1;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.y0;
import i50.BaseScaffoldData;
import n50.SingleCardConfig;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import p144z20.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lnh1/q;", "viewModel", "Loq/i0;", "q", "(Lnh1/q;Lm2/r;I)V", "Lnh1/q$a$a;", "screenData", "i", "(Lnh1/q$a$a;Lm2/r;I)V", "Lnh1/q$a;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void i(final q.a.Screen screen, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1141489323);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(screen) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1141489323, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsorder.DocumentsOrderContent (DocumentsOrderScreen.kt:38)");
            }
            q0.g(false, screen.c(), rVarH, 0, 1);
            boolean zG = rVarH.G(screen);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: nh1.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.j(screen, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVarH.v(objE);
            }
            final p144z20.c cVarA = Function2.a((er.p) objE, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(screen.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2071684044, true, new er.q() { // from class: nh1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.k(cVarA, screen, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nh1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(screen, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(q.a.Screen screen, int i15, int i16) {
        screen.d().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final p144z20.c cVar, final q.a.Screen screen, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2071684044, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsorder.DocumentsOrderContent.<anonymous>.<anonymous> (DocumentsOrderScreen.kt:47)");
            }
            f3.m mVarG = t70.s.G(androidx.compose.foundation.layout.d.d(t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0), 0.0f, 1, null), cVar, rVar, p144z20.c.f232335g << 3);
            y0 lazyListState = cVar.getLazyListState();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(screen) | rVar.G(cVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nh1.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.l(screen, cVar, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarG, lazyListState, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 504);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final q.a.Screen screen, final p144z20.c cVar, f1.q0 q0Var) {
        p144z20.b.b(q0Var, screen.b(), y2.m.b(102337942, true, new er.r() { // from class: nh1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m.m(screen, cVar, (f3.m) obj, (DocumentItem) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), cVar, new er.l() { // from class: nh1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.o((DocumentItem) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final q.a.Screen screen, p144z20.c cVar, f3.m mVar, DocumentItem documentItem, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVar.W(documentItem) ? 32 : 16;
        }
        if (rVar.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(102337942, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsorder.DocumentsOrderContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentsOrderScreen.kt:63)");
            }
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            int iIndexOf = screen.b().indexOf(documentItem);
            int size = screen.b().size();
            boolean z15 = cVar.c() != null;
            String text = ((n50.b.Title) documentItem.getSingleCard().getBodySection().getTitle()).getSingleCardLabel().getLabel().getText();
            boolean zG = rVar.G(screen);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: nh1.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.n(screen, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                rVar.v(objE);
            }
            h0.v(documentItem.getSingleCard(), new SingleCardConfig(t70.i.m(companion2, iIndexOf, size, z15, text, (er.p) objE, rVar, 6), false, 2, null), rVar, SingleCardConfig.f132071c << 3, 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(q.a.Screen screen, int i15, int i16) {
        screen.d().B(Integer.valueOf(i15), Integer.valueOf(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(DocumentItem documentItem) {
        return documentItem.getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(q.a.Screen screen, int i15, p076m2.r rVar, int i16) {
        i(screen, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final q qVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(211947966);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(qVar) : rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(211947966, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsorder.DocumentsOrderScreen (DocumentsOrderScreen.kt:29)");
            }
            q.a aVarR = r(m7.b.c(qVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarR instanceof q.a.Screen)) {
                rVarH.X(1818536847);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(1818539354);
            i((q.a.Screen) aVarR, rVarH, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nh1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final q.a r(f6<? extends q.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(q qVar, int i15, p076m2.r rVar, int i16) {
        q(qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
