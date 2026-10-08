package tz3;

import java.util.Map;
import lz3.AsyncErrorResponse;
import lz3.DefaultAsyncError;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltz3/a0;", "Lmz3/o;", "Lmz3/p;", "getDocumentAsyncDownloadTaskDataUC", "Ltz3/y;", "getDefaultAsyncDownloadErrorUC", "Lmx/c;", "labelProvider", "<init>", "(Lmz3/p;Ltz3/y;Lmx/c;)V", "Lmz3/o$a;", "params", "Ldx/b$c;", "d", "(Lmz3/o$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/p;", "b", "Ltz3/y;", "c", "Lmx/c;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements mz3.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.p getDocumentAsyncDownloadTaskDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y getDefaultAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192898f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192900h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192898f = obj;
            this.f192900h |= PKIFailureInfo.systemUnavail;
            return a0.this.c(null, this);
        }
    }

    public a0(mz3.p pVar, y yVar, mx.c cVar) {
        this.getDocumentAsyncDownloadTaskDataUC = pVar;
        this.getDefaultAsyncDownloadErrorUC = yVar;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.o.Params params, tq.e<? super dx.b.Business> eVar) throws Throwable {
        a aVar;
        AsyncErrorResponse asyncErrorResponse;
        Map<rq0.b, TaskIncludedDocumentData> mapD;
        TaskIncludedDocumentData taskIncludedDocumentData;
        DefaultAsyncError defaultAsyncError;
        Label title;
        Label labelC;
        String message;
        String title2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f192900h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f192900h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f192898f;
        Object objE = uq.b.e();
        int i16 = aVar.f192900h;
        if (i16 == 0) {
            oq.u.b(objC);
            mz3.p pVar = this.getDocumentAsyncDownloadTaskDataUC;
            mz3.p.Params params2 = new mz3.p.Params(params.getDocumentType());
            aVar.f192896d = params;
            aVar.f192900h = 1;
            objC = pVar.c(params2, aVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            params = (mz3.o.Params) aVar.f192896d;
            oq.u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            asyncErrorResponse = (AsyncErrorResponse) aVar.f192897e;
            oq.u.b(objC);
        }
        defaultAsyncError = (DefaultAsyncError) objC;
        if (asyncErrorResponse != null || (title2 = asyncErrorResponse.getTitle()) == null || (title = mx.b.b(title2, "savedAsyncErrorTitle")) == null) {
            title = defaultAsyncError.getTitle();
        }
        Label label = title;
        if (asyncErrorResponse != null || (message = asyncErrorResponse.getMessage()) == null || (labelC = mx.b.b(message, "savedAsyncErrorMessage")) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new dx.b.Business(null, null, label, labelC, null, this.labelProvider.c(kz3.a.f113707c), this.labelProvider.c(kz3.a.f113705a), 19, null);
        DownloadTaskData downloadTaskData = (DownloadTaskData) ((dx.i) objC).a();
        AsyncErrorResponse asyncErrorResponse2 = (downloadTaskData == null || (mapD = downloadTaskData.d()) == null || (taskIncludedDocumentData = mapD.get(params.getDocumentType())) == null) ? null : taskIncludedDocumentData.getAsyncErrorResponse();
        y yVar = this.getDefaultAsyncDownloadErrorUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        aVar.f192896d = vq.j.a(params);
        aVar.f192897e = asyncErrorResponse2;
        aVar.f192900h = 2;
        Object objC2 = yVar.c(c1792a, aVar);
        if (objC2 != objE) {
            AsyncErrorResponse asyncErrorResponse3 = asyncErrorResponse2;
            objC = objC2;
            asyncErrorResponse = asyncErrorResponse3;
            defaultAsyncError = (DefaultAsyncError) objC;
            if (asyncErrorResponse != null) {
                title = defaultAsyncError.getTitle();
            } else {
                title = defaultAsyncError.getTitle();
            }
            Label label2 = title;
            if (asyncErrorResponse != null) {
                labelC = Label.INSTANCE.c();
            } else {
                labelC = Label.INSTANCE.c();
            }
            return new dx.b.Business(null, null, label2, labelC, null, this.labelProvider.c(kz3.a.f113707c), this.labelProvider.c(kz3.a.f113705a), 19, null);
        }
        return objE;
    }
}
