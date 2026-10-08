package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0000*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "value", "Lgu/e;", "unit", "d", "(JLgu/e;)J", "other", "f", "(JJ)J", "e", "(Lgu/e;)J", "millisMultiplier", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class g extends f {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76965a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f76965a = iArr;
        }
    }

    public static final long d(long j15, e eVar) {
        return f(j15, e(eVar));
    }

    private static final long e(e eVar) {
        int i15 = a.f76965a[eVar.ordinal()];
        if (i15 == 1) {
            return 86400000L;
        }
        if (i15 == 2) {
            return 3600000L;
        }
        if (i15 == 3) {
            return 60000L;
        }
        if (i15 == 4) {
            return 1000L;
        }
        if (i15 == 5) {
            return 1L;
        }
        throw new IllegalStateException(("Wrong unit for millisMultiplier: " + eVar).toString());
    }

    private static final long f(long j15, long j16) {
        if (j15 == 0) {
            return 0L;
        }
        if (j15 == 1) {
            return lr.m.k(j16, 4611686018427387903L);
        }
        if (j16 == 1) {
            return lr.m.k(j15, 4611686018427387903L);
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j15)) - Long.numberOfLeadingZeros(j16);
        if (iNumberOfLeadingZeros < 63) {
            return j15 * j16;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return lr.m.k(j15 * j16, 4611686018427387903L);
    }
}
