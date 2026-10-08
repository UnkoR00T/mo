package pv1;

import mv1.DynamicDocumentData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpv1/e;", "", "Lpv1/e$a;", "Lmv1/c;", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lkv1/a;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lpv1/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkv1/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "failedLoadingError", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f162879c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business failedLoadingError;

    /* JADX INFO: renamed from: pv1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpv1/e$a;", "Lgz/b$a;", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lrq0/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$b;", "()Lrq0/b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        public Params(rq0.b.EnumC4479b enumC4479b) {
            this.dynamicDocumentType = enumC4479b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.dynamicDocumentType == ((Params) other).dynamicDocumentType;
        }

        public int hashCode() {
            return this.dynamicDocumentType.hashCode();
        }

        public String toString() {
            return "Params(dynamicDocumentType=" + this.dynamicDocumentType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162884e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162886g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162884e = obj;
            this.f162886g |= PKIFailureInfo.systemUnavail;
            return e.this.d(null, this);
        }
    }

    public e(kv1.a aVar, mx.c cVar) {
        this.dynamicDocumentContainersInteractor = aVar;
        this.failedLoadingError = new dx.b.Business(lv1.b.FAILED_LOADING, null, cVar.c(dv1.a.f44638h0), cVar.c(dv1.a.f44636g0), null, cVar.c(dv1.a.J), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f162886g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f162886g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objI = bVar.f162884e;
        Object objE = uq.b.e();
        int i16 = bVar.f162886g;
        if (i16 == 0) {
            u.b(objI);
            kv1.a aVar = this.dynamicDocumentContainersInteractor;
            rq0.b.EnumC4479b dynamicDocumentType = params.getDynamicDocumentType();
            bVar.f162883d = j.a(params);
            bVar.f162886g = 1;
            objI = aVar.i(dynamicDocumentType, bVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objI);
        }
        dx.i iVar = (dx.i) objI;
        if (!(iVar instanceof dx.i.Left)) {
            if (iVar instanceof dx.i.Right) {
                return iVar;
            }
            throw new p();
        }
        Object obj = (dx.b) ((dx.i.Left) iVar).b();
        if (obj instanceof dx.b.Parsing) {
            obj = this.failedLoadingError;
        }
        return new dx.i.Left(obj);
    }
}
