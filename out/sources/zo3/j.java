package zo3;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.r3;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import w0.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\f\u0010\r\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lzo3/c;", "viewModel", "", "testMode", "Loq/i0;", "l", "(Lzo3/c;ZLm2/r;II)V", "Lzo3/c$a$b;", "data", "Ld1/d3;", "paddingValues", "i", "(Lzo3/c$a$b;ZLd1/d3;Lm2/r;I)V", "state", "g", "(Lzo3/c$a$b;Lm2/r;I)V", "Lzo3/c$a;", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void g(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1455308136);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1455308136, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerBottomSheetContent (ScannerScreen.kt:103)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarA = q0.a(companion);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarA, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 7, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, initialized.getBottomSheetData().getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVar2, 6, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            v0.g(initialized.getBottomSheetData().getCodeInputData(), null, rVar2, v50.c.f203957t, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing400()), rVar2, 0);
            h30.q.p(initialized.getBottomSheetData().getNextButtonData(), false, null, rVar2, 0, 6);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void i(final c.a.Initialized initialized, final boolean z15, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1582786023);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(d3Var) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1582786023, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerInnerContent (ScannerScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(companion, d3Var), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            Label title = initialized.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            androidx.compose.material3.l.g(h0.b(i0Var, companion, 1.0f, false, 2, null), aVar.e(rVarH, i17).getRadius300(), Color.INSTANCE.a(), 0L, 0.0f, 0.0f, null, y2.m.d(-290010006, true, new er.p() { // from class: zo3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.j(initialized, z15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12583296, 120);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing400()), rVarH, 0);
            h30.q.p(initialized.getCodeButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(initialized, z15, d3Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(c.a.Initialized initialized, boolean z15, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-290010006, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerInnerContent.<anonymous>.<anonymous> (ScannerScreen.kt:84)");
            }
            if (initialized.getIsCameraPermissionGranted()) {
                rVar.X(1786168530);
                f70.b.b(initialized.getQrScannerData(), initialized.getConnector(), z15, rVar, QrScannerData.f59729c, 0);
                rVar.R();
            } else {
                rVar.X(1786316586);
                e70.c.b(initialized.getCameraPermissionNotGrantedData(), rVar, CameraPermissionNotGrantedData.f47914e);
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
    public static final oq.i0 k(c.a.Initialized initialized, boolean z15, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        i(initialized, z15, d3Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void l(final c cVar, boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        boolean z17;
        d5 d5VarM;
        final boolean z18;
        final c.a aVarM;
        boolean z19;
        p076m2.r rVarH = rVar.h(-1457041813);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1457041813, i17, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerScreen (ScannerScreen.kt:35)");
                }
                aVarM = m(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
                if (aVarM instanceof c.a.C6379a) {
                    rVarH.X(-57836945);
                    rVarH.R();
                    z19 = z18;
                } else {
                    if (aVarM instanceof c.a.Initialized) {
                        rVarH.X(-57838430);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1792879015);
                    c.a.Initialized initialized = (c.a.Initialized) aVarM;
                    z19 = z18;
                    g30.m.j(initialized.getBottomSheetData().getModalSheetData(), initialized.getBaseScaffoldData(), 0.0f, null, null, null, y2.m.d(-928441753, true, new er.p() { // from class: zo3.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.n(aVarM, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), y2.m.d(170214691, true, new er.q() { // from class: zo3.e
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return j.o(aVarM, z18, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 60);
                    p088nul.q0.g(false, initialized.f(), rVarH, 0, 1);
                    oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z16 = z19;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: zo3.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.p(cVar, z16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i17 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1457041813, i17, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerScreen (ScannerScreen.kt:35)");
            }
            aVarM = m(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarM instanceof c.a.C6379a) {
                rVarH.X(-57836945);
                rVarH.R();
                z19 = z18;
            } else {
                if (aVarM instanceof c.a.Initialized) {
                    rVarH.X(-57838430);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1792879015);
                c.a.Initialized initialized2 = (c.a.Initialized) aVarM;
                z19 = z18;
                g30.m.j(initialized2.getBottomSheetData().getModalSheetData(), initialized2.getBaseScaffoldData(), 0.0f, null, null, null, y2.m.d(-928441753, true, new er.p() { // from class: zo3.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.n(aVarM, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(170214691, true, new er.q() { // from class: zo3.e
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return j.o(aVarM, z18, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 60);
                p088nul.q0.g(false, initialized2.f(), rVarH, 0, 1);
                oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z16 = z19;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zo3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(cVar, z16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a m(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-928441753, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerScreen.<anonymous> (ScannerScreen.kt:45)");
            }
            g((c.a.Initialized) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(c.a aVar, boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(170214691, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.scanner.ScannerScreen.<anonymous> (ScannerScreen.kt:48)");
            }
            i((c.a.Initialized) aVar, z15, d3Var, rVar, (i15 << 6) & 896);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c cVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        l(cVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
