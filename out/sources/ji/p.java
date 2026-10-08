package ji;

import ak.q1;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;
import ii.t0;
import ii.v0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public p a() {
            Double dValueOf = Double.valueOf(5.0d);
            Double dValueOf2 = Double.valueOf(1.0d);
            f(ak.n0.v(c()));
            g(ak.n0.v(d()));
            Double dB = b();
            if (dB != null) {
                zj.p.n(dB.doubleValue() >= 1.0d && dB.doubleValue() <= 5.0d, "Min rating must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, dB);
            }
            List<Integer> listD = d();
            if (!listD.isEmpty()) {
                for (Integer num : listD) {
                    zj.p.n(q1.d(0, 4).g(num), "Price level must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, num);
                }
            }
            return n();
        }

        @RecentlyNullable
        public abstract Double b();

        @RecentlyNonNull
        public abstract List<ii.l0.d> c();

        @RecentlyNonNull
        public abstract List<Integer> d();

        @RecentlyNonNull
        public abstract a e(vh.a aVar);

        @RecentlyNonNull
        public abstract a f(@RecentlyNonNull List<ii.l0.d> list);

        @RecentlyNonNull
        public abstract a g(@RecentlyNonNull List<Integer> list);

        @RecentlyNonNull
        public abstract a h(boolean z15);

        @RecentlyNonNull
        public abstract a i(boolean z15);

        @RecentlyNonNull
        public abstract a j(boolean z15);

        @RecentlyNonNull
        public abstract a k(boolean z15);

        @RecentlyNonNull
        public abstract a l(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a m(int i15);

        abstract p n();
    }

    public enum b {
        DISTANCE,
        RELEVANCE
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull String str, @RecentlyNonNull List<ii.l0.d> list) {
        l0 l0Var = new l0();
        l0Var.o(false);
        l0Var.f(list);
        l0Var.g(new ArrayList());
        l0Var.l(str);
        l0Var.k(false);
        l0Var.i(false);
        l0Var.h(false);
        l0Var.m(1);
        l0Var.j(false);
        return l0Var;
    }

    @RecentlyNullable
    public abstract ii.s c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract ii.c0 e();

    @RecentlyNullable
    public abstract ii.d0 f();

    @RecentlyNullable
    public abstract Integer g();

    @RecentlyNullable
    public abstract Double h();

    @RecentlyNonNull
    public abstract List<ii.l0.d> i();

    @RecentlyNonNull
    public abstract List<Integer> j();

    @RecentlyNullable
    public abstract b k();

    @RecentlyNullable
    public abstract String l();

    @RecentlyNullable
    public abstract t0 m();

    @RecentlyNullable
    public abstract v0 n();

    @RecentlyNonNull
    public abstract String o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    @RecentlyNullable
    public abstract String u();

    public abstract int v();

    @RecentlyNonNull
    public abstract a w();
}
