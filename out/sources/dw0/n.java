package dw0;

import fw0.ConfigurationForPhotosCompressionMobileResponse;
import fw0.GetAllInsuranceProvidersDataResponse;
import fw0.GetCollisionParticipantVehiclesResponse;
import fw0.GetCollisionVehicleResponse;
import fw0.GetReadyToSignVehicleCollisionStatementDataResponse;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H§@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\f¨\u0006\u0018À\u0006\u0003"}, d2 = {"Ldw0/n;", "", "", "processId", "Lge4/x;", "Lfw0/q;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfw0/n0;", "b", "pageId", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vin", "registrationNumber", "Lfw0/o0;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfw0/m0;", "a", "(Ltq/e;)Ljava/lang/Object;", "status", "Lfw0/q0;", "e", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {
    static /* synthetic */ Object f(n nVar, String str, String str2, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeReadyToSignStatementData");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return nVar.e(str, str2, eVar);
    }

    @ie4.f("vehicle/mobile/api/vehicles/collisions/insurance-providers")
    Object a(tq.e<? super x<GetAllInsuranceProvidersDataResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/participant-vehicles")
    Object b(@ie4.s("processId") String str, tq.e<? super x<GetCollisionParticipantVehiclesResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/participant-vehicles/{pageId}")
    Object c(@ie4.s("processId") String str, @ie4.s("pageId") String str2, tq.e<? super x<GetCollisionParticipantVehiclesResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/config/{processId}")
    Object d(@ie4.s("processId") String str, tq.e<? super x<ConfigurationForPhotosCompressionMobileResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/statement-data")
    Object e(@ie4.s("processId") String str, @ie4.t("status") String str2, tq.e<? super x<GetReadyToSignVehicleCollisionStatementDataResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/vehicle")
    Object g(@ie4.s("processId") String str, @ie4.t("vin") String str2, @ie4.t("registrationNumber") String str3, tq.e<? super x<GetCollisionVehicleResponse>> eVar);
}
