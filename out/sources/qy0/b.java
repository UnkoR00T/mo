package qy0;

import java.util.List;
import kh0.BEFavoriteMeasurementPoint;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lqy0/b;", "", "b", "a", "c", "Lqy0/b$a;", "Lqy0/b$b;", "Lqy0/b$c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: qy0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqy0/b$a;", "Lqy0/b;", "Lpy0/b;", "setupData", "<init>", "(Lpy0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpy0/b;", "()Lpy0/b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final py0.b setupData;

        public Empty(py0.b bVar) {
            this.setupData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final py0.b getSetupData() {
            return this.setupData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && this.setupData == ((Empty) other).setupData;
        }

        public int hashCode() {
            return this.setupData.hashCode();
        }

        public String toString() {
            return "Empty(setupData=" + this.setupData + ')';
        }
    }

    /* JADX INFO: renamed from: qy0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqy0/b$b;", "Lqy0/b;", "Lpy0/b;", "setupData", "<init>", "(Lpy0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpy0/b;", "()Lpy0/b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final py0.b setupData;

        /* JADX WARN: Multi-variable type inference failed */
        public Initial() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final py0.b getSetupData() {
            return this.setupData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && this.setupData == ((Initial) other).setupData;
        }

        public int hashCode() {
            return this.setupData.hashCode();
        }

        public String toString() {
            return "Initial(setupData=" + this.setupData + ')';
        }

        public Initial(py0.b bVar) {
            this.setupData = bVar;
        }

        public /* synthetic */ Initial(py0.b bVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? py0.b.DEFAULT : bVar);
        }
    }

    /* JADX INFO: renamed from: qy0.b$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lqy0/b$c;", "Lqy0/b;", "Lpy0/b;", "setupData", "", "Lkh0/g;", "favoritePoints", "", "widgetPointId", "<init>", "(Lpy0/b;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpy0/b;", "b", "()Lpy0/b;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final py0.b setupData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFavoriteMeasurementPoint> favoritePoints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String widgetPointId;

        public Initialized(py0.b bVar, List<BEFavoriteMeasurementPoint> list, String str) {
            this.setupData = bVar;
            this.favoritePoints = list;
            this.widgetPointId = str;
        }

        public final List<BEFavoriteMeasurementPoint> a() {
            return this.favoritePoints;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final py0.b getSetupData() {
            return this.setupData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getWidgetPointId() {
            return this.widgetPointId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.setupData == initialized.setupData && fr.t.c(this.favoritePoints, initialized.favoritePoints) && fr.t.c(this.widgetPointId, initialized.widgetPointId);
        }

        public int hashCode() {
            int iHashCode = ((this.setupData.hashCode() * 31) + this.favoritePoints.hashCode()) * 31;
            String str = this.widgetPointId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Initialized(setupData=" + this.setupData + ", favoritePoints=" + this.favoritePoints + ", widgetPointId=" + this.widgetPointId + ')';
        }
    }
}
