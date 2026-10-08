package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0088\u0001\u000e\u0092\u0001\u00020\t¨\u0006\u0014"}, d2 = {"Ld1/u2;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "a", "(IIII)J", "Lc5/b;", "c", "Ld1/h2;", "orientation", "(JLd1/h2;)J", "value", "b", "(J)J", "f", "d", "(JIIII)J", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2 {
    public static long a(int i15, int i16, int i17, int i18) {
        return b(c5.c.a(i15, i16, i17, i18));
    }

    private static long b(long j15) {
        return j15;
    }

    public static long c(long j15, h2 h2Var) {
        h2 h2Var2 = h2.Horizontal;
        return a(h2Var == h2Var2 ? c5.b.n(j15) : c5.b.m(j15), h2Var == h2Var2 ? c5.b.l(j15) : c5.b.k(j15), h2Var == h2Var2 ? c5.b.m(j15) : c5.b.n(j15), h2Var == h2Var2 ? c5.b.k(j15) : c5.b.l(j15));
    }

    public static final long d(long j15, int i15, int i16, int i17, int i18) {
        return a(i15, i16, i17, i18);
    }

    public static /* synthetic */ long e(long j15, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = c5.b.n(j15);
        }
        int i25 = i15;
        if ((i19 & 2) != 0) {
            i16 = c5.b.l(j15);
        }
        int i26 = i16;
        if ((i19 & 4) != 0) {
            i17 = c5.b.m(j15);
        }
        int i27 = i17;
        if ((i19 & 8) != 0) {
            i18 = c5.b.k(j15);
        }
        return d(j15, i25, i26, i27, i18);
    }

    public static final long f(long j15, h2 h2Var) {
        return h2Var == h2.Horizontal ? c5.c.a(c5.b.n(j15), c5.b.l(j15), c5.b.m(j15), c5.b.k(j15)) : c5.c.a(c5.b.m(j15), c5.b.k(j15), c5.b.n(j15), c5.b.l(j15));
    }
}
