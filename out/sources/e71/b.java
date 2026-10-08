package e71;

import cl0.PassportChildApplicationGetChildData;
import k81.FieldItem;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Le71/b;", "", "b", "c", "a", "Le71/b$a;", "Le71/b$b;", "Le71/b$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: e71.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Le71/b$a;", "Le71/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

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

    /* JADX INFO: renamed from: e71.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le71/b$b;", "Le71/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1114b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1114b f47936a = new C1114b();

        private C1114b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1114b);
        }

        public int hashCode() {
            return -347482316;
        }

        public String toString() {
            return "FetchChildData";
        }
    }

    /* JADX INFO: renamed from: e71.b$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Le71/b$c;", "Le71/b;", "Lcl0/k0;", "childData", "", "birthPlaceInput", "Lhz/b;", "birthPlaceValidationState", "Lk81/b;", "", "citizenshipCheckBoxState", "scrollToCitizenshipCheckBox", "<init>", "(Lcl0/k0;Ljava/lang/String;Lhz/b;Lk81/b;Z)V", "a", "(Lcl0/k0;Ljava/lang/String;Lhz/b;Lk81/b;Z)Le71/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcl0/k0;", "e", "()Lcl0/k0;", "b", "Ljava/lang/String;", "c", "Lhz/b;", "d", "()Lhz/b;", "Lk81/b;", "f", "()Lk81/b;", "Z", "g", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PassportChildApplicationGetChildData childData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthPlaceInput;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b birthPlaceValidationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FieldItem<Boolean> citizenshipCheckBoxState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToCitizenshipCheckBox;

        public Initialized(PassportChildApplicationGetChildData passportChildApplicationGetChildData, String str, hz.b bVar, FieldItem<Boolean> fieldItem, boolean z15) {
            this.childData = passportChildApplicationGetChildData;
            this.birthPlaceInput = str;
            this.birthPlaceValidationState = bVar;
            this.citizenshipCheckBoxState = fieldItem;
            this.scrollToCitizenshipCheckBox = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, PassportChildApplicationGetChildData passportChildApplicationGetChildData, String str, hz.b bVar, FieldItem fieldItem, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                passportChildApplicationGetChildData = initialized.childData;
            }
            if ((i15 & 2) != 0) {
                str = initialized.birthPlaceInput;
            }
            if ((i15 & 4) != 0) {
                bVar = initialized.birthPlaceValidationState;
            }
            if ((i15 & 8) != 0) {
                fieldItem = initialized.citizenshipCheckBoxState;
            }
            if ((i15 & 16) != 0) {
                z15 = initialized.scrollToCitizenshipCheckBox;
            }
            boolean z16 = z15;
            hz.b bVar2 = bVar;
            return initialized.a(passportChildApplicationGetChildData, str, bVar2, fieldItem, z16);
        }

        public final Initialized a(PassportChildApplicationGetChildData childData, String birthPlaceInput, hz.b birthPlaceValidationState, FieldItem<Boolean> citizenshipCheckBoxState, boolean scrollToCitizenshipCheckBox) {
            return new Initialized(childData, birthPlaceInput, birthPlaceValidationState, citizenshipCheckBoxState, scrollToCitizenshipCheckBox);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBirthPlaceInput() {
            return this.birthPlaceInput;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getBirthPlaceValidationState() {
            return this.birthPlaceValidationState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PassportChildApplicationGetChildData getChildData() {
            return this.childData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.childData, initialized.childData) && fr.t.c(this.birthPlaceInput, initialized.birthPlaceInput) && fr.t.c(this.birthPlaceValidationState, initialized.birthPlaceValidationState) && fr.t.c(this.citizenshipCheckBoxState, initialized.citizenshipCheckBoxState) && this.scrollToCitizenshipCheckBox == initialized.scrollToCitizenshipCheckBox;
        }

        public final FieldItem<Boolean> f() {
            return this.citizenshipCheckBoxState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getScrollToCitizenshipCheckBox() {
            return this.scrollToCitizenshipCheckBox;
        }

        public int hashCode() {
            int iHashCode = this.childData.hashCode() * 31;
            String str = this.birthPlaceInput;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.birthPlaceValidationState.hashCode()) * 31) + this.citizenshipCheckBoxState.hashCode()) * 31) + Boolean.hashCode(this.scrollToCitizenshipCheckBox);
        }

        public String toString() {
            return "Initialized(childData=" + this.childData + ", birthPlaceInput=" + this.birthPlaceInput + ", birthPlaceValidationState=" + this.birthPlaceValidationState + ", citizenshipCheckBoxState=" + this.citizenshipCheckBoxState + ", scrollToCitizenshipCheckBox=" + this.scrollToCitizenshipCheckBox + ')';
        }
    }
}
