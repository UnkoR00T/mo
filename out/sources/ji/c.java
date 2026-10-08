package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public c a() {
            d(ak.n0.v(e().c()));
            return e();
        }

        @RecentlyNonNull
        public abstract a b(vh.a aVar);

        @RecentlyNonNull
        public abstract a c(ii.i iVar);

        abstract a d(List list);

        abstract c e();
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull String str, @RecentlyNonNull List<ii.l0.d> list) {
        w wVar = new w();
        wVar.f(str);
        wVar.d(list);
        return wVar;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNonNull
    public abstract List<ii.l0.d> c();

    @RecentlyNonNull
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract ii.i f();
}
