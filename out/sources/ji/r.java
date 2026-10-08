package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;
import ii.t0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public r a() {
            List<ii.l0.d> listG = g();
            boolean z15 = f() instanceof ii.j;
            List<String> listE = e();
            List<String> listC = c();
            List<String> listD = d();
            List<String> listB = b();
            zj.p.e(z15, "LocationRestriction must be of type CircularBounds.");
            m(ak.n0.v(listG));
            if (listE != null) {
                l(ak.n0.v(listE));
            }
            if (listC != null) {
                j(ak.n0.v(listC));
            }
            if (listD != null) {
                k(ak.n0.v(listD));
            }
            if (listB != null) {
                i(ak.n0.v(listB));
            }
            return o();
        }

        @RecentlyNullable
        public abstract List<String> b();

        @RecentlyNullable
        public abstract List<String> c();

        @RecentlyNullable
        public abstract List<String> d();

        @RecentlyNullable
        public abstract List<String> e();

        @RecentlyNonNull
        public abstract ii.d0 f();

        @RecentlyNonNull
        public abstract List<ii.l0.d> g();

        @RecentlyNonNull
        public abstract a h(vh.a aVar);

        @RecentlyNonNull
        public abstract a i(List<String> list);

        @RecentlyNonNull
        public abstract a j(List<String> list);

        @RecentlyNonNull
        public abstract a k(List<String> list);

        @RecentlyNonNull
        public abstract a l(List<String> list);

        @RecentlyNonNull
        public abstract a m(@RecentlyNonNull List<ii.l0.d> list);

        @RecentlyNonNull
        public abstract a n(boolean z15);

        abstract r o();
    }

    public enum b {
        DISTANCE,
        POPULARITY
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull ii.d0 d0Var, @RecentlyNonNull List<ii.l0.d> list) {
        p0 p0Var = new p0();
        p0Var.p(d0Var);
        p0Var.m(list);
        p0Var.n(false);
        return p0Var;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNullable
    public abstract List<String> c();

    @RecentlyNullable
    public abstract List<String> d();

    @RecentlyNullable
    public abstract List<String> e();

    @RecentlyNullable
    public abstract List<String> f();

    @RecentlyNonNull
    public abstract ii.d0 g();

    @RecentlyNullable
    public abstract Integer h();

    @RecentlyNonNull
    public abstract List<ii.l0.d> i();

    @RecentlyNullable
    public abstract b j();

    @RecentlyNullable
    public abstract String k();

    @RecentlyNullable
    public abstract t0 l();

    public abstract boolean m();
}
