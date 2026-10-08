package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"Leo0/v;", "", "", "subject", "", "Leo0/k0;", "to", "Leo0/j;", "caseId", "textBody", "Lfo0/j;", "threadId", "Leo0/f0;", "forwardDetails", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/f0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "e", "Leo0/f0;", "()Leo0/f0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String subject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Recipient> to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String caseId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String textBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String threadId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ForwardDetails forwardDetails;

    public /* synthetic */ v(String str, List list, String str2, String str3, String str4, ForwardDetails forwardDetails, fr.k kVar) {
        this(str, list, str2, str3, str4, forwardDetails);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaseId() {
        return this.caseId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ForwardDetails getForwardDetails() {
        return this.forwardDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTextBody() {
        return this.textBody;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    public boolean equals(Object other) {
        boolean zC;
        boolean zB;
        if (this == other) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        if (!fr.t.c(this.subject, vVar.subject) || !fr.t.c(this.to, vVar.to)) {
            return false;
        }
        String str = this.caseId;
        String str2 = vVar.caseId;
        if (str == null) {
            if (str2 == null) {
                zC = true;
            } else {
                zC = false;
            }
        } else if (str2 == null) {
            zC = false;
        } else {
            zC = j.c(str, str2);
        }
        if (!zC || !fr.t.c(this.textBody, vVar.textBody)) {
            return false;
        }
        String str3 = this.threadId;
        String str4 = vVar.threadId;
        if (str3 == null) {
            if (str4 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str4 == null) {
            zB = false;
        } else {
            zB = fo0.j.b(str3, str4);
        }
        return zB && fr.t.c(this.forwardDetails, vVar.forwardDetails);
    }

    public final List<Recipient> f() {
        return this.to;
    }

    public int hashCode() {
        String str = this.subject;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.to.hashCode()) * 31;
        String str2 = this.caseId;
        int iD = (iHashCode + (str2 == null ? 0 : j.d(str2))) * 31;
        String str3 = this.textBody;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threadId;
        int iC = (iHashCode2 + (str4 == null ? 0 : fo0.j.c(str4))) * 31;
        ForwardDetails forwardDetails = this.forwardDetails;
        return iC + (forwardDetails != null ? forwardDetails.hashCode() : 0);
    }

    public String toString() {
        String str = this.subject;
        List<Recipient> list = this.to;
        String str2 = this.caseId;
        String strE = str2 == null ? "null" : j.e(str2);
        String str3 = this.textBody;
        String str4 = this.threadId;
        return "EdeliveryDraftMessageRequest(subject=" + str + ", to=" + list + ", caseId=" + strE + ", textBody=" + str3 + ", threadId=" + (str4 != null ? fo0.j.d(str4) : "null") + ", forwardDetails=" + this.forwardDetails + ")";
    }

    private v(String str, List<Recipient> list, String str2, String str3, String str4, ForwardDetails forwardDetails) {
        this.subject = str;
        this.to = list;
        this.caseId = str2;
        this.textBody = str3;
        this.threadId = str4;
        this.forwardDetails = forwardDetails;
    }
}
