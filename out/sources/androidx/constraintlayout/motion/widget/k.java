package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class k implements Comparable<k> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static String[] f11268v = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i5.b f11269a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f11271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f11272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f11273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f11274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f11275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f11276h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f11279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f11280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f11281n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    g f11282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f11283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f11284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    double[] f11285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double[] f11286t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11270b = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f11277j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f11278k = Float.NaN;

    k() {
        int i15 = d.f11210a;
        this.f11279l = i15;
        this.f11280m = i15;
        this.f11281n = Float.NaN;
        this.f11282p = null;
        this.f11283q = new LinkedHashMap<>();
        this.f11284r = 0;
        this.f11285s = new double[18];
        this.f11286t = new double[18];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f11272d, kVar.f11272d);
    }

    void e(double d15, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f15;
        float fSin = this.f11273e;
        float fCos = this.f11274f;
        float f16 = this.f11275g;
        float f17 = this.f11276h;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            float f27 = (float) dArr[i15];
            float f28 = (float) dArr2[i15];
            int i16 = iArr[i15];
            if (i16 == 1) {
                fSin = f27;
                f18 = f28;
            } else if (i16 == 2) {
                fCos = f27;
                f25 = f28;
            } else if (i16 == 3) {
                f16 = f27;
                f19 = f28;
            } else if (i16 == 4) {
                f17 = f27;
                f26 = f28;
            }
        }
        float f29 = (f19 / 2.0f) + f18;
        float fCos2 = (f26 / 2.0f) + f25;
        g gVar = this.f11282p;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d15, fArr3, fArr4);
            float f35 = fArr3[0];
            float f36 = fArr3[1];
            float f37 = fArr4[0];
            float f38 = fArr4[1];
            f15 = 2.0f;
            double d16 = fSin;
            double d17 = fCos;
            fSin = (float) ((((double) f35) + (Math.sin(d17) * d16)) - ((double) (f16 / 2.0f)));
            fCos = (float) ((((double) f36) - (Math.cos(d17) * d16)) - ((double) (f17 / 2.0f)));
            double d18 = f18;
            double dSin = ((double) f37) + (Math.sin(d17) * d18);
            double d19 = f25;
            float fCos3 = (float) (dSin + (Math.cos(d17) * d19));
            fCos2 = (float) ((((double) f38) - (d18 * Math.cos(d17))) + (Math.sin(d17) * d19));
            f29 = fCos3;
        } else {
            f15 = 2.0f;
        }
        fArr[0] = fSin + (f16 / f15) + 0.0f;
        fArr[1] = fCos + (f17 / f15) + 0.0f;
        fArr2[0] = f29;
        fArr2[1] = fCos2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void g(float f15, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z15) {
        float f16;
        float fSin = this.f11273e;
        float fCos = this.f11274f;
        float f17 = this.f11275g;
        float f18 = this.f11276h;
        if (iArr.length != 0 && this.f11285s.length <= iArr[iArr.length - 1]) {
            int i15 = iArr[iArr.length - 1] + 1;
            this.f11285s = new double[i15];
            this.f11286t = new double[i15];
        }
        Arrays.fill(this.f11285s, Double.NaN);
        for (int i16 = 0; i16 < iArr.length; i16++) {
            double[] dArr4 = this.f11285s;
            int i17 = iArr[i16];
            dArr4[i17] = dArr[i16];
            this.f11286t[i17] = dArr2[i16];
        }
        float f19 = Float.NaN;
        int i18 = 0;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        while (true) {
            double[] dArr5 = this.f11285s;
            if (i18 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i18]) && (dArr3 == null || dArr3[i18] == 0.0d)) {
                f16 = f19;
            } else {
                double d15 = dArr3 != null ? dArr3[i18] : 0.0d;
                if (!Double.isNaN(this.f11285s[i18])) {
                    d15 = this.f11285s[i18] + d15;
                }
                f16 = f19;
                float f29 = (float) d15;
                float f35 = (float) this.f11286t[i18];
                if (i18 == 1) {
                    f19 = f16;
                    f25 = f35;
                    fSin = f29;
                } else if (i18 == 2) {
                    f19 = f16;
                    f26 = f35;
                    fCos = f29;
                } else if (i18 == 3) {
                    f19 = f16;
                    f27 = f35;
                    f17 = f29;
                } else if (i18 == 4) {
                    f19 = f16;
                    f28 = f35;
                    f18 = f29;
                } else if (i18 == 5) {
                    f19 = f29;
                }
                i18++;
            }
            f19 = f16;
            i18++;
        }
        float f36 = f19;
        g gVar = this.f11282p;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f15, fArr, fArr2);
            float f37 = fArr[0];
            float f38 = fArr[1];
            float f39 = fArr2[0];
            float f45 = fArr2[1];
            double d16 = f37;
            double d17 = fSin;
            double d18 = fCos;
            fSin = (float) ((d16 + (Math.sin(d18) * d17)) - ((double) (f17 / 2.0f)));
            fCos = (float) ((((double) f38) - (Math.cos(d18) * d17)) - ((double) (f18 / 2.0f)));
            double d19 = f39;
            double d25 = f25;
            double dSin = d19 + (Math.sin(d18) * d25);
            double dCos = Math.cos(d18) * d17;
            double d26 = f26;
            float f46 = (float) (dSin + (dCos * d26));
            float fCos2 = (float) ((((double) f45) - (d25 * Math.cos(d18))) + (Math.sin(d18) * d17 * d26));
            if (dArr2.length >= 2) {
                dArr2[0] = f46;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f36)) {
                view.setRotation((float) (((double) f36) + Math.toDegrees(Math.atan2(fCos2, f46))));
            }
        } else if (!Float.isNaN(f36)) {
            view.setRotation(f36 + ((float) Math.toDegrees(Math.atan2(f26 + (f28 / 2.0f), f25 + (f27 / 2.0f)))) + 0.0f);
        }
        if (view instanceof c) {
            ((c) view).a(fSin, fCos, f17 + fSin, f18 + fCos);
            return;
        }
        float f47 = fSin + 0.5f;
        int i19 = (int) f47;
        float f48 = fCos + 0.5f;
        int i25 = (int) f48;
        int i26 = (int) (f47 + f17);
        int i27 = (int) (f48 + f18);
        int i28 = i26 - i19;
        int i29 = i27 - i25;
        if (i28 != view.getMeasuredWidth() || i29 != view.getMeasuredHeight() || z15) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i28, 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
        }
        view.layout(i19, i25, i26, i27);
    }
}
