package r0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0018"}, d2 = {"Lr0/n;", "", "", "first", "second", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "g", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "e", "f", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    private /* synthetic */ n(long j15) {
        this.packedValue = j15;
    }

    public static final /* synthetic */ n a(long j15) {
        return new n(j15);
    }

    public static long b(int i15, int i16) {
        return c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
    }

    public static long c(long j15) {
        return j15;
    }

    public static boolean d(long j15, Object obj) {
        return (obj instanceof n) && j15 == ((n) obj).getPackedValue();
    }

    public static final int e(long j15) {
        return (int) (j15 >> 32);
    }

    public static final int f(long j15) {
        return (int) (j15 & BodyPartID.bodyIdMax);
    }

    public static int g(long j15) {
        return Long.hashCode(j15);
    }

    public static String h(long j15) {
        return '(' + e(j15) + ", " + f(j15) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }
}
