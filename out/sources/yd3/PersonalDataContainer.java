package yd3;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yd3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lyd3/e;", "", "Liy/b0;", "name", "familyName", "Lyd3/d;", "permanentAddress", "<init>", "(Liy/b0;Liy/b0;Lyd3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "Lyd3/d;", "()Lyd3/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f226594d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 familyName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalAddressContainer permanentAddress;

    public PersonalDataContainer(b0 b0Var, b0 b0Var2, PersonalAddressContainer personalAddressContainer) {
        this.name = b0Var;
        this.familyName = b0Var2;
        this.permanentAddress = personalAddressContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getFamilyName() {
        return this.familyName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PersonalAddressContainer getPermanentAddress() {
        return this.permanentAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataContainer)) {
            return false;
        }
        PersonalDataContainer personalDataContainer = (PersonalDataContainer) other;
        return t.c(this.name, personalDataContainer.name) && t.c(this.familyName, personalDataContainer.familyName) && t.c(this.permanentAddress, personalDataContainer.permanentAddress);
    }

    public int hashCode() {
        b0 b0Var = this.name;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0 b0Var2 = this.familyName;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        PersonalAddressContainer personalAddressContainer = this.permanentAddress;
        return iHashCode2 + (personalAddressContainer != null ? personalAddressContainer.hashCode() : 0);
    }

    public String toString() {
        return "PersonalDataContainer(name=" + this.name + ", familyName=" + this.familyName + ", permanentAddress=" + this.permanentAddress + ')';
    }
}
