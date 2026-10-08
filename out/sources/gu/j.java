package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\n\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"", "value", "Lgu/b;", "a", "(J)J", "valueNs", "origin", "Lgu/e;", "unit", "b", "(JJLgu/e;)J", "origin1", "origin2", "d", "value1", "value2", "c", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class j {
    private static final long a(long j15) {
        return j15 < 0 ? b.INSTANCE.c() : b.INSTANCE.b();
    }

    public static final long b(long j15, long j16, e eVar) {
        return (1 | (j16 - 1)) == Long.MAX_VALUE ? b.e0(a(j16)) : c(j15, j16, eVar);
    }

    private static final long c(long j15, long j16, e eVar) {
        long j17 = j15 - j16;
        if (((j17 ^ j15) & (~(j17 ^ j16))) >= 0) {
            return d.r(j17, eVar);
        }
        e eVar2 = e.MILLISECONDS;
        if (eVar.compareTo(eVar2) >= 0) {
            return b.e0(a(j17));
        }
        long jB = f.b(1L, eVar2, eVar);
        long j18 = (j15 / jB) - (j16 / jB);
        long j19 = (j15 % jB) - (j16 % jB);
        b.Companion companion = b.INSTANCE;
        return b.W(d.r(j18, eVar2), d.r(j19, eVar));
    }

    public static final long d(long j15, long j16, e eVar) {
        if (((j16 - 1) | 1) == Long.MAX_VALUE) {
            return j15 == j16 ? b.INSTANCE.d() : b.e0(a(j16));
        }
        return (1 | (j15 - 1)) == Long.MAX_VALUE ? a(j15) : c(j15, j16, eVar);
    }
}
