package dw0;

import fw0.GetVehicleCollisionInitialDataConfirmedResponse;
import ge4.x;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\n¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ldw0/m;", "", "", "processId", "Lge4/x;", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "rejectionReason", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "status", "Lfw0/s0;", "b", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {
    static /* synthetic */ Object d(m mVar, String str, String str2, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeConfirmationStateInfo");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return mVar.b(str, str2, eVar);
    }

    @ie4.o("vehicle/mobile/api/vehicles/collisions/{processId}/other-side-data-rejection")
    Object a(@ie4.s("processId") String str, @ie4.t("rejectionReason") String str2, tq.e<? super x<i0>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions/{processId}/other-side-data-confirmation")
    Object b(@ie4.s("processId") String str, @ie4.t("status") String str2, tq.e<? super x<GetVehicleCollisionInitialDataConfirmedResponse>> eVar);

    @ie4.o("vehicle/mobile/api/vehicles/collisions/{processId}/other-side-data-confirmation")
    Object c(@ie4.s("processId") String str, tq.e<? super x<i0>> eVar);
}
