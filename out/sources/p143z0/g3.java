package p143z0;

import fr.k;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006\""}, d2 = {"Lz0/g3;", "", "Lz0/a2;", "orientation", "Lm3/e;", "initialPositionChange", "<init>", "(Lz0/a2;JLfr/k;)V", "", "touchSlop", "a", "(F)J", "f", "(J)F", "b", "positionChange", "", "shouldCommit", "c", "(JFZ)J", "initialPositionAccumulator", "Loq/i0;", "g", "(J)V", "delta", "e", "(J)Z", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "i", "(Lz0/a2;)V", "J", "totalPositionChange", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long totalPositionChange;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231272a;

        static {
            int[] iArr = new int[a2.values().length];
            try {
                iArr[a2.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a2.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f231272a = iArr;
        }
    }

    public /* synthetic */ g3(a2 a2Var, long j15, k kVar) {
        this(a2Var, j15);
    }

    private final long a(float touchSlop) {
        if (this.orientation == null) {
            long j15 = this.totalPositionChange;
            return e.p(this.totalPositionChange, e.r(e.h(j15, e.k(j15)), touchSlop));
        }
        float f15 = f(this.totalPositionChange) - (Math.signum(f(this.totalPositionChange)) * touchSlop);
        float fB = b(this.totalPositionChange);
        if (this.orientation == a2.Horizontal) {
            return e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(fB)) & BodyPartID.bodyIdMax));
        }
        return e.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long d(g3 g3Var, long j15, float f15, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        return g3Var.c(j15, f15, z15);
    }

    public static /* synthetic */ void h(g3 g3Var, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = e.INSTANCE.c();
        }
        g3Var.g(j15);
    }

    public final float b(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Horizontal ? j15 & BodyPartID.bodyIdMax : j15 >> 32));
    }

    public final long c(long positionChange, float touchSlop, boolean shouldCommit) {
        long jQ;
        if (shouldCommit) {
            jQ = e.q(this.totalPositionChange, positionChange);
            this.totalPositionChange = jQ;
        } else {
            jQ = e.q(this.totalPositionChange, positionChange);
        }
        return (this.orientation == null ? e.k(jQ) : Math.abs(f(jQ))) >= touchSlop ? a(touchSlop) : e.INSTANCE.b();
    }

    public final boolean e(long delta) {
        long jQ = e.q(this.totalPositionChange, delta);
        double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jQ & BodyPartID.bodyIdMax))), Math.abs(Float.intBitsToFloat((int) (jQ >> 32))))) * 180)) / 3.141592653589793d;
        a2 a2Var = this.orientation;
        int i15 = a2Var == null ? -1 : a.f231272a[a2Var.ordinal()];
        if (i15 != 1) {
            return i15 == 2 && dAtan2 > 30.0d;
        }
        return dAtan2 < 30.0d;
    }

    public final float f(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
    }

    public final void g(long initialPositionAccumulator) {
        this.totalPositionChange = initialPositionAccumulator;
    }

    public final void i(a2 a2Var) {
        this.orientation = a2Var;
    }

    private g3(a2 a2Var, long j15) {
        this.orientation = a2Var;
        this.totalPositionChange = j15;
    }

    public /* synthetic */ g3(a2 a2Var, long j15, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : a2Var, (i15 & 2) != 0 ? e.INSTANCE.c() : j15, null);
    }
}
