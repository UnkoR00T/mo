package k70;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k70.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lk70/f;", "", "Lc5/h;", "level0", "level1", "level2", "level3", "<init>", "(FFFFLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "c", "getLevel2-D9Ej5fM", "d", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Elevations {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float level0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float level1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float level2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float level3;

    public /* synthetic */ Elevations(float f15, float f16, float f17, float f18, fr.k kVar) {
        this(f15, f16, f17, f18);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getLevel0() {
        return this.level0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLevel1() {
        return this.level1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getLevel3() {
        return this.level3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Elevations)) {
            return false;
        }
        Elevations elevations = (Elevations) other;
        return c5.h.p(this.level0, elevations.level0) && c5.h.p(this.level1, elevations.level1) && c5.h.p(this.level2, elevations.level2) && c5.h.p(this.level3, elevations.level3);
    }

    public int hashCode() {
        return (((((c5.h.q(this.level0) * 31) + c5.h.q(this.level1)) * 31) + c5.h.q(this.level2)) * 31) + c5.h.q(this.level3);
    }

    public String toString() {
        return "Elevations(level0=" + ((Object) c5.h.r(this.level0)) + ", level1=" + ((Object) c5.h.r(this.level1)) + ", level2=" + ((Object) c5.h.r(this.level2)) + ", level3=" + ((Object) c5.h.r(this.level3)) + ')';
    }

    private Elevations(float f15, float f16, float f17, float f18) {
        this.level0 = f15;
        this.level1 = f16;
        this.level2 = f17;
        this.level3 = f18;
    }

    public /* synthetic */ Elevations(float f15, float f16, float f17, float f18, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? c5.h.n(0) : f15, (i15 & 2) != 0 ? c5.h.n(1) : f16, (i15 & 4) != 0 ? c5.h.n(3) : f17, (i15 & 8) != 0 ? c5.h.n(6) : f18, null);
    }
}
