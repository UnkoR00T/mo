package a44;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La44/t0;", "Lq34/t0;", "Lg34/c;", "identityManager", "<init>", "(Lg34/c;)V", "Lq34/t0$a;", "params", "Lrq0/b;", "d", "(Lq34/t0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/c;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t0 implements q34.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    public t0(g34.c cVar) {
        this.identityManager = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.t0.Params params, tq.e<? super rq0.b> eVar) {
        return this.identityManager.f(params.getDocumentType(), eVar);
    }
}
