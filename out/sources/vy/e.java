package vy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Lvy/e;", "", "", "value", "a", "(D)D", "e", "(DD)D", "d", "f", "", "g", "(D)Ljava/lang/String;", "", "c", "(D)I", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static double a(double d15) {
        return d15;
    }

    public static final boolean b(double d15, double d16) {
        return Double.compare(d15, d16) == 0;
    }

    public static int c(double d15) {
        return Double.hashCode(d15);
    }

    public static final double d(double d15, double d16) {
        return f.c(d16 - d15);
    }

    public static final double e(double d15, double d16) {
        return f.c(d16 + d15);
    }

    public static final double f(double d15) {
        return d15;
    }

    public static String g(double d15) {
        return "Degree(value=" + d15 + ")";
    }
}
