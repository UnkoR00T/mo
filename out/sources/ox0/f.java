package ox0;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lox0/d;", "viewModel", "Loq/i0;", "b", "(Lox0/d;Lm2/r;I)V", "Lox0/d$a;", "state", "adddocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void b(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1099228131);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1099228131, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.profilzaufany.ActivationScreen (ActivationScreen.kt:11)");
            }
            d.a aVarC = c(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarC, d.a.b.f150386a)) {
                rVarH.X(203727182);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarC instanceof d.a.Error) {
                rVarH.X(203729733);
                ((d.a.Error) aVarC).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarC instanceof d.a.Ready)) {
                    rVarH.X(203725174);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(203731401);
                w70.l.d(((d.a.Ready) aVarC).getWebViewData(), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ox0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a c(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(d dVar, int i15, p076m2.r rVar, int i16) {
        b(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
