package op2;

import al0.PassportChildApplicationChildData;
import al0.s0;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lop2/a;", "", "Lop2/a$c;", "childDataSetupFormData", "Loq/i0;", "U5", "(Lop2/a$c;)V", "Lop2/a$b;", "a2", "()Lop2/a$b;", "Leq2/a;", "childDataChildDataValidatedData", "g5", "(Leq2/a;)V", "a", "c", "b", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: op2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lop2/a$a;", "", "Lop2/a$c;", "childSetupFormData", "Leq2/a;", "childDataValidatedData", "<init>", "(Lop2/a$c;Leq2/a;)V", "a", "(Lop2/a$c;Leq2/a;)Lop2/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lop2/a$c;", "d", "()Lop2/a$c;", "b", "Leq2/a;", "c", "()Leq2/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildDataContractData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChildDataSetupFormData childSetupFormData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final eq2.a childDataValidatedData;

        public ChildDataContractData(ChildDataSetupFormData childDataSetupFormData, eq2.a aVar) {
            this.childSetupFormData = childDataSetupFormData;
            this.childDataValidatedData = aVar;
        }

        public static /* synthetic */ ChildDataContractData b(ChildDataContractData childDataContractData, ChildDataSetupFormData childDataSetupFormData, eq2.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                childDataSetupFormData = childDataContractData.childSetupFormData;
            }
            if ((i15 & 2) != 0) {
                aVar = childDataContractData.childDataValidatedData;
            }
            return childDataContractData.a(childDataSetupFormData, aVar);
        }

        public final ChildDataContractData a(ChildDataSetupFormData childSetupFormData, eq2.a childDataValidatedData) {
            return new ChildDataContractData(childSetupFormData, childDataValidatedData);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final eq2.a getChildDataValidatedData() {
            return this.childDataValidatedData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ChildDataSetupFormData getChildSetupFormData() {
            return this.childSetupFormData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildDataContractData)) {
                return false;
            }
            ChildDataContractData childDataContractData = (ChildDataContractData) other;
            return t.c(this.childSetupFormData, childDataContractData.childSetupFormData) && t.c(this.childDataValidatedData, childDataContractData.childDataValidatedData);
        }

        public int hashCode() {
            ChildDataSetupFormData childDataSetupFormData = this.childSetupFormData;
            int iHashCode = (childDataSetupFormData == null ? 0 : childDataSetupFormData.hashCode()) * 31;
            eq2.a aVar = this.childDataValidatedData;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "ChildDataContractData(childSetupFormData=" + this.childSetupFormData + ", childDataValidatedData=" + this.childDataValidatedData + ')';
        }
    }

    /* JADX INFO: renamed from: op2.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Lop2/a$b;", "", "Lop2/a$c;", "childDataSetupFormData", "Lal0/s0;", "passportType", "", "childId", "<init>", "(Lop2/a$c;Lal0/s0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lop2/a$c;", "()Lop2/a$c;", "b", "Lal0/s0;", "c", "()Lal0/s0;", "Ljava/lang/String;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildDataSetupData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChildDataSetupFormData childDataSetupFormData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String childId;

        public ChildDataSetupData(ChildDataSetupFormData childDataSetupFormData, s0 s0Var, String str) {
            this.childDataSetupFormData = childDataSetupFormData;
            this.passportType = s0Var;
            this.childId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChildDataSetupFormData getChildDataSetupFormData() {
            return this.childDataSetupFormData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getChildId() {
            return this.childId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s0 getPassportType() {
            return this.passportType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildDataSetupData)) {
                return false;
            }
            ChildDataSetupData childDataSetupData = (ChildDataSetupData) other;
            return t.c(this.childDataSetupFormData, childDataSetupData.childDataSetupFormData) && this.passportType == childDataSetupData.passportType && t.c(this.childId, childDataSetupData.childId);
        }

        public int hashCode() {
            ChildDataSetupFormData childDataSetupFormData = this.childDataSetupFormData;
            return ((((childDataSetupFormData == null ? 0 : childDataSetupFormData.hashCode()) * 31) + this.passportType.hashCode()) * 31) + this.childId.hashCode();
        }

        public String toString() {
            return "ChildDataSetupData(childDataSetupFormData=" + this.childDataSetupFormData + ", passportType=" + this.passportType + ", childId=" + this.childId + ')';
        }
    }

    /* JADX INFO: renamed from: op2.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lop2/a$c;", "", "Lal0/l0;", "passportChildApplicationChildData", "Liy/b0;", "birthPlaceInput", "<init>", "(Lal0/l0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/l0;", "getPassportChildApplicationChildData", "()Lal0/l0;", "b", "Liy/b0;", "()Liy/b0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildDataSetupFormData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PassportChildApplicationChildData passportChildApplicationChildData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 birthPlaceInput;

        public ChildDataSetupFormData(PassportChildApplicationChildData passportChildApplicationChildData, b0 b0Var) {
            this.passportChildApplicationChildData = passportChildApplicationChildData;
            this.birthPlaceInput = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getBirthPlaceInput() {
            return this.birthPlaceInput;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildDataSetupFormData)) {
                return false;
            }
            ChildDataSetupFormData childDataSetupFormData = (ChildDataSetupFormData) other;
            return t.c(this.passportChildApplicationChildData, childDataSetupFormData.passportChildApplicationChildData) && t.c(this.birthPlaceInput, childDataSetupFormData.birthPlaceInput);
        }

        public int hashCode() {
            int iHashCode = this.passportChildApplicationChildData.hashCode() * 31;
            b0 b0Var = this.birthPlaceInput;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        public String toString() {
            return "ChildDataSetupFormData(passportChildApplicationChildData=" + this.passportChildApplicationChildData + ", birthPlaceInput=" + this.birthPlaceInput + ')';
        }
    }

    void U5(ChildDataSetupFormData childDataSetupFormData);

    ChildDataSetupData a2();

    void g5(eq2.a childDataChildDataValidatedData);
}
