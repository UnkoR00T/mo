package jo0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b\u0015\u0010(R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0019\u0010-R\"\u00104\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u001f\u00103R\u001c\u00108\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b+\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b1\u0010<R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\r\u001a\u0004\b:\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b>\u00107R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\b@\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\bD\u00107R\"\u0010G\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bB\u00103¨\u0006H"}, d2 = {"Ljo0/c0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "messageId", "b", "Z", "g", "()Z", "opened", "c", "h", "receiptConfirmation", "Ljo0/y0;", "d", "Ljo0/y0;", "k", "()Ljo0/y0;", "sourceSystem", "Ljo0/a1;", "e", "Ljo0/a1;", "p", "()Ljo0/a1;", "type", "caseId", "correlationId", "Ljo0/d0;", "Ljo0/d0;", "()Ljo0/d0;", "deliveryStatus", "Ljo0/z;", "i", "Ljo0/z;", "()Ljo0/z;", "from", "", "Ljo0/v0;", "j", "Ljava/util/List;", "()Ljava/util/List;", "labels", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "receiptDate", "Ljo0/l1;", "l", "Ljo0/l1;", "()Ljo0/l1;", "receiptText", "m", "subject", "n", "submissionDate", "o", "threadId", "getTimestamp", "timestamp", "q", "to", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMessageDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("messageId")
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("opened")
    private final boolean opened;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("receiptConfirmation")
    private final boolean receiptConfirmation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sourceSystem")
    private final y0 sourceSystem;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final a1 type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("caseId")
    private final String caseId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("correlationId")
    private final String correlationId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("deliveryStatus")
    private final DeliveryStatusDtoDto deliveryStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("from")
    private final DeliveryMessageAddressDataDtoDto from;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("labels")
    private final List<LabelDtoDto> labels;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("receiptDate")
    private final OffsetDateTime receiptDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("receiptText")
    private final ReceiptTextDtoDto receiptText;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subject")
    private final String subject;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("submissionDate")
    private final OffsetDateTime submissionDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("threadId")
    private final String threadId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timestamp")
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("to")
    private final List<DeliveryMessageAddressDataDtoDto> to;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaseId() {
        return this.caseId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DeliveryStatusDtoDto getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DeliveryMessageAddressDataDtoDto getFrom() {
        return this.from;
    }

    public final List<LabelDtoDto> e() {
        return this.labels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMessageDtoDto)) {
            return false;
        }
        DeliveryMessageDtoDto deliveryMessageDtoDto = (DeliveryMessageDtoDto) other;
        return fr.t.c(this.messageId, deliveryMessageDtoDto.messageId) && this.opened == deliveryMessageDtoDto.opened && this.receiptConfirmation == deliveryMessageDtoDto.receiptConfirmation && this.sourceSystem == deliveryMessageDtoDto.sourceSystem && this.type == deliveryMessageDtoDto.type && fr.t.c(this.caseId, deliveryMessageDtoDto.caseId) && fr.t.c(this.correlationId, deliveryMessageDtoDto.correlationId) && fr.t.c(this.deliveryStatus, deliveryMessageDtoDto.deliveryStatus) && fr.t.c(this.from, deliveryMessageDtoDto.from) && fr.t.c(this.labels, deliveryMessageDtoDto.labels) && fr.t.c(this.receiptDate, deliveryMessageDtoDto.receiptDate) && fr.t.c(this.receiptText, deliveryMessageDtoDto.receiptText) && fr.t.c(this.subject, deliveryMessageDtoDto.subject) && fr.t.c(this.submissionDate, deliveryMessageDtoDto.submissionDate) && fr.t.c(this.threadId, deliveryMessageDtoDto.threadId) && fr.t.c(this.timestamp, deliveryMessageDtoDto.timestamp) && fr.t.c(this.to, deliveryMessageDtoDto.to);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getOpened() {
        return this.opened;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getReceiptConfirmation() {
        return this.receiptConfirmation;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.messageId.hashCode() * 31) + Boolean.hashCode(this.opened)) * 31) + Boolean.hashCode(this.receiptConfirmation)) * 31) + this.sourceSystem.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.caseId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.correlationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeliveryStatusDtoDto deliveryStatusDtoDto = this.deliveryStatus;
        int iHashCode4 = (iHashCode3 + (deliveryStatusDtoDto == null ? 0 : deliveryStatusDtoDto.hashCode())) * 31;
        DeliveryMessageAddressDataDtoDto deliveryMessageAddressDataDtoDto = this.from;
        int iHashCode5 = (iHashCode4 + (deliveryMessageAddressDataDtoDto == null ? 0 : deliveryMessageAddressDataDtoDto.hashCode())) * 31;
        List<LabelDtoDto> list = this.labels;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.receiptDate;
        int iHashCode7 = (iHashCode6 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        ReceiptTextDtoDto receiptTextDtoDto = this.receiptText;
        int iHashCode8 = (iHashCode7 + (receiptTextDtoDto == null ? 0 : receiptTextDtoDto.hashCode())) * 31;
        String str3 = this.subject;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.submissionDate;
        int iHashCode10 = (iHashCode9 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        String str4 = this.threadId;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OffsetDateTime offsetDateTime3 = this.timestamp;
        int iHashCode12 = (iHashCode11 + (offsetDateTime3 == null ? 0 : offsetDateTime3.hashCode())) * 31;
        List<DeliveryMessageAddressDataDtoDto> list2 = this.to;
        return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final OffsetDateTime getReceiptDate() {
        return this.receiptDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ReceiptTextDtoDto getReceiptText() {
        return this.receiptText;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final y0 getSourceSystem() {
        return this.sourceSystem;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final OffsetDateTime getSubmissionDate() {
        return this.submissionDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    public final List<DeliveryMessageAddressDataDtoDto> o() {
        return this.to;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final a1 getType() {
        return this.type;
    }

    public String toString() {
        return "DeliveryMessageDtoDto(messageId=" + this.messageId + ", opened=" + this.opened + ", receiptConfirmation=" + this.receiptConfirmation + ", sourceSystem=" + this.sourceSystem + ", type=" + this.type + ", caseId=" + this.caseId + ", correlationId=" + this.correlationId + ", deliveryStatus=" + this.deliveryStatus + ", from=" + this.from + ", labels=" + this.labels + ", receiptDate=" + this.receiptDate + ", receiptText=" + this.receiptText + ", subject=" + this.subject + ", submissionDate=" + this.submissionDate + ", threadId=" + this.threadId + ", timestamp=" + this.timestamp + ", to=" + this.to + ')';
    }
}
