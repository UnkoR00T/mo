package g43;

import f43.ChildStudent;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g43.b0, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg43/b0;", "", "", "Lf43/a;", "children", "selectedChild", "<init>", "(Ljava/util/List;Lf43/a;)V", "a", "(Ljava/util/List;Lf43/a;)Lg43/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "b", "Lf43/a;", "c", "()Lf43/a;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildStudent> children;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildStudent selectedChild;

    public State(List<ChildStudent> list, ChildStudent childStudent) {
        this.children = list;
        this.selectedChild = childStudent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, ChildStudent childStudent, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.children;
        }
        if ((i15 & 2) != 0) {
            childStudent = state.selectedChild;
        }
        return state.a(list, childStudent);
    }

    public final State a(List<ChildStudent> children, ChildStudent selectedChild) {
        return new State(children, selectedChild);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChildStudent getSelectedChild() {
        return this.selectedChild;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.children, state.children) && fr.t.c(this.selectedChild, state.selectedChild);
    }

    public int hashCode() {
        List<ChildStudent> list = this.children;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ChildStudent childStudent = this.selectedChild;
        return iHashCode + (childStudent != null ? childStudent.hashCode() : 0);
    }

    public String toString() {
        return "State(children=" + this.children + ", selectedChild=" + this.selectedChild + ')';
    }
}
