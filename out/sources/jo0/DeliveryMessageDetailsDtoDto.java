package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.b0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Ljo0/b0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "attachmentSumTooBigToDownload", "Ljo0/c0;", "b", "Ljo0/c0;", "c", "()Ljo0/c0;", "deliveryMessageDto", "Ljava/lang/String;", "e", "textBody", "", "Ljo0/a0;", "d", "Ljava/util/List;", "()Ljava/util/List;", "attachments", "Ljo0/x0;", "evidences", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMessageDetailsDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachmentSumTooBigToDownload")
    private final boolean attachmentSumTooBigToDownload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("deliveryMessageDto")
    private final DeliveryMessageDtoDto deliveryMessageDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("textBody")
    private final String textBody;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<DeliveryMessageDetailsAttachmentDtoDto> attachments;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("evidences")
    private final List<MessageEvidenceDtoDto> evidences;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAttachmentSumTooBigToDownload() {
        return this.attachmentSumTooBigToDownload;
    }

    public final List<DeliveryMessageDetailsAttachmentDtoDto> b() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DeliveryMessageDtoDto getDeliveryMessageDto() {
        return this.deliveryMessageDto;
    }

    public final List<MessageEvidenceDtoDto> d() {
        return this.evidences;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTextBody() {
        return this.textBody;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMessageDetailsDtoDto)) {
            return false;
        }
        DeliveryMessageDetailsDtoDto deliveryMessageDetailsDtoDto = (DeliveryMessageDetailsDtoDto) other;
        return this.attachmentSumTooBigToDownload == deliveryMessageDetailsDtoDto.attachmentSumTooBigToDownload && fr.t.c(this.deliveryMessageDto, deliveryMessageDetailsDtoDto.deliveryMessageDto) && fr.t.c(this.textBody, deliveryMessageDetailsDtoDto.textBody) && fr.t.c(this.attachments, deliveryMessageDetailsDtoDto.attachments) && fr.t.c(this.evidences, deliveryMessageDetailsDtoDto.evidences);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.attachmentSumTooBigToDownload) * 31) + this.deliveryMessageDto.hashCode()) * 31) + this.textBody.hashCode()) * 31;
        List<DeliveryMessageDetailsAttachmentDtoDto> list = this.attachments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MessageEvidenceDtoDto> list2 = this.evidences;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryMessageDetailsDtoDto(attachmentSumTooBigToDownload=" + this.attachmentSumTooBigToDownload + ", deliveryMessageDto=" + this.deliveryMessageDto + ", textBody=" + this.textBody + ", attachments=" + this.attachments + ", evidences=" + this.evidences + ')';
    }
}
