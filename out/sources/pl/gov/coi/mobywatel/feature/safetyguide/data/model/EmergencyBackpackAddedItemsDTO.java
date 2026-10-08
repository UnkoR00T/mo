package pl.gov.coi.mobywatel.feature.safetyguide.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/mobywatel/feature/safetyguide/data/model/EmergencyBackpackAddedItemsDTO;", "", "addedItemsIds", "", "", "<init>", "(Ljava/util/List;)V", "getAddedItemsIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmergencyBackpackAddedItemsDTO {
    public static final int $stable = 8;

    @c("addedItemsIds")
    private final List<String> addedItemsIds;

    public EmergencyBackpackAddedItemsDTO(List<String> list) {
        this.addedItemsIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmergencyBackpackAddedItemsDTO copy$default(EmergencyBackpackAddedItemsDTO emergencyBackpackAddedItemsDTO, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = emergencyBackpackAddedItemsDTO.addedItemsIds;
        }
        return emergencyBackpackAddedItemsDTO.copy(list);
    }

    public final List<String> component1() {
        return this.addedItemsIds;
    }

    public final EmergencyBackpackAddedItemsDTO copy(List<String> addedItemsIds) {
        return new EmergencyBackpackAddedItemsDTO(addedItemsIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmergencyBackpackAddedItemsDTO) && t.c(this.addedItemsIds, ((EmergencyBackpackAddedItemsDTO) other).addedItemsIds);
    }

    public final List<String> getAddedItemsIds() {
        return this.addedItemsIds;
    }

    public int hashCode() {
        return this.addedItemsIds.hashCode();
    }

    public String toString() {
        return "EmergencyBackpackAddedItemsDTO(addedItemsIds=" + this.addedItemsIds + ')';
    }
}
