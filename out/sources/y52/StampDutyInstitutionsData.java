package y52;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y52.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Ly52/d;", "", "", "institutionName", "institutionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StampDutyInstitutionsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    public StampDutyInstitutionsData(String str, String str2) {
        this.institutionName = str;
        this.institutionId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StampDutyInstitutionsData)) {
            return false;
        }
        StampDutyInstitutionsData stampDutyInstitutionsData = (StampDutyInstitutionsData) other;
        return t.c(this.institutionName, stampDutyInstitutionsData.institutionName) && t.c(this.institutionId, stampDutyInstitutionsData.institutionId);
    }

    public int hashCode() {
        return (this.institutionName.hashCode() * 31) + this.institutionId.hashCode();
    }

    public String toString() {
        return "StampDutyInstitutionsData(institutionName=" + this.institutionName + ", institutionId=" + this.institutionId + ')';
    }
}
