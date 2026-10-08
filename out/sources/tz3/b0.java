package tz3;

import java.util.Iterator;
import lz3.DownloadTaskData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltz3/b0;", "Lmz3/p;", "Lmz3/m;", "getAllDownloadTaskDataUC", "<init>", "(Lmz3/m;)V", "Lmz3/p$a;", "params", "Ldx/i;", "Ldx/b;", "Llz3/i;", "d", "(Lmz3/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/m;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements mz3.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.m getAllDownloadTaskDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192921e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192923g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192921e = obj;
            this.f192923g |= PKIFailureInfo.systemUnavail;
            return b0.this.c(null, this);
        }
    }

    public b0(mz3.m mVar) {
        this.getAllDownloadTaskDataUC = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.p.Params params, tq.e<? super dx.i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        a aVar;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f192923g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f192923g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f192921e;
        Object objE = uq.b.e();
        int i16 = aVar.f192923g;
        if (i16 == 0) {
            oq.u.b(objC);
            mz3.m mVar = this.getAllDownloadTaskDataUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f192920d = params;
            aVar.f192923g = 1;
            objC = mVar.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (mz3.p.Params) aVar.f192920d;
            oq.u.b(objC);
        }
        Iterator it = ((Iterable) objC).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((DownloadTaskData) next).d().containsKey(params.getDocumentType()));
        DownloadTaskData downloadTaskData = (DownloadTaskData) next;
        return downloadTaskData == null ? new dx.i.Left(new dx.b.Generic(new Exception("GetDocumentAsyncDownloadType error, downloadTaskData not exist"))) : new dx.i.Right(downloadTaskData);
    }
}
