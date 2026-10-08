package ue0;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lue0/c;", "viewModel", "", "isPreview", "Loq/i0;", "s", "(Lue0/c;ZLm2/r;II)V", "Lue0/c$a$b;", "data", "v", "(Lue0/c$a$b;ZLm2/r;II)V", "bottomSheetVisible", "Ll3/d0;", "bottomSheetFocusRequester", "n", "(Lue0/c$a$b;ZZLl3/d0;Lm2/r;I)V", "Lue0/c$a$a;", "k", "(Lue0/c$a$a;Lm2/r;I)V", "Lue0/c$a;", "state", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void k(final c.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2138557495);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2138557495, i16, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerErrorScreen (QrScannerScreen.kt:147)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ue0.h
                    @Override // er.a
                    public final Object a() {
                        return n.l();
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
            d5VarM.a(new er.p() { // from class: ue0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c.a.Error error, int i15, p076m2.r rVar, int i16) {
        k(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final c.a.Scanner scanner, final boolean z15, final boolean z16, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        l3.d0 d0Var2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-480988308);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(scanner) ? 4 : 2) | i15;
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
                p076m2.t.o(-480988308, i16, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerInnerContent (QrScannerScreen.kt:93)");
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
            i50.s.r(scanner.getScaffoldData(), null, null, 0, 0L, null, null, false, z16 ? d0Var2 : d0Var3, null, d0Var4, null, false, 0.0f, 0.0f, y2.m.d(-1574682215, true, new er.q() { // from class: ue0.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.o(d0Var3, scanner, d0Var4, z15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ue0.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(scanner, z15, z16, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(l3.d0 d0Var, final c.a.Scanner scanner, final l3.d0 d0Var2, final boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1574682215, i16, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerInnerContent.<anonymous> (QrScannerScreen.kt:107)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarA = l3.g0.a(companion, d0Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(a3.l(w0.i.d(mVarA, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), rVar, 0);
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
            j70.h.g(null, null, scanner.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarB = d1.h0.b(i0Var, companion, 1.0f, false, 2, null);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ue0.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.p(d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(objE);
            }
            androidx.compose.material3.l.g(l3.y.a(mVarB, (er.l) objE), aVar.e(rVar, i17).getRadius300(), Color.INSTANCE.a(), 0L, 0.0f, 0.0f, null, y2.m.d(-1861756054, true, new er.p() { // from class: ue0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(scanner, z15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 12583296, 120);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(scanner.getCodeButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 p(l3.d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c.a.Scanner scanner, boolean z15, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1861756054, i15, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerInnerContent.<anonymous>.<anonymous>.<anonymous> (QrScannerScreen.kt:128)");
            }
            if (scanner.getIsCameraPermissionGranted()) {
                rVar.X(1633117801);
                f70.b.b(scanner.getQrScannerData(), scanner.getConnector(), z15, rVar, QrScannerData.f59729c, 0);
                rVar.R();
            } else {
                rVar.X(1633274258);
                e70.c.b(scanner.getCameraPermissionNotGrantedData(), rVar, CameraPermissionNotGrantedData.f47914e);
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
    public static final oq.i0 r(c.a.Scanner scanner, boolean z15, boolean z16, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        n(scanner, z15, z16, d0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final c cVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(749648393);
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
                p076m2.t.o(749648393, i17, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerScreen (QrScannerScreen.kt:38)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            c.a aVarT = t(f6VarC);
            if (aVarT instanceof c.a.Scanner) {
                rVarH.X(-1142391074);
                v((c.a.Scanner) aVarT, z15, rVarH, i17 & 112, 0);
                rVarH.R();
            } else {
                if (!(aVarT instanceof c.a.Error)) {
                    rVarH.X(-1142393373);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1142387022);
                k((c.a.Error) aVarT, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ue0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.u(cVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a t(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(c cVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        s(cVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void v(final c.a.Scanner scanner, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1170318804);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(scanner) ? 4 : 2) | i15;
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
                p076m2.t.o(-1170318804, i17, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerScreenContent (QrScannerScreen.kt:55)");
            }
            oq.x<AccessibilityManager, d60.c, Boolean> xVarV = t70.i.v(scanner.getModalBottomSheetData().getSheetState().getValue(), false, rVarH, 0, 1);
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
            g30.t.f(scanner.getModalBottomSheetData(), 0.0f, accessibilityManagerA.isEnabled(), d0Var, d0Var2, y2.m.d(409233605, true, new er.p() { // from class: ue0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.w(scanner, cVarB, d0Var, d0Var2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1693219898, true, new er.p() { // from class: ue0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(scanner, z15, zBooleanValue, d0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: ue0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.y(scanner, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(c.a.Scanner scanner, d60.c cVar, l3.d0 d0Var, l3.d0 d0Var2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(409233605, i15, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerScreenContent.<anonymous> (QrScannerScreen.kt:68)");
            }
            d70.d.d(scanner.getQrScannerBottomSheetData(), scanner.f(), cVar, d0Var, d0Var2, rVar, QrScannerBottomSheetData.f40126h | 27648);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(c.a.Scanner scanner, boolean z15, boolean z16, l3.d0 d0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1693219898, i15, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.qrscanner.QrScannerScreenContent.<anonymous> (QrScannerScreen.kt:77)");
            }
            n(scanner, z15, z16, d0Var, rVar, 3072);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(c.a.Scanner scanner, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        v(scanner, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
