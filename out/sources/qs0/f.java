package qs0;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import yr0.BEPaymentInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqs0/f;", "Les0/f;", "Lms0/e;", "repository", "<init>", "(Lms0/e;)V", "Les0/f$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lyr0/h;", "d", "(Les0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lms0/e;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements es0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ms0.e repository;

    public f(ms0.e eVar) {
        this.repository = eVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(es0.f.Params params, tq.e<? super i<? extends dx.b, ? extends List<BEPaymentInfo>>> eVar) {
        return this.repository.f(params.getPaymentGroup(), params.getPageNumber(), eVar);
    }
}
