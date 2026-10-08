package wu0;

import dx.b;
import dx.i;
import java.util.List;
import ou0.Ticket;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwu0/a;", "Lpu0/a;", "Lvu0/a;", "repository", "<init>", "(Lvu0/a;)V", "Lpu0/a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lou0/b;", "d", "(Lpu0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvu0/a;", "taxservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements pu0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vu0.a repository;

    public a(vu0.a aVar) {
        this.repository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(pu0.a.Params params, e<? super i<? extends b, ? extends List<Ticket>>> eVar) {
        return this.repository.a(params.getPaymentStatus(), params.getPageNumber(), eVar);
    }
}
