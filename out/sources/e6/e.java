package e6;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, h hVar) {
            configuration.setLocales((LocaleList) hVar.i());
        }
    }

    public static h a(Configuration configuration) {
        return h.j(a.a(configuration));
    }

    public static void b(Configuration configuration, h hVar) {
        a.b(configuration, hVar);
    }
}
