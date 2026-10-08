package ke1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ke1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lke1/f;", "", "Lde1/d;", "selectedItem", "<init>", "(Lde1/d;)V", "a", "(Lde1/d;)Lke1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lde1/d;", "b", "()Lde1/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final de1.d selectedItem;

    public State(de1.d dVar) {
        this.selectedItem = dVar;
    }

    public final State a(de1.d selectedItem) {
        return new State(selectedItem);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final de1.d getSelectedItem() {
        return this.selectedItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && this.selectedItem == ((State) other).selectedItem;
    }

    public int hashCode() {
        de1.d dVar = this.selectedItem;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public String toString() {
        return "State(selectedItem=" + this.selectedItem + ')';
    }
}
