package k81;

import al0.s0;
import cl0.g0;
import fr.t;
import i61.EnterChildValidatedData;
import i61.n;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lk81/a;", "", "Lk81/a$b;", "e0", "()Lk81/a$b;", "Li61/o;", "validatedData", "Li61/n;", "formData", "Loq/i0;", "h2", "(Li61/o;Li61/n;)V", "a", "b", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: k81.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk81/a$a;", "", "Lk81/a$b;", "enterChildSetupData", "Li61/o;", "enterChildValidatedData", "<init>", "(Lk81/a$b;Li61/o;)V", "a", "(Lk81/a$b;Li61/o;)Lk81/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk81/a$b;", "c", "()Lk81/a$b;", "b", "Li61/o;", "d", "()Li61/o;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterChildContractData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f109172c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnterChildSetupData enterChildSetupData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnterChildValidatedData enterChildValidatedData;

        static {
            int i15 = b0.f97726c;
            int i16 = fz.b.LocalDate.f68860b;
            f109172c = i15 | i16 | i15 | i16 | i15 | i15 | i15 | i15 | i15 | i15 | i15 | i15 | i15 | i15;
        }

        public EnterChildContractData(EnterChildSetupData enterChildSetupData, EnterChildValidatedData enterChildValidatedData) {
            this.enterChildSetupData = enterChildSetupData;
            this.enterChildValidatedData = enterChildValidatedData;
        }

        public static /* synthetic */ EnterChildContractData b(EnterChildContractData enterChildContractData, EnterChildSetupData enterChildSetupData, EnterChildValidatedData enterChildValidatedData, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                enterChildSetupData = enterChildContractData.enterChildSetupData;
            }
            if ((i15 & 2) != 0) {
                enterChildValidatedData = enterChildContractData.enterChildValidatedData;
            }
            return enterChildContractData.a(enterChildSetupData, enterChildValidatedData);
        }

        public final EnterChildContractData a(EnterChildSetupData enterChildSetupData, EnterChildValidatedData enterChildValidatedData) {
            return new EnterChildContractData(enterChildSetupData, enterChildValidatedData);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnterChildSetupData getEnterChildSetupData() {
            return this.enterChildSetupData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnterChildValidatedData getEnterChildValidatedData() {
            return this.enterChildValidatedData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnterChildContractData)) {
                return false;
            }
            EnterChildContractData enterChildContractData = (EnterChildContractData) other;
            return t.c(this.enterChildSetupData, enterChildContractData.enterChildSetupData) && t.c(this.enterChildValidatedData, enterChildContractData.enterChildValidatedData);
        }

        public int hashCode() {
            EnterChildSetupData enterChildSetupData = this.enterChildSetupData;
            int iHashCode = (enterChildSetupData == null ? 0 : enterChildSetupData.hashCode()) * 31;
            EnterChildValidatedData enterChildValidatedData = this.enterChildValidatedData;
            return iHashCode + (enterChildValidatedData != null ? enterChildValidatedData.hashCode() : 0);
        }

        public String toString() {
            return "EnterChildContractData(enterChildSetupData=" + this.enterChildSetupData + ", enterChildValidatedData=" + this.enterChildValidatedData + ')';
        }
    }

    /* JADX INFO: renamed from: k81.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lk81/a$b;", "", "Li61/n;", "enterChildFormData", "Li61/t;", "whoAgrees", "Lal0/s0;", "passportType", "Lcl0/g0;", "passportOfficePlace", "<init>", "(Li61/n;Li61/t;Lal0/s0;Lcl0/g0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li61/n;", "()Li61/n;", "b", "Li61/t;", "()Li61/t;", "c", "Lal0/s0;", "getPassportType", "()Lal0/s0;", "d", "Lcl0/g0;", "getPassportOfficePlace", "()Lcl0/g0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterChildSetupData {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f109175e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n enterChildFormData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i61.t whoAgrees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g0 passportOfficePlace;

        static {
            int i15 = b0.f97726c;
            f109175e = i15 | fz.b.LocalDate.f68860b | i15 | i15 | i15 | i15 | i15;
        }

        public EnterChildSetupData(n nVar, i61.t tVar, s0 s0Var, g0 g0Var) {
            this.enterChildFormData = nVar;
            this.whoAgrees = tVar;
            this.passportType = s0Var;
            this.passportOfficePlace = g0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n getEnterChildFormData() {
            return this.enterChildFormData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final i61.t getWhoAgrees() {
            return this.whoAgrees;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnterChildSetupData)) {
                return false;
            }
            EnterChildSetupData enterChildSetupData = (EnterChildSetupData) other;
            return t.c(this.enterChildFormData, enterChildSetupData.enterChildFormData) && this.whoAgrees == enterChildSetupData.whoAgrees && this.passportType == enterChildSetupData.passportType && this.passportOfficePlace == enterChildSetupData.passportOfficePlace;
        }

        public int hashCode() {
            n nVar = this.enterChildFormData;
            int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            i61.t tVar = this.whoAgrees;
            int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            s0 s0Var = this.passportType;
            int iHashCode3 = (iHashCode2 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
            g0 g0Var = this.passportOfficePlace;
            return iHashCode3 + (g0Var != null ? g0Var.hashCode() : 0);
        }

        public String toString() {
            return "EnterChildSetupData(enterChildFormData=" + this.enterChildFormData + ", whoAgrees=" + this.whoAgrees + ", passportType=" + this.passportType + ", passportOfficePlace=" + this.passportOfficePlace + ')';
        }
    }

    EnterChildSetupData e0();

    void h2(EnterChildValidatedData validatedData, n formData);
}
