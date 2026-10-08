package xq;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\t\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\n\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"", "a", "b", "e", "(II)I", "", "f", "(JJ)J", "c", "(III)I", "(JJJ)J", "start", "end", "step", "d", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class c {
    private static final int a(int i15, int i16, int i17) {
        return e(e(i15, i17) - e(i16, i17), i17);
    }

    private static final long b(long j15, long j16, long j17) {
        return f(f(j15, j17) - f(j16, j17), j17);
    }

    public static final int c(int i15, int i16, int i17) {
        if (i17 > 0) {
            if (i15 < i16) {
                return i16 - a(i16, i15, i17);
            }
        } else {
            if (i17 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i15 > i16) {
                return i16 + a(i15, i16, -i17);
            }
        }
        return i16;
    }

    public static final long d(long j15, long j16, long j17) {
        if (j17 > 0) {
            return j15 >= j16 ? j16 : j16 - b(j16, j15, j17);
        }
        if (j17 < 0) {
            return j15 <= j16 ? j16 : j16 + b(j15, j16, -j17);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i15, int i16) {
        int i17 = i15 % i16;
        return i17 >= 0 ? i17 : i17 + i16;
    }

    private static final long f(long j15, long j16) {
        long j17 = j15 % j16;
        return j17 >= 0 ? j17 : j17 + j16;
    }
}
