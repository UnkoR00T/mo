package dw0;

import fw0.VehicleHistoryAbroadDto;
import fw0.VehicleHistoryDto;
import fw0.VehicleHistoryTimelineDto;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\tJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\t¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ldw0/r;", "", "", "numberPlate", "vin", "firstRegistrationDate", "Lge4/x;", "Lfw0/t3;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfw0/q3;", "c", "Lfw0/y3;", "b", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r {
    @ie4.f("vehicle/mobile/api/vehicles/history")
    Object a(@ie4.t("numberPlate") String str, @ie4.t("vin") String str2, @ie4.t("firstRegistrationDate") String str3, tq.e<? super x<VehicleHistoryDto>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/history/timeline")
    Object b(@ie4.t("numberPlate") String str, @ie4.t("vin") String str2, @ie4.t("firstRegistrationDate") String str3, tq.e<? super x<VehicleHistoryTimelineDto>> eVar);

    @ie4.f("vehicle/mobile/api/vehicles/history/abroad")
    Object c(@ie4.t("numberPlate") String str, @ie4.t("vin") String str2, @ie4.t("firstRegistrationDate") String str3, tq.e<? super x<VehicleHistoryAbroadDto>> eVar);
}
