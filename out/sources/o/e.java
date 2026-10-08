package o;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class e extends v1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f139942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f139943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v.n0 f139944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f139945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f139946e;

    e(Size size, Rect rect, v.n0 n0Var, int i15, boolean z15) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f139942a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f139943b = rect;
        this.f139944c = n0Var;
        this.f139945d = i15;
        this.f139946e = z15;
    }

    @Override // o.v1.a
    public v.n0 a() {
        return this.f139944c;
    }

    @Override // o.v1.a
    public Rect b() {
        return this.f139943b;
    }

    @Override // o.v1.a
    public Size c() {
        return this.f139942a;
    }

    @Override // o.v1.a
    public boolean d() {
        return this.f139946e;
    }

    @Override // o.v1.a
    public int e() {
        return this.f139945d;
    }

    public boolean equals(Object obj) {
        v.n0 n0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1.a) {
            v1.a aVar = (v1.a) obj;
            if (this.f139942a.equals(aVar.c()) && this.f139943b.equals(aVar.b()) && ((n0Var = this.f139944c) != null ? n0Var.equals(aVar.a()) : aVar.a() == null) && this.f139945d == aVar.e() && this.f139946e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f139942a.hashCode() ^ 1000003) * 1000003) ^ this.f139943b.hashCode()) * 1000003;
        v.n0 n0Var = this.f139944c;
        return ((((iHashCode ^ (n0Var == null ? 0 : n0Var.hashCode())) * 1000003) ^ this.f139945d) * 1000003) ^ (this.f139946e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f139942a + ", inputCropRect=" + this.f139943b + ", cameraInternal=" + this.f139944c + ", rotationDegrees=" + this.f139945d + ", mirroring=" + this.f139946e + "}";
    }
}
