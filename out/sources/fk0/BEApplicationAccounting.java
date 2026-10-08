package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\r¨\u0006\u001f"}, d2 = {"Lfk0/a;", "", "Lfk0/b;", "documentationStorageAddress", "", "taxOfficeHeadName", "Lfk0/n;", "taxType", "externalOperatorName", "externalOperatorNip", "<init>", "(Lfk0/b;Ljava/lang/String;Lfk0/n;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/b;", "()Lfk0/b;", "b", "Ljava/lang/String;", "d", "c", "Lfk0/n;", "e", "()Lfk0/n;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationAccounting {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationAddress documentationStorageAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taxOfficeHeadName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final n taxType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalOperatorName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalOperatorNip;

    public BEApplicationAccounting(BEApplicationAddress bEApplicationAddress, String str, n nVar, String str2, String str3) {
        this.documentationStorageAddress = bEApplicationAddress;
        this.taxOfficeHeadName = str;
        this.taxType = nVar;
        this.externalOperatorName = str2;
        this.externalOperatorNip = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicationAddress getDocumentationStorageAddress() {
        return this.documentationStorageAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExternalOperatorName() {
        return this.externalOperatorName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExternalOperatorNip() {
        return this.externalOperatorNip;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTaxOfficeHeadName() {
        return this.taxOfficeHeadName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n getTaxType() {
        return this.taxType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationAccounting)) {
            return false;
        }
        BEApplicationAccounting bEApplicationAccounting = (BEApplicationAccounting) other;
        return fr.t.c(this.documentationStorageAddress, bEApplicationAccounting.documentationStorageAddress) && fr.t.c(this.taxOfficeHeadName, bEApplicationAccounting.taxOfficeHeadName) && this.taxType == bEApplicationAccounting.taxType && fr.t.c(this.externalOperatorName, bEApplicationAccounting.externalOperatorName) && fr.t.c(this.externalOperatorNip, bEApplicationAccounting.externalOperatorNip);
    }

    public int hashCode() {
        int iHashCode = ((((this.documentationStorageAddress.hashCode() * 31) + this.taxOfficeHeadName.hashCode()) * 31) + this.taxType.hashCode()) * 31;
        String str = this.externalOperatorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.externalOperatorNip;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicationAccounting(documentationStorageAddress=" + this.documentationStorageAddress + ", taxOfficeHeadName=" + this.taxOfficeHeadName + ", taxType=" + this.taxType + ", externalOperatorName=" + this.externalOperatorName + ", externalOperatorNip=" + this.externalOperatorNip + ')';
    }
}
