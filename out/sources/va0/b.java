package va0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lva0/b;", "", "a", "Lva0/b$a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: va0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lva0/b$a;", "Lva0/b;", "Lma0/a;", "currentVisibleTab", "", "isSchoolTabEnabled", "<init>", "(Lma0/a;Z)V", "a", "(Lma0/a;Z)Lva0/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lma0/a;", "c", "()Lma0/a;", "b", "Z", "d", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardDisplayed implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma0.a currentVisibleTab;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSchoolTabEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public DashboardDisplayed() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DashboardDisplayed b(DashboardDisplayed dashboardDisplayed, ma0.a aVar, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = dashboardDisplayed.currentVisibleTab;
            }
            if ((i15 & 2) != 0) {
                z15 = dashboardDisplayed.isSchoolTabEnabled;
            }
            return dashboardDisplayed.a(aVar, z15);
        }

        public final DashboardDisplayed a(ma0.a currentVisibleTab, boolean isSchoolTabEnabled) {
            return new DashboardDisplayed(currentVisibleTab, isSchoolTabEnabled);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ma0.a getCurrentVisibleTab() {
            return this.currentVisibleTab;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsSchoolTabEnabled() {
            return this.isSchoolTabEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DashboardDisplayed)) {
                return false;
            }
            DashboardDisplayed dashboardDisplayed = (DashboardDisplayed) other;
            return this.currentVisibleTab == dashboardDisplayed.currentVisibleTab && this.isSchoolTabEnabled == dashboardDisplayed.isSchoolTabEnabled;
        }

        public int hashCode() {
            return (this.currentVisibleTab.hashCode() * 31) + Boolean.hashCode(this.isSchoolTabEnabled);
        }

        public String toString() {
            return "DashboardDisplayed(currentVisibleTab=" + this.currentVisibleTab + ", isSchoolTabEnabled=" + this.isSchoolTabEnabled + ')';
        }

        public DashboardDisplayed(ma0.a aVar, boolean z15) {
            this.currentVisibleTab = aVar;
            this.isSchoolTabEnabled = z15;
        }

        public /* synthetic */ DashboardDisplayed(ma0.a aVar, boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? ma0.a.DESKTOP : aVar, (i15 & 2) != 0 ? false : z15);
        }
    }
}
