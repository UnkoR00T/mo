package ix2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ix2.k, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lix2/k;", "", "Lix2/m;", "parentsDataRequester", "Lix2/k$a;", "fathersName", "mothersName", "mothersMaidenName", "Lix2/a;", "scrollToField", "<init>", "(Lix2/m;Lix2/k$a;Lix2/k$a;Lix2/k$a;Lix2/a;)V", "a", "(Lix2/m;Lix2/k$a;Lix2/k$a;Lix2/k$a;Lix2/a;)Lix2/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lix2/m;", "f", "()Lix2/m;", "b", "Lix2/k$a;", "c", "()Lix2/k$a;", "e", "d", "Lix2/a;", "g", "()Lix2/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97630f = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m parentsDataRequester;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field fathersName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field mothersName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field mothersMaidenName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a scrollToField;

    public State(m mVar, Field field, Field field2, Field field3, a aVar) {
        this.parentsDataRequester = mVar;
        this.fathersName = field;
        this.mothersName = field2;
        this.mothersMaidenName = field3;
        this.scrollToField = aVar;
    }

    public static /* synthetic */ State b(State state, m mVar, Field field, Field field2, Field field3, a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mVar = state.parentsDataRequester;
        }
        if ((i15 & 2) != 0) {
            field = state.fathersName;
        }
        if ((i15 & 4) != 0) {
            field2 = state.mothersName;
        }
        if ((i15 & 8) != 0) {
            field3 = state.mothersMaidenName;
        }
        if ((i15 & 16) != 0) {
            aVar = state.scrollToField;
        }
        a aVar2 = aVar;
        Field field4 = field2;
        return state.a(mVar, field, field4, field3, aVar2);
    }

    public final State a(m parentsDataRequester, Field fathersName, Field mothersName, Field mothersMaidenName, a scrollToField) {
        return new State(parentsDataRequester, fathersName, mothersName, mothersMaidenName, scrollToField);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Field getFathersName() {
        return this.fathersName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Field getMothersMaidenName() {
        return this.mothersMaidenName;
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
        return this.parentsDataRequester == state.parentsDataRequester && fr.t.c(this.fathersName, state.fathersName) && fr.t.c(this.mothersName, state.mothersName) && fr.t.c(this.mothersMaidenName, state.mothersMaidenName) && this.scrollToField == state.scrollToField;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getParentsDataRequester() {
        return this.parentsDataRequester;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getScrollToField() {
        return this.scrollToField;
    }

    public int hashCode() {
        int iHashCode = ((((((this.parentsDataRequester.hashCode() * 31) + this.fathersName.hashCode()) * 31) + this.mothersName.hashCode()) * 31) + this.mothersMaidenName.hashCode()) * 31;
        a aVar = this.scrollToField;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "State(parentsDataRequester=" + this.parentsDataRequester + ", fathersName=" + this.fathersName + ", mothersName=" + this.mothersName + ", mothersMaidenName=" + this.mothersMaidenName + ", scrollToField=" + this.scrollToField + ')';
    }

    /* JADX INFO: renamed from: ix2.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lix2/k$a;", "", "Lhz/b;", "validationState", "", "value", "<init>", "(Lhz/b;Ljava/lang/String;)V", "a", "(Lhz/b;Ljava/lang/String;)Lix2/k$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/String;", "d", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f97636c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public Field(hz.b bVar, String str) {
            this.validationState = bVar;
            this.value = str;
        }

        public static /* synthetic */ Field b(Field field, hz.b bVar, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = field.validationState;
            }
            if ((i15 & 2) != 0) {
                str = field.value;
            }
            return field.a(bVar, str);
        }

        public final Field a(hz.b validationState, String value) {
            return new Field(validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
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
            return fr.t.c(this.validationState, field.validationState) && fr.t.c(this.value, field.value);
        }

        public int hashCode() {
            return (this.validationState.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Field(hz.b bVar, String str, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.d.f86848c : bVar, str);
        }
    }

    public /* synthetic */ State(m mVar, Field field, Field field2, Field field3, a aVar, int i15, fr.k kVar) {
        this(mVar, field, field2, field3, (i15 & 16) != 0 ? null : aVar);
    }
}
