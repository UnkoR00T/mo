package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "", "number", "", "validFrom", "Ljava/time/OffsetDateTime;", "validTo", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "getNumber", "()Ljava/lang/String;", "getValidFrom", "()Ljava/time/OffsetDateTime;", "getValidTo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileIdCardContainerDto {

    @c("number")
    private final String number;

    @c("validFrom")
    private final OffsetDateTime validFrom;

    @c("validTo")
    private final OffsetDateTime validTo;

    public MobileIdCardContainerDto(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.number = str;
        this.validFrom = offsetDateTime;
        this.validTo = offsetDateTime2;
    }

    public static /* synthetic */ MobileIdCardContainerDto copy$default(MobileIdCardContainerDto mobileIdCardContainerDto, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = mobileIdCardContainerDto.number;
        }
        if ((i15 & 2) != 0) {
            offsetDateTime = mobileIdCardContainerDto.validFrom;
        }
        if ((i15 & 4) != 0) {
            offsetDateTime2 = mobileIdCardContainerDto.validTo;
        }
        return mobileIdCardContainerDto.copy(str, offsetDateTime, offsetDateTime2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getValidTo() {
        return this.validTo;
    }

    public final MobileIdCardContainerDto copy(String number, OffsetDateTime validFrom, OffsetDateTime validTo) {
        return new MobileIdCardContainerDto(number, validFrom, validTo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileIdCardContainerDto)) {
            return false;
        }
        MobileIdCardContainerDto mobileIdCardContainerDto = (MobileIdCardContainerDto) other;
        return t.c(this.number, mobileIdCardContainerDto.number) && t.c(this.validFrom, mobileIdCardContainerDto.validFrom) && t.c(this.validTo, mobileIdCardContainerDto.validTo);
    }

    public final String getNumber() {
        return this.number;
    }

    public final OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    public final OffsetDateTime getValidTo() {
        return this.validTo;
    }

    public int hashCode() {
        return (((this.number.hashCode() * 31) + this.validFrom.hashCode()) * 31) + this.validTo.hashCode();
    }

    public String toString() {
        return "MobileIdCardContainerDto(number=" + this.number + ", validFrom=" + this.validFrom + ", validTo=" + this.validTo + ')';
    }
}
