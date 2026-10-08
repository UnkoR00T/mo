package h92;

import mx.Label;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: h92.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J~\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b+\u00100¨\u00061"}, d2 = {"Lh92/b;", "", "Lfp0/l;", "wasViolationReported", "Lh92/b$a;", "Lmx/a;", "reportedOfficeState", "entityNameState", "descriptionState", "Lzz/h$a;", "pickedFileState", "Lvy/c;", "photoMetadataCoordinates", "", "isFocusRemoved", "Lc82/a;", "scrollToField", "<init>", "(Lfp0/l;Lh92/b$a;Lh92/b$a;Lh92/b$a;Lh92/b$a;Lvy/c;ZLc82/a;)V", "a", "(Lfp0/l;Lh92/b$a;Lh92/b$a;Lh92/b$a;Lh92/b$a;Lvy/c;ZLc82/a;)Lh92/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lfp0/l;", "h", "()Lfp0/l;", "b", "Lh92/b$a;", "f", "()Lh92/b$a;", "c", "d", "e", "Lvy/c;", "getPhotoMetadataCoordinates", "()Lvy/c;", "g", "Z", "i", "()Z", "Lc82/a;", "()Lc82/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fp0.l wasViolationReported;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<Label> reportedOfficeState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<Label> entityNameState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<Label> descriptionState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<zz.h.Image> pickedFileState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates photoMetadataCoordinates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFocusRemoved;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c82.a scrollToField;

    public State() {
        this(null, null, null, null, null, null, false, null, GF2Field.MASK, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, fp0.l lVar, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, Coordinates coordinates, boolean z15, c82.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = state.wasViolationReported;
        }
        if ((i15 & 2) != 0) {
            fieldState = state.reportedOfficeState;
        }
        if ((i15 & 4) != 0) {
            fieldState2 = state.entityNameState;
        }
        if ((i15 & 8) != 0) {
            fieldState3 = state.descriptionState;
        }
        if ((i15 & 16) != 0) {
            fieldState4 = state.pickedFileState;
        }
        if ((i15 & 32) != 0) {
            coordinates = state.photoMetadataCoordinates;
        }
        if ((i15 & 64) != 0) {
            z15 = state.isFocusRemoved;
        }
        if ((i15 & 128) != 0) {
            aVar = state.scrollToField;
        }
        boolean z16 = z15;
        c82.a aVar2 = aVar;
        FieldState fieldState5 = fieldState4;
        Coordinates coordinates2 = coordinates;
        return state.a(lVar, fieldState, fieldState2, fieldState3, fieldState5, coordinates2, z16, aVar2);
    }

    public final State a(fp0.l wasViolationReported, FieldState<Label> reportedOfficeState, FieldState<Label> entityNameState, FieldState<Label> descriptionState, FieldState<zz.h.Image> pickedFileState, Coordinates photoMetadataCoordinates, boolean isFocusRemoved, c82.a scrollToField) {
        return new State(wasViolationReported, reportedOfficeState, entityNameState, descriptionState, pickedFileState, photoMetadataCoordinates, isFocusRemoved, scrollToField);
    }

    public final FieldState<Label> c() {
        return this.descriptionState;
    }

    public final FieldState<Label> d() {
        return this.entityNameState;
    }

    public final FieldState<zz.h.Image> e() {
        return this.pickedFileState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.wasViolationReported == state.wasViolationReported && fr.t.c(this.reportedOfficeState, state.reportedOfficeState) && fr.t.c(this.entityNameState, state.entityNameState) && fr.t.c(this.descriptionState, state.descriptionState) && fr.t.c(this.pickedFileState, state.pickedFileState) && fr.t.c(this.photoMetadataCoordinates, state.photoMetadataCoordinates) && this.isFocusRemoved == state.isFocusRemoved && this.scrollToField == state.scrollToField;
    }

    public final FieldState<Label> f() {
        return this.reportedOfficeState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c82.a getScrollToField() {
        return this.scrollToField;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final fp0.l getWasViolationReported() {
        return this.wasViolationReported;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.wasViolationReported.hashCode() * 31) + this.reportedOfficeState.hashCode()) * 31) + this.entityNameState.hashCode()) * 31) + this.descriptionState.hashCode()) * 31) + this.pickedFileState.hashCode()) * 31;
        Coordinates coordinates = this.photoMetadataCoordinates;
        int iHashCode2 = (((iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31) + Boolean.hashCode(this.isFocusRemoved)) * 31;
        c82.a aVar = this.scrollToField;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsFocusRemoved() {
        return this.isFocusRemoved;
    }

    public String toString() {
        return "State(wasViolationReported=" + this.wasViolationReported + ", reportedOfficeState=" + this.reportedOfficeState + ", entityNameState=" + this.entityNameState + ", descriptionState=" + this.descriptionState + ", pickedFileState=" + this.pickedFileState + ", photoMetadataCoordinates=" + this.photoMetadataCoordinates + ", isFocusRemoved=" + this.isFocusRemoved + ", scrollToField=" + this.scrollToField + ')';
    }

    public State(fp0.l lVar, FieldState<Label> fieldState, FieldState<Label> fieldState2, FieldState<Label> fieldState3, FieldState<zz.h.Image> fieldState4, Coordinates coordinates, boolean z15, c82.a aVar) {
        this.wasViolationReported = lVar;
        this.reportedOfficeState = fieldState;
        this.entityNameState = fieldState2;
        this.descriptionState = fieldState3;
        this.pickedFileState = fieldState4;
        this.photoMetadataCoordinates = coordinates;
        this.isFocusRemoved = z15;
        this.scrollToField = aVar;
    }

    /* JADX INFO: renamed from: h92.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh92/b$a;", "T", "", "Lhz/b;", "state", "value", "<init>", "(Lhz/b;Ljava/lang/Object;)V", "a", "(Lhz/b;Ljava/lang/Object;)Lh92/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldState<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f82038c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public FieldState(hz.b bVar, T t15) {
            this.state = bVar;
            this.value = t15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FieldState b(FieldState fieldState, hz.b bVar, Object obj, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                bVar = fieldState.state;
            }
            if ((i15 & 2) != 0) {
                obj = fieldState.value;
            }
            return fieldState.a(bVar, obj);
        }

        public final FieldState<T> a(hz.b state, T value) {
            return new FieldState<>(state, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getState() {
            return this.state;
        }

        public final T d() {
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
            int iHashCode = this.state.hashCode() * 31;
            T t15 = this.value;
            return iHashCode + (t15 == null ? 0 : t15.hashCode());
        }

        public String toString() {
            return "FieldState(state=" + this.state + ", value=" + this.value + ')';
        }

        public /* synthetic */ FieldState(hz.b bVar, Object obj, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ State(fp0.l lVar, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, FieldState fieldState4, Coordinates coordinates, boolean z15, c82.a aVar, int i15, fr.k kVar) {
        int i16 = 1;
        this((i15 & 1) != 0 ? fp0.l.UNSELECTED : lVar, (i15 & 2) != 0 ? new FieldState(null, Label.INSTANCE.c(), i16, 0 == true ? 1 : 0) : fieldState, (i15 & 4) != 0 ? new FieldState(0 == true ? 1 : 0, Label.INSTANCE.c(), i16, 0 == true ? 1 : 0) : fieldState2, (i15 & 8) != 0 ? new FieldState(0 == true ? 1 : 0, Label.INSTANCE.c(), i16, 0 == true ? 1 : 0) : fieldState3, (i15 & 16) != 0 ? new FieldState(0 == true ? 1 : 0, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0) : fieldState4, (i15 & 32) != 0 ? null : coordinates, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? null : aVar);
    }
}
