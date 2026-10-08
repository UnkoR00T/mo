package ea1;

import cl0.BEPassportChildApplicationParentData;
import ga1.FieldState;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lea1/c;", "", "a", "b", "Lea1/c$a;", "Lea1/c$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lea1/c$a;", "Lea1/c;", "b", "a", "Lea1/c$a$a;", "Lea1/c$a$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends c {

        /* JADX INFO: renamed from: ea1.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lea1/c$a$a;", "Lea1/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lea1/c$a$b;", "Lea1/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f48870a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -2137445634;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* JADX INFO: renamed from: ea1.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$¨\u0006%"}, d2 = {"Lea1/c$b;", "Lea1/c;", "Lcl0/r;", "parentData", "Lga1/b;", "birthPlaceFieldState", "idCardSeriesAndNumberFieldState", "idCardNameFieldState", "Lv91/a;", "documentTypeDropDownState", "<init>", "(Lcl0/r;Lga1/b;Lga1/b;Lga1/b;Lv91/a;)V", "a", "(Lcl0/r;Lga1/b;Lga1/b;Lga1/b;Lv91/a;)Lea1/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcl0/r;", "g", "()Lcl0/r;", "b", "Lga1/b;", "c", "()Lga1/b;", "f", "d", "e", "Lv91/a;", "()Lv91/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationParentData parentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FieldState birthPlaceFieldState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FieldState idCardSeriesAndNumberFieldState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FieldState idCardNameFieldState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownState documentTypeDropDownState;

        public Initialized(BEPassportChildApplicationParentData bEPassportChildApplicationParentData, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, DropDownState dropDownState) {
            this.parentData = bEPassportChildApplicationParentData;
            this.birthPlaceFieldState = fieldState;
            this.idCardSeriesAndNumberFieldState = fieldState2;
            this.idCardNameFieldState = fieldState3;
            this.documentTypeDropDownState = dropDownState;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, BEPassportChildApplicationParentData bEPassportChildApplicationParentData, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, DropDownState dropDownState, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bEPassportChildApplicationParentData = initialized.parentData;
            }
            if ((i15 & 2) != 0) {
                fieldState = initialized.birthPlaceFieldState;
            }
            if ((i15 & 4) != 0) {
                fieldState2 = initialized.idCardSeriesAndNumberFieldState;
            }
            if ((i15 & 8) != 0) {
                fieldState3 = initialized.idCardNameFieldState;
            }
            if ((i15 & 16) != 0) {
                dropDownState = initialized.documentTypeDropDownState;
            }
            DropDownState dropDownState2 = dropDownState;
            FieldState fieldState4 = fieldState2;
            return initialized.a(bEPassportChildApplicationParentData, fieldState, fieldState4, fieldState3, dropDownState2);
        }

        public final Initialized a(BEPassportChildApplicationParentData parentData, FieldState birthPlaceFieldState, FieldState idCardSeriesAndNumberFieldState, FieldState idCardNameFieldState, DropDownState documentTypeDropDownState) {
            return new Initialized(parentData, birthPlaceFieldState, idCardSeriesAndNumberFieldState, idCardNameFieldState, documentTypeDropDownState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FieldState getBirthPlaceFieldState() {
            return this.birthPlaceFieldState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DropDownState getDocumentTypeDropDownState() {
            return this.documentTypeDropDownState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final FieldState getIdCardNameFieldState() {
            return this.idCardNameFieldState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.parentData, initialized.parentData) && fr.t.c(this.birthPlaceFieldState, initialized.birthPlaceFieldState) && fr.t.c(this.idCardSeriesAndNumberFieldState, initialized.idCardSeriesAndNumberFieldState) && fr.t.c(this.idCardNameFieldState, initialized.idCardNameFieldState) && fr.t.c(this.documentTypeDropDownState, initialized.documentTypeDropDownState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FieldState getIdCardSeriesAndNumberFieldState() {
            return this.idCardSeriesAndNumberFieldState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BEPassportChildApplicationParentData getParentData() {
            return this.parentData;
        }

        public int hashCode() {
            return (((((((this.parentData.hashCode() * 31) + this.birthPlaceFieldState.hashCode()) * 31) + this.idCardSeriesAndNumberFieldState.hashCode()) * 31) + this.idCardNameFieldState.hashCode()) * 31) + this.documentTypeDropDownState.hashCode();
        }

        public String toString() {
            return "Initialized(parentData=" + this.parentData + ", birthPlaceFieldState=" + this.birthPlaceFieldState + ", idCardSeriesAndNumberFieldState=" + this.idCardSeriesAndNumberFieldState + ", idCardNameFieldState=" + this.idCardNameFieldState + ", documentTypeDropDownState=" + this.documentTypeDropDownState + ')';
        }

        public /* synthetic */ Initialized(BEPassportChildApplicationParentData bEPassportChildApplicationParentData, FieldState fieldState, FieldState fieldState2, FieldState fieldState3, DropDownState dropDownState, int i15, fr.k kVar) {
            this(bEPassportChildApplicationParentData, (i15 & 2) != 0 ? new FieldState(null, null, 3, null) : fieldState, (i15 & 4) != 0 ? new FieldState(null, null, 3, null) : fieldState2, (i15 & 8) != 0 ? new FieldState(null, null, 3, null) : fieldState3, (i15 & 16) != 0 ? new DropDownState(null, null, 3, null) : dropDownState);
        }
    }
}
