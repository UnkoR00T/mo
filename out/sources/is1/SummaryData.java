package is1;

import fr.t;
import gs1.FirstStepData;
import hs1.SecondStepData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: is1.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lis1/k;", "", "Lgs1/t;", "firstStepData", "Lhs1/y;", "secondStepData", "<init>", "(Lgs1/t;Lhs1/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgs1/t;", "()Lgs1/t;", "b", "Lhs1/y;", "()Lhs1/y;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FirstStepData firstStepData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecondStepData secondStepData;

    public SummaryData(FirstStepData firstStepData, SecondStepData secondStepData) {
        this.firstStepData = firstStepData;
        this.secondStepData = secondStepData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FirstStepData getFirstStepData() {
        return this.firstStepData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SecondStepData getSecondStepData() {
        return this.secondStepData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryData)) {
            return false;
        }
        SummaryData summaryData = (SummaryData) other;
        return t.c(this.firstStepData, summaryData.firstStepData) && t.c(this.secondStepData, summaryData.secondStepData);
    }

    public int hashCode() {
        return (this.firstStepData.hashCode() * 31) + this.secondStepData.hashCode();
    }

    public String toString() {
        return "SummaryData(firstStepData=" + this.firstStepData + ", secondStepData=" + this.secondStepData + ')';
    }
}
