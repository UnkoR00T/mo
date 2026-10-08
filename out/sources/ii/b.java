package ii;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public b a() {
            b bVarD = d();
            zj.p.e(!bVarD.b().isEmpty(), "Name must not be empty.");
            List<String> listD = bVarD.d();
            Iterator<String> it = listD.iterator();
            while (it.hasNext()) {
                zj.p.e(!TextUtils.isEmpty(it.next()), "Types must not contain null or empty values.");
            }
            c(ak.n0.v(listD));
            return d();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        abstract a c(List list);

        abstract b d();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
        w2 w2Var = new w2();
        w2Var.e(str);
        w2Var.c(list);
        return w2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNonNull
    public abstract List<String> d();
}
