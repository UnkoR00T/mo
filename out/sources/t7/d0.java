package t7;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f188122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f188125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f188126e;

    public d0(Surface surface, int i15, int i16) {
        this(surface, i15, i16, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f188123b == d0Var.f188123b && this.f188124c == d0Var.f188124c && this.f188125d == d0Var.f188125d && this.f188126e == d0Var.f188126e && this.f188122a.equals(d0Var.f188122a);
    }

    public int hashCode() {
        return (((((((this.f188122a.hashCode() * 31) + this.f188123b) * 31) + this.f188124c) * 31) + this.f188125d) * 31) + (this.f188126e ? 1 : 0);
    }

    public d0(Surface surface, int i15, int i16, int i17) {
        this(surface, i15, i16, i17, false);
    }

    public d0(Surface surface, int i15, int i16, int i17, boolean z15) {
        zj.p.e(i17 == 0 || i17 == 90 || i17 == 180 || i17 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f188122a = surface;
        this.f188123b = i15;
        this.f188124c = i16;
        this.f188125d = i17;
        this.f188126e = z15;
    }
}
