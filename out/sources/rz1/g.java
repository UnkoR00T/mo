package rz1;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lrz1/d;", "viewModel", "Loq/i0;", "c", "(Lrz1/d;Lm2/r;I)V", "Lrz1/d$a;", "screenData", "f", "(Lrz1/d$a;Lm2/r;I)V", "electoralsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void c(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1056850201);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1056850201, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.missingtrustedprofile.MissingTrustedProfileScreen (MissingTrustedProfileScreen.kt:14)");
            }
            f(d(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rz1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data d(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d dVar, int i15, r rVar, int i16) {
        c(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-753089066);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-753089066, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.missingtrustedprofile.MissingTrustedProfileScreenContent (MissingTrustedProfileScreen.kt:20)");
            }
            q40.i.b(data.a(), null, null, rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rz1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.g(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d.Data data, int i15, r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
