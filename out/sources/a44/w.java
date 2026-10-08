package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0018\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b-\u0010,J\u0018\u0010.\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b.\u0010,J\u0018\u0010/\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b/\u0010,J\u0018\u00100\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b0\u0010,J\u0018\u00103\u001a\u00020*2\u0006\u00102\u001a\u000201H\u0096B¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010FR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"La44/w;", "Lq34/w;", "Lg34/c;", "identityManager", "Lv64/f;", "clearSessionDataUC", "Lq34/x;", "deleteDocumentsInContainerUseCase", "Lkr0/e;", "bENotifyAboutDocumentRemovalUC", "Lq34/k0;", "getDocumentsIdsUseCase", "Lh64/u;", "refreshServicesUseCase", "Lq34/e0;", "getCertificateSerialNumberUseCase", "Lwz3/i;", "revokeUserCertificateWithChallengeUC", "Lx34/b;", "notificationsInteractor", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Lq34/k1;", "isDocumentAddedUseCase", "Lpx/d;", "remoteLogger", "Lby0/a;", "clearAirQualityCacheUC", "Lu34/b;", "documentsSummaryLocalRepository", "Lq34/v0;", "getLinkedDocumentsUseCase", "Lmz3/h;", "clearTaskDataUC", "Lmz3/t;", "removeAllDocumentsDownloadStatusesUC", "Lx34/a;", "documentsInteractor", "<init>", "(Lg34/c;Lv64/f;Lq34/x;Lkr0/e;Lq34/k0;Lh64/u;Lq34/e0;Lwz3/i;Lx34/b;Ls54/g;Lq34/k1;Lpx/d;Lby0/a;Lu34/b;Lq34/v0;Lmz3/h;Lmz3/t;Lx34/a;)V", "Lrq0/b;", "documentType", "Loq/i0;", "k", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "l", "h", "i", "g", "Lq34/w$a;", "params", "j", "(Lq34/w$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/c;", "b", "Lv64/f;", "c", "Lq34/x;", "d", "Lkr0/e;", "e", "Lq34/k0;", "f", "Lh64/u;", "Lq34/e0;", "Lwz3/i;", "Lx34/b;", "Ls54/g;", "Lq34/k1;", "Lpx/d;", "m", "Lby0/a;", "n", "Lu34/b;", "o", "Lq34/v0;", "p", "Lmz3/h;", "q", "Lmz3/t;", "r", "Lx34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements q34.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v64.f clearSessionDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q34.x deleteDocumentsInContainerUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kr0.e bENotifyAboutDocumentRemovalUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q34.k0 getDocumentsIdsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h64.u refreshServicesUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q34.e0 getCertificateSerialNumberUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wz3.i revokeUserCertificateWithChallengeUC;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x34.b notificationsInteractor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s54.g removeNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final q34.k1 isDocumentAddedUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final by0.a clearAirQualityCacheUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final q34.v0 getLinkedDocumentsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mz3.h clearTaskDataUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mz3.t removeAllDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final x34.a documentsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3276e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3278g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3276e = obj;
            this.f3278g |= PKIFailureInfo.systemUnavail;
            return w.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3283h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3284j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3285k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f3286l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3288n;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3286l = obj;
            this.f3288n |= PKIFailureInfo.systemUnavail;
            return w.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3293h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f3295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3298n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f3299p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3301r;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3299p = obj;
            this.f3301r |= PKIFailureInfo.systemUnavail;
            return w.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3306h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3307j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3308k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f3309l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3311n;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3309l = obj;
            this.f3311n |= PKIFailureInfo.systemUnavail;
            return w.this.l(null, this);
        }
    }

    public w(g34.c cVar, v64.f fVar, q34.x xVar, kr0.e eVar, q34.k0 k0Var, h64.u uVar, q34.e0 e0Var, wz3.i iVar, x34.b bVar, s54.g gVar, q34.k1 k1Var, px.d dVar, by0.a aVar, u34.b bVar2, q34.v0 v0Var, mz3.h hVar, mz3.t tVar, x34.a aVar2) {
        this.identityManager = cVar;
        this.clearSessionDataUC = fVar;
        this.deleteDocumentsInContainerUseCase = xVar;
        this.bENotifyAboutDocumentRemovalUC = eVar;
        this.getDocumentsIdsUseCase = k0Var;
        this.refreshServicesUseCase = uVar;
        this.getCertificateSerialNumberUseCase = e0Var;
        this.revokeUserCertificateWithChallengeUC = iVar;
        this.notificationsInteractor = bVar;
        this.removeNotificationsForDocumentUseCase = gVar;
        this.isDocumentAddedUseCase = k1Var;
        this.remoteLogger = dVar;
        this.clearAirQualityCacheUC = aVar;
        this.documentsSummaryLocalRepository = bVar2;
        this.getLinkedDocumentsUseCase = v0Var;
        this.clearTaskDataUC = hVar;
        this.removeAllDocumentsDownloadStatusesUC = tVar;
        this.documentsInteractor = aVar2;
    }

    private final Object g(rq0.b bVar, tq.e<? super oq.i0> eVar) {
        Object objA = this.documentsInteractor.a(bVar.getReferenceName(), eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[PHI: r7
      0x00b5: PHI (r7v7 rq0.b) = (r7v4 rq0.b), (r7v9 rq0.b) binds: [B:27:0x00b1, B:19:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8 A[PHI: r7
      0x00c8: PHI (r7v10 rq0.b) = (r7v7 rq0.b), (r7v12 rq0.b) binds: [B:30:0x00c4, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc A[PHI: r7
      0x00dc: PHI (r7v13 rq0.b) = (r7v10 rq0.b), (r7v15 rq0.b) binds: [B:33:0x00d9, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee A[PHI: r7
      0x00ee: PHI (r7v16 rq0.b) = (r7v13 rq0.b), (r7v18 rq0.b) binds: [B:36:0x00eb, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0102 A[PHI: r7
      0x0102: PHI (r7v19 rq0.b) = (r7v16 rq0.b), (r7v21 rq0.b) binds: [B:39:0x00ff, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0119 A[PHI: r7
      0x0119: PHI (r7v22 rq0.b) = (r7v19 rq0.b), (r7v27 rq0.b) binds: [B:42:0x0116, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
    
        if (r8.c(r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0146, code lost:
    
        if (r8.c(r2, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(rq0.b r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w.h(rq0.b, tq.e):java.lang.Object");
    }

    private final Object i(rq0.b bVar, tq.e<? super oq.i0> eVar) {
        Object objC = this.removeNotificationsForDocumentUseCase.c(new s54.g.Params(new s54.g.b.ByDocumentType(bVar)), eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if (r14.c(r15, r2) == r3) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0107 -> B:39:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(rq0.b r17, tq.e<? super oq.i0> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w.k(rq0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r4.c(r5, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(rq0.b r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a44.w.d
            if (r0 == 0) goto L13
            r0 = r9
            a44.w$d r0 = (a44.w.d) r0
            int r1 = r0.f3311n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3311n = r1
            goto L18
        L13:
            a44.w$d r0 = new a44.w$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3309l
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f3311n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r8 = r0.f3305g
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f3304f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f3303e
            dx.i r8 = (dx.i) r8
            java.lang.Object r8 = r0.f3302d
            rq0.b r8 = (rq0.b) r8
            oq.u.b(r9)
            goto La5
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            java.lang.Object r8 = r0.f3302d
            rq0.b r8 = (rq0.b) r8
            oq.u.b(r9)
            goto L65
        L4c:
            oq.u.b(r9)
            q34.e0 r9 = r7.getCertificateSerialNumberUseCase
            q34.e0$a r2 = new q34.e0$a
            r2.<init>(r8)
            java.lang.Object r5 = vq.j.a(r8)
            r0.f3302d = r5
            r0.f3311n = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L65
            goto La4
        L65:
            dx.i r9 = (dx.i) r9
            boolean r2 = r9 instanceof dx.i.Right
            if (r2 == 0) goto La5
            r2 = r9
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto La5
            wz3.i r4 = r7.revokeUserCertificateWithChallengeUC
            wz3.i$a r5 = new wz3.i$a
            iy.b0 r6 = iy.c0.g(r2)
            r5.<init>(r6)
            java.lang.Object r8 = vq.j.a(r8)
            r0.f3302d = r8
            r0.f3303e = r9
            java.lang.Object r8 = vq.j.a(r2)
            r0.f3304f = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f3305g = r8
            r8 = 0
            r0.f3306h = r8
            r0.f3307j = r8
            r0.f3308k = r8
            r0.f3311n = r3
            java.lang.Object r8 = r4.c(r5, r0)
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w.l(rq0.b, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0101  */
    /* JADX WARN: Code duplicated, block: B:36:0x0127  */
    /* JADX WARN: Code duplicated, block: B:41:0x0160  */
    /* JADX WARN: Code duplicated, block: B:44:0x0178 A[PHI: r12
      0x0178: PHI (r12v14 q34.w$a) = (r12v11 q34.w$a), (r12v16 q34.w$a) binds: [B:42:0x0175, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0188 A[PHI: r12
      0x0188: PHI (r12v17 q34.w$a) = (r12v14 q34.w$a), (r12v19 q34.w$a) binds: [B:45:0x0185, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0198  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8 A[PHI: r12
      0x01a8: PHI (r12v20 q34.w$a) = (r12v1 q34.w$a), (r12v11 q34.w$a), (r12v17 q34.w$a), (r12v22 q34.w$a) binds: [B:51:0x01a5, B:40:0x015e, B:48:0x0195, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c1 A[PHI: r12
      0x01c1: PHI (r12v23 q34.w$a) = (r12v20 q34.w$a), (r12v25 q34.w$a) binds: [B:54:0x01be, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d2 A[PHI: r12
      0x01d2: PHI (r12v26 q34.w$a) = (r12v23 q34.w$a), (r12v28 q34.w$a) binds: [B:57:0x01cf, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:34:0x0121->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
    
        if (r13 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e0, code lost:
    
        if (g(r13, r0) == r1) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00d3, please report this as an issue */
    @Override // gz.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(q34.w.Params r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w.c(q34.w$a, tq.e):java.lang.Object");
    }
}
