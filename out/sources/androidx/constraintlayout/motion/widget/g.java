package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f11213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f11214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f11215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f11216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f11217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i5.a[] f11218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i5.a f11219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f11220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f11221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f11222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double[] f11223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double[] f11224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String[] f11225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f11226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<k> f11227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HashMap<String, p5.d> f11228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashMap<String, p5.c> f11229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HashMap<String, p5.b> f11230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e[] f11231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f11233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f11235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Interpolator f11236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11237y;

    private float a(float f15, float[] fArr) {
        float f16 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f17 = this.f11221i;
            if (f17 != 1.0d) {
                float f18 = this.f11220h;
                if (f15 < f18) {
                    f15 = 0.0f;
                }
                if (f15 > f18 && f15 < 1.0d) {
                    f15 = Math.min((f15 - f18) * f17, 1.0f);
                }
            }
        }
        i5.b bVar = this.f11214b.f11269a;
        float f19 = Float.NaN;
        for (k kVar : this.f11227o) {
            i5.b bVar2 = kVar.f11269a;
            if (bVar2 != null) {
                float f25 = kVar.f11271c;
                if (f25 < f15) {
                    bVar = bVar2;
                    f16 = f25;
                } else if (Float.isNaN(f19)) {
                    f19 = kVar.f11271c;
                }
            }
        }
        if (bVar != null) {
            float f26 = (Float.isNaN(f19) ? 1.0f : f19) - f16;
            double d15 = (f15 - f16) / f26;
            f15 = (((float) bVar.a(d15)) * f26) + f16;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d15);
            }
        }
        return f15;
    }

    public void b(double d15, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f11218f[0].a(d15, dArr);
        this.f11218f[0].c(d15, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f11214b.e(d15, this.f11222j, dArr, fArr, dArr2, fArr2);
    }

    boolean c(View view, float f15, long j15, i5.c cVar) {
        boolean z15;
        View view2;
        View view3 = view;
        float fA = a(f15, null);
        int i15 = this.f11234v;
        if (i15 != d.f11210a) {
            float f16 = 1.0f / i15;
            float fFloor = ((float) Math.floor(fA / f16)) * f16;
            float f17 = (fA % f16) / f16;
            if (!Float.isNaN(this.f11235w)) {
                f17 = (f17 + this.f11235w) % 1.0f;
            }
            Interpolator interpolator = this.f11236x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f17) : ((double) f17) > 0.5d ? 1.0f : 0.0f) * f16) + fFloor;
        }
        float f18 = fA;
        HashMap<String, p5.c> map = this.f11229q;
        if (map != null) {
            Iterator<p5.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a(view3, f18);
            }
        }
        HashMap<String, p5.d> map2 = this.f11228p;
        if (map2 != null) {
            boolean zA = false;
            for (p5.d dVar : map2.values()) {
                if (!(dVar instanceof p5.d.a)) {
                    zA |= dVar.a(view3, f18, j15, cVar);
                    view3 = view;
                }
            }
            z15 = zA;
        } else {
            z15 = false;
        }
        i5.a[] aVarArr = this.f11218f;
        if (aVarArr != null) {
            double d15 = f18;
            aVarArr[0].a(d15, this.f11223k);
            this.f11218f[0].c(d15, this.f11224l);
            if (this.f11237y) {
                view2 = view;
            } else {
                this.f11214b.g(f18, view, this.f11222j, this.f11223k, this.f11224l, null, this.f11213a);
                f18 = f18;
                view2 = view;
                this.f11213a = false;
            }
            if (this.f11232t != d.f11210a) {
                if (this.f11233u == null) {
                    this.f11233u = ((View) view2.getParent()).findViewById(this.f11232t);
                }
                View view4 = this.f11233u;
                if (view4 != null) {
                    float top = (view4.getTop() + this.f11233u.getBottom()) / 2.0f;
                    float left = (this.f11233u.getLeft() + this.f11233u.getRight()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left2 = left - view2.getLeft();
                        float top2 = top - view2.getTop();
                        view2.setPivotX(left2);
                        view2.setPivotY(top2);
                    }
                }
            }
            HashMap<String, p5.c> map3 = this.f11229q;
            if (map3 != null) {
                for (p5.c cVar2 : map3.values()) {
                    if (cVar2 instanceof p5.c.a) {
                        double[] dArr = this.f11224l;
                        if (dArr.length > 1) {
                            ((p5.c.a) cVar2).b(view2, f18, dArr[0], dArr[1]);
                        }
                    }
                }
            }
            int i16 = 1;
            while (true) {
                i5.a[] aVarArr2 = this.f11218f;
                if (i16 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i16].b(d15, this.f11226n);
                p5.a.b(this.f11214b.f11283q.get(this.f11225m[i16 - 1]), view2, this.f11226n);
                i16++;
            }
            f fVar = this.f11216d;
            if (fVar.f11211a == 0) {
                if (f18 <= 0.0f) {
                    view2.setVisibility(fVar.f11212b);
                } else if (f18 >= 1.0f) {
                    view2.setVisibility(this.f11217e.f11212b);
                } else if (this.f11217e.f11212b != fVar.f11212b) {
                    view2.setVisibility(0);
                }
            }
            if (this.f11231s != null) {
                int i17 = 0;
                while (true) {
                    e[] eVarArr = this.f11231s;
                    if (i17 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i17].a(f18, view2);
                    i17++;
                }
            }
        } else {
            view2 = view;
            k kVar = this.f11214b;
            float f19 = kVar.f11273e;
            k kVar2 = this.f11215c;
            float f25 = f19 + ((kVar2.f11273e - f19) * f18);
            float f26 = kVar.f11274f;
            float f27 = f26 + ((kVar2.f11274f - f26) * f18);
            float f28 = kVar.f11275g;
            float f29 = kVar2.f11275g;
            float f35 = kVar.f11276h;
            float f36 = kVar2.f11276h;
            float f37 = f25 + 0.5f;
            int i18 = (int) f37;
            float f38 = f27 + 0.5f;
            int i19 = (int) f38;
            int i25 = (int) (f37 + ((f29 - f28) * f18) + f28);
            int i26 = (int) (f38 + ((f36 - f35) * f18) + f35);
            int i27 = i25 - i18;
            int i28 = i26 - i19;
            if (f29 != f28 || f36 != f35 || this.f11213a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                this.f11213a = false;
            }
            view2.layout(i18, i19, i25, i26);
        }
        HashMap<String, p5.b> map4 = this.f11230r;
        if (map4 != null) {
            for (p5.b bVar : map4.values()) {
                if (bVar instanceof p5.b.a) {
                    double[] dArr2 = this.f11224l;
                    ((p5.b.a) bVar).b(view2, f18, dArr2[0], dArr2[1]);
                } else {
                    bVar.a(view2, f18);
                }
            }
        }
        return z15;
    }

    public String toString() {
        return " start: x: " + this.f11214b.f11273e + " y: " + this.f11214b.f11274f + " end: x: " + this.f11215c.f11273e + " y: " + this.f11215c.f11274f;
    }
}
