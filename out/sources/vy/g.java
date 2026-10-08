package vy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lvy/g;", "", "", "distanceKm", "a", "(D)D", "", "value", "c", "(DI)D", "b", "(DD)D", "f", "", "g", "(D)Ljava/lang/String;", "e", "(D)I", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static double a(double d15) {
        return d15;
    }

    public static final double b(double d15, double d16) {
        return i.a(d15 / d16);
    }

    public static final double c(double d15, int i15) {
        return i.a(d15 / ((double) i15));
    }

    public static final boolean d(double d15, double d16) {
        return Double.compare(d15, d16) == 0;
    }

    public static int e(double d15) {
        return Double.hashCode(d15);
    }

    public static final double f(double d15) {
        return d15;
    }

    public static String g(double d15) {
        return "Distance(distanceKm=" + d15 + ")";
    }
}
