package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract w a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new k1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();
}
