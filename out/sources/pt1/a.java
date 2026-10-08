package pt1;

import dl0.BEBankRestrictionDrivingLicenceResponseDrivingLicence;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpt1/a;", "", "Ldl0/b;", "a", "()Ldl0/b;", "drivingLicence", "c", "b", "d", "Lpt1/a$a;", "Lpt1/a$b;", "Lpt1/a$c;", "Lpt1/a$d;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: pt1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpt1/a$a;", "Lpt1/a;", "Ldl0/b;", "drivingLicence", "<init>", "(Ldl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldl0/b;", "()Ldl0/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class App implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEBankRestrictionDrivingLicenceResponseDrivingLicence drivingLicence;

        public App(BEBankRestrictionDrivingLicenceResponseDrivingLicence bVar) {
            this.drivingLicence = bVar;
        }

        @Override // pt1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public BEBankRestrictionDrivingLicenceResponseDrivingLicence getDrivingLicence() {
            return this.drivingLicence;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof App) && t.c(this.drivingLicence, ((App) other).drivingLicence);
        }

        public int hashCode() {
            return this.drivingLicence.hashCode();
        }

        public String toString() {
            return "App(drivingLicence=" + this.drivingLicence + ')';
        }
    }

    /* JADX INFO: renamed from: pt1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpt1/a$b;", "Lpt1/a;", "Ldl0/b;", "drivingLicence", "<init>", "(Ldl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldl0/b;", "()Ldl0/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppAndBank implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEBankRestrictionDrivingLicenceResponseDrivingLicence drivingLicence;

        public AppAndBank(BEBankRestrictionDrivingLicenceResponseDrivingLicence bVar) {
            this.drivingLicence = bVar;
        }

        @Override // pt1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public BEBankRestrictionDrivingLicenceResponseDrivingLicence getDrivingLicence() {
            return this.drivingLicence;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppAndBank) && t.c(this.drivingLicence, ((AppAndBank) other).drivingLicence);
        }

        public int hashCode() {
            return this.drivingLicence.hashCode();
        }

        public String toString() {
            return "AppAndBank(drivingLicence=" + this.drivingLicence + ')';
        }
    }

    /* JADX INFO: renamed from: pt1.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpt1/a$c;", "Lpt1/a;", "Ldl0/b;", "drivingLicence", "<init>", "(Ldl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldl0/b;", "()Ldl0/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bank implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEBankRestrictionDrivingLicenceResponseDrivingLicence drivingLicence;

        public Bank(BEBankRestrictionDrivingLicenceResponseDrivingLicence bVar) {
            this.drivingLicence = bVar;
        }

        @Override // pt1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public BEBankRestrictionDrivingLicenceResponseDrivingLicence getDrivingLicence() {
            return this.drivingLicence;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bank) && t.c(this.drivingLicence, ((Bank) other).drivingLicence);
        }

        public int hashCode() {
            return this.drivingLicence.hashCode();
        }

        public String toString() {
            return "Bank(drivingLicence=" + this.drivingLicence + ')';
        }
    }

    /* JADX INFO: renamed from: pt1.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpt1/a$d;", "Lpt1/a;", "Ldl0/b;", "drivingLicence", "<init>", "(Ldl0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldl0/b;", "()Ldl0/b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class None implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEBankRestrictionDrivingLicenceResponseDrivingLicence drivingLicence;

        public None(BEBankRestrictionDrivingLicenceResponseDrivingLicence bVar) {
            this.drivingLicence = bVar;
        }

        @Override // pt1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public BEBankRestrictionDrivingLicenceResponseDrivingLicence getDrivingLicence() {
            return this.drivingLicence;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && t.c(this.drivingLicence, ((None) other).drivingLicence);
        }

        public int hashCode() {
            return this.drivingLicence.hashCode();
        }

        public String toString() {
            return "None(drivingLicence=" + this.drivingLicence + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    BEBankRestrictionDrivingLicenceResponseDrivingLicence getDrivingLicence();
}
