package yn2;

import d1.d3;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.t;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lyn2/g;", "viewModel", "Loq/i0;", "i", "(Lyn2/g;Lm2/r;I)V", "Lyn2/g$a;", "screenData", "e", "(Lyn2/g$a;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void e(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(996330751);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(996330751, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.success.NetworkSecurityIssuesSuccessDisplayed (NetworkSecurityIssuesSuccessScreen.kt:25)");
            }
            int i17 = i16;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(181159660, true, new er.q() { // from class: yn2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.f(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(data));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: yn2.k
                    @Override // er.a
                    public final Object a() {
                        return m.g(data);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yn2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(181159660, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.success.NetworkSecurityIssuesSuccessDisplayed.<anonymous> (NetworkSecurityIssuesSuccessScreen.kt:27)");
            }
            q40.i.b(data.b(), null, b.f228185a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(g.Data data) {
        data.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(30178792);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(30178792, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.success.NetworkSecurityIssuesSuccessScreen (NetworkSecurityIssuesSuccessScreen.kt:17)");
            }
            e(j(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h | IconPageBottomContentData.f164663d);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yn2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data j(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(g gVar, int i15, p076m2.r rVar, int i16) {
        i(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
