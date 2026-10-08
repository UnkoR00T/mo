package hb1;

import fr.k;
import fr.t;
import ld1.CompanyApplicationCitizenAddress;
import p071kotlin.Metadata;
import st3.AddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhb1/c;", "", "Lst3/b;", "terytObject", "Lld1/d;", "backendObject", "<init>", "(Lst3/b;Lld1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "b", "()Lst3/b;", "Lld1/d;", "()Lld1/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AddressData terytObject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CompanyApplicationCitizenAddress backendObject;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CompanyApplicationCitizenAddress getBackendObject() {
        return this.backendObject;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AddressData getTerytObject() {
        return this.terytObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return t.c(this.terytObject, cVar.terytObject) && t.c(this.backendObject, cVar.backendObject);
    }

    public int hashCode() {
        AddressData addressData = this.terytObject;
        int iHashCode = (addressData == null ? 0 : addressData.hashCode()) * 31;
        CompanyApplicationCitizenAddress companyApplicationCitizenAddress = this.backendObject;
        return iHashCode + (companyApplicationCitizenAddress != null ? companyApplicationCitizenAddress.hashCode() : 0);
    }

    public String toString() {
        AddressData addressData = this.terytObject;
        if (addressData != null) {
            return st3.c.a(addressData);
        }
        CompanyApplicationCitizenAddress companyApplicationCitizenAddress = this.backendObject;
        return companyApplicationCitizenAddress != null ? companyApplicationCitizenAddress.a() : "";
    }

    public c(AddressData addressData, CompanyApplicationCitizenAddress companyApplicationCitizenAddress) {
        this.terytObject = addressData;
        this.backendObject = companyApplicationCitizenAddress;
    }

    public /* synthetic */ c(AddressData addressData, CompanyApplicationCitizenAddress companyApplicationCitizenAddress, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : addressData, (i15 & 2) != 0 ? null : companyApplicationCitizenAddress);
    }
}
