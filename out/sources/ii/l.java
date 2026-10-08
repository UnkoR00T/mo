package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract l a();

        @RecentlyNonNull
        public abstract a b(m mVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new s7();
    }

    @RecentlyNullable
    public abstract m b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();
}
