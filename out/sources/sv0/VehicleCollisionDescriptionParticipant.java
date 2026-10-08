package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.n0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lsv0/n0;", "", "Liy/b0;", "firstName", "surname", "secondName", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionDescriptionParticipant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 secondName;

    public VehicleCollisionDescriptionParticipant(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.firstName = b0Var;
        this.surname = b0Var2;
        this.secondName = b0Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionDescriptionParticipant)) {
            return false;
        }
        VehicleCollisionDescriptionParticipant vehicleCollisionDescriptionParticipant = (VehicleCollisionDescriptionParticipant) other;
        return fr.t.c(this.firstName, vehicleCollisionDescriptionParticipant.firstName) && fr.t.c(this.surname, vehicleCollisionDescriptionParticipant.surname) && fr.t.c(this.secondName, vehicleCollisionDescriptionParticipant.secondName);
    }

    public int hashCode() {
        int iHashCode = ((this.firstName.hashCode() * 31) + this.surname.hashCode()) * 31;
        iy.b0 b0Var = this.secondName;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "VehicleCollisionDescriptionParticipant(firstName=" + this.firstName + ", surname=" + this.surname + ", secondName=" + this.secondName + ")";
    }
}
