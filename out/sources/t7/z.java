package t7;

import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f188660d = new z(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f188661e = o0.u0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f188662f = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f188663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f188665c;

    public z(float f15) {
        this(f15, 1.0f);
    }

    public long a(long j15) {
        return j15 * ((long) this.f188665c);
    }

    public z b(float f15) {
        return new z(f15, this.f188664b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f188663a == zVar.f188663a && this.f188664b == zVar.f188664b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f188663a)) * 31) + Float.floatToRawIntBits(this.f188664b);
    }

    public String toString() {
        return o0.F("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f188663a), Float.valueOf(this.f188664b));
    }

    public z(float f15, float f16) {
        zj.p.d(f15 > 0.0f);
        zj.p.d(f16 > 0.0f);
        this.f188663a = f15;
        this.f188664b = f16;
        this.f188665c = Math.round(f15 * 1000.0f);
    }
}
