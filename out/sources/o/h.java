package o;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
final class h extends h2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f139966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f139967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f139968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f139969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f139970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f139971f;

    h(Rect rect, int i15, int i16, boolean z15, Matrix matrix, boolean z16) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f139966a = rect;
        this.f139967b = i15;
        this.f139968c = i16;
        this.f139969d = z15;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f139970e = matrix;
        this.f139971f = z16;
    }

    @Override // o.h2.h
    public Rect a() {
        return this.f139966a;
    }

    @Override // o.h2.h
    public int b() {
        return this.f139967b;
    }

    @Override // o.h2.h
    public Matrix c() {
        return this.f139970e;
    }

    @Override // o.h2.h
    public int d() {
        return this.f139968c;
    }

    @Override // o.h2.h
    public boolean e() {
        return this.f139969d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2.h) {
            h2.h hVar = (h2.h) obj;
            if (this.f139966a.equals(hVar.a()) && this.f139967b == hVar.b() && this.f139968c == hVar.d() && this.f139969d == hVar.e() && this.f139970e.equals(hVar.c()) && this.f139971f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.h2.h
    public boolean f() {
        return this.f139971f;
    }

    public int hashCode() {
        return ((((((((((this.f139966a.hashCode() ^ 1000003) * 1000003) ^ this.f139967b) * 1000003) ^ this.f139968c) * 1000003) ^ (this.f139969d ? 1231 : 1237)) * 1000003) ^ this.f139970e.hashCode()) * 1000003) ^ (this.f139971f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f139966a + ", getRotationDegrees=" + this.f139967b + ", getTargetRotation=" + this.f139968c + ", hasCameraTransform=" + this.f139969d + ", getSensorToBufferTransform=" + this.f139970e + ", isMirroring=" + this.f139971f + "}";
    }
}
