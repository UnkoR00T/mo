package s91;

import fr.t;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: renamed from: s91.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls91/b;", "", "Lv91/a;", "dropDownState", "<init>", "(Lv91/a;)V", "a", "(Lv91/a;)Ls91/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lv91/a;", "b", "()Lv91/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f179407b = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDownState dropDownState;

    public State(DropDownState dropDownState) {
        this.dropDownState = dropDownState;
    }

    public final State a(DropDownState dropDownState) {
        return new State(dropDownState);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DropDownState getDropDownState() {
        return this.dropDownState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && t.c(this.dropDownState, ((State) other).dropDownState);
    }

    public int hashCode() {
        return this.dropDownState.hashCode();
    }

    public String toString() {
        return "State(dropDownState=" + this.dropDownState + ')';
    }
}
