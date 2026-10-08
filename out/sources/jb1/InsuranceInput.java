package jb1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jb1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljb1/h;", "", "Ljb1/i;", "krusInput", "Ljb1/o;", "zusInput", "<init>", "(Ljb1/i;Ljb1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb1/i;", "()Ljb1/i;", "b", "Ljb1/o;", "()Ljb1/o;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final KrusInput krusInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZusInput zusInput;

    public InsuranceInput(KrusInput krusInput, ZusInput zusInput) {
        this.krusInput = krusInput;
        this.zusInput = zusInput;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final KrusInput getKrusInput() {
        return this.krusInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ZusInput getZusInput() {
        return this.zusInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceInput)) {
            return false;
        }
        InsuranceInput insuranceInput = (InsuranceInput) other;
        return t.c(this.krusInput, insuranceInput.krusInput) && t.c(this.zusInput, insuranceInput.zusInput);
    }

    public int hashCode() {
        KrusInput krusInput = this.krusInput;
        int iHashCode = (krusInput == null ? 0 : krusInput.hashCode()) * 31;
        ZusInput zusInput = this.zusInput;
        return iHashCode + (zusInput != null ? zusInput.hashCode() : 0);
    }

    public String toString() {
        return "InsuranceInput(krusInput=" + this.krusInput + ", zusInput=" + this.zusInput + ')';
    }
}
