package bl0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lbl0/f;", "", "", "Lbl0/p;", "availableMunicipalOffices", "Lbl0/l;", "availableCivilRegistryOffices", "chosenMunicipalOffice", "Lbl0/l$a;", "chosenCivilRegistryOffice", "<init>", "(Ljava/util/List;Lbl0/l;Lbl0/p;Lbl0/l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lbl0/l;", "()Lbl0/l;", "c", "Lbl0/p;", "d", "()Lbl0/p;", "Lbl0/l$a;", "()Lbl0/l$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthPlaceOfBirthOffices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEChildBirthRegistrationMunicipalOffice> availableMunicipalOffices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationCivilRegistryOffices availableCivilRegistryOffices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationMunicipalOffice chosenMunicipalOffice;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationCivilRegistryOffices.Office chosenCivilRegistryOffice;

    public BEChildBirthPlaceOfBirthOffices(List<BEChildBirthRegistrationMunicipalOffice> list, BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices, BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, BEChildBirthRegistrationCivilRegistryOffices.Office office) {
        this.availableMunicipalOffices = list;
        this.availableCivilRegistryOffices = bEChildBirthRegistrationCivilRegistryOffices;
        this.chosenMunicipalOffice = bEChildBirthRegistrationMunicipalOffice;
        this.chosenCivilRegistryOffice = office;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEChildBirthRegistrationCivilRegistryOffices getAvailableCivilRegistryOffices() {
        return this.availableCivilRegistryOffices;
    }

    public final List<BEChildBirthRegistrationMunicipalOffice> b() {
        return this.availableMunicipalOffices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEChildBirthRegistrationCivilRegistryOffices.Office getChosenCivilRegistryOffice() {
        return this.chosenCivilRegistryOffice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEChildBirthRegistrationMunicipalOffice getChosenMunicipalOffice() {
        return this.chosenMunicipalOffice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthPlaceOfBirthOffices)) {
            return false;
        }
        BEChildBirthPlaceOfBirthOffices bEChildBirthPlaceOfBirthOffices = (BEChildBirthPlaceOfBirthOffices) other;
        return fr.t.c(this.availableMunicipalOffices, bEChildBirthPlaceOfBirthOffices.availableMunicipalOffices) && fr.t.c(this.availableCivilRegistryOffices, bEChildBirthPlaceOfBirthOffices.availableCivilRegistryOffices) && fr.t.c(this.chosenMunicipalOffice, bEChildBirthPlaceOfBirthOffices.chosenMunicipalOffice) && fr.t.c(this.chosenCivilRegistryOffice, bEChildBirthPlaceOfBirthOffices.chosenCivilRegistryOffice);
    }

    public int hashCode() {
        return (((((this.availableMunicipalOffices.hashCode() * 31) + this.availableCivilRegistryOffices.hashCode()) * 31) + this.chosenMunicipalOffice.hashCode()) * 31) + this.chosenCivilRegistryOffice.hashCode();
    }

    public String toString() {
        return "BEChildBirthPlaceOfBirthOffices(availableMunicipalOffices=" + this.availableMunicipalOffices + ", availableCivilRegistryOffices=" + this.availableCivilRegistryOffices + ", chosenMunicipalOffice=" + this.chosenMunicipalOffice + ", chosenCivilRegistryOffice=" + this.chosenCivilRegistryOffice + ")";
    }
}
