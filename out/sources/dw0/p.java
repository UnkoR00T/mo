package dw0;

import fw0.VehicleCollisionConfirmStatementDataSignedRequest;
import ge4.x;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ldw0/p;", "", "", "processId", "Lfw0/e2;", "vehicleCollisionConfirmStatementDataSignedRequest", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Lfw0/e2;Ltq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p {
    @ie4.o("vehicle/mobile/api/vehicles/collisions/{processId}/statement-data/reject")
    Object a(@ie4.s("processId") String str, tq.e<? super x<i0>> eVar);

    @ie4.o("vehicle/mobile/api/vehicles/collisions/{processId}/statement-data/confirm")
    Object b(@ie4.s("processId") String str, @ie4.a VehicleCollisionConfirmStatementDataSignedRequest vehicleCollisionConfirmStatementDataSignedRequest, tq.e<? super x<i0>> eVar);
}
