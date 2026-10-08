package fv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001\u001bBQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0006\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\n\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u000b\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\f\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\r\u0010%¨\u0006)"}, d2 = {"Lfv/m;", "", "", "name", "value", "", "expiresAt", "domain", "path", "", "secure", "httpOnly", "persistent", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "g", "c", "J", "()J", "d", "Z", "()Z", "h", "i", "j", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f67458k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f67459l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f67460m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f67461n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long expiresAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String domain;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean secure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean httpOnly;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean persistent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean hostOnly;

    /* JADX INFO: renamed from: fv.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010!J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"Lfv/m$a;", "", "<init>", "()V", "", "urlHost", "domain", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "s", "", "pos", "limit", "", "g", "(Ljava/lang/String;II)J", "input", "invert", "a", "(Ljava/lang/String;IIZ)I", "h", "(Ljava/lang/String;)J", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Lfv/v;", "url", "setCookie", "Lfv/m;", "c", "(Lfv/v;Ljava/lang/String;)Lfv/m;", "currentTimeMillis", "d", "(JLfv/v;Ljava/lang/String;)Lfv/m;", "Lfv/u;", "headers", "", "e", "(Lfv/v;Lfv/u;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final int a(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        private final boolean b(String urlHost, String domain) {
            if (fr.t.c(urlHost, domain)) {
                return true;
            }
            return fu.r.F(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !gv.d.i(urlHost);
        }

        private final String f(String s15) {
            if (fu.r.F(s15, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = gv.a.e(fu.r.M0(s15, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String s15, int pos, int limit) {
            int iA = a(s15, pos, limit, false);
            Matcher matcher = m.f67461n.matcher(s15);
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int iR0 = -1;
            int i18 = -1;
            int i19 = -1;
            while (iA < limit) {
                int iA2 = a(s15, iA + 1, limit, true);
                matcher.region(iA, iA2);
                if (i16 == -1 && matcher.usePattern(m.f67461n).matches()) {
                    i16 = Integer.parseInt(matcher.group(1));
                    i18 = Integer.parseInt(matcher.group(2));
                    i19 = Integer.parseInt(matcher.group(3));
                } else if (i17 == -1 && matcher.usePattern(m.f67460m).matches()) {
                    i17 = Integer.parseInt(matcher.group(1));
                } else if (iR0 == -1 && matcher.usePattern(m.f67459l).matches()) {
                    iR0 = fu.r.r0(m.f67459l.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6, null) / 4;
                } else if (i15 == -1 && matcher.usePattern(m.f67458k).matches()) {
                    i15 = Integer.parseInt(matcher.group(1));
                }
                iA = a(s15, iA2 + 1, limit, false);
            }
            if (70 <= i15 && i15 < 100) {
                i15 += 1900;
            }
            if (i15 >= 0 && i15 < 70) {
                i15 += 2000;
            }
            if (i15 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iR0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i17 || i17 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i19 < 0 || i19 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(gv.d.f77108f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i15);
            gregorianCalendar.set(2, iR0 - 1);
            gregorianCalendar.set(5, i17);
            gregorianCalendar.set(11, i16);
            gregorianCalendar.set(12, i18);
            gregorianCalendar.set(13, i19);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String s15) {
            try {
                long j15 = Long.parseLong(s15);
                if (j15 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j15;
            } catch (NumberFormatException e15) {
                if (new fu.o("-?\\d+").f(s15)) {
                    return fu.r.V(s15, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e15;
            }
        }

        public final m c(v url, String setCookie) {
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long currentTimeMillis, v url, String setCookie) {
            long j15;
            int iR = gv.d.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = gv.d.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strX = gv.d.X(setCookie, 0, iR2, 1, null);
            if (strX.length() == 0 || gv.d.y(strX) != -1) {
                return null;
            }
            String strW = gv.d.W(setCookie, iR2 + 1, iR);
            if (gv.d.y(strW) != -1) {
                return null;
            }
            int i15 = iR + 1;
            int length = setCookie.length();
            String strSubstring = null;
            String strF = null;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i15 < length) {
                int iP = gv.d.p(setCookie, ';', i15, length);
                int iP2 = gv.d.p(setCookie, '=', i15, iP);
                String strW2 = gv.d.W(setCookie, i15, iP2);
                String strW3 = iP2 < iP ? gv.d.W(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (fu.r.G(strW2, "expires", true)) {
                    try {
                        jG = g(strW3, 0, strW3.length());
                        z16 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (fu.r.G(strW2, "max-age", true)) {
                    jH = h(strW3);
                    z16 = true;
                } else if (fu.r.G(strW2, "domain", true)) {
                    strF = f(strW3);
                    z18 = false;
                } else if (fu.r.G(strW2, "path", true)) {
                    strSubstring = strW3;
                } else if (fu.r.G(strW2, "secure", true)) {
                    z17 = true;
                } else if (fu.r.G(strW2, "httponly", true)) {
                    z15 = true;
                }
                i15 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j15 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j16 = currentTimeMillis + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j15 = (j16 < currentTimeMillis || j16 > 253402300799999L) ? 253402300799999L : j16;
            } else {
                j15 = jG;
            }
            String host = url.getHost();
            if (strF == null) {
                strF = host;
            } else if (!b(host, strF)) {
                return mVar3;
            }
            if (host.length() != strF.length() && PublicSuffixDatabase.INSTANCE.c().c(strF) == null) {
                return mVar3;
            }
            if (strSubstring == null || !fu.r.V(strSubstring, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iW0 = fu.r.w0(strD, '/', 0, false, 6, null);
                strSubstring = iW0 != 0 ? strD.substring(0, iW0) : "/";
            }
            return new m(strX, strW, j15, strF, strSubstring, z17, z15, z16, z18, null);
        }

        public final List<m> e(v url, u headers) {
            List<String> listL = headers.l("Set-Cookie");
            int size = listL.size();
            ArrayList arrayList = null;
            for (int i15 = 0; i15 < size; i15++) {
                m mVarC = c(url, listL.get(i15));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            return arrayList != null ? Collections.unmodifiableList(arrayList) : pq.v.n();
        }

        private Companion() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j15, String str3, String str4, boolean z15, boolean z16, boolean z17, boolean z18, fr.k kVar) {
        this(str, str2, j15, str3, str4, z15, z16, z17, z18);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return fr.t.c(mVar.name, this.name) && fr.t.c(mVar.value, this.value) && mVar.expiresAt == this.expiresAt && fr.t.c(mVar.domain, this.domain) && fr.t.c(mVar.path, this.path) && mVar.secure == this.secure && mVar.httpOnly == this.httpOnly && mVar.persistent == this.persistent && mVar.hostOnly == this.hostOnly;
    }

    public final String f(boolean forObsoleteRfc2965) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.name);
        sb5.append('=');
        sb5.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb5.append("; max-age=0");
            } else {
                sb5.append("; expires=");
                sb5.append(lv.c.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb5.append("; domain=");
            if (forObsoleteRfc2965) {
                sb5.append(".");
            }
            sb5.append(this.domain);
        }
        sb5.append("; path=");
        sb5.append(this.path);
        if (this.secure) {
            sb5.append("; secure");
        }
        if (this.httpOnly) {
            sb5.append("; httponly");
        }
        return sb5.toString();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    public String toString() {
        return f(false);
    }

    private m(String str, String str2, long j15, String str3, String str4, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j15;
        this.domain = str3;
        this.path = str4;
        this.secure = z15;
        this.httpOnly = z16;
        this.persistent = z17;
        this.hostOnly = z18;
    }
}
