package o;

import android.graphics.Matrix;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
final class d extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f139907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f139908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f139909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f139910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f139911e;

    d(t3 t3Var, long j15, int i15, Matrix matrix, int i16) {
        if (t3Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f139907a = t3Var;
        this.f139908b = j15;
        this.f139909c = i15;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f139910d = matrix;
        this.f139911e = i16;
    }

    @Override // o.b1, o.w0
    public int c() {
        return this.f139911e;
    }

    @Override // o.b1, o.w0
    public t3 d() {
        return this.f139907a;
    }

    @Override // o.b1, o.w0
    public int e() {
        return this.f139909c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f139907a.equals(b1Var.d()) && this.f139908b == b1Var.getTimestamp() && this.f139909c == b1Var.e() && this.f139910d.equals(b1Var.f()) && this.f139911e == b1Var.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.b1
    public Matrix f() {
        return this.f139910d;
    }

    @Override // o.b1, o.w0
    public long getTimestamp() {
        return this.f139908b;
    }

    public int hashCode() {
        int iHashCode = (this.f139907a.hashCode() ^ 1000003) * 1000003;
        long j15 = this.f139908b;
        return ((((((iHashCode ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003) ^ this.f139909c) * 1000003) ^ this.f139910d.hashCode()) * 1000003) ^ this.f139911e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f139907a + ", timestamp=" + this.f139908b + ", rotationDegrees=" + this.f139909c + ", sensorToBufferTransformMatrix=" + this.f139910d + ", flashState=" + this.f139911e + "}";
    }
}
