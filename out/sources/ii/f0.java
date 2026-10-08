package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract f0 a();

        @RecentlyNonNull
        public abstract a b(o oVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(o oVar);
    }

    @RecentlyNonNull
    public static a a() {
        return new y1();
    }

    @RecentlyNullable
    public abstract o b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract o f();
}
