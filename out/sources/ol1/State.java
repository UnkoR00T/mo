package ol1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ol1.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lol1/i;", "", "Lkk1/a;", "type", "Lol1/i$a;", "fathersName", "mothersName", "mothersFamilyName", "Lmk1/a;", "scrollToField", "<init>", "(Lkk1/a;Lol1/i$a;Lol1/i$a;Lol1/i$a;Lmk1/a;)V", "a", "(Lkk1/a;Lol1/i$a;Lol1/i$a;Lol1/i$a;Lmk1/a;)Lol1/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkk1/a;", "g", "()Lkk1/a;", "b", "Lol1/i$a;", "c", "()Lol1/i$a;", "e", "d", "Lmk1/a;", "f", "()Lmk1/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f146604f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kk1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field fathersName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field mothersName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field mothersFamilyName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk1.a scrollToField;

    static {
        int i15 = hz.b.f86845b;
        int i16 = iy.b0.f97726c;
        f146604f = i15 | i15 | i16 | i15 | i16 | i16;
    }

    public State(kk1.a aVar, Field field, Field field2, Field field3, mk1.a aVar2) {
        this.type = aVar;
        this.fathersName = field;
        this.mothersName = field2;
        this.mothersFamilyName = field3;
        this.scrollToField = aVar2;
    }

    public static /* synthetic */ State b(State state, kk1.a aVar, Field field, Field field2, Field field3, mk1.a aVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.type;
        }
        if ((i15 & 2) != 0) {
            field = state.fathersName;
        }
        if ((i15 & 4) != 0) {
            field2 = state.mothersName;
        }
        if ((i15 & 8) != 0) {
            field3 = state.mothersFamilyName;
        }
        if ((i15 & 16) != 0) {
            aVar2 = state.scrollToField;
        }
        mk1.a aVar3 = aVar2;
        Field field4 = field2;
        return state.a(aVar, field, field4, field3, aVar3);
    }

    public final State a(kk1.a type, Field fathersName, Field mothersName, Field mothersFamilyName, mk1.a scrollToField) {
        return new State(type, fathersName, mothersName, mothersFamilyName, scrollToField);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Field getFathersName() {
        return this.fathersName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Field getMothersFamilyName() {
        return this.mothersFamilyName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Field getMothersName() {
        return this.mothersName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.type == state.type && fr.t.c(this.fathersName, state.fathersName) && fr.t.c(this.mothersName, state.mothersName) && fr.t.c(this.mothersFamilyName, state.mothersFamilyName) && this.scrollToField == state.scrollToField;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final mk1.a getScrollToField() {
        return this.scrollToField;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final kk1.a getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.type.hashCode() * 31) + this.fathersName.hashCode()) * 31) + this.mothersName.hashCode()) * 31) + this.mothersFamilyName.hashCode()) * 31;
        mk1.a aVar = this.scrollToField;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "State(type=" + this.type + ", fathersName=" + this.fathersName + ", mothersName=" + this.mothersName + ", mothersFamilyName=" + this.mothersFamilyName + ", scrollToField=" + this.scrollToField + ')';
    }

    /* JADX INFO: renamed from: ol1.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lol1/i$a;", "", "Liy/b0;", "value", "Lhz/b;", "validationState", "<init>", "(Liy/b0;Lhz/b;)V", "a", "(Liy/b0;Lhz/b;)Lol1/i$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "Lhz/b;", "c", "()Lhz/b;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f146610c = hz.b.f86845b | iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        public Field(iy.b0 b0Var, hz.b bVar) {
            this.value = b0Var;
            this.validationState = bVar;
        }

        public static /* synthetic */ Field b(Field field, iy.b0 b0Var, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = field.value;
            }
            if ((i15 & 2) != 0) {
                bVar = field.validationState;
            }
            return field.a(b0Var, bVar);
        }

        public final Field a(iy.b0 value, hz.b validationState) {
            return new Field(value, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return fr.t.c(this.value, field.value) && fr.t.c(this.validationState, field.validationState);
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "Field(value=" + this.value + ", validationState=" + this.validationState + ')';
        }

        public /* synthetic */ Field(iy.b0 b0Var, hz.b bVar, int i15, fr.k kVar) {
            this(b0Var, (i15 & 2) != 0 ? hz.b.d.f86848c : bVar);
        }
    }

    public /* synthetic */ State(kk1.a aVar, Field field, Field field2, Field field3, mk1.a aVar2, int i15, fr.k kVar) {
        this(aVar, field, field2, field3, (i15 & 16) != 0 ? null : aVar2);
    }
}
