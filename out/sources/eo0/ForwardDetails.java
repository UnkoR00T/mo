package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.f0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Leo0/f0;", "", "", "Leo0/y;", "attachmentIds", "Leo0/r;", "directoryId", "Leo0/g0;", "messageId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForwardDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<y> attachmentIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageId;

    public /* synthetic */ ForwardDetails(List list, String str, String str2, fr.k kVar) {
        this(list, str, str2);
    }

    public final List<y> a() {
        return this.attachmentIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDirectoryId() {
        return this.directoryId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForwardDetails)) {
            return false;
        }
        ForwardDetails forwardDetails = (ForwardDetails) other;
        return fr.t.c(this.attachmentIds, forwardDetails.attachmentIds) && r.d(this.directoryId, forwardDetails.directoryId) && g0.d(this.messageId, forwardDetails.messageId);
    }

    public int hashCode() {
        return (((this.attachmentIds.hashCode() * 31) + r.e(this.directoryId)) * 31) + g0.e(this.messageId);
    }

    public String toString() {
        return "ForwardDetails(attachmentIds=" + this.attachmentIds + ", directoryId=" + r.f(this.directoryId) + ", messageId=" + g0.f(this.messageId) + ")";
    }

    private ForwardDetails(List<y> list, String str, String str2) {
        this.attachmentIds = list;
        this.directoryId = str;
        this.messageId = str2;
    }
}
