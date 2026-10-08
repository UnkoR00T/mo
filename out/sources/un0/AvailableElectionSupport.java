package un0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: un0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lun0/a;", "", "", "Lun0/g;", "committees", "", "electionActionDate", "electionActionId", "electionActionName", "Lun0/e;", "electionActionType", "supportDeadline", "committeeSubjectDistrictName", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lun0/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getElectionActionDate", "c", "getElectionActionId", "d", "e", "Lun0/e;", "()Lun0/e;", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableElectionSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ElectionSupportCommitteeData> committees;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electionActionDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electionActionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electionActionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final e electionActionType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String supportDeadline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String committeeSubjectDistrictName;

    public AvailableElectionSupport(List<ElectionSupportCommitteeData> list, String str, String str2, String str3, e eVar, String str4, String str5) {
        this.committees = list;
        this.electionActionDate = str;
        this.electionActionId = str2;
        this.electionActionName = str3;
        this.electionActionType = eVar;
        this.supportDeadline = str4;
        this.committeeSubjectDistrictName = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommitteeSubjectDistrictName() {
        return this.committeeSubjectDistrictName;
    }

    public final List<ElectionSupportCommitteeData> b() {
        return this.committees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getElectionActionName() {
        return this.electionActionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getElectionActionType() {
        return this.electionActionType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSupportDeadline() {
        return this.supportDeadline;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableElectionSupport)) {
            return false;
        }
        AvailableElectionSupport availableElectionSupport = (AvailableElectionSupport) other;
        return t.c(this.committees, availableElectionSupport.committees) && t.c(this.electionActionDate, availableElectionSupport.electionActionDate) && t.c(this.electionActionId, availableElectionSupport.electionActionId) && t.c(this.electionActionName, availableElectionSupport.electionActionName) && this.electionActionType == availableElectionSupport.electionActionType && t.c(this.supportDeadline, availableElectionSupport.supportDeadline) && t.c(this.committeeSubjectDistrictName, availableElectionSupport.committeeSubjectDistrictName);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.committees.hashCode() * 31) + this.electionActionDate.hashCode()) * 31) + this.electionActionId.hashCode()) * 31) + this.electionActionName.hashCode()) * 31) + this.electionActionType.hashCode()) * 31) + this.supportDeadline.hashCode()) * 31;
        String str = this.committeeSubjectDistrictName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AvailableElectionSupport(committees=" + this.committees + ", electionActionDate=" + this.electionActionDate + ", electionActionId=" + this.electionActionId + ", electionActionName=" + this.electionActionName + ", electionActionType=" + this.electionActionType + ", supportDeadline=" + this.supportDeadline + ", committeeSubjectDistrictName=" + this.committeeSubjectDistrictName + ")";
    }
}
