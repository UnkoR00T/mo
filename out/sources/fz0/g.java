package fz0;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfz0/d;", "viewModel", "Loq/i0;", "c", "(Lfz0/d;Lm2/r;I)V", "Lfz0/d$a;", "data", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void c(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-775936225);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-775936225, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.savepointsuccess.SavePointSuccessScreen (SavePointSuccessScreen.kt:15)");
            }
            h50.c.b(d(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)).getResultModalData(), rVarH, h50.a.f80999k);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: fz0.e
                    @Override // er.a
                    public final Object a() {
                        return g.e();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fz0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data d(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d dVar, int i15, r rVar, int i16) {
        c(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
