package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract x a();

        @RecentlyNonNull
        public abstract a b(Uri uri);

        @RecentlyNonNull
        public abstract a c(Uri uri);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(Uri uri);
    }

    @RecentlyNonNull
    public static a a() {
        return new m1();
    }

    @RecentlyNullable
    public abstract Uri b();

    @RecentlyNullable
    public abstract Uri c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract Uri f();
}
