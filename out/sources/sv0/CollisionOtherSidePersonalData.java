package sv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lsv0/k;", "", "Liy/b0;", "firstName", "surname", "pesel", "picture", "secondName", "", "Lsv0/p;", "drivingLicences", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "f", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionOtherSidePersonalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 secondName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicence> drivingLicences;

    public CollisionOtherSidePersonalData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, iy.b0 b0Var5, List<DrivingLicence> list) {
        this.firstName = b0Var;
        this.surname = b0Var2;
        this.pesel = b0Var3;
        this.picture = b0Var4;
        this.secondName = b0Var5;
        this.drivingLicences = list;
    }

    public final List<DrivingLicence> a() {
        return this.drivingLicences;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionOtherSidePersonalData)) {
            return false;
        }
        CollisionOtherSidePersonalData collisionOtherSidePersonalData = (CollisionOtherSidePersonalData) other;
        return fr.t.c(this.firstName, collisionOtherSidePersonalData.firstName) && fr.t.c(this.surname, collisionOtherSidePersonalData.surname) && fr.t.c(this.pesel, collisionOtherSidePersonalData.pesel) && fr.t.c(this.picture, collisionOtherSidePersonalData.picture) && fr.t.c(this.secondName, collisionOtherSidePersonalData.secondName) && fr.t.c(this.drivingLicences, collisionOtherSidePersonalData.drivingLicences);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final iy.b0 getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((this.firstName.hashCode() * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.picture.hashCode()) * 31;
        iy.b0 b0Var = this.secondName;
        return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.drivingLicences.hashCode();
    }

    public String toString() {
        return "CollisionOtherSidePersonalData(firstName=" + this.firstName + ", surname=" + this.surname + ", pesel=" + this.pesel + ", picture=" + this.picture + ", secondName=" + this.secondName + ", drivingLicences=" + this.drivingLicences + ")";
    }
}
