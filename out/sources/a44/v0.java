package a44;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La44/v0;", "Lq34/v0;", "Lp34/a;", "documentsRepository", "<init>", "(Lp34/a;)V", "Lq34/v0$a;", "params", "", "Lrq0/b;", "d", "(Lq34/v0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 implements q34.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    public v0(p34.a aVar) {
        this.documentsRepository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.v0.Params params, tq.e<? super List<? extends rq0.b>> eVar) {
        return this.documentsRepository.d0(params.getDocumentType(), eVar);
    }
}
