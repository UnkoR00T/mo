package c71;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lc71/i;", "viewModel", "Loq/i0;", "i", "(Lc71/i;Lm2/r;I)V", "Lc71/i$a$d;", "screenData", "l", "(Lc71/i$a$d;Lm2/r;I)V", "Lc71/i$a$c;", "f", "(Lc71/i$a$c;Lm2/r;I)V", "Lc71/i$a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void f(final i.a.NoTrustedProfile noTrustedProfile, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(246094087);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noTrustedProfile) : rVarH.G(noTrustedProfile) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(246094087, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ChildPassportApplicationAuthorizationCheckNoTrustedProfileContent (ChildPassportApplicationAuthorizationCheckScreen.kt:55)");
            }
            i50.s.r(noTrustedProfile.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1922070721, true, new er.q() { // from class: c71.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.g(noTrustedProfile, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, noTrustedProfile.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c71.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.h(noTrustedProfile, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(i.a.NoTrustedProfile noTrustedProfile, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1922070721, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ChildPassportApplicationAuthorizationCheckNoTrustedProfileContent.<anonymous>.<anonymous> (ChildPassportApplicationAuthorizationCheckScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q40.i.b(noTrustedProfile.b(), null, k0.f23875a.d(), rVar, IconPageData.f164667h | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
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
    public static final oq.i0 h(i.a.NoTrustedProfile noTrustedProfile, int i15, p076m2.r rVar, int i16) {
        f(noTrustedProfile, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1192657670);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1192657670, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ChildPassportApplicationAuthorizationCheckScreen (ChildPassportApplicationAuthorizationCheckScreen.kt:23)");
            }
            i.a aVarJ = j(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarJ instanceof i.a.C0637a) {
                rVarH.X(612253675);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarJ instanceof i.a.Underage) {
                rVarH.X(612255073);
                l((i.a.Underage) aVarJ, rVarH, 0);
                rVarH.R();
            } else if (aVarJ instanceof i.a.NoTrustedProfile) {
                rVarH.X(612258414);
                f((i.a.NoTrustedProfile) aVarJ, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof i.a.Error)) {
                    rVarH.X(612252138);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(612262178);
                ((i.a.Error) aVarJ).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: c71.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.k(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a j(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i iVar, int i15, p076m2.r rVar, int i16) {
        i(iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final i.a.Underage underage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1048562745);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(underage) : rVarH.G(underage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1048562745, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ChildPassportApplicationAuthorizationUnderageContent (ChildPassportApplicationAuthorizationCheckScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(underage.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-213614507, true, new er.q() { // from class: c71.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.m(underage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: c71.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.n(underage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(i.a.Underage underage, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-213614507, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.authorizationcheck.ChildPassportApplicationAuthorizationUnderageContent.<anonymous>.<anonymous> (ChildPassportApplicationAuthorizationCheckScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q40.i.b(underage.b(), null, k0.f23875a.c(), rVar, IconPageData.f164667h | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
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
    public static final oq.i0 n(i.a.Underage underage, int i15, p076m2.r rVar, int i16) {
        l(underage, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
