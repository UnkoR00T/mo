package q64;

import fr.k;
import fr.t;
import iq0.CategoryDashboardServices;
import iq0.FeatureEntry;
import iq0.FeatureFlag;
import iq0.RateConfigurationEntry;
import iq0.z;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: q64.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001\u001aBS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006("}, d2 = {"Lq64/a;", "", "", "Liq0/o;", "servicesCategories", "Liq0/u;", "featureFlag", "Liq0/z;", "roles", "Liq0/x;", "rateConfiguration", "", "updateRecommended", "Liq0/t;", "features", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Liq0/x;Ljava/lang/Boolean;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "c", "getRoles", "d", "Liq0/x;", "()Liq0/x;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "g", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteSettingsData {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final RemoteSettingsData f165168h = new RemoteSettingsData(v.n(), v.n(), v.n(), RateConfigurationEntry.INSTANCE.a(), null, v.n());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryDashboardServices> servicesCategories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FeatureFlag> featureFlag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<z> roles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RateConfigurationEntry rateConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean updateRecommended;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FeatureEntry> features;

    /* JADX INFO: renamed from: q64.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq64/a$a;", "", "<init>", "()V", "Lq64/a;", "DEFAULT", "Lq64/a;", "a", "()Lq64/a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final RemoteSettingsData a() {
            return RemoteSettingsData.f165168h;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsData(List<CategoryDashboardServices> list, List<FeatureFlag> list2, List<? extends z> list3, RateConfigurationEntry rateConfigurationEntry, Boolean bool, List<FeatureEntry> list4) {
        this.servicesCategories = list;
        this.featureFlag = list2;
        this.roles = list3;
        this.rateConfiguration = rateConfigurationEntry;
        this.updateRecommended = bool;
        this.features = list4;
    }

    public final List<FeatureFlag> b() {
        return this.featureFlag;
    }

    public final List<FeatureEntry> c() {
        return this.features;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RateConfigurationEntry getRateConfiguration() {
        return this.rateConfiguration;
    }

    public final List<CategoryDashboardServices> e() {
        return this.servicesCategories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteSettingsData)) {
            return false;
        }
        RemoteSettingsData remoteSettingsData = (RemoteSettingsData) other;
        return t.c(this.servicesCategories, remoteSettingsData.servicesCategories) && t.c(this.featureFlag, remoteSettingsData.featureFlag) && t.c(this.roles, remoteSettingsData.roles) && t.c(this.rateConfiguration, remoteSettingsData.rateConfiguration) && t.c(this.updateRecommended, remoteSettingsData.updateRecommended) && t.c(this.features, remoteSettingsData.features);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getUpdateRecommended() {
        return this.updateRecommended;
    }

    public int hashCode() {
        List<CategoryDashboardServices> list = this.servicesCategories;
        int iHashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + this.featureFlag.hashCode()) * 31) + this.roles.hashCode()) * 31) + this.rateConfiguration.hashCode()) * 31;
        Boolean bool = this.updateRecommended;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.features.hashCode();
    }

    public String toString() {
        return "RemoteSettingsData(servicesCategories=" + this.servicesCategories + ", featureFlag=" + this.featureFlag + ", roles=" + this.roles + ", rateConfiguration=" + this.rateConfiguration + ", updateRecommended=" + this.updateRecommended + ", features=" + this.features + ')';
    }
}
