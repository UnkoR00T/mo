package bb1;

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
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lbb1/d;", "viewModel", "Loq/i0;", "g", "(Lbb1/d;Lm2/r;I)V", "Lbb1/d$a;", "screenData", "j", "(Lbb1/d$a;Lm2/r;I)V", "Lbb1/d$a$a;", "l", "(Lbb1/d$a$a;Lm2/r;I)V", "Lbb1/d$a$b;", "o", "(Lbb1/d$a$b;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1404742665);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1404742665, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.CompanyServiceUnavailableScreen (CompanyServiceUnavailableScreen.kt:20)");
            }
            j(h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bb1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a h(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1545708980);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1545708980, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.CompanyServiceUnavailableScreenContent (CompanyServiceUnavailableScreen.kt:32)");
            }
            if (aVar instanceof d.a.UnavailableBecauseOfAge) {
                rVarH.X(-632348143);
                l((d.a.UnavailableBecauseOfAge) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.UnavailableBecauseOfMissingTrustedCertificates)) {
                    rVarH.X(-632350890);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-632342772);
                o((d.a.UnavailableBecauseOfMissingTrustedCertificates) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: bb1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.a aVar, int i15, p076m2.r rVar, int i16) {
        j(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final d.a.UnavailableBecauseOfAge unavailableBecauseOfAge, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2030218771);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(unavailableBecauseOfAge) : rVarH.G(unavailableBecauseOfAge) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2030218771, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.UnavailableBecauseOfAge (CompanyServiceUnavailableScreen.kt:48)");
            }
            rVar2 = rVarH;
            i50.s.r(unavailableBecauseOfAge.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1037605632, true, new er.q() { // from class: bb1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(unavailableBecauseOfAge, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: bb1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(unavailableBecauseOfAge, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(d.a.UnavailableBecauseOfAge unavailableBecauseOfAge, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1037605632, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.UnavailableBecauseOfAge.<anonymous> (CompanyServiceUnavailableScreen.kt:53)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q40.i.b(unavailableBecauseOfAge.a(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 n(d.a.UnavailableBecauseOfAge unavailableBecauseOfAge, int i15, p076m2.r rVar, int i16) {
        l(unavailableBecauseOfAge, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final d.a.UnavailableBecauseOfMissingTrustedCertificates unavailableBecauseOfMissingTrustedCertificates, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1134108545);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(unavailableBecauseOfMissingTrustedCertificates) : rVarH.G(unavailableBecauseOfMissingTrustedCertificates) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1134108545, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.UnavailableBecauseOfMissingTrustedCertificates (CompanyServiceUnavailableScreen.kt:68)");
            }
            rVar2 = rVarH;
            i50.s.r(unavailableBecauseOfMissingTrustedCertificates.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1070760108, true, new er.q() { // from class: bb1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.p(unavailableBecauseOfMissingTrustedCertificates, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: bb1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.q(unavailableBecauseOfMissingTrustedCertificates, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(d.a.UnavailableBecauseOfMissingTrustedCertificates unavailableBecauseOfMissingTrustedCertificates, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1070760108, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.serviceunavailable.UnavailableBecauseOfMissingTrustedCertificates.<anonymous> (CompanyServiceUnavailableScreen.kt:72)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q40.i.b(unavailableBecauseOfMissingTrustedCertificates.a(), null, t.f18056a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final i0 q(d.a.UnavailableBecauseOfMissingTrustedCertificates unavailableBecauseOfMissingTrustedCertificates, int i15, p076m2.r rVar, int i16) {
        o(unavailableBecauseOfMissingTrustedCertificates, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
