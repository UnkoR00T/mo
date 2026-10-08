package o3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Lo3/b;", "", "", "packedValue", "d", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "f", "(J)I", "getComponentCount$annotations", "()V", "componentCount", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f141709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f141711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f141712e;

    /* JADX INFO: renamed from: o3.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lo3/b$a;", "", "<init>", "()V", "Lo3/b;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return b.f141711d;
        }

        public final long b() {
            return b.f141709b;
        }

        public final long c() {
            return b.f141710c;
        }

        private Companion() {
        }
    }

    static {
        long j15 = 3;
        long j16 = j15 << 32;
        f141709b = d((((long) 0) & BodyPartID.bodyIdMax) | j16);
        f141710c = d((((long) 1) & BodyPartID.bodyIdMax) | j16);
        f141711d = d(j16 | (((long) 2) & BodyPartID.bodyIdMax));
        f141712e = d((j15 & BodyPartID.bodyIdMax) | (((long) 4) << 32));
    }

    public static long d(long j15) {
        return j15;
    }

    public static final boolean e(long j15, long j16) {
        return j15 == j16;
    }

    public static final int f(long j15) {
        return (int) (j15 >> 32);
    }

    public static int g(long j15) {
        return Long.hashCode(j15);
    }

    public static String h(long j15) {
        if (e(j15, f141709b)) {
            return "Rgb";
        }
        if (e(j15, f141710c)) {
            return "Xyz";
        }
        if (e(j15, f141711d)) {
            return "Lab";
        }
        return e(j15, f141712e) ? "Cmyk" : "Unknown";
    }
}
