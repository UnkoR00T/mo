package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class b<T> extends b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f69019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.f f69020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f69022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f69023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f69024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f69025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v.c0 f69026h;

    b(T t15, y.f fVar, int i15, Size size, Rect rect, int i16, Matrix matrix, v.c0 c0Var) {
        if (t15 == null) {
            throw new NullPointerException("Null data");
        }
        this.f69019a = t15;
        this.f69020b = fVar;
        this.f69021c = i15;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f69022d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f69023e = rect;
        this.f69024f = i16;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f69025g = matrix;
        if (c0Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f69026h = c0Var;
    }

    @Override // g0.b0
    public v.c0 a() {
        return this.f69026h;
    }

    @Override // g0.b0
    public Rect b() {
        return this.f69023e;
    }

    @Override // g0.b0
    public T c() {
        return this.f69019a;
    }

    @Override // g0.b0
    public y.f d() {
        return this.f69020b;
    }

    @Override // g0.b0
    public int e() {
        return this.f69021c;
    }

    public boolean equals(Object obj) {
        y.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f69019a.equals(b0Var.c()) && ((fVar = this.f69020b) != null ? fVar.equals(b0Var.d()) : b0Var.d() == null) && this.f69021c == b0Var.e() && this.f69022d.equals(b0Var.h()) && this.f69023e.equals(b0Var.b()) && this.f69024f == b0Var.f() && this.f69025g.equals(b0Var.g()) && this.f69026h.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.b0
    public int f() {
        return this.f69024f;
    }

    @Override // g0.b0
    public Matrix g() {
        return this.f69025g;
    }

    @Override // g0.b0
    public Size h() {
        return this.f69022d;
    }

    public int hashCode() {
        int iHashCode = (this.f69019a.hashCode() ^ 1000003) * 1000003;
        y.f fVar = this.f69020b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f69021c) * 1000003) ^ this.f69022d.hashCode()) * 1000003) ^ this.f69023e.hashCode()) * 1000003) ^ this.f69024f) * 1000003) ^ this.f69025g.hashCode()) * 1000003) ^ this.f69026h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f69019a + ", exif=" + this.f69020b + ", format=" + this.f69021c + ", size=" + this.f69022d + ", cropRect=" + this.f69023e + ", rotationDegrees=" + this.f69024f + ", sensorToBufferTransform=" + this.f69025g + ", cameraCaptureResult=" + this.f69026h + "}";
    }
}
