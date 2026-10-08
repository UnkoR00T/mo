package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00168Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010!\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lm3/k;", "", "", "packedValue", "d", "(J)J", "", "k", "(J)Z", "", "l", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "", "i", "(J)F", "getWidth$annotations", "()V", "width", "g", "getHeight$annotations", "height", "h", "getMinDimension$annotations", "minDimension", "b", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f123492c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f123493d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: m3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lm3/k$a;", "", "<init>", "()V", "Lm3/k;", "Zero", "J", "b", "()J", "getZero-NH-jbRc$annotations", "Unspecified", "a", "getUnspecified-NH-jbRc$annotations", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return k.f123493d;
        }

        public final long b() {
            return k.f123492c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ k(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ k c(long j15) {
        return new k(j15);
    }

    public static long d(long j15) {
        return j15;
    }

    public static boolean e(long j15, Object obj) {
        return (obj instanceof k) && j15 == ((k) obj).getPackedValue();
    }

    public static final boolean f(long j15, long j16) {
        return j15 == j16;
    }

    public static final float g(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }

    public static final float h(long j15) {
        return Math.min(Float.intBitsToFloat((int) ((j15 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j15 & 2147483647L)));
    }

    public static final float i(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static int j(long j15) {
        return Long.hashCode(j15);
    }

    public static final boolean k(long j15) {
        return (j15 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j15 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) <= 0.0f);
    }

    public static String l(long j15) {
        if (j15 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + b.a(Float.intBitsToFloat((int) (j15 >> 32)), 1) + ", " + b.a(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), 1) + ')';
    }

    public boolean equals(Object other) {
        return e(this.packedValue, other);
    }

    public int hashCode() {
        return j(this.packedValue);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return l(this.packedValue);
    }
}
