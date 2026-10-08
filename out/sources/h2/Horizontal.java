package h2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: h2.i3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh2/i3;", "Lh2/r1$a;", "Lf3/c$b;", "alignment", "", "margin", "<init>", "(Lf3/c$b;I)V", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "menuWidth", "Lc5/t;", "layoutDirection", "a", "(Lc5/p;JILc5/t;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf3/c$b;", "b", "I", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Horizontal implements r1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c.b alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int margin;

    public Horizontal(f3.c.b bVar, int i15) {
        this.alignment = bVar;
        this.margin = i15;
    }

    @Override // h2.r1.a
    public int a(c5.p anchorBounds, long windowSize, int menuWidth, c5.t layoutDirection) {
        int i15 = (int) (windowSize >> 32);
        if (menuWidth >= i15 - (this.margin * 2)) {
            return f3.c.INSTANCE.g().a(menuWidth, i15, layoutDirection);
        }
        int iA = this.alignment.a(menuWidth, i15, layoutDirection);
        int i16 = this.margin;
        return lr.m.n(iA, i16, (i15 - i16) - menuWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Horizontal)) {
            return false;
        }
        Horizontal horizontal = (Horizontal) other;
        return fr.t.c(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
    }
}
