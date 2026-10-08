package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "", "prefix", "", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftPhoneNumberDto {
    public static final int $stable = 0;

    @c("number")
    private final String number;

    @c("prefix")
    private final String prefix;

    public CollisionDraftPhoneNumberDto(String str, String str2) {
        this.prefix = str;
        this.number = str2;
    }

    public static /* synthetic */ CollisionDraftPhoneNumberDto copy$default(CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftPhoneNumberDto.prefix;
        }
        if ((i15 & 2) != 0) {
            str2 = collisionDraftPhoneNumberDto.number;
        }
        return collisionDraftPhoneNumberDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final CollisionDraftPhoneNumberDto copy(String prefix, String number) {
        return new CollisionDraftPhoneNumberDto(prefix, number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftPhoneNumberDto)) {
            return false;
        }
        CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto = (CollisionDraftPhoneNumberDto) other;
        return t.c(this.prefix, collisionDraftPhoneNumberDto.prefix) && t.c(this.number, collisionDraftPhoneNumberDto.number);
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        return (this.prefix.hashCode() * 31) + this.number.hashCode();
    }

    public String toString() {
        return "CollisionDraftPhoneNumberDto(prefix=" + this.prefix + ", number=" + this.number + ')';
    }
}
