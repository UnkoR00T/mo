package dw0;

import fw0.VehicleCollisionFinishedDetailsResponse;
import fw0.VehicleCollisionReportedToUfgDetailsResponse;
import fw0.VehicleCollisionUfgFormReportDetailsResponse;
import fw0.VehicleCollisionVerifyStatusResponse;
import ge4.x;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011À\u0006\u0003"}, d2 = {"Ldw0/g;", "", "", "processId", "Lge4/x;", "Lfw0/g3;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfw0/l3;", "b", "", "processIds", "Lfw0/n3;", "c", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lfw0/v2;", "d", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/reported-to-ufg")
    Object a(@ie4.s("processId") String str, tq.e<? super x<VehicleCollisionReportedToUfgDetailsResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/ufg-form-report")
    Object b(@ie4.s("processId") String str, tq.e<? super x<VehicleCollisionUfgFormReportDetailsResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/verify-status")
    Object c(@ie4.t("process-ids") Set<String> set, tq.e<? super x<VehicleCollisionVerifyStatusResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/finished")
    Object d(@ie4.s("processId") String str, tq.e<? super x<VehicleCollisionFinishedDetailsResponse>> eVar);
}
