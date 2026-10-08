package qs0;

import dx.i;
import p071kotlin.Metadata;
import yr0.BEPaymentPackage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqs0/d;", "Les0/d;", "Lms0/d;", "paymentsPackageRepository", "<init>", "(Lms0/d;)V", "Les0/d$a;", "params", "Ldx/i;", "Ldx/b;", "Lyr0/i;", "d", "(Les0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lms0/d;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements es0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ms0.d paymentsPackageRepository;

    public d(ms0.d dVar) {
        this.paymentsPackageRepository = dVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(es0.d.Params params, tq.e<? super i<? extends dx.b, BEPaymentPackage>> eVar) {
        return this.paymentsPackageRepository.a(params.getPaymentPackageId(), eVar);
    }
}
