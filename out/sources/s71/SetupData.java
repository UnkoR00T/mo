package s71;

import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.g0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s71.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ls71/b;", "", "Lcl0/g0;", "passportOfficePlace", "Lcl0/o;", "selectedCountry", "Lx71/a;", "contract", "<init>", "(Lcl0/g0;Lcl0/o;Lx71/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/g0;", "b", "()Lcl0/g0;", "Lcl0/o;", "c", "()Lcl0/o;", "Lx71/a;", "()Lx71/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0 passportOfficePlace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationCountryDictionary selectedCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final x71.a contract;

    public SetupData(g0 g0Var, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, x71.a aVar) {
        this.passportOfficePlace = g0Var;
        this.selectedCountry = bEPassportChildApplicationCountryDictionary;
        this.contract = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final x71.a getContract() {
        return this.contract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getPassportOfficePlace() {
        return this.passportOfficePlace;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEPassportChildApplicationCountryDictionary getSelectedCountry() {
        return this.selectedCountry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.passportOfficePlace == setupData.passportOfficePlace && fr.t.c(this.selectedCountry, setupData.selectedCountry) && fr.t.c(this.contract, setupData.contract);
    }

    public int hashCode() {
        g0 g0Var = this.passportOfficePlace;
        int iHashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary = this.selectedCountry;
        return ((iHashCode + (bEPassportChildApplicationCountryDictionary != null ? bEPassportChildApplicationCountryDictionary.hashCode() : 0)) * 31) + this.contract.hashCode();
    }

    public String toString() {
        return "SetupData(passportOfficePlace=" + this.passportOfficePlace + ", selectedCountry=" + this.selectedCountry + ", contract=" + this.contract + ')';
    }
}
