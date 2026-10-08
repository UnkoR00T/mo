package tv0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tv0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltv0/g;", "", "Ltv0/c;", "collisionStep", "Ltv0/e;", "newCollisionData", "<init>", "(Ltv0/c;Ltv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/c;", "()Ltv0/c;", "b", "Ltv0/e;", "()Ltv0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESavedDraftCollision {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c collisionStep;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BENewCollisionData newCollisionData;

    public BESavedDraftCollision(c cVar, BENewCollisionData eVar) {
        this.collisionStep = cVar;
        this.newCollisionData = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getCollisionStep() {
        return this.collisionStep;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BENewCollisionData getNewCollisionData() {
        return this.newCollisionData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESavedDraftCollision)) {
            return false;
        }
        BESavedDraftCollision bESavedDraftCollision = (BESavedDraftCollision) other;
        return this.collisionStep == bESavedDraftCollision.collisionStep && t.c(this.newCollisionData, bESavedDraftCollision.newCollisionData);
    }

    public int hashCode() {
        c cVar = this.collisionStep;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.newCollisionData.hashCode();
    }

    public String toString() {
        return "BESavedDraftCollision(collisionStep=" + this.collisionStep + ", newCollisionData=" + this.newCollisionData + ")";
    }
}
