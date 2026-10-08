package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.internal.c41;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public g a() {
            e(ak.n0.v(b()));
            n(ak.n0.v(c()));
            return o();
        }

        @RecentlyNonNull
        public abstract List<String> b();

        @RecentlyNonNull
        public abstract List<String> c();

        @RecentlyNonNull
        public abstract a d(vh.a aVar);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public abstract a f(Integer num);

        @RecentlyNonNull
        public abstract a g(ii.c0 c0Var);

        @RecentlyNonNull
        public abstract a h(ii.d0 d0Var);

        @RecentlyNonNull
        public abstract a i(LatLng latLng);

        @RecentlyNonNull
        public abstract a j(boolean z15);

        @RecentlyNonNull
        public abstract a k(String str);

        @RecentlyNonNull
        public abstract a l(String str);

        @RecentlyNonNull
        public abstract a m(ii.i iVar);

        @RecentlyNonNull
        public abstract a n(@RecentlyNonNull List<String> list);

        abstract g o();
    }

    @RecentlyNonNull
    public static a b() {
        c0 c0Var = new c0();
        c0Var.e(new ArrayList());
        c0Var.n(new ArrayList());
        c0Var.j(false);
        return c0Var;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNonNull
    public abstract List<String> c();

    @RecentlyNullable
    public abstract Integer d();

    @RecentlyNullable
    public abstract ii.c0 e();

    @RecentlyNullable
    public abstract ii.d0 f();

    @RecentlyNullable
    public abstract LatLng g();

    @RecentlyNullable
    public abstract String h();

    @RecentlyNullable
    public abstract String i();

    @RecentlyNullable
    public abstract ii.i j();

    @RecentlyNonNull
    public abstract List<String> k();

    public abstract boolean l();
}
