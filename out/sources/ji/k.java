package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public k a() {
            k kVarD = d();
            ii.l0 l0VarF = kVarD.f();
            if (l0VarF != null) {
                zj.p.e(l0VarF.F() != null, "Place must have a valid place id.");
            }
            return kVarD;
        }

        @RecentlyNonNull
        public abstract a b(vh.a aVar);

        @RecentlyNonNull
        public abstract a c(long j15);

        abstract k d();
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull ii.l0 l0Var) {
        i0 i0Var = new i0();
        i0Var.e(l0Var);
        i0Var.c(System.currentTimeMillis());
        return i0Var;
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull ii.l0 l0Var, long j15) {
        i0 i0Var = new i0();
        i0Var.e(l0Var);
        i0Var.c(j15);
        return i0Var;
    }

    @RecentlyNonNull
    public static a d(@RecentlyNonNull String str) {
        i0 i0Var = new i0();
        i0Var.f(str);
        i0Var.c(System.currentTimeMillis());
        return i0Var;
    }

    @RecentlyNonNull
    public static a e(@RecentlyNonNull String str, long j15) {
        i0 i0Var = new i0();
        i0Var.f(str);
        i0Var.c(j15);
        return i0Var;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNullable
    public abstract ii.l0 f();

    @RecentlyNullable
    public abstract String g();

    public abstract long h();
}
