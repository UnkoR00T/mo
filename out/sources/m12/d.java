package m12;

import eo0.DeliveryMessageDetails;
import mx.Label;
import p071kotlin.Metadata;
import z02.MessageDetailsPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lm12/d;", "", "Lz02/b;", "a", "()Lz02/b;", "messageDetailsPayload", "b", "Lm12/d$a;", "Lm12/d$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0003\u0006\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lm12/d$a;", "Lm12/d;", "Leo0/m;", "b", "()Leo0/m;", "messageDetails", "a", "f", "c", "e", "d", "Lm12/d$a$a;", "Lm12/d$a$b;", "Lm12/d$a$c;", "Lm12/d$a$d;", "Lm12/d$a$e;", "Lm12/d$a$f;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends d {

        /* JADX INFO: renamed from: m12.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm12/d$a$a;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "<init>", "(Leo0/m;Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DeletingMessage implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            public DeletingMessage(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeletingMessage)) {
                    return false;
                }
                DeletingMessage deletingMessage = (DeletingMessage) other;
                return fr.t.c(this.messageDetails, deletingMessage.messageDetails) && fr.t.c(this.messageDetailsPayload, deletingMessage.messageDetailsPayload);
            }

            public int hashCode() {
                return (this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode();
            }

            public String toString() {
                return "DeletingMessage(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ')';
            }
        }

        /* JADX INFO: renamed from: m12.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm12/d$a$b;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "<init>", "(Leo0/m;Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            public Displaying(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displaying)) {
                    return false;
                }
                Displaying displaying = (Displaying) other;
                return fr.t.c(this.messageDetails, displaying.messageDetails) && fr.t.c(this.messageDetailsPayload, displaying.messageDetailsPayload);
            }

            public int hashCode() {
                return (this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode();
            }

            public String toString() {
                return "Displaying(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ')';
            }
        }

        /* JADX INFO: renamed from: m12.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lm12/d$a$c;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "Leo0/y;", "attachmentId", "", "fileName", "<init>", "(Leo0/m;Lz02/b;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "c", "Ljava/lang/String;", "d", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DownloadingAttachment implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String attachmentId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fileName;

            public /* synthetic */ DownloadingAttachment(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload, String str, String str2, fr.k kVar) {
                this(deliveryMessageDetails, messageDetailsPayload, str, str2);
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getAttachmentId() {
                return this.attachmentId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DownloadingAttachment)) {
                    return false;
                }
                DownloadingAttachment downloadingAttachment = (DownloadingAttachment) other;
                return fr.t.c(this.messageDetails, downloadingAttachment.messageDetails) && fr.t.c(this.messageDetailsPayload, downloadingAttachment.messageDetailsPayload) && eo0.y.d(this.attachmentId, downloadingAttachment.attachmentId) && fr.t.c(this.fileName, downloadingAttachment.fileName);
            }

            public int hashCode() {
                return (((((this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode()) * 31) + eo0.y.e(this.attachmentId)) * 31) + this.fileName.hashCode();
            }

            public String toString() {
                return "DownloadingAttachment(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ", attachmentId=" + ((Object) eo0.y.f(this.attachmentId)) + ", fileName=" + this.fileName + ')';
            }

            private DownloadingAttachment(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload, String str, String str2) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
                this.attachmentId = str;
                this.fileName = str2;
            }
        }

        /* JADX INFO: renamed from: m12.d$a$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm12/d$a$d;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "<init>", "(Leo0/m;Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EditingDraft implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            public EditingDraft(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EditingDraft)) {
                    return false;
                }
                EditingDraft editingDraft = (EditingDraft) other;
                return fr.t.c(this.messageDetails, editingDraft.messageDetails) && fr.t.c(this.messageDetailsPayload, editingDraft.messageDetailsPayload);
            }

            public int hashCode() {
                return (this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode();
            }

            public String toString() {
                return "EditingDraft(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ')';
            }
        }

        /* JADX INFO: renamed from: m12.d$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm12/d$a$e;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "Lhb4/c;", "errorVMS", "<init>", "(Leo0/m;Lz02/b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "c", "Lhb4/c;", "()Lhb4/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload, hb4.c cVar) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
                this.errorVMS = cVar;
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.messageDetails, error.messageDetails) && fr.t.c(this.messageDetailsPayload, error.messageDetailsPayload) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (((this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: m12.d$a$f, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm12/d$a$f;", "Lm12/d$a;", "Leo0/m;", "messageDetails", "Lz02/b;", "messageDetailsPayload", "<init>", "(Leo0/m;Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "b", "()Leo0/m;", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Forwarding implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeliveryMessageDetails messageDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final MessageDetailsPayload messageDetailsPayload;

            public Forwarding(DeliveryMessageDetails deliveryMessageDetails, MessageDetailsPayload messageDetailsPayload) {
                this.messageDetails = deliveryMessageDetails;
                this.messageDetailsPayload = messageDetailsPayload;
            }

            @Override // m12.d
            /* JADX INFO: renamed from: a, reason: from getter */
            public MessageDetailsPayload getMessageDetailsPayload() {
                return this.messageDetailsPayload;
            }

            @Override // m12.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public DeliveryMessageDetails getMessageDetails() {
                return this.messageDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Forwarding)) {
                    return false;
                }
                Forwarding forwarding = (Forwarding) other;
                return fr.t.c(this.messageDetails, forwarding.messageDetails) && fr.t.c(this.messageDetailsPayload, forwarding.messageDetailsPayload);
            }

            public int hashCode() {
                return (this.messageDetails.hashCode() * 31) + this.messageDetailsPayload.hashCode();
            }

            public String toString() {
                return "Forwarding(messageDetails=" + this.messageDetails + ", messageDetailsPayload=" + this.messageDetailsPayload + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        DeliveryMessageDetails getMessageDetails();
    }

    /* JADX INFO: renamed from: m12.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lm12/d$b;", "Lm12/d;", "Lz02/b;", "messageDetailsPayload", "Lmx/a;", "alertMessage", "<init>", "(Lz02/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/b;", "()Lz02/b;", "b", "Lmx/a;", "c", "()Lmx/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedStub implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MessageDetailsPayload messageDetailsPayload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alertMessage;

        public InitializedStub(MessageDetailsPayload messageDetailsPayload, Label label) {
            this.messageDetailsPayload = messageDetailsPayload;
            this.alertMessage = label;
        }

        @Override // m12.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public MessageDetailsPayload getMessageDetailsPayload() {
            return this.messageDetailsPayload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getAlertMessage() {
            return this.alertMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializedStub)) {
                return false;
            }
            InitializedStub initializedStub = (InitializedStub) other;
            return fr.t.c(this.messageDetailsPayload, initializedStub.messageDetailsPayload) && fr.t.c(this.alertMessage, initializedStub.alertMessage);
        }

        public int hashCode() {
            return (this.messageDetailsPayload.hashCode() * 31) + this.alertMessage.hashCode();
        }

        public String toString() {
            return "InitializedStub(messageDetailsPayload=" + this.messageDetailsPayload + ", alertMessage=" + this.alertMessage + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    MessageDetailsPayload getMessageDetailsPayload();
}
