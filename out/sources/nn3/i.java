package nn3;

import bn3.VehicleDocumentContainerData;
import java.util.Calendar;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbn3/g;", "vehicleDocumentDataModel", "", "b", "(Lbn3/g;)Z", "Ljava/util/Date;", "technicalExaminationExpireDate", "a", "(Ljava/util/Date;)Z", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final boolean a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1) == 9999;
    }

    public static final boolean b(VehicleDocumentContainerData vehicleDocumentContainerData) {
        String vehicleProductionMethod;
        if (vehicleDocumentContainerData == null || (vehicleProductionMethod = vehicleDocumentContainerData.getVehicleProductionMethod()) == null) {
            return false;
        }
        return vehicleProductionMethod.equals("ZABYTKOWY");
    }
}
