package wd0;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;
import rd0.SetPinThemeDrawable;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lwd0/h;", "viewModel", "Loq/i0;", "h", "(Lwd0/h;Lm2/r;I)V", "Lwd0/h$a$b;", "data", "k", "(Lwd0/h$a$b;Lm2/r;I)V", "Lwd0/h$a$a;", "e", "(Lwd0/h$a$a;Lm2/r;I)V", "Lwd0/h$a;", "state", "setpin_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    private static final void e(final h.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-428031109);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-428031109, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.main.ResetPinErrorScreen (ResetPinScreen.kt:42)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: wd0.b
                    @Override // er.a
                    public final Object a() {
                        return e.f();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wd0.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(h.a.Error error, int i15, p076m2.r rVar, int i16) {
        e(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void h(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(78039415);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(78039415, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.main.ResetPinScreen (ResetPinScreen.kt:16)");
            }
            h.a aVarI = i(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarI instanceof h.a.Error) {
                rVarH.X(1981439927);
                e((h.a.Error) aVarI, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarI instanceof h.a.Initialized)) {
                    rVarH.X(1981437906);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1981442521);
                k((h.a.Initialized) aVarI, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: wd0.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.j(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.a i(f6<? extends h.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(h hVar, int i15, p076m2.r rVar, int i16) {
        h(hVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final h.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-96399072);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-96399072, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.main.ResetPinScreenContent (ResetPinScreen.kt:28)");
            }
            w60.d.d(BasicPinInputScreenData.k(initialized.getPinScreenData(), null, o40.a.Icon.d(initialized.getPinScreenData().a(), ((SetPinThemeDrawable) rVarH.N(rd0.e.f())).getChangePin(), null, null, null, null, null, 62, null), null, false, null, 29, null), rVarH, BasicPinInputScreenData.f216979g);
            q0.g(false, initialized.a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wd0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(h.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
