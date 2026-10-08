package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Leo0/m;", "", "Lfo0/c;", "deliveryMessage", "", "textBody", "", "Leo0/n;", "attachments", "Leo0/o;", "evidences", "", "attachmentSumTooBigToDownload", "<init>", "(Lfo0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "a", "(Lfo0/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Leo0/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lfo0/c;", "e", "()Lfo0/c;", "b", "Ljava/lang/String;", "g", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "f", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMessageDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fo0.c deliveryMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String textBody;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DeliveryMessageDetailsAttachment> attachments;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DeliveryMessageDetailsEvidence> evidences;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean attachmentSumTooBigToDownload;

    public DeliveryMessageDetails(fo0.c cVar, String str, List<DeliveryMessageDetailsAttachment> list, List<DeliveryMessageDetailsEvidence> list2, boolean z15) {
        this.deliveryMessage = cVar;
        this.textBody = str;
        this.attachments = list;
        this.evidences = list2;
        this.attachmentSumTooBigToDownload = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryMessageDetails b(DeliveryMessageDetails deliveryMessageDetails, fo0.c cVar, String str, List list, List list2, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = deliveryMessageDetails.deliveryMessage;
        }
        if ((i15 & 2) != 0) {
            str = deliveryMessageDetails.textBody;
        }
        if ((i15 & 4) != 0) {
            list = deliveryMessageDetails.attachments;
        }
        if ((i15 & 8) != 0) {
            list2 = deliveryMessageDetails.evidences;
        }
        if ((i15 & 16) != 0) {
            z15 = deliveryMessageDetails.attachmentSumTooBigToDownload;
        }
        boolean z16 = z15;
        List list3 = list;
        return deliveryMessageDetails.a(cVar, str, list3, list2, z16);
    }

    public final DeliveryMessageDetails a(fo0.c deliveryMessage, String textBody, List<DeliveryMessageDetailsAttachment> attachments, List<DeliveryMessageDetailsEvidence> evidences, boolean attachmentSumTooBigToDownload) {
        return new DeliveryMessageDetails(deliveryMessage, textBody, attachments, evidences, attachmentSumTooBigToDownload);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAttachmentSumTooBigToDownload() {
        return this.attachmentSumTooBigToDownload;
    }

    public final List<DeliveryMessageDetailsAttachment> d() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fo0.c getDeliveryMessage() {
        return this.deliveryMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMessageDetails)) {
            return false;
        }
        DeliveryMessageDetails deliveryMessageDetails = (DeliveryMessageDetails) other;
        return fr.t.c(this.deliveryMessage, deliveryMessageDetails.deliveryMessage) && fr.t.c(this.textBody, deliveryMessageDetails.textBody) && fr.t.c(this.attachments, deliveryMessageDetails.attachments) && fr.t.c(this.evidences, deliveryMessageDetails.evidences) && this.attachmentSumTooBigToDownload == deliveryMessageDetails.attachmentSumTooBigToDownload;
    }

    public final List<DeliveryMessageDetailsEvidence> f() {
        return this.evidences;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTextBody() {
        return this.textBody;
    }

    public int hashCode() {
        int iHashCode = this.deliveryMessage.hashCode() * 31;
        String str = this.textBody;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.attachments.hashCode()) * 31) + this.evidences.hashCode()) * 31) + Boolean.hashCode(this.attachmentSumTooBigToDownload);
    }

    public String toString() {
        return "DeliveryMessageDetails(deliveryMessage=" + this.deliveryMessage + ", textBody=" + this.textBody + ", attachments=" + this.attachments + ", evidences=" + this.evidences + ", attachmentSumTooBigToDownload=" + this.attachmentSumTooBigToDownload + ")";
    }
}
