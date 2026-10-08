package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.vehicle;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "OWNER", "CO_OWNER", "NONE", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum VehicleCardOwnershipTypeDto {
    OWNER,
    CO_OWNER,
    NONE;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a<VehicleCardOwnershipTypeDto> getEntries() {
        return $ENTRIES;
    }
}
