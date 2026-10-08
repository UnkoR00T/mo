package i51;

import fr.t;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i51.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Li51/b;", "", "", "Lbl0/g;", "availableMethods", "", "areMultipleChildren", "Liy/b0;", "edorAddress", "", "office", "<init>", "(Ljava/util/List;ZLiy/b0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "c", "Liy/b0;", "()Liy/b0;", "d", "Ljava/lang/String;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<bl0.g> availableMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean areMultipleChildren;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 edorAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String office;

    /* JADX WARN: Multi-variable type inference failed */
    public State(List<? extends bl0.g> list, boolean z15, b0 b0Var, String str) {
        this.availableMethods = list;
        this.areMultipleChildren = z15;
        this.edorAddress = b0Var;
        this.office = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAreMultipleChildren() {
        return this.areMultipleChildren;
    }

    public final List<bl0.g> b() {
        return this.availableMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getEdorAddress() {
        return this.edorAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOffice() {
        return this.office;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.availableMethods, state.availableMethods) && this.areMultipleChildren == state.areMultipleChildren && t.c(this.edorAddress, state.edorAddress) && t.c(this.office, state.office);
    }

    public int hashCode() {
        return (((((this.availableMethods.hashCode() * 31) + Boolean.hashCode(this.areMultipleChildren)) * 31) + this.edorAddress.hashCode()) * 31) + this.office.hashCode();
    }

    public String toString() {
        return "State(availableMethods=" + this.availableMethods + ", areMultipleChildren=" + this.areMultipleChildren + ", edorAddress=" + this.edorAddress + ", office=" + this.office + ')';
    }
}
