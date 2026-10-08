package y1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012\u0088\u0001\u000b\u0092\u0001\u00020\n¨\u0006\u0015"}, d2 = {"Ly1/a;", "", "", "density", "fontScale", "b", "(FF)J", "Lc5/d;", "d", "(Lc5/d;)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "f", "(J)F", "g", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f223031b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly1/a$a;", "", "<init>", "()V", "Ly1/a;", "Unspecified", "J", "a", "()J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return a.f223031b;
        }

        private Companion() {
        }
    }

    public static long b(float f15, float f16) {
        return c((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    private static long c(long j15) {
        return j15;
    }

    public static long d(c5.d dVar) {
        return b(dVar.getDensity(), dVar.getFontScale());
    }

    public static final boolean e(long j15, long j16) {
        return j15 == j16;
    }

    public static final float f(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static final float g(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }

    public static String h(long j15) {
        return "InlineDensity(density=" + f(j15) + ", fontScale=" + g(j15) + ')';
    }
}
