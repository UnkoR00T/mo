package kz2;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkz2/o;", "viewModel", "Loq/i0;", "p", "(Lkz2/o;Lm2/r;I)V", "Lkz2/o$a$a;", "screenState", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "k", "(Lkz2/o$a$a;Li70/p;Ler/a;Lm2/r;I)V", "Lkz2/o$a$b;", "data", "h", "(Lkz2/o$a$b;Lm2/r;I)V", "Lkz2/o$a;", "state", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, o.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    private static final void h(final o.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1809497424);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1809497424, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.verification.ErrorScreen (VerificationScreen.kt:87)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: kz2.h
                    @Override // er.a
                    public final Object a() {
                        return k.i();
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
            d5VarM.a(new er.p() { // from class: kz2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(o.a.Error error, int i15, p076m2.r rVar, int i16) {
        h(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final o.a.AuthenticationSuccessful authenticationSuccessful, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(891839832);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(authenticationSuccessful) : rVarH.G(authenticationSuccessful) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(891839832, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.verification.SuccessScreenContent (VerificationScreen.kt:51)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            rVar2 = rVarH;
            i50.s.r(authenticationSuccessful.getScaffoldData(), null, y2.m.d(551971150, true, new er.p() { // from class: kz2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1818418171, true, new er.q() { // from class: kz2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(alVar, pVar, aVar, authenticationSuccessful, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kz2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(authenticationSuccessful, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(551971150, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.verification.SuccessScreenContent.<anonymous> (VerificationScreen.kt:57)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(al alVar, i70.p pVar, er.a aVar, final o.a.AuthenticationSuccessful authenticationSuccessful, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1818418171, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.verification.SuccessScreenContent.<anonymous> (VerificationScreen.kt:60)");
            }
            i70.m.d(alVar, pVar, aVar, null, null, rVar, 6, 24);
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
            q40.i.b(authenticationSuccessful.a(), null, b.f113486a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            boolean zG = rVar.G(authenticationSuccessful);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: kz2.j
                    @Override // er.a
                    public final Object a() {
                        return k.n(authenticationSuccessful);
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
    public static final oq.i0 n(o.a.AuthenticationSuccessful authenticationSuccessful) {
        authenticationSuccessful.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(o.a.AuthenticationSuccessful authenticationSuccessful, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        k(authenticationSuccessful, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-927327973);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-927327973, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.verification.VerificationScreen (VerificationScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(oVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            o.a aVarQ = q(f6VarC);
            if (aVarQ instanceof o.a.NfcInfo) {
                rVarH.X(-2103940760);
                nz2.i.k(((o.a.NfcInfo) aVarQ).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarQ instanceof o.a.NfcScanning) {
                rVarH.X(-2103937620);
                nz2.i.p(((o.a.NfcScanning) aVarQ).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarQ instanceof o.a.Error) {
                rVarH.X(-2103934566);
                h((o.a.Error) aVarQ, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof o.a.AuthenticationSuccessful)) {
                    rVarH.X(-2103942874);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2103931346);
                o.a.AuthenticationSuccessful authenticationSuccessful = (o.a.AuthenticationSuccessful) aVarQ;
                i70.p pVarR = r(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(oVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(oVar);
                    rVarH.v(objE);
                }
                k(authenticationSuccessful, pVarR, (er.a) ((mr.g) objE), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: kz2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final o.a q(f6<? extends o.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(o oVar, int i15, p076m2.r rVar, int i16) {
        p(oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
