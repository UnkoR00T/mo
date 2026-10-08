package o14;

import a14.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lo14/l;", "La14/s;", "Lv64/k;", "consumeLoggedOutUseCase", "Lf93/a;", "getLastSecurityThreatDetectionStateUseCase", "Lf93/b;", "navigateToSecurityThreatsUseCase", "Lv64/o;", "isUserLoggedInUseCase", "Lv64/c;", "checkIsActivatedUseCase", "Lz92/d;", "removeLocalAppActivityLogEntriesUC", "Lgx/d;", "globalEventManager", "Lf93/c;", "updateSecurityProviderUseCase", "<init>", "(Lv64/k;Lf93/a;Lf93/b;Lv64/o;Lv64/c;Lz92/d;Lgx/d;Lf93/c;)V", "La14/s$a;", "params", "Loq/i0;", "d", "(La14/s$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv64/k;", "b", "Lf93/a;", "c", "Lf93/b;", "Lv64/o;", "e", "Lv64/c;", "f", "Lz92/d;", "g", "Lgx/d;", "h", "Lf93/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v64.k consumeLoggedOutUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f93.a getLastSecurityThreatDetectionStateUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f93.b navigateToSecurityThreatsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v64.o isUserLoggedInUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v64.c checkIsActivatedUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z92.d removeLocalAppActivityLogEntriesUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f93.c updateSecurityProviderUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f140643e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f140645g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140643e = obj;
            this.f140645g |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(v64.k kVar, f93.a aVar, f93.b bVar, v64.o oVar, v64.c cVar, z92.d dVar, gx.d dVar2, f93.c cVar2) {
        this.consumeLoggedOutUseCase = kVar;
        this.getLastSecurityThreatDetectionStateUseCase = aVar;
        this.navigateToSecurityThreatsUseCase = bVar;
        this.isUserLoggedInUseCase = oVar;
        this.checkIsActivatedUseCase = cVar;
        this.removeLocalAppActivityLogEntriesUC = dVar;
        this.globalEventManager = dVar2;
        this.updateSecurityProviderUseCase = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r9 == r1) goto L26;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a14.s.Params r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o14.l.c(a14.s$a, tq.e):java.lang.Object");
    }
}
