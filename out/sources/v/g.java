package v;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    g() {
    }

    public static g a(SurfaceConfig surfaceConfig, int i15, Size size, o.i0 i0Var, List<x3.b> list, p1 p1Var, int i16, Range<Integer> range, boolean z15, int i17) {
        return new h(surfaceConfig, i15, size, i0Var, list, p1Var, i16, range, z15, i17);
    }

    public abstract List<x3.b> b();

    public abstract int c();

    public abstract o.i0 d();

    public abstract int e();

    public abstract p1 f();

    public abstract int g();

    public abstract Size h();

    public abstract SurfaceConfig i();

    public abstract Range<Integer> j();

    public abstract boolean k();

    public n3 l(p1 p1Var) {
        return n3.a(h()).g(g()).c(j()).b(d()).d(p1Var).a();
    }
}
