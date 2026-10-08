package nq1;

import a50.RadioButtonData;
import d1.a3;
import d1.r3;
import java.util.Iterator;
import java.util.Map;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lnq1/v;", "viewModel", "Loq/i0;", "b", "(Lnq1/v;Lm2/r;I)V", "Lnq1/v$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void b(final v vVar, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(927001601);
        int i16 = (i15 & 6) == 0 ? i15 | ((i15 & 8) == 0 ? rVarH.W(vVar) : rVarH.G(vVar) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(927001601, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.radiobutton.DeveloperRadioButtonScreen (DeveloperRadioButtonScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(vVar.getState(), null, null, null, rVarH, 0, 7);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            p70.g.f153260a.o(mx.b.b("RadioButton 1.1.0", ""), c(f6VarC).b(), rVarH, p70.g.f153262c << 6);
            f3.c.b bVarK = companion2.k();
            f3.m mVarS = t70.i.S(a3.p(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), bVarK, rVarH, 48);
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
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, companion);
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            j70.h.g(null, null, mx.b.b("Radio Button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Przyciski typu radio button używamy zawsze tam, gdzie mamy grupę wzajemnie wykluczających się wyborów. Dozwolony jest tylko jeden wybór z grupy. Gdy użytkownik wybierze nowy element, poprzedni wybór jest automatycznie odznaczany.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            rVarH.X(-1910617701);
            for (Iterator<Map.Entry<Label, RadioButtonData>> it = c(f6VarC).a().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Label, RadioButtonData> next = it.next();
                Label key = next.getKey();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, null, key, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                rVarH = rVar2;
                f3.m.Companion companion4 = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
                a50.k.j(next.getValue(), rVarH, RadioButtonData.f3462h);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nq1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.d(vVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v.Data c(f6<v.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(v vVar, int i15, p076m2.r rVar, int i16) {
        b(vVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
