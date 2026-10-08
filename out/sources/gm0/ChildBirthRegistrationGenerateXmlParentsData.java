package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.p0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lgm0/p0;", "", "Lgm0/q0;", "applicantData", "Lgm0/w0;", "statementType", "Lgm0/u0;", "secondParentData", "<init>", "(Lgm0/q0;Lgm0/w0;Lgm0/u0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/q0;", "getApplicantData", "()Lgm0/q0;", "b", "Lgm0/w0;", "getStatementType", "()Lgm0/w0;", "c", "Lgm0/u0;", "getSecondParentData", "()Lgm0/u0;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationGenerateXmlParentsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicantData")
    private final ChildBirthRegistrationGenerateXmlParentsDataApplicantData applicantData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statementType")
    private final w0 statementType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondParentData")
    private final ChildBirthRegistrationGenerateXmlParentsDataSecondParentData secondParentData;

    public ChildBirthRegistrationGenerateXmlParentsData(ChildBirthRegistrationGenerateXmlParentsDataApplicantData childBirthRegistrationGenerateXmlParentsDataApplicantData, w0 w0Var, ChildBirthRegistrationGenerateXmlParentsDataSecondParentData childBirthRegistrationGenerateXmlParentsDataSecondParentData) {
        this.applicantData = childBirthRegistrationGenerateXmlParentsDataApplicantData;
        this.statementType = w0Var;
        this.secondParentData = childBirthRegistrationGenerateXmlParentsDataSecondParentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationGenerateXmlParentsData)) {
            return false;
        }
        ChildBirthRegistrationGenerateXmlParentsData childBirthRegistrationGenerateXmlParentsData = (ChildBirthRegistrationGenerateXmlParentsData) other;
        return fr.t.c(this.applicantData, childBirthRegistrationGenerateXmlParentsData.applicantData) && this.statementType == childBirthRegistrationGenerateXmlParentsData.statementType && fr.t.c(this.secondParentData, childBirthRegistrationGenerateXmlParentsData.secondParentData);
    }

    public int hashCode() {
        int iHashCode = ((this.applicantData.hashCode() * 31) + this.statementType.hashCode()) * 31;
        ChildBirthRegistrationGenerateXmlParentsDataSecondParentData childBirthRegistrationGenerateXmlParentsDataSecondParentData = this.secondParentData;
        return iHashCode + (childBirthRegistrationGenerateXmlParentsDataSecondParentData == null ? 0 : childBirthRegistrationGenerateXmlParentsDataSecondParentData.hashCode());
    }

    public String toString() {
        return "ChildBirthRegistrationGenerateXmlParentsData(applicantData=" + this.applicantData + ", statementType=" + this.statementType + ", secondParentData=" + this.secondParentData + ')';
    }
}
