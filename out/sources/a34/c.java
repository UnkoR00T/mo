package a34;

import ay.j;
import er.l;
import eu.k;
import fr.q0;
import iy.d0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import jz3.LogListDto;
import oq.i0;
import oq.p;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;
import pl.gov.coi.common.network.t;
import pq.v0;
import py.m;
import z24.CTLogInfoDomain;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001>B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010'H\u0082@¢\u0006\u0004\b(\u0010\u001dJ \u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J(\u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\n\b\u0002\u00100\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u0004\u0018\u00010'2\u0006\u00106\u001a\u000202H\u0082@¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020$H\u0002¢\u0006\u0004\b9\u0010:J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002030;H\u0096@¢\u0006\u0004\b<\u0010\u001dJ\u001a\u0010>\u001a\u0004\u0018\u0001032\u0006\u0010=\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010QR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010RR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010TR\"\u0010W\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010V¨\u0006X"}, d2 = {"La34/c;", "Le34/b;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "httpRequestExecutor", "La34/d;", "ctLogListStorageCache", "Liy/a;", "base64Coder", "Lpy/m;", "rsaKeyDecoder", "Lpy/e;", "ecKeyDecoder", "Liy/d0;", "signatureVerifier", "Lay/j;", "jsonSerializer", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "La34/f;", "gStaticBuildConfigRepository", "Lz24/b;", "certificateTransparencyEndpoints", "<init>", "(Lpl/gov/coi/common/network/HttpRequestExecutor;La34/d;Liy/a;Lpy/m;Lpy/e;Liy/d0;Lay/j;Lez/a;Lpx/d;La34/f;Lz24/b;)V", "Loq/r;", "", "j", "(Ltq/e;)Ljava/lang/Object;", "Ljava/io/InputStream;", "zip", "o", "(Ljava/io/InputStream;)Loq/r;", "logListJson", "signature", "", "v", "([B[BLtq/e;)Ljava/lang/Object;", "Ljava/security/PublicKey;", "k", "isSignatureValid", "Loq/i0;", "s", "(Z[BLtq/e;)Ljava/lang/Object;", "Ljz3/b;", "n", "([B)Ljz3/b;", "logListDto", "", "", "Lz24/a;", "t", "(Ljz3/b;Ltq/e;)Ljava/lang/Object;", "base64Key", "l", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "m", "()Z", "", "r", "logId", "a", "([BLtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "b", "La34/d;", "c", "Liy/a;", "d", "Lpy/m;", "e", "Lpy/e;", "f", "Liy/d0;", "g", "Lay/j;", "h", "Lez/a;", "i", "Lpx/d;", "La34/f;", "Lz24/b;", "", "J", "cacheTime", "Ljava/util/Map;", "logListCache", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements e34.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpRequestExecutor httpRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a34.d ctLogListStorageCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m rsaKeyDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.e ecKeyDecoder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d0 signatureVerifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a34.f gStaticBuildConfigRepository;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final z24.b certificateTransparencyEndpoints;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long cacheTime;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Map<String, CTLogInfoDomain> logListCache = v0.i();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f2533d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2535f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2533d = obj;
            this.f2535f |= PKIFailureInfo.systemUnavail;
            return c.this.j(this);
        }
    }

    /* JADX INFO: renamed from: a34.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0036c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2537e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2539g;

        C0036c(tq.e<? super C0036c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2537e = obj;
            this.f2539g |= PKIFailureInfo.systemUnavail;
            return c.this.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2544h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2545j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f2547l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2545j = obj;
            this.f2547l |= PKIFailureInfo.systemUnavail;
            return c.this.l(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2549e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2551g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2549e = obj;
            this.f2551g |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f2554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2555g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f2557j;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2555g = obj;
            this.f2557j |= PKIFailureInfo.systemUnavail;
            return c.this.r(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f2562h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f2564k;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2562h = obj;
            this.f2564k |= PKIFailureInfo.systemUnavail;
            return c.this.s(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f2569h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f2570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f2571k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f2572l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f2573m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2574n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f2575p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2576q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2577r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2578s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2579t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f2580v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f2582x;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2580v = obj;
            this.f2582x |= PKIFailureInfo.systemUnavail;
            return c.this.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2585f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2587h;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2585f = obj;
            this.f2587h |= PKIFailureInfo.systemUnavail;
            return c.this.v(null, null, this);
        }
    }

    public c(HttpRequestExecutor httpRequestExecutor, a34.d dVar, iy.a aVar, m mVar, py.e eVar, d0 d0Var, j jVar, ez.a aVar2, px.d dVar2, a34.f fVar, z24.b bVar) {
        this.httpRequestExecutor = httpRequestExecutor;
        this.ctLogListStorageCache = dVar;
        this.base64Coder = aVar;
        this.rsaKeyDecoder = mVar;
        this.ecKeyDecoder = eVar;
        this.signatureVerifier = d0Var;
        this.jsonSerializer = jVar;
        this.currentTimeProvider = aVar2;
        this.remoteLogger = dVar2;
        this.gStaticBuildConfigRepository = fVar;
        this.certificateTransparencyEndpoints = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j(tq.e<? super r<byte[], byte[]>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f2535f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f2535f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar2 = bVar;
        Object objA = bVar2.f2533d;
        Object objE = uq.b.e();
        int i16 = bVar2.f2535f;
        if (i16 == 0) {
            u.b(objA);
            HttpRequestExecutor httpRequestExecutor = this.httpRequestExecutor;
            String strY = this.certificateTransparencyEndpoints.Y();
            t.NonCTRaw nonCTRaw = new t.NonCTRaw(null, 1, null);
            bVar2.f2535f = 1;
            objA = HttpRequestExecutor.a(httpRequestExecutor, strY, null, null, null, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36", null, nonCTRaw, bVar2, 46, null);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            this.remoteLogger.T6("downloadCTZip", ((dx.b.Generic) ((dx.i.Left) iVar).b()).getE(), px.c.a(this));
            return y.a(new byte[0], new byte[0]);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        HttpRequestExecutor.a aVar = (HttpRequestExecutor.a) ((dx.i.Right) iVar).b();
        byte[] body = aVar.getBody();
        if (aVar.getIsSuccessful() && body != null) {
            return o(new ByteArrayInputStream(body));
        }
        px.f.e(px.f.f163100a, "Request failed, code: " + aVar.getCode() + ", message: " + aVar.getMessage(), null, px.c.a(this), 2, null);
        return y.a(new byte[0], new byte[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(tq.e<? super PublicKey> eVar) throws Throwable {
        C0036c c0036c;
        if (eVar instanceof C0036c) {
            c0036c = (C0036c) eVar;
            int i15 = c0036c.f2539g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0036c.f2539g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0036c = new C0036c(eVar);
            }
        } else {
            c0036c = new C0036c(eVar);
        }
        Object objC = c0036c.f2537e;
        Object objE = uq.b.e();
        int i16 = c0036c.f2539g;
        if (i16 == 0) {
            u.b(objC);
            String gstaticPublicKey = this.gStaticBuildConfigRepository.getGstaticPublicKey();
            m mVar = this.rsaKeyDecoder;
            c0036c.f2536d = vq.j.a(gstaticPublicKey);
            c0036c.f2539g = 1;
            objC = mVar.c(gstaticPublicKey, c0036c);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return ((dx.i) objC).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r7, tq.e<? super java.security.PublicKey> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a34.c.d
            if (r0 == 0) goto L13
            r0 = r8
            a34.c$d r0 = (a34.c.d) r0
            int r1 = r0.f2547l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2547l = r1
            goto L18
        L13:
            a34.c$d r0 = new a34.c$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2545j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f2547l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f2542f
            dx.b r7 = (dx.b) r7
            java.lang.Object r7 = r0.f2541e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f2540d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L89
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f2540d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L58
        L48:
            oq.u.b(r8)
            py.m r8 = r6.rsaKeyDecoder
            r0.f2540d = r7
            r0.f2547l = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L58
            goto L88
        L58:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L8c
            r2 = r8
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            py.e r4 = r6.ecKeyDecoder
            java.lang.Object r5 = vq.j.a(r7)
            r0.f2540d = r5
            java.lang.Object r8 = vq.j.a(r8)
            r0.f2541e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f2542f = r8
            r8 = 0
            r0.f2543g = r8
            r0.f2544h = r8
            r0.f2547l = r3
            java.lang.Object r8 = r4.a(r7, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            dx.i r8 = (dx.i) r8
            goto L90
        L8c:
            boolean r7 = r8 instanceof dx.i.Right
            if (r7 == 0) goto L95
        L90:
            java.lang.Object r7 = r8.a()
            return r7
        L95:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a34.c.l(java.lang.String, tq.e):java.lang.Object");
    }

    private final boolean m() {
        return this.cacheTime + ((long) 3600000) > this.currentTimeProvider.a();
    }

    private final LogListDto n(byte[] logListJson) {
        try {
            return (LogListDto) this.jsonSerializer.a(new String(logListJson, fu.d.UTF_8), q0.n(LogListDto.class));
        } catch (Exception e15) {
            this.remoteLogger.T6("parseLogListJson", e15, px.c.a(this));
            return null;
        }
    }

    private final r<byte[], byte[]> o(InputStream zip) {
        byte[] bArrC = new byte[0];
        byte[] bArrC2 = new byte[0];
        try {
            final ZipInputStream zipInputStream = new ZipInputStream(zip);
            try {
                Iterator it = k.x(k.n(new er.a() { // from class: a34.a
                    @Override // er.a
                    public final Object a() {
                        return c.p(zipInputStream);
                    }
                }), new l() { // from class: a34.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(c.q((ZipEntry) obj));
                    }
                }).iterator();
                while (it.hasNext()) {
                    String name = new File(((ZipEntry) it.next()).getName()).getName();
                    if (fr.t.c(name, "log_list.json")) {
                        bArrC = ar.a.c(new a34.h(zipInputStream, 1048576L));
                    } else if (fr.t.c(name, "log_list.sig")) {
                        bArrC2 = ar.a.c(new a34.h(zipInputStream, 512L));
                    }
                    zipInputStream.closeEntry();
                }
                i0 i0Var = i0.f148189a;
                ar.b.a(zipInputStream, null);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(zipInputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e15) {
            this.remoteLogger.T6("readCTZip", e15, px.c.a(this));
        }
        return y.a(bArrC, bArrC2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZipEntry p(ZipInputStream zipInputStream) {
        return zipInputStream.getNextEntry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(ZipEntry zipEntry) {
        return !zipEntry.isDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(boolean z15, byte[] bArr, tq.e<? super i0> eVar) throws Throwable {
        g gVar;
        c cVar;
        Map<String, CTLogInfoDomain> map;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f2564k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f2564k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objU = gVar.f2562h;
        Object objE = uq.b.e();
        int i16 = gVar.f2564k;
        if (i16 == 0) {
            u.b(objU);
            if (z15) {
                this.cacheTime = this.currentTimeProvider.a();
                LogListDto logListDtoN = n(bArr);
                gVar.f2559e = vq.j.a(bArr);
                gVar.f2560f = vq.j.a(logListDtoN);
                gVar.f2561g = this;
                gVar.f2558d = z15;
                gVar.f2564k = 1;
                objU = t(logListDtoN, gVar);
                if (objU != objE) {
                    cVar = this;
                    map = (Map) objU;
                }
            } else {
                gVar.f2559e = vq.j.a(bArr);
                gVar.f2560f = this;
                gVar.f2558d = z15;
                gVar.f2564k = 2;
                objU = u(this, null, gVar, 1, null);
                if (objU != objE) {
                    cVar = this;
                    map = (Map) objU;
                }
            }
            return objE;
        }
        if (i16 == 1) {
            cVar = (c) gVar.f2561g;
            u.b(objU);
            map = (Map) objU;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) gVar.f2560f;
            u.b(objU);
            map = (Map) objU;
        }
        cVar.logListCache = map;
        this.remoteLogger.F8("Log list cache updated, size: " + this.logListCache.size(), px.d.a.NETWORK);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0174  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:53:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8 A[PHI: r18
      0x01a8: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v2 java.lang.String), (r18v3 java.lang.String) binds: [B:52:0x0197, B:54:0x019d, B:56:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0174 -> B:48:0x0183). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(jz3.LogListDto r20, tq.e<? super java.util.Map<java.lang.String, z24.CTLogInfoDomain>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a34.c.t(jz3.b, tq.e):java.lang.Object");
    }

    static /* synthetic */ Object u(c cVar, LogListDto logListDto, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            logListDto = null;
        }
        return cVar.t(logListDto, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(byte[] bArr, byte[] bArr2, tq.e<? super Boolean> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f2587h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f2587h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objK = iVar.f2585f;
        Object objE = uq.b.e();
        int i16 = iVar.f2587h;
        boolean z15 = true;
        if (i16 == 0) {
            u.b(objK);
            iVar.f2583d = bArr;
            iVar.f2584e = bArr2;
            iVar.f2587h = 1;
            objK = k(iVar);
            if (objK == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr2 = (byte[]) iVar.f2584e;
            bArr = (byte[]) iVar.f2583d;
            u.b(objK);
        }
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        PublicKey publicKey = (PublicKey) objK;
        if (publicKey != null) {
            boolean zB = d0.b(this.signatureVerifier, bArr3, bArr4, publicKey, null, 8, null);
            if (!zB) {
                String strE = iy.a.e(this.base64Coder, bArr4, null, 2, null);
                String strE2 = iy.a.e(this.base64Coder, bArr3, null, 2, null);
                this.remoteLogger.n7("Invalid CT log list provider signature, sig: " + strE + " ,json: " + strE2, px.c.a(this));
            }
            if (!zB) {
            }
            return vq.b.a(z15);
        }
        this.remoteLogger.n7("Missing CT log list provider public key", px.c.a(this));
        z15 = false;
        return vq.b.a(z15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e34.b
    public Object a(byte[] bArr, tq.e<? super CTLogInfoDomain> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f2551g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f2551g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f2549e;
        Object objE = uq.b.e();
        int i16 = eVar2.f2551g;
        if (i16 == 0) {
            u.b(obj);
            if (this.logListCache.isEmpty() || !m()) {
                eVar2.f2548d = bArr;
                eVar2.f2551g = 1;
                if (r(eVar2) == objE) {
                    return objE;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) eVar2.f2548d;
            u.b(obj);
        }
        CTLogInfoDomain cTLogInfoDomain = this.logListCache.get(iy.a.e(this.base64Coder, bArr, null, 2, null));
        px.f fVar = px.f.f163100a;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("logId: ");
        sb5.append(bArr);
        sb5.append("\nurl: ");
        sb5.append(cTLogInfoDomain != null ? cTLogInfoDomain.getUrl() : null);
        sb5.append("\npublicKey: ");
        sb5.append(cTLogInfoDomain != null ? cTLogInfoDomain.getPublicKey() : null);
        sb5.append("\ndsc: ");
        sb5.append(cTLogInfoDomain != null ? cTLogInfoDomain.getDescription() : null);
        fVar.b(sb5.toString(), px.c.a(this));
        return cTLogInfoDomain;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (s(r9, r4, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(tq.e<? super java.util.List<z24.CTLogInfoDomain>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a34.c.f
            if (r0 == 0) goto L13
            r0 = r9
            a34.c$f r0 = (a34.c.f) r0
            int r1 = r0.f2557j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2557j = r1
            goto L18
        L13:
            a34.c$f r0 = new a34.c$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2555g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f2557j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r1 = r0.f2553e
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r0.f2552d
            byte[] r0 = (byte[]) r0
            oq.u.b(r9)
            goto La7
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L40:
            java.lang.Object r2 = r0.f2553e
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.f2552d
            byte[] r4 = (byte[]) r4
            oq.u.b(r9)
            goto L8a
        L4c:
            oq.u.b(r9)
            goto L67
        L50:
            oq.u.b(r9)
            px.f r9 = px.f.f163100a
            java.lang.String r2 = "Refreshing log list cache"
            java.util.List r6 = px.c.a(r8)
            r9.b(r2, r6)
            r0.f2557j = r5
            java.lang.Object r9 = r8.j(r0)
            if (r9 != r1) goto L67
            goto La6
        L67:
            oq.r r9 = (oq.r) r9
            java.lang.Object r2 = r9.a()
            byte[] r2 = (byte[]) r2
            java.lang.Object r9 = r9.b()
            byte[] r9 = (byte[]) r9
            r0.f2552d = r2
            java.lang.Object r5 = vq.j.a(r9)
            r0.f2553e = r5
            r0.f2557j = r4
            java.lang.Object r4 = r8.v(r2, r9, r0)
            if (r4 != r1) goto L86
            goto La6
        L86:
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        L8a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.Object r5 = vq.j.a(r4)
            r0.f2552d = r5
            java.lang.Object r2 = vq.j.a(r2)
            r0.f2553e = r2
            r0.f2554f = r9
            r0.f2557j = r3
            java.lang.Object r9 = r8.s(r9, r4, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            java.util.Map<java.lang.String, z24.a> r9 = r8.logListCache
            java.util.Collection r9 = r9.values()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = pq.v.f1(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a34.c.r(tq.e):java.lang.Object");
    }
}
