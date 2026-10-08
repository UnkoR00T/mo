package sy0;

import java.util.List;
import kh0.BEDashboardFavoritePoints;
import kh0.BEFavoriteMeasurementPoint;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lsy0/d;", "", "a", "b", "Lsy0/d$a;", "Lsy0/d$b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: sy0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsy0/d$a;", "Lsy0/d;", "Lkh0/d;", "dashboardFavoritePoints", "<init>", "(Lkh0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkh0/d;", "()Lkh0/d;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEDashboardFavoritePoints dashboardFavoritePoints;

        public Initial(BEDashboardFavoritePoints bEDashboardFavoritePoints) {
            this.dashboardFavoritePoints = bEDashboardFavoritePoints;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEDashboardFavoritePoints getDashboardFavoritePoints() {
            return this.dashboardFavoritePoints;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.dashboardFavoritePoints, ((Initial) other).dashboardFavoritePoints);
        }

        public int hashCode() {
            return this.dashboardFavoritePoints.hashCode();
        }

        public String toString() {
            return "Initial(dashboardFavoritePoints=" + this.dashboardFavoritePoints + ')';
        }
    }

    /* JADX INFO: renamed from: sy0.d$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lsy0/d$b;", "Lsy0/d;", "", "Lkh0/g;", "favoritePointsList", "", "initialListOrder", "idMenuVisible", "", "isWidgetEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lsy0/d$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "Ljava/lang/String;", "d", "Z", "f", "()Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFavoriteMeasurementPoint> favoritePointsList;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> initialListOrder;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idMenuVisible;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWidgetEnabled;

        public Initialized(List<BEFavoriteMeasurementPoint> list, List<String> list2, String str, boolean z15) {
            this.favoritePointsList = list;
            this.initialListOrder = list2;
            this.idMenuVisible = str;
            this.isWidgetEnabled = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, List list2, String str, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.favoritePointsList;
            }
            if ((i15 & 2) != 0) {
                list2 = initialized.initialListOrder;
            }
            if ((i15 & 4) != 0) {
                str = initialized.idMenuVisible;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isWidgetEnabled;
            }
            return initialized.a(list, list2, str, z15);
        }

        public final Initialized a(List<BEFavoriteMeasurementPoint> favoritePointsList, List<String> initialListOrder, String idMenuVisible, boolean isWidgetEnabled) {
            return new Initialized(favoritePointsList, initialListOrder, idMenuVisible, isWidgetEnabled);
        }

        public final List<BEFavoriteMeasurementPoint> c() {
            return this.favoritePointsList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getIdMenuVisible() {
            return this.idMenuVisible;
        }

        public final List<String> e() {
            return this.initialListOrder;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.favoritePointsList, initialized.favoritePointsList) && fr.t.c(this.initialListOrder, initialized.initialListOrder) && fr.t.c(this.idMenuVisible, initialized.idMenuVisible) && this.isWidgetEnabled == initialized.isWidgetEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsWidgetEnabled() {
            return this.isWidgetEnabled;
        }

        public int hashCode() {
            int iHashCode = ((this.favoritePointsList.hashCode() * 31) + this.initialListOrder.hashCode()) * 31;
            String str = this.idMenuVisible;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isWidgetEnabled);
        }

        public String toString() {
            return "Initialized(favoritePointsList=" + this.favoritePointsList + ", initialListOrder=" + this.initialListOrder + ", idMenuVisible=" + this.idMenuVisible + ", isWidgetEnabled=" + this.isWidgetEnabled + ')';
        }
    }
}
