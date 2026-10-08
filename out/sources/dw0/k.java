package dw0;

import fw0.GetVehicleCollisionJoinedResponse;
import fw0.JoinVehicleCollisionRequest;
import fw0.JoinVehicleCollisionResponse;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Ldw0/k;", "", "Lfw0/y0;", "joinVehicleCollisionRequest", "Lge4/x;", "Lfw0/z0;", "a", "(Lfw0/y0;Ltq/e;)Ljava/lang/Object;", "", "processId", "Lfw0/t0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    @ie4.o("vehicle/mobile/api/vehicles/collisions/join")
    Object a(@ie4.a JoinVehicleCollisionRequest joinVehicleCollisionRequest, tq.e<? super x<JoinVehicleCollisionResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/wait-for-all-participants")
    Object b(@ie4.s("processId") String str, tq.e<? super x<GetVehicleCollisionJoinedResponse>> eVar);
}
