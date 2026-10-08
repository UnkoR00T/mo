package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.c0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.n;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.q;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.v;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.w;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.x;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dn.b0;
import dn.d0;
import dn.f0;
import dn.g;
import dn.h;
import dn.h0;
import dn.j;
import dn.l0;
import dn.m;
import dn.p0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg.s;
import org.bouncycastle.crypto.hpke.HPKE;
import rg.b;
import rg.d;
import yj.e;
import yj.f;
import yj.i;
import yj.l;

/* JADX INFO: loaded from: classes4.dex */
final class a extends o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f36880g = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double[][] f36881h = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f36882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f36883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BarhopperV3 f36884f;

    a(Context context, c0 c0Var) {
        this.f36882d = context;
        this.f36883e = c0Var;
    }

    private final RecognitionOptions m3() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.a(this.f36883e.h());
        recognitionOptions.f(this.f36883e.m());
        recognitionOptions.b(true);
        recognitionOptions.c(true);
        return recognitionOptions;
    }

    private static o n3(b0 b0Var, String str, String str2) {
        if (b0Var == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new o(b0Var.O(), b0Var.M(), b0Var.J(), b0Var.K(), b0Var.L(), b0Var.N(), b0Var.R(), matcher.find() ? matcher.group(1) : null);
    }

    private final dn.a o3(ByteBuffer byteBuffer, f1 f1Var, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) s.l(this.f36884f);
        if (((ByteBuffer) s.l(byteBuffer)).isDirect()) {
            return barhopperV3.h(f1Var.r(), f1Var.h(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.m(f1Var.r(), f1Var.h(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.m(f1Var.r(), f1Var.h(), bArr, recognitionOptions);
    }

    private final List p3(b bVar, f1 f1Var, RecognitionOptions recognitionOptions) {
        dn.a aVarP;
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.s sVar;
        v vVar;
        w wVar;
        y yVar;
        x xVar;
        t tVar;
        p pVar;
        q qVar;
        r rVar;
        byte b15;
        Point[] pointArr;
        int i15;
        v[] vVarArr;
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.s[] sVarArr;
        n[] nVarArr;
        int iM = f1Var.m();
        byte b16 = -1;
        if (iM == -1) {
            aVarP = ((BarhopperV3) s.l(this.f36884f)).p((Bitmap) d.n3(bVar), recognitionOptions);
        } else if (iM == 17) {
            aVarP = o3((ByteBuffer) d.n3(bVar), f1Var, recognitionOptions);
        } else if (iM != 35) {
            if (iM != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + f1Var.m());
            }
            aVarP = o3((ByteBuffer) d.n3(bVar), f1Var, recognitionOptions);
        } else {
            aVarP = o3(((Image) s.l((Image) d.n3(bVar))).getPlanes()[0].getBuffer(), f1Var, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        Matrix matrixE = wm.d.b().e(f1Var.r(), f1Var.h(), f1Var.p());
        for (dn.s sVar2 : aVarP.L()) {
            if (sVar2.K() > 0 && matrixE != null) {
                float[] fArr = new float[8];
                List listX = sVar2.X();
                int iK = sVar2.K();
                for (int i16 = 0; i16 < iK; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((h) listX.get(i16)).J();
                    fArr[i17 + 1] = ((h) listX.get(i16)).K();
                }
                matrixE.mapPoints(fArr);
                int iP = f1Var.p();
                int i18 = 0;
                while (i18 < iK) {
                    dn.r rVar2 = (dn.r) sVar2.i();
                    int i19 = i18 + i18;
                    byte b17 = b16;
                    g gVarL = h.L();
                    gVarL.o((int) fArr[i19]);
                    gVarL.p((int) fArr[i19 + 1]);
                    rVar2.o((i18 + iP) % iK, (h) gVarL.k());
                    sVar2 = (dn.s) rVar2.k();
                    i18++;
                    b16 = b17;
                }
            }
            byte b18 = b16;
            if (sVar2.c0()) {
                l0 l0VarQ = sVar2.Q();
                sVar = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.s(l0VarQ.O() - 1, l0VarQ.L(), l0VarQ.N(), l0VarQ.M());
            } else {
                sVar = null;
            }
            if (sVar2.e0()) {
                r1 r1VarL = sVar2.L();
                vVar = new v(r1VarL.M() - 1, r1VarL.L());
            } else {
                vVar = null;
            }
            if (sVar2.f0()) {
                j jVarS = sVar2.S();
                wVar = new w(jVarS.L(), jVarS.M());
            } else {
                wVar = null;
            }
            if (sVar2.h0()) {
                dn.q qVarU = sVar2.U();
                yVar = new y(qVarU.M(), qVarU.L(), qVarU.N() - 1);
            } else {
                yVar = null;
            }
            if (sVar2.g0()) {
                m mVarT = sVar2.T();
                xVar = new x(mVarT.L(), mVarT.M());
            } else {
                xVar = null;
            }
            if (sVar2.d0()) {
                p0 p0VarR = sVar2.R();
                tVar = new t(p0VarR.J(), p0VarR.K());
            } else {
                tVar = null;
            }
            if (sVar2.Z()) {
                d0 d0VarN = sVar2.N();
                pVar = new p(d0VarN.R(), d0VarN.N(), d0VarN.O(), d0VarN.P(), d0VarN.Q(), n3(d0VarN.K(), sVar2.V().v() ? sVar2.V().F() : null, "DTSTART:([0-9TZ]*)"), n3(d0VarN.J(), sVar2.V().v() ? sVar2.V().F() : null, "DTEND:([0-9TZ]*)"));
            } else {
                pVar = null;
            }
            if (sVar2.a0()) {
                f0 f0VarO = sVar2.O();
                n1 n1VarJ = f0VarO.J();
                u uVar = n1VarJ != null ? new u(n1VarJ.M(), n1VarJ.Q(), n1VarJ.P(), n1VarJ.L(), n1VarJ.O(), n1VarJ.N(), n1VarJ.R()) : null;
                String strM = f0VarO.M();
                String strN = f0VarO.N();
                List listQ = f0VarO.Q();
                if (listQ.isEmpty()) {
                    vVarArr = null;
                } else {
                    v[] vVarArr2 = new v[listQ.size()];
                    for (int i25 = 0; i25 < listQ.size(); i25++) {
                        vVarArr2[i25] = new v(((r1) listQ.get(i25)).M() - 1, ((r1) listQ.get(i25)).L());
                    }
                    vVarArr = vVarArr2;
                }
                List listP = f0VarO.P();
                if (listP.isEmpty()) {
                    sVarArr = null;
                } else {
                    com.google.android.gms.internal.mlkit_vision_barcode_bundled.s[] sVarArr2 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.s[listP.size()];
                    for (int i26 = 0; i26 < listP.size(); i26++) {
                        sVarArr2[i26] = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.s(((l0) listP.get(i26)).O() - 1, ((l0) listP.get(i26)).L(), ((l0) listP.get(i26)).N(), ((l0) listP.get(i26)).M());
                    }
                    sVarArr = sVarArr2;
                }
                String[] strArr = (String[]) f0VarO.R().toArray(new String[0]);
                List listO = f0VarO.O();
                if (listO.isEmpty()) {
                    nVarArr = null;
                } else {
                    n[] nVarArr2 = new n[listO.size()];
                    for (int i27 = 0; i27 < listO.size(); i27++) {
                        nVarArr2[i27] = new n(((l1) listO.get(i27)).L() - 1, (String[]) ((l1) listO.get(i27)).K().toArray(new String[0]));
                    }
                    nVarArr = nVarArr2;
                }
                qVar = new q(uVar, strM, strN, vVarArr, sVarArr, strArr, nVarArr);
            } else {
                qVar = null;
            }
            if (sVar2.b0()) {
                h0 h0VarP = sVar2.P();
                rVar = new r(h0VarP.Q(), h0VarP.S(), h0VarP.Y(), h0VarP.W(), h0VarP.T(), h0VarP.N(), h0VarP.L(), h0VarP.M(), h0VarP.O(), h0VarP.X(), h0VarP.U(), h0VarP.R(), h0VarP.P(), h0VarP.V());
            } else {
                rVar = null;
            }
            int i28 = 4;
            switch (sVar2.i0() - 1) {
                case 0:
                    b15 = 0;
                    break;
                case 1:
                    b15 = 1;
                    break;
                case 2:
                    b15 = 2;
                    break;
                case 3:
                    b15 = 4;
                    break;
                case 4:
                    b15 = 8;
                    break;
                case 5:
                    b15 = 16;
                    break;
                case 6:
                    b15 = 32;
                    break;
                case 7:
                    b15 = 64;
                    break;
                case 8:
                    b15 = 128;
                    break;
                case 9:
                    b15 = HPKE.mode_base;
                    break;
                case 10:
                    b15 = HPKE.mode_base;
                    break;
                case 11:
                    b15 = HPKE.mode_base;
                    break;
                case 12:
                    b15 = HPKE.mode_base;
                    break;
                case 13:
                    b15 = HPKE.mode_base;
                    break;
                default:
                    b15 = b18;
                    break;
            }
            String strW = sVar2.W();
            String strF = sVar2.V().v() ? sVar2.V().F() : null;
            byte[] bArrM = sVar2.V().M();
            List listX2 = sVar2.X();
            if (listX2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[listX2.size()];
                for (int i29 = 0; i29 < listX2.size(); i29++) {
                    pointArr2[i29] = new Point(((h) listX2.get(i29)).J(), ((h) listX2.get(i29)).K());
                }
                pointArr = pointArr2;
            }
            switch (sVar2.J() - 1) {
                case 1:
                    i15 = 1;
                    continue;
                    arrayList.add(new z(b15, strW, strF, bArrM, pointArr, i15, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar));
                    b16 = b18;
                    break;
                case 2:
                    i15 = 2;
                    continue;
                    arrayList.add(new z(b15, strW, strF, bArrM, pointArr, i15, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar));
                    b16 = b18;
                    break;
                case 3:
                    i28 = 3;
                    break;
                case 4:
                    break;
                case 5:
                    i28 = 5;
                    break;
                case 6:
                    i28 = 6;
                    break;
                case 7:
                    i28 = 7;
                    break;
                case 8:
                    i15 = 8;
                    continue;
                    arrayList.add(new z(b15, strW, strF, bArrM, pointArr, i15, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar));
                    b16 = b18;
                    break;
                case 9:
                    i28 = 9;
                    break;
                case 10:
                    i28 = 10;
                    break;
                case 11:
                    i28 = 11;
                    break;
                case 12:
                    i28 = 12;
                    break;
                default:
                    i15 = 0;
                    continue;
                    arrayList.add(new z(b15, strW, strF, bArrM, pointArr, i15, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar));
                    b16 = b18;
                    break;
            }
            i15 = i28;
            arrayList.add(new z(b15, strW, strF, bArrM, pointArr, i15, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar));
            b16 = b18;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0
    public final void B0(g0 g0Var) {
        c();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0
    public final List J0(b bVar, f1 f1Var) {
        return p3(bVar, f1Var, m3());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0
    public final List X0(b bVar, f1 f1Var, e0 e0Var) {
        RecognitionOptions recognitionOptionsM3 = m3();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(e0Var.h().p());
        multiScaleDecodingOptions.b(e0Var.h().h());
        multiScaleDecodingOptions.c(e0Var.h().m());
        recognitionOptionsM3.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(e0Var.h().p());
        recognitionOptionsM3.e(multiScaleDetectionOptions);
        recognitionOptionsM3.g(e0Var.m());
        return p3(bVar, f1Var, recognitionOptionsM3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0
    public final void c() {
        if (this.f36884f != null) {
            return;
        }
        this.f36884f = new BarhopperV3();
        l lVarJ = yj.m.J();
        i iVarJ = yj.j.J();
        int i15 = 16;
        int i16 = 0;
        for (int i17 = 0; i17 < 6; i17++) {
            f fVarJ = yj.g.J();
            fVarJ.q(i15);
            fVarJ.s(i15);
            for (int i18 = 0; i18 < f36880g[i17]; i18++) {
                double[] dArr = f36881h[i16];
                double d15 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f15 = (float) d15;
                fVarJ.o(f15 / fSqrt);
                fVarJ.p(f15 * fSqrt);
                i16++;
            }
            i15 += i15;
            iVarJ.o(fVarJ);
        }
        lVarJ.o(iVarJ);
        try {
            InputStream inputStreamOpen = this.f36882d.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = this.f36882d.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = this.f36882d.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) s.l(this.f36884f);
                        yj.o oVarJ = yj.a.J();
                        lVarJ.p(j2.E(inputStreamOpen));
                        oVarJ.o(lVarJ);
                        yj.d dVarJ = e.J();
                        dVarJ.o(j2.E(inputStreamOpen2));
                        dVarJ.p(j2.E(inputStreamOpen3));
                        oVarJ.p(dVarJ);
                        barhopperV3.b(oVarJ.k());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th4) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (IOException e15) {
            throw new IllegalStateException("Failed to open Barcode models", e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0
    public final void f() {
        BarhopperV3 barhopperV3 = this.f36884f;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f36884f = null;
        }
    }
}
