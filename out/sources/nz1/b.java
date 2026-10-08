package nz1;

import p071kotlin.Metadata;
import un0.AvailableElectionSupports;
import un0.ElectionActionEligibilityProfileAccess;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lnz1/b;", "", "b", "a", "Lnz1/b$a;", "Lnz1/b$b;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: nz1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnz1/b$a;", "Lnz1/b;", "Lun0/d;", "profileAccess", "Lun0/b;", "availableElectionSupports", "<init>", "(Lun0/d;Lun0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lun0/d;", "b", "()Lun0/d;", "Lun0/b;", "()Lun0/b;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Displayed implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ElectionActionEligibilityProfileAccess profileAccess;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AvailableElectionSupports availableElectionSupports;

        public Displayed(ElectionActionEligibilityProfileAccess electionActionEligibilityProfileAccess, AvailableElectionSupports availableElectionSupports) {
            this.profileAccess = electionActionEligibilityProfileAccess;
            this.availableElectionSupports = availableElectionSupports;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AvailableElectionSupports getAvailableElectionSupports() {
            return this.availableElectionSupports;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ElectionActionEligibilityProfileAccess getProfileAccess() {
            return this.profileAccess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displayed)) {
                return false;
            }
            Displayed displayed = (Displayed) other;
            return fr.t.c(this.profileAccess, displayed.profileAccess) && fr.t.c(this.availableElectionSupports, displayed.availableElectionSupports);
        }

        public int hashCode() {
            return (this.profileAccess.hashCode() * 31) + this.availableElectionSupports.hashCode();
        }

        public String toString() {
            return "Displayed(profileAccess=" + this.profileAccess + ", availableElectionSupports=" + this.availableElectionSupports + ')';
        }
    }

    /* JADX INFO: renamed from: nz1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnz1/b$b;", "Lnz1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3466b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3466b f139742a = new C3466b();

        private C3466b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3466b);
        }

        public int hashCode() {
            return -1020557;
        }

        public String toString() {
            return "ServiceForAdults";
        }
    }
}
