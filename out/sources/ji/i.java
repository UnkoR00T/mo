package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class i implements c41 {

    @Deprecated
    public static abstract class a {
        @RecentlyNonNull
        public i a() {
            c(ak.n0.v(d().c()));
            return d();
        }

        @RecentlyNonNull
        public abstract a b(vh.a aVar);

        abstract a c(List list);

        abstract i d();
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull List<ii.l0.d> list) {
        f0 f0Var = new f0();
        f0Var.c(list);
        return f0Var;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNonNull
    public abstract List<ii.l0.d> c();
}
