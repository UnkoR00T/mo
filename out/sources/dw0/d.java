package dw0;

import fw0.RefreshVehicleCollisionParticipantImagesResponse;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ldw0/d;", "", "", "processId", "filesName", "Lge4/x;", "Lfw0/l1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @ie4.p("vehicle/mobile/api/vehicles/collisions/{processId}/images/refresh")
    Object a(@ie4.s("processId") String str, @ie4.t("filesName") String str2, tq.e<? super x<RefreshVehicleCollisionParticipantImagesResponse>> eVar);
}
