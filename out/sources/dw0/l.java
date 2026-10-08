package dw0;

import fw0.FillVehicleCollisionDescriptionRequest;
import fw0.GetVehicleCollisionDescriptionWithOtherSideDataResponse;
import ge4.x;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ldw0/l;", "", "", "processId", "Lfw0/e0;", "fillVehicleCollisionDescriptionRequest", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Lfw0/e0;Ltq/e;)Ljava/lang/Object;", "status", "Lfw0/r0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {
    static /* synthetic */ Object c(l lVar, String str, String str2, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeCollisionDescriptionWithOtherSideData");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return lVar.a(str, str2, eVar);
    }

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/description-with-other-person-data")
    Object a(@ie4.s("processId") String str, @ie4.t("status") String str2, tq.e<? super x<GetVehicleCollisionDescriptionWithOtherSideDataResponse>> eVar);

    @ie4.o("vehicle/mobile/api/vehicles/collisions/{processId}/collision-description")
    Object b(@ie4.s("processId") String str, @ie4.a FillVehicleCollisionDescriptionRequest fillVehicleCollisionDescriptionRequest, tq.e<? super x<i0>> eVar);
}
