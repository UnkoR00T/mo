package t7;

import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f188329e = new m0(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f188330f = o0.u0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f188331g = o0.u0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f188332h = o0.u0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f188335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f188336d;

    public m0(int i15, int i16) {
        this(i15, i16, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f188333a == m0Var.f188333a && this.f188334b == m0Var.f188334b && this.f188336d == m0Var.f188336d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f188333a) * 31) + this.f188334b) * 31) + Float.floatToRawIntBits(this.f188336d);
    }

    public m0(int i15, int i16, float f15) {
        this.f188333a = i15;
        this.f188334b = i16;
        this.f188335c = 0;
        this.f188336d = f15;
    }
}
