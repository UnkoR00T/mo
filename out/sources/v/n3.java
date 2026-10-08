package v;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f202727a = new Range<>(0, 0);

    public static abstract class a {
        a() {
        }

        public abstract n3 a();

        public abstract a b(o.i0 i0Var);

        public abstract a c(Range<Integer> range);

        public abstract a d(p1 p1Var);

        public abstract a e(Size size);

        public abstract a f(Size size);

        public abstract a g(int i15);

        public abstract a h(boolean z15);
    }

    public static a a(Size size) {
        return new q.b().f(size).e(size).g(0).c(f202727a).b(o.i0.f140011d).h(false);
    }

    public abstract o.i0 b();

    public abstract Range<Integer> c();

    public abstract p1 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract a i();
}
