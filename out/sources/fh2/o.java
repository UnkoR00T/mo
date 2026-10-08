package fh2;

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
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lfh2/e;", "viewModel", "", "isPreview", "Loq/i0;", "u", "(Lfh2/e;ZLm2/r;II)V", "Lfh2/e$a;", "data", "s", "(Lfh2/e$a;ZLm2/r;I)V", "Lfh2/e$a$c;", "n", "(Lfh2/e$a$c;ZLm2/r;I)V", "bottomSheetVisible", "Ll3/d0;", "bottomSheetFocusRequester", "j", "(Lfh2/e$a$c;ZZLl3/d0;Lm2/r;I)V", "state", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    private static final void j(final e.a.ScannerQrCode scannerQrCode, final boolean z15, final boolean z16, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        l3.d0 d0Var2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-344109485);
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
                p076m2.t.o(-344109485, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.QRScannerInnerContent (ScannerQrScreen.kt:103)");
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
            rVar2 = rVarH;
            i50.s.r(scannerQrCode.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, z16 ? d0Var2 : d0Var3, null, (l3.d0) objE2, null, false, 0.0f, 0.0f, y2.m.d(111117766, true, new er.q() { // from class: fh2.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.k(d0Var3, scannerQrCode, z15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fh2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.m(scannerQrCode, z15, z16, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(l3.d0 d0Var, final e.a.ScannerQrCode scannerQrCode, final boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(111117766, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.QRScannerInnerContent.<anonymous> (ScannerQrScreen.kt:117)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(l3.g0.a(companion, d0Var), d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, scannerQrCode.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            androidx.compose.material3.l.g(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), aVar.e(rVar, i17).getRadius300(), Color.INSTANCE.a(), 0L, 0.0f, 0.0f, null, y2.m.d(-198236651, true, new er.p() { // from class: fh2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.l(scannerQrCode, z15, (p076m2.r) obj, ((Integer) obj2).intValue());
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
    public static final oq.i0 l(e.a.ScannerQrCode scannerQrCode, boolean z15, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-198236651, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.QRScannerInnerContent.<anonymous>.<anonymous>.<anonymous> (ScannerQrScreen.kt:138)");
            }
            if (scannerQrCode.getIsCameraPermissionGranted()) {
                rVar.X(-87975970);
                f70.b.b(scannerQrCode.getQrScannerData(), scannerQrCode.getConnector(), z15, rVar, QrScannerData.f59729c, 0);
                rVar.R();
            } else {
                rVar.X(-87819513);
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
    public static final oq.i0 m(e.a.ScannerQrCode scannerQrCode, boolean z15, boolean z16, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        j(scannerQrCode, z15, z16, d0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final e.a.ScannerQrCode scannerQrCode, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1157093964);
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
                p076m2.t.o(1157093964, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.ScannerQrCodeContent (ScannerQrScreen.kt:62)");
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
            g30.t.f(scannerQrCode.getModalBottomSheetData(), 0.0f, accessibilityManagerA.isEnabled(), d0Var, d0Var2, y2.m.d(653857939, true, new er.p() { // from class: fh2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.o(scannerQrCode, cVarB, d0Var, d0Var2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(308942194, true, new er.p() { // from class: fh2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.q(scannerQrCode, z15, zBooleanValue, d0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: fh2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.r(scannerQrCode, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final e.a.ScannerQrCode scannerQrCode, final d60.c cVar, l3.d0 d0Var, l3.d0 d0Var2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(653857939, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.ScannerQrCodeContent.<anonymous> (ScannerQrScreen.kt:78)");
            }
            QrScannerBottomSheetData qrScannerBottomSheetData = scannerQrCode.getQrScannerBottomSheetData();
            boolean zG = rVar.G(scannerQrCode) | rVar.W(cVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fh2.k
                    @Override // er.a
                    public final Object a() {
                        return o.p(scannerQrCode, cVar);
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
    public static final oq.i0 p(e.a.ScannerQrCode scannerQrCode, d60.c cVar) {
        scannerQrCode.h().b(cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(e.a.ScannerQrCode scannerQrCode, boolean z15, boolean z16, l3.d0 d0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(308942194, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.ScannerQrCodeContent.<anonymous> (ScannerQrScreen.kt:87)");
            }
            j(scannerQrCode, z15, z16, d0Var, rVar, 3072);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(e.a.ScannerQrCode scannerQrCode, boolean z15, int i15, p076m2.r rVar, int i16) {
        n(scannerQrCode, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final e.a aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(788171799);
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
                p076m2.t.o(788171799, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.ScannerQrContent (ScannerQrScreen.kt:50)");
            }
            if (aVar instanceof e.a.Error) {
                rVarH.X(1518858207);
                ((e.a.Error) aVar).getAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.ScannerQrCode)) {
                    rVarH.X(1518856880);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1518859420);
                n((e.a.ScannerQrCode) aVar, z15, rVarH, i16 & 126);
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
            d5VarM.a(new er.p() { // from class: fh2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.t(aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        s(aVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final e eVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-2132420762);
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
                p076m2.t.o(-2132420762, i17, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.scannerqr.ScannerQrScreen (ScannerQrScreen.kt:37)");
            }
            s(v(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), z15, rVarH, i17 & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fh2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.w(eVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a v(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(e eVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        u(eVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
