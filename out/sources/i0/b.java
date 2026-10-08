package i0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f87676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f87679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f87680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f87681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f87683h;

    b(UUID uuid, int i15, int i16, Rect rect, Size size, int i17, boolean z15, boolean z16) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f87676a = uuid;
        this.f87677b = i15;
        this.f87678c = i16;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f87679d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f87680e = size;
        this.f87681f = i17;
        this.f87682g = z15;
        this.f87683h = z16;
    }

    @Override // i0.f
    public Rect a() {
        return this.f87679d;
    }

    @Override // i0.f
    public int b() {
        return this.f87678c;
    }

    @Override // i0.f
    public int c() {
        return this.f87681f;
    }

    @Override // i0.f
    public Size d() {
        return this.f87680e;
    }

    @Override // i0.f
    public int e() {
        return this.f87677b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f87676a.equals(fVar.f()) && this.f87677b == fVar.e() && this.f87678c == fVar.b() && this.f87679d.equals(fVar.a()) && this.f87680e.equals(fVar.d()) && this.f87681f == fVar.c() && this.f87682g == fVar.g() && this.f87683h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // i0.f
    UUID f() {
        return this.f87676a;
    }

    @Override // i0.f
    public boolean g() {
        return this.f87682g;
    }

    public int hashCode() {
        return ((((((((((((((this.f87676a.hashCode() ^ 1000003) * 1000003) ^ this.f87677b) * 1000003) ^ this.f87678c) * 1000003) ^ this.f87679d.hashCode()) * 1000003) ^ this.f87680e.hashCode()) * 1000003) ^ this.f87681f) * 1000003) ^ (this.f87682g ? 1231 : 1237)) * 1000003) ^ (this.f87683h ? 1231 : 1237);
    }

    @Override // i0.f
    public boolean k() {
        return this.f87683h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f87676a + ", getTargets=" + this.f87677b + ", getFormat=" + this.f87678c + ", getCropRect=" + this.f87679d + ", getSize=" + this.f87680e + ", getRotationDegrees=" + this.f87681f + ", isMirroring=" + this.f87682g + ", shouldRespectInputCropRect=" + this.f87683h + "}";
    }
}
