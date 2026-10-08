package dx0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ldx0/l;", "Ldx0/k;", "Lmz3/m;", "getAllDownloadTaskDataUC", "<init>", "(Lmz3/m;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Llz3/i;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmz3/m;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.m getAllDownloadTaskDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45233e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45235g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45233e = obj;
            this.f45235g |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(mz3.m mVar) {
        this.getAllDownloadTaskDataUC = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        a aVar;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f45235g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45235g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f45233e;
        Object objE = uq.b.e();
        int i16 = aVar.f45235g;
        if (i16 == 0) {
            u.b(objC);
            mz3.m mVar = this.getAllDownloadTaskDataUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f45232d = vq.j.a(c1792a);
            aVar.f45235g = 1;
            objC = mVar.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        Iterator it = ((Iterable) objC).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DownloadTaskData downloadTaskData = (DownloadTaskData) next;
            if (!downloadTaskData.getTaskCompleted()) {
                Map<rq0.b, TaskIncludedDocumentData> mapD = downloadTaskData.d();
                if (mapD.isEmpty()) {
                    continue;
                } else {
                    Iterator<Map.Entry<rq0.b, TaskIncludedDocumentData>> it4 = mapD.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (it4.next().getKey().e()) {
                            if (downloadTaskData.getDocumentDownloadMethod() != lz3.d.FIRST_DOWNLOAD) {
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
        DownloadTaskData downloadTaskData2 = (DownloadTaskData) next;
        return downloadTaskData2 != null ? new dx.i.Right(downloadTaskData2) : new dx.i.Left(new dx.b.Generic(new NoSuchElementException("There is no matching download task")));
    }
}
