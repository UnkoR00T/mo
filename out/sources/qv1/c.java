package qv1;

import dx.i;
import mv1.DynamicMultiDocumentFullData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lqv1/c;", "", "Lqv1/c$a;", "Lmv1/d;", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lnv1/a;", "dynamicMultiDocumentDataSource", "Lmx/c;", "labelProvider", "<init>", "(Lkv1/a;Lnv1/a;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lqv1/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkv1/a;", "b", "Lnv1/a;", "Ldx/b$c;", "c", "Ldx/b$c;", "failedLoadingError", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f169071d = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nv1.a dynamicMultiDocumentDataSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business failedLoadingError;

    /* JADX INFO: renamed from: qv1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqv1/c$a;", "Lgz/b$a;", "Lrq0/b$c;", "dynamicMultiDocumentType", "<init>", "(Lrq0/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$c;", "()Lrq0/b$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.c dynamicMultiDocumentType;

        public Params(rq0.b.c cVar) {
            this.dynamicMultiDocumentType = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.c getDynamicMultiDocumentType() {
            return this.dynamicMultiDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.dynamicMultiDocumentType == ((Params) other).dynamicMultiDocumentType;
        }

        public int hashCode() {
            return this.dynamicMultiDocumentType.hashCode();
        }

        public String toString() {
            return "Params(dynamicMultiDocumentType=" + this.dynamicMultiDocumentType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f169076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f169077e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f169079g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f169077e = obj;
            this.f169079g |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    public c(kv1.a aVar, nv1.a aVar2, mx.c cVar) {
        this.dynamicDocumentContainersInteractor = aVar;
        this.dynamicMultiDocumentDataSource = aVar2;
        this.failedLoadingError = new dx.b.Business(lv1.b.FAILED_LOADING, null, cVar.c(dv1.a.f44638h0), cVar.c(dv1.a.f44636g0), null, cVar.c(dv1.a.J), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i<? extends dx.b, DynamicMultiDocumentFullData>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f169079g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f169079g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objL = bVar.f169077e;
        Object objE = uq.b.e();
        int i16 = bVar.f169079g;
        if (i16 == 0) {
            u.b(objL);
            kv1.a aVar = this.dynamicDocumentContainersInteractor;
            rq0.b.c dynamicMultiDocumentType = params.getDynamicMultiDocumentType();
            bVar.f169076d = j.a(params);
            bVar.f169079g = 1;
            objL = aVar.l(dynamicMultiDocumentType, bVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objL);
        }
        i iVar = (i) objL;
        if (iVar instanceof i.Left) {
            Object obj = (dx.b) ((i.Left) iVar).b();
            if (obj instanceof dx.b.Parsing) {
                obj = this.failedLoadingError;
            }
            return new i.Left(obj);
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) ((i.Right) iVar).b();
        this.dynamicMultiDocumentDataSource.c(dynamicMultiDocumentFullData);
        return new i.Right(dynamicMultiDocumentFullData);
    }
}
