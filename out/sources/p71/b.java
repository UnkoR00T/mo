package p71;

import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.g0;
import java.util.List;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lp71/b;", "", "b", "c", "a", "Lp71/b$a;", "Lp71/b$b;", "Lp71/b$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: p71.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp71/b$a;", "Lp71/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: p71.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp71/b$b;", "Lp71/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3776b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3776b f153302a = new C3776b();

        private C3776b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3776b);
        }

        public int hashCode() {
            return 1211664098;
        }

        public String toString() {
            return "GetCountries";
        }
    }

    /* JADX INFO: renamed from: p71.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lp71/b$c;", "Lp71/b;", "", "Lcl0/o;", "countries", "Lv91/a;", "dropDownState", "selectedCountry", "Lcl0/g0;", "passportOfficePlace", "<init>", "(Ljava/util/List;Lv91/a;Lcl0/o;Lcl0/g0;)V", "a", "(Ljava/util/List;Lv91/a;Lcl0/o;Lcl0/g0;)Lp71/b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lv91/a;", "d", "()Lv91/a;", "Lcl0/o;", "f", "()Lcl0/o;", "Lcl0/g0;", "e", "()Lcl0/g0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEPassportChildApplicationCountryDictionary> countries;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownState dropDownState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationCountryDictionary selectedCountry;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g0 passportOfficePlace;

        public Initialized(List<BEPassportChildApplicationCountryDictionary> list, DropDownState dropDownState, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, g0 g0Var) {
            this.countries = list;
            this.dropDownState = dropDownState;
            this.selectedCountry = bEPassportChildApplicationCountryDictionary;
            this.passportOfficePlace = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, DropDownState dropDownState, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, g0 g0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.countries;
            }
            if ((i15 & 2) != 0) {
                dropDownState = initialized.dropDownState;
            }
            if ((i15 & 4) != 0) {
                bEPassportChildApplicationCountryDictionary = initialized.selectedCountry;
            }
            if ((i15 & 8) != 0) {
                g0Var = initialized.passportOfficePlace;
            }
            return initialized.a(list, dropDownState, bEPassportChildApplicationCountryDictionary, g0Var);
        }

        public final Initialized a(List<BEPassportChildApplicationCountryDictionary> countries, DropDownState dropDownState, BEPassportChildApplicationCountryDictionary selectedCountry, g0 passportOfficePlace) {
            return new Initialized(countries, dropDownState, selectedCountry, passportOfficePlace);
        }

        public final List<BEPassportChildApplicationCountryDictionary> c() {
            return this.countries;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DropDownState getDropDownState() {
            return this.dropDownState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g0 getPassportOfficePlace() {
            return this.passportOfficePlace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.countries, initialized.countries) && fr.t.c(this.dropDownState, initialized.dropDownState) && fr.t.c(this.selectedCountry, initialized.selectedCountry) && this.passportOfficePlace == initialized.passportOfficePlace;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BEPassportChildApplicationCountryDictionary getSelectedCountry() {
            return this.selectedCountry;
        }

        public int hashCode() {
            int iHashCode = ((this.countries.hashCode() * 31) + this.dropDownState.hashCode()) * 31;
            BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary = this.selectedCountry;
            return ((iHashCode + (bEPassportChildApplicationCountryDictionary == null ? 0 : bEPassportChildApplicationCountryDictionary.hashCode())) * 31) + this.passportOfficePlace.hashCode();
        }

        public String toString() {
            return "Initialized(countries=" + this.countries + ", dropDownState=" + this.dropDownState + ", selectedCountry=" + this.selectedCountry + ", passportOfficePlace=" + this.passportOfficePlace + ')';
        }
    }
}
