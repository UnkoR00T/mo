package i20;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.x;
import er.l;
import f3.m;
import fr.p0;
import n3.m1;
import n3.m2;
import n3.u0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import oz.p;
import p036e4.b0;
import p036e4.c0;
import p036e4.l1;
import p036e4.w0;
import p046f2.ad;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "modifier", "Li20/i;", "data", "", "isPreview", "Lsz/d;", "connector", "Loq/i0;", "h", "(Lf3/m;Li20/i;ZLsz/d;Lm2/r;II)V", "l", "(Li20/i;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f88410b;

        static {
            int[] iArr = new int[ScannerViewData.b.values().length];
            try {
                iArr[ScannerViewData.b.FILL_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScannerViewData.b.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88409a = iArr;
            int[] iArr2 = new int[ScannerViewData.a.values().length];
            try {
                iArr2[ScannerViewData.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScannerViewData.a.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScannerViewData.a.RECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f88410b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void h(m mVar, final ScannerViewData scannerViewData, boolean z15, final sz.d dVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        boolean z16;
        sz.d dVar2;
        boolean z17;
        final m mVar3;
        final boolean z18;
        d5 d5VarM;
        int i18;
        m mVar4;
        boolean z19;
        Object objE;
        int i19;
        r rVarH = rVar.h(1541948108);
        int i25 = i16 & 1;
        if (i25 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(scannerViewData) ? 32 : 16;
        }
        int i26 = i16 & 4;
        if (i26 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                dVar2 = dVar;
                if (rVarH.G(dVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            } else {
                dVar2 = dVar;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                    i18 = i26;
                } else {
                    i18 = i26;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (t.k()) {
                    t.o(1541948108, i17, -1, "pl.gov.coi.common.ui.camera.scanner.CameraScanner (CameraScanner.kt:35)");
                }
                p.j((Context) rVarH.N(AndroidCompositionLocals_androidKt.c()), 0, rVarH, 0, 1);
                z19 = (i17 & 112) == 32;
                objE = rVarH.E();
                if (z19 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: i20.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.i(scannerViewData, (androidx.camera.view.m) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                int i27 = i17 >> 3;
                boolean z25 = z16;
                h20.d.d(mVar4, z25, dVar2, (l) objE, y2.m.d(1373095861, true, new er.p() { // from class: i20.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.j(scannerViewData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i17 & 14) | 24576 | (i27 & 112) | (i27 & 896), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                z18 = z25;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i20.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.k(mVar3, scannerViewData, z18, dVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            dVar2 = dVar;
            if (rVarH.G(dVar2)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i17 |= i19;
        } else {
            dVar2 = dVar;
        }
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i25 != 0) {
                mVar4 = m.INSTANCE;
                i18 = i26;
            } else {
                i18 = i26;
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                z16 = false;
            }
            if (t.k()) {
                t.o(1541948108, i17, -1, "pl.gov.coi.common.ui.camera.scanner.CameraScanner (CameraScanner.kt:35)");
            }
            p.j((Context) rVarH.N(AndroidCompositionLocals_androidKt.c()), 0, rVarH, 0, 1);
            if ((i17 & 112) == 32) {
            }
            objE = rVarH.E();
            if (z19) {
                objE = new l() { // from class: i20.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.i(scannerViewData, (androidx.camera.view.m) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: i20.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.i(scannerViewData, (androidx.camera.view.m) obj);
                    }
                };
                rVarH.v(objE);
            }
            int i28 = i17 >> 3;
            boolean z26 = z16;
            h20.d.d(mVar4, z26, dVar2, (l) objE, y2.m.d(1373095861, true, new er.p() { // from class: i20.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(scannerViewData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | 24576 | (i28 & 112) | (i28 & 896), 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
            z18 = z26;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i20.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(mVar3, scannerViewData, z18, dVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(ScannerViewData scannerViewData, androidx.camera.view.m mVar) {
        androidx.camera.view.m.d dVar;
        int i15 = a.f88409a[scannerViewData.getPreviewScaleType().ordinal()];
        if (i15 == 1) {
            dVar = androidx.camera.view.m.d.FILL_CENTER;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            dVar = androidx.camera.view.m.d.FIT_CENTER;
        }
        mVar.setScaleType(dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ScannerViewData scannerViewData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1373095861, i15, -1, "pl.gov.coi.common.ui.camera.scanner.CameraScanner.<anonymous> (CameraScanner.kt:45)");
            }
            l(scannerViewData, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(m mVar, ScannerViewData scannerViewData, boolean z15, sz.d dVar, int i15, int i16, r rVar, int i17) {
        h(mVar, scannerViewData, z15, dVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [T, m3.i] */
    public static final void l(final ScannerViewData scannerViewData, r rVar, final int i15) {
        int i16;
        er.p<? super r, ? super Integer, i0> pVar;
        d5 d5VarM;
        r rVarH = rVar.h(1508815462);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(scannerViewData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1508815462, i16, -1, "pl.gov.coi.common.ui.camera.scanner.ScannerLayer (CameraScanner.kt:52)");
            }
            int i17 = a.f88410b[scannerViewData.getIndicator().ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    rVarH.X(-2006126820);
                    ad.d(l4.c.c(scannerViewData.getIndicator().getIndicatorResId(), rVarH, 0), null, null, k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().c(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 4);
                    rVarH.R();
                } else {
                    if (i17 != 3) {
                        rVarH.X(-1727283167);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-2005862266);
                    final m2 m2VarA = u0.a();
                    androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(scannerViewData.getIndicator().getIndicatorResId(), rVarH, 0);
                    ViewSize viewSize = scannerViewData.getIndicator().getViewSize();
                    final p0 p0Var = new p0();
                    p0Var.f66410a = new m3.i(0.0f, 0.0f, s.H(viewSize.getViewWidthWithoutPadding(), rVarH, 0), s.H(viewSize.getViewHeightWithoutPadding(), rVarH, 0), m3.a.b((((long) Float.floatToRawIntBits(50.0f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(50.0f)) << 32)), m3.a.b((((long) Float.floatToRawIntBits(50.0f)) << 32) | (((long) Float.floatToRawIntBits(50.0f)) & BodyPartID.bodyIdMax)), m3.a.b((((long) Float.floatToRawIntBits(50.0f)) << 32) | (((long) Float.floatToRawIntBits(50.0f)) & BodyPartID.bodyIdMax)), m3.a.b((((long) Float.floatToRawIntBits(50.0f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(50.0f)) << 32)), null);
                    final float fH = s.H(c5.h.n(viewSize.getHorizontalMargin()), rVarH, 0);
                    final float fH2 = s.H(c5.h.n(viewSize.getVerticalMargin()), rVarH, 0);
                    m.Companion companion = m.INSTANCE;
                    m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    m mVarE = f3.j.e(rVarH, mVarF);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                    if (rVarH.l() == null) {
                        rVarH = rVarH;
                        p076m2.m.d();
                    }
                    rVarH = rVarH;
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarI, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    x xVar = x.f39368a;
                    z.b(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), new l() { // from class: i20.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.n(m2VarA, p0Var, (p3.f) obj);
                        }
                    }, rVarH, 6);
                    ad.d(aVarC, null, l1.a(androidx.compose.foundation.layout.d.v(companion, viewSize.getViewWidth(), viewSize.getViewHeight()), new l() { // from class: i20.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.o(p0Var, fH, fH2, (b0) obj);
                        }
                    }), k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().c(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
                    rVarH.x();
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.X(-2006182186);
                rVarH.R();
                if (t.k()) {
                    t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: i20.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.m(scannerViewData, i15, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: i20.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.p(scannerViewData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ScannerViewData scannerViewData, int i15, r rVar, int i16) {
        l(scannerViewData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 n(m2 m2Var, p0 p0Var, p3.f fVar) {
        m2Var.reset();
        m2.o(m2Var, (m3.i) p0Var.f66410a, null, 2, null);
        int iA = m1.INSTANCE.a();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().e(m2Var, iA);
            p3.f.F1(fVar, new SolidColor(Color.m9copywmQWz5c$default(Color.INSTANCE.a(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null), 0L, 0L, 0.0f, null, null, 0, 126, null);
            return i0.f148189a;
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, m3.i] */
    public static final i0 o(p0 p0Var, float f15, float f16, b0 b0Var) {
        m3.g gVarA = c0.a(b0Var);
        p0Var.f66410a = m3.i.b((m3.i) p0Var.f66410a, gVarA.getLeft() + f15, gVarA.getTop() + f16, gVarA.getRight() - f15, gVarA.getBottom() - f16, 0L, 0L, 0L, 0L, 240, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(ScannerViewData scannerViewData, int i15, r rVar, int i16) {
        l(scannerViewData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
