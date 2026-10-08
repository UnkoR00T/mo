package io.sentry.util;

import io.sentry.b7;
import io.sentry.v0;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f95797a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f95798b = Pattern.compile("[\\W_]+");

    public static String a(long j15) {
        if (-1000 < j15 && j15 < 1000) {
            return j15 + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j15 > -999950 && j15 < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j15 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j15 /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static String b(String str, v0 v0Var) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f95797a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e15) {
                v0Var.b(b7.INFO, "SHA-1 isn't available to calculate the hash.", e15);
            } catch (Throwable th4) {
                v0Var.c(b7.INFO, "string: %s could not calculate its hash", th4, str);
            }
        }
        return null;
    }

    public static String c(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = f95798b.split(str, -1);
        StringBuilder sb5 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb5.append(d(str2));
        }
        return sb5.toString();
    }

    public static String d(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb5 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb5.append(strSubstring.toUpperCase(locale));
        sb5.append(str.substring(1).toLowerCase(locale));
        return sb5.toString();
    }

    public static int e(String str, char c15) {
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            if (str.charAt(i16) == c15) {
                i15++;
            }
        }
        return i15;
    }

    public static String f(String str) {
        int i15;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i15 = iLastIndexOf + 1)) ? str : str.substring(i15);
    }

    public static String g(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        StringBuilder sb5 = new StringBuilder();
        Iterator<? extends CharSequence> it = iterable.iterator();
        if (it.hasNext()) {
            sb5.append(it.next());
            while (it.hasNext()) {
                sb5.append(charSequence);
                sb5.append(it.next());
            }
        }
        return sb5.toString();
    }

    public static String h(String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    public static String i(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
