package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Ld1/o0;", "Ld1/c4;", "included", "excluded", "<init>", "(Ld1/c4;Ld1/c4;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ld1/c4;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o0 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c4 included;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c4 excluded;

    public o0(c4 c4Var, c4 c4Var2) {
        this.included = c4Var;
        this.excluded = c4Var2;
    }

    @Override // d1.c4
    public int a(c5.d density) {
        return lr.m.e(this.included.a(density) - this.excluded.a(density), 0);
    }

    @Override // d1.c4
    public int b(c5.d density) {
        return lr.m.e(this.included.b(density) - this.excluded.b(density), 0);
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        return lr.m.e(this.included.c(density, layoutDirection) - this.excluded.c(density, layoutDirection), 0);
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        return lr.m.e(this.included.d(density, layoutDirection) - this.excluded.d(density, layoutDirection), 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) other;
        return fr.t.c(o0Var.included, this.included) && fr.t.c(o0Var.excluded, this.excluded);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
