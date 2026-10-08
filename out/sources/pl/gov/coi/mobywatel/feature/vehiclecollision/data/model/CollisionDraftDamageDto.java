package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "", "isDamaged", "", "damages", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;", "<init>", "(ZLpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;)V", "()Z", "getDamages", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftDamageDto {
    public static final int $stable = 8;

    @c("damages")
    private final CollisionDraftVehicleDamageDto damages;

    @c("isDamaged")
    private final boolean isDamaged;

    public CollisionDraftDamageDto(boolean z15, CollisionDraftVehicleDamageDto collisionDraftVehicleDamageDto) {
        this.isDamaged = z15;
        this.damages = collisionDraftVehicleDamageDto;
    }

    public static /* synthetic */ CollisionDraftDamageDto copy$default(CollisionDraftDamageDto collisionDraftDamageDto, boolean z15, CollisionDraftVehicleDamageDto collisionDraftVehicleDamageDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = collisionDraftDamageDto.isDamaged;
        }
        if ((i15 & 2) != 0) {
            collisionDraftVehicleDamageDto = collisionDraftDamageDto.damages;
        }
        return collisionDraftDamageDto.copy(z15, collisionDraftVehicleDamageDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDamaged() {
        return this.isDamaged;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CollisionDraftVehicleDamageDto getDamages() {
        return this.damages;
    }

    public final CollisionDraftDamageDto copy(boolean isDamaged, CollisionDraftVehicleDamageDto damages) {
        return new CollisionDraftDamageDto(isDamaged, damages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftDamageDto)) {
            return false;
        }
        CollisionDraftDamageDto collisionDraftDamageDto = (CollisionDraftDamageDto) other;
        return this.isDamaged == collisionDraftDamageDto.isDamaged && t.c(this.damages, collisionDraftDamageDto.damages);
    }

    public final CollisionDraftVehicleDamageDto getDamages() {
        return this.damages;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isDamaged) * 31;
        CollisionDraftVehicleDamageDto collisionDraftVehicleDamageDto = this.damages;
        return iHashCode + (collisionDraftVehicleDamageDto == null ? 0 : collisionDraftVehicleDamageDto.hashCode());
    }

    public final boolean isDamaged() {
        return this.isDamaged;
    }

    public String toString() {
        return "CollisionDraftDamageDto(isDamaged=" + this.isDamaged + ", damages=" + this.damages + ')';
    }
}
