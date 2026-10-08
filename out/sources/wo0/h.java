package wo0;

import java.util.List;
import oo0.BEReportIssueReason;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwo0/h;", "Lpo0/h;", "Lvo0/c;", "repository", "<init>", "(Lvo0/c;)V", "Lpo0/h$a;", "params", "Ldx/i;", "Ldx/b;", "", "Loo0/b;", "d", "(Lpo0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvo0/c;", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements po0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vo0.c repository;

    public h(vo0.c cVar) {
        this.repository = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(po0.h.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<BEReportIssueReason>>> eVar) {
        return this.repository.b(params.getTopicType(), eVar);
    }
}
