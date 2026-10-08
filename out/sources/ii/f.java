package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public f a() {
            zj.p.e(!d().b().isEmpty(), "Name must not be empty.");
            return d();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        abstract f d();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        i7 i7Var = new i7();
        i7Var.e(str);
        return i7Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();
}
