package xp1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xp1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lxp1/e;", "", "Ly30/n$b$b;", "selectedTabItem", "", "selectedFilterItemIndex", "<init>", "(Ly30/n$b$b;I)V", "a", "(Ly30/n$b$b;I)Lxp1/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly30/n$b$b;", "d", "()Ly30/n$b$b;", "b", "I", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y30.n.Switch.EnumC5973b selectedTabItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int selectedFilterItemIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, y30.n.Switch.EnumC5973b enumC5973b, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            enumC5973b = state.selectedTabItem;
        }
        if ((i16 & 2) != 0) {
            i15 = state.selectedFilterItemIndex;
        }
        return state.a(enumC5973b, i15);
    }

    public final State a(y30.n.Switch.EnumC5973b selectedTabItem, int selectedFilterItemIndex) {
        return new State(selectedTabItem, selectedFilterItemIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSelectedFilterItemIndex() {
        return this.selectedFilterItemIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y30.n.Switch.EnumC5973b getSelectedTabItem() {
        return this.selectedTabItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.selectedTabItem == state.selectedTabItem && this.selectedFilterItemIndex == state.selectedFilterItemIndex;
    }

    public int hashCode() {
        return (this.selectedTabItem.hashCode() * 31) + Integer.hashCode(this.selectedFilterItemIndex);
    }

    public String toString() {
        return "State(selectedTabItem=" + this.selectedTabItem + ", selectedFilterItemIndex=" + this.selectedFilterItemIndex + ')';
    }

    public State(y30.n.Switch.EnumC5973b enumC5973b, int i15) {
        this.selectedTabItem = enumC5973b;
        this.selectedFilterItemIndex = i15;
    }

    public /* synthetic */ State(y30.n.Switch.EnumC5973b enumC5973b, int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? y30.n.Switch.EnumC5973b.LEFT : enumC5973b, (i16 & 2) != 0 ? 0 : i15);
    }
}
