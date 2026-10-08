package d1;

import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R0\u0010,\u001a\u00020$2\u000b\u0010&\u001a\u00070$¢\u0006\u0002\b%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Ld1/e;", "Ld1/c4;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "Lj6/f1;", "windowInsetsCompat", "typeMask", "Loq/i0;", "h", "(Lj6/f1;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getType$foundation_layout", "Ljava/lang/String;", "Lx5/h;", "Lkotlin/jvm/internal/EnhancedNullability;", "<set-?>", "Lm2/a3;", "e", "()Lx5/h;", "f", "(Lx5/h;)V", "insets", "isVisible", "()Z", "g", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 insets = c6.e(x5.h.f216812e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isVisible = c6.e(Boolean.TRUE, null, 2, null);

    public e(int i15, String str) {
        this.type = i15;
        this.name = str;
    }

    @Override // d1.c4
    public int a(c5.d density) {
        return e().f216816d;
    }

    @Override // d1.c4
    public int b(c5.d density) {
        return e().f216814b;
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        return e().f216813a;
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        return e().f216815c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x5.h e() {
        return (x5.h) this.insets.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof e) && this.type == ((e) other).type;
    }

    public final void f(x5.h hVar) {
        this.insets.setValue(hVar);
    }

    public final void g(boolean z15) {
        this.isVisible.setValue(Boolean.valueOf(z15));
    }

    public final void h(j6.f1 windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            f(windowInsetsCompat.f(this.type));
            g(windowInsetsCompat.q(this.type));
        }
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return this.name + '(' + e().f216813a + ", " + e().f216814b + ", " + e().f216815c + ", " + e().f216816d + ')';
    }
}
