package tz3;

import lz3.DownloadTaskData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltz3/z0;", "Lmz3/x;", "Ltz3/s0;", "saveAsyncDownloadTaskIfNotExistUC", "Lez/a;", "currentTimeProvider", "Luz3/a;", "asyncDownloadDocumentsManager", "<init>", "(Ltz3/s0;Lez/a;Luz3/a;)V", "Lmz3/x$a;", "params", "Loq/i0;", "d", "(Lmz3/x$a;Ltq/e;)Ljava/lang/Object;", "a", "Ltz3/s0;", "b", "Lez/a;", "c", "Luz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0 implements mz3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 saveAsyncDownloadTaskIfNotExistUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uz3.a asyncDownloadDocumentsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193319e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193321g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193319e = obj;
            this.f193321g |= PKIFailureInfo.systemUnavail;
            return z0.this.c(null, this);
        }
    }

    public z0(s0 s0Var, ez.a aVar, uz3.a aVar2) {
        this.saveAsyncDownloadTaskIfNotExistUC = s0Var;
        this.currentTimeProvider = aVar;
        this.asyncDownloadDocumentsManager = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.x.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        mz3.x.Params params2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193321g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193321g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f193319e;
        Object objE = uq.b.e();
        int i16 = aVar.f193321g;
        if (i16 == 0) {
            oq.u.b(obj);
            s0 s0Var = this.saveAsyncDownloadTaskIfNotExistUC;
            s0.Params params3 = new s0.Params(new DownloadTaskData(params.getTaskId(), this.currentTimeProvider.a(), params.getDocumentDownloadMethod(), false, params.getMainDocumentAuthToken(), params.a(), 8, null));
            aVar.f193318d = params;
            aVar.f193321g = 1;
            if (s0Var.c(params3, aVar) == objE) {
                return objE;
            }
            params2 = params;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params2 = (mz3.x.Params) aVar.f193318d;
            oq.u.b(obj);
        }
        this.asyncDownloadDocumentsManager.c(params2.getTaskId());
        return oq.i0.f148189a;
    }
}
