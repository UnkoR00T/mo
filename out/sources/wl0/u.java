package wl0;

import ge4.x;
import gm0.PhysicalIdCardSuspensionResponse;
import gm0.PhysicalIdCardSuspensionV3Request;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwl0/u;", "", "", "externalAuthorizationToken", "Lgm0/u6;", "physicalIdCardSuspensionV3Request", "Lge4/x;", "Lgm0/t6;", "a", "(Ljava/lang/String;Lgm0/u6;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface u {
    @ie4.o("document-management/mobile/api/v3/physical-id-card/suspension")
    Object a(@ie4.i("External-Authorization-Token") String str, @ie4.a PhysicalIdCardSuspensionV3Request physicalIdCardSuspensionV3Request, tq.e<? super x<PhysicalIdCardSuspensionResponse>> eVar);
}
