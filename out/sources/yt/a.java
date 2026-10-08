package yt;

import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f229279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f229280b;

    public a(T t15, T t16) {
        this.f229279a = t15;
        this.f229280b = t16;
    }

    public final T a() {
        return this.f229279a;
    }

    public final T b() {
        return this.f229280b;
    }

    public final T c() {
        return this.f229279a;
    }

    public final T d() {
        return this.f229280b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f229279a, aVar.f229279a) && t.c(this.f229280b, aVar.f229280b);
    }

    public int hashCode() {
        T t15 = this.f229279a;
        int iHashCode = (t15 == null ? 0 : t15.hashCode()) * 31;
        T t16 = this.f229280b;
        return iHashCode + (t16 != null ? t16.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f229279a + ", upper=" + this.f229280b + ')';
    }
}
