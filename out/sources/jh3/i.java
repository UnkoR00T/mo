package jh3;

import a70.ShowQrcodeData;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ljh3/c;", "viewModel", "", "isPreview", "Loq/i0;", "m", "(Ljh3/c;ZLm2/r;II)V", "Ljh3/c$a;", "data", "k", "(Ljh3/c$a;ZLm2/r;I)V", "Ljh3/c$a$c;", "h", "(Ljh3/c$a$c;Lm2/r;I)V", "Lmx/a;", "title", "description", "Lj30/a;", "buttonData", "f", "(Lmx/a;Lmx/a;Lj30/a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final void f(final Label label, Label label2, ButtonTextData buttonTextData, p076m2.r rVar, final int i15) {
        int i16;
        final Label label3;
        p076m2.r rVar2;
        final ButtonTextData buttonTextData2 = buttonTextData;
        p076m2.r rVarH = rVar.h(645112291);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(buttonTextData2) : rVarH.G(buttonTextData2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(645112291, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionsshowqr.SectionPage (VehicleCollisionShowQrScreen.kt:80)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            int i18 = i16;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing150()), rVarH, 0);
            j70.h.g(null, null, label2, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, (i18 << 3) & 896, 0, 0, 33030139);
            label3 = label2;
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            buttonTextData2 = buttonTextData;
            j30.f.e(null, buttonTextData2, false, rVar2, (ButtonTextData.f99099f << 3) | ((i18 >> 3) & 112), 5);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            label3 = label2;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(label, label3, buttonTextData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(Label label, Label label2, ButtonTextData buttonTextData, int i15, p076m2.r rVar, int i16) {
        f(label, label2, buttonTextData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c.a.ShowQrCode showQrCode, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1895927858);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(showQrCode) : rVarH.G(showQrCode) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1895927858, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionsshowqr.ShowQrContent (VehicleCollisionShowQrScreen.kt:58)");
            }
            rVar2 = rVarH;
            i50.s.r(showQrCode.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1396427903, true, new er.q() { // from class: jh3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.i(showQrCode, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: jh3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(showQrCode, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.ShowQrCode showQrCode, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1396427903, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionsshowqr.ShowQrContent.<anonymous> (VehicleCollisionShowQrScreen.kt:62)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(w0.i.d(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), null, rVar, 0, 1), rVar, 0);
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
            f(showQrCode.getTitle(), showQrCode.getDescription(), showQrCode.getButtonLink(), rVar, ButtonTextData.f99099f << 6);
            a70.i.g(showQrCode.getShowQrcodeData(), rVar, ShowQrcodeData.f3994f);
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
    public static final i0 j(c.a.ShowQrCode showQrCode, int i15, p076m2.r rVar, int i16) {
        h(showQrCode, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c.a aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1071038641);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1071038641, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionsshowqr.VehicleCollisionShowQrContent (VehicleCollisionShowQrScreen.kt:47)");
            }
            if (aVar instanceof c.a.Empty) {
                rVarH.X(-4847);
                rVarH.R();
            } else if (aVar instanceof c.a.Error) {
                rVarH.X(1524021623);
                ((c.a.Error) aVar).getAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.ShowQrCode)) {
                    rVarH.X(1524019577);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1524022706);
                h((c.a.ShowQrCode) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: jh3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        k(aVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1772300130);
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
            if (p076m2.t.k()) {
                p076m2.t.o(-1772300130, i17, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionsshowqr.VehicleCollisionShowQrScreen (VehicleCollisionShowQrScreen.kt:33)");
            }
            oz.p.j((Context) rVarH.N(AndroidCompositionLocals_androidKt.c()), 0, rVarH, 0, 1);
            k(n(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), z15, rVarH, i17 & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(cVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a n(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        m(cVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
