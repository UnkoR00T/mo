package s81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import java.util.List;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: renamed from: s81.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\"\u0010)¨\u0006*"}, d2 = {"Ls81/l;", "", "Lhb4/c;", "errorVMS", "", "recipientOfficeUnitCode", "", "Lcl0/q;", "offices", "Lv91/a;", "dropDownState", "selectedOffice", "Lcl0/g0;", "passportOfficePlace", "<init>", "(Lhb4/c;Ljava/lang/String;Ljava/util/List;Lv91/a;Lcl0/q;Lcl0/g0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Ljava/lang/String;", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lv91/a;", "()Lv91/a;", "Lcl0/q;", "f", "()Lcl0/q;", "Lcl0/g0;", "()Lcl0/g0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recipientOfficeUnitCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPassportChildApplicationOfficeDictionary> offices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDownState dropDownState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationOfficeDictionary selectedOffice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final cl0.g0 passportOfficePlace;

    public Error(hb4.c cVar, String str, List<BEPassportChildApplicationOfficeDictionary> list, DropDownState dropDownState, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, cl0.g0 g0Var) {
        this.errorVMS = cVar;
        this.recipientOfficeUnitCode = str;
        this.offices = list;
        this.dropDownState = dropDownState;
        this.selectedOffice = bEPassportChildApplicationOfficeDictionary;
        this.passportOfficePlace = g0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DropDownState getDropDownState() {
        return this.dropDownState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    public final List<BEPassportChildApplicationOfficeDictionary> c() {
        return this.offices;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final cl0.g0 getPassportOfficePlace() {
        return this.passportOfficePlace;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRecipientOfficeUnitCode() {
        return this.recipientOfficeUnitCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.recipientOfficeUnitCode, error.recipientOfficeUnitCode) && fr.t.c(this.offices, error.offices) && fr.t.c(this.dropDownState, error.dropDownState) && fr.t.c(this.selectedOffice, error.selectedOffice) && this.passportOfficePlace == error.passportOfficePlace;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEPassportChildApplicationOfficeDictionary getSelectedOffice() {
        return this.selectedOffice;
    }

    public int hashCode() {
        int iHashCode = ((((((this.errorVMS.hashCode() * 31) + this.recipientOfficeUnitCode.hashCode()) * 31) + this.offices.hashCode()) * 31) + this.dropDownState.hashCode()) * 31;
        BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary = this.selectedOffice;
        return ((iHashCode + (bEPassportChildApplicationOfficeDictionary == null ? 0 : bEPassportChildApplicationOfficeDictionary.hashCode())) * 31) + this.passportOfficePlace.hashCode();
    }

    public String toString() {
        return "Error(errorVMS=" + this.errorVMS + ", recipientOfficeUnitCode=" + this.recipientOfficeUnitCode + ", offices=" + this.offices + ", dropDownState=" + this.dropDownState + ", selectedOffice=" + this.selectedOffice + ", passportOfficePlace=" + this.passportOfficePlace + ')';
    }
}
