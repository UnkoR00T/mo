package ji;

import android.annotation.SuppressLint;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    public static abstract class a {
        @RecentlyNonNull
        public abstract s a();

        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public s b() {
            e(ak.n0.v(c()));
            List<u0> listD = d();
            if (listD != null) {
                f(ak.n0.v(listD));
            }
            return a();
        }

        @RecentlyNonNull
        public abstract List<ii.l0> c();

        @RecentlyNullable
        public abstract List<u0> d();

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<ii.l0> list);

        @RecentlyNonNull
        public abstract a f(List<u0> list);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull List<ii.l0> list) {
        r0 r0Var = new r0();
        r0Var.e(list);
        return r0Var;
    }

    @RecentlyNonNull
    public abstract List<ii.l0> b();

    @RecentlyNullable
    public abstract List<u0> c();
}
