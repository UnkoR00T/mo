package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lfk0/a0;", "", "Lfk0/b0;", "info", "", "ownerAdult", "Lfk0/x;", "companyData", "Lfk0/k0;", "suspensionOptions", "<init>", "(Lfk0/b0;ZLfk0/x;Lfk0/k0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/b0;", "b", "()Lfk0/b0;", "Z", "c", "()Z", "Lfk0/x;", "()Lfk0/x;", "d", "Lfk0/k0;", "()Lfk0/k0;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECompanyDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECompanyInfo info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ownerAdult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECompanyData companyData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECompanySuspensionOptions suspensionOptions;

    public BECompanyDetails(BECompanyInfo bECompanyInfo, boolean z15, BECompanyData bECompanyData, BECompanySuspensionOptions bECompanySuspensionOptions) {
        this.info = bECompanyInfo;
        this.ownerAdult = z15;
        this.companyData = bECompanyData;
        this.suspensionOptions = bECompanySuspensionOptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BECompanyData getCompanyData() {
        return this.companyData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BECompanyInfo getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOwnerAdult() {
        return this.ownerAdult;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BECompanySuspensionOptions getSuspensionOptions() {
        return this.suspensionOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECompanyDetails)) {
            return false;
        }
        BECompanyDetails bECompanyDetails = (BECompanyDetails) other;
        return fr.t.c(this.info, bECompanyDetails.info) && this.ownerAdult == bECompanyDetails.ownerAdult && fr.t.c(this.companyData, bECompanyDetails.companyData) && fr.t.c(this.suspensionOptions, bECompanyDetails.suspensionOptions);
    }

    public int hashCode() {
        int iHashCode = ((this.info.hashCode() * 31) + Boolean.hashCode(this.ownerAdult)) * 31;
        BECompanyData bECompanyData = this.companyData;
        int iHashCode2 = (iHashCode + (bECompanyData == null ? 0 : bECompanyData.hashCode())) * 31;
        BECompanySuspensionOptions bECompanySuspensionOptions = this.suspensionOptions;
        return iHashCode2 + (bECompanySuspensionOptions != null ? bECompanySuspensionOptions.hashCode() : 0);
    }

    public String toString() {
        return "BECompanyDetails(info=" + this.info + ", ownerAdult=" + this.ownerAdult + ", companyData=" + this.companyData + ", suspensionOptions=" + this.suspensionOptions + ')';
    }
}
