package kf1;

import java.util.List;
import ld1.TaxOfficeModel;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: kf1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lkf1/b;", "", "", "Lld1/r;", "taxOffices", "selectedTaxOffice", "", "isValid", "isDataLoaded", "<init>", "(Ljava/util/List;Lld1/r;ZZ)V", "a", "(Ljava/util/List;Lld1/r;ZZ)Lkf1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lld1/r;", "c", "()Lld1/r;", "Z", "f", "()Z", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TaxOfficeModel> taxOffices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxOfficeModel selectedTaxOffice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDataLoaded;

    public State() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, TaxOfficeModel taxOfficeModel, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.taxOffices;
        }
        if ((i15 & 2) != 0) {
            taxOfficeModel = state.selectedTaxOffice;
        }
        if ((i15 & 4) != 0) {
            z15 = state.isValid;
        }
        if ((i15 & 8) != 0) {
            z16 = state.isDataLoaded;
        }
        return state.a(list, taxOfficeModel, z15, z16);
    }

    public final State a(List<TaxOfficeModel> taxOffices, TaxOfficeModel selectedTaxOffice, boolean isValid, boolean isDataLoaded) {
        return new State(taxOffices, selectedTaxOffice, isValid, isDataLoaded);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TaxOfficeModel getSelectedTaxOffice() {
        return this.selectedTaxOffice;
    }

    public final List<TaxOfficeModel> d() {
        return this.taxOffices;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsDataLoaded() {
        return this.isDataLoaded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.taxOffices, state.taxOffices) && fr.t.c(this.selectedTaxOffice, state.selectedTaxOffice) && this.isValid == state.isValid && this.isDataLoaded == state.isDataLoaded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public int hashCode() {
        int iHashCode = this.taxOffices.hashCode() * 31;
        TaxOfficeModel taxOfficeModel = this.selectedTaxOffice;
        return ((((iHashCode + (taxOfficeModel == null ? 0 : taxOfficeModel.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.isDataLoaded);
    }

    public String toString() {
        return "State(taxOffices=" + this.taxOffices + ", selectedTaxOffice=" + this.selectedTaxOffice + ", isValid=" + this.isValid + ", isDataLoaded=" + this.isDataLoaded + ')';
    }

    public State(List<TaxOfficeModel> list, TaxOfficeModel taxOfficeModel, boolean z15, boolean z16) {
        this.taxOffices = list;
        this.selectedTaxOffice = taxOfficeModel;
        this.isValid = z15;
        this.isDataLoaded = z16;
    }

    public /* synthetic */ State(List list, TaxOfficeModel taxOfficeModel, boolean z15, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? v.n() : list, (i15 & 2) != 0 ? null : taxOfficeModel, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? false : z16);
    }
}
