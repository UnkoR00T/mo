package fc3;

import d1.a3;
import d1.d3;
import d1.r3;
import d1.x;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t40.InfoRowListData;
import t70.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lfc3/e;", "viewModel", "Loq/i0;", "j", "(Lfc3/e;Lm2/r;I)V", "Lf3/m;", "modifier", "Lmx/a;", "title", "Lt40/b;", "bullets", "h", "(Lf3/m;Lmx/a;Lt40/b;Lm2/r;I)V", "Lh30/a;", "buttonData", "f", "(Lf3/m;Lh30/a;Lm2/r;II)V", "Lfc3/e$a;", "data", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void f(final f3.m mVar, ButtonData buttonData, r rVar, final int i15, final int i16) {
        int i17;
        final ButtonData buttonData2;
        r rVarH = rVar.h(-544132043);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (t.k()) {
                t.o(-544132043, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.welcome.BottomBar (TripWelcomeScreen.kt:68)");
            }
            f3.m mVarN = a3.n(mVar, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            int i19 = (i17 >> 3) & 14;
            buttonData2 = buttonData;
            h30.q.p(buttonData2, false, null, rVarH, i19, 6);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            buttonData2 = buttonData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fc3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(mVar, buttonData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f3.m mVar, ButtonData buttonData, int i15, int i16, r rVar, int i17) {
        f(mVar, buttonData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void h(final f3.m mVar, final Label label, InfoRowListData infoRowListData, r rVar, final int i15) {
        int i16;
        final InfoRowListData infoRowListData2;
        r rVar2;
        r rVarH = rVar.h(1398795060);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(infoRowListData) : rVarH.G(infoRowListData) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(1398795060, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.welcome.Content (TripWelcomeScreen.kt:49)");
            }
            f3.m mVarN = s.n(t70.i.S(mVar, null, rVarH, i16 & 14, 1), rVarH, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).m(), null, null, false, false, null, rVarH, (i16 << 3) & 896, 0, 0, 33030139);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            infoRowListData2 = infoRowListData;
            s40.g.c(infoRowListData2, 0.0f, rVar2, InfoRowListData.f187643b | ((i16 >> 6) & 14), 2);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            infoRowListData2 = infoRowListData;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fc3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(mVar, label, infoRowListData2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f3.m mVar, Label label, InfoRowListData infoRowListData, int i15, r rVar, int i16) {
        h(mVar, label, infoRowListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e eVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-888295775);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-888295775, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.welcome.TripWelcomeScreen (TripWelcomeScreen.kt:29)");
            }
            final f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(k(f6VarC).getScaffoldData(), y2.m.d(-1127653428, true, new er.p() { // from class: fc3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(f6VarC, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1396880084, true, new er.q() { // from class: fc3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fc3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data k(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f6 f6Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1127653428, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.welcome.TripWelcomeScreen.<anonymous> (TripWelcomeScreen.kt:33)");
            }
            f(null, k(f6Var).getButtonData(), rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f6 f6Var, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1396880084, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.welcome.TripWelcomeScreen.<anonymous> (TripWelcomeScreen.kt:35)");
            }
            h(a3.l(f3.m.INSTANCE, d3Var), k(f6Var).getTitle(), k(f6Var).getBullets(), rVar, InfoRowListData.f187643b << 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e eVar, int i15, r rVar, int i16) {
        j(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
