package vj;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes4.dex */
final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f207103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f207104b;

    e(PendingIntent pendingIntent, boolean z15) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f207103a = pendingIntent;
        this.f207104b = z15;
    }

    @Override // vj.b
    final PendingIntent a() {
        return this.f207103a;
    }

    @Override // vj.b
    final boolean b() {
        return this.f207104b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f207103a.equals(bVar.a()) && this.f207104b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f207103a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f207104b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f207103a.toString() + ", isNoOp=" + this.f207104b + "}";
    }
}
