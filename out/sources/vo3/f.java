package vo3;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lvo3/c;", "viewModel", "Loq/i0;", "c", "(Lvo3/c;Lm2/r;I)V", "Lvo3/c$a$b;", "data", "f", "(Lvo3/c$a$b;Lm2/r;I)V", "Lvo3/c$a;", "state", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void c(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(477398270);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(477398270, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.pinauthentication.PinAuthenticationScreen (PinAuthenticationScreen.kt:16)");
            }
            c.a aVarD = d(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarD instanceof c.a.C5457a) {
                rVarH.X(-781756241);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarD instanceof c.a.Initialized)) {
                    rVarH.X(-781758525);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-781753879);
                f((c.a.Initialized) aVarD, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: vo3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.e(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a d(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c cVar, int i15, p076m2.r rVar, int i16) {
        c(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1936693169);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1936693169, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.pinauthentication.PinAuthenticationScreenContent (PinAuthenticationScreen.kt:29)");
            }
            w60.d.d(initialized, rVarH, i16 & 14);
            q0.g(false, initialized.e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: vo3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        f(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
