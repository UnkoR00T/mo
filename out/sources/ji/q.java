package ji;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    public static abstract class a {
        @RecentlyNonNull
        public abstract q a();

        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public q b() {
            f(ak.n0.v(c()));
            List<u0> listD = d();
            if (listD != null) {
                g(ak.n0.v(listD));
            }
            return a();
        }

        @RecentlyNonNull
        public abstract List<ii.l0> c();

        @RecentlyNullable
        public abstract List<u0> d();

        @RecentlyNonNull
        public abstract a e(m mVar);

        @RecentlyNonNull
        public abstract a f(@RecentlyNonNull List<ii.l0> list);

        @RecentlyNonNull
        public abstract a g(List<u0> list);

        @RecentlyNonNull
        public abstract a h(Uri uri);

        @RecentlyNonNull
        public abstract a i(String str);

        @RecentlyNonNull
        public abstract a j(int i15);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull List<ii.l0> list) {
        n0 n0Var = new n0();
        n0Var.f(list);
        n0Var.j(1);
        return n0Var;
    }

    @RecentlyNullable
    public abstract m b();

    @RecentlyNonNull
    public abstract List<ii.l0> c();

    @RecentlyNullable
    public abstract List<u0> d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract String f();

    public abstract int g();
}
