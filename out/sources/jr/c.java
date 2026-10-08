package jr;

import fr.k;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljr/c;", "", "<init>", "()V", "", "bitCount", "b", "(I)I", "e", "()I", "until", "f", "from", "g", "(II)I", "", "c", "()D", "d", "(DD)D", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f104401b = xq.b.f220500a.b();

    /* JADX INFO: renamed from: jr.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljr/c$a;", "Ljr/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "b", "(I)I", "e", "()I", "until", "f", "from", "g", "(II)I", "", "c", "()D", "d", "(DD)D", "defaultRandom", "Ljr/c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion extends c implements Serializable {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @Override // jr.c
        public int b(int bitCount) {
            return c.f104401b.b(bitCount);
        }

        @Override // jr.c
        public double c() {
            return c.f104401b.c();
        }

        @Override // jr.c
        public double d(double from, double until) {
            return c.f104401b.d(from, until);
        }

        @Override // jr.c
        public int e() {
            return c.f104401b.e();
        }

        @Override // jr.c
        public int f(int until) {
            return c.f104401b.f(until);
        }

        @Override // jr.c
        public int g(int from, int until) {
            return c.f104401b.g(from, until);
        }

        private Companion() {
        }
    }

    public abstract int b(int bitCount);

    public abstract double c();

    public double d(double from, double until) {
        double dC;
        d.b(from, until);
        double d15 = until - from;
        if (!Double.isInfinite(d15) || Math.abs(from) > Double.MAX_VALUE || Math.abs(until) > Double.MAX_VALUE) {
            dC = from + (c() * d15);
        } else {
            double d16 = 2;
            double dC2 = c() * ((until / d16) - (from / d16));
            dC = from + dC2 + dC2;
        }
        return dC >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : dC;
    }

    public abstract int e();

    public abstract int f(int until);

    public int g(int from, int until) {
        int iE;
        int i15;
        int iB;
        d.c(from, until);
        int i16 = until - from;
        if (i16 > 0 || i16 == Integer.MIN_VALUE) {
            if (((-i16) & i16) == i16) {
                iB = b(d.d(i16));
            } else {
                do {
                    iE = e() >>> 1;
                    i15 = iE % i16;
                } while ((iE - i15) + (i16 - 1) < 0);
                iB = i15;
            }
            return from + iB;
        }
        while (true) {
            int iE2 = e();
            if (from <= iE2 && iE2 < until) {
                return iE2;
            }
        }
    }
}
