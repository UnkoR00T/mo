package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public o a() {
            List listF = f();
            if (listF != null) {
                e(ak.n0.v(listF));
            }
            List listG = g();
            if (listG != null) {
                d(ak.n0.v(listG));
            }
            return h();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(List<String> list);

        @RecentlyNonNull
        public abstract a e(List<String> list);

        abstract List f();

        abstract List g();

        abstract o h();
    }

    @RecentlyNonNull
    public static a a() {
        return new a1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract List<String> d();

    @RecentlyNullable
    public abstract List<String> e();
}
