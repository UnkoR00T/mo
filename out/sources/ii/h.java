package ii;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public h a() {
            h hVarK = k();
            f(ak.n0.v(hVarK.f()));
            h(ak.n0.v(hVarK.j()));
            i(ak.n0.v(hVarK.k()));
            j(ak.n0.v(hVarK.l()));
            return k();
        }

        @RecentlyNonNull
        public abstract a b(Integer num);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a f(@RecentlyNonNull List<String> list);

        abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract a i(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract a j(@RecentlyNonNull List list);

        abstract h k();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        l7 l7Var = new l7();
        l7Var.h(new ArrayList());
        l7Var.g(str);
        l7Var.i(new ArrayList());
        l7Var.j(new ArrayList());
        l7Var.f(new ArrayList());
        l7Var.c("");
        l7Var.d("");
        l7Var.e("");
        return l7Var;
    }

    private static final SpannableString m(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u6 u6Var = (u6) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), u6Var.a(), u6Var.a() + u6Var.b(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNullable
    public abstract Integer b();

    @RecentlyNonNull
    public abstract String c();

    @RecentlyNonNull
    public SpannableString d(CharacterStyle characterStyle) {
        return m(h(), k(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString e(CharacterStyle characterStyle) {
        return m(i(), l(), characterStyle);
    }

    @RecentlyNonNull
    public abstract List<String> f();

    abstract String g();

    abstract String h();

    abstract String i();

    abstract List j();

    abstract List k();

    abstract List l();
}
