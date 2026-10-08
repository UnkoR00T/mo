package oc1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oc1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Loc1/c;", "", "Loc1/b;", "result", "<init>", "(Loc1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loc1/b;", "getResult", "()Loc1/b;", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CorrespondencePostOfficeBoxStepResult implements h00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CorrespondencePostOfficeBoxContractData result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    public CorrespondencePostOfficeBoxStepResult(CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractData) {
        this.result = correspondencePostOfficeBoxContractData;
        this.data = correspondencePostOfficeBoxContractData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CorrespondencePostOfficeBoxStepResult) && t.c(this.result, ((CorrespondencePostOfficeBoxStepResult) other).result);
    }

    @Override // h00.b
    public Object getData() {
        return this.data;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "CorrespondencePostOfficeBoxStepResult(result=" + this.result + ')';
    }
}
