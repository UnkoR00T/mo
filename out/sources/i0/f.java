package i0;

import android.graphics.Rect;
import android.util.Size;
import g0.n0;
import java.util.UUID;
import y.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static f h(int i15, int i16, Rect rect, Size size, int i17, boolean z15) {
        return i(i15, i16, rect, size, i17, z15, false);
    }

    public static f i(int i15, int i16, Rect rect, Size size, int i17, boolean z15, boolean z16) {
        return new b(UUID.randomUUID(), i15, i16, rect, size, i17, z15, z16);
    }

    public static f j(n0 n0Var) {
        return h(n0Var.t(), n0Var.p(), n0Var.n(), x.f(n0Var.n(), n0Var.q()), n0Var.q(), n0Var.w());
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    abstract UUID f();

    public abstract boolean g();

    public abstract boolean k();
}
