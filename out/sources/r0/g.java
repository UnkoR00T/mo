package r0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0017"}, d2 = {"Lr0/g;", "", "", "first", "second", "b", "(FF)J", "", "packedValue", "c", "(J)J", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    private /* synthetic */ g(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ g a(long j15) {
        return new g(j15);
    }

    public static long b(float f15, float f16) {
        return c((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public static long c(long j15) {
        return j15;
    }

    public static boolean d(long j15, Object obj) {
        return (obj instanceof g) && j15 == ((g) obj).getPackedValue();
    }

    public static int e(long j15) {
        return Long.hashCode(j15);
    }

    public static String f(long j15) {
        return '(' + Float.intBitsToFloat((int) (j15 >> 32)) + ", " + Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return e(this.packedValue);
    }

    public String toString() {
        return f(this.packedValue);
    }
}
