package kt1;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import al0.PhysicalIdCardRestrictions;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lkt1/a;", "", "b", "c", "a", "Lkt1/a$a;", "Lkt1/a$b;", "Lkt1/a$c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: kt1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkt1/a$a;", "Lkt1/a;", "Lkt1/b;", "drivingLicenceRestrictionConfirmationData", "<init>", "(Lkt1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkt1/b;", "()Lkt1/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DrivingLicenceSetupData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceRestrictionConfirmationData drivingLicenceRestrictionConfirmationData;

        public DrivingLicenceSetupData(DrivingLicenceRestrictionConfirmationData drivingLicenceRestrictionConfirmationData) {
            this.drivingLicenceRestrictionConfirmationData = drivingLicenceRestrictionConfirmationData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DrivingLicenceRestrictionConfirmationData getDrivingLicenceRestrictionConfirmationData() {
            return this.drivingLicenceRestrictionConfirmationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DrivingLicenceSetupData) && t.c(this.drivingLicenceRestrictionConfirmationData, ((DrivingLicenceSetupData) other).drivingLicenceRestrictionConfirmationData);
        }

        public int hashCode() {
            return this.drivingLicenceRestrictionConfirmationData.hashCode();
        }

        public String toString() {
            return "DrivingLicenceSetupData(drivingLicenceRestrictionConfirmationData=" + this.drivingLicenceRestrictionConfirmationData + ')';
        }
    }

    /* JADX INFO: renamed from: kt1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkt1/a$b;", "Lkt1/a;", "Lal0/v0;", "physicalIdCardRestrictions", "<init>", "(Lal0/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/v0;", "()Lal0/v0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdSetupData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhysicalIdCardRestrictions physicalIdCardRestrictions;

        public IdSetupData(PhysicalIdCardRestrictions physicalIdCardRestrictions) {
            this.physicalIdCardRestrictions = physicalIdCardRestrictions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PhysicalIdCardRestrictions getPhysicalIdCardRestrictions() {
            return this.physicalIdCardRestrictions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdSetupData) && t.c(this.physicalIdCardRestrictions, ((IdSetupData) other).physicalIdCardRestrictions);
        }

        public int hashCode() {
            return this.physicalIdCardRestrictions.hashCode();
        }

        public String toString() {
            return "IdSetupData(physicalIdCardRestrictions=" + this.physicalIdCardRestrictions + ')';
        }
    }

    /* JADX INFO: renamed from: kt1.a$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkt1/a$c;", "Lkt1/a;", "Lal0/o;", "passport", "Lal0/p;", "passportRestriction", "<init>", "(Lal0/o;Lal0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/o;", "()Lal0/o;", "b", "Lal0/p;", "()Lal0/p;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassportSetupData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BankRestrictionPassport passport;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BankRestrictionPassportDocumentRestriction passportRestriction;

        public PassportSetupData(BankRestrictionPassport bankRestrictionPassport, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction) {
            this.passport = bankRestrictionPassport;
            this.passportRestriction = bankRestrictionPassportDocumentRestriction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankRestrictionPassport getPassport() {
            return this.passport;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BankRestrictionPassportDocumentRestriction getPassportRestriction() {
            return this.passportRestriction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassportSetupData)) {
                return false;
            }
            PassportSetupData passportSetupData = (PassportSetupData) other;
            return t.c(this.passport, passportSetupData.passport) && t.c(this.passportRestriction, passportSetupData.passportRestriction);
        }

        public int hashCode() {
            return (this.passport.hashCode() * 31) + this.passportRestriction.hashCode();
        }

        public String toString() {
            return "PassportSetupData(passport=" + this.passport + ", passportRestriction=" + this.passportRestriction + ')';
        }
    }
}
