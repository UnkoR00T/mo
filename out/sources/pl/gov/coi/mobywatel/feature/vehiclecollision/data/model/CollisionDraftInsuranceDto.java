package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftInsuranceDto;", "", "insurerId", "", "insurerName", "insuranceNumber", "insuranceAddedManually", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getInsurerId", "()Ljava/lang/String;", "getInsurerName", "getInsuranceNumber", "getInsuranceAddedManually", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftInsuranceDto {
    public static final int $stable = 0;

    @c("insuranceAddedManually")
    private final boolean insuranceAddedManually;

    @c("insuranceNumber")
    private final String insuranceNumber;

    @c("insurerId")
    private final String insurerId;

    @c("insurerName")
    private final String insurerName;

    public CollisionDraftInsuranceDto(String str, String str2, String str3, boolean z15) {
        this.insurerId = str;
        this.insurerName = str2;
        this.insuranceNumber = str3;
        this.insuranceAddedManually = z15;
    }

    public static /* synthetic */ CollisionDraftInsuranceDto copy$default(CollisionDraftInsuranceDto collisionDraftInsuranceDto, String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftInsuranceDto.insurerId;
        }
        if ((i15 & 2) != 0) {
            str2 = collisionDraftInsuranceDto.insurerName;
        }
        if ((i15 & 4) != 0) {
            str3 = collisionDraftInsuranceDto.insuranceNumber;
        }
        if ((i15 & 8) != 0) {
            z15 = collisionDraftInsuranceDto.insuranceAddedManually;
        }
        return collisionDraftInsuranceDto.copy(str, str2, str3, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInsurerId() {
        return this.insurerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInsurerName() {
        return this.insurerName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInsuranceAddedManually() {
        return this.insuranceAddedManually;
    }

    public final CollisionDraftInsuranceDto copy(String insurerId, String insurerName, String insuranceNumber, boolean insuranceAddedManually) {
        return new CollisionDraftInsuranceDto(insurerId, insurerName, insuranceNumber, insuranceAddedManually);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftInsuranceDto)) {
            return false;
        }
        CollisionDraftInsuranceDto collisionDraftInsuranceDto = (CollisionDraftInsuranceDto) other;
        return t.c(this.insurerId, collisionDraftInsuranceDto.insurerId) && t.c(this.insurerName, collisionDraftInsuranceDto.insurerName) && t.c(this.insuranceNumber, collisionDraftInsuranceDto.insuranceNumber) && this.insuranceAddedManually == collisionDraftInsuranceDto.insuranceAddedManually;
    }

    public final boolean getInsuranceAddedManually() {
        return this.insuranceAddedManually;
    }

    public final String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public final String getInsurerId() {
        return this.insurerId;
    }

    public final String getInsurerName() {
        return this.insurerName;
    }

    public int hashCode() {
        int iHashCode = ((this.insurerId.hashCode() * 31) + this.insurerName.hashCode()) * 31;
        String str = this.insuranceNumber;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.insuranceAddedManually);
    }

    public String toString() {
        return "CollisionDraftInsuranceDto(insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", insuranceNumber=" + this.insuranceNumber + ", insuranceAddedManually=" + this.insuranceAddedManually + ')';
    }
}
