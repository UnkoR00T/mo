package gh3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.r3;
import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lgh3/e;", "viewModel", "", "isPreview", "Loq/i0;", "z", "(Lgh3/e;ZLm2/r;II)V", "Lgh3/e$a;", "data", "x", "(Lgh3/e$a;ZLm2/r;I)V", "Lgh3/e$a$c;", "q", "(Lgh3/e$a$c;ZLm2/r;I)V", "bottomSheetVisible", "Ll3/d0;", "bottomSheetFocusRequester", "l", "(Lgh3/e$a$c;ZZLl3/d0;Lm2/r;I)V", "Lmx/a;", "title", "description", "Lj30/a;", "buttonData", "v", "(Lmx/a;Lmx/a;Lj30/a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    private static final e.a A(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(e eVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        z(eVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void l(final e.a.ScannerQrCode scannerQrCode, final boolean z15, final boolean z16, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        l3.d0 d0Var2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1517372035);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(scannerQrCode) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            d0Var2 = d0Var;
            i16 |= rVarH.W(d0Var2) ? 2048 : 1024;
        } else {
            d0Var2 = d0Var;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1517372035, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.QRScannerInnerContent (VehicleCollisionScannerQrScreen.kt:107)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l3.d0();
                rVarH.v(objE);
            }
            final l3.d0 d0Var3 = (l3.d0) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new l3.d0();
                rVarH.v(objE2);
            }
            final l3.d0 d0Var4 = (l3.d0) objE2;
            rVar2 = rVarH;
            i50.s.r(scannerQrCode.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, z16 ? d0Var2 : d0Var3, null, d0Var4, null, false, 0.0f, 0.0f, y2.m.d(992332138, true, new er.q() { // from class: gh3.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.m(d0Var3, scannerQrCode, d0Var4, z15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196614, 31486);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gh3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.p(scannerQrCode, z15, z16, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(l3.d0 d0Var, final e.a.ScannerQrCode scannerQrCode, final l3.d0 d0Var2, final boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(992332138, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.QRScannerInnerContent.<anonymous> (VehicleCollisionScannerQrScreen.kt:121)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(l3.g0.a(companion, d0Var), d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: gh3.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.n(d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = l3.y.a(companion, (er.l) objE);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarA);
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
            v(scannerQrCode.getTitle(), scannerQrCode.getDescription(), scannerQrCode.getButtonLink(), rVar, ButtonTextData.f99099f << 6);
            rVar.x();
            androidx.compose.material3.l.g(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), aVar.e(rVar, i17).getRadius300(), Color.INSTANCE.a(), 0L, 0.0f, 0.0f, null, y2.m.d(-2079044613, true, new er.p() { // from class: gh3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.o(scannerQrCode, z15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 12583296, 120);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing400()), rVar, 0);
            h30.q.p(scannerQrCode.getCodeButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 n(l3.d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(e.a.ScannerQrCode scannerQrCode, boolean z15, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2079044613, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.QRScannerInnerContent.<anonymous>.<anonymous>.<anonymous> (VehicleCollisionScannerQrScreen.kt:142)");
            }
            if (scannerQrCode.getIsCameraPermissionGranted()) {
                rVar.X(905371704);
                f70.b.b(scannerQrCode.getQrScannerData(), scannerQrCode.getConnector(), z15, rVar, QrScannerData.f59729c, 0);
                rVar.R();
            } else {
                rVar.X(905528161);
                e70.c.b(scannerQrCode.getCameraPermissionNotGrantedData(), rVar, CameraPermissionNotGrantedData.f47914e);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e.a.ScannerQrCode scannerQrCode, boolean z15, boolean z16, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        l(scannerQrCode, z15, z16, d0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final e.a.ScannerQrCode scannerQrCode, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1065226148);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(scannerQrCode) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1065226148, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.ScannerQrCodeContent (VehicleCollisionScannerQrScreen.kt:66)");
            }
            oq.x<AccessibilityManager, d60.c, Boolean> xVarV = t70.i.v(scannerQrCode.getModalBottomSheetData().getSheetState().getValue(), scannerQrCode.getBottomSheetDialog().getShowKeyBoard(), rVarH, 0, 0);
            AccessibilityManager accessibilityManagerA = xVarV.a();
            final d60.c cVarB = xVarV.b();
            final boolean zBooleanValue = xVarV.c().booleanValue();
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l3.d0();
                rVarH.v(objE);
            }
            final l3.d0 d0Var = (l3.d0) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new l3.d0();
                rVarH.v(objE2);
            }
            final l3.d0 d0Var2 = (l3.d0) objE2;
            g30.t.f(scannerQrCode.getModalBottomSheetData(), 0.0f, accessibilityManagerA.isEnabled(), d0Var, d0Var2, y2.m.d(-2120515779, true, new er.p() { // from class: gh3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.r(scannerQrCode, cVarB, d0Var, d0Var2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-305028290, true, new er.p() { // from class: gh3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.t(scannerQrCode, z15, zBooleanValue, d0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1797120, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gh3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.u(scannerQrCode, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(final e.a.ScannerQrCode scannerQrCode, final d60.c cVar, l3.d0 d0Var, l3.d0 d0Var2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2120515779, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.ScannerQrCodeContent.<anonymous> (VehicleCollisionScannerQrScreen.kt:82)");
            }
            QrScannerBottomSheetData qrScannerBottomSheetData = scannerQrCode.getQrScannerBottomSheetData();
            boolean zG = rVar.G(scannerQrCode) | rVar.W(cVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gh3.l
                    @Override // er.a
                    public final Object a() {
                        return q.s(scannerQrCode, cVar);
                    }
                };
                rVar.v(objE);
            }
            d70.d.d(qrScannerBottomSheetData, (er.a) objE, cVar, d0Var, d0Var2, rVar, QrScannerBottomSheetData.f40126h | 27648);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(e.a.ScannerQrCode scannerQrCode, d60.c cVar) {
        scannerQrCode.i().b(cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a.ScannerQrCode scannerQrCode, boolean z15, boolean z16, l3.d0 d0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-305028290, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.ScannerQrCodeContent.<anonymous> (VehicleCollisionScannerQrScreen.kt:91)");
            }
            l(scannerQrCode, z15, z16, d0Var, rVar, 3072);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(e.a.ScannerQrCode scannerQrCode, boolean z15, int i15, p076m2.r rVar, int i16) {
        q(scannerQrCode, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final Label label, Label label2, ButtonTextData buttonTextData, p076m2.r rVar, final int i15) {
        int i16;
        final Label label3;
        p076m2.r rVar2;
        final ButtonTextData buttonTextData2 = buttonTextData;
        p076m2.r rVarH = rVar.h(920440484);
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
                p076m2.t.o(920440484, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.SectionPage (VehicleCollisionScannerQrScreen.kt:159)");
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
            d5VarM.a(new er.p() { // from class: gh3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.w(label, label3, buttonTextData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(Label label, Label label2, ButtonTextData buttonTextData, int i15, p076m2.r rVar, int i16) {
        v(label, label2, buttonTextData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final e.a aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-200492097);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-200492097, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.VehicleCollisionScannerQrContent (VehicleCollisionScannerQrScreen.kt:54)");
            }
            if (aVar instanceof e.a.Error) {
                rVarH.X(600627079);
                ((e.a.Error) aVar).getAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.ScannerQrCode)) {
                    rVarH.X(600625752);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(600628292);
                q((e.a.ScannerQrCode) aVar, z15, rVarH, i16 & 126);
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
            d5VarM.a(new er.p() { // from class: gh3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.y(aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(e.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        x(aVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final e eVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1257848752);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
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
                p076m2.t.o(-1257848752, i17, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclecollisionscannerqr.VehicleCollisionScannerQrScreen (VehicleCollisionScannerQrScreen.kt:41)");
            }
            x(A(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), z15, rVarH, i17 & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gh3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.B(eVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
