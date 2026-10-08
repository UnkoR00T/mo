package sp1;

import d1.a3;
import d1.e0;
import d1.i0;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lsp1/m;", "viewModel", "Loq/i0;", "b", "(Lsp1/m;Lm2/r;I)V", "Lsp1/m$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void b(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-994244078);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-994244078, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.cardlistunmapped.DeveloperUnmappedCardListScreen (DeveloperCardListScreen.kt:32)");
            }
            f6 f6VarC = m7.b.c(mVar.getState(), null, null, null, rVarH, 0, 7);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            i0 i0Var = i0.f39176a;
            p70.g.f153260a.o(mx.b.b("CardList (1.1.0)", ""), c(f6VarC).c(), rVarH, p70.g.f153262c << 6);
            f3.c.b bVarK = companion2.k();
            f3.m mVarS = t70.i.S(a3.p(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.r(aVar.b(rVarH, i17).getSpacing200()), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("Card List - przykłady", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b("Card info", ""), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null)), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b("Card info", ""), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null)), null, null, null, 3839, null)), null, false, null, null, 30, null), null, null, rVar2, 0, 6);
            j70.h.g(null, null, mx.b.b("Card List typu Clickable - przykłady", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2815, null)), null, false, null, null, 30, null), null, null, rVar2, 0, 6);
            j70.h.g(null, null, mx.b.b("RadioButton Default - przykład", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(c(f6VarC).getRadioButtonCardListDefault(), null, null, rVar2, 0, 6);
            j70.h.g(null, null, mx.b.b("RadioButton Error - przykład", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(c(f6VarC).getRadioButtonCardListError(), null, null, rVar2, 0, 6);
            j70.h.g(null, null, mx.b.b("Checkbox Default - przykład", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(c(f6VarC).getCheckboxCardListDefault(), null, null, rVar2, 0, 6);
            j70.h.g(null, null, mx.b.b("Checkbox Error - przykład", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            m30.i.d(c(f6VarC).getCheckboxCardListError(), null, null, rVar2, 0, 6);
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
            d5VarM.a(new er.p() { // from class: sp1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.d(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final m.Data c(f6<m.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(m mVar, int i15, p076m2.r rVar, int i16) {
        b(mVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
