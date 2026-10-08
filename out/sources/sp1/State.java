package sp1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sp1.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lsp1/l;", "", "", "cardListSelectedIndex", "errorCardListSelectedIndex", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lsp1/l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cardListSelectedIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer errorCardListSelectedIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, Integer num, Integer num2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = state.cardListSelectedIndex;
        }
        if ((i15 & 2) != 0) {
            num2 = state.errorCardListSelectedIndex;
        }
        return state.a(num, num2);
    }

    public final State a(Integer cardListSelectedIndex, Integer errorCardListSelectedIndex) {
        return new State(cardListSelectedIndex, errorCardListSelectedIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getCardListSelectedIndex() {
        return this.cardListSelectedIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getErrorCardListSelectedIndex() {
        return this.errorCardListSelectedIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.cardListSelectedIndex, state.cardListSelectedIndex) && fr.t.c(this.errorCardListSelectedIndex, state.errorCardListSelectedIndex);
    }

    public int hashCode() {
        Integer num = this.cardListSelectedIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.errorCardListSelectedIndex;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "State(cardListSelectedIndex=" + this.cardListSelectedIndex + ", errorCardListSelectedIndex=" + this.errorCardListSelectedIndex + ')';
    }

    public State(Integer num, Integer num2) {
        this.cardListSelectedIndex = num;
        this.errorCardListSelectedIndex = num2;
    }

    public /* synthetic */ State(Integer num, Integer num2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : num2);
    }
}
