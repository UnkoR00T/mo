package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Ld1/k2;", "Ld1/c4;", "insets", "Ld1/u4;", "sides", "<init>", "(Ld1/c4;ILfr/k;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ld1/c4;", "getInsets", "()Ld1/c4;", "I", "getSides-JoeWqyM", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k2 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c4 insets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    public /* synthetic */ k2(c4 c4Var, int i15, fr.k kVar) {
        this(c4Var, i15);
    }

    @Override // d1.c4
    public int a(c5.d density) {
        if (u4.j(this.sides, u4.INSTANCE.e())) {
            return this.insets.a(density);
        }
        return 0;
    }

    @Override // d1.c4
    public int b(c5.d density) {
        if (u4.j(this.sides, u4.INSTANCE.g())) {
            return this.insets.b(density);
        }
        return 0;
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        if (u4.j(this.sides, layoutDirection == c5.t.Ltr ? u4.INSTANCE.a() : u4.INSTANCE.b())) {
            return this.insets.c(density, layoutDirection);
        }
        return 0;
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        if (u4.j(this.sides, layoutDirection == c5.t.Ltr ? u4.INSTANCE.c() : u4.INSTANCE.d())) {
            return this.insets.d(density, layoutDirection);
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) other;
        return fr.t.c(this.insets, k2Var.insets) && u4.i(this.sides, k2Var.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + u4.k(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) u4.m(this.sides)) + ')';
    }

    private k2(c4 c4Var, int i15) {
        this.insets = c4Var;
        this.sides = i15;
    }
}
