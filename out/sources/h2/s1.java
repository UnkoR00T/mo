package h2;

import d1.c4;
import d1.f4;
import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lh2/s1;", "Ld1/c4;", "initialInsets", "<init>", "(Ld1/c4;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "<set-?>", "Lm2/a3;", "e", "()Ld1/c4;", "f", "insets", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 insets;

    /* JADX WARN: Multi-variable type inference failed */
    public s1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // d1.c4
    public int a(c5.d density) {
        return e().a(density);
    }

    @Override // d1.c4
    public int b(c5.d density) {
        return e().b(density);
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        return e().c(density, layoutDirection);
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        return e().d(density, layoutDirection);
    }

    public final c4 e() {
        return (c4) this.insets.getValue();
    }

    public final void f(c4 c4Var) {
        this.insets.setValue(c4Var);
    }

    public s1(c4 c4Var) {
        this.insets = c6.e(c4Var, null, 2, null);
    }

    public /* synthetic */ s1(c4 c4Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? f4.b(0, 0, 0, 0) : c4Var);
    }
}
