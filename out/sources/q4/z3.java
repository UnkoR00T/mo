package q4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087@\u0018\u0000 (2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010#\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010'\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006)"}, d2 = {"Lq4/z3;", "", "", "packedValue", "c", "(J)J", "other", "", "p", "(JJ)Z", "d", "", "offset", "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "J", "n", "(J)I", "start", "i", "end", "l", "min", "k", "max", "h", "(J)Z", "collapsed", "m", "reversed", "j", "length", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f164656c = a4.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: q4.z3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq4/z3$a;", "", "<init>", "()V", "Lq4/z3;", "Zero", "J", "a", "()J", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return z3.f164656c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ z3(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ z3 b(long j15) {
        return new z3(j15);
    }

    public static long c(long j15) {
        return j15;
    }

    public static final boolean d(long j15, long j16) {
        return (l(j15) <= l(j16)) & (k(j16) <= k(j15));
    }

    public static final boolean e(long j15, int i15) {
        return i15 < k(j15) && l(j15) <= i15;
    }

    public static boolean f(long j15, Object obj) {
        return (obj instanceof z3) && j15 == ((z3) obj).getPackedValue();
    }

    public static final boolean g(long j15, long j16) {
        return j15 == j16;
    }

    public static final boolean h(long j15) {
        return n(j15) == i(j15);
    }

    public static final int i(long j15) {
        return (int) (j15 & BodyPartID.bodyIdMax);
    }

    public static final int j(long j15) {
        return k(j15) - l(j15);
    }

    public static final int k(long j15) {
        return Math.max(n(j15), i(j15));
    }

    public static final int l(long j15) {
        return Math.min(n(j15), i(j15));
    }

    public static final boolean m(long j15) {
        return n(j15) > i(j15);
    }

    public static final int n(long j15) {
        return (int) (j15 >> 32);
    }

    public static int o(long j15) {
        return Long.hashCode(j15);
    }

    public static final boolean p(long j15, long j16) {
        return (l(j15) < k(j16)) & (l(j16) < k(j15));
    }

    public static String q(long j15) {
        return "TextRange(" + n(j15) + ", " + i(j15) + ')';
    }

    public boolean equals(Object other) {
        return f(this.packedValue, other);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return q(this.packedValue);
    }
}
