package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract t a();

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

        @RecentlyNonNull
        public abstract a g(o oVar);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull o oVar) {
        e1 e1Var = new e1();
        e1Var.h(oVar);
        return e1Var;
    }

    @RecentlyNullable
    public abstract o b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNonNull
    public abstract o f();

    @RecentlyNullable
    public abstract o g();

    @RecentlyNullable
    public abstract o h();
}
