package tn3;

import bn3.VehicleDocumentContainerData;
import dn3.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J#\u0010\b\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ltn3/e;", "Ldn3/a;", "T", "", "Lbn3/g;", "vehicleDocumentDataModel", "", "withUpcomingValidity", "b", "(Lbn3/g;Z)Ldn3/a;", "Ltn3/c;", "Ltn3/d;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e<T extends dn3.a> {
    static /* synthetic */ dn3.a a(e eVar, VehicleDocumentContainerData vehicleDocumentContainerData, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return eVar.b(vehicleDocumentContainerData, z15);
    }

    T b(VehicleDocumentContainerData vehicleDocumentDataModel, boolean withUpcomingValidity);
}
