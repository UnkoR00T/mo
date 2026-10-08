package ud;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import fd.f;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f197575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f197576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f197577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f197578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f197579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f197580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f197581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f197582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f197583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f197584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f197585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f197586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f197587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f197588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f197589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f197590p;

    public a(f fVar, T t15, T t16, Interpolator interpolator, float f15, Float f16) {
        this.f197583i = -3987645.8f;
        this.f197584j = -3987645.8f;
        this.f197585k = 784923401;
        this.f197586l = 784923401;
        this.f197587m = Float.MIN_VALUE;
        this.f197588n = Float.MIN_VALUE;
        this.f197589o = null;
        this.f197590p = null;
        this.f197575a = fVar;
        this.f197576b = t15;
        this.f197577c = t16;
        this.f197578d = interpolator;
        this.f197579e = null;
        this.f197580f = null;
        this.f197581g = f15;
        this.f197582h = f16;
    }

    public boolean a(float f15) {
        return f15 >= f() && f15 < c();
    }

    public a<T> b(T t15, T t16) {
        return new a<>(t15, t16);
    }

    public float c() {
        if (this.f197575a == null) {
            return 1.0f;
        }
        if (this.f197588n == Float.MIN_VALUE) {
            if (this.f197582h == null) {
                this.f197588n = 1.0f;
            } else {
                float f15 = f();
                this.f197588n = (float) (((double) f15) + (((double) (this.f197582h.floatValue() - this.f197581g)) / ((double) this.f197575a.e())));
            }
        }
        return this.f197588n;
    }

    public float d() {
        if (this.f197584j == -3987645.8f) {
            this.f197584j = ((Float) this.f197577c).floatValue();
        }
        return this.f197584j;
    }

    public int e() {
        if (this.f197586l == 784923401) {
            this.f197586l = ((Integer) this.f197577c).intValue();
        }
        return this.f197586l;
    }

    public float f() {
        f fVar = this.f197575a;
        if (fVar == null) {
            return 0.0f;
        }
        if (this.f197587m == Float.MIN_VALUE) {
            this.f197587m = (this.f197581g - fVar.p()) / this.f197575a.e();
        }
        return this.f197587m;
    }

    public float g() {
        if (this.f197583i == -3987645.8f) {
            this.f197583i = ((Float) this.f197576b).floatValue();
        }
        return this.f197583i;
    }

    public int h() {
        if (this.f197585k == 784923401) {
            this.f197585k = ((Integer) this.f197576b).intValue();
        }
        return this.f197585k;
    }

    public boolean i() {
        return this.f197578d == null && this.f197579e == null && this.f197580f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f197576b + ", endValue=" + this.f197577c + ", startFrame=" + this.f197581g + ", endFrame=" + this.f197582h + ", interpolator=" + this.f197578d + '}';
    }

    public a(f fVar, T t15, T t16, Interpolator interpolator, Interpolator interpolator2, float f15, Float f16) {
        this.f197583i = -3987645.8f;
        this.f197584j = -3987645.8f;
        this.f197585k = 784923401;
        this.f197586l = 784923401;
        this.f197587m = Float.MIN_VALUE;
        this.f197588n = Float.MIN_VALUE;
        this.f197589o = null;
        this.f197590p = null;
        this.f197575a = fVar;
        this.f197576b = t15;
        this.f197577c = t16;
        this.f197578d = null;
        this.f197579e = interpolator;
        this.f197580f = interpolator2;
        this.f197581g = f15;
        this.f197582h = f16;
    }

    protected a(f fVar, T t15, T t16, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f15, Float f16) {
        this.f197583i = -3987645.8f;
        this.f197584j = -3987645.8f;
        this.f197585k = 784923401;
        this.f197586l = 784923401;
        this.f197587m = Float.MIN_VALUE;
        this.f197588n = Float.MIN_VALUE;
        this.f197589o = null;
        this.f197590p = null;
        this.f197575a = fVar;
        this.f197576b = t15;
        this.f197577c = t16;
        this.f197578d = interpolator;
        this.f197579e = interpolator2;
        this.f197580f = interpolator3;
        this.f197581g = f15;
        this.f197582h = f16;
    }

    public a(T t15) {
        this.f197583i = -3987645.8f;
        this.f197584j = -3987645.8f;
        this.f197585k = 784923401;
        this.f197586l = 784923401;
        this.f197587m = Float.MIN_VALUE;
        this.f197588n = Float.MIN_VALUE;
        this.f197589o = null;
        this.f197590p = null;
        this.f197575a = null;
        this.f197576b = t15;
        this.f197577c = t15;
        this.f197578d = null;
        this.f197579e = null;
        this.f197580f = null;
        this.f197581g = Float.MIN_VALUE;
        this.f197582h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t15, T t16) {
        this.f197583i = -3987645.8f;
        this.f197584j = -3987645.8f;
        this.f197585k = 784923401;
        this.f197586l = 784923401;
        this.f197587m = Float.MIN_VALUE;
        this.f197588n = Float.MIN_VALUE;
        this.f197589o = null;
        this.f197590p = null;
        this.f197575a = null;
        this.f197576b = t15;
        this.f197577c = t16;
        this.f197578d = null;
        this.f197579e = null;
        this.f197580f = null;
        this.f197581g = Float.MIN_VALUE;
        this.f197582h = Float.valueOf(Float.MAX_VALUE);
    }
}
