package p108qz0;

import fr.k;
import fr.t;
import java.util.List;
import lz0.a;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qz0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lqz0/e;", "", "", "Llz0/a;", "themes", "chosenTheme", "", "focusRestorationIndex", "<init>", "(Ljava/util/List;Llz0/a;Ljava/lang/Integer;)V", "a", "(Ljava/util/List;Llz0/a;Ljava/lang/Integer;)Lqz0/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Llz0/a;", "c", "()Llz0/a;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> themes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a chosenTheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer focusRestorationIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public State(List<? extends a> list, a aVar, Integer num) {
        this.themes = list;
        this.chosenTheme = aVar;
        this.focusRestorationIndex = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, a aVar, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.themes;
        }
        if ((i15 & 2) != 0) {
            aVar = state.chosenTheme;
        }
        if ((i15 & 4) != 0) {
            num = state.focusRestorationIndex;
        }
        return state.a(list, aVar, num);
    }

    public final State a(List<? extends a> themes, a chosenTheme, Integer focusRestorationIndex) {
        return new State(themes, chosenTheme, focusRestorationIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getChosenTheme() {
        return this.chosenTheme;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getFocusRestorationIndex() {
        return this.focusRestorationIndex;
    }

    public final List<a> e() {
        return this.themes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.themes, state.themes) && this.chosenTheme == state.chosenTheme && t.c(this.focusRestorationIndex, state.focusRestorationIndex);
    }

    public int hashCode() {
        int iHashCode = ((this.themes.hashCode() * 31) + this.chosenTheme.hashCode()) * 31;
        Integer num = this.focusRestorationIndex;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "State(themes=" + this.themes + ", chosenTheme=" + this.chosenTheme + ", focusRestorationIndex=" + this.focusRestorationIndex + ')';
    }

    public /* synthetic */ State(List list, a aVar, Integer num, int i15, k kVar) {
        this(list, aVar, (i15 & 4) != 0 ? null : num);
    }
}
