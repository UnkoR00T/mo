package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001c\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\""}, d2 = {"Lc5/n;", "", "", "packedValue", "d", "(J)J", "", "x", "y", "e", "(JII)J", "other", "l", "(JJ)J", "m", "", "n", "(J)Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "i", "(J)I", "getX$annotations", "()V", "j", "getY$annotations", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f23410c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f23411d = d(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: c5.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lc5/n$a;", "", "<init>", "()V", "Lc5/n;", "Zero", "J", "b", "()J", "Max", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return n.f23411d;
        }

        public final long b() {
            return n.f23410c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ n(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ n c(long j15) {
        return new n(j15);
    }

    public static long d(long j15) {
        return j15;
    }

    public static final long e(long j15, int i15, int i16) {
        return d((((long) i15) << 32) | (((long) i16) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long f(long j15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = (int) (j15 >> 32);
        }
        if ((i17 & 2) != 0) {
            i16 = (int) (BodyPartID.bodyIdMax & j15);
        }
        return e(j15, i15, i16);
    }

    public static boolean g(long j15, Object obj) {
        return (obj instanceof n) && j15 == ((n) obj).getPackedValue();
    }

    public static final boolean h(long j15, long j16) {
        return j15 == j16;
    }

    public static final int i(long j15) {
        return (int) (j15 >> 32);
    }

    public static final int j(long j15) {
        return (int) (j15 & BodyPartID.bodyIdMax);
    }

    public static int k(long j15) {
        return Long.hashCode(j15);
    }

    public static final long l(long j15, long j16) {
        return d((((long) (((int) (j15 >> 32)) - ((int) (j16 >> 32)))) << 32) | (((long) (((int) (j15 & BodyPartID.bodyIdMax)) - ((int) (j16 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }

    public static final long m(long j15, long j16) {
        return d((((long) (((int) (j15 >> 32)) + ((int) (j16 >> 32)))) << 32) | (((long) (((int) (j15 & BodyPartID.bodyIdMax)) + ((int) (j16 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }

    public static String n(long j15) {
        return '(' + i(j15) + ", " + j(j15) + ')';
    }

    public boolean equals(Object other) {
        return g(this.packedValue, other);
    }

    public int hashCode() {
        return k(this.packedValue);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return n(this.packedValue);
    }
}
