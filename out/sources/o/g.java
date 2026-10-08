package o;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
final class g extends h2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f139959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f139960b;

    g(int i15, Surface surface) {
        this.f139959a = i15;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f139960b = surface;
    }

    @Override // o.h2.g
    public int a() {
        return this.f139959a;
    }

    @Override // o.h2.g
    public Surface b() {
        return this.f139960b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2.g) {
            h2.g gVar = (h2.g) obj;
            if (this.f139959a == gVar.a() && this.f139960b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f139959a ^ 1000003) * 1000003) ^ this.f139960b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f139959a + ", surface=" + this.f139960b + "}";
    }
}
