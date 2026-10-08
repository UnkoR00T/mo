package vi1;

import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import xw.g;

/* JADX INFO: renamed from: vi1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lvi1/a;", "", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "", "isAgeValidForTraining", "isSelected", "isAddedManually", "<init>", "(Liy/b0;Liy/b0;Liy/b0;ZZZLfr/k;)V", "", "d", "()Ljava/lang/String;", "a", "(Liy/b0;Liy/b0;Liy/b0;ZZZ)Lvi1/a;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "e", "f", "Z", "h", "()Z", "i", "g", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildParticipant {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f206938g = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAgeValidForTraining;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedManually;

    public /* synthetic */ ChildParticipant(b0 b0Var, b0 b0Var2, b0 b0Var3, boolean z15, boolean z16, boolean z17, k kVar) {
        this(b0Var, b0Var2, b0Var3, z15, z16, z17);
    }

    public static /* synthetic */ ChildParticipant b(ChildParticipant childParticipant, b0 b0Var, b0 b0Var2, b0 b0Var3, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = childParticipant.firstName;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = childParticipant.lastName;
        }
        if ((i15 & 4) != 0) {
            b0Var3 = childParticipant.pesel;
        }
        if ((i15 & 8) != 0) {
            z15 = childParticipant.isAgeValidForTraining;
        }
        if ((i15 & 16) != 0) {
            z16 = childParticipant.isSelected;
        }
        if ((i15 & 32) != 0) {
            z17 = childParticipant.isAddedManually;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        return childParticipant.a(b0Var, b0Var2, b0Var3, z15, z18, z19);
    }

    public final ChildParticipant a(b0 firstName, b0 lastName, b0 pesel, boolean isAgeValidForTraining, boolean isSelected, boolean isAddedManually) {
        return new ChildParticipant(firstName, lastName, pesel, isAgeValidForTraining, isSelected, isAddedManually, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    public final String d() {
        return c0.e(this.firstName) + ' ' + c0.e(this.lastName);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getLastName() {
        return this.lastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildParticipant)) {
            return false;
        }
        ChildParticipant childParticipant = (ChildParticipant) other;
        return t.c(this.firstName, childParticipant.firstName) && t.c(this.lastName, childParticipant.lastName) && g.f(this.pesel, childParticipant.pesel) && this.isAgeValidForTraining == childParticipant.isAgeValidForTraining && this.isSelected == childParticipant.isSelected && this.isAddedManually == childParticipant.isAddedManually;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsAddedManually() {
        return this.isAddedManually;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAgeValidForTraining() {
        return this.isAgeValidForTraining;
    }

    public int hashCode() {
        return (((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + g.h(this.pesel)) * 31) + Boolean.hashCode(this.isAgeValidForTraining)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isAddedManually);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "ChildParticipant(firstName=" + this.firstName + ", lastName=" + this.lastName + ", pesel=" + ((Object) g.i(this.pesel)) + ", isAgeValidForTraining=" + this.isAgeValidForTraining + ", isSelected=" + this.isSelected + ", isAddedManually=" + this.isAddedManually + ')';
    }

    private ChildParticipant(b0 b0Var, b0 b0Var2, b0 b0Var3, boolean z15, boolean z16, boolean z17) {
        this.firstName = b0Var;
        this.lastName = b0Var2;
        this.pesel = b0Var3;
        this.isAgeValidForTraining = z15;
        this.isSelected = z16;
        this.isAddedManually = z17;
    }
}
