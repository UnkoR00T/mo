package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/q0;", "Lmz3/u;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;)V", "Lmz3/u$a;", "params", "Loq/i0;", "d", "(Lmz3/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements mz3.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193234e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193236g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193234e = obj;
            this.f193236g |= PKIFailureInfo.systemUnavail;
            return q0.this.c(null, this);
        }
    }

    public q0(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar) {
        this.asyncDownloadTasksDataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.u.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193236g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193236g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f193234e;
        Object objE = uq.b.e();
        int i16 = aVar.f193236g;
        if (i16 == 0) {
            oq.u.b(obj);
            pl.gov.coi.mobywatel.technical.async.data.storage.a aVar2 = this.asyncDownloadTasksDataSource;
            String taskId = params.getTaskId();
            aVar.f193233d = params;
            aVar.f193236g = 1;
            if (aVar2.g(taskId, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (mz3.u.Params) aVar.f193233d;
            oq.u.b(obj);
        }
        oq.i0 i0Var = oq.i0.f148189a;
        px.f.f163100a.g(params.getTaskId() + " taskData removed", px.c.a(this));
        return oq.i0.f148189a;
    }
}
