package k70;

import fr.t;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k70.l, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lk70/l;", "", "Ln3/y2;", "radius50", "radius150", "radius200", "radius300", "radius250", "radius500", "<init>", "(Ln3/y2;Ln3/y2;Ln3/y2;Ln3/y2;Ln3/y2;Ln3/y2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln3/y2;", "d", "()Ln3/y2;", "b", "c", "e", "getRadius250", "f", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Shapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius50;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius150;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius200;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius300;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius250;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 radius500;

    public Shapes() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final y2 getRadius150() {
        return this.radius150;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y2 getRadius200() {
        return this.radius200;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y2 getRadius300() {
        return this.radius300;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y2 getRadius50() {
        return this.radius50;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y2 getRadius500() {
        return this.radius500;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return t.c(this.radius50, shapes.radius50) && t.c(this.radius150, shapes.radius150) && t.c(this.radius200, shapes.radius200) && t.c(this.radius300, shapes.radius300) && t.c(this.radius250, shapes.radius250) && t.c(this.radius500, shapes.radius500);
    }

    public int hashCode() {
        return (((((((((this.radius50.hashCode() * 31) + this.radius150.hashCode()) * 31) + this.radius200.hashCode()) * 31) + this.radius300.hashCode()) * 31) + this.radius250.hashCode()) * 31) + this.radius500.hashCode();
    }

    public String toString() {
        return "Shapes(radius50=" + this.radius50 + ", radius150=" + this.radius150 + ", radius200=" + this.radius200 + ", radius300=" + this.radius300 + ", radius250=" + this.radius250 + ", radius500=" + this.radius500 + ')';
    }

    public Shapes(y2 y2Var, y2 y2Var2, y2 y2Var3, y2 y2Var4, y2 y2Var5, y2 y2Var6) {
        this.radius50 = y2Var;
        this.radius150 = y2Var2;
        this.radius200 = y2Var3;
        this.radius300 = y2Var4;
        this.radius250 = y2Var5;
        this.radius500 = y2Var6;
    }

    public /* synthetic */ Shapes(y2 y2Var, y2 y2Var2, y2 y2Var3, y2 y2Var4, y2 y2Var5, y2 y2Var6, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? l1.h.f(c5.h.n(4)) : y2Var, (i15 & 2) != 0 ? l1.h.f(c5.h.n(12)) : y2Var2, (i15 & 4) != 0 ? l1.h.f(c5.h.n(16)) : y2Var3, (i15 & 8) != 0 ? l1.h.f(c5.h.n(24)) : y2Var4, (i15 & 16) != 0 ? l1.h.f(c5.h.n(20)) : y2Var5, (i15 & 32) != 0 ? l1.h.f(c5.h.n(40)) : y2Var6);
    }
}
