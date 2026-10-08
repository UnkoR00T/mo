package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract q a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull List<k> list);
    }

    @RecentlyNonNull
    public static q c(@RecentlyNonNull Integer num, @RecentlyNonNull List<k> list) {
        c1 c1Var = new c1();
        c1Var.c(num);
        c1Var.b(list);
        return c1Var.a();
    }

    @RecentlyNonNull
    public abstract List<k> a();

    @RecentlyNonNull
    public abstract Integer b();
}
