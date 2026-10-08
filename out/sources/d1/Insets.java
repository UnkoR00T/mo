package d1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.p0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Ld1/p0;", "Ld1/c4;", "Lc5/h;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLfr/k;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "e", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Insets implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    public /* synthetic */ Insets(float f15, float f16, float f17, float f18, fr.k kVar) {
        this(f15, f16, f17, f18);
    }

    @Override // d1.c4
    public int a(c5.d density) {
        return density.X0(this.bottom);
    }

    @Override // d1.c4
    public int b(c5.d density) {
        return density.X0(this.top);
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        return density.X0(this.left);
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        return density.X0(this.right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) other;
        return c5.h.p(this.left, insets.left) && c5.h.p(this.top, insets.top) && c5.h.p(this.right, insets.right) && c5.h.p(this.bottom, insets.bottom);
    }

    public int hashCode() {
        return (((((c5.h.q(this.left) * 31) + c5.h.q(this.top)) * 31) + c5.h.q(this.right)) * 31) + c5.h.q(this.bottom);
    }

    public String toString() {
        return "Insets(left=" + ((Object) c5.h.r(this.left)) + ", top=" + ((Object) c5.h.r(this.top)) + ", right=" + ((Object) c5.h.r(this.right)) + ", bottom=" + ((Object) c5.h.r(this.bottom)) + ')';
    }

    private Insets(float f15, float f16, float f17, float f18) {
        this.left = f15;
        this.top = f16;
        this.right = f17;
        this.bottom = f18;
    }
}
