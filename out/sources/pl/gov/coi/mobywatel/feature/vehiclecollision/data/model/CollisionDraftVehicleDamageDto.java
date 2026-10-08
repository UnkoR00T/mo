package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;", "", "damagedComponents", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageTypeDto;", "<init>", "(Ljava/util/Set;)V", "getDamagedComponents", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftVehicleDamageDto {
    public static final int $stable = 8;

    @c("damagedComponents")
    private final Set<CollisionDraftVehicleDamageTypeDto> damagedComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public CollisionDraftVehicleDamageDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollisionDraftVehicleDamageDto copy$default(CollisionDraftVehicleDamageDto collisionDraftVehicleDamageDto, Set set, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            set = collisionDraftVehicleDamageDto.damagedComponents;
        }
        return collisionDraftVehicleDamageDto.copy(set);
    }

    public final Set<CollisionDraftVehicleDamageTypeDto> component1() {
        return this.damagedComponents;
    }

    public final CollisionDraftVehicleDamageDto copy(Set<? extends CollisionDraftVehicleDamageTypeDto> damagedComponents) {
        return new CollisionDraftVehicleDamageDto(damagedComponents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CollisionDraftVehicleDamageDto) && t.c(this.damagedComponents, ((CollisionDraftVehicleDamageDto) other).damagedComponents);
    }

    public final Set<CollisionDraftVehicleDamageTypeDto> getDamagedComponents() {
        return this.damagedComponents;
    }

    public int hashCode() {
        return this.damagedComponents.hashCode();
    }

    public String toString() {
        return "CollisionDraftVehicleDamageDto(damagedComponents=" + this.damagedComponents + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollisionDraftVehicleDamageDto(Set<? extends CollisionDraftVehicleDamageTypeDto> set) {
        this.damagedComponents = set;
    }

    public /* synthetic */ CollisionDraftVehicleDamageDto(Set set, int i15, k kVar) {
        this((i15 & 1) != 0 ? e1.e() : set);
    }
}
