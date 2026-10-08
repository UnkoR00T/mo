package ii;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 implements Parcelable {

    @SuppressLint({"AmbiguousGranuleClass"})
    public static abstract class a {
        @RecentlyNonNull
        public abstract u0 a();

        @RecentlyNonNull
        public u0 b() {
            e(ak.n0.v(c()));
            return a();
        }

        @RecentlyNonNull
        public abstract List<z> c();

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<z> list);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull List<z> list) {
        y2 y2Var = new y2();
        y2Var.e(list);
        return y2Var;
    }

    @RecentlyNullable
    public abstract Uri b();

    @RecentlyNonNull
    public abstract List<z> c();
}
