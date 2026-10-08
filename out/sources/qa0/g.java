package qa0;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lqa0/c;", "viewModel", "Loq/i0;", "h", "(Lqa0/c;Lm2/r;I)V", "Lqa0/c$a;", "screenData", "d", "(Lqa0/c$a;Lm2/r;I)Loq/i0;", "Li70/p;", "snackBarState", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final i0 d(final c.Data data, p076m2.r rVar, int i15) {
        i0 i0Var;
        if (p076m2.t.k()) {
            p076m2.t.o(886008408, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.biometric.BiometricContent (BiometricScreen.kt:34)");
        }
        rVar.X(1050558351);
        final f6 f6VarB = m7.b.b(data.getSnackBarManagerStateHolder().j(), i70.p.a.f89857a, null, null, null, rVar, i70.p.a.f89858b << 3, 14);
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new al();
            rVar.v(objE);
        }
        final al alVar = (al) objE;
        i70.m.d(alVar, e(f6VarB), data.c(), null, null, rVar, 6, 24);
        i50.s.r(data.getScaffoldData(), null, y2.m.d(-2030661682, true, new er.p() { // from class: qa0.e
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g.f(alVar, f6VarB, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-101563017, true, new er.q() { // from class: qa0.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g.g(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
        cb4.i dialogVMSAdapter = data.getDialogVMSAdapter();
        if (dialogVMSAdapter == null) {
            rVar.X(-174291723);
            rVar.R();
            i0Var = null;
        } else {
            rVar.X(1795493004);
            dialogVMSAdapter.b(rVar, 0);
            rVar.R();
            i0Var = i0.f148189a;
        }
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    private static final i70.p e(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(al alVar, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2030661682, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.biometric.BiometricContent.<anonymous>.<anonymous> (BiometricScreen.kt:47)");
            }
            i70.d.d(alVar, e(f6Var), false, rVar, 390, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-101563017, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.biometric.BiometricContent.<anonymous>.<anonymous> (BiometricScreen.kt:54)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n50.k biometricCardData = data.getBiometricCardData();
            if (biometricCardData == null) {
                rVar.X(1323926889);
            } else {
                rVar.X(1323926890);
                h0.v(biometricCardData, null, rVar, 0, 2);
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final void h(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1896839271);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1896839271, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.biometric.BiometricScreen (BiometricScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            d(i(f6VarC), rVarH, 0);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            q0.g(false, i(f6VarC).d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qa0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data i(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c cVar, int i15, p076m2.r rVar, int i16) {
        h(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
