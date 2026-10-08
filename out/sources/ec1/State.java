package ec1;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ec1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lec1/b;", "", "Lec1/b$a;", "", "fullName", "shortName", "Ljava/time/LocalDate;", "launchDateFrom", "numberOfEmployees", "Lec1/d0;", "scrollToField", "<init>", "(Lec1/b$a;Lec1/b$a;Lec1/b$a;Lec1/b$a;Lec1/d0;)V", "a", "(Lec1/b$a;Lec1/b$a;Lec1/b$a;Lec1/b$a;Lec1/d0;)Lec1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lec1/b$a;", "c", "()Lec1/b$a;", "b", "g", "d", "e", "Lec1/d0;", "f", "()Lec1/d0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> shortName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<LocalDate> launchDateFrom;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> numberOfEmployees;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 scrollToField;

    public State(Field<String> field, Field<String> field2, Field<LocalDate> field3, Field<String> field4, d0 d0Var) {
        this.fullName = field;
        this.shortName = field2;
        this.launchDateFrom = field3;
        this.numberOfEmployees = field4;
        this.scrollToField = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, Field field, Field field2, Field field3, Field field4, d0 d0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            field = state.fullName;
        }
        if ((i15 & 2) != 0) {
            field2 = state.shortName;
        }
        if ((i15 & 4) != 0) {
            field3 = state.launchDateFrom;
        }
        if ((i15 & 8) != 0) {
            field4 = state.numberOfEmployees;
        }
        if ((i15 & 16) != 0) {
            d0Var = state.scrollToField;
        }
        d0 d0Var2 = d0Var;
        Field field5 = field3;
        return state.a(field, field2, field5, field4, d0Var2);
    }

    public final State a(Field<String> fullName, Field<String> shortName, Field<LocalDate> launchDateFrom, Field<String> numberOfEmployees, d0 scrollToField) {
        return new State(fullName, shortName, launchDateFrom, numberOfEmployees, scrollToField);
    }

    public final Field<String> c() {
        return this.fullName;
    }

    public final Field<LocalDate> d() {
        return this.launchDateFrom;
    }

    public final Field<String> e() {
        return this.numberOfEmployees;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.fullName, state.fullName) && fr.t.c(this.shortName, state.shortName) && fr.t.c(this.launchDateFrom, state.launchDateFrom) && fr.t.c(this.numberOfEmployees, state.numberOfEmployees) && this.scrollToField == state.scrollToField;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d0 getScrollToField() {
        return this.scrollToField;
    }

    public final Field<String> g() {
        return this.shortName;
    }

    public int hashCode() {
        int iHashCode = ((((((this.fullName.hashCode() * 31) + this.shortName.hashCode()) * 31) + this.launchDateFrom.hashCode()) * 31) + this.numberOfEmployees.hashCode()) * 31;
        d0 d0Var = this.scrollToField;
        return iHashCode + (d0Var == null ? 0 : d0Var.hashCode());
    }

    public String toString() {
        return "State(fullName=" + this.fullName + ", shortName=" + this.shortName + ", launchDateFrom=" + this.launchDateFrom + ", numberOfEmployees=" + this.numberOfEmployees + ", scrollToField=" + this.scrollToField + ')';
    }

    /* JADX INFO: renamed from: ec1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lec1/b$a;", "T", "", "Lhz/b;", "validationState", "value", "<init>", "(Lhz/b;Ljava/lang/Object;)V", "a", "(Lhz/b;Ljava/lang/Object;)Lec1/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f49328c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public Field(hz.b bVar, T t15) {
            this.validationState = bVar;
            this.value = t15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field b(Field field, hz.b bVar, Object obj, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                bVar = field.validationState;
            }
            if ((i15 & 2) != 0) {
                obj = field.value;
            }
            return field.a(bVar, obj);
        }

        public final Field<T> a(hz.b validationState, T value) {
            return new Field<>(validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public final T d() {
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
            int iHashCode = this.validationState.hashCode() * 31;
            T t15 = this.value;
            return iHashCode + (t15 == null ? 0 : t15.hashCode());
        }

        public String toString() {
            return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Field(hz.b bVar, Object obj, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, obj);
        }
    }

    public /* synthetic */ State(Field field, Field field2, Field field3, Field field4, d0 d0Var, int i15, fr.k kVar) {
        this(field, field2, field3, field4, (i15 & 16) != 0 ? null : d0Var);
    }
}
