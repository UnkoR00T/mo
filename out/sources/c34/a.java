package c34;

import dx.i;
import fr.k;
import fr.t;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import oq.p;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cert.ocsp.CertificateID;
import org.bouncycastle.cert.ocsp.OCSPReqBuilder;
import org.bouncycastle.cert.ocsp.OCSPResp;
import org.bouncycastle.cert.ocsp.SingleResp;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;
import pl.gov.coi.common.network.k0;
import pl.gov.coi.common.network.m0;
import pq.v0;
import px.c;
import px.f;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0003\u001c\u0010\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lc34/a;", "Lpl/gov/coi/common/network/m0;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "httpRequestExecutor", "Lpl/gov/coi/common/network/k0;", "ocspResponseVerifier", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "<init>", "(Lpl/gov/coi/common/network/HttpRequestExecutor;Lpl/gov/coi/common/network/k0;Lez/a;Lpx/d;)V", "Ljava/security/cert/X509Certificate;", "cert", "issuer", "", "c", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)[B", "", "ocspUrl", "requestBody", "Ldx/i;", "Ldx/b$e;", "Lorg/bouncycastle/cert/ocsp/OCSPResp;", "d", "(Ljava/lang/String;[BLtq/e;)Ljava/lang/Object;", "Ldx/b;", "Lorg/bouncycastle/cert/ocsp/SingleResp;", "a", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "b", "Lpl/gov/coi/common/network/k0;", "Lez/a;", "Lpx/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lc34/a$a;", "Lc34/a$c;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "ramCache", "f", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f23070f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpRequestExecutor httpRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k0 ocspResponseVerifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<CacheKey, RamCacheEntry> ramCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c34.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc34/a$a;", "", "", "ocspUrl", "issuerDn", "Ljava/math/BigInteger;", "certSerial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOcspUrl", "b", "getIssuerDn", "c", "Ljava/math/BigInteger;", "getCertSerial", "()Ljava/math/BigInteger;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class CacheKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ocspUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String issuerDn;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BigInteger certSerial;

        public CacheKey(String str, String str2, BigInteger bigInteger) {
            this.ocspUrl = str;
            this.issuerDn = str2;
            this.certSerial = bigInteger;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return t.c(this.ocspUrl, cacheKey.ocspUrl) && t.c(this.issuerDn, cacheKey.issuerDn) && t.c(this.certSerial, cacheKey.certSerial);
        }

        public int hashCode() {
            return (((this.ocspUrl.hashCode() * 31) + this.issuerDn.hashCode()) * 31) + this.certSerial.hashCode();
        }

        public String toString() {
            return "CacheKey(ocspUrl=" + this.ocspUrl + ", issuerDn=" + this.issuerDn + ", certSerial=" + this.certSerial + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc34/a$b;", "", "<init>", "()V", "", "FALLBACK_TTL_MILLIS", "J", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: c34.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc34/a$c;", "", "Lorg/bouncycastle/cert/ocsp/SingleResp;", "singleResp", "", "expiresAtMillis", "<init>", "(Lorg/bouncycastle/cert/ocsp/SingleResp;J)V", "nowMillis", "", "b", "(J)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/bouncycastle/cert/ocsp/SingleResp;", "()Lorg/bouncycastle/cert/ocsp/SingleResp;", "J", "getExpiresAtMillis", "()J", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class RamCacheEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SingleResp singleResp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long expiresAtMillis;

        public RamCacheEntry(SingleResp singleResp, long j15) {
            this.singleResp = singleResp;
            this.expiresAtMillis = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SingleResp getSingleResp() {
            return this.singleResp;
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
            return t.c(this.singleResp, ramCacheEntry.singleResp) && this.expiresAtMillis == ramCacheEntry.expiresAtMillis;
        }

        public int hashCode() {
            return (this.singleResp.hashCode() * 31) + Long.hashCode(this.expiresAtMillis);
        }

        public String toString() {
            return "RamCacheEntry(singleResp=" + this.singleResp + ", expiresAtMillis=" + this.expiresAtMillis + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23083f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23085h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f23083f = obj;
            this.f23085h |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f23088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f23089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f23090h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f23091j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f23092k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f23094m;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f23092k = obj;
            this.f23094m |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, null, this);
        }
    }

    public a(HttpRequestExecutor httpRequestExecutor, k0 k0Var, ez.a aVar, px.d dVar) {
        this.httpRequestExecutor = httpRequestExecutor;
        this.ocspResponseVerifier = k0Var;
        this.currentTimeProvider = aVar;
        this.remoteLogger = dVar;
    }

    private final byte[] c(X509Certificate cert, X509Certificate issuer) {
        try {
            return new OCSPReqBuilder().addRequest(new CertificateID(new JcaDigestCalculatorProviderBuilder().build().get(CertificateID.HASH_SHA1), new JcaX509CertificateHolder(issuer), cert.getSerialNumber())).build().getEncoded();
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("OCSP request build error for cert serial=" + cert.getSerialNumber() + ": " + e16.getMessage(), e16, c.a(this));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object d(String str, byte[] bArr, tq.e<? super i<dx.b.Generic, ? extends OCSPResp>> eVar) throws Throwable {
        d dVar;
        i left;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f23085h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f23085h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f23083f;
        Object objE = uq.b.e();
        int i16 = dVar2.f23085h;
        if (i16 == 0) {
            u.b(objA);
            HttpRequestExecutor httpRequestExecutor = this.httpRequestExecutor;
            pl.gov.coi.common.network.t.NonCTRaw nonCTRaw = new pl.gov.coi.common.network.t.NonCTRaw(null, 1, null);
            HttpRequestExecutor.Method method = HttpRequestExecutor.Method.POST;
            Map mapF = v0.f(y.a("Accept", "application/ocsp-response"));
            dVar2.f23081d = str;
            dVar2.f23082e = j.a(bArr);
            dVar2.f23085h = 1;
            objA = HttpRequestExecutor.a(httpRequestExecutor, str, method, bArr, "application/ocsp-request", null, mapF, nonCTRaw, dVar2, 16, null);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) dVar2.f23081d;
            u.b(objA);
        }
        i iVar = (i) objA;
        if (!(iVar instanceof i.Left)) {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            try {
                left = new i.Right(new OCSPResp(((HttpRequestExecutor.a) ((i.Right) iVar).b()).getBody()));
            } catch (CancellationException e15) {
                throw e15;
            } catch (Exception e16) {
                this.remoteLogger.T6("OCSP response parse error for url " + str + ": " + e16.getMessage(), e16, c.a(this));
                left = new i.Left(new dx.b.Generic(e16));
            }
            iVar = left;
        }
        if (iVar instanceof i.Left) {
            dx.b.Generic generic = (dx.b.Generic) ((i.Left) iVar).b();
            px.d dVar3 = this.remoteLogger;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to fetch OCSP from ");
            sb5.append(str);
            sb5.append(": ");
            Throwable e17 = generic.getE();
            sb5.append(e17 != null ? e17.getMessage() : null);
            dVar3.T6(sb5.toString(), generic.getE(), c.a(this));
        }
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.common.network.m0
    public Object a(String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, tq.e<? super i<? extends dx.b, ? extends SingleResp>> eVar) throws Throwable {
        e eVar2;
        long jA;
        CacheKey cacheKey;
        Object objD;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f23094m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f23094m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f23092k;
        Object objE = uq.b.e();
        int i16 = eVar2.f23094m;
        if (i16 == 0) {
            u.b(obj);
            jA = this.currentTimeProvider.a();
            cacheKey = new CacheKey(str, x509Certificate2.getSubjectX500Principal().getName(), x509Certificate.getSerialNumber());
            RamCacheEntry ramCacheEntry = this.ramCache.get(cacheKey);
            if (ramCacheEntry != null) {
                if (!ramCacheEntry.b(jA)) {
                    ramCacheEntry = null;
                }
                if (ramCacheEntry != null) {
                    f.f163100a.b("OCSP cache hit for " + str + ", cert serial=" + x509Certificate.getSerialNumber(), c.a(this));
                    return new i.Right(ramCacheEntry.getSingleResp());
                }
            }
            byte[] bArrC = c(x509Certificate, x509Certificate2);
            if (bArrC == null) {
                return new i.Left(new dx.b.Generic(new IllegalStateException("Failed to build OCSP request for " + str)));
            }
            eVar2.f23086d = str;
            eVar2.f23087e = x509Certificate;
            eVar2.f23088f = x509Certificate2;
            eVar2.f23089g = cacheKey;
            eVar2.f23090h = j.a(bArrC);
            eVar2.f23091j = jA;
            eVar2.f23094m = 1;
            objD = d(str, bArrC, eVar2);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j15 = eVar2.f23091j;
            CacheKey cacheKey2 = (CacheKey) eVar2.f23089g;
            X509Certificate x509Certificate3 = (X509Certificate) eVar2.f23088f;
            X509Certificate x509Certificate4 = (X509Certificate) eVar2.f23087e;
            String str2 = (String) eVar2.f23086d;
            u.b(obj);
            jA = j15;
            str = str2;
            x509Certificate = x509Certificate4;
            objD = obj;
            cacheKey = cacheKey2;
            x509Certificate2 = x509Certificate3;
        }
        i iVar = (i) objD;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        SingleResp singleRespA = this.ocspResponseVerifier.a((OCSPResp) ((i.Right) iVar).b(), x509Certificate, x509Certificate2);
        if (singleRespA != null) {
            Date nextUpdate = singleRespA.getNextUpdate();
            this.ramCache.put(cacheKey, new RamCacheEntry(singleRespA, nextUpdate != null ? nextUpdate.getTime() : 300000 + jA));
            return new i.Right(singleRespA);
        }
        return new i.Left(new dx.b.Generic(new IllegalStateException("Untrusted OCSP response from " + str)));
    }
}
