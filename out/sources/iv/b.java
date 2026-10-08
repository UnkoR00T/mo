package iv;

import fr.k;
import fu.r;
import fv.b0;
import fv.d0;
import fv.u;
import gv.d;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import lv.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\b\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Liv/b;", "", "Lfv/b0;", "networkRequest", "Lfv/d0;", "cacheResponse", "<init>", "(Lfv/b0;Lfv/d0;)V", "a", "Lfv/b0;", "b", "()Lfv/b0;", "Lfv/d0;", "()Lfv/d0;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 networkRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 cacheResponse;

    /* JADX INFO: renamed from: iv.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liv/b$a;", "", "<init>", "()V", "Lfv/d0;", "response", "Lfv/b0;", "request", "", "a", "(Lfv/d0;Lfv/b0;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0031  */
        public final boolean a(d0 response, b0 request) {
            int code = response.getCode();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code == 307) {
                    if (d0.E(response, "Expires", null, 2, null) == null && response.h().getMaxAgeSeconds() == -1 && !response.h().getIsPublic() && !response.h().getIsPrivate()) {
                        return false;
                    }
                } else if (code != 308 && code != 404 && code != 405) {
                    switch (code) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (d0.E(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.h().getNoStore() || request.b().getNoStore()) ? false : true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: iv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Liv/b$b;", "", "", "nowMillis", "Lfv/b0;", "request", "Lfv/d0;", "cacheResponse", "<init>", "(JLfv/b0;Lfv/d0;)V", "", "f", "()Z", "Liv/b;", "c", "()Liv/b;", "d", "()J", "a", "e", "(Lfv/b0;)Z", "b", "J", "Lfv/b0;", "getRequest$okhttp", "()Lfv/b0;", "Lfv/d0;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2275b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long nowMillis;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final b0 request;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d0 cacheResponse;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        public C2275b(long j15, b0 b0Var, d0 d0Var) {
            this.nowMillis = j15;
            this.request = b0Var;
            this.cacheResponse = d0Var;
            this.ageSeconds = -1;
            if (d0Var != null) {
                this.sentRequestMillis = d0Var.getSentRequestAtMillis();
                this.receivedResponseMillis = d0Var.getReceivedResponseAtMillis();
                u headers = d0Var.getHeaders();
                int size = headers.size();
                for (int i15 = 0; i15 < size; i15++) {
                    String strF = headers.f(i15);
                    String strK = headers.k(i15);
                    if (r.G(strF, "Date", true)) {
                        this.servedDate = c.a(strK);
                        this.servedDateString = strK;
                    } else if (r.G(strF, "Expires", true)) {
                        this.expires = c.a(strK);
                    } else if (r.G(strF, "Last-Modified", true)) {
                        this.lastModified = c.a(strK);
                        this.lastModifiedString = strK;
                    } else if (r.G(strF, "ETag", true)) {
                        this.etag = strK;
                    } else if (r.G(strF, "Age", true)) {
                        this.ageSeconds = d.V(strK, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i15 = this.ageSeconds;
            if (i15 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i15));
            }
            long j15 = this.receivedResponseMillis;
            return jMax + (j15 - this.sentRequestMillis) + (this.nowMillis - j15);
        }

        private final b c() {
            String str;
            if (this.cacheResponse == null) {
                return new b(this.request, null);
            }
            if ((!this.request.g() || this.cacheResponse.getHandshake() != null) && b.INSTANCE.a(this.cacheResponse, this.request)) {
                fv.d dVarB = this.request.b();
                if (dVarB.getNoCache() || e(this.request)) {
                    return new b(this.request, null);
                }
                fv.d dVarH = this.cacheResponse.h();
                long jA = a();
                long jD = d();
                if (dVarB.getMaxAgeSeconds() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.getMaxAgeSeconds()));
                }
                long millis = 0;
                long millis2 = dVarB.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.getMinFreshSeconds()) : 0L;
                if (!dVarH.getMustRevalidate() && dVarB.getMaxStaleSeconds() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(dVarB.getMaxStaleSeconds());
                }
                if (!dVarH.getNoCache()) {
                    long j15 = millis2 + jA;
                    if (j15 < millis + jD) {
                        d0.a aVarK = this.cacheResponse.K();
                        if (j15 >= jD) {
                            aVarK.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarK.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new b(null, aVarK.c());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else {
                        if (this.servedDate == null) {
                            return new b(this.request, null);
                        }
                        str2 = this.servedDateString;
                    }
                    str = "If-Modified-Since";
                }
                u.a aVarG = this.request.getHeaders().g();
                aVarG.d(str, str2);
                return new b(this.request.i().e(aVarG.f()).b(), this.cacheResponse);
            }
            return new b(this.request, null);
        }

        private final long d() {
            fv.d dVarH = this.cacheResponse.h();
            if (dVarH.getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarH.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.getRequest().getUrl().o() == null) {
                Date date3 = this.servedDate;
                long time2 = (date3 != null ? date3.getTime() : this.sentRequestMillis) - this.lastModified.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(b0 request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            return this.cacheResponse.h().getMaxAgeSeconds() == -1 && this.expires == null;
        }

        public final b b() {
            b bVarC = c();
            return (bVarC.getNetworkRequest() == null || !this.request.b().getOnlyIfCached()) ? bVarC : new b(null, null);
        }
    }

    public b(b0 b0Var, d0 d0Var) {
        this.networkRequest = b0Var;
        this.cacheResponse = d0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d0 getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getNetworkRequest() {
        return this.networkRequest;
    }
}
