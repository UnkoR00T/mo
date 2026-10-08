package nw1;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lnw1/c;", "viewModel", "Loq/i0;", "g", "(Lnw1/c;Lm2/r;I)V", "Lnw1/c$a$a;", "screenState", "j", "(Lnw1/c$a$a;Lm2/r;I)V", "Lnw1/c$a$b;", "data", "n", "(Lnw1/c$a$b;Lm2/r;I)V", "Lnw1/c$a;", "state", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(445552522);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(445552522, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.changepin.presentation.ChangePinScreen (ChangePinScreen.kt:23)");
            }
            c.a aVarH = h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof c.a.NfcInfo) {
                rVarH.X(-1320749545);
                bx1.i.k(((c.a.NfcInfo) aVarH).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarH instanceof c.a.NfcScanning) {
                rVarH.X(-1320746565);
                bx1.i.p(((c.a.NfcScanning) aVarH).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarH instanceof c.a.ChangePinSuccessful) {
                rVarH.X(-1320743198);
                j((c.a.ChangePinSuccessful) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof c.a.Error)) {
                    rVarH.X(-1320751615);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1320740087);
                n((c.a.Error) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: nw1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a h(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void j(final c.a.ChangePinSuccessful changePinSuccessful, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1585136591);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(changePinSuccessful) : rVarH.G(changePinSuccessful) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1585136591, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.changepin.presentation.ChangePinSuccessScreenContent (ChangePinScreen.kt:37)");
            }
            rVar2 = rVarH;
            i50.s.r(changePinSuccessful.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-653723036, true, new er.q() { // from class: nw1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.k(changePinSuccessful, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nw1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(changePinSuccessful, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(final c.a.ChangePinSuccessful changePinSuccessful, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-653723036, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.changepin.presentation.ChangePinSuccessScreenContent.<anonymous> (ChangePinScreen.kt:41)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            q40.i.b(changePinSuccessful.a(), null, a1.f139220a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            boolean zG = rVar.G(changePinSuccessful);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: nw1.k
                    @Override // er.a
                    public final Object a() {
                        return l.l(changePinSuccessful);
                    }
                };
                rVar.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(c.a.ChangePinSuccessful changePinSuccessful) {
        changePinSuccessful.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c.a.ChangePinSuccessful changePinSuccessful, int i15, p076m2.r rVar, int i16) {
        j(changePinSuccessful, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1034058333);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1034058333, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.changepin.presentation.ErrorScreen (ChangePinScreen.kt:62)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: nw1.g
                    @Override // er.a
                    public final Object a() {
                        return l.o();
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
            d5VarM.a(new er.p() { // from class: nw1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c.a.Error error, int i15, p076m2.r rVar, int i16) {
        n(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
