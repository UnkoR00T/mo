package dw0;

import fw0.UserVehicleCollisionsFirstPageResponse;
import fw0.UserVehicleCollisionsNextPageResponse;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Ldw0/a;", "", "Lge4/x;", "Lfw0/y1;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "pageId", "Lfw0/z1;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @ie4.f("vehicle/mobile/api/vehicles/collisions/{pageId}")
    Object a(@ie4.s("pageId") String str, tq.e<? super x<UserVehicleCollisionsNextPageResponse>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/collisions")
    Object b(tq.e<? super x<UserVehicleCollisionsFirstPageResponse>> eVar);
}
