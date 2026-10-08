package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public u a() {
            c(ak.n0.v(b()));
            return d();
        }

        @RecentlyNonNull
        public abstract List<v> b();

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull List<v> list);

        abstract u d();
    }

    @RecentlyNonNull
    public static u b(@RecentlyNonNull List<v> list) {
        g1 g1Var = new g1();
        g1Var.c(list);
        return g1Var.a();
    }

    @RecentlyNonNull
    public abstract List<v> a();
}
