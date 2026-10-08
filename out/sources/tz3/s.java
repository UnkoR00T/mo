package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Ltz3/s;", "Lmz3/k;", "Lmz3/a;", "addSingleDocumentDownloadStatusUC", "Lmz3/x;", "startManageAsyncDownloadWorkerUseCase", "Luh0/o;", "refreshMobileIdCardScopesAsyncUC", "Luh0/n;", "refreshDiiaCardScopesAsyncUC", "<init>", "(Lmz3/a;Lmz3/x;Luh0/o;Luh0/n;)V", "Lmz3/k$a;", "params", "Ldx/i;", "Ldx/b;", "Lmz3/k$b;", "d", "(Lmz3/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/a;", "b", "Lmz3/x;", "c", "Luh0/o;", "Luh0/n;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements mz3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.a addSingleDocumentDownloadStatusUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.x startManageAsyncDownloadWorkerUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uh0.o refreshMobileIdCardScopesAsyncUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uh0.n refreshDiiaCardScopesAsyncUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f193271h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f193272j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f193274l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193272j = obj;
            this.f193274l |= PKIFailureInfo.systemUnavail;
            return s.this.c(null, this);
        }
    }

    public s(mz3.a aVar, mz3.x xVar, uh0.o oVar, uh0.n nVar) {
        this.addSingleDocumentDownloadStatusUC = aVar;
        this.startManageAsyncDownloadWorkerUseCase = xVar;
        this.refreshMobileIdCardScopesAsyncUC = oVar;
        this.refreshDiiaCardScopesAsyncUC = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r2 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r2 == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        if (r2.c(r14, r3) == r4) goto L45;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(mz3.k.Params r21, tq.e<? super dx.i<? extends dx.b, mz3.k.Result>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.s.c(mz3.k$a, tq.e):java.lang.Object");
    }
}
