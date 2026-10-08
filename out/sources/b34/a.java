package b34;

import ay.g;
import dx.i;
import fr.t;
import iy.k0;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import oq.i0;
import oq.p;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;
import pl.gov.coi.mobywatel.technical.ct.data.crl.CachedCrlEntryDto;
import pq.v0;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u00022/BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b\"\u0010#J0\u0010(\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b(\u0010)J9\u0010-\u001a\u00020\u00162\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140+0*2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J,\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010;R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lb34/a;", "Lpl/gov/coi/common/network/d;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "httpRequestExecutor", "Lb34/b;", "crlStorageCache", "Lay/g;", "httpCacheHeaderParser", "Liy/a;", "base64Coder", "Lez/a;", "currentTimeProvider", "Lpl/gov/coi/common/network/e;", "crlVerifier", "Liy/k0;", "x509CrlParser", "Lpx/d;", "remoteLogger", "<init>", "(Lpl/gov/coi/common/network/HttpRequestExecutor;Lb34/b;Lay/g;Liy/a;Lez/a;Lpl/gov/coi/common/network/e;Liy/k0;Lpx/d;)V", "", "crlUrl", "", "nowMillis", "Ljava/security/cert/X509CRL;", "h", "(Ljava/lang/String;J)Ljava/security/cert/X509CRL;", "Ljava/security/cert/X509Certificate;", "issuer", "Ldx/i;", "Ldx/b;", "f", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;JLtq/e;)Ljava/lang/Object;", "Loq/i0;", "g", "(Ltq/e;)Ljava/lang/Object;", "crl", "", "crlBytes", "expiresAtMillis", "e", "(Ljava/lang/String;Ljava/security/cert/X509CRL;[BJLtq/e;)Ljava/lang/Object;", "", "Loq/r;", "headers", "i", "(Ljava/util/List;Ljava/security/cert/X509CRL;J)J", "a", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "b", "Lb34/b;", "c", "Lay/g;", "d", "Liy/a;", "Lez/a;", "Lpl/gov/coi/common/network/e;", "Liy/k0;", "Lpx/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lb34/a$b;", "Ljava/util/concurrent/ConcurrentHashMap;", "ramCache", "Lsu/a;", "j", "Lsu/a;", "storageMutex", "", "k", "Z", "storageHydrated", "l", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements pl.gov.coi.common.network.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpRequestExecutor httpRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b crlStorageCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g httpCacheHeaderParser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.e crlVerifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k0 x509CrlParser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, RamCacheEntry> ramCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final su.a storageMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private volatile boolean storageHydrated;

    /* JADX INFO: renamed from: b34.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lb34/a$b;", "", "Ljava/security/cert/X509CRL;", "crl", "", "expiresAtMillis", "<init>", "(Ljava/security/cert/X509CRL;J)V", "nowMillis", "", "b", "(J)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/cert/X509CRL;", "()Ljava/security/cert/X509CRL;", "J", "getExpiresAtMillis", "()J", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class RamCacheEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final X509CRL crl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long expiresAtMillis;

        public RamCacheEntry(X509CRL x509crl, long j15) {
            this.crl = x509crl;
            this.expiresAtMillis = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final X509CRL getCrl() {
            return this.crl;
        }

        public final boolean b(long nowMillis) {
            return this.expiresAtMillis > nowMillis;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RamCacheEntry)) {
                return false;
            }
            RamCacheEntry ramCacheEntry = (RamCacheEntry) other;
            return t.c(this.crl, ramCacheEntry.crl) && this.expiresAtMillis == ramCacheEntry.expiresAtMillis;
        }

        public int hashCode() {
            return (this.crl.hashCode() * 31) + Long.hashCode(this.expiresAtMillis);
        }

        public String toString() {
            return "RamCacheEntry(crl=" + this.crl + ", expiresAtMillis=" + this.expiresAtMillis + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f16427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f16428g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f16429h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16430j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f16431k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f16433m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16431k = obj;
            this.f16433m |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, null, null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f16436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f16437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16438h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f16439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f16440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f16441l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f16442m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f16443n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f16444p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f16445q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f16446r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f16447s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f16448t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f16449v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f16450w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f16451x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f16452y;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16452y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return a.this.f(null, null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f16456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16457g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16459j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16457g = obj;
            this.f16459j |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16462f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16464h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16462f = obj;
            this.f16464h |= PKIFailureInfo.systemUnavail;
            return a.this.g(this);
        }
    }

    public a(HttpRequestExecutor httpRequestExecutor, b bVar, g gVar, iy.a aVar, ez.a aVar2, pl.gov.coi.common.network.e eVar, k0 k0Var, px.d dVar) {
        this.httpRequestExecutor = httpRequestExecutor;
        this.crlStorageCache = bVar;
        this.httpCacheHeaderParser = gVar;
        this.base64Coder = aVar;
        this.currentTimeProvider = aVar2;
        this.crlVerifier = eVar;
        this.x509CrlParser = k0Var;
        this.remoteLogger = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, X509CRL x509crl, byte[] bArr, long j15, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        su.a aVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f16433m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f16433m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f16431k;
        Object objE = uq.b.e();
        int i16 = cVar.f16433m;
        if (i16 == 0) {
            u.b(obj);
            this.ramCache.put(str, new RamCacheEntry(x509crl, j15));
            aVar = this.storageMutex;
            cVar.f16425d = str;
            cVar.f16426e = j.a(x509crl);
            cVar.f16427f = bArr;
            cVar.f16428g = aVar;
            cVar.f16429h = j15;
            cVar.f16430j = 0;
            cVar.f16433m = 1;
            if (aVar.h(null, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j15 = cVar.f16429h;
            su.a aVar2 = (su.a) cVar.f16428g;
            bArr = (byte[]) cVar.f16427f;
            String str2 = (String) cVar.f16425d;
            u.b(obj);
            aVar = aVar2;
            str = str2;
        }
        try {
            Map<String, CachedCrlEntryDto> mapW = v0.w(this.crlStorageCache.a());
            mapW.put(str, new CachedCrlEntryDto(iy.a.e(this.base64Coder, bArr, null, 2, null), j15));
            this.crlStorageCache.b(mapW);
            this.storageHydrated = true;
            i0 i0Var = i0.f148189a;
            return i0.f148189a;
        } finally {
            aVar.r(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [b34.a] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object f(String str, X509Certificate x509Certificate, long j15, tq.e<? super i<? extends dx.b, ? extends X509CRL>> eVar) throws Throwable {
        d dVar;
        Object objB;
        long j16;
        X509Certificate x509Certificate2;
        String str2;
        X509CRL x509crl;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.A;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.A = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f16452y;
        Object objE = uq.b.e();
        int i16 = dVar2.A;
        ?? r15 = 1;
        try {
            try {
                if (i16 == 0) {
                    u.b(objA);
                    HttpRequestExecutor httpRequestExecutor = this.httpRequestExecutor;
                    pl.gov.coi.common.network.t.NonCTRaw nonCTRaw = new pl.gov.coi.common.network.t.NonCTRaw(null, 1, null);
                    dVar2.f16434d = str;
                    dVar2.f16435e = x509Certificate;
                    dVar2.f16443n = j15;
                    dVar2.A = 1;
                    objA = HttpRequestExecutor.a(httpRequestExecutor, str, null, null, null, null, null, nonCTRaw, dVar2, 62, null);
                    if (objA != objE) {
                        j16 = j15;
                        x509Certificate2 = x509Certificate;
                        str2 = str;
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x509crl = (X509CRL) dVar2.f16441l;
                    try {
                        u.b(objA);
                        return new i.Right(x509crl);
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                long j17 = dVar2.f16443n;
                x509Certificate2 = (X509Certificate) dVar2.f16435e;
                String str3 = (String) dVar2.f16434d;
                u.b(objA);
                str2 = str3;
                j16 = j17;
                i iVar = (i) objA;
                if (iVar instanceof i.Left) {
                    return iVar;
                }
                if (!(iVar instanceof i.Right)) {
                    throw new p();
                }
                HttpRequestExecutor.a aVar = (HttpRequestExecutor.a) ((i.Right) iVar).b();
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar2 = new ex.a();
                    byte[] body = aVar.getBody();
                    if (body == null) {
                        return new i.Left(new dx.b.Parsing(new IllegalStateException("Empty CRL response body from " + str2)));
                    }
                    X509CRL x509crl2 = this.x509CrlParser.parse(body);
                    if (x509crl2 == null) {
                        return new i.Left(new dx.b.Parsing(new IllegalStateException("Unable to parse CRL from " + str2)));
                    }
                    if (!this.crlVerifier.a(x509crl2, x509Certificate2)) {
                        this.remoteLogger.F8("CRL signature verification failed for " + str2, px.d.a.NETWORK);
                        return new i.Left(new dx.b.Parsing(new IllegalStateException("Invalid CRL signature for " + str2)));
                    }
                    long jI = i(aVar.c(), x509crl2, j16);
                    dVar2.f16434d = j.a(str2);
                    dVar2.f16435e = j.a(x509Certificate2);
                    dVar2.f16436f = j.a(iVar);
                    dVar2.f16437g = j.a(aVar);
                    dVar2.f16438h = jVarA;
                    dVar2.f16439j = j.a(aVar2);
                    dVar2.f16440k = j.a(aVar2);
                    dVar2.f16441l = x509crl2;
                    dVar2.f16442m = j.a(body);
                    dVar2.f16443n = j16;
                    dVar2.f16445q = 0;
                    dVar2.f16446r = 0;
                    dVar2.f16447s = 0;
                    dVar2.f16448t = 0;
                    dVar2.f16449v = 0;
                    dVar2.f16450w = 0;
                    dVar2.f16451x = 0;
                    dVar2.f16444p = jI;
                    dVar2.A = 2;
                    if (e(str2, x509crl2, body, jI, dVar2) != objE) {
                        x509crl = x509crl2;
                        return new i.Right(x509crl);
                    }
                    return objE;
                } catch (ex.c e17) {
                    e = e17;
                    return new i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    r15 = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(r15));
                    i iVarA = r15.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        su.a aVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f16464h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f16464h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f16462f;
        Object objE = uq.b.e();
        int i16 = fVar.f16464h;
        if (i16 == 0) {
            u.b(obj);
            aVar = this.storageMutex;
            fVar.f16460d = aVar;
            fVar.f16461e = 0;
            fVar.f16464h = 1;
            if (aVar.h(null, fVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar2 = (su.a) fVar.f16460d;
            u.b(obj);
            aVar = aVar2;
        }
        try {
            if (!this.storageHydrated) {
                long jA = this.currentTimeProvider.a();
                for (Map.Entry<String, CachedCrlEntryDto> entry : this.crlStorageCache.a().entrySet()) {
                    String key = entry.getKey();
                    CachedCrlEntryDto value = entry.getValue();
                    byte[] bArr = (byte[]) iy.a.c(this.base64Coder, value.getBase64Crl(), null, 2, null).a();
                    if (bArr == null) {
                        px.b.y5(this.remoteLogger, "Failed to decode cached CRL bytes for " + key, null, px.c.a(this), 2, null);
                    } else if (value.getExpiresAtMillis() > jA) {
                        try {
                            X509CRL x509crl = this.x509CrlParser.parse(bArr);
                            if (x509crl != null) {
                                this.ramCache.put(key, new RamCacheEntry(x509crl, value.getExpiresAtMillis()));
                            }
                        } catch (CancellationException e15) {
                            throw e15;
                        } catch (Exception e16) {
                            this.remoteLogger.T6("Failed to parse cached CRL for " + key + ": " + e16.getMessage(), e16, px.c.a(this));
                        }
                    }
                }
                this.storageHydrated = true;
            }
            i0 i0Var = i0.f148189a;
            aVar.r(null);
            return i0.f148189a;
        } catch (Throwable th4) {
            aVar.r(null);
            throw th4;
        }
    }

    private final X509CRL h(String crlUrl, long nowMillis) {
        RamCacheEntry ramCacheEntry = this.ramCache.get(crlUrl);
        if (ramCacheEntry != null) {
            if (!ramCacheEntry.b(nowMillis)) {
                ramCacheEntry = null;
            }
            if (ramCacheEntry != null) {
                px.f.f163100a.b("CRL cache hit for " + crlUrl, px.c.a(this));
                return ramCacheEntry.getCrl();
            }
        }
        return null;
    }

    private final long i(List<r<String, String>> headers, X509CRL crl, long nowMillis) {
        Date nextUpdate = crl.getNextUpdate();
        if (nextUpdate != null) {
            Long lValueOf = Long.valueOf(nextUpdate.getTime());
            if (lValueOf.longValue() <= nowMillis) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        }
        Long lA = this.httpCacheHeaderParser.a(headers, nowMillis);
        return lA != null ? lA.longValue() : nowMillis + 3600000;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // pl.gov.coi.common.network.d
    public Object a(String str, X509Certificate x509Certificate, tq.e<? super i<? extends dx.b, ? extends X509CRL>> eVar) throws Throwable {
        e eVar2;
        long jA;
        X509Certificate x509Certificate2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f16459j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f16459j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        e eVar3 = eVar2;
        Object obj = eVar3.f16457g;
        Object objE = uq.b.e();
        int i16 = eVar3.f16459j;
        if (i16 == 0) {
            u.b(obj);
            jA = this.currentTimeProvider.a();
            X509CRL x509crlH = h(str, jA);
            if (x509crlH != null) {
                return new i.Right(x509crlH);
            }
            eVar3.f16454d = str;
            eVar3.f16455e = x509Certificate;
            eVar3.f16456f = jA;
            eVar3.f16459j = 1;
            if (g(eVar3) != objE) {
                x509Certificate2 = x509Certificate;
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return obj;
        }
        long j15 = eVar3.f16456f;
        X509Certificate x509Certificate3 = (X509Certificate) eVar3.f16455e;
        String str2 = (String) eVar3.f16454d;
        u.b(obj);
        jA = j15;
        str = str2;
        x509Certificate2 = x509Certificate3;
        X509CRL x509crlH2 = h(str, jA);
        if (x509crlH2 != null) {
            return new i.Right(x509crlH2);
        }
        eVar3.f16454d = j.a(str);
        eVar3.f16455e = j.a(x509Certificate2);
        eVar3.f16456f = jA;
        eVar3.f16459j = 2;
        Object objF = f(str, x509Certificate2, jA, eVar3);
        return objF == objE ? objE : objF;
    }
}
