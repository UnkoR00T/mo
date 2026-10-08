package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public k0 a() {
            k0 k0VarI = i();
            int iG = k0VarI.g();
            zj.p.h(iG >= 0, "Width must not be < 0, but was: %s.", iG);
            int iF = k0VarI.f();
            zj.p.h(iF >= 0, "Height must not be < 0, but was: %s.", iF);
            zj.p.e(!k0VarI.h().isEmpty(), "PhotoReference must not be empty.");
            return k0VarI;
        }

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a c(g gVar);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(int i15);

        @RecentlyNonNull
        public abstract a f(int i15);

        @RecentlyNonNull
        public abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(Uri uri);

        abstract k0 i();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        i2 i2Var = new i2();
        i2Var.j(str);
        i2Var.f(0);
        i2Var.e(0);
        i2Var.b("");
        return i2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract g c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    public abstract int f();

    public abstract int g();

    @RecentlyNonNull
    public abstract String h();

    @RecentlyNullable
    public abstract String i();
}
