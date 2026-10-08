package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0011\u001aG\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "b", "(FFFFF)J", "", "a", "(DDDDD)J", "firstRootReal", "firstRootImaginary", "p0", "v0", "g", "(DDDDD)D", "c", "(DDDD)D", "secondRootReal", "e", "initialPosition", "d", "(DDDDDDD)J", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o1 {
    public static final long a(double d15, double d16, double d17, double d18, double d19) {
        double dSqrt = 2.0d * d16 * Math.sqrt(d15);
        double d25 = (dSqrt * dSqrt) - (4.0d * d15);
        double dSqrt2 = d25 < 0.0d ? 0.0d : Math.sqrt(d25);
        double d26 = -dSqrt;
        return d((d26 + dSqrt2) * 0.5d, (d25 < 0.0d ? Math.sqrt(Math.abs(d25)) : 0.0d) * 0.5d, (d26 - dSqrt2) * 0.5d, d16, d17, d18, d19);
    }

    public static final long b(float f15, float f16, float f17, float f18, float f19) {
        if (f16 == 0.0f) {
            return 9223372036854L;
        }
        return a(f15, f16, f17, f18, f19);
    }

    private static final double c(double d15, double d16, double d17, double d18) {
        double d19 = d18;
        double d25 = d15 * d16;
        double d26 = d17 - d25;
        double dLog = Math.log(Math.abs(d19 / d16)) / d15;
        double dLog2 = Math.log(Math.abs(d19 / d26));
        int i15 = 0;
        double dLog3 = dLog2;
        for (int i16 = 0; i16 < 6; i16++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d15));
        }
        double d27 = dLog3 / d15;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d27;
        } else if ((Double.doubleToRawLongBits(d27) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d27);
        }
        double d28 = (-(d25 + d26)) / (d15 * d26);
        double d29 = d15 * d28;
        double dExp = (Math.exp(d29) * d16) + (d26 * d28 * Math.exp(d29));
        if (Double.isNaN(d28) || d28 <= 0.0d) {
            d19 = -d19;
        } else if (d28 <= 0.0d || (-dExp) >= d19) {
            dLog = (-(2.0d / d15)) - (d16 / d26);
        } else {
            if (d26 < 0.0d && d16 > 0.0d) {
                dLog = 0.0d;
            }
            d19 = -d19;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i15 < 100) {
            i15++;
            double d35 = d15 * dLog;
            double d36 = d19;
            double dExp2 = dLog - ((((d16 + (d26 * dLog)) * Math.exp(d35)) + d19) / ((((((double) 1) + d35) * d26) + d25) * Math.exp(d35)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d19 = d36;
        }
        return dLog;
    }

    private static final long d(double d15, double d16, double d17, double d18, double d19, double d25, double d26) {
        double dG;
        double d27 = d19;
        if (d25 == 0.0d && d27 == 0.0d) {
            return 0L;
        }
        if (d25 < 0.0d) {
            d27 = -d27;
        }
        double d28 = d27;
        double dAbs = Math.abs(d25);
        if (d18 > 1.0d) {
            dG = e(d15, d17, dAbs, d28, d26);
        } else {
            dG = d18 < 1.0d ? g(d15, d16, dAbs, d28, d26) : c(d15, dAbs, d28, d26);
        }
        return (long) (dG * 1000.0d);
    }

    private static final double e(double d15, double d16, double d17, double d18, double d19) {
        double d25 = d19;
        double d26 = d15 - d16;
        double d27 = ((d15 * d17) - d18) / d26;
        double d28 = d17 - d27;
        double dLog = Math.log(Math.abs(d25 / d28)) / d15;
        double dLog2 = Math.log(Math.abs(d25 / d27)) / d16;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d29 = d28 * d15;
        double dLog3 = Math.log(d29 / ((-d27) * d16)) / (d16 - d15);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d25 = -d25;
        } else if (dLog3 <= 0.0d || (-f(d28, d15, dLog3, d27, d16)) >= d25) {
            dLog = Math.log((-((d27 * d16) * d16)) / (d29 * d15)) / d26;
        } else {
            if (d27 > 0.0d && d28 < 0.0d) {
                dLog = 0.0d;
            }
            d25 = -d25;
        }
        double d35 = d27 * d16;
        if (Math.abs((Math.exp(d15 * dLog) * d29) + (Math.exp(d16 * dLog) * d35)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i15 = 0;
        while (dAbs > 0.001d && i15 < 100) {
            i15++;
            double d36 = d15 * dLog;
            double d37 = d16 * dLog;
            double dExp = dLog - ((((Math.exp(d36) * d28) + (Math.exp(d37) * d27)) + d25) / ((Math.exp(d36) * d29) + (Math.exp(d37) * d35)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double f(double d15, double d16, double d17, double d18, double d19) {
        return (d15 * Math.exp(d16 * d17)) + (d18 * Math.exp(d19 * d17));
    }

    private static final double g(double d15, double d16, double d17, double d18, double d19) {
        double d25 = (d18 - (d15 * d17)) / d16;
        return Math.log(d19 / Math.sqrt((d17 * d17) + (d25 * d25))) / d15;
    }
}
