package n01;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: n01.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln01/f;", "", "Lp01/a;", "entryData", "", "descriptionValue", "Lhz/b;", "descriptionValidationState", "<init>", "(Lp01/a;Ljava/lang/String;Lhz/b;)V", "a", "(Lp01/a;Ljava/lang/String;Lhz/b;)Ln01/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp01/a;", "e", "()Lp01/a;", "b", "Ljava/lang/String;", "d", "c", "Lhz/b;", "()Lhz/b;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p01.a entryData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String descriptionValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b descriptionValidationState;

    public State(p01.a aVar, String str, hz.b bVar) {
        this.entryData = aVar;
        this.descriptionValue = str;
        this.descriptionValidationState = bVar;
    }

    public static /* synthetic */ State b(State state, p01.a aVar, String str, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.entryData;
        }
        if ((i15 & 2) != 0) {
            str = state.descriptionValue;
        }
        if ((i15 & 4) != 0) {
            bVar = state.descriptionValidationState;
        }
        return state.a(aVar, str, bVar);
    }

    public final State a(p01.a entryData, String descriptionValue, hz.b descriptionValidationState) {
        return new State(entryData, descriptionValue, descriptionValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.b getDescriptionValidationState() {
        return this.descriptionValidationState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescriptionValue() {
        return this.descriptionValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p01.a getEntryData() {
        return this.entryData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.entryData, state.entryData) && fr.t.c(this.descriptionValue, state.descriptionValue) && fr.t.c(this.descriptionValidationState, state.descriptionValidationState);
    }

    public int hashCode() {
        return (((this.entryData.hashCode() * 31) + this.descriptionValue.hashCode()) * 31) + this.descriptionValidationState.hashCode();
    }

    public String toString() {
        return "State(entryData=" + this.entryData + ", descriptionValue=" + this.descriptionValue + ", descriptionValidationState=" + this.descriptionValidationState + ')';
    }

    public /* synthetic */ State(p01.a aVar, String str, hz.b bVar, int i15, fr.k kVar) {
        this(aVar, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
