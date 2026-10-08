package h31;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lh31/d;", "", "Lh31/d$b;", "getData", "()Lh31/d$b;", "data", "d", "a", "c", "b", "Lh31/d$a;", "Lh31/d$c;", "Lh31/d$d;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: h31.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh31/d$a;", "Lh31/d;", "Lh31/d$b;", "data", "<init>", "(Lh31/d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/d$b;", "getData", "()Lh31/d$b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckVehicleInsurance implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f80378b = (fz.b.OffsetDateTime.f68865b | hz.b.f86845b) | iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        public CheckVehicleInsurance(Data data) {
            this.data = data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckVehicleInsurance) && fr.t.c(this.data, ((CheckVehicleInsurance) other).data);
        }

        @Override // h31.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CheckVehicleInsurance(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: h31.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh31/d$c;", "Lh31/d;", "Lh31/d$b;", "data", "Lhb4/c;", "vmsAdapter", "<init>", "(Lh31/d$b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/d$b;", "getData", "()Lh31/d$b;", "b", "Lhb4/c;", "()Lhb4/c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c vmsAdapter;

        public Error(Data data, hb4.c cVar) {
            this.data = data;
            this.vmsAdapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getVmsAdapter() {
            return this.vmsAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.data, error.data) && fr.t.c(this.vmsAdapter, error.vmsAdapter);
        }

        @Override // h31.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.vmsAdapter.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.data + ", vmsAdapter=" + this.vmsAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: h31.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh31/d$d;", "Lh31/d;", "Lh31/d$b;", "data", "<init>", "(Lh31/d$b;)V", "a", "(Lh31/d$b;)Lh31/d$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lh31/d$b;", "getData", "()Lh31/d$b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f80390b = (fz.b.OffsetDateTime.f68865b | hz.b.f86845b) | iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        public Screen(Data data) {
            this.data = data;
        }

        public final Screen a(Data data) {
            return new Screen(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && fr.t.c(this.data, ((Screen) other).data);
        }

        @Override // h31.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Screen(data=" + this.data + ')';
        }
    }

    Data getData();

    /* JADX INFO: renamed from: h31.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lh31/d$b;", "", "Lh31/d$b$a;", "input", "Lfz/b$f;", "date", "", "scrollToField", "<init>", "(Lh31/d$b$a;Lfz/b$f;Z)V", "a", "(Lh31/d$b$a;Lfz/b$f;Z)Lh31/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lh31/d$b$a;", "d", "()Lh31/d$b$a;", "b", "Lfz/b$f;", "c", "()Lfz/b$f;", "Z", "e", "()Z", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f80380d = (fz.b.OffsetDateTime.f68865b | hz.b.f86845b) | iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Input input;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime date;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToField;

        public Data(Input input, fz.b.OffsetDateTime offsetDateTime, boolean z15) {
            this.input = input;
            this.date = offsetDateTime;
            this.scrollToField = z15;
        }

        public static /* synthetic */ Data b(Data data, Input input, fz.b.OffsetDateTime offsetDateTime, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                input = data.input;
            }
            if ((i15 & 2) != 0) {
                offsetDateTime = data.date;
            }
            if ((i15 & 4) != 0) {
                z15 = data.scrollToField;
            }
            return data.a(input, offsetDateTime, z15);
        }

        public final Data a(Input input, fz.b.OffsetDateTime date, boolean scrollToField) {
            return new Data(input, date, scrollToField);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fz.b.OffsetDateTime getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Input getInput() {
            return this.input;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getScrollToField() {
            return this.scrollToField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.input, data.input) && fr.t.c(this.date, data.date) && this.scrollToField == data.scrollToField;
        }

        public int hashCode() {
            return (((this.input.hashCode() * 31) + this.date.hashCode()) * 31) + Boolean.hashCode(this.scrollToField);
        }

        public String toString() {
            return "Data(input=" + this.input + ", date=" + this.date + ", scrollToField=" + this.scrollToField + ')';
        }

        /* JADX INFO: renamed from: h31.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lh31/d$b$a;", "", "Lw21/a;", "type", "Liy/b0;", "value", "Lhz/b;", "validationState", "<init>", "(Lw21/a;Liy/b0;Lhz/b;)V", "a", "(Lw21/a;Liy/b0;Lhz/b;)Lh31/d$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw21/a;", "c", "()Lw21/a;", "b", "Liy/b0;", "e", "()Liy/b0;", "Lhz/b;", "d", "()Lhz/b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Input {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f80384d = hz.b.f86845b | iy.b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final w21.a type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 value;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            public Input(w21.a aVar, iy.b0 b0Var, hz.b bVar) {
                this.type = aVar;
                this.value = b0Var;
                this.validationState = bVar;
            }

            public static /* synthetic */ Input b(Input input, w21.a aVar, iy.b0 b0Var, hz.b bVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    aVar = input.type;
                }
                if ((i15 & 2) != 0) {
                    b0Var = input.value;
                }
                if ((i15 & 4) != 0) {
                    bVar = input.validationState;
                }
                return input.a(aVar, b0Var, bVar);
            }

            public final Input a(w21.a type, iy.b0 value, hz.b validationState) {
                return new Input(type, value, validationState);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final w21.a getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final iy.b0 getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return this.type == input.type && fr.t.c(this.value, input.value) && fr.t.c(this.validationState, input.validationState);
            }

            public int hashCode() {
                return (((this.type.hashCode() * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode();
            }

            public String toString() {
                return "Input(type=" + this.type + ", value=" + this.value + ", validationState=" + this.validationState + ')';
            }

            public /* synthetic */ Input(w21.a aVar, iy.b0 b0Var, hz.b bVar, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? w21.a.PLATE : aVar, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 4) != 0 ? hz.b.d.f86848c : bVar);
            }
        }

        public /* synthetic */ Data(Input input, fz.b.OffsetDateTime offsetDateTime, boolean z15, int i15, fr.k kVar) {
            if ((i15 & 1) != 0) {
                input = new Input(null, null, null, 7, null);
            }
            this(input, offsetDateTime, (i15 & 4) != 0 ? false : z15);
        }
    }
}
