package a44;

import java.util.Collection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La44/z;", "Lq34/z;", "Lu34/b;", "documentsSummaryLocalRepository", "Lpx/d;", "remoteLogger", "<init>", "(Lu34/b;Lpx/d;)V", "Lq34/z$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lq34/z$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu34/b;", "b", "Lpx/d;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements q34.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3432e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3434g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3432e = obj;
            this.f3434g |= PKIFailureInfo.systemUnavail;
            return z.this.c(null, this);
        }
    }

    public z(u34.b bVar, px.d dVar) {
        this.documentsSummaryLocalRepository = bVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.z.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3434g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3434g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f3432e;
        Object objE = uq.b.e();
        int i16 = aVar.f3434g;
        if (i16 == 0) {
            oq.u.b(objD);
            u34.b bVar = this.documentsSummaryLocalRepository;
            rq0.b documentType = params.getDocumentType();
            aVar.f3431d = params;
            aVar.f3434g = 1;
            objD = bVar.d(documentType, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (q34.z.Params) aVar.f3431d;
            oq.u.b(objD);
        }
        if (((Collection) objD).isEmpty()) {
            return new dx.i.Left(new dx.b.Generic(new Exception("ForceFetchDocumentSummary, document is not available")));
        }
        this.remoteLogger.u6("ForceFetchDocumentSummaryData fetched " + params.getDocumentType(), px.c.a(this));
        return new dx.i.Right(oq.i0.f148189a);
    }
}
