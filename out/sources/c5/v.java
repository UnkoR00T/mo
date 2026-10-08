package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006!"}, d2 = {"Lc5/v;", "", "", "packedValue", "c", "(J)J", "", "k", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "getRawType$annotations", "()V", "rawType", "Lc5/x;", "g", "type", "j", "(J)Z", "isSp", "", "h", "(J)F", "value", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x[] f23428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f23429d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: c5.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lc5/v$a;", "", "<init>", "()V", "Lc5/v;", "Unspecified", "J", "a", "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return v.f23429d;
        }

        private Companion() {
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        f23428c = new x[]{x.d(companion.c()), x.d(companion.b()), x.d(companion.a())};
        f23429d = w.i(0L, Float.NaN);
    }

    private /* synthetic */ v(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ v b(long j15) {
        return new v(j15);
    }

    public static long c(long j15) {
        return j15;
    }

    public static boolean d(long j15, Object obj) {
        return (obj instanceof v) && j15 == ((v) obj).getPackedValue();
    }

    public static final boolean e(long j15, long j16) {
        return j15 == j16;
    }

    public static final long f(long j15) {
        return j15 & 1095216660480L;
    }

    public static final long g(long j15) {
        return f23428c[(int) (f(j15) >>> 32)].getType();
    }

    public static final float h(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }

    public static int i(long j15) {
        return Long.hashCode(j15);
    }

    public static final boolean j(long j15) {
        return f(j15) == 4294967296L;
    }

    public static String k(long j15) {
        long jG = g(j15);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.c())) {
            return "Unspecified";
        }
        if (x.g(jG, companion.b())) {
            return h(j15) + ".sp";
        }
        if (!x.g(jG, companion.a())) {
            return "Invalid";
        }
        return h(j15) + ".em";
    }

    public boolean equals(Object other) {
        return d(this.packedValue, other);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return k(this.packedValue);
    }
}
