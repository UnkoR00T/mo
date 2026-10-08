package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 (2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010\u0007\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\fR\u001b\u0010\b\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006)"}, d2 = {"Lm3/e;", "", "", "packedValue", "e", "(J)J", "", "x", "y", "f", "(JFF)J", "k", "(J)F", "l", "other", "p", "(JJ)J", "q", "operand", "r", "(JF)J", "h", "", "s", "(J)Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "m", "getX$annotations", "()V", "n", "getY$annotations", "b", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f123471c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f123472d = e(9187343241974906880L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f123473e = e(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: m3.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lm3/e$a;", "", "<init>", "()V", "Lm3/e;", "Zero", "J", "c", "()J", "getZero-F1C5BW0$annotations", "Infinite", "a", "getInfinite-F1C5BW0$annotations", "Unspecified", "b", "getUnspecified-F1C5BW0$annotations", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return e.f123472d;
        }

        public final long b() {
            return e.f123473e;
        }

        public final long c() {
            return e.f123471c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ e(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ e d(long j15) {
        return new e(j15);
    }

    public static long e(long j15) {
        return j15;
    }

    public static final long f(long j15, float f15, float f16) {
        return e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long g(long j15, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = Float.intBitsToFloat((int) (j15 >> 32));
        }
        if ((i15 & 2) != 0) {
            f16 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j15));
        }
        return f(j15, f15, f16);
    }

    public static final long h(long j15, float f15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) / f15;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) / f15;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public static boolean i(long j15, Object obj) {
        return (obj instanceof e) && j15 == ((e) obj).getPackedValue();
    }

    public static final boolean j(long j15, long j16) {
        return j15 == j16;
    }

    public static final float k(long j15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float l(long j15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float m(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static final float n(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }

    public static int o(long j15) {
        return Long.hashCode(j15);
    }

    public static final long p(long j15, long j16) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) - Float.intBitsToFloat((int) (j16 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public static final long q(long j15, long j16) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) + Float.intBitsToFloat((int) (j16 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public static final long r(long j15, float f15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) * f15;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) * f15;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public static String s(long j15) {
        if ((9223372034707292159L & j15) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + b.a(Float.intBitsToFloat((int) (j15 >> 32)), 1) + ", " + b.a(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), 1) + ')';
    }

    public boolean equals(Object other) {
        return i(this.packedValue, other);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return s(this.packedValue);
    }
}
