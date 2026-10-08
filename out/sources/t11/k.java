package t11;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lt11/g;", "viewModel", "Loq/i0;", "d", "(Lt11/g;Lm2/r;I)V", "Lt11/g$a;", "data", "g", "(Lt11/g$a;Lm2/r;I)V", "Lt11/g$a$b;", "i", "(Lt11/g$a$b;Lm2/r;I)V", "certificates_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void d(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-946344461);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-946344461, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.confirmation.ConfirmationScreen (ConfirmationScreen.kt:13)");
            }
            g(e(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t11.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a e(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g gVar, int i15, p076m2.r rVar, int i16) {
        d(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final g.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-242929872);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-242929872, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.confirmation.ConfirmationScreenContent (ConfirmationScreen.kt:19)");
            }
            if (fr.t.c(aVar, g.a.C4856a.f186964a)) {
                rVarH.X(-103788016);
                rVarH.R();
            } else {
                if (aVar instanceof g.a.Initialized) {
                    rVarH.X(-1527366719);
                    i((g.a.Initialized) aVar, rVarH, i16 & 14);
                } else {
                    rVarH.X(-104649134);
                }
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
            d5VarM.a(new er.p() { // from class: t11.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.a aVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-151486616);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-151486616, i16, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.confirmation.ConfirmationScreenInitializedContent (ConfirmationScreen.kt:29)");
            }
            h50.c.b(initialized.getModel(), rVarH, h50.a.f80999k);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t11.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
