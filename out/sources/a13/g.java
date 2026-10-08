package a13;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.p;
import er.q;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"La13/c;", "viewModel", "", "isPreview", "Loq/i0;", "g", "(La13/c;ZLm2/r;II)V", "La13/c$a;", "data", "d", "(La13/c$a;ZLm2/r;I)V", "safebus_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final void d(final c.Data data, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-341966565);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-341966565, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.platescanner.SafeBusPlateScannerContentScreen (SafeBusPlateScannerScreen.kt:40)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-367547704, true, new q() { // from class: a13.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.e(data, z15, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a13.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(data, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c.Data data, boolean z15, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-367547704, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.platescanner.SafeBusPlateScannerContentScreen.<anonymous> (SafeBusPlateScannerScreen.kt:45)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, data.getMessage(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 6, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            i20.h.h(k3.f.a(h0.b(i0Var, companion, 1.0f, false, 2, null), aVar.e(rVar, i17).getRadius300()), data.getScannerViewData(), z15, data.getCameraPreviewViewConnector(), rVar, ScannerViewData.f88411c << 3, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            Label bottomMessage = data.getBottomMessage();
            TextStyle textStyleP = aVar.f(rVar, i17).p();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(mVarH, null, bottomMessage, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleP, null, null, false, false, null, rVar, 6, 0, 0, 33026042);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, data.getScannedResult(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).m(), null, null, false, false, null, rVar, 6, 0, 0, 33026042);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(companion, null, false, 3, null), 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.d(), companion2.k(), rVar, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH2);
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
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            h30.q.p(data.getButton(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c.Data data, boolean z15, int i15, r rVar, int i16) {
        d(data, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final c cVar, final boolean z15, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(67760246);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                z15 = false;
            }
            if (t.k()) {
                t.o(67760246, i17, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.platescanner.SafeBusPlateScannerScreen (SafeBusPlateScannerScreen.kt:31)");
            }
            d(h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), z15, rVarH, i17 & 112);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a13.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, z15, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data h(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, boolean z15, int i15, int i16, r rVar, int i17) {
        g(cVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
