package ve3;

import fr.t;
import p071kotlin.Metadata;
import sv0.StatementPersonalDetails;
import sv0.l;

/* JADX INFO: renamed from: ve3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lve3/a;", "", "Lsv0/l;", "collisionRole", "Lsv0/f0;", "personalData", "<init>", "(Lsv0/l;Lsv0/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/l;", "()Lsv0/l;", "b", "Lsv0/f0;", "()Lsv0/f0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDetailsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l collisionRole;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatementPersonalDetails personalData;

    public PersonalDetailsData(l lVar, StatementPersonalDetails statementPersonalDetails) {
        this.collisionRole = lVar;
        this.personalData = statementPersonalDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getCollisionRole() {
        return this.collisionRole;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StatementPersonalDetails getPersonalData() {
        return this.personalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDetailsData)) {
            return false;
        }
        PersonalDetailsData personalDetailsData = (PersonalDetailsData) other;
        return this.collisionRole == personalDetailsData.collisionRole && t.c(this.personalData, personalDetailsData.personalData);
    }

    public int hashCode() {
        return (this.collisionRole.hashCode() * 31) + this.personalData.hashCode();
    }

    public String toString() {
        return "PersonalDetailsData(collisionRole=" + this.collisionRole + ", personalData=" + this.personalData + ')';
    }
}
