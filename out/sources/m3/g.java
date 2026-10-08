package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0001(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010)\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010+R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010)\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010+R\u001b\u00107\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010+R\u001b\u0010:\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010+R\u001a\u0010?\u001a\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=R\u001a\u0010C\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010AR\u0011\u0010E\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bD\u0010+R\u0011\u0010G\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bF\u0010=R\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bH\u0010=R\u0011\u0010K\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010=¨\u0006L"}, d2 = {"Lm3/g;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Lm3/e;", "offset", "u", "(J)Lm3/g;", "translateX", "translateY", "t", "(FF)Lm3/g;", "other", "q", "(Lm3/g;)Lm3/g;", "otherLeft", "otherTop", "otherRight", "otherBottom", "p", "(FFFF)Lm3/g;", "", "s", "(Lm3/g;)Z", "b", "(J)Z", "", "toString", "()Ljava/lang/String;", "c", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "F", "i", "()F", "getLeft$annotations", "()V", "m", "getTop$annotations", "k", "getRight$annotations", "d", "e", "getBottom$annotations", "o", "getWidth$annotations", "width", "h", "getHeight$annotations", "height", "Lm3/k;", "l", "()J", "getSize-NH-jbRc$annotations", "size", "r", "()Z", "isEmpty$annotations", "isEmpty", "j", "minDimension", "n", "topLeft", "g", "center", "f", "bottomRight", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f123476f = new g(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: m3.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lm3/g$a;", "", "<init>", "()V", "Lm3/g;", "Zero", "Lm3/g;", "a", "()Lm3/g;", "getZero$annotations", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final g a() {
            return g.f123476f;
        }

        private Companion() {
        }
    }

    public g(float f15, float f16, float f17, float f18) {
        this.left = f15;
        this.top = f16;
        this.right = f17;
        this.bottom = f18;
    }

    public static /* synthetic */ g d(g gVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = gVar.left;
        }
        if ((i15 & 2) != 0) {
            f16 = gVar.top;
        }
        if ((i15 & 4) != 0) {
            f17 = gVar.right;
        }
        if ((i15 & 8) != 0) {
            f18 = gVar.bottom;
        }
        return gVar.c(f15, f16, f17, f18);
    }

    public final boolean b(long offset) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax));
        return (fIntBitsToFloat >= this.left) & (fIntBitsToFloat < this.right) & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final g c(float left, float top, float right, float bottom) {
        return new g(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return Float.compare(this.left, gVar.left) == 0 && Float.compare(this.top, gVar.top) == 0 && Float.compare(this.right, gVar.right) == 0 && Float.compare(this.bottom, gVar.bottom) == 0;
    }

    public final long f() {
        float f15 = this.right;
        return e.e((((long) Float.floatToRawIntBits(this.bottom)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public final long g() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        return e.e((((long) Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float h() {
        return getBottom() - getTop();
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float j() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final long l() {
        float right = getRight() - getLeft();
        return k.d((((long) Float.floatToRawIntBits(getBottom() - getTop())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(right) << 32));
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final long n() {
        float f15 = this.left;
        return e.e((((long) Float.floatToRawIntBits(this.top)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public final float o() {
        return getRight() - getLeft();
    }

    public final g p(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new g(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    public final g q(g other) {
        return new g(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean r() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean s(g other) {
        return (this.left < other.right) & (other.left < this.right) & (this.top < other.bottom) & (other.top < this.bottom);
    }

    public final g t(float translateX, float translateY) {
        return new g(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public String toString() {
        return "Rect.fromLTRB(" + b.a(this.left, 1) + ", " + b.a(this.top, 1) + ", " + b.a(this.right, 1) + ", " + b.a(this.bottom, 1) + ')';
    }

    public final g u(long offset) {
        int i15 = (int) (offset >> 32);
        float fIntBitsToFloat = this.left + Float.intBitsToFloat(i15);
        float f15 = this.top;
        int i16 = (int) (offset & BodyPartID.bodyIdMax);
        return new g(fIntBitsToFloat, f15 + Float.intBitsToFloat(i16), this.right + Float.intBitsToFloat(i15), this.bottom + Float.intBitsToFloat(i16));
    }
}
