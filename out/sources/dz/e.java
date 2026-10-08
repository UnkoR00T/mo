package dz;

import fu.o;
import fu.r;
import java.util.Locale;
import java.util.Map;
import mx.Label;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000e\" \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, d2 = {"", "Ljava/util/Locale;", "locale", "a", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "", "chunkSize", "separator", "g", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", "Lmx/a;", "h", "(Ljava/lang/String;ILmx/a;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "f", "c", "d", "", "", "Ljava/util/Map;", "polishNormalizerMap", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Character, Character> f45590a = v0.l(y.a((char) 261, 'a'), y.a((char) 263, 'c'), y.a((char) 281, 'e'), y.a((char) 322, 'l'), y.a((char) 324, 'n'), y.a((char) 243, 'o'), y.a((char) 347, 's'), y.a((char) 378, 'z'), y.a((char) 380, 'z'), y.a((char) 260, 'A'), y.a((char) 262, 'C'), y.a((char) 280, 'E'), y.a((char) 321, 'L'), y.a((char) 323, 'N'), y.a((char) 211, 'O'), y.a((char) 346, 'S'), y.a((char) 377, 'Z'), y.a((char) 379, 'Z'));

    public static final String a(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb5 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb5.append((Object) (Character.isLowerCase(cCharAt) ? fu.a.d(cCharAt, locale) : String.valueOf(cCharAt)));
        sb5.append(str.substring(1));
        return sb5.toString();
    }

    public static /* synthetic */ String b(String str, Locale locale, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            locale = Locale.getDefault();
        }
        return a(str, locale);
    }

    public static final String c(String str) {
        return new o("(\n)+").h(str, "\n");
    }

    public static final String d(String str) {
        StringBuilder sb5 = new StringBuilder(str.length());
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            Character ch4 = f45590a.get(Character.valueOf(cCharAt));
            if (ch4 != null) {
                cCharAt = ch4.charValue();
            }
            sb5.append(cCharAt);
        }
        return sb5.toString();
    }

    public static final String e(String str) {
        return r.u1(new o("\\s+").h(str, " ")).toString();
    }

    public static final String f(String str) {
        return r.P(str, "\n", " ", false, 4, null);
    }

    public static final String g(String str, int i15, String str2) {
        return v.v0(r.z1(str, i15), str2, null, null, 0, null, null, 62, null);
    }

    public static final String h(String str, int i15, Label label) {
        return v.v0(r.z1(str, i15), label.getText(), null, null, 0, null, null, 62, null);
    }
}
