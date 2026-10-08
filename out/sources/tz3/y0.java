package tz3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import lz3.DownloadTaskData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltz3/y0;", "Lmz3/w;", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lmz3/p;", "getDocumentAsyncDownloadTaskDataUC", "<init>", "(Lmz3/q;Lmz3/p;)V", "Lmz3/w$a;", "params", "Lmz3/w$b;", "d", "(Lmz3/w$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/q;", "b", "Lmz3/p;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 implements mz3.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.p getDocumentAsyncDownloadTaskDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193307a;

        static {
            int[] iArr = new int[lz3.h.values().length];
            try {
                iArr[lz3.h.CREATING_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.h.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f193307a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f193311g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193313j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193311g = obj;
            this.f193313j |= PKIFailureInfo.systemUnavail;
            return y0.this.c(null, this);
        }
    }

    public y0(mz3.q qVar, mz3.p pVar) {
        this.getDocumentDownloadStatusUseCase = qVar;
        this.getDocumentAsyncDownloadTaskDataUC = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.w.Params params, tq.e<? super mz3.w.b> eVar) throws Throwable {
        b bVar;
        DocumentDownloadStatus documentDownloadStatus;
        DownloadTaskData downloadTaskData;
        List<DocumentDownloadSingleStatus> listB;
        List<DocumentDownloadSingleStatus> list;
        Iterator<T> it;
        int i15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i16 = bVar.f193313j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f193313j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f193311g;
        Object objE = uq.b.e();
        int i17 = bVar.f193313j;
        if (i17 == 0) {
            oq.u.b(objC);
            mz3.q qVar = this.getDocumentDownloadStatusUseCase;
            mz3.q.Params params2 = new mz3.q.Params(params.getDocumentType());
            bVar.f193308d = params;
            bVar.f193313j = 1;
            objC = qVar.c(params2, bVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            params = (mz3.w.Params) bVar.f193308d;
            oq.u.b(objC);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentDownloadStatus = (DocumentDownloadStatus) bVar.f193309e;
            oq.u.b(objC);
        }
        downloadTaskData = (DownloadTaskData) ((dx.i) objC).a();
        if (downloadTaskData == null) {
            return mz3.w.b.C3231b.f129717a;
        }
        if (documentDownloadStatus != null && (listB = documentDownloadStatus.b()) != null) {
            list = listB;
            if ((list instanceof Collection) || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    i15 = a.f193307a[((DocumentDownloadSingleStatus) it.next()).getStatus().ordinal()];
                    if (i15 != 1 || i15 == 2 || i15 == 3) {
                        return new mz3.w.b.NotReady(downloadTaskData.getDocumentDownloadMethod());
                    }
                }
            }
        }
        return mz3.w.b.C3231b.f129717a;
        DocumentDownloadStatus documentDownloadStatus2 = (DocumentDownloadStatus) objC;
        mz3.p pVar = this.getDocumentAsyncDownloadTaskDataUC;
        mz3.p.Params params3 = new mz3.p.Params(params.getDocumentType());
        bVar.f193308d = vq.j.a(params);
        bVar.f193309e = documentDownloadStatus2;
        bVar.f193310f = 0;
        bVar.f193313j = 2;
        Object objC2 = pVar.c(params3, bVar);
        if (objC2 != objE) {
            objC = objC2;
            documentDownloadStatus = documentDownloadStatus2;
            downloadTaskData = (DownloadTaskData) ((dx.i) objC).a();
            if (downloadTaskData == null) {
                return mz3.w.b.C3231b.f129717a;
            }
            if (documentDownloadStatus != null) {
                list = listB;
                if (list instanceof Collection) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        i15 = a.f193307a[((DocumentDownloadSingleStatus) it.next()).getStatus().ordinal()];
                        if (i15 != 1) {
                        }
                        return new mz3.w.b.NotReady(downloadTaskData.getDocumentDownloadMethod());
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    i15 = a.f193307a[((DocumentDownloadSingleStatus) it.next()).getStatus().ordinal()];
                    if (i15 != 1) {
                    }
                    return new mz3.w.b.NotReady(downloadTaskData.getDocumentDownloadMethod());
                }
            }
            return mz3.w.b.C3231b.f129717a;
        }
        return objE;
    }
}
