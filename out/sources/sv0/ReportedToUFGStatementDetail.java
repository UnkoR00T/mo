package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.b0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006 "}, d2 = {"Lsv0/b0;", "", "", "insurerId", "Liy/b0;", "insurerName", "Lfz/b$f;", "reportAcceptanceDate", "fillFormClaimUrl", "phoneNumber", "<init>", "(Ljava/lang/String;Liy/b0;Lfz/b$f;Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInsurerId", "b", "Liy/b0;", "()Liy/b0;", "c", "Lfz/b$f;", "d", "()Lfz/b$f;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportedToUFGStatementDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insurerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 insurerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime reportAcceptanceDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fillFormClaimUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 phoneNumber;

    public ReportedToUFGStatementDetail(String str, iy.b0 b0Var, fz.b.OffsetDateTime offsetDateTime, String str2, iy.b0 b0Var2) {
        this.insurerId = str;
        this.insurerName = b0Var;
        this.reportAcceptanceDate = offsetDateTime;
        this.fillFormClaimUrl = str2;
        this.phoneNumber = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFillFormClaimUrl() {
        return this.fillFormClaimUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getInsurerName() {
        return this.insurerName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.OffsetDateTime getReportAcceptanceDate() {
        return this.reportAcceptanceDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportedToUFGStatementDetail)) {
            return false;
        }
        ReportedToUFGStatementDetail reportedToUFGStatementDetail = (ReportedToUFGStatementDetail) other;
        return fr.t.c(this.insurerId, reportedToUFGStatementDetail.insurerId) && fr.t.c(this.insurerName, reportedToUFGStatementDetail.insurerName) && fr.t.c(this.reportAcceptanceDate, reportedToUFGStatementDetail.reportAcceptanceDate) && fr.t.c(this.fillFormClaimUrl, reportedToUFGStatementDetail.fillFormClaimUrl) && fr.t.c(this.phoneNumber, reportedToUFGStatementDetail.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.insurerId.hashCode() * 31) + this.insurerName.hashCode()) * 31) + this.reportAcceptanceDate.hashCode()) * 31;
        String str = this.fillFormClaimUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        iy.b0 b0Var = this.phoneNumber;
        return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public String toString() {
        return "ReportedToUFGStatementDetail(insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", reportAcceptanceDate=" + this.reportAcceptanceDate + ", fillFormClaimUrl=" + this.fillFormClaimUrl + ", phoneNumber=" + this.phoneNumber + ")";
    }
}
