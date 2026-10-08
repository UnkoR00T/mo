package w24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/e2;", "Lk24/k;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lk24/k$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lk24/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e2 implements k24.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    public e2(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k24.k.Params params, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return this.documentsContainerRepository.g(params.getDocumentId(), eVar);
    }
}
