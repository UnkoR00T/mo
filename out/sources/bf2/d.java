package bf2;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lbf2/d;", "", "Lbf2/c;", "a", "()Lbf2/c;", "showMapScreenStateData", "b", "Lbf2/d$a;", "Lbf2/d$b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: bf2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbf2/d$a;", "Lbf2/d;", "Lbf2/c;", "showMapScreenStateData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Lbf2/c;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbf2/c;", "()Lbf2/c;", "b", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShowMapScreenStateData showMapScreenStateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Dialog(ShowMapScreenStateData showMapScreenStateData, cb4.i iVar) {
            this.showMapScreenStateData = showMapScreenStateData;
            this.dialogVMSAdapter = iVar;
        }

        @Override // bf2.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public ShowMapScreenStateData getShowMapScreenStateData() {
            return this.showMapScreenStateData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return fr.t.c(this.showMapScreenStateData, dialog.showMapScreenStateData) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter);
        }

        public int hashCode() {
            return (this.showMapScreenStateData.hashCode() * 31) + this.dialogVMSAdapter.hashCode();
        }

        public String toString() {
            return "Dialog(showMapScreenStateData=" + this.showMapScreenStateData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: bf2.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lbf2/d$b;", "Lbf2/d;", "Lbf2/c;", "showMapScreenStateData", "<init>", "(Lbf2/c;)V", "b", "(Lbf2/c;)Lbf2/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbf2/c;", "()Lbf2/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f19144b = Coordinates.f208679c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShowMapScreenStateData showMapScreenStateData;

        public Screen(ShowMapScreenStateData showMapScreenStateData) {
            this.showMapScreenStateData = showMapScreenStateData;
        }

        @Override // bf2.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public ShowMapScreenStateData getShowMapScreenStateData() {
            return this.showMapScreenStateData;
        }

        public final Screen b(ShowMapScreenStateData showMapScreenStateData) {
            return new Screen(showMapScreenStateData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && fr.t.c(this.showMapScreenStateData, ((Screen) other).showMapScreenStateData);
        }

        public int hashCode() {
            return this.showMapScreenStateData.hashCode();
        }

        public String toString() {
            return "Screen(showMapScreenStateData=" + this.showMapScreenStateData + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    ShowMapScreenStateData getShowMapScreenStateData();
}
