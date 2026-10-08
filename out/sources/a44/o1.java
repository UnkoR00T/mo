package a44;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La44/o1;", "Lq34/n1;", "Lq34/k1;", "isDocumentAddedUseCase", "<init>", "(Lq34/k1;)V", "Lq34/n1$a;", "params", "", "d", "(Lq34/n1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq34/k1;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o1 implements q34.n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.k1 isDocumentAddedUseCase;

    public o1(q34.k1 k1Var) {
        this.isDocumentAddedUseCase = k1Var;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.n1.Params params, tq.e<? super Boolean> eVar) {
        rq0.b.e eVarA = rq0.b.e.INSTANCE.a(params.getLicenceCode());
        return eVarA == null ? vq.b.a(false) : this.isDocumentAddedUseCase.c(new q34.k1.Params(eVarA), eVar);
    }
}
