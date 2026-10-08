package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lm3/a;", "", "", "packedValue", "b", "(J)J", "", "e", "(J)Ljava/lang/String;", "a", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f123465b = b(0);

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lm3/a$a;", "", "<init>", "()V", "Lm3/a;", "Zero", "J", "a", "()J", "getZero-kKHJgLs$annotations", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return a.f123465b;
        }

        private Companion() {
        }
    }

    public static long b(long j15) {
        return j15;
    }

    public static final boolean c(long j15, long j16) {
        return j15 == j16;
    }

    public static int d(long j15) {
        return Long.hashCode(j15);
    }

    public static String e(long j15) {
        int i15 = (int) (j15 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        if (fIntBitsToFloat == Float.intBitsToFloat(i16)) {
            return "CornerRadius.circular(" + b.a(Float.intBitsToFloat(i15), 1) + ')';
        }
        return "CornerRadius.elliptical(" + b.a(Float.intBitsToFloat(i15), 1) + ", " + b.a(Float.intBitsToFloat(i16), 1) + ')';
    }
}
