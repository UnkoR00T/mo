package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Lc5/k;", "", "", "packedValue", "d", "(J)J", "Lc5/h;", "width", "height", "e", "(JFF)J", "", "l", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "j", "(J)F", "getWidth-D9Ej5fM$annotations", "i", "getHeight-D9Ej5fM$annotations", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f23406c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f23407d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: c5.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lc5/k$a;", "", "<init>", "()V", "Lc5/k;", "Zero", "J", "b", "()J", "Unspecified", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return k.f23407d;
        }

        public final long b() {
            return k.f23406c;
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

    public static final long e(long j15, float f15, float f16) {
        return d((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long f(long j15, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = j(j15);
        }
        if ((i15 & 2) != 0) {
            f16 = i(j15);
        }
        return e(j15, f15, f16);
    }

    public static boolean g(long j15, Object obj) {
        return (obj instanceof k) && j15 == ((k) obj).getPackedValue();
    }

    public static final boolean h(long j15, long j16) {
        return j15 == j16;
    }

    public static final float i(long j15) {
        return h.n(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }

    public static final float j(long j15) {
        return h.n(Float.intBitsToFloat((int) (j15 >> 32)));
    }

    public static int k(long j15) {
        return Long.hashCode(j15);
    }

    public static String l(long j15) {
        if (j15 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.r(j(j15))) + " x " + ((Object) h.r(i(j15)));
    }

    public boolean equals(Object other) {
        return g(this.packedValue, other);
    }

    public int hashCode() {
        return k(this.packedValue);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return l(this.packedValue);
    }
}
