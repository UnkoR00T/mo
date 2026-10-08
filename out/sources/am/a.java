package am;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lam/a;", "", "<init>", "()V", "", "x", "b", "(D)D", "a", "lat1", "lat2", "dLng", "c", "(DDD)D", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7759a = new a();

    private a() {
    }

    public static final double a(double x15) {
        return ((double) 2) * Math.asin(Math.sqrt(x15));
    }

    public static final double b(double x15) {
        double dSin = Math.sin(x15 * 0.5d);
        return dSin * dSin;
    }

    public static final double c(double lat1, double lat2, double dLng) {
        return b(lat1 - lat2) + (b(dLng) * Math.cos(lat1) * Math.cos(lat2));
    }
}
