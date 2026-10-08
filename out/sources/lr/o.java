package lr;

import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u001b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0018*\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020!*\u00020!2\u0006\u0010\u001a\u001a\u00020!¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020$*\u00020$2\u0006\u0010\u001a\u001a\u00020$¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010\u001e\u001a\u0019\u0010)\u001a\u00020\u0010*\u00020\u00102\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b)\u0010 \u001a\u0019\u0010*\u001a\u00020!*\u00020!2\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b*\u0010#\u001a\u0019\u0010+\u001a\u00020$*\u00020$2\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b+\u0010&\u001a5\u0010,\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0018*\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b,\u0010-\u001a!\u0010.\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/\u001a!\u00100\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b0\u00101\u001a!\u00102\u001a\u00020!*\u00020!2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u00020$*\u00020$2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b4\u00105\u001a1\u00108\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u0018*\u00028\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0007¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Llr/i;", "Ljr/c;", "random", "", "s", "(Llr/i;Ljr/c;)I", "to", "Llr/g;", "r", "(II)Llr/g;", "t", "(Llr/g;)Llr/g;", "step", "u", "(Llr/g;I)Llr/g;", "Llr/j;", "", "v", "(Llr/j;J)Llr/j;", "w", "(II)Llr/i;", "Llr/l;", "x", "(JJ)Llr/l;", "", "T", "minimumValue", "g", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "e", "(II)I", "f", "(JJ)J", "", "d", "(FF)F", "", "c", "(DD)D", "maximumValue", "j", "k", "i", "h", "p", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "n", "(III)I", "o", "(JJJ)J", "m", "(FFF)F", "l", "(DDD)D", "Llr/e;", "range", "q", "(Ljava/lang/Comparable;Llr/e;)Ljava/lang/Comparable;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class o extends n {
    public static double c(double d15, double d16) {
        return d15 < d16 ? d16 : d15;
    }

    public static float d(float f15, float f16) {
        return f15 < f16 ? f16 : f15;
    }

    public static int e(int i15, int i16) {
        return i15 < i16 ? i16 : i15;
    }

    public static long f(long j15, long j16) {
        return j15 < j16 ? j16 : j15;
    }

    public static <T extends Comparable<? super T>> T g(T t15, T t16) {
        return t15.compareTo(t16) < 0 ? t16 : t15;
    }

    public static double h(double d15, double d16) {
        return d15 > d16 ? d16 : d15;
    }

    public static float i(float f15, float f16) {
        return f15 > f16 ? f16 : f15;
    }

    public static int j(int i15, int i16) {
        return i15 > i16 ? i16 : i15;
    }

    public static long k(long j15, long j16) {
        return j15 > j16 ? j16 : j15;
    }

    public static double l(double d15, double d16, double d17) {
        if (d16 <= d17) {
            if (d15 < d16) {
                return d16;
            }
            return d15 > d17 ? d17 : d15;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d17 + " is less than minimum " + d16 + '.');
    }

    public static float m(float f15, float f16, float f17) {
        if (f16 <= f17) {
            if (f15 < f16) {
                return f16;
            }
            return f15 > f17 ? f17 : f15;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f17 + " is less than minimum " + f16 + '.');
    }

    public static int n(int i15, int i16, int i17) {
        if (i16 <= i17) {
            if (i15 < i16) {
                return i16;
            }
            return i15 > i17 ? i17 : i15;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i17 + " is less than minimum " + i16 + '.');
    }

    public static long o(long j15, long j16, long j17) {
        if (j16 <= j17) {
            if (j15 < j16) {
                return j16;
            }
            return j15 > j17 ? j17 : j15;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j17 + " is less than minimum " + j16 + '.');
    }

    public static <T extends Comparable<? super T>> T p(T t15, T t16, T t17) {
        if (t16 == null || t17 == null) {
            if (t16 != null && t15.compareTo(t16) < 0) {
                return t16;
            }
            if (t17 != null && t15.compareTo(t17) > 0) {
                return t17;
            }
        } else {
            if (t16.compareTo(t17) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t17 + " is less than minimum " + t16 + '.');
            }
            if (t15.compareTo(t16) < 0) {
                return t16;
            }
            if (t15.compareTo(t17) > 0) {
                return t17;
            }
        }
        return t15;
    }

    public static <T extends Comparable<? super T>> T q(T t15, e<T> eVar) {
        if (!eVar.isEmpty()) {
            if (!eVar.f(t15, eVar.e()) || eVar.f(eVar.e(), t15)) {
                return (!eVar.f(eVar.h(), t15) || eVar.f(t15, eVar.h())) ? t15 : eVar.h();
            }
            return eVar.e();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    public static g r(int i15, int i16) {
        return g.INSTANCE.a(i15, i16, -1);
    }

    public static int s(i iVar, jr.c cVar) {
        try {
            return jr.d.e(cVar, iVar);
        } catch (IllegalArgumentException e15) {
            throw new NoSuchElementException(e15.getMessage());
        }
    }

    public static g t(g gVar) {
        return g.INSTANCE.a(gVar.getLast(), gVar.getFirst(), -gVar.getStep());
    }

    public static g u(g gVar, int i15) {
        n.a(i15 > 0, Integer.valueOf(i15));
        g.Companion companion = g.INSTANCE;
        int first = gVar.getFirst();
        int last = gVar.getLast();
        if (gVar.getStep() <= 0) {
            i15 = -i15;
        }
        return companion.a(first, last, i15);
    }

    public static j v(j jVar, long j15) {
        n.a(j15 > 0, Long.valueOf(j15));
        j.Companion aVar = j.INSTANCE;
        long jI = jVar.getFirst();
        long jK = jVar.getLast();
        if (jVar.getStep() <= 0) {
            j15 = -j15;
        }
        return aVar.a(jI, jK, j15);
    }

    public static i w(int i15, int i16) {
        return i16 <= Integer.MIN_VALUE ? i.INSTANCE.a() : new i(i15, i16 - 1);
    }

    public static l x(long j15, long j16) {
        return j16 <= Long.MIN_VALUE ? l.INSTANCE.a() : new l(j15, j16 - 1);
    }
}
