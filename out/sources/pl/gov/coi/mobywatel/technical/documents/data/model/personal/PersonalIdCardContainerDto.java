package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;", "", "picture", "", "number", "issuer", "validTo", "Ljava/time/LocalDate;", "creationDate", "suspensionDate", "revocationDate", "status", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;)V", "getPicture", "()Ljava/lang/String;", "getNumber", "getIssuer", "getValidTo", "()Ljava/time/LocalDate;", "getCreationDate", "getSuspensionDate", "getRevocationDate", "getStatus", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalIdCardContainerDto {

    @c("creationDate")
    private final LocalDate creationDate;

    @c("issuer")
    private final String issuer;

    @c("number")
    private final String number;

    @c("picture")
    private final String picture;

    @c("revocationDate")
    private final LocalDate revocationDate;

    @c("status")
    private final Status status;

    @c("suspensionDate")
    private final LocalDate suspensionDate;

    @c("validTo")
    private final LocalDate validTo;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto$Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NOT_ISSUED", "ISSUED", "REVOKED", "SUSPENDED", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Status {
        NOT_ISSUED("NOT_ISSUED"),
        ISSUED("ISSUED"),
        REVOKED("REVOKED"),
        SUSPENDED("SUSPENDED"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        Status(String str) {
            this.value = str;
        }

        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public PersonalIdCardContainerDto(String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, Status status) {
        this.picture = str;
        this.number = str2;
        this.issuer = str3;
        this.validTo = localDate;
        this.creationDate = localDate2;
        this.suspensionDate = localDate3;
        this.revocationDate = localDate4;
        this.status = status;
    }

    public static /* synthetic */ PersonalIdCardContainerDto copy$default(PersonalIdCardContainerDto personalIdCardContainerDto, String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, Status status, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = personalIdCardContainerDto.picture;
        }
        if ((i15 & 2) != 0) {
            str2 = personalIdCardContainerDto.number;
        }
        if ((i15 & 4) != 0) {
            str3 = personalIdCardContainerDto.issuer;
        }
        if ((i15 & 8) != 0) {
            localDate = personalIdCardContainerDto.validTo;
        }
        if ((i15 & 16) != 0) {
            localDate2 = personalIdCardContainerDto.creationDate;
        }
        if ((i15 & 32) != 0) {
            localDate3 = personalIdCardContainerDto.suspensionDate;
        }
        if ((i15 & 64) != 0) {
            localDate4 = personalIdCardContainerDto.revocationDate;
        }
        if ((i15 & 128) != 0) {
            status = personalIdCardContainerDto.status;
        }
        LocalDate localDate5 = localDate4;
        Status status2 = status;
        LocalDate localDate6 = localDate2;
        LocalDate localDate7 = localDate3;
        return personalIdCardContainerDto.copy(str, str2, str3, localDate, localDate6, localDate7, localDate5, status2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocalDate getValidTo() {
        return this.validTo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LocalDate getSuspensionDate() {
        return this.suspensionDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LocalDate getRevocationDate() {
        return this.revocationDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final PersonalIdCardContainerDto copy(String picture, String number, String issuer, LocalDate validTo, LocalDate creationDate, LocalDate suspensionDate, LocalDate revocationDate, Status status) {
        return new PersonalIdCardContainerDto(picture, number, issuer, validTo, creationDate, suspensionDate, revocationDate, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalIdCardContainerDto)) {
            return false;
        }
        PersonalIdCardContainerDto personalIdCardContainerDto = (PersonalIdCardContainerDto) other;
        return t.c(this.picture, personalIdCardContainerDto.picture) && t.c(this.number, personalIdCardContainerDto.number) && t.c(this.issuer, personalIdCardContainerDto.issuer) && t.c(this.validTo, personalIdCardContainerDto.validTo) && t.c(this.creationDate, personalIdCardContainerDto.creationDate) && t.c(this.suspensionDate, personalIdCardContainerDto.suspensionDate) && t.c(this.revocationDate, personalIdCardContainerDto.revocationDate) && this.status == personalIdCardContainerDto.status;
    }

    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final LocalDate getRevocationDate() {
        return this.revocationDate;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final LocalDate getSuspensionDate() {
        return this.suspensionDate;
    }

    public final LocalDate getValidTo() {
        return this.validTo;
    }

    public int hashCode() {
        int iHashCode = this.picture.hashCode() * 31;
        String str = this.number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.issuer;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.validTo;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.creationDate;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.suspensionDate;
        int iHashCode6 = (iHashCode5 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.revocationDate;
        int iHashCode7 = (iHashCode6 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31;
        Status status = this.status;
        return iHashCode7 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "PersonalIdCardContainerDto(picture=" + this.picture + ", number=" + this.number + ", issuer=" + this.issuer + ", validTo=" + this.validTo + ", creationDate=" + this.creationDate + ", suspensionDate=" + this.suspensionDate + ", revocationDate=" + this.revocationDate + ", status=" + this.status + ')';
    }

    public /* synthetic */ PersonalIdCardContainerDto(String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, Status status, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : localDate, (i15 & 16) != 0 ? null : localDate2, (i15 & 32) != 0 ? null : localDate3, (i15 & 64) != 0 ? null : localDate4, (i15 & 128) != 0 ? null : status);
    }
}
