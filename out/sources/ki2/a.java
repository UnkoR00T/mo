package ki2;

import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static void a(String str, String str2) {
        Set<String> algorithms = Security.getAlgorithms(str);
        Locale locale = Locale.ENGLISH;
        if (algorithms.contains(str2.toUpperCase(locale))) {
            return;
        }
        if (!"Cipher".equals(str) || !d(str2) || !algorithms.contains(c(str2).toUpperCase(locale))) {
            throw new IllegalArgumentException(String.format("No Provider supports %s %s.", str2, str));
        }
    }

    public static void b(Provider provider, String str, String str2) {
        if (provider.getService(str, str2) == null) {
            if (!"Cipher".equals(str) || !d(str2) || !e(provider, str2)) {
                throw new IllegalArgumentException(String.format("Provider %s doesn't support %s %s.", provider.getName(), str2, str));
            }
        }
    }

    private static String c(String str) {
        return str.substring(0, str.indexOf("/"));
    }

    private static boolean d(String str) {
        return str.contains("/");
    }

    private static boolean e(Provider provider, String str) {
        return provider.getService("Cipher", c(str)) != null;
    }
}
