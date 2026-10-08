package uo;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f199521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f199522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f199523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f199524d;

    public a() {
    }

    public float a() {
        return e() - c();
    }

    public float b() {
        return this.f199521a;
    }

    public float c() {
        return this.f199522b;
    }

    public float d() {
        return this.f199523c;
    }

    public float e() {
        return this.f199524d;
    }

    public void f(float f15) {
        this.f199521a = f15;
    }

    public void g(float f15) {
        this.f199522b = f15;
    }

    public void h(float f15) {
        this.f199523c = f15;
    }

    public void i(float f15) {
        this.f199524d = f15;
    }

    public String toString() {
        return "[" + b() + "," + c() + "," + d() + "," + e() + "]";
    }

    public a(float f15, float f16, float f17, float f18) {
        this.f199521a = f15;
        this.f199522b = f16;
        this.f199523c = f17;
        this.f199524d = f18;
    }

    public a(List<Number> list) {
        this.f199521a = list.get(0).floatValue();
        this.f199522b = list.get(1).floatValue();
        this.f199523c = list.get(2).floatValue();
        this.f199524d = list.get(3).floatValue();
    }
}
