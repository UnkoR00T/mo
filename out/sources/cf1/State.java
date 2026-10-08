package cf1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cf1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lcf1/e;", "", "Llb1/a;", "selectedItem", "Lhz/b;", "validationState", "Lld1/l;", "processType", "<init>", "(Llb1/a;Lhz/b;Lld1/l;)V", "a", "(Llb1/a;Lhz/b;Lld1/l;)Lcf1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llb1/a;", "d", "()Llb1/a;", "b", "Lhz/b;", "e", "()Lhz/b;", "c", "Lld1/l;", "()Lld1/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f25638d = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final lb1.a selectedItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ld1.l processType;

    public State(lb1.a aVar, hz.b bVar, ld1.l lVar) {
        this.selectedItem = aVar;
        this.validationState = bVar;
        this.processType = lVar;
    }

    public static /* synthetic */ State b(State state, lb1.a aVar, hz.b bVar, ld1.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.selectedItem;
        }
        if ((i15 & 2) != 0) {
            bVar = state.validationState;
        }
        if ((i15 & 4) != 0) {
            lVar = state.processType;
        }
        return state.a(aVar, bVar, lVar);
    }

    public final State a(lb1.a selectedItem, hz.b validationState, ld1.l processType) {
        return new State(selectedItem, validationState, processType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ld1.l getProcessType() {
        return this.processType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lb1.a getSelectedItem() {
        return this.selectedItem;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.selectedItem == state.selectedItem && t.c(this.validationState, state.validationState) && this.processType == state.processType;
    }

    public int hashCode() {
        return (((this.selectedItem.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.processType.hashCode();
    }

    public String toString() {
        return "State(selectedItem=" + this.selectedItem + ", validationState=" + this.validationState + ", processType=" + this.processType + ')';
    }
}
