package td0;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;
import rd0.SetPinThemeDrawable;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Ltd0/c;", "viewModel", "Loq/i0;", "h", "(Ltd0/c;Lm2/r;I)V", "Ltd0/c$a$b;", "data", "k", "(Ltd0/c$a$b;Lm2/r;I)V", "Ltd0/c$a$a;", "e", "(Ltd0/c$a$a;Lm2/r;I)V", "Ltd0/c$a;", "state", "setpin_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void e(final c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1068444200);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1068444200, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.pin.SetPinErrorScreen (SetPinScreen.kt:41)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: td0.e
                    @Override // er.a
                    public final Object a() {
                        return h.f();
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
            d5VarM.a(new er.p() { // from class: td0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.g(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a.Error error, int i15, p076m2.r rVar, int i16) {
        e(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1584707826);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1584707826, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.pin.SetPinScreen (SetPinScreen.kt:16)");
            }
            c.a aVarI = i(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarI instanceof c.a.SetPinData) {
                rVarH.X(-1809163078);
                k((c.a.SetPinData) aVarI, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarI instanceof c.a.Error)) {
                    rVarH.X(-1809165384);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1809160552);
                e((c.a.Error) aVarI, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: td0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a i(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c cVar, int i15, p076m2.r rVar, int i16) {
        h(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final c.a.SetPinData setPinData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1735459902);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(setPinData) : rVarH.G(setPinData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1735459902, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.pin.SetPinScreenContent (SetPinScreen.kt:27)");
            }
            w60.d.d(BasicPinInputScreenData.k(setPinData.getPinScreenData(), null, o40.a.Icon.d(setPinData.getPinScreenData().a(), ((SetPinThemeDrawable) rVarH.N(rd0.e.f())).getChangePin(), null, null, null, null, null, 62, null), null, false, null, 29, null), rVarH, BasicPinInputScreenData.f216979g);
            q0.g(false, setPinData.a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: td0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(setPinData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.SetPinData setPinData, int i15, p076m2.r rVar, int i16) {
        k(setPinData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
