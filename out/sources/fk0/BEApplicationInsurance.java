package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfk0/j;", "", "Lfk0/k;", "krusInput", "Lfk0/o;", "zusInput", "<init>", "(Lfk0/k;Lfk0/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/k;", "()Lfk0/k;", "b", "Lfk0/o;", "()Lfk0/o;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationInsurance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationKrusInput krusInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationZusInput zusInput;

    public BEApplicationInsurance(BEApplicationKrusInput bEApplicationKrusInput, BEApplicationZusInput bEApplicationZusInput) {
        this.krusInput = bEApplicationKrusInput;
        this.zusInput = bEApplicationZusInput;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicationKrusInput getKrusInput() {
        return this.krusInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEApplicationZusInput getZusInput() {
        return this.zusInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationInsurance)) {
            return false;
        }
        BEApplicationInsurance bEApplicationInsurance = (BEApplicationInsurance) other;
        return fr.t.c(this.krusInput, bEApplicationInsurance.krusInput) && fr.t.c(this.zusInput, bEApplicationInsurance.zusInput);
    }

    public int hashCode() {
        BEApplicationKrusInput bEApplicationKrusInput = this.krusInput;
        int iHashCode = (bEApplicationKrusInput == null ? 0 : bEApplicationKrusInput.hashCode()) * 31;
        BEApplicationZusInput bEApplicationZusInput = this.zusInput;
        return iHashCode + (bEApplicationZusInput != null ? bEApplicationZusInput.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicationInsurance(krusInput=" + this.krusInput + ", zusInput=" + this.zusInput + ')';
    }
}
