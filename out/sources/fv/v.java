package fv;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.Primes;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u0000 \u001c2\u00020\u0001:\u0002'*Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b\u0004\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b\f\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0017\u0010:\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0011\u0010;\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0011\u0010<\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010=\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b.\u00104R\u0013\u0010?\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0013\u0010A\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b@\u0010\u0017R\u0013\u0010B\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b*\u0010\u0017¨\u0006C"}, d2 = {"Lfv/v;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "t", "()Ljava/net/URL;", "Ljava/net/URI;", "s", "()Ljava/net/URI;", "p", "()Ljava/lang/String;", "link", "q", "(Ljava/lang/String;)Lfv/v;", "Lfv/v$a;", "k", "()Lfv/v$a;", "l", "(Ljava/lang/String;)Lfv/v$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "a", "Ljava/lang/String;", "r", "b", "c", "d", "i", "e", "I", "n", "f", "Ljava/util/List;", "m", "()Ljava/util/List;", "g", "h", "j", "Z", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "o", "query", "encodedFragment", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f67505l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String password;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathSegments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> queryNamesAndValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isHttps;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u001aJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010\u001aJ\u001f\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b0\u0010-J\u000f\u00101\u001a\u00020\u0000H\u0000¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u0001032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b9\u0010:R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010;\u001a\u0004\b<\u00107\"\u0004\b=\u0010>R\"\u0010A\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010;\u001a\u0004\b?\u00107\"\u0004\b@\u0010>R\"\u0010D\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010;\u001a\u0004\bB\u00107\"\u0004\bC\u0010>R$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010;\u001a\u0004\bE\u00107\"\u0004\bF\u0010>R\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010JR \u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010L\u001a\u0004\bM\u0010NR,\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010L\u001a\u0004\bP\u0010N\"\u0004\bQ\u0010RR$\u0010V\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bT\u00107\"\u0004\bU\u0010>¨\u0006W"}, d2 = {"Lfv/v$a;", "", "<init>", "()V", "", "e", "()I", "", "input", "startPos", "limit", "Loq/i0;", "r", "(Ljava/lang/String;II)V", "pos", "", "addTrailingSlash", "alreadyEncoded", "p", "(Ljava/lang/String;IIZZ)V", "j", "(Ljava/lang/String;)Z", "k", "n", "scheme", "s", "(Ljava/lang/String;)Lfv/v$a;", "username", "z", "password", "m", "host", "i", "port", "o", "(I)Lfv/v$a;", "pathSegment", "b", "encodedPath", "f", "encodedQuery", "g", "name", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lfv/v$a;", "encodedName", "encodedValue", "a", "q", "()Lfv/v$a;", "Lfv/v;", "d", "()Lfv/v;", "toString", "()Ljava/lang/String;", "base", "l", "(Lfv/v;Ljava/lang/String;)Lfv/v$a;", "Ljava/lang/String;", "getScheme$okhttp", "y", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "v", "encodedUsername", "getEncodedPassword$okhttp", "u", "encodedPassword", "getHost$okhttp", "w", "I", "getPort$okhttp", "x", "(I)V", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "t", "encodedFragment", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String scheme;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String host;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<String> encodedPathSegments;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String encodedFragment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String encodedUsername = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String encodedPassword = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        /* JADX INFO: renamed from: fv.v$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfv/v$a$a;", "", "<init>", "()V", "", "input", "", "pos", "limit", "g", "(Ljava/lang/String;II)I", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String input, int pos, int limit) {
                try {
                    int i15 = Integer.parseInt(Companion.b(v.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > i15 || i15 >= 65536) {
                        return -1;
                    }
                    return i15;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((fr.t.d(cCharAt, 97) >= 0 && fr.t.d(cCharAt, 122) <= 0) || (fr.t.d(cCharAt, 65) >= 0 && fr.t.d(cCharAt, 90) <= 0)) {
                    while (true) {
                        pos++;
                        if (pos >= limit) {
                            break;
                        }
                        char cCharAt2 = input.charAt(pos);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return pos;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i15, int i16) {
                int i17 = 0;
                while (i15 < i16) {
                    char cCharAt = str.charAt(i15);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i17++;
                    i15++;
                }
                return i17;
            }

            private Companion() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int e() {
            int i15 = this.port;
            return i15 != -1 ? i15 : v.INSTANCE.c(this.scheme);
        }

        private final boolean j(String input) {
            return fr.t.c(input, ".") || fu.r.G(input, "%2e", true);
        }

        private final boolean k(String input) {
            return fr.t.c(input, "..") || fu.r.G(input, "%2e.", true) || fu.r.G(input, ".%2e", true) || fu.r.G(input, "%2e%2e", true);
        }

        private final void n() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void p(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strB = Companion.b(v.INSTANCE, input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, null, 240, null);
            if (j(strB)) {
                return;
            }
            if (k(strB)) {
                n();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strB);
            } else {
                this.encodedPathSegments.add(strB);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void r(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i15 = startPos;
            while (i15 < limit) {
                int iQ = gv.d.q(input, "/\\", i15, limit);
                boolean z15 = iQ < limit;
                input = input;
                p(input, i15, iQ, z15, true);
                i15 = z15 ? iQ + 1 : iQ;
            }
        }

        public final a a(String encodedName, String encodedValue) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Companion companion = v.INSTANCE;
            list.add(Companion.b(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null));
            this.encodedQueryNamesAndValues.add(encodedValue != null ? Companion.b(companion, encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null) : null);
            return this;
        }

        public final a b(String pathSegment) {
            p(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final a c(String name, String value) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Companion companion = v.INSTANCE;
            list.add(Companion.b(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            this.encodedQueryNamesAndValues.add(value != null ? Companion.b(companion, value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final v d() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = v.INSTANCE;
            String strG = Companion.g(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strG2 = Companion.g(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iE = e();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.g(v.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(pq.v.y(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? Companion.g(v.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new v(str, strG, strG2, str2, iE, arrayList2, arrayList, str4 != null ? Companion.g(v.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a f(String encodedPath) {
            if (fu.r.V(encodedPath, "/", false, 2, null)) {
                r(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        public final a g(String encodedQuery) {
            Companion companion;
            String strB;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strB = Companion.b((companion = v.INSTANCE), encodedQuery, 0, 0, " \"'<>#", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null)) == null) ? null : companion.i(strB);
            return this;
        }

        public final List<String> h() {
            return this.encodedPathSegments;
        }

        public final a i(String host) {
            String strE = gv.a.e(Companion.g(v.INSTANCE, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.host = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a l(v base, String input) {
            String str;
            int iQ;
            boolean z15;
            int i15;
            int i16;
            char c15;
            int i17;
            String str2 = input;
            int iA = gv.d.A(str2, 0, 0, 3, null);
            int iC = gv.d.C(str2, iA, 0, 2, null);
            Companion companion = INSTANCE;
            int iG = companion.g(str2, iA, iC);
            boolean z16 = true;
            byte b15 = -1;
            if (iG != -1) {
                if (fu.r.S(str2, "https:", iA, true)) {
                    this.scheme = "https";
                    iA += 6;
                } else {
                    if (!fu.r.S(str2, "http:", iA, true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, iG) + '\'');
                    }
                    this.scheme = "http";
                    iA += 5;
                }
            } else {
                if (base == null) {
                    if (str2.length() > 6) {
                        str = fu.r.H1(str2, 6) + "...";
                    } else {
                        str = str2;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str);
                }
                this.scheme = base.getScheme();
            }
            int iH = companion.h(str2, iA, iC);
            byte b16 = 63;
            byte b17 = 35;
            if (iH >= 2 || base == null || !fr.t.c(base.getScheme(), this.scheme)) {
                int i18 = iA + iH;
                boolean z17 = false;
                boolean z18 = false;
                while (true) {
                    iQ = gv.d.q(str2, "@/\\?#", i18, iC);
                    byte bCharAt = iQ != iC ? str2.charAt(iQ) : b15;
                    if (bCharAt == b15 || bCharAt == b17 || bCharAt == 47 || bCharAt == 92 || bCharAt == b16) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z17) {
                            z15 = z16;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(this.encodedPassword);
                            sb5.append("%40");
                            str2 = input;
                            i15 = iQ;
                            sb5.append(Companion.b(v.INSTANCE, str2, i18, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb5.toString();
                        } else {
                            int iP = gv.d.p(str2, ':', i18, iQ);
                            Companion companion2 = v.INSTANCE;
                            z15 = z16;
                            String strB = Companion.b(companion2, str2, i18, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z18) {
                                strB = this.encodedUsername + "%40" + strB;
                            }
                            this.encodedUsername = strB;
                            if (iP != iQ) {
                                i16 = iQ;
                                this.encodedPassword = Companion.b(companion2, input, iP + 1, i16, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z17 = z15;
                            } else {
                                i16 = iQ;
                            }
                            str2 = input;
                            i15 = i16;
                            z18 = z15;
                        }
                        i18 = i15 + 1;
                        z16 = z15;
                        b16 = 63;
                        b17 = 35;
                        b15 = -1;
                    }
                }
                Companion companion3 = INSTANCE;
                int iF = companion3.f(str2, i18, iQ);
                int i19 = iF + 1;
                if (i19 < iQ) {
                    this.host = gv.a.e(Companion.g(v.INSTANCE, str2, i18, iF, false, 4, null));
                    int iE = companion3.e(str2, i19, iQ);
                    this.port = iE;
                    if (iE == -1) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + str2.substring(i19, iQ) + '\"').toString());
                    }
                } else {
                    Companion companion4 = v.INSTANCE;
                    this.host = gv.a.e(Companion.g(companion4, str2, i18, iF, false, 4, null));
                    this.port = companion4.c(this.scheme);
                }
                if (this.host == null) {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + str2.substring(i18, iF) + '\"').toString());
                }
                iA = iQ;
            } else {
                this.encodedUsername = base.g();
                this.encodedPassword = base.c();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.e());
                if (iA == iC || str2.charAt(iA) == '#') {
                    g(base.f());
                }
            }
            int iQ2 = gv.d.q(str2, "?#", iA, iC);
            r(str2, iA, iQ2);
            if (iQ2 >= iC || str2.charAt(iQ2) != '?') {
                c15 = '#';
                i17 = iQ2;
            } else {
                c15 = '#';
                int iP2 = gv.d.p(str2, '#', iQ2, iC);
                Companion companion5 = v.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.i(Companion.b(companion5, str2, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                i17 = iP2;
            }
            if (i17 < iC && str2.charAt(i17) == c15) {
                this.encodedFragment = Companion.b(v.INSTANCE, str2, i17 + 1, iC, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a m(String password) {
            this.encodedPassword = Companion.b(v.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a o(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        public final a q() {
            String str = this.host;
            this.host = str != null ? new fu.o("[\"<>^`{|}]").h(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i15 = 0; i15 < size; i15++) {
                List<String> list = this.encodedPathSegments;
                list.set(i15, Companion.b(v.INSTANCE, list.get(i15), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    String str2 = list2.get(i16);
                    list2.set(i16, str2 != null ? Companion.b(v.INSTANCE, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.b(v.INSTANCE, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a s(String scheme) {
            if (fu.r.G(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (fu.r.G(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void t(String str) {
            this.encodedFragment = str;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb5.append(str);
                sb5.append("://");
            } else {
                sb5.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb5.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb5.append(':');
                    sb5.append(this.encodedPassword);
                }
                sb5.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (fu.r.c0(str2, ':', false, 2, null)) {
                    sb5.append('[');
                    sb5.append(this.host);
                    sb5.append(']');
                } else {
                    sb5.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iE = e();
                String str3 = this.scheme;
                if (str3 == null || iE != v.INSTANCE.c(str3)) {
                    sb5.append(':');
                    sb5.append(iE);
                }
            }
            Companion companion = v.INSTANCE;
            companion.h(this.encodedPathSegments, sb5);
            if (this.encodedQueryNamesAndValues != null) {
                sb5.append('?');
                companion.j(this.encodedQueryNamesAndValues, sb5);
            }
            if (this.encodedFragment != null) {
                sb5.append('#');
                sb5.append(this.encodedFragment);
            }
            return sb5.toString();
        }

        public final void u(String str) {
            this.encodedPassword = str;
        }

        public final void v(String str) {
            this.encodedUsername = str;
        }

        public final void w(String str) {
            this.host = str;
        }

        public final void x(int i15) {
            this.port = i15;
        }

        public final void y(String str) {
            this.scheme = str;
        }

        public final a z(String username) {
            this.encodedUsername = Companion.b(v.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* JADX INFO: renamed from: fv.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050$*\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)J1\u0010*\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010+Jc\u0010,\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00106\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00108\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010/R\u0014\u00109\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010:\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010/R\u0014\u0010;\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010/R\u0014\u0010<\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010/¨\u0006="}, d2 = {"Lfv/v$b;", "", "<init>", "()V", "Lvv/e;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Loq/i0;", "l", "(Lvv/e;Ljava/lang/String;IIZ)V", "e", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "k", "(Lvv/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "c", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "h", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "j", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "Lfv/v;", "d", "(Ljava/lang/String;)Lfv/v;", "f", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i15, int i16, String str2, boolean z15, boolean z16, boolean z17, boolean z18, Charset charset, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i15 = 0;
            }
            if ((i17 & 2) != 0) {
                i16 = str.length();
            }
            if ((i17 & 8) != 0) {
                z15 = false;
            }
            if ((i17 & 16) != 0) {
                z16 = false;
            }
            if ((i17 & 32) != 0) {
                z17 = false;
            }
            if ((i17 & 64) != 0) {
                z18 = false;
            }
            if ((i17 & 128) != 0) {
                charset = null;
            }
            return companion.a(str, i15, i16, str2, z15, z16, z17, z18, charset);
        }

        private final boolean e(String str, int i15, int i16) {
            int i17 = i15 + 2;
            return i17 < i16 && str.charAt(i15) == '%' && gv.d.H(str.charAt(i15 + 1)) != -1 && gv.d.H(str.charAt(i17)) != -1;
        }

        public static /* synthetic */ String g(Companion companion, String str, int i15, int i16, boolean z15, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i15 = 0;
            }
            if ((i17 & 2) != 0) {
                i16 = str.length();
            }
            if ((i17 & 4) != 0) {
                z15 = false;
            }
            return companion.f(str, i15, i16, z15);
        }

        private final void k(vv.e eVar, String str, int i15, int i16, String str2, boolean z15, boolean z16, boolean z17, boolean z18, Charset charset) {
            int iCharCount = i15;
            vv.e eVar2 = null;
            while (iCharCount < i16) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z15 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z17) {
                        eVar.k1(z15 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z18)) {
                            if (!fu.r.c0(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z15 && (!z16 || e(str, iCharCount, i16))))) {
                                eVar.i3(iCodePointAt);
                            }
                        }
                        if (eVar2 == null) {
                            eVar2 = new vv.e();
                        }
                        if (charset == null || fr.t.c(charset, StandardCharsets.UTF_8)) {
                            eVar2.i3(iCodePointAt);
                        } else {
                            eVar2.P2(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!eVar2.K2()) {
                            byte b15 = eVar2.readByte();
                            eVar.writeByte(37);
                            eVar.writeByte(v.f67505l[((b15 & 255) >> 4) & 15]);
                            eVar.writeByte(v.f67505l[b15 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void l(vv.e eVar, String str, int i15, int i16, boolean z15) {
            int i17;
            while (i15 < i16) {
                int iCodePointAt = str.codePointAt(i15);
                if (iCodePointAt == 37 && (i17 = i15 + 2) < i16) {
                    int iH = gv.d.H(str.charAt(i15 + 1));
                    int iH2 = gv.d.H(str.charAt(i17));
                    if (iH == -1 || iH2 == -1) {
                        eVar.i3(iCodePointAt);
                        i15 += Character.charCount(iCodePointAt);
                    } else {
                        eVar.writeByte((iH << 4) + iH2);
                        i15 = Character.charCount(iCodePointAt) + i17;
                    }
                } else if (iCodePointAt == 43 && z15) {
                    eVar.writeByte(32);
                    i15++;
                } else {
                    eVar.i3(iCodePointAt);
                    i15 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i15, int i16, String str2, boolean z15, boolean z16, boolean z17, boolean z18, Charset charset) {
            int iCharCount = i15;
            while (iCharCount < i16) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z18) || fu.r.c0(str2, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z15 || (z16 && !e(str, iCharCount, i16)))) || (iCodePointAt == 43 && z17)))) {
                    vv.e eVar = new vv.e();
                    eVar.v1(str, i15, iCharCount);
                    k(eVar, str, iCharCount, i16, str2, z15, z16, z17, z18, charset);
                    return eVar.C0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            return str.substring(i15, i16);
        }

        public final int c(String scheme) {
            if (fr.t.c(scheme, "http")) {
                return 80;
            }
            return fr.t.c(scheme, "https") ? 443 : -1;
        }

        public final v d(String str) {
            return new a().l(null, str).d();
        }

        public final String f(String str, int i15, int i16, boolean z15) {
            for (int i17 = i15; i17 < i16; i17++) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '%' || (cCharAt == '+' && z15)) {
                    vv.e eVar = new vv.e();
                    eVar.v1(str, i15, i17);
                    l(eVar, str, i17, i16, z15);
                    return eVar.C0();
                }
            }
            return str.substring(i15, i16);
        }

        public final void h(List<String> list, StringBuilder sb5) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                sb5.append('/');
                sb5.append(list.get(i15));
            }
        }

        public final List<String> i(String str) {
            ArrayList arrayList = new ArrayList();
            int i15 = 0;
            while (i15 <= str.length()) {
                String str2 = str;
                int iQ0 = fu.r.q0(str2, '&', i15, false, 4, null);
                if (iQ0 == -1) {
                    iQ0 = str2.length();
                }
                int iQ1 = fu.r.q0(str2, '=', i15, false, 4, null);
                if (iQ1 == -1 || iQ1 > iQ0) {
                    arrayList.add(str2.substring(i15, iQ0));
                    arrayList.add(null);
                } else {
                    arrayList.add(str2.substring(i15, iQ1));
                    arrayList.add(str2.substring(iQ1 + 1, iQ0));
                }
                i15 = iQ0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void j(List<String> list, StringBuilder sb5) {
            lr.g gVarU = lr.m.u(lr.m.w(0, list.size()), 2);
            int first = gVarU.getFirst();
            int last = gVarU.getLast();
            int step = gVarU.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb5.append('&');
                }
                sb5.append(str);
                if (str2 != null) {
                    sb5.append('=');
                    sb5.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        private Companion() {
        }
    }

    public v(String str, String str2, String str3, String str4, int i15, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i15;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = fr.t.c(str, "https");
    }

    public static final v h(String str) {
        return INSTANCE.d(str);
    }

    public final String b() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(fu.r.q0(this.url, '#', 0, false, 6, null) + 1);
    }

    public final String c() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(fu.r.q0(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, fu.r.q0(this.url, '@', 0, false, 6, null));
    }

    public final String d() {
        int iQ0 = fu.r.q0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        return this.url.substring(iQ0, gv.d.q(str, "?#", iQ0, str.length()));
    }

    public final List<String> e() {
        int iQ0 = fu.r.q0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iQ = gv.d.q(str, "?#", iQ0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iQ0 < iQ) {
            int i15 = iQ0 + 1;
            int iP = gv.d.p(this.url, '/', i15, iQ);
            arrayList.add(this.url.substring(i15, iP));
            iQ0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        return (other instanceof v) && fr.t.c(((v) other).url, this.url);
    }

    public final String f() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iQ0 = fu.r.q0(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        return this.url.substring(iQ0, gv.d.p(str, '#', iQ0, str.length()));
    }

    public final String g() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, gv.d.q(str, ":@", length, str.length()));
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final a k() {
        a aVar = new a();
        aVar.y(this.scheme);
        aVar.v(g());
        aVar.u(c());
        aVar.w(this.host);
        aVar.x(this.port != INSTANCE.c(this.scheme) ? this.port : -1);
        aVar.h().clear();
        aVar.h().addAll(e());
        aVar.g(f());
        aVar.t(b());
        return aVar;
    }

    public final a l(String link) {
        try {
            return new a().l(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> m() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final String o() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        INSTANCE.j(this.queryNamesAndValues, sb5);
        return sb5.toString();
    }

    public final String p() {
        return l("/...").z("").m("").d().getUrl();
    }

    public final v q(String link) {
        a aVarL = l(link);
        if (aVarL != null) {
            return aVarL.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final URI s() {
        String string = k().q().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e15) {
            try {
                return URI.create(new fu.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").h(string, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e15);
            }
        }
    }

    public final URL t() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e15) {
            throw new RuntimeException(e15);
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }
}
