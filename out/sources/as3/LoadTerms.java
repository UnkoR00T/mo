package as3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: as3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Las3/a;", "", "", "departmentId", "", "topicId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadTerms {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long departmentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topicId;

    public LoadTerms(Long l15, String str) {
        this.departmentId = l15;
        this.topicId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDepartmentId() {
        return this.departmentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTopicId() {
        return this.topicId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadTerms)) {
            return false;
        }
        LoadTerms loadTerms = (LoadTerms) other;
        return fr.t.c(this.departmentId, loadTerms.departmentId) && fr.t.c(this.topicId, loadTerms.topicId);
    }

    public int hashCode() {
        Long l15 = this.departmentId;
        int iHashCode = (l15 == null ? 0 : l15.hashCode()) * 31;
        String str = this.topicId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LoadTerms(departmentId=" + this.departmentId + ", topicId=" + this.topicId + ')';
    }
}
