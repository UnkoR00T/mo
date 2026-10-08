package h41;

import p071kotlin.Metadata;
import r31.ResultData;

/* JADX INFO: renamed from: h41.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh41/c;", "", "Li41/a;", "contract", "Lr31/b;", "officeSearchResult", "<init>", "(Li41/a;Lr31/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li41/a;", "()Li41/a;", "b", "Lr31/b;", "()Lr31/b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i41.a contract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultData officeSearchResult;

    public SetupData(i41.a aVar, ResultData resultData) {
        this.contract = aVar;
        this.officeSearchResult = resultData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i41.a getContract() {
        return this.contract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ResultData getOfficeSearchResult() {
        return this.officeSearchResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.contract, setupData.contract) && fr.t.c(this.officeSearchResult, setupData.officeSearchResult);
    }

    public int hashCode() {
        int iHashCode = this.contract.hashCode() * 31;
        ResultData resultData = this.officeSearchResult;
        return iHashCode + (resultData == null ? 0 : resultData.hashCode());
    }

    public String toString() {
        return "SetupData(contract=" + this.contract + ", officeSearchResult=" + this.officeSearchResult + ')';
    }
}
