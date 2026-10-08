package bl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lbl0/p;", "", "", "hasElectronicDeliveryAddress", "", "name", "territorialCode", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationMunicipalOffice {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasElectronicDeliveryAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String territorialCode;

    public BEChildBirthRegistrationMunicipalOffice(boolean z15, String str, String str2) {
        this.hasElectronicDeliveryAddress = z15;
        this.name = str;
        this.territorialCode = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasElectronicDeliveryAddress() {
        return this.hasElectronicDeliveryAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTerritorialCode() {
        return this.territorialCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationMunicipalOffice)) {
            return false;
        }
        BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice = (BEChildBirthRegistrationMunicipalOffice) other;
        return this.hasElectronicDeliveryAddress == bEChildBirthRegistrationMunicipalOffice.hasElectronicDeliveryAddress && fr.t.c(this.name, bEChildBirthRegistrationMunicipalOffice.name) && fr.t.c(this.territorialCode, bEChildBirthRegistrationMunicipalOffice.territorialCode);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasElectronicDeliveryAddress) * 31) + this.name.hashCode()) * 31) + this.territorialCode.hashCode();
    }

    public String toString() {
        return "BEChildBirthRegistrationMunicipalOffice(hasElectronicDeliveryAddress=" + this.hasElectronicDeliveryAddress + ", name=" + this.name + ", territorialCode=" + this.territorialCode + ")";
    }
}
