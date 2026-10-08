package z02;

import eo0.DeliveryMessageDetails;
import eo0.DraftDetails;
import eo0.r;
import eo0.t;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lz02/a;", "", "c", "b", "d", "a", "Lz02/a$a;", "Lz02/a$b;", "Lz02/a$c;", "Lz02/a$d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: z02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\r¨\u0006\u001f"}, d2 = {"Lz02/a$a;", "Lz02/a;", "Leo0/m;", "messageDetails", "", "directoryName", "Leo0/t;", "directoryType", "Leo0/r;", "directoryId", "<init>", "(Leo0/m;Ljava/lang/String;Leo0/t;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/m;", "d", "()Leo0/m;", "b", "Ljava/lang/String;", "c", "Leo0/t;", "()Leo0/t;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditDraft implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeliveryMessageDetails messageDetails;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        public /* synthetic */ EditDraft(DeliveryMessageDetails deliveryMessageDetails, String str, t tVar, String str2, k kVar) {
            this(deliveryMessageDetails, str, tVar, str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDirectoryName() {
            return this.directoryName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final t getDirectoryType() {
            return this.directoryType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DeliveryMessageDetails getMessageDetails() {
            return this.messageDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditDraft)) {
                return false;
            }
            EditDraft editDraft = (EditDraft) other;
            return fr.t.c(this.messageDetails, editDraft.messageDetails) && fr.t.c(this.directoryName, editDraft.directoryName) && this.directoryType == editDraft.directoryType && r.d(this.directoryId, editDraft.directoryId);
        }

        public int hashCode() {
            return (((((this.messageDetails.hashCode() * 31) + this.directoryName.hashCode()) * 31) + this.directoryType.hashCode()) * 31) + r.e(this.directoryId);
        }

        public String toString() {
            return "EditDraft(messageDetails=" + this.messageDetails + ", directoryName=" + this.directoryName + ", directoryType=" + this.directoryType + ", directoryId=" + ((Object) r.f(this.directoryId)) + ')';
        }

        private EditDraft(DeliveryMessageDetails deliveryMessageDetails, String str, t tVar, String str2) {
            this.messageDetails = deliveryMessageDetails;
            this.directoryName = str;
            this.directoryType = tVar;
            this.directoryId = str2;
        }
    }

    /* JADX INFO: renamed from: z02.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, d2 = {"Lz02/a$b;", "Lz02/a;", "Leo0/t;", "directoryType", "", "directoryName", "Leo0/r;", "directoryId", "Leo0/m;", "messageDetails", "Leo0/u;", "draftDetails", "<init>", "(Leo0/t;Ljava/lang/String;Ljava/lang/String;Leo0/m;Leo0/u;Lfr/k;)V", "a", "(Leo0/t;Ljava/lang/String;Ljava/lang/String;Leo0/m;Leo0/u;)Lz02/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Leo0/t;", "getDirectoryType", "()Leo0/t;", "b", "Ljava/lang/String;", "getDirectoryName", "c", "d", "Leo0/m;", "e", "()Leo0/m;", "Leo0/u;", "()Leo0/u;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForwardMessage implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeliveryMessageDetails messageDetails;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DraftDetails draftDetails;

        public /* synthetic */ ForwardMessage(t tVar, String str, String str2, DeliveryMessageDetails deliveryMessageDetails, DraftDetails draftDetails, k kVar) {
            this(tVar, str, str2, deliveryMessageDetails, draftDetails);
        }

        public static /* synthetic */ ForwardMessage b(ForwardMessage forwardMessage, t tVar, String str, String str2, DeliveryMessageDetails deliveryMessageDetails, DraftDetails draftDetails, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                tVar = forwardMessage.directoryType;
            }
            if ((i15 & 2) != 0) {
                str = forwardMessage.directoryName;
            }
            if ((i15 & 4) != 0) {
                str2 = forwardMessage.directoryId;
            }
            if ((i15 & 8) != 0) {
                deliveryMessageDetails = forwardMessage.messageDetails;
            }
            if ((i15 & 16) != 0) {
                draftDetails = forwardMessage.draftDetails;
            }
            DraftDetails draftDetails2 = draftDetails;
            String str3 = str2;
            return forwardMessage.a(tVar, str, str3, deliveryMessageDetails, draftDetails2);
        }

        public final ForwardMessage a(t directoryType, String directoryName, String directoryId, DeliveryMessageDetails messageDetails, DraftDetails draftDetails) {
            return new ForwardMessage(directoryType, directoryName, directoryId, messageDetails, draftDetails, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DraftDetails getDraftDetails() {
            return this.draftDetails;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DeliveryMessageDetails getMessageDetails() {
            return this.messageDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForwardMessage)) {
                return false;
            }
            ForwardMessage forwardMessage = (ForwardMessage) other;
            return this.directoryType == forwardMessage.directoryType && fr.t.c(this.directoryName, forwardMessage.directoryName) && r.d(this.directoryId, forwardMessage.directoryId) && fr.t.c(this.messageDetails, forwardMessage.messageDetails) && fr.t.c(this.draftDetails, forwardMessage.draftDetails);
        }

        public int hashCode() {
            int iHashCode = ((((((this.directoryType.hashCode() * 31) + this.directoryName.hashCode()) * 31) + r.e(this.directoryId)) * 31) + this.messageDetails.hashCode()) * 31;
            DraftDetails draftDetails = this.draftDetails;
            return iHashCode + (draftDetails == null ? 0 : draftDetails.hashCode());
        }

        public String toString() {
            return "ForwardMessage(directoryType=" + this.directoryType + ", directoryName=" + this.directoryName + ", directoryId=" + ((Object) r.f(this.directoryId)) + ", messageDetails=" + this.messageDetails + ", draftDetails=" + this.draftDetails + ')';
        }

        private ForwardMessage(t tVar, String str, String str2, DeliveryMessageDetails deliveryMessageDetails, DraftDetails draftDetails) {
            this.directoryType = tVar;
            this.directoryName = str;
            this.directoryId = str2;
            this.messageDetails = deliveryMessageDetails;
            this.draftDetails = draftDetails;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz02/a$c;", "Lz02/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f231893a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1038123541;
        }

        public String toString() {
            return "NewMessage";
        }
    }

    /* JADX INFO: renamed from: z02.a$d, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"Lz02/a$d;", "Lz02/a;", "", "directoryName", "Leo0/t;", "directoryType", "Leo0/r;", "directoryId", "Leo0/m;", "messageDetails", "<init>", "(Ljava/lang/String;Leo0/t;Ljava/lang/String;Leo0/m;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDirectoryName", "b", "Leo0/t;", "getDirectoryType", "()Leo0/t;", "c", "getDirectoryId-sWKqr8k", "d", "Leo0/m;", "()Leo0/m;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reply implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t directoryType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeliveryMessageDetails messageDetails;

        public /* synthetic */ Reply(String str, t tVar, String str2, DeliveryMessageDetails deliveryMessageDetails, k kVar) {
            this(str, tVar, str2, deliveryMessageDetails);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeliveryMessageDetails getMessageDetails() {
            return this.messageDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reply)) {
                return false;
            }
            Reply reply = (Reply) other;
            return fr.t.c(this.directoryName, reply.directoryName) && this.directoryType == reply.directoryType && r.d(this.directoryId, reply.directoryId) && fr.t.c(this.messageDetails, reply.messageDetails);
        }

        public int hashCode() {
            return (((((this.directoryName.hashCode() * 31) + this.directoryType.hashCode()) * 31) + r.e(this.directoryId)) * 31) + this.messageDetails.hashCode();
        }

        public String toString() {
            return "Reply(directoryName=" + this.directoryName + ", directoryType=" + this.directoryType + ", directoryId=" + ((Object) r.f(this.directoryId)) + ", messageDetails=" + this.messageDetails + ')';
        }

        private Reply(String str, t tVar, String str2, DeliveryMessageDetails deliveryMessageDetails) {
            this.directoryName = str;
            this.directoryType = tVar;
            this.directoryId = str2;
            this.messageDetails = deliveryMessageDetails;
        }
    }
}
