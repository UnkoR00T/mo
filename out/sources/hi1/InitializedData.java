package hi1;

import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: renamed from: hi1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJT\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR!\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lhi1/d;", "", "", "Liq0/p;", "favouriteServices", "Liq0/o;", "categoriesServices", "", "Lah1/h;", "serviceWidgetsViewStates", "Lah1/g;", "enabledServiceWidgets", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)Lhi1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "c", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashboardServiceEntry> favouriteServices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryDashboardServices> categoriesServices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<ah1.h<?>> serviceWidgetsViewStates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<ah1.g> enabledServiceWidgets;

    /* JADX WARN: Multi-variable type inference failed */
    public InitializedData(List<DashboardServiceEntry> list, List<CategoryDashboardServices> list2, Set<? extends ah1.h<?>> set, Set<? extends ah1.g> set2) {
        this.favouriteServices = list;
        this.categoriesServices = list2;
        this.serviceWidgetsViewStates = set;
        this.enabledServiceWidgets = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializedData b(InitializedData initializedData, List list, List list2, Set set, Set set2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = initializedData.favouriteServices;
        }
        if ((i15 & 2) != 0) {
            list2 = initializedData.categoriesServices;
        }
        if ((i15 & 4) != 0) {
            set = initializedData.serviceWidgetsViewStates;
        }
        if ((i15 & 8) != 0) {
            set2 = initializedData.enabledServiceWidgets;
        }
        return initializedData.a(list, list2, set, set2);
    }

    public final InitializedData a(List<DashboardServiceEntry> favouriteServices, List<CategoryDashboardServices> categoriesServices, Set<? extends ah1.h<?>> serviceWidgetsViewStates, Set<? extends ah1.g> enabledServiceWidgets) {
        return new InitializedData(favouriteServices, categoriesServices, serviceWidgetsViewStates, enabledServiceWidgets);
    }

    public final List<CategoryDashboardServices> c() {
        return this.categoriesServices;
    }

    public final Set<ah1.g> d() {
        return this.enabledServiceWidgets;
    }

    public final List<DashboardServiceEntry> e() {
        return this.favouriteServices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedData)) {
            return false;
        }
        InitializedData initializedData = (InitializedData) other;
        return fr.t.c(this.favouriteServices, initializedData.favouriteServices) && fr.t.c(this.categoriesServices, initializedData.categoriesServices) && fr.t.c(this.serviceWidgetsViewStates, initializedData.serviceWidgetsViewStates) && fr.t.c(this.enabledServiceWidgets, initializedData.enabledServiceWidgets);
    }

    public final Set<ah1.h<?>> f() {
        return this.serviceWidgetsViewStates;
    }

    public int hashCode() {
        return (((((this.favouriteServices.hashCode() * 31) + this.categoriesServices.hashCode()) * 31) + this.serviceWidgetsViewStates.hashCode()) * 31) + this.enabledServiceWidgets.hashCode();
    }

    public String toString() {
        return "InitializedData(favouriteServices=" + this.favouriteServices + ", categoriesServices=" + this.categoriesServices + ", serviceWidgetsViewStates=" + this.serviceWidgetsViewStates + ", enabledServiceWidgets=" + this.enabledServiceWidgets + ')';
    }

    public /* synthetic */ InitializedData(List list, List list2, Set set, Set set2, int i15, fr.k kVar) {
        this(list, list2, (i15 & 4) != 0 ? e1.e() : set, (i15 & 8) != 0 ? e1.e() : set2);
    }
}
