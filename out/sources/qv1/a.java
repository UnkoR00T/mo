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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqv1/a;", "", "Lqv1/a$a;", "Lmv1/d;", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lqv1/c;", "getDynamicMultiDocumentDisplayDataUC", "<init>", "(Lkv1/a;Lqv1/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lqv1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkv1/a;", "b", "Lqv1/c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f169062c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c getDynamicMultiDocumentDisplayDataUC;

    /* JADX INFO: renamed from: qv1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqv1/a$a;", "Lgz/b$a;", "Lrq0/b$c;", "dynamicMultiDocumentType", "<init>", "(Lrq0/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$c;", "()Lrq0/b$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        Object f169066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f169067e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f169069g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f169067e = obj;
            this.f169069g |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(kv1.a aVar, c cVar) {
        this.dynamicDocumentContainersInteractor = aVar;
        this.getDynamicMultiDocumentDisplayDataUC = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i<? extends dx.b, DynamicMultiDocumentFullData>> eVar) throws Throwable {
        b bVar;
        Object objB;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f169069g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f169069g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f169067e;
        Object objE = uq.b.e();
        int i16 = bVar.f169069g;
        if (i16 == 0) {
            u.b(objG);
            kv1.a aVar = this.dynamicDocumentContainersInteractor;
            rq0.b.c dynamicMultiDocumentType = params.getDynamicMultiDocumentType();
            bVar.f169066d = params;
            bVar.f169069g = 1;
            objG = aVar.g(dynamicMultiDocumentType, bVar);
            if (objG != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objG);
            return objG;
        }
        params = (Params) bVar.f169066d;
        u.b(objG);
        i iVar = (i) objG;
        if (iVar instanceof i.Left) {
            objB = vq.b.a(false);
        } else {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            objB = ((i.Right) iVar).b();
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            c cVar = this.getDynamicMultiDocumentDisplayDataUC;
            c.Params params2 = new c.Params(params.getDynamicMultiDocumentType());
            bVar.f169066d = j.a(params);
            bVar.f169069g = 2;
            Object objD = cVar.d(params2, bVar);
            return objD == objE ? objE : objD;
        }
        if (zBooleanValue) {
            throw new p();
        }
        return new i.Left(new dx.b.Generic(new Exception("Failed to load, " + params.getDynamicMultiDocumentType() + " is not added")));
    }
}
