package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract s0 a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(String str);

        @RecentlyNonNull
        public abstract a g(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new v2();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();
}
