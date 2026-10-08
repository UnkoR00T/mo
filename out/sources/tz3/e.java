package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltz3/e;", "Lmz3/e;", "Ltz3/h0;", "interruptDocumentsAsyncUseCase", "Luz3/a;", "asyncDownloadDocumentsManager", "<init>", "(Ltz3/h0;Luz3/a;)V", "Lmz3/e$a;", "params", "Loq/i0;", "d", "(Lmz3/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Ltz3/h0;", "b", "Luz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements mz3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 interruptDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uz3.a asyncDownloadDocumentsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193046e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193048g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193046e = obj;
            this.f193048g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(h0 h0Var, uz3.a aVar) {
        this.interruptDocumentsAsyncUseCase = h0Var;
        this.asyncDownloadDocumentsManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.e.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193048g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193048g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f193046e;
        Object objE = uq.b.e();
        int i16 = aVar.f193048g;
        if (i16 == 0) {
            oq.u.b(obj);
            h0 h0Var = this.interruptDocumentsAsyncUseCase;
            h0.Params params2 = new h0.Params(params.getTaskId());
            aVar.f193045d = params;
            aVar.f193048g = 1;
            if (h0Var.c(params2, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (mz3.e.Params) aVar.f193045d;
            oq.u.b(obj);
        }
        this.asyncDownloadDocumentsManager.a(params.getTaskId());
        return oq.i0.f148189a;
    }
}
