package e6;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f47633b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f47634a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f47635a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private h(i iVar) {
        this.f47634a = iVar;
    }

    public static h a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i15 = 0; i15 < length; i15++) {
            localeArr[i15] = a.a(strArrSplit[i15]);
        }
        return a(localeArr);
    }

    public static h d() {
        return j(b.b());
    }

    public static h e() {
        return f47633b;
    }

    public static h j(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale c(int i15) {
        return this.f47634a.get(i15);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f47634a.equals(((h) obj).f47634a);
    }

    public boolean f() {
        return this.f47634a.isEmpty();
    }

    public int g() {
        return this.f47634a.size();
    }

    public String h() {
        return this.f47634a.a();
    }

    public int hashCode() {
        return this.f47634a.hashCode();
    }

    public Object i() {
        return this.f47634a.getLocaleList();
    }

    public String toString() {
        return this.f47634a.toString();
    }
}
