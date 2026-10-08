package un0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: un0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lun0/g;", "", "", "committeeId", "committeeName", "committeeNameAddress", "committeeSubjectElectionDistrictId", "committeeSubjectId", "committeeSubjectName", "committeeSubjectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCommitteeId", "b", "c", "getCommitteeNameAddress", "d", "getCommitteeSubjectElectionDistrictId", "e", "getCommitteeSubjectId", "f", "g", "getCommitteeSubjectType", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionSupportCommitteeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeNameAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeSubjectElectionDistrictId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeSubjectId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeSubjectName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeSubjectType;

    public ElectionSupportCommitteeData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.committeeId = str;
        this.committeeName = str2;
        this.committeeNameAddress = str3;
        this.committeeSubjectElectionDistrictId = str4;
        this.committeeSubjectId = str5;
        this.committeeSubjectName = str6;
        this.committeeSubjectType = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommitteeName() {
        return this.committeeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommitteeSubjectName() {
        return this.committeeSubjectName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectionSupportCommitteeData)) {
            return false;
        }
        ElectionSupportCommitteeData electionSupportCommitteeData = (ElectionSupportCommitteeData) other;
        return t.c(this.committeeId, electionSupportCommitteeData.committeeId) && t.c(this.committeeName, electionSupportCommitteeData.committeeName) && t.c(this.committeeNameAddress, electionSupportCommitteeData.committeeNameAddress) && t.c(this.committeeSubjectElectionDistrictId, electionSupportCommitteeData.committeeSubjectElectionDistrictId) && t.c(this.committeeSubjectId, electionSupportCommitteeData.committeeSubjectId) && t.c(this.committeeSubjectName, electionSupportCommitteeData.committeeSubjectName) && t.c(this.committeeSubjectType, electionSupportCommitteeData.committeeSubjectType);
    }

    public int hashCode() {
        return (((((((((((this.committeeId.hashCode() * 31) + this.committeeName.hashCode()) * 31) + this.committeeNameAddress.hashCode()) * 31) + this.committeeSubjectElectionDistrictId.hashCode()) * 31) + this.committeeSubjectId.hashCode()) * 31) + this.committeeSubjectName.hashCode()) * 31) + this.committeeSubjectType.hashCode();
    }

    public String toString() {
        return "ElectionSupportCommitteeData(committeeId=" + this.committeeId + ", committeeName=" + this.committeeName + ", committeeNameAddress=" + this.committeeNameAddress + ", committeeSubjectElectionDistrictId=" + this.committeeSubjectElectionDistrictId + ", committeeSubjectId=" + this.committeeSubjectId + ", committeeSubjectName=" + this.committeeSubjectName + ", committeeSubjectType=" + this.committeeSubjectType + ")";
    }
}
