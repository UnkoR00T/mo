package kp2;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkp2/e;", "viewModel", "Loq/i0;", "g", "(Lkp2/e;Lm2/r;I)V", "Lkp2/e$a$c;", "screenData", "d", "(Lkp2/e$a$c;Lm2/r;I)V", "Lkp2/e$a;", "passportagreement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(final e.a.NoTrustedProfile noTrustedProfile, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(44751379);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noTrustedProfile) : rVarH.G(noTrustedProfile) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(44751379, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.authorizationcheck.PassportAgreementAuthorizationCheckNoTrustedProfileContent (PassportAgreementAuthorizationCheckScreen.kt:34)");
            }
            i50.s.r(noTrustedProfile.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(482277595, true, new er.q() { // from class: kp2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.e(noTrustedProfile, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: kp2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(noTrustedProfile, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(e.a.NoTrustedProfile noTrustedProfile, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(482277595, i15, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.authorizationcheck.PassportAgreementAuthorizationCheckNoTrustedProfileContent.<anonymous>.<anonymous> (PassportAgreementAuthorizationCheckScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
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
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            q40.i.b(noTrustedProfile.b(), null, b.f112174a.b(), rVar, IconPageData.f164667h | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e.a.NoTrustedProfile noTrustedProfile, int i15, p076m2.r rVar, int i16) {
        d(noTrustedProfile, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(579191110);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(579191110, i16, -1, "pl.gov.coi.mobywatel.feature.passportagreement.presentation.authorizationcheck.PassportAgreementAuthorizationCheckScreen (PassportAgreementAuthorizationCheckScreen.kt:23)");
            }
            e.a aVarH = h(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof e.a.b) {
                rVarH.X(-1743085609);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarH instanceof e.a.NoTrustedProfile) {
                rVarH.X(-1743083949);
                d((e.a.NoTrustedProfile) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof e.a.Error)) {
                    rVarH.X(-1743087125);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1743080402);
                ((e.a.Error) aVarH).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: kp2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a h(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e eVar, int i15, p076m2.r rVar, int i16) {
        g(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
