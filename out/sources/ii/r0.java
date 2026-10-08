package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public r0 a() {
            Double dH = l().h();
            boolean z15 = false;
            if (dH.doubleValue() >= 1.0d && dH.doubleValue() <= 5.0d) {
                z15 = true;
            }
            zj.p.l(z15, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", dH);
            return l();
        }

        @RecentlyNonNull
        public abstract a b(Uri uri);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);

        @RecentlyNonNull
        public abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(String str);

        @RecentlyNonNull
        public abstract a i(a0 a0Var);

        abstract a j(f fVar);

        abstract a k(String str);

        abstract r0 l();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Double d15, @RecentlyNonNull f fVar) {
        String strE = zj.v.e(fVar.d());
        if (strE.startsWith("//")) {
            strE = "https:".concat(strE);
        }
        com.google.android.libraries.places.internal.o oVar = new com.google.android.libraries.places.internal.o("a");
        int i15 = com.google.android.libraries.places.internal.r.f33475d;
        oVar.a(com.google.android.libraries.places.internal.r.a(strE, com.google.android.libraries.places.internal.q.f33370b));
        oVar.b(fVar.b());
        com.google.android.libraries.places.internal.n nVarC = oVar.c();
        t2 t2Var = new t2();
        t2Var.m(d15);
        t2Var.j(fVar);
        t2Var.k(nVarC.a());
        return t2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNonNull
    public abstract f c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();

    @RecentlyNonNull
    public abstract Double h();

    @RecentlyNullable
    public abstract String i();

    @RecentlyNullable
    public abstract String j();

    @RecentlyNullable
    public abstract String k();

    @RecentlyNullable
    public abstract a0 l();
}
