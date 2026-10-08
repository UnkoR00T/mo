package d1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.f3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u000e¨\u0006&"}, d2 = {"Ld1/f3;", "Ld1/d3;", "Lc5/h;", "start", "top", "end", "bottom", "<init>", "(FFFFLfr/k;)V", "Lc5/t;", "layoutDirection", "c", "(Lc5/t;)F", "d", "()F", "b", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaddingValues implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    public /* synthetic */ PaddingValues(float f15, float f16, float f17, float f18, fr.k kVar) {
        this(f15, f16, f17, f18);
    }

    @Override // d1.d3
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getBottom() {
        return this.bottom;
    }

    @Override // d1.d3
    public float b(c5.t layoutDirection) {
        return layoutDirection == c5.t.Ltr ? this.end : this.start;
    }

    @Override // d1.d3
    public float c(c5.t layoutDirection) {
        return layoutDirection == c5.t.Ltr ? this.start : this.end;
    }

    @Override // d1.d3
    /* JADX INFO: renamed from: d, reason: from getter */
    public float getTop() {
        return this.top;
    }

    public boolean equals(Object other) {
        if (!(other instanceof PaddingValues)) {
            return false;
        }
        PaddingValues paddingValues = (PaddingValues) other;
        return c5.h.p(this.start, paddingValues.start) && c5.h.p(this.top, paddingValues.top) && c5.h.p(this.end, paddingValues.end) && c5.h.p(this.bottom, paddingValues.bottom);
    }

    public int hashCode() {
        return (((((c5.h.q(this.start) * 31) + c5.h.q(this.top)) * 31) + c5.h.q(this.end)) * 31) + c5.h.q(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) c5.h.r(this.start)) + ", top=" + ((Object) c5.h.r(this.top)) + ", end=" + ((Object) c5.h.r(this.end)) + ", bottom=" + ((Object) c5.h.r(this.bottom)) + ')';
    }

    private PaddingValues(float f15, float f16, float f17, float f18) {
        this.start = f15;
        this.top = f16;
        this.end = f17;
        this.bottom = f18;
        if (!((f15 >= 0.0f) & (f16 >= 0.0f) & (f17 >= 0.0f)) || !(f18 >= 0.0f)) {
            e1.a.a("Padding must be non-negative");
        }
    }
}
