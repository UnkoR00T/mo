package g4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: g4.p, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\b\u0010$¨\u0006&"}, d2 = {"Lg4/p;", "", "Lc5/h;", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLfr/k;)V", "Lc5/d;", "density", "Lg4/n1;", "a", "(Lc5/d;)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "b", "getTop-D9Ej5fM", "c", "getEnd-D9Ej5fM", "d", "getBottom-D9Ej5fM", "e", "Z", "()Z", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DpTouchBoundsExpansion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLayoutDirectionAware;

    public /* synthetic */ DpTouchBoundsExpansion(float f15, float f16, float f17, float f18, boolean z15, fr.k kVar) {
        this(f15, f16, f17, f18, z15);
    }

    public final long a(c5.d density) {
        return n1.d(n1.INSTANCE.c(density.X0(this.start), density.X0(this.top), density.X0(this.end), density.X0(this.bottom), this.isLayoutDirectionAware));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) other;
        return c5.h.p(this.start, dpTouchBoundsExpansion.start) && c5.h.p(this.top, dpTouchBoundsExpansion.top) && c5.h.p(this.end, dpTouchBoundsExpansion.end) && c5.h.p(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public int hashCode() {
        return (((((((c5.h.q(this.start) * 31) + c5.h.q(this.top)) * 31) + c5.h.q(this.end)) * 31) + c5.h.q(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) c5.h.r(this.start)) + ", top=" + ((Object) c5.h.r(this.top)) + ", end=" + ((Object) c5.h.r(this.end)) + ", bottom=" + ((Object) c5.h.r(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f15, float f16, float f17, float f18, boolean z15) {
        this.start = f15;
        this.top = f16;
        this.end = f17;
        this.bottom = f18;
        this.isLayoutDirectionAware = z15;
        if (!(f15 >= 0.0f)) {
            d4.a.a("Left must be non-negative");
        }
        if (!(f16 >= 0.0f)) {
            d4.a.a("Top must be non-negative");
        }
        if (!(f17 >= 0.0f)) {
            d4.a.a("Right must be non-negative");
        }
        if (f18 >= 0.0f) {
            return;
        }
        d4.a.a("Bottom must be non-negative");
    }
}
