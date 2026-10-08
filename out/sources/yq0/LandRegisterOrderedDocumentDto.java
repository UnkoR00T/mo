package yq0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\f\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u0014\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\u001a\u0010/R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b \u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b2\u0010\u0004¨\u00064"}, d2 = {"Lyq0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "id", "b", "g", "number", "", "c", "Ljava/util/List;", "h", "()Ljava/util/List;", "shortAddress", "Lyq0/g;", "d", "Lyq0/g;", "i", "()Lyq0/g;", "status", "Lyq0/h;", "e", "j", "subtypes", "Lyq0/j;", "Lyq0/j;", "k", "()Lyq0/j;", "type", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "confirmationDownloadValid", "confirmationId", "documentDownloadValid", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "documentDownloadValidUntil", "documentId", "l", "verificationCode", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LandRegisterOrderedDocumentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("shortAddress")
    private final List<String> shortAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final g status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subtypes")
    private final List<h> subtypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final j type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("confirmationDownloadValid")
    private final Boolean confirmationDownloadValid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("confirmationId")
    private final String confirmationId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentDownloadValid")
    private final Boolean documentDownloadValid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentDownloadValidUntil")
    private final OffsetDateTime documentDownloadValidUntil;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationCode")
    private final String verificationCode;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getConfirmationDownloadValid() {
        return this.confirmationDownloadValid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConfirmationId() {
        return this.confirmationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDocumentDownloadValid() {
        return this.documentDownloadValid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getDocumentDownloadValidUntil() {
        return this.documentDownloadValidUntil;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandRegisterOrderedDocumentDto)) {
            return false;
        }
        LandRegisterOrderedDocumentDto landRegisterOrderedDocumentDto = (LandRegisterOrderedDocumentDto) other;
        return fr.t.c(this.id, landRegisterOrderedDocumentDto.id) && fr.t.c(this.number, landRegisterOrderedDocumentDto.number) && fr.t.c(this.shortAddress, landRegisterOrderedDocumentDto.shortAddress) && this.status == landRegisterOrderedDocumentDto.status && fr.t.c(this.subtypes, landRegisterOrderedDocumentDto.subtypes) && this.type == landRegisterOrderedDocumentDto.type && fr.t.c(this.confirmationDownloadValid, landRegisterOrderedDocumentDto.confirmationDownloadValid) && fr.t.c(this.confirmationId, landRegisterOrderedDocumentDto.confirmationId) && fr.t.c(this.documentDownloadValid, landRegisterOrderedDocumentDto.documentDownloadValid) && fr.t.c(this.documentDownloadValidUntil, landRegisterOrderedDocumentDto.documentDownloadValidUntil) && fr.t.c(this.documentId, landRegisterOrderedDocumentDto.documentId) && fr.t.c(this.verificationCode, landRegisterOrderedDocumentDto.verificationCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final List<String> h() {
        return this.shortAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.number.hashCode()) * 31) + this.shortAddress.hashCode()) * 31) + this.status.hashCode()) * 31) + this.subtypes.hashCode()) * 31) + this.type.hashCode()) * 31;
        Boolean bool = this.confirmationDownloadValid;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.confirmationId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.documentDownloadValid;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.documentDownloadValidUntil;
        int iHashCode5 = (iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str2 = this.documentId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verificationCode;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g getStatus() {
        return this.status;
    }

    public final List<h> j() {
        return this.subtypes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final j getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getVerificationCode() {
        return this.verificationCode;
    }

    public String toString() {
        return "LandRegisterOrderedDocumentDto(id=" + this.id + ", number=" + this.number + ", shortAddress=" + this.shortAddress + ", status=" + this.status + ", subtypes=" + this.subtypes + ", type=" + this.type + ", confirmationDownloadValid=" + this.confirmationDownloadValid + ", confirmationId=" + this.confirmationId + ", documentDownloadValid=" + this.documentDownloadValid + ", documentDownloadValidUntil=" + this.documentDownloadValidUntil + ", documentId=" + this.documentId + ", verificationCode=" + this.verificationCode + ')';
    }
}
