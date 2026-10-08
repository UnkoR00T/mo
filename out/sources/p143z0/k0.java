package p143z0;

import b4.f;
import c5.z;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0012"}, d2 = {"Lz0/k0;", "", "<init>", "()V", "", "timeMillis", "Lm3/e;", "delta", "Loq/i0;", "a", "(JJ)V", "Lc5/y;", "b", "()J", "Lb4/f;", "Lb4/f;", "xVelocityTracker", "yVelocityTracker", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f231401c = f.f16477i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f xVelocityTracker = new f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f yVelocityTracker = new f(true);

    public final void a(long timeMillis, long delta) {
        this.xVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (delta >> 32)));
        this.yVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (delta & BodyPartID.bodyIdMax)));
    }

    public final long b() {
        return z.a(this.xVelocityTracker.d(Float.MAX_VALUE), this.yVelocityTracker.d(Float.MAX_VALUE));
    }
}
