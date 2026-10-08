package yx1;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lyx1/g;", "viewModel", "Loq/i0;", "i", "(Lyx1/g;Lm2/r;I)V", "Lyx1/g$a$b;", "data", "l", "(Lyx1/g$a$b;Lm2/r;I)V", "Lyx1/g$a$a;", "f", "(Lyx1/g$a$a;Lm2/r;I)V", "Lyx1/g$a;", "state", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void f(final g.a.CustomBusinessError customBusinessError, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1922250704);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(customBusinessError) : rVarH.G(customBusinessError) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1922250704, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.eidactivation.activation.presentation.CustomBusinessErrorScreen (EIdActivationProcessScreen.kt:47)");
            }
            rVar2 = rVarH;
            i50.s.r(customBusinessError.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1425018403, true, new er.q() { // from class: yx1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.g(customBusinessError, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yx1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(customBusinessError, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(g.a.CustomBusinessError customBusinessError, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1425018403, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.eidactivation.activation.presentation.CustomBusinessErrorScreen.<anonymous> (EIdActivationProcessScreen.kt:51)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(customBusinessError.a(), null, b.f230298a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(g.a.CustomBusinessError customBusinessError, int i15, p076m2.r rVar, int i16) {
        f(customBusinessError, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-577433371);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-577433371, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.eidactivation.activation.presentation.EIdActivationProcessScreen (EIdActivationProcessScreen.kt:23)");
            }
            g.a aVarJ = j(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarJ instanceof g.a.NfcInfo) {
                rVarH.X(-862680878);
                bx1.i.k(((g.a.NfcInfo) aVarJ).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarJ instanceof g.a.NfcScanning) {
                rVarH.X(-862677546);
                bx1.i.p(((g.a.NfcScanning) aVarJ).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarJ instanceof g.a.Error) {
                rVarH.X(-862674300);
                l((g.a.Error) aVarJ, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof g.a.CustomBusinessError)) {
                    rVarH.X(-862683267);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-862671150);
                f((g.a.CustomBusinessError) aVarJ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: yx1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a j(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(g gVar, int i15, p076m2.r rVar, int i16) {
        i(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final g.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(812890766);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(812890766, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.eidactivation.activation.presentation.ErrorScreen (EIdActivationProcessScreen.kt:37)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: yx1.i
                    @Override // er.a
                    public final Object a() {
                        return m.m();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yx1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(g.a.Error error, int i15, p076m2.r rVar, int i16) {
        l(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
