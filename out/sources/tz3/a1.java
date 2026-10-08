package tz3;

import java.util.Iterator;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltz3/a1;", "Lmz3/y;", "Lsz3/a;", "downloadDocumentRepository", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "<init>", "(Lsz3/a;Lpl/gov/coi/mobywatel/technical/async/data/storage/a;)V", "Lmz3/y$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lmz3/y$a;Ltq/e;)Ljava/lang/Object;", "a", "Lsz3/a;", "b", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a1 implements mz3.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192906g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f192908j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192906g = obj;
            this.f192908j |= PKIFailureInfo.systemUnavail;
            return a1.this.c(null, this);
        }
    }

    public a1(sz3.a aVar, pl.gov.coi.mobywatel.technical.async.data.storage.a aVar2) {
        this.downloadDocumentRepository = aVar;
        this.asyncDownloadTasksDataSource = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.y.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        Object next;
        String mainDocumentId;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f192908j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f192908j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f192906g;
        Object objE = uq.b.e();
        int i16 = aVar.f192908j;
        if (i16 == 0) {
            oq.u.b(objA);
            pl.gov.coi.mobywatel.technical.async.data.storage.a aVar2 = this.asyncDownloadTasksDataSource;
            aVar.f192903d = params;
            aVar.f192908j = 1;
            objA = aVar2.a(aVar);
            if (objA != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
            return objA;
        }
        params = (mz3.y.Params) aVar.f192903d;
        oq.u.b(objA);
        Iterator it = ((Iterable) objA).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DownloadTaskData downloadTaskData = (DownloadTaskData) next;
            if (!downloadTaskData.getTaskCompleted() && downloadTaskData.d().containsKey(params.getDocumentType())) {
                break;
            }
        }
        DownloadTaskData downloadTaskData2 = (DownloadTaskData) next;
        if (downloadTaskData2 == null) {
            return new dx.i.Left(new dx.b.Generic(new Exception("TerminateDocumentDownload error, taskData with documentType not exist")));
        }
        TaskIncludedDocumentData taskIncludedDocumentData = downloadTaskData2.d().get(params.getDocumentType());
        if (taskIncludedDocumentData == null || (mainDocumentId = taskIncludedDocumentData.getMainDocumentId()) == null) {
            return new dx.i.Left(new dx.b.Generic(new Exception("TerminateDocumentDownload error, taskData with documentType not exist")));
        }
        sz3.a aVar3 = this.downloadDocumentRepository;
        String taskId = downloadTaskData2.getTaskId();
        aVar.f192903d = vq.j.a(params);
        aVar.f192904e = vq.j.a(downloadTaskData2);
        aVar.f192905f = vq.j.a(mainDocumentId);
        aVar.f192908j = 2;
        Object objB = aVar3.b(taskId, mainDocumentId, aVar);
        return objB == objE ? objE : objB;
    }
}
