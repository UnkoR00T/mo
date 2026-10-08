package sb1;

import lc1.CorrespondenceAddressSelectionContractData;
import ld1.KnownUserDataModel;
import p071kotlin.Metadata;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lsb1/a;", "", "Lsb1/b;", "data", "Loq/i0;", "x7", "(Lsb1/b;)V", "Lld1/h;", "q", "()Lld1/h;", "knownUserData", "Lzd1/b;", "r", "()Lzd1/b;", "homeAddressData", "Llc1/b;", "k", "()Llc1/b;", "correspondenceAddressData", "Lzb1/b;", "E", "()Lzb1/b;", "businessAddressData", "n2", "()Lsb1/b;", "accountingDocumentAddress", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    BusinessAddressSelectionContractData E();

    CorrespondenceAddressSelectionContractData k();

    AccountingDocumentAddressSelectionContractData n2();

    KnownUserDataModel q();

    HomeAddressContractData r();

    void x7(AccountingDocumentAddressSelectionContractData data);
}
