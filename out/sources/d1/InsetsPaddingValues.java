package d1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.w1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f¨\u0006 "}, d2 = {"Ld1/w1;", "Ld1/d3;", "Ld1/c4;", "insets", "Lc5/d;", "density", "<init>", "(Ld1/c4;Lc5/d;)V", "Lc5/t;", "layoutDirection", "Lc5/h;", "c", "(Lc5/t;)F", "d", "()F", "b", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ld1/c4;", "getInsets", "()Ld1/c4;", "Lc5/d;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InsetsPaddingValues implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c4 insets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c5.d density;

    public InsetsPaddingValues(c4 c4Var, c5.d dVar) {
        this.insets = c4Var;
        this.density = dVar;
    }

    @Override // d1.d3
    /* JADX INFO: renamed from: a */
    public float getBottom() {
        c5.d dVar = this.density;
        return dVar.b2(this.insets.a(dVar));
    }

    @Override // d1.d3
    public float b(c5.t layoutDirection) {
        c5.d dVar = this.density;
        return dVar.b2(this.insets.d(dVar, layoutDirection));
    }

    @Override // d1.d3
    public float c(c5.t layoutDirection) {
        c5.d dVar = this.density;
        return dVar.b2(this.insets.c(dVar, layoutDirection));
    }

    @Override // d1.d3
    /* JADX INFO: renamed from: d */
    public float getTop() {
        c5.d dVar = this.density;
        return dVar.b2(this.insets.b(dVar));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return fr.t.c(this.insets, insetsPaddingValues.insets) && fr.t.c(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
