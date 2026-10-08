package fo0;

import eo0.g0;
import eo0.y0;
import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\b+\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bB\u0010GR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n8\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b4\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b.\u0010$R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bA\u00103R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b8\u0010K\u001a\u0004\bD\u0010LR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\b:\u0010$R\u0011\u0010N\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bM\u00103R\u0011\u0010P\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bO\u00103R\u0011\u0010R\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bQ\u00103R\u0011\u0010T\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u00103R\u0011\u0010V\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bU\u00103R\u0011\u0010X\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bW\u00103¨\u0006Y"}, d2 = {"Lfo0/c;", "", "Leo0/g0;", "messageId", "", "subject", "", "opened", "Lfo0/d;", "from", "", "to", "Leo0/y0;", "serviceType", "Lfo0/i;", "status", "Leo0/j;", "caseId", "Lfo0/j;", "threadId", "Ljava/time/OffsetDateTime;", "submissionDate", "receiptDate", "Lfo0/e;", "labels", "Lfo0/b;", "correlationId", "Lfo0/g;", "type", "receiptConfirmation", "Lfo0/h;", "receiptStatus", "nextPageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLfo0/d;Ljava/util/List;Leo0/y0;Lfo0/i;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/lang/String;Lfo0/g;ZLfo0/h;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "m", "c", "Z", "g", "()Z", "d", "Lfo0/d;", "()Lfo0/d;", "Ljava/util/List;", "p", "()Ljava/util/List;", "f", "Leo0/y0;", "k", "()Leo0/y0;", "Lfo0/i;", "l", "()Lfo0/i;", "h", "i", "o", "j", "Ljava/time/OffsetDateTime;", "n", "()Ljava/time/OffsetDateTime;", "Lfo0/g;", "q", "()Lfo0/g;", "Lfo0/h;", "()Lfo0/h;", "t", "isInboxMessage", "u", "isSentMessage", "s", "isEpuapMessage", "r", "isEdorMessage", "v", "isStub", "w", "isUPD", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean opened;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DeliveryMessageAddress from;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<DeliveryMessageAddress> to;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y0 serviceType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Status status;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String caseId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String threadId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final OffsetDateTime submissionDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final OffsetDateTime receiptDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<MessageLabel> labels;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String correlationId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final g type;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean receiptConfirmation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final h receiptStatus;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String nextPageId;

    public /* synthetic */ c(String str, String str2, boolean z15, DeliveryMessageAddress deliveryMessageAddress, List list, y0 y0Var, Status status, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, List list2, String str5, g gVar, boolean z16, h hVar, String str6, k kVar) {
        this(str, str2, z15, deliveryMessageAddress, list, y0Var, status, str3, str4, offsetDateTime, offsetDateTime2, list2, str5, gVar, z16, hVar, str6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaseId() {
        return this.caseId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DeliveryMessageAddress getFrom() {
        return this.from;
    }

    public final List<MessageLabel> d() {
        return this.labels;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    public boolean equals(Object other) {
        boolean zC;
        boolean zB;
        boolean zB2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        if (!g0.d(this.messageId, cVar.messageId) || !t.c(this.subject, cVar.subject) || this.opened != cVar.opened || !t.c(this.from, cVar.from) || !t.c(this.to, cVar.to) || this.serviceType != cVar.serviceType || !t.c(this.status, cVar.status)) {
            return false;
        }
        String str = this.caseId;
        String str2 = cVar.caseId;
        if (str == null) {
            if (str2 == null) {
                zC = true;
            } else {
                zC = false;
            }
        } else if (str2 == null) {
            zC = false;
        } else {
            zC = eo0.j.c(str, str2);
        }
        if (!zC) {
            return false;
        }
        String str3 = this.threadId;
        String str4 = cVar.threadId;
        if (str3 == null) {
            if (str4 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str4 == null) {
            zB = false;
        } else {
            zB = j.b(str3, str4);
        }
        if (!zB || !t.c(this.submissionDate, cVar.submissionDate) || !t.c(this.receiptDate, cVar.receiptDate) || !t.c(this.labels, cVar.labels)) {
            return false;
        }
        String str5 = this.correlationId;
        String str6 = cVar.correlationId;
        if (str5 == null) {
            if (str6 == null) {
                zB2 = true;
            } else {
                zB2 = false;
            }
        } else if (str6 == null) {
            zB2 = false;
        } else {
            zB2 = b.b(str5, str6);
        }
        return zB2 && this.type == cVar.type && this.receiptConfirmation == cVar.receiptConfirmation && t.c(this.receiptStatus, cVar.receiptStatus) && t.c(this.nextPageId, cVar.nextPageId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
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
        int iE = g0.e(this.messageId) * 31;
        String str = this.subject;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.opened)) * 31;
        DeliveryMessageAddress deliveryMessageAddress = this.from;
        int iHashCode2 = (iHashCode + (deliveryMessageAddress == null ? 0 : deliveryMessageAddress.hashCode())) * 31;
        List<DeliveryMessageAddress> list = this.to;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.serviceType.hashCode()) * 31;
        Status status = this.status;
        int iHashCode4 = (iHashCode3 + (status == null ? 0 : status.hashCode())) * 31;
        String str2 = this.caseId;
        int iD = (iHashCode4 + (str2 == null ? 0 : eo0.j.d(str2))) * 31;
        String str3 = this.threadId;
        int iC = (iD + (str3 == null ? 0 : j.c(str3))) * 31;
        OffsetDateTime offsetDateTime = this.submissionDate;
        int iHashCode5 = (iC + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.receiptDate;
        int iHashCode6 = (((iHashCode5 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31) + this.labels.hashCode()) * 31;
        String str4 = this.correlationId;
        int iC2 = (((((iHashCode6 + (str4 == null ? 0 : b.c(str4))) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.receiptConfirmation)) * 31;
        h hVar = this.receiptStatus;
        int iHashCode7 = (iC2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str5 = this.nextPageId;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final OffsetDateTime getReceiptDate() {
        return this.receiptDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h getReceiptStatus() {
        return this.receiptStatus;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final y0 getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final OffsetDateTime getSubmissionDate() {
        return this.submissionDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    public final List<DeliveryMessageAddress> p() {
        return this.to;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final g getType() {
        return this.type;
    }

    public final boolean r() {
        return this.serviceType == y0.E_DELIVERY;
    }

    public final boolean s() {
        return this.serviceType == y0.E_PUAP;
    }

    public final boolean t() {
        List<MessageLabel> list = this.labels;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((MessageLabel) it.next()).getType() == f.INBOX) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String strF = g0.f(this.messageId);
        String str = this.subject;
        boolean z15 = this.opened;
        DeliveryMessageAddress deliveryMessageAddress = this.from;
        List<DeliveryMessageAddress> list = this.to;
        y0 y0Var = this.serviceType;
        Status status = this.status;
        String str2 = this.caseId;
        String strE = str2 == null ? "null" : eo0.j.e(str2);
        String str3 = this.threadId;
        String strD = str3 == null ? "null" : j.d(str3);
        OffsetDateTime offsetDateTime = this.submissionDate;
        OffsetDateTime offsetDateTime2 = this.receiptDate;
        List<MessageLabel> list2 = this.labels;
        String str4 = this.correlationId;
        return "DeliveryMessage(messageId=" + strF + ", subject=" + str + ", opened=" + z15 + ", from=" + deliveryMessageAddress + ", to=" + list + ", serviceType=" + y0Var + ", status=" + status + ", caseId=" + strE + ", threadId=" + strD + ", submissionDate=" + offsetDateTime + ", receiptDate=" + offsetDateTime2 + ", labels=" + list2 + ", correlationId=" + (str4 != null ? b.d(str4) : "null") + ", type=" + this.type + ", receiptConfirmation=" + this.receiptConfirmation + ", receiptStatus=" + this.receiptStatus + ", nextPageId=" + this.nextPageId + ")";
    }

    public final boolean u() {
        List<MessageLabel> list = this.labels;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((MessageLabel) it.next()).getType() == f.SENT) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.type == g.STUB;
    }

    public final boolean w() {
        return this.type == g.EVIDENCE && s();
    }

    private c(String str, String str2, boolean z15, DeliveryMessageAddress deliveryMessageAddress, List<DeliveryMessageAddress> list, y0 y0Var, Status status, String str3, String str4, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, List<MessageLabel> list2, String str5, g gVar, boolean z16, h hVar, String str6) {
        this.messageId = str;
        this.subject = str2;
        this.opened = z15;
        this.from = deliveryMessageAddress;
        this.to = list;
        this.serviceType = y0Var;
        this.status = status;
        this.caseId = str3;
        this.threadId = str4;
        this.submissionDate = offsetDateTime;
        this.receiptDate = offsetDateTime2;
        this.labels = list2;
        this.correlationId = str5;
        this.type = gVar;
        this.receiptConfirmation = z16;
        this.receiptStatus = hVar;
        this.nextPageId = str6;
    }
}
