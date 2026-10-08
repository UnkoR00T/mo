package ub1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ub1.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lub1/m;", "", "Lib1/a;", "selectedItem", "Lub1/l;", "", "accountingOffice", "nipNumber", "Lhz/b;", "validationState", "<init>", "(Lib1/a;Lub1/l;Lub1/l;Lhz/b;)V", "a", "(Lib1/a;Lub1/l;Lub1/l;Lhz/b;)Lub1/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lib1/a;", "e", "()Lib1/a;", "b", "Lub1/l;", "c", "()Lub1/l;", "d", "Lhz/b;", "f", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Initialized {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f197243e = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ib1.a selectedItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> accountingOffice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> nipNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public Initialized(ib1.a aVar, Field<String> field, Field<String> field2, hz.b bVar) {
        this.selectedItem = aVar;
        this.accountingOffice = field;
        this.nipNumber = field2;
        this.validationState = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Initialized b(Initialized initialized, ib1.a aVar, Field field, Field field2, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = initialized.selectedItem;
        }
        if ((i15 & 2) != 0) {
            field = initialized.accountingOffice;
        }
        if ((i15 & 4) != 0) {
            field2 = initialized.nipNumber;
        }
        if ((i15 & 8) != 0) {
            bVar = initialized.validationState;
        }
        return initialized.a(aVar, field, field2, bVar);
    }

    public final Initialized a(ib1.a selectedItem, Field<String> accountingOffice, Field<String> nipNumber, hz.b validationState) {
        return new Initialized(selectedItem, accountingOffice, nipNumber, validationState);
    }

    public final Field<String> c() {
        return this.accountingOffice;
    }

    public final Field<String> d() {
        return this.nipNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ib1.a getSelectedItem() {
        return this.selectedItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Initialized)) {
            return false;
        }
        Initialized initialized = (Initialized) other;
        return this.selectedItem == initialized.selectedItem && fr.t.c(this.accountingOffice, initialized.accountingOffice) && fr.t.c(this.nipNumber, initialized.nipNumber) && fr.t.c(this.validationState, initialized.validationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public int hashCode() {
        return (((((this.selectedItem.hashCode() * 31) + this.accountingOffice.hashCode()) * 31) + this.nipNumber.hashCode()) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "Initialized(selectedItem=" + this.selectedItem + ", accountingOffice=" + this.accountingOffice + ", nipNumber=" + this.nipNumber + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ Initialized(ib1.a aVar, Field field, Field field2, hz.b bVar, int i15, fr.k kVar) {
        this(aVar, (i15 & 2) != 0 ? new Field(null, null, 3, null) : field, (i15 & 4) != 0 ? new Field(null, null, 3, null) : field2, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
