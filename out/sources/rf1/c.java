package rf1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lrf1/c;", "", "Lrf1/b;", "companyDetailsContractData", "<init>", "(Lrf1/b;)V", "a", "Lrf1/b;", "getCompanyDetailsContractData", "()Lrf1/b;", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements h00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CompanyDetailsContractData companyDetailsContractData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    public c(CompanyDetailsContractData companyDetailsContractData) {
        this.companyDetailsContractData = companyDetailsContractData;
        this.data = companyDetailsContractData;
    }

    @Override // h00.b
    public Object getData() {
        return this.data;
    }
}
