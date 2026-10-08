package s81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import java.util.List;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ls81/i;", "", "b", "a", "Ls81/i$a;", "Ls81/i$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: s81.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls81/i$a;", "Ls81/i;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements i {

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

    /* JADX INFO: renamed from: s81.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ls81/i$b;", "Ls81/i;", "", "Lcl0/q;", "offices", "Lv91/a;", "dropDownState", "selectedOffice", "Lcl0/g0;", "passportOfficePlace", "<init>", "(Ljava/util/List;Lv91/a;Lcl0/q;Lcl0/g0;)V", "a", "(Ljava/util/List;Lv91/a;Lcl0/q;Lcl0/g0;)Ls81/i$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lv91/a;", "c", "()Lv91/a;", "Lcl0/q;", "f", "()Lcl0/q;", "Lcl0/g0;", "e", "()Lcl0/g0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEPassportChildApplicationOfficeDictionary> offices;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownState dropDownState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationOfficeDictionary selectedOffice;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final cl0.g0 passportOfficePlace;

        public Initialized(List<BEPassportChildApplicationOfficeDictionary> list, DropDownState dropDownState, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, cl0.g0 g0Var) {
            this.offices = list;
            this.dropDownState = dropDownState;
            this.selectedOffice = bEPassportChildApplicationOfficeDictionary;
            this.passportOfficePlace = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, DropDownState dropDownState, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, cl0.g0 g0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.offices;
            }
            if ((i15 & 2) != 0) {
                dropDownState = initialized.dropDownState;
            }
            if ((i15 & 4) != 0) {
                bEPassportChildApplicationOfficeDictionary = initialized.selectedOffice;
            }
            if ((i15 & 8) != 0) {
                g0Var = initialized.passportOfficePlace;
            }
            return initialized.a(list, dropDownState, bEPassportChildApplicationOfficeDictionary, g0Var);
        }

        public final Initialized a(List<BEPassportChildApplicationOfficeDictionary> offices, DropDownState dropDownState, BEPassportChildApplicationOfficeDictionary selectedOffice, cl0.g0 passportOfficePlace) {
            return new Initialized(offices, dropDownState, selectedOffice, passportOfficePlace);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DropDownState getDropDownState() {
            return this.dropDownState;
        }

        public final List<BEPassportChildApplicationOfficeDictionary> d() {
            return this.offices;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final cl0.g0 getPassportOfficePlace() {
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
            return fr.t.c(this.offices, initialized.offices) && fr.t.c(this.dropDownState, initialized.dropDownState) && fr.t.c(this.selectedOffice, initialized.selectedOffice) && this.passportOfficePlace == initialized.passportOfficePlace;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BEPassportChildApplicationOfficeDictionary getSelectedOffice() {
            return this.selectedOffice;
        }

        public int hashCode() {
            int iHashCode = ((this.offices.hashCode() * 31) + this.dropDownState.hashCode()) * 31;
            BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary = this.selectedOffice;
            return ((iHashCode + (bEPassportChildApplicationOfficeDictionary == null ? 0 : bEPassportChildApplicationOfficeDictionary.hashCode())) * 31) + this.passportOfficePlace.hashCode();
        }

        public String toString() {
            return "Initialized(offices=" + this.offices + ", dropDownState=" + this.dropDownState + ", selectedOffice=" + this.selectedOffice + ", passportOfficePlace=" + this.passportOfficePlace + ')';
        }
    }
}
