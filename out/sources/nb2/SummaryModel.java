package nb2;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nb2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnb2/a;", "", "Lhl0/a;", "invalidationData", "Liy/b0;", "userEdorAddress", "<init>", "(Lhl0/a;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/a;", "()Lhl0/a;", "b", "Liy/b0;", "()Liy/b0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hl0.a invalidationData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 userEdorAddress;

    public SummaryModel(hl0.a aVar, b0 b0Var) {
        this.invalidationData = aVar;
        this.userEdorAddress = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final hl0.a getInvalidationData() {
        return this.invalidationData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getUserEdorAddress() {
        return this.userEdorAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryModel)) {
            return false;
        }
        SummaryModel summaryModel = (SummaryModel) other;
        return t.c(this.invalidationData, summaryModel.invalidationData) && t.c(this.userEdorAddress, summaryModel.userEdorAddress);
    }

    public int hashCode() {
        return (this.invalidationData.hashCode() * 31) + this.userEdorAddress.hashCode();
    }

    public String toString() {
        return "SummaryModel(invalidationData=" + this.invalidationData + ", userEdorAddress=" + this.userEdorAddress + ')';
    }
}
