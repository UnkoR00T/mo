package ju3;

import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import xw.g;

/* JADX INFO: renamed from: ju3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lju3/a;", "", "", "childId", "Liy/b0;", "firstName", "Lxw/g;", "pesel", "surname", "secondName", "<init>", "(Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String childId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondName;

    public /* synthetic */ ChildData(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, k kVar) {
        this(str, b0Var, b0Var2, b0Var3, b0Var4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChildId() {
        return this.childId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildData)) {
            return false;
        }
        ChildData childData = (ChildData) other;
        return t.c(this.childId, childData.childId) && t.c(this.firstName, childData.firstName) && g.f(this.pesel, childData.pesel) && t.c(this.surname, childData.surname) && t.c(this.secondName, childData.secondName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.childId.hashCode() * 31) + this.firstName.hashCode()) * 31) + g.h(this.pesel)) * 31) + this.surname.hashCode()) * 31;
        b0 b0Var = this.secondName;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "ChildData(childId=" + this.childId + ", firstName=" + this.firstName + ", pesel=" + g.i(this.pesel) + ", surname=" + this.surname + ", secondName=" + this.secondName + ")";
    }

    private ChildData(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.childId = str;
        this.firstName = b0Var;
        this.pesel = b0Var2;
        this.surname = b0Var3;
        this.secondName = b0Var4;
    }
}
