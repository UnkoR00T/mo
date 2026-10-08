package ag1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ag1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lag1/e;", "", "Lbg1/a;", "contract", "", "isCompanyNewContactEnabled", "hasNoEmail", "<init>", "(Lbg1/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbg1/a;", "()Lbg1/a;", "b", "Z", "c", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final bg1.a contract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCompanyNewContactEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasNoEmail;

    public SetupData(bg1.a aVar, boolean z15, boolean z16) {
        this.contract = aVar;
        this.isCompanyNewContactEnabled = z15;
        this.hasNoEmail = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final bg1.a getContract() {
        return this.contract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasNoEmail() {
        return this.hasNoEmail;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsCompanyNewContactEnabled() {
        return this.isCompanyNewContactEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.contract, setupData.contract) && this.isCompanyNewContactEnabled == setupData.isCompanyNewContactEnabled && this.hasNoEmail == setupData.hasNoEmail;
    }

    public int hashCode() {
        return (((this.contract.hashCode() * 31) + Boolean.hashCode(this.isCompanyNewContactEnabled)) * 31) + Boolean.hashCode(this.hasNoEmail);
    }

    public String toString() {
        return "SetupData(contract=" + this.contract + ", isCompanyNewContactEnabled=" + this.isCompanyNewContactEnabled + ", hasNoEmail=" + this.hasNoEmail + ')';
    }
}
