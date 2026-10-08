package b74;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0096B¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lb74/l;", "Lb74/k;", "Lv64/d;", "clearContainersUseCase", "Lv64/g;", "clearSharedPreferencesUseCase", "Lv64/e;", "clearDataStorePreferencesUseCase", "Lmz3/h;", "clearTaskDataUC", "La14/c;", "clearWebViewUC", "Lby0/a;", "clearAirQualityCacheUC", "Lz64/f;", "notificationsInteractor", "Lh64/c;", "clearGlobalSearchDatabaseUC", "Ls54/f;", "removeAllLocalNotificationsUseCase", "Lmz3/t;", "removeAllDocumentsDownloadStatusesUC", "Lp10/f;", "databaseProvider", "Lq10/a;", "databaseRegistry", "Lz64/b;", "userCommonInteractor", "Lz64/d;", "userDocumentsInteractor", "Lz64/a;", "userBiometricInteractor", "<init>", "(Lv64/d;Lv64/g;Lv64/e;Lmz3/h;La14/c;Lby0/a;Lz64/f;Lh64/c;Ls54/f;Lmz3/t;Lp10/f;Lq10/a;Lz64/b;Lz64/d;Lz64/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv64/d;", "b", "Lv64/g;", "c", "Lv64/e;", "d", "Lmz3/h;", "e", "La14/c;", "f", "Lby0/a;", "g", "Lz64/f;", "h", "Lh64/c;", "i", "Ls54/f;", "j", "Lmz3/t;", "k", "Lp10/f;", "l", "Lq10/a;", "m", "Lz64/b;", "n", "Lz64/d;", "o", "Lz64/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v64.d clearContainersUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v64.g clearSharedPreferencesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v64.e clearDataStorePreferencesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.h clearTaskDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.c clearWebViewUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final by0.a clearAirQualityCacheUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z64.f notificationsInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h64.c clearGlobalSearchDatabaseUC;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final s54.f removeAllLocalNotificationsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.t removeAllDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p10.f databaseProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z64.b userCommonInteractor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final z64.d userDocumentsInteractor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final z64.a userBiometricInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17154e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17156g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17154e = obj;
            this.f17156g |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(v64.d dVar, v64.g gVar, v64.e eVar, mz3.h hVar, a14.c cVar, by0.a aVar, z64.f fVar, h64.c cVar2, s54.f fVar2, mz3.t tVar, p10.f fVar3, q10.a aVar2, z64.b bVar, z64.d dVar2, z64.a aVar3) {
        this.clearContainersUseCase = dVar;
        this.clearSharedPreferencesUseCase = gVar;
        this.clearDataStorePreferencesUseCase = eVar;
        this.clearTaskDataUC = hVar;
        this.clearWebViewUC = cVar;
        this.clearAirQualityCacheUC = aVar;
        this.notificationsInteractor = fVar;
        this.clearGlobalSearchDatabaseUC = cVar2;
        this.removeAllLocalNotificationsUseCase = fVar2;
        this.removeAllDocumentsDownloadStatusesUC = tVar;
        this.databaseProvider = fVar3;
        this.databaseRegistry = aVar2;
        this.userCommonInteractor = bVar;
        this.userDocumentsInteractor = dVar2;
        this.userBiometricInteractor = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ce A[PHI: r5
      0x00ce: PHI (r5v4 gz.b$a$a) = (r5v1 gz.b$a$a), (r5v6 gz.b$a$a) binds: [B:30:0x00ca, B:24:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1 A[PHI: r5
      0x00e1: PHI (r5v7 gz.b$a$a) = (r5v4 gz.b$a$a), (r5v9 gz.b$a$a) binds: [B:33:0x00dd, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[PHI: r5
      0x00f6: PHI (r5v10 gz.b$a$a) = (r5v7 gz.b$a$a), (r5v12 gz.b$a$a) binds: [B:36:0x00f2, B:22:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x010b A[PHI: r5
      0x010b: PHI (r5v13 gz.b$a$a) = (r5v10 gz.b$a$a), (r5v15 gz.b$a$a) binds: [B:39:0x0107, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0120 A[PHI: r5
      0x0120: PHI (r5v16 gz.b$a$a) = (r5v13 gz.b$a$a), (r5v18 gz.b$a$a) binds: [B:42:0x011c, B:20:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0135 A[PHI: r5
      0x0135: PHI (r5v19 gz.b$a$a) = (r5v16 gz.b$a$a), (r5v21 gz.b$a$a) binds: [B:45:0x0131, B:19:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x014b A[PHI: r5
      0x014b: PHI (r5v22 gz.b$a$a) = (r5v19 gz.b$a$a), (r5v24 gz.b$a$a) binds: [B:48:0x0147, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0161 A[PHI: r5
      0x0161: PHI (r5v25 gz.b$a$a) = (r5v22 gz.b$a$a), (r5v27 gz.b$a$a) binds: [B:51:0x015d, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0174 A[PHI: r5
      0x0174: PHI (r5v28 gz.b$a$a) = (r5v25 gz.b$a$a), (r5v30 gz.b$a$a) binds: [B:54:0x0171, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0189 A[PHI: r5
      0x0189: PHI (r5v31 gz.b$a$a) = (r5v28 gz.b$a$a), (r5v33 gz.b$a$a) binds: [B:57:0x0186, B:15:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6 A[PHI: r5
      0x01a6: PHI (r5v34 gz.b$a$a) = (r5v31 gz.b$a$a), (r5v36 gz.b$a$a) binds: [B:60:0x01a3, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3 A[PHI: r5
      0x01c3: PHI (r5v37 gz.b$a$a) = (r5v34 gz.b$a$a), (r5v34 gz.b$a$a), (r5v42 gz.b$a$a) binds: [B:63:0x01ac, B:65:0x01c0, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        if (r6.c(r2, r0) == r1) goto L69;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r5, tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b74.l.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
