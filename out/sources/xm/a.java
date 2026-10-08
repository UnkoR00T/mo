package xm;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import eh.c2;
import eh.e4;
import eh.fe;
import eh.je;
import eh.mc;
import eh.qe;
import eh.xe;
import eh.ye;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f219681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f219682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f219683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f219684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f219685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f219686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f219687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f219688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f219689i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseArray f219690j = new SparseArray();

    public a(e4 e4Var, Matrix matrix) {
        float f15 = e4Var.f50485c;
        float f16 = e4Var.f50487e / 2.0f;
        float f17 = e4Var.f50486d;
        float f18 = e4Var.f50488f / 2.0f;
        Rect rect = new Rect((int) (f15 - f16), (int) (f17 - f18), (int) (f15 + f16), (int) (f17 + f18));
        this.f219681a = rect;
        if (matrix != null) {
            wm.b.e(rect, matrix);
        }
        this.f219682b = e4Var.f50484b;
        for (mc mcVar : e4Var.f50492k) {
            if (p(mcVar.f50821d)) {
                PointF pointF = new PointF(mcVar.f50819b, mcVar.f50820c);
                if (matrix != null) {
                    wm.b.c(pointF, matrix);
                }
                SparseArray sparseArray = this.f219689i;
                int i15 = mcVar.f50821d;
                sparseArray.put(i15, new f(i15, pointF));
            }
        }
        for (c2 c2Var : e4Var.f50496p) {
            int i16 = c2Var.f50294b;
            if (o(i16)) {
                PointF[] pointFArr = c2Var.f50293a;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j15 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j15 > 2147483647L ? Integer.MAX_VALUE : (int) j15);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    wm.b.d(arrayList, matrix);
                }
                this.f219690j.put(i16, new b(i16, arrayList));
            }
        }
        this.f219686f = e4Var.f50491j;
        this.f219687g = e4Var.f50489g;
        this.f219688h = e4Var.f50490h;
        this.f219685e = e4Var.f50495n;
        this.f219684d = e4Var.f50493l;
        this.f219683c = e4Var.f50494m;
    }

    private static boolean o(int i15) {
        return i15 <= 15 && i15 > 0;
    }

    private static boolean p(int i15) {
        return i15 == 0 || i15 == 1 || i15 == 7 || i15 == 3 || i15 == 9 || i15 == 4 || i15 == 10 || i15 == 5 || i15 == 11 || i15 == 6;
    }

    public List<b> a() {
        ArrayList arrayList = new ArrayList();
        int size = this.f219690j.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add((b) this.f219690j.valueAt(i15));
        }
        return arrayList;
    }

    public List<f> b() {
        ArrayList arrayList = new ArrayList();
        int size = this.f219689i.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add((f) this.f219689i.valueAt(i15));
        }
        return arrayList;
    }

    public Rect c() {
        return this.f219681a;
    }

    public b d(int i15) {
        return (b) this.f219690j.get(i15);
    }

    public float e() {
        return this.f219686f;
    }

    public float f() {
        return this.f219687g;
    }

    public float g() {
        return this.f219688h;
    }

    public f h(int i15) {
        return (f) this.f219689i.get(i15);
    }

    public Float i() {
        float f15 = this.f219685e;
        if (f15 < 0.0f || f15 > 1.0f) {
            return null;
        }
        return Float.valueOf(this.f219684d);
    }

    public Float j() {
        float f15 = this.f219683c;
        if (f15 < 0.0f || f15 > 1.0f) {
            return null;
        }
        return Float.valueOf(f15);
    }

    public Float k() {
        float f15 = this.f219685e;
        if (f15 < 0.0f || f15 > 1.0f) {
            return null;
        }
        return Float.valueOf(f15);
    }

    public final SparseArray l() {
        return this.f219690j;
    }

    public final void m(SparseArray sparseArray) {
        this.f219690j.clear();
        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
            this.f219690j.put(sparseArray.keyAt(i15), (b) sparseArray.valueAt(i15));
        }
    }

    public final void n(int i15) {
        this.f219682b = -1;
    }

    public String toString() {
        xe xeVarA = ye.a("Face");
        xeVarA.c("boundingBox", this.f219681a);
        xeVarA.b("trackingId", this.f219682b);
        xeVarA.a("rightEyeOpenProbability", this.f219683c);
        xeVarA.a("leftEyeOpenProbability", this.f219684d);
        xeVarA.a("smileProbability", this.f219685e);
        xeVarA.a("eulerX", this.f219686f);
        xeVarA.a("eulerY", this.f219687g);
        xeVarA.a("eulerZ", this.f219688h);
        xe xeVarA2 = ye.a("Landmarks");
        for (int i15 = 0; i15 <= 11; i15++) {
            if (p(i15)) {
                xeVarA2.c("landmark_" + i15, h(i15));
            }
        }
        xeVarA.c("landmarks", xeVarA2.toString());
        xe xeVarA3 = ye.a("Contours");
        for (int i16 = 1; i16 <= 15; i16++) {
            xeVarA3.c("Contour_" + i16, d(i16));
        }
        xeVarA.c("contours", xeVarA3.toString());
        return xeVarA.toString();
    }

    public a(je jeVar, Matrix matrix) {
        Rect rectC = jeVar.C();
        this.f219681a = rectC;
        if (matrix != null) {
            wm.b.e(rectC, matrix);
        }
        this.f219682b = jeVar.i();
        for (qe qeVar : jeVar.H()) {
            if (p(qeVar.h())) {
                PointF pointFM = qeVar.m();
                if (matrix != null) {
                    wm.b.c(pointFM, matrix);
                }
                this.f219689i.put(qeVar.h(), new f(qeVar.h(), pointFM));
            }
        }
        for (fe feVar : jeVar.E()) {
            int iH = feVar.h();
            if (o(iH)) {
                List listM = feVar.m();
                listM.getClass();
                ArrayList arrayList = new ArrayList(listM);
                if (matrix != null) {
                    wm.b.d(arrayList, matrix);
                }
                this.f219690j.put(iH, new b(iH, arrayList));
            }
        }
        this.f219686f = jeVar.y();
        this.f219687g = jeVar.m();
        this.f219688h = -jeVar.r();
        this.f219685e = jeVar.u();
        this.f219684d = jeVar.h();
        this.f219683c = jeVar.p();
    }
}
