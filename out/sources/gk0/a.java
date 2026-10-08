package gk0;

import dx.i;
import fk0.BECitizenData;
import fk0.BEGenerateApplicationRequest;
import fk0.BEGenerateApplicationResponse;
import fk0.BEResumptionRequest;
import fk0.BEResumptionRequestV2;
import fk0.BESuspensionRequest;
import fk0.BESuspensionRequestV2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lgk0/a;", "", "Ldx/i;", "Ldx/b;", "Lfk0/r;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lfk0/o0;", "request", "Lfk0/p0;", "e", "(Lfk0/o0;Ltq/e;)Ljava/lang/Object;", "Lfk0/c1;", "c", "(Lfk0/c1;Ltq/e;)Ljava/lang/Object;", "Lfk0/h1;", "b", "(Lfk0/h1;Ltq/e;)Ljava/lang/Object;", "Lfk0/d1;", "d", "(Lfk0/d1;Ltq/e;)Ljava/lang/Object;", "Lfk0/i1;", "f", "(Lfk0/i1;Ltq/e;)Ljava/lang/Object;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(tq.e<? super i<? extends dx.b, BECitizenData>> eVar);

    Object b(BESuspensionRequest bESuspensionRequest, tq.e<? super i<? extends dx.b, BEGenerateApplicationResponse>> eVar);

    Object c(BEResumptionRequest bEResumptionRequest, tq.e<? super i<? extends dx.b, BEGenerateApplicationResponse>> eVar);

    Object d(BEResumptionRequestV2 bEResumptionRequestV2, tq.e<? super i<? extends dx.b, BEGenerateApplicationResponse>> eVar);

    Object e(BEGenerateApplicationRequest bEGenerateApplicationRequest, tq.e<? super i<? extends dx.b, BEGenerateApplicationResponse>> eVar);

    Object f(BESuspensionRequestV2 bESuspensionRequestV2, tq.e<? super i<? extends dx.b, BEGenerateApplicationResponse>> eVar);
}
