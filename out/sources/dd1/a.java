package dd1;

import df1.SocialInsuranceSelectionContractData;
import h00.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldd1/a;", "", "Ldf1/b;", "socialInsuranceSelectionContractData", "<init>", "(Ldf1/b;)V", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    public a(SocialInsuranceSelectionContractData socialInsuranceSelectionContractData) {
        this.data = socialInsuranceSelectionContractData;
    }

    @Override // h00.b
    public Object getData() {
        return this.data;
    }
}
