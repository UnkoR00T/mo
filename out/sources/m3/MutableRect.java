package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m3.c, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\bJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b!\u0010\u001cR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lm3/c;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Lm3/e;", "offset", "Loq/i0;", "m", "(J)V", "translateX", "translateY", "l", "(FF)V", "e", "g", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "i", "(F)V", "d", "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutableRect {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    public MutableRect(float f15, float f16, float f17, float f18) {
        this.left = f15;
        this.top = f16;
        this.right = f17;
        this.bottom = f18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void e(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean f() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final void g(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void h(float f15) {
        this.bottom = f15;
    }

    public final void i(float f15) {
        this.left = f15;
    }

    public final void j(float f15) {
        this.right = f15;
    }

    public final void k(float f15) {
        this.top = f15;
    }

    public final void l(float translateX, float translateY) {
        this.left += translateX;
        this.top += translateY;
        this.right += translateX;
        this.bottom += translateY;
    }

    public final void m(long offset) {
        l(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax)));
    }

    public String toString() {
        return "MutableRect(" + b.a(this.left, 1) + ", " + b.a(this.top, 1) + ", " + b.a(this.right, 1) + ", " + b.a(this.bottom, 1) + ')';
    }
}
