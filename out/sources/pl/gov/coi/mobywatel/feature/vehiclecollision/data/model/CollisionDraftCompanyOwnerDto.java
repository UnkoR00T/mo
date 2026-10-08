package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftCompanyOwnerDto;", "", "name", "", "phoneNumber", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "email", "<init>", "(Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPhoneNumber", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "getEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftCompanyOwnerDto {
    public static final int $stable = 0;

    @c("email")
    private final String email;

    @c("name")
    private final String name;

    @c("phoneNumber")
    private final CollisionDraftPhoneNumberDto phoneNumber;

    public CollisionDraftCompanyOwnerDto(String str, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str2) {
        this.name = str;
        this.phoneNumber = collisionDraftPhoneNumberDto;
        this.email = str2;
    }

    public static /* synthetic */ CollisionDraftCompanyOwnerDto copy$default(CollisionDraftCompanyOwnerDto collisionDraftCompanyOwnerDto, String str, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftCompanyOwnerDto.name;
        }
        if ((i15 & 2) != 0) {
            collisionDraftPhoneNumberDto = collisionDraftCompanyOwnerDto.phoneNumber;
        }
        if ((i15 & 4) != 0) {
            str2 = collisionDraftCompanyOwnerDto.email;
        }
        return collisionDraftCompanyOwnerDto.copy(str, collisionDraftPhoneNumberDto, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CollisionDraftPhoneNumberDto getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final CollisionDraftCompanyOwnerDto copy(String name, CollisionDraftPhoneNumberDto phoneNumber, String email) {
        return new CollisionDraftCompanyOwnerDto(name, phoneNumber, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftCompanyOwnerDto)) {
            return false;
        }
        CollisionDraftCompanyOwnerDto collisionDraftCompanyOwnerDto = (CollisionDraftCompanyOwnerDto) other;
        return t.c(this.name, collisionDraftCompanyOwnerDto.name) && t.c(this.phoneNumber, collisionDraftCompanyOwnerDto.phoneNumber) && t.c(this.email, collisionDraftCompanyOwnerDto.email);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final CollisionDraftPhoneNumberDto getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "CollisionDraftCompanyOwnerDto(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ')';
    }
}
