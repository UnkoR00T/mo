package ne2;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lne2/c;", "", "Lne2/b;", "a", "()Lne2/b;", "mapScreenStateData", "b", "Lne2/c$a;", "Lne2/c$b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: ne2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lne2/c$a;", "Lne2/c;", "Lne2/b;", "mapScreenStateData", "Lcb4/i;", "dialog", "<init>", "(Lne2/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lne2/b;", "()Lne2/b;", "b", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MapScreenStateData mapScreenStateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialog;

        public Dialog(MapScreenStateData mapScreenStateData, cb4.i iVar) {
            this.mapScreenStateData = mapScreenStateData;
            this.dialog = iVar;
        }

        @Override // ne2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public MapScreenStateData getMapScreenStateData() {
            return this.mapScreenStateData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialog() {
            return this.dialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return fr.t.c(this.mapScreenStateData, dialog.mapScreenStateData) && fr.t.c(this.dialog, dialog.dialog);
        }

        public int hashCode() {
            return (this.mapScreenStateData.hashCode() * 31) + this.dialog.hashCode();
        }

        public String toString() {
            return "Dialog(mapScreenStateData=" + this.mapScreenStateData + ", dialog=" + this.dialog + ')';
        }
    }

    /* JADX INFO: renamed from: ne2.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lne2/c$b;", "Lne2/c;", "Lne2/b;", "mapScreenStateData", "<init>", "(Lne2/b;)V", "b", "(Lne2/b;)Lne2/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lne2/b;", "()Lne2/b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f135130b = Coordinates.f208679c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MapScreenStateData mapScreenStateData;

        public Screen(MapScreenStateData mapScreenStateData) {
            this.mapScreenStateData = mapScreenStateData;
        }

        @Override // ne2.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public MapScreenStateData getMapScreenStateData() {
            return this.mapScreenStateData;
        }

        public final Screen b(MapScreenStateData mapScreenStateData) {
            return new Screen(mapScreenStateData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && fr.t.c(this.mapScreenStateData, ((Screen) other).mapScreenStateData);
        }

        public int hashCode() {
            return this.mapScreenStateData.hashCode();
        }

        public String toString() {
            return "Screen(mapScreenStateData=" + this.mapScreenStateData + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    MapScreenStateData getMapScreenStateData();
}
