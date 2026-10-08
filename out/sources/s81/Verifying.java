package s81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import java.util.List;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: renamed from: s81.n, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Ls81/n;", "", "", "recipientOfficeUnitCode", "", "Lcl0/q;", "offices", "Lv91/a;", "dropDownState", "selectedOffice", "Lcl0/g0;", "passportOfficePlace", "<init>", "(Ljava/lang/String;Ljava/util/List;Lv91/a;Lcl0/q;Lcl0/g0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lv91/a;", "()Lv91/a;", "Lcl0/q;", "e", "()Lcl0/q;", "Lcl0/g0;", "()Lcl0/g0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Verifying implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recipientOfficeUnitCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPassportChildApplicationOfficeDictionary> offices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDownState dropDownState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationOfficeDictionary selectedOffice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final cl0.g0 passportOfficePlace;

    public Verifying(String str, List<BEPassportChildApplicationOfficeDictionary> list, DropDownState dropDownState, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, cl0.g0 g0Var) {
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

    public final List<BEPassportChildApplicationOfficeDictionary> b() {
        return this.offices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final cl0.g0 getPassportOfficePlace() {
        return this.passportOfficePlace;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRecipientOfficeUnitCode() {
        return this.recipientOfficeUnitCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEPassportChildApplicationOfficeDictionary getSelectedOffice() {
        return this.selectedOffice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Verifying)) {
            return false;
        }
        Verifying verifying = (Verifying) other;
        return fr.t.c(this.recipientOfficeUnitCode, verifying.recipientOfficeUnitCode) && fr.t.c(this.offices, verifying.offices) && fr.t.c(this.dropDownState, verifying.dropDownState) && fr.t.c(this.selectedOffice, verifying.selectedOffice) && this.passportOfficePlace == verifying.passportOfficePlace;
    }

    public int hashCode() {
        int iHashCode = ((((this.recipientOfficeUnitCode.hashCode() * 31) + this.offices.hashCode()) * 31) + this.dropDownState.hashCode()) * 31;
        BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary = this.selectedOffice;
        return ((iHashCode + (bEPassportChildApplicationOfficeDictionary == null ? 0 : bEPassportChildApplicationOfficeDictionary.hashCode())) * 31) + this.passportOfficePlace.hashCode();
    }

    public String toString() {
        return "Verifying(recipientOfficeUnitCode=" + this.recipientOfficeUnitCode + ", offices=" + this.offices + ", dropDownState=" + this.dropDownState + ", selectedOffice=" + this.selectedOffice + ", passportOfficePlace=" + this.passportOfficePlace + ')';
    }
}
