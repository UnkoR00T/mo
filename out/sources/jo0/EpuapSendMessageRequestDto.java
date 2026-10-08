package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.q0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ljo0/q0;", "", "Ljo0/i0;", "documentBody", "", "mailboxAddress", "Ljo0/j0;", "documentData", "Ljo0/k0;", "documentDescription", "Ljo0/s0;", "forwardDetails", "<init>", "(Ljo0/i0;Ljava/lang/String;Ljo0/j0;Ljo0/k0;Ljo0/s0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo0/i0;", "getDocumentBody", "()Ljo0/i0;", "b", "Ljava/lang/String;", "getMailboxAddress", "c", "Ljo0/j0;", "getDocumentData", "()Ljo0/j0;", "d", "Ljo0/k0;", "getDocumentDescription", "()Ljo0/k0;", "e", "Ljo0/s0;", "getForwardDetails", "()Ljo0/s0;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EpuapSendMessageRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentBody")
    private final DocumentBodyDtoDto documentBody;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mailboxAddress")
    private final String mailboxAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentData")
    private final DocumentDataDtoDto documentData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentDescription")
    private final DocumentDescriptionDtoDto documentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("forwardDetails")
    private final ForwardDetailsDtoDto forwardDetails;

    public EpuapSendMessageRequestDto(DocumentBodyDtoDto documentBodyDtoDto, String str, DocumentDataDtoDto documentDataDtoDto, DocumentDescriptionDtoDto documentDescriptionDtoDto, ForwardDetailsDtoDto forwardDetailsDtoDto) {
        this.documentBody = documentBodyDtoDto;
        this.mailboxAddress = str;
        this.documentData = documentDataDtoDto;
        this.documentDescription = documentDescriptionDtoDto;
        this.forwardDetails = forwardDetailsDtoDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EpuapSendMessageRequestDto)) {
            return false;
        }
        EpuapSendMessageRequestDto epuapSendMessageRequestDto = (EpuapSendMessageRequestDto) other;
        return fr.t.c(this.documentBody, epuapSendMessageRequestDto.documentBody) && fr.t.c(this.mailboxAddress, epuapSendMessageRequestDto.mailboxAddress) && fr.t.c(this.documentData, epuapSendMessageRequestDto.documentData) && fr.t.c(this.documentDescription, epuapSendMessageRequestDto.documentDescription) && fr.t.c(this.forwardDetails, epuapSendMessageRequestDto.forwardDetails);
    }

    public int hashCode() {
        int iHashCode = ((this.documentBody.hashCode() * 31) + this.mailboxAddress.hashCode()) * 31;
        DocumentDataDtoDto documentDataDtoDto = this.documentData;
        int iHashCode2 = (iHashCode + (documentDataDtoDto == null ? 0 : documentDataDtoDto.hashCode())) * 31;
        DocumentDescriptionDtoDto documentDescriptionDtoDto = this.documentDescription;
        int iHashCode3 = (iHashCode2 + (documentDescriptionDtoDto == null ? 0 : documentDescriptionDtoDto.hashCode())) * 31;
        ForwardDetailsDtoDto forwardDetailsDtoDto = this.forwardDetails;
        return iHashCode3 + (forwardDetailsDtoDto != null ? forwardDetailsDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "EpuapSendMessageRequestDto(documentBody=" + this.documentBody + ", mailboxAddress=" + this.mailboxAddress + ", documentData=" + this.documentData + ", documentDescription=" + this.documentDescription + ", forwardDetails=" + this.forwardDetails + ')';
    }
}
