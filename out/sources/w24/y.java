package w24;

import i24.DynamicDocumentData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw24/y;", "Lw24/x;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lw24/x$a;", "params", "Ldx/i;", "Ldx/b;", "", "Li24/o;", "d", "(Lw24/x$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    public y(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(x.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentData>>> eVar) {
        return this.documentsContainerRepository.A(params.getDocumentType(), eVar);
    }
}
