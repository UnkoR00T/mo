package md;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f125607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f125608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f125609c;

    public a() {
        this.f125607a = new PointF();
        this.f125608b = new PointF();
        this.f125609c = new PointF();
    }

    public PointF a() {
        return this.f125607a;
    }

    public PointF b() {
        return this.f125608b;
    }

    public PointF c() {
        return this.f125609c;
    }

    public void d(float f15, float f16) {
        this.f125607a.set(f15, f16);
    }

    public void e(float f15, float f16) {
        this.f125608b.set(f15, f16);
    }

    public void f(float f15, float f16) {
        this.f125609c.set(f15, f16);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f125609c.x), Float.valueOf(this.f125609c.y), Float.valueOf(this.f125607a.x), Float.valueOf(this.f125607a.y), Float.valueOf(this.f125608b.x), Float.valueOf(this.f125608b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f125607a = pointF;
        this.f125608b = pointF2;
        this.f125609c = pointF3;
    }
}
