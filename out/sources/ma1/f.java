package ma1;

import na1.CompanySuspensionOptions;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lma1/f;", "", "Lma1/g;", "info", "", "ownerAdult", "Lma1/e;", "companyData", "Lna1/b;", "suspensionOptions", "<init>", "(Lma1/g;ZLma1/e;Lna1/b;)V", "a", "Lma1/g;", "b", "()Lma1/g;", "Z", "c", "()Z", "Lma1/e;", "()Lma1/e;", "d", "Lna1/b;", "()Lna1/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CompanyInfo info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean ownerAdult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CompanyData companyData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CompanySuspensionOptions suspensionOptions;

    public f(CompanyInfo companyInfo, boolean z15, CompanyData companyData, CompanySuspensionOptions companySuspensionOptions) {
        this.info = companyInfo;
        this.ownerAdult = z15;
        this.companyData = companyData;
        this.suspensionOptions = companySuspensionOptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CompanyData getCompanyData() {
        return this.companyData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CompanyInfo getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOwnerAdult() {
        return this.ownerAdult;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CompanySuspensionOptions getSuspensionOptions() {
        return this.suspensionOptions;
    }
}
