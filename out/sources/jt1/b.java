package jt1;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import al0.PhysicalIdCardRestrictions;
import kt1.DrivingLicenceRestrictionConfirmationData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljt1/b;", "", "b", "c", "a", "Ljt1/b$a;", "Ljt1/b$b;", "Ljt1/b$c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ljt1/b$a;", "Ljt1/b;", "Lkt1/b;", "a", "()Lkt1/b;", "drivingLicenceRestrictionData", "Ljt1/b$a$a;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends b {

        /* JADX INFO: renamed from: jt1.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljt1/b$a$a;", "Ljt1/b$a;", "Lkt1/b;", "drivingLicenceRestrictionData", "<init>", "(Lkt1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkt1/b;", "()Lkt1/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DrivingLicenceRestrictionConfirmationData drivingLicenceRestrictionData;

            public Initialized(DrivingLicenceRestrictionConfirmationData drivingLicenceRestrictionConfirmationData) {
                this.drivingLicenceRestrictionData = drivingLicenceRestrictionConfirmationData;
            }

            @Override // jt1.b.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public DrivingLicenceRestrictionConfirmationData getDrivingLicenceRestrictionData() {
                return this.drivingLicenceRestrictionData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && fr.t.c(this.drivingLicenceRestrictionData, ((Initialized) other).drivingLicenceRestrictionData);
            }

            public int hashCode() {
                return this.drivingLicenceRestrictionData.hashCode();
            }

            public String toString() {
                return "Initialized(drivingLicenceRestrictionData=" + this.drivingLicenceRestrictionData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        DrivingLicenceRestrictionConfirmationData getDrivingLicenceRestrictionData();
    }

    /* JADX INFO: renamed from: jt1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljt1/b$b;", "Ljt1/b;", "Lal0/v0;", "c", "()Lal0/v0;", "physicalIdCardRestrictions", "a", "Ljt1/b$b$a;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2499b extends b {

        /* JADX INFO: renamed from: jt1.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljt1/b$b$a;", "Ljt1/b$b;", "Lal0/v0;", "physicalIdCardRestrictions", "<init>", "(Lal0/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/v0;", "c", "()Lal0/v0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements InterfaceC2499b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhysicalIdCardRestrictions physicalIdCardRestrictions;

            public Initialized(PhysicalIdCardRestrictions physicalIdCardRestrictions) {
                this.physicalIdCardRestrictions = physicalIdCardRestrictions;
            }

            @Override // jt1.b.InterfaceC2499b
            /* JADX INFO: renamed from: c, reason: from getter */
            public PhysicalIdCardRestrictions getPhysicalIdCardRestrictions() {
                return this.physicalIdCardRestrictions;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && fr.t.c(this.physicalIdCardRestrictions, ((Initialized) other).physicalIdCardRestrictions);
            }

            public int hashCode() {
                return this.physicalIdCardRestrictions.hashCode();
            }

            public String toString() {
                return "Initialized(physicalIdCardRestrictions=" + this.physicalIdCardRestrictions + ')';
            }
        }

        /* JADX INFO: renamed from: c */
        PhysicalIdCardRestrictions getPhysicalIdCardRestrictions();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljt1/b$c;", "Ljt1/b;", "Lal0/o;", "b", "()Lal0/o;", "passport", "a", "Ljt1/b$c$a;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends b {

        /* JADX INFO: renamed from: jt1.b$c$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljt1/b$c$a;", "Ljt1/b$c;", "Lal0/o;", "passport", "Lal0/p;", "passportRestriction", "<init>", "(Lal0/o;Lal0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/o;", "b", "()Lal0/o;", "Lal0/p;", "d", "()Lal0/p;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BankRestrictionPassport passport;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BankRestrictionPassportDocumentRestriction passportRestriction;

            public Initialized(BankRestrictionPassport bankRestrictionPassport, BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction) {
                this.passport = bankRestrictionPassport;
                this.passportRestriction = bankRestrictionPassportDocumentRestriction;
            }

            @Override // jt1.b.c
            /* JADX INFO: renamed from: b, reason: from getter */
            public BankRestrictionPassport getPassport() {
                return this.passport;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public BankRestrictionPassportDocumentRestriction getPassportRestriction() {
                return this.passportRestriction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.passport, initialized.passport) && fr.t.c(this.passportRestriction, initialized.passportRestriction);
            }

            public int hashCode() {
                return (this.passport.hashCode() * 31) + this.passportRestriction.hashCode();
            }

            public String toString() {
                return "Initialized(passport=" + this.passport + ", passportRestriction=" + this.passportRestriction + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        BankRestrictionPassport getPassport();
    }
}
