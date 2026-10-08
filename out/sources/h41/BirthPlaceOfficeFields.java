package h41;

import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h41.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lh41/f;", "", "Lh41/f$a$b;", "chosenMunicipalOffice", "Lh41/f$a$a;", "chosenCivilRegistryOffice", "<init>", "(Lh41/f$a$b;Lh41/f$a$a;)V", "", "Lh41/f$a;", "c", "()Ljava/util/List;", "", "g", "()Z", "Lh41/f$b;", "f", "()Lh41/f$b;", "a", "(Lh41/f$a$b;Lh41/f$a$a;)Lh41/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lh41/f$a$b;", "e", "()Lh41/f$a$b;", "b", "Lh41/f$a$a;", "d", "()Lh41/f$a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BirthPlaceOfficeFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.MunicipalOffice chosenMunicipalOffice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.CivilRegistryOffice chosenCivilRegistryOffice;

    /* JADX INFO: renamed from: h41.f$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lh41/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        MUNICIPAL_OFFICE,
        CIVIL_REGISTRY_OFFICE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f80869d = wq.b.a(b());
    }

    public BirthPlaceOfficeFields(a.MunicipalOffice municipalOffice, a.CivilRegistryOffice civilRegistryOffice) {
        this.chosenMunicipalOffice = municipalOffice;
        this.chosenCivilRegistryOffice = civilRegistryOffice;
    }

    public static /* synthetic */ BirthPlaceOfficeFields b(BirthPlaceOfficeFields birthPlaceOfficeFields, a.MunicipalOffice municipalOffice, a.CivilRegistryOffice civilRegistryOffice, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            municipalOffice = birthPlaceOfficeFields.chosenMunicipalOffice;
        }
        if ((i15 & 2) != 0) {
            civilRegistryOffice = birthPlaceOfficeFields.chosenCivilRegistryOffice;
        }
        return birthPlaceOfficeFields.a(municipalOffice, civilRegistryOffice);
    }

    private final List<a> c() {
        return pq.v.q(this.chosenMunicipalOffice, this.chosenCivilRegistryOffice);
    }

    public final BirthPlaceOfficeFields a(a.MunicipalOffice chosenMunicipalOffice, a.CivilRegistryOffice chosenCivilRegistryOffice) {
        return new BirthPlaceOfficeFields(chosenMunicipalOffice, chosenCivilRegistryOffice);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a.CivilRegistryOffice getChosenCivilRegistryOffice() {
        return this.chosenCivilRegistryOffice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a.MunicipalOffice getChosenMunicipalOffice() {
        return this.chosenMunicipalOffice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BirthPlaceOfficeFields)) {
            return false;
        }
        BirthPlaceOfficeFields birthPlaceOfficeFields = (BirthPlaceOfficeFields) other;
        return fr.t.c(this.chosenMunicipalOffice, birthPlaceOfficeFields.chosenMunicipalOffice) && fr.t.c(this.chosenCivilRegistryOffice, birthPlaceOfficeFields.chosenCivilRegistryOffice);
    }

    public final b f() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).getValidationState().a());
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public final boolean g() {
        List<a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).getValidationState().a()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.chosenMunicipalOffice.hashCode() * 31) + this.chosenCivilRegistryOffice.hashCode();
    }

    public String toString() {
        return "BirthPlaceOfficeFields(chosenMunicipalOffice=" + this.chosenMunicipalOffice + ", chosenCivilRegistryOffice=" + this.chosenCivilRegistryOffice + ')';
    }

    /* JADX INFO: renamed from: h41.f$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lh41/f$a;", "", "Lh41/f$b;", "a", "()Lh41/f$b;", "Lhz/b;", "b", "()Lhz/b;", "validationState", "Lh41/f$a$a;", "Lh41/f$a$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        b a();

        /* JADX INFO: renamed from: b */
        hz.b getValidationState();

        /* JADX INFO: renamed from: h41.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh41/f$a$a;", "Lh41/f$a;", "Lhz/b;", "validationState", "Lbl0/l$a;", "value", "<init>", "(Lhz/b;Lbl0/l$a;)V", "Lh41/f$b;", "a", "()Lh41/f$b;", "c", "(Lhz/b;Lbl0/l$a;)Lh41/f$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "b", "()Lhz/b;", "Lbl0/l$a;", "e", "()Lbl0/l$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CivilRegistryOffice implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEChildBirthRegistrationCivilRegistryOffices.Office value;

            public CivilRegistryOffice(hz.b bVar, BEChildBirthRegistrationCivilRegistryOffices.Office office) {
                this.validationState = bVar;
                this.value = office;
            }

            public static /* synthetic */ CivilRegistryOffice d(CivilRegistryOffice civilRegistryOffice, hz.b bVar, BEChildBirthRegistrationCivilRegistryOffices.Office office, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = civilRegistryOffice.validationState;
                }
                if ((i15 & 2) != 0) {
                    office = civilRegistryOffice.value;
                }
                return civilRegistryOffice.c(bVar, office);
            }

            @Override // h41.BirthPlaceOfficeFields.a
            public b a() {
                return b.CIVIL_REGISTRY_OFFICE;
            }

            @Override // h41.BirthPlaceOfficeFields.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final CivilRegistryOffice c(hz.b validationState, BEChildBirthRegistrationCivilRegistryOffices.Office value) {
                return new CivilRegistryOffice(validationState, value);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BEChildBirthRegistrationCivilRegistryOffices.Office getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CivilRegistryOffice)) {
                    return false;
                }
                CivilRegistryOffice civilRegistryOffice = (CivilRegistryOffice) other;
                return fr.t.c(this.validationState, civilRegistryOffice.validationState) && fr.t.c(this.value, civilRegistryOffice.value);
            }

            public int hashCode() {
                int iHashCode = this.validationState.hashCode() * 31;
                BEChildBirthRegistrationCivilRegistryOffices.Office office = this.value;
                return iHashCode + (office == null ? 0 : office.hashCode());
            }

            public String toString() {
                return "CivilRegistryOffice(validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public /* synthetic */ CivilRegistryOffice(hz.b bVar, BEChildBirthRegistrationCivilRegistryOffices.Office office, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, office);
            }
        }

        /* JADX INFO: renamed from: h41.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh41/f$a$b;", "Lh41/f$a;", "Lhz/b;", "validationState", "Lbl0/p;", "value", "<init>", "(Lhz/b;Lbl0/p;)V", "Lh41/f$b;", "a", "()Lh41/f$b;", "c", "(Lhz/b;Lbl0/p;)Lh41/f$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "b", "()Lhz/b;", "Lbl0/p;", "e", "()Lbl0/p;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MunicipalOffice implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEChildBirthRegistrationMunicipalOffice value;

            public MunicipalOffice(hz.b bVar, BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice) {
                this.validationState = bVar;
                this.value = bEChildBirthRegistrationMunicipalOffice;
            }

            public static /* synthetic */ MunicipalOffice d(MunicipalOffice municipalOffice, hz.b bVar, BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = municipalOffice.validationState;
                }
                if ((i15 & 2) != 0) {
                    bEChildBirthRegistrationMunicipalOffice = municipalOffice.value;
                }
                return municipalOffice.c(bVar, bEChildBirthRegistrationMunicipalOffice);
            }

            @Override // h41.BirthPlaceOfficeFields.a
            public b a() {
                return b.MUNICIPAL_OFFICE;
            }

            @Override // h41.BirthPlaceOfficeFields.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final MunicipalOffice c(hz.b validationState, BEChildBirthRegistrationMunicipalOffice value) {
                return new MunicipalOffice(validationState, value);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BEChildBirthRegistrationMunicipalOffice getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MunicipalOffice)) {
                    return false;
                }
                MunicipalOffice municipalOffice = (MunicipalOffice) other;
                return fr.t.c(this.validationState, municipalOffice.validationState) && fr.t.c(this.value, municipalOffice.value);
            }

            public int hashCode() {
                int iHashCode = this.validationState.hashCode() * 31;
                BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice = this.value;
                return iHashCode + (bEChildBirthRegistrationMunicipalOffice == null ? 0 : bEChildBirthRegistrationMunicipalOffice.hashCode());
            }

            public String toString() {
                return "MunicipalOffice(validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public /* synthetic */ MunicipalOffice(hz.b bVar, BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, bEChildBirthRegistrationMunicipalOffice);
            }
        }
    }
}
