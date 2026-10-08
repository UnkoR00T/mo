package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a implements c41 {

    /* JADX INFO: renamed from: ji.a$a, reason: collision with other inner class name */
    @Deprecated
    public static abstract class AbstractC2439a {
        @RecentlyNonNull
        public a a() {
            ii.k0 k0VarG = g();
            if (c() == null && b() == null) {
                int iG = k0VarG.g();
                if (iG > 0) {
                    f(Integer.valueOf(iG));
                }
                int iF = k0VarG.f();
                if (iF > 0) {
                    e(Integer.valueOf(iF));
                }
            }
            return h();
        }

        @RecentlyNullable
        public abstract Integer b();

        @RecentlyNullable
        public abstract Integer c();

        @RecentlyNonNull
        public abstract AbstractC2439a d(vh.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2439a e(Integer num);

        @RecentlyNonNull
        public abstract AbstractC2439a f(Integer num);

        abstract ii.k0 g();

        abstract a h();
    }

    @RecentlyNonNull
    public static AbstractC2439a b(@RecentlyNonNull ii.k0 k0Var) {
        t tVar = new t();
        tVar.i(k0Var);
        return tVar;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNullable
    public abstract Integer c();

    @RecentlyNullable
    public abstract Integer d();

    @RecentlyNonNull
    public abstract ii.k0 e();
}
