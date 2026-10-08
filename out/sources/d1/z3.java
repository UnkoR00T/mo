package d1;

import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ld1/z3;", "Ld1/c4;", "Ld1/x1;", "insets", "", "name", "<init>", "(Ld1/x1;Ljava/lang/String;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "<set-?>", "Lm2/a3;", "e", "()Ld1/x1;", "f", "(Ld1/x1;)V", "value", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z3 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 value;

    public z3(InsetsValues insetsValues, String str) {
        this.name = str;
        this.value = c6.e(insetsValues, null, 2, null);
    }

    @Override // d1.c4
    public int a(c5.d density) {
        return e().getBottom();
    }

    @Override // d1.c4
    public int b(c5.d density) {
        return e().getTop();
    }

    @Override // d1.c4
    public int c(c5.d density, c5.t layoutDirection) {
        return e().getLeft();
    }

    @Override // d1.c4
    public int d(c5.d density, c5.t layoutDirection) {
        return e().getRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues e() {
        return (InsetsValues) this.value.getValue();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof z3) {
            return fr.t.c(e(), ((z3) other).e());
        }
        return false;
    }

    public final void f(InsetsValues insetsValues) {
        this.value.setValue(insetsValues);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name + "(left=" + e().getLeft() + ", top=" + e().getTop() + ", right=" + e().getRight() + ", bottom=" + e().getBottom() + ')';
    }
}
