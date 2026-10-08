package com.google.android.material.bottomappbar;

import lj.g;
import lj.n;

/* JADX INFO: loaded from: classes4.dex */
public class b extends g implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f34828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f34831f;

    @Override // lj.g
    public void c(float f15, float f16, float f17, n nVar) {
        float f18;
        float f19;
        float f25 = this.f34828c;
        if (f25 == 0.0f) {
            nVar.m(f15, 0.0f);
            return;
        }
        float f26 = ((this.f34827b * 2.0f) + f25) / 2.0f;
        float f27 = f17 * this.f34826a;
        float f28 = f16 + this.f34830e;
        float f29 = (this.f34829d * f17) + ((1.0f - f17) * f26);
        if (f29 / f26 >= 1.0f) {
            nVar.m(f15, 0.0f);
            return;
        }
        float f35 = this.f34831f;
        float f36 = f35 * f17;
        boolean z15 = f35 == -1.0f || Math.abs((f35 * 2.0f) - f25) < 0.1f;
        if (z15) {
            f18 = f29;
            f19 = 0.0f;
        } else {
            f19 = 1.75f;
            f18 = 0.0f;
        }
        float f37 = f26 + f27;
        float f38 = f18 + f27;
        float fSqrt = (float) Math.sqrt((f37 * f37) - (f38 * f38));
        float f39 = f28 - fSqrt;
        float f45 = f28 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f38));
        float f46 = (90.0f - degrees) + f19;
        nVar.m(f39, 0.0f);
        float f47 = f39 - f27;
        float f48 = f39 + f27;
        float f49 = f27 * 2.0f;
        nVar.a(f47, 0.0f, f48, f49, 270.0f, degrees);
        if (z15) {
            nVar.a(f28 - f26, (-f26) - f18, f28 + f26, f26 - f18, 180.0f - f46, (f46 * 2.0f) - 180.0f);
        } else {
            float f55 = this.f34827b;
            float f56 = f36 * 2.0f;
            float f57 = f55 + f56;
            float f58 = f28 - f26;
            nVar.a(f58, -(f36 + f55), f57 + f58, f55 + f36, 180.0f - f46, ((f46 * 2.0f) - 180.0f) / 2.0f);
            float f59 = f28 + f26;
            float f65 = this.f34827b;
            nVar.m(f59 - ((f65 / 2.0f) + f36), f65 + f36);
            float f66 = this.f34827b;
            nVar.a(f59 - (f56 + f66), -(f36 + f66), f59, f66 + f36, 90.0f, f46 - 90.0f);
        }
        nVar.a(f45 - f27, 0.0f, f45 + f27, f49, 270.0f - degrees, degrees);
        nVar.m(f15, 0.0f);
    }

    float e() {
        return this.f34829d;
    }

    public float g() {
        return this.f34831f;
    }

    float i() {
        return this.f34827b;
    }

    float j() {
        return this.f34826a;
    }

    public float l() {
        return this.f34828c;
    }

    void m(float f15) {
        if (f15 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f34829d = f15;
    }

    public void n(float f15) {
        this.f34831f = f15;
    }

    void o(float f15) {
        this.f34827b = f15;
    }

    void p(float f15) {
        this.f34826a = f15;
    }

    public void q(float f15) {
        this.f34828c = f15;
    }

    void s(float f15) {
        this.f34830e = f15;
    }
}
