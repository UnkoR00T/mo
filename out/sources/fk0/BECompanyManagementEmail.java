package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0011\u0010\n¨\u0006\u0019"}, d2 = {"Lfk0/d0;", "", "", "noAddress", "publishConsent", "", "email", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECompanyManagementEmail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean noAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean publishConsent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    public BECompanyManagementEmail(boolean z15, Boolean bool, String str) {
        this.noAddress = z15;
        this.publishConsent = bool;
        this.email = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNoAddress() {
        return this.noAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getPublishConsent() {
        return this.publishConsent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECompanyManagementEmail)) {
            return false;
        }
        BECompanyManagementEmail bECompanyManagementEmail = (BECompanyManagementEmail) other;
        return this.noAddress == bECompanyManagementEmail.noAddress && fr.t.c(this.publishConsent, bECompanyManagementEmail.publishConsent) && fr.t.c(this.email, bECompanyManagementEmail.email);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.noAddress) * 31;
        Boolean bool = this.publishConsent;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.email;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BECompanyManagementEmail(noAddress=" + this.noAddress + ", publishConsent=" + this.publishConsent + ", email=" + this.email + ')';
    }
}
