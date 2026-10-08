package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La44/g;", "Lq34/g;", "Lp34/a;", "documentsRepository", "Lq34/k1;", "isDocumentAddedUseCase", "<init>", "(Lp34/a;Lq34/k1;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "b", "Lq34/k1;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements q34.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.k1 isDocumentAddedUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3083e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3085g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3083e = obj;
            this.f3085g |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(p34.a aVar, q34.k1 k1Var) {
        this.documentsRepository = aVar;
        this.isDocumentAddedUseCase = k1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3085g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3085g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f3083e;
        Object objE = uq.b.e();
        int i16 = aVar.f3085g;
        if (i16 == 0) {
            oq.u.b(objC);
            q34.k1 k1Var = this.isDocumentAddedUseCase;
            q34.k1.Params params = new q34.k1.Params(rq0.b.d.VEHICLE_CARD);
            aVar.f3082d = vq.j.a(c1792a);
            aVar.f3085g = 1;
            objC = k1Var.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        if (((Boolean) objC).booleanValue()) {
            this.documentsRepository.S();
        }
        return oq.i0.f148189a;
    }
}
