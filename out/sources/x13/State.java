package x13;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x13.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx13/e;", "", "Ll13/a$a;", "group", "", "", "addedItems", "<init>", "(Ll13/a$a;Ljava/util/List;)V", "a", "(Ll13/a$a;Ljava/util/List;)Lx13/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll13/a$a;", "d", "()Ll13/a$a;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l13.a.Group group;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> addedItems;

    public State(l13.a.Group group, List<String> list) {
        this.group = group;
        this.addedItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, l13.a.Group group, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            group = state.group;
        }
        if ((i15 & 2) != 0) {
            list = state.addedItems;
        }
        return state.a(group, list);
    }

    public final State a(l13.a.Group group, List<String> addedItems) {
        return new State(group, addedItems);
    }

    public final List<String> c() {
        return this.addedItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l13.a.Group getGroup() {
        return this.group;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.group, state.group) && t.c(this.addedItems, state.addedItems);
    }

    public int hashCode() {
        return (this.group.hashCode() * 31) + this.addedItems.hashCode();
    }

    public String toString() {
        return "State(group=" + this.group + ", addedItems=" + this.addedItems + ')';
    }
}
