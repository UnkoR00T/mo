package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u000e\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"", "Lgu/e;", "unit", "Lgu/b;", "q", "(ILgu/e;)J", "", "r", "(JLgu/e;)J", "other", "i", "(JJ)J", "nanos", "p", "(J)J", "millis", "o", "normalNanos", "m", "normalMillis", "k", "normalValue", "unitDiscriminator", "j", "(JI)J", "n", "l", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j15, long j16) {
        if (j15 != 4611686018427387903L && j15 != -4611686018427387903L) {
            return (j16 == 4611686018427387903L || j16 == -4611686018427387903L) ? j16 : lr.m.o(j15 + j16, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j16 || j16 >= 4611686018427387903L) && (j16 ^ j15) < 0) {
            return 9223372036854759646L;
        }
        return j15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j15, int i15) {
        return b.INSTANCE.a((j15 << 1) + ((long) i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j15) {
        return b.INSTANCE.a((j15 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j15) {
        return (-4611686018426L > j15 || j15 >= 4611686018427L) ? k(lr.m.o(j15, -4611686018427387903L, 4611686018427387903L)) : m(o(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j15) {
        return b.INSTANCE.a(j15 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j15) {
        return (-4611686018426999999L > j15 || j15 >= 4611686018427000000L) ? k(p(j15)) : m(j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j15) {
        return j15 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(long j15) {
        return j15 / ((long) 1000000);
    }

    public static final long q(int i15, e eVar) {
        return eVar.compareTo(e.SECONDS) <= 0 ? m(f.c(i15, eVar, e.NANOSECONDS)) : r(i15, eVar);
    }

    public static final long r(long j15, e eVar) {
        e eVar2 = e.NANOSECONDS;
        long jC = f.c(4611686018426999999L, eVar2, eVar);
        if ((-jC) <= j15 && j15 <= jC) {
            return m(f.c(j15, eVar, eVar2));
        }
        e eVar3 = e.MILLISECONDS;
        return eVar.compareTo(eVar3) >= 0 ? k(((long) hr.a.b(j15)) * g.d(Math.abs(lr.m.f(j15, -9223372036854775807L)), eVar)) : k(lr.m.o(f.b(j15, eVar, eVar3), -4611686018427387903L, 4611686018427387903L));
    }
}
