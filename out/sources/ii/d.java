package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public d a() {
            List listD = d();
            if (listD != null) {
                c(ak.n0.v(listD));
            }
            List listE = e();
            if (listE != null) {
                b(ak.n0.v(listE));
            }
            return f();
        }

        @RecentlyNonNull
        public abstract a b(List<e> list);

        @RecentlyNonNull
        public abstract a c(List<y> list);

        abstract List d();

        abstract List e();

        abstract d f();
    }

    @RecentlyNonNull
    public static a a() {
        return new o5();
    }

    @RecentlyNullable
    public abstract List<e> b();

    @RecentlyNullable
    public abstract List<y> c();
}
