package eh3;

import fr.t;
import og3.x;
import p071kotlin.Metadata;
import sv0.c0;

/* JADX INFO: renamed from: eh3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leh3/a;", "", "Log3/x;", "newCollisionNavigation", "Lsv0/c0;", "readyToSignStatement", "<init>", "(Log3/x;Lsv0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Log3/x;", "()Log3/x;", "b", "Lsv0/c0;", "()Lsv0/c0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final x newCollisionNavigation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c0 readyToSignStatement;

    public SummaryContract(x xVar, c0 c0Var) {
        this.newCollisionNavigation = xVar;
        this.readyToSignStatement = c0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final x getNewCollisionNavigation() {
        return this.newCollisionNavigation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c0 getReadyToSignStatement() {
        return this.readyToSignStatement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryContract)) {
            return false;
        }
        SummaryContract summaryContract = (SummaryContract) other;
        return t.c(this.newCollisionNavigation, summaryContract.newCollisionNavigation) && t.c(this.readyToSignStatement, summaryContract.readyToSignStatement);
    }

    public int hashCode() {
        return (this.newCollisionNavigation.hashCode() * 31) + this.readyToSignStatement.hashCode();
    }

    public String toString() {
        return "SummaryContract(newCollisionNavigation=" + this.newCollisionNavigation + ", readyToSignStatement=" + this.readyToSignStatement + ')';
    }
}
