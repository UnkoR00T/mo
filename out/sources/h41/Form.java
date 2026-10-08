package h41;

import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h41.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lh41/b;", "", "", "areMultipleChildren", "", "Lbl0/p;", "availableMunicipalOffices", "Lbl0/l;", "availableCivilRegistryOffices", "Lh41/f;", "fields", "<init>", "(ZLjava/util/List;Lbl0/l;Lh41/f;)V", "a", "(ZLjava/util/List;Lbl0/l;Lh41/f;)Lh41/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lbl0/l;", "d", "()Lbl0/l;", "Lh41/f;", "f", "()Lh41/f;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Form {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean areMultipleChildren;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEChildBirthRegistrationMunicipalOffice> availableMunicipalOffices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationCivilRegistryOffices availableCivilRegistryOffices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BirthPlaceOfficeFields fields;

    public Form(boolean z15, List<BEChildBirthRegistrationMunicipalOffice> list, BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices, BirthPlaceOfficeFields birthPlaceOfficeFields) {
        this.areMultipleChildren = z15;
        this.availableMunicipalOffices = list;
        this.availableCivilRegistryOffices = bEChildBirthRegistrationCivilRegistryOffices;
        this.fields = birthPlaceOfficeFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Form b(Form form, boolean z15, List list, BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices, BirthPlaceOfficeFields birthPlaceOfficeFields, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = form.areMultipleChildren;
        }
        if ((i15 & 2) != 0) {
            list = form.availableMunicipalOffices;
        }
        if ((i15 & 4) != 0) {
            bEChildBirthRegistrationCivilRegistryOffices = form.availableCivilRegistryOffices;
        }
        if ((i15 & 8) != 0) {
            birthPlaceOfficeFields = form.fields;
        }
        return form.a(z15, list, bEChildBirthRegistrationCivilRegistryOffices, birthPlaceOfficeFields);
    }

    public final Form a(boolean areMultipleChildren, List<BEChildBirthRegistrationMunicipalOffice> availableMunicipalOffices, BEChildBirthRegistrationCivilRegistryOffices availableCivilRegistryOffices, BirthPlaceOfficeFields fields) {
        return new Form(areMultipleChildren, availableMunicipalOffices, availableCivilRegistryOffices, fields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAreMultipleChildren() {
        return this.areMultipleChildren;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEChildBirthRegistrationCivilRegistryOffices getAvailableCivilRegistryOffices() {
        return this.availableCivilRegistryOffices;
    }

    public final List<BEChildBirthRegistrationMunicipalOffice> e() {
        return this.availableMunicipalOffices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return this.areMultipleChildren == form.areMultipleChildren && fr.t.c(this.availableMunicipalOffices, form.availableMunicipalOffices) && fr.t.c(this.availableCivilRegistryOffices, form.availableCivilRegistryOffices) && fr.t.c(this.fields, form.fields);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BirthPlaceOfficeFields getFields() {
        return this.fields;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.areMultipleChildren) * 31) + this.availableMunicipalOffices.hashCode()) * 31;
        BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices = this.availableCivilRegistryOffices;
        return ((iHashCode + (bEChildBirthRegistrationCivilRegistryOffices == null ? 0 : bEChildBirthRegistrationCivilRegistryOffices.hashCode())) * 31) + this.fields.hashCode();
    }

    public String toString() {
        return "Form(areMultipleChildren=" + this.areMultipleChildren + ", availableMunicipalOffices=" + this.availableMunicipalOffices + ", availableCivilRegistryOffices=" + this.availableCivilRegistryOffices + ", fields=" + this.fields + ')';
    }
}
