package s82;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s82.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Ls82/b;", "", "Ls82/b$a;", "streetNameAndNumberState", "cityNameState", "postalCodeState", "voivodeshipNameState", "La82/a;", "scrollToField", "<init>", "(Ls82/b$a;Ls82/b$a;Ls82/b$a;Ls82/b$a;La82/a;)V", "a", "(Ls82/b$a;Ls82/b$a;Ls82/b$a;Ls82/b$a;La82/a;)Ls82/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls82/b$a;", "f", "()Ls82/b$a;", "b", "c", "d", "g", "e", "La82/a;", "()La82/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f179156f = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState streetNameAndNumberState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState cityNameState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState postalCodeState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState voivodeshipNameState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a82.a scrollToField;

    public State() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ State b(State state, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, a82.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            fieldState = state.streetNameAndNumberState;
        }
        if ((i15 & 2) != 0) {
            fieldState2 = state.cityNameState;
        }
        if ((i15 & 4) != 0) {
            fieldState3 = state.postalCodeState;
        }
        if ((i15 & 8) != 0) {
            fieldState4 = state.voivodeshipNameState;
        }
        if ((i15 & 16) != 0) {
            aVar = state.scrollToField;
        }
        a82.a aVar2 = aVar;
        FieldState fieldState5 = fieldState3;
        return state.a(fieldState, fieldState2, fieldState5, fieldState4, aVar2);
    }

    public final State a(FieldState streetNameAndNumberState, FieldState cityNameState, FieldState postalCodeState, FieldState voivodeshipNameState, a82.a scrollToField) {
        return new State(streetNameAndNumberState, cityNameState, postalCodeState, voivodeshipNameState, scrollToField);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FieldState getCityNameState() {
        return this.cityNameState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FieldState getPostalCodeState() {
        return this.postalCodeState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a82.a getScrollToField() {
        return this.scrollToField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.streetNameAndNumberState, state.streetNameAndNumberState) && fr.t.c(this.cityNameState, state.cityNameState) && fr.t.c(this.postalCodeState, state.postalCodeState) && fr.t.c(this.voivodeshipNameState, state.voivodeshipNameState) && this.scrollToField == state.scrollToField;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FieldState getStreetNameAndNumberState() {
        return this.streetNameAndNumberState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FieldState getVoivodeshipNameState() {
        return this.voivodeshipNameState;
    }

    public int hashCode() {
        int iHashCode = ((((((this.streetNameAndNumberState.hashCode() * 31) + this.cityNameState.hashCode()) * 31) + this.postalCodeState.hashCode()) * 31) + this.voivodeshipNameState.hashCode()) * 31;
        a82.a aVar = this.scrollToField;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "State(streetNameAndNumberState=" + this.streetNameAndNumberState + ", cityNameState=" + this.cityNameState + ", postalCodeState=" + this.postalCodeState + ", voivodeshipNameState=" + this.voivodeshipNameState + ", scrollToField=" + this.scrollToField + ')';
    }

    public State(FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, a82.a aVar) {
        this.streetNameAndNumberState = fieldState;
        this.cityNameState = fieldState2;
        this.postalCodeState = fieldState3;
        this.voivodeshipNameState = fieldState4;
        this.scrollToField = aVar;
    }

    /* JADX INFO: renamed from: s82.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls82/b$a;", "", "Lhz/b;", "state", "Lmx/a;", "value", "<init>", "(Lhz/b;Lmx/a;)V", "a", "(Lhz/b;Lmx/a;)Ls82/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Lmx/a;", "d", "()Lmx/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f179162c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        public FieldState(hz.b bVar, Label label) {
            this.state = bVar;
            this.value = label;
        }

        public static /* synthetic */ FieldState b(FieldState fieldState, hz.b bVar, Label label, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = fieldState.state;
            }
            if ((i15 & 2) != 0) {
                label = fieldState.value;
            }
            return fieldState.a(bVar, label);
        }

        public final FieldState a(hz.b state, Label value) {
            return new FieldState(state, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldState)) {
                return false;
            }
            FieldState fieldState = (FieldState) other;
            return fr.t.c(this.state, fieldState.state) && fr.t.c(this.value, fieldState.value);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "FieldState(state=" + this.state + ", value=" + this.value + ')';
        }

        public /* synthetic */ FieldState(hz.b bVar, Label label, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? Label.INSTANCE.c() : label);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ State(FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, a82.a aVar, int i15, fr.k kVar) {
        int i16 = 2;
        this((i15 & 1) != 0 ? new FieldState(hz.b.d.f86848c, null, i16, 0 == true ? 1 : 0) : fieldState, (i15 & 2) != 0 ? new FieldState(hz.b.d.f86848c, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0) : fieldState2, (i15 & 4) != 0 ? new FieldState(hz.b.d.f86848c, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0) : fieldState3, (i15 & 8) != 0 ? new FieldState(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : fieldState4, (i15 & 16) != 0 ? null : aVar);
    }
}
