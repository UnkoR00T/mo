package pl.gov.coi.mobywatel.feature.userdata.data.model.passports;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;", "", "revocationDate", "Ljava/time/OffsetDateTime;", "revocationReason", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;", "<init>", "(Ljava/time/OffsetDateTime;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;)V", "getRevocationDate", "()Ljava/time/OffsetDateTime;", "getRevocationReason", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportRevocationDataDto {
    public static final int $stable = 8;

    @c("revocationDate")
    private final OffsetDateTime revocationDate;

    @c("revocationReason")
    private final PassportRevocationReasonDto revocationReason;

    /* JADX WARN: Multi-variable type inference failed */
    public PassportRevocationDataDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PassportRevocationDataDto copy$default(PassportRevocationDataDto passportRevocationDataDto, OffsetDateTime offsetDateTime, PassportRevocationReasonDto passportRevocationReasonDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            offsetDateTime = passportRevocationDataDto.revocationDate;
        }
        if ((i15 & 2) != 0) {
            passportRevocationReasonDto = passportRevocationDataDto.revocationReason;
        }
        return passportRevocationDataDto.copy(offsetDateTime, passportRevocationReasonDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getRevocationDate() {
        return this.revocationDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PassportRevocationReasonDto getRevocationReason() {
        return this.revocationReason;
    }

    public final PassportRevocationDataDto copy(OffsetDateTime revocationDate, PassportRevocationReasonDto revocationReason) {
        return new PassportRevocationDataDto(revocationDate, revocationReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportRevocationDataDto)) {
            return false;
        }
        PassportRevocationDataDto passportRevocationDataDto = (PassportRevocationDataDto) other;
        return t.c(this.revocationDate, passportRevocationDataDto.revocationDate) && this.revocationReason == passportRevocationDataDto.revocationReason;
    }

    public final OffsetDateTime getRevocationDate() {
        return this.revocationDate;
    }

    public final PassportRevocationReasonDto getRevocationReason() {
        return this.revocationReason;
    }

    public int hashCode() {
        OffsetDateTime offsetDateTime = this.revocationDate;
        int iHashCode = (offsetDateTime == null ? 0 : offsetDateTime.hashCode()) * 31;
        PassportRevocationReasonDto passportRevocationReasonDto = this.revocationReason;
        return iHashCode + (passportRevocationReasonDto != null ? passportRevocationReasonDto.hashCode() : 0);
    }

    public String toString() {
        return "PassportRevocationDataDto(revocationDate=" + this.revocationDate + ", revocationReason=" + this.revocationReason + ')';
    }

    public PassportRevocationDataDto(OffsetDateTime offsetDateTime, PassportRevocationReasonDto passportRevocationReasonDto) {
        this.revocationDate = offsetDateTime;
        this.revocationReason = passportRevocationReasonDto;
    }

    public /* synthetic */ PassportRevocationDataDto(OffsetDateTime offsetDateTime, PassportRevocationReasonDto passportRevocationReasonDto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : offsetDateTime, (i15 & 2) != 0 ? null : passportRevocationReasonDto);
    }
}
