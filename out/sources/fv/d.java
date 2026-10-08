package fv;

import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 (2\u00020\u0001:\u0002\u0016\u001aBs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lfv/d;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Z", "g", "()Z", "b", "h", "c", "I", "()I", "d", "e", "f", "i", "j", "k", "l", "m", "Ljava/lang/String;", "n", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f67287o = new a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f67288p = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean noStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxAgeSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrivate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean mustRevalidate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxStaleSeconds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minFreshSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean onlyIfCached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean noTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean immutable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String headerValue;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014¨\u0006!"}, d2 = {"Lfv/d$a;", "", "<init>", "()V", "", "", "b", "(J)I", "d", "()Lfv/d$a;", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "c", "(ILjava/util/concurrent/TimeUnit;)Lfv/d$a;", "e", "Lfv/d;", "a", "()Lfv/d;", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "f", "onlyIfCached", "g", "noTransform", "h", "immutable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean noCache;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean noStore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxAgeSeconds = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int maxStaleSeconds = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int minFreshSeconds = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean onlyIfCached;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean noTransform;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean immutable;

        private final int b(long j15) {
            if (j15 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j15;
        }

        public final d a() {
            return new d(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final a c(int maxStale, TimeUnit timeUnit) {
            if (maxStale >= 0) {
                this.maxStaleSeconds = b(timeUnit.toSeconds(maxStale));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
        }

        public final a d() {
            this.noCache = true;
            return this;
        }

        public final a e() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: fv.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfv/d$b;", "", "<init>", "()V", "", "characters", "", "startIndex", "a", "(Ljava/lang/String;Ljava/lang/String;I)I", "Lfv/u;", "headers", "Lfv/d;", "b", "(Lfv/u;)Lfv/d;", "FORCE_CACHE", "Lfv/d;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final int a(String str, String str2, int i15) {
            int length = str.length();
            while (i15 < length) {
                if (fu.r.c0(str2, str.charAt(i15), false, 2, null)) {
                    return i15;
                }
                i15++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:21:0x0070  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:42:0x0107  */
        /* JADX WARN: Code duplicated, block: B:54:0x014f  */
        /* JADX WARN: Code duplicated, block: B:57:0x015d  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x018e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x010f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0121 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0166 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x017a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00f0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00eb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0101 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0147 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0157 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0186 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0172 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x013f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x012b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0119 A[SYNTHETIC] */
        public final d b(u headers) {
            int iA;
            int iA2;
            String string;
            boolean z15;
            String string2;
            u uVar = headers;
            int size = uVar.size();
            boolean z16 = true;
            boolean z17 = true;
            int i15 = 0;
            String str = null;
            boolean z18 = false;
            boolean z19 = false;
            int iV = -1;
            int iV2 = -1;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            int iV3 = -1;
            int iV4 = -1;
            boolean z28 = false;
            boolean z29 = false;
            boolean z35 = false;
            while (i15 < size) {
                String strF = uVar.f(i15);
                String strK = uVar.k(i15);
                if (fu.r.G(strF, "Cache-Control", z16)) {
                    if (str == null) {
                        str = strK;
                    }
                    iA = 0;
                    while (iA < strK.length()) {
                        iA2 = a(strK, "=,;", iA);
                        string = fu.r.u1(strK.substring(iA, iA2)).toString();
                        z15 = z16;
                        if (iA2 != strK.length() || strK.charAt(iA2) == ',' || strK.charAt(iA2) == ';') {
                            strK = strK;
                            iA = iA2 + 1;
                            string2 = null;
                        } else {
                            int iD = gv.d.D(strK, iA2 + 1);
                            if (iD >= strK.length() || strK.charAt(iD) != '\"') {
                                strK = strK;
                                iA = a(strK, ",;", iD);
                                string2 = fu.r.u1(strK.substring(iD, iA)).toString();
                            } else {
                                int i16 = iD + 1;
                                String str2 = strK;
                                int iQ0 = fu.r.q0(str2, '\"', i16, false, 4, null);
                                strK = str2;
                                iA = iQ0 + 1;
                                string2 = strK.substring(i16, iQ0);
                            }
                        }
                        if (fu.r.G("no-cache", string, z15)) {
                            z18 = z15;
                            z16 = z18;
                        } else if (fu.r.G("no-store", string, z15)) {
                            z19 = z15;
                            z16 = z19;
                        } else {
                            if (fu.r.G("max-age", string, z15)) {
                                iV = gv.d.V(string2, -1);
                            } else if (fu.r.G("s-maxage", string, z15)) {
                                iV2 = gv.d.V(string2, -1);
                            } else if (fu.r.G("private", string, z15)) {
                                z25 = z15;
                                z16 = z25;
                            } else if (fu.r.G("public", string, z15)) {
                                z26 = z15;
                                z16 = z26;
                            } else if (fu.r.G("must-revalidate", string, z15)) {
                                z27 = z15;
                                z16 = z27;
                            } else if (fu.r.G("max-stale", string, z15)) {
                                iV3 = gv.d.V(string2, Integer.MAX_VALUE);
                            } else if (fu.r.G("min-fresh", string, z15)) {
                                iV4 = gv.d.V(string2, -1);
                            } else if (fu.r.G("only-if-cached", string, z15)) {
                                z28 = z15;
                                z16 = z28;
                            } else if (fu.r.G("no-transform", string, z15)) {
                                z29 = z15;
                                z16 = z29;
                            } else if (fu.r.G("immutable", string, z15)) {
                                z35 = z15;
                                z16 = z35;
                            }
                            z16 = z15;
                        }
                    }
                    i15++;
                    uVar = headers;
                    z16 = z16;
                } else {
                    if (fu.r.G(strF, "Pragma", z16)) {
                    }
                    i15++;
                    uVar = headers;
                    z16 = z16;
                }
                z17 = false;
                iA = 0;
                while (iA < strK.length()) {
                    iA2 = a(strK, "=,;", iA);
                    string = fu.r.u1(strK.substring(iA, iA2)).toString();
                    z15 = z16;
                    if (iA2 != strK.length()) {
                        strK = strK;
                        iA = iA2 + 1;
                        string2 = null;
                    } else {
                        strK = strK;
                        iA = iA2 + 1;
                        string2 = null;
                    }
                    if (fu.r.G("no-cache", string, z15)) {
                        z18 = z15;
                        z16 = z18;
                    } else if (fu.r.G("no-store", string, z15)) {
                        z19 = z15;
                        z16 = z19;
                    } else {
                        if (fu.r.G("max-age", string, z15)) {
                            iV = gv.d.V(string2, -1);
                        } else if (fu.r.G("s-maxage", string, z15)) {
                            iV2 = gv.d.V(string2, -1);
                        } else if (fu.r.G("private", string, z15)) {
                            z25 = z15;
                            z16 = z25;
                        } else if (fu.r.G("public", string, z15)) {
                            z26 = z15;
                            z16 = z26;
                        } else if (fu.r.G("must-revalidate", string, z15)) {
                            z27 = z15;
                            z16 = z27;
                        } else if (fu.r.G("max-stale", string, z15)) {
                            iV3 = gv.d.V(string2, Integer.MAX_VALUE);
                        } else if (fu.r.G("min-fresh", string, z15)) {
                            iV4 = gv.d.V(string2, -1);
                        } else if (fu.r.G("only-if-cached", string, z15)) {
                            z28 = z15;
                            z16 = z28;
                        } else if (fu.r.G("no-transform", string, z15)) {
                            z29 = z15;
                            z16 = z29;
                        } else if (fu.r.G("immutable", string, z15)) {
                            z35 = z15;
                            z16 = z35;
                        }
                        z16 = z15;
                    }
                }
                i15++;
                uVar = headers;
                z16 = z16;
            }
            return new d(z18, z19, iV, iV2, z25, z26, z27, iV3, iV4, z28, z29, z35, !z17 ? null : str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(boolean z15, boolean z16, int i15, int i16, boolean z17, boolean z18, boolean z19, int i17, int i18, boolean z25, boolean z26, boolean z27, String str, fr.k kVar) {
        this(z15, z16, i15, i16, z17, z18, z19, i17, i18, z25, z26, z27, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.noCache) {
            sb5.append("no-cache, ");
        }
        if (this.noStore) {
            sb5.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb5.append("max-age=");
            sb5.append(this.maxAgeSeconds);
            sb5.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb5.append("s-maxage=");
            sb5.append(this.sMaxAgeSeconds);
            sb5.append(", ");
        }
        if (this.isPrivate) {
            sb5.append("private, ");
        }
        if (this.isPublic) {
            sb5.append("public, ");
        }
        if (this.mustRevalidate) {
            sb5.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb5.append("max-stale=");
            sb5.append(this.maxStaleSeconds);
            sb5.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb5.append("min-fresh=");
            sb5.append(this.minFreshSeconds);
            sb5.append(", ");
        }
        if (this.onlyIfCached) {
            sb5.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb5.append("no-transform, ");
        }
        if (this.immutable) {
            sb5.append("immutable, ");
        }
        if (sb5.length() == 0) {
            return "";
        }
        sb5.delete(sb5.length() - 2, sb5.length());
        String string = sb5.toString();
        this.headerValue = string;
        return string;
    }

    private d(boolean z15, boolean z16, int i15, int i16, boolean z17, boolean z18, boolean z19, int i17, int i18, boolean z25, boolean z26, boolean z27, String str) {
        this.noCache = z15;
        this.noStore = z16;
        this.maxAgeSeconds = i15;
        this.sMaxAgeSeconds = i16;
        this.isPrivate = z17;
        this.isPublic = z18;
        this.mustRevalidate = z19;
        this.maxStaleSeconds = i17;
        this.minFreshSeconds = i18;
        this.onlyIfCached = z25;
        this.noTransform = z26;
        this.immutable = z27;
        this.headerValue = str;
    }
}
