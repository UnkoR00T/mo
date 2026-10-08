package iq0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b\u001f\u0010\u001e¨\u0006,"}, d2 = {"Liq0/w;", "", "", "Liq0/u;", "featureFlags", "Liq0/o;", "serviceCategories", "Liq0/z;", "roles", "Liq0/x;", "rateConfiguration", "", "updateRecommended", "Ljava/time/OffsetDateTime;", "serverCurrentTime", "Liq0/t;", "features", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Liq0/x;Ljava/lang/Boolean;Ljava/time/OffsetDateTime;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "e", "c", "d", "Liq0/x;", "()Liq0/x;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Ljava/time/OffsetDateTime;", "getServerCurrentTime", "()Ljava/time/OffsetDateTime;", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FeatureFlag> featureFlags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryDashboardServices> serviceCategories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<z> roles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RateConfigurationEntry rateConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean updateRecommended;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime serverCurrentTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FeatureEntry> features;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileSettings(List<FeatureFlag> list, List<CategoryDashboardServices> list2, List<? extends z> list3, RateConfigurationEntry rateConfigurationEntry, Boolean bool, OffsetDateTime offsetDateTime, List<FeatureEntry> list4) {
        this.featureFlags = list;
        this.serviceCategories = list2;
        this.roles = list3;
        this.rateConfiguration = rateConfigurationEntry;
        this.updateRecommended = bool;
        this.serverCurrentTime = offsetDateTime;
        this.features = list4;
    }

    public final List<FeatureFlag> a() {
        return this.featureFlags;
    }

    public final List<FeatureEntry> b() {
        return this.features;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RateConfigurationEntry getRateConfiguration() {
        return this.rateConfiguration;
    }

    public final List<z> d() {
        return this.roles;
    }

    public final List<CategoryDashboardServices> e() {
        return this.serviceCategories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileSettings)) {
            return false;
        }
        MobileSettings mobileSettings = (MobileSettings) other;
        return fr.t.c(this.featureFlags, mobileSettings.featureFlags) && fr.t.c(this.serviceCategories, mobileSettings.serviceCategories) && fr.t.c(this.roles, mobileSettings.roles) && fr.t.c(this.rateConfiguration, mobileSettings.rateConfiguration) && fr.t.c(this.updateRecommended, mobileSettings.updateRecommended) && fr.t.c(this.serverCurrentTime, mobileSettings.serverCurrentTime) && fr.t.c(this.features, mobileSettings.features);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getUpdateRecommended() {
        return this.updateRecommended;
    }

    public int hashCode() {
        int iHashCode = ((((((this.featureFlags.hashCode() * 31) + this.serviceCategories.hashCode()) * 31) + this.roles.hashCode()) * 31) + this.rateConfiguration.hashCode()) * 31;
        Boolean bool = this.updateRecommended;
        return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.serverCurrentTime.hashCode()) * 31) + this.features.hashCode();
    }

    public String toString() {
        return "MobileSettings(featureFlags=" + this.featureFlags + ", serviceCategories=" + this.serviceCategories + ", roles=" + this.roles + ", rateConfiguration=" + this.rateConfiguration + ", updateRecommended=" + this.updateRecommended + ", serverCurrentTime=" + this.serverCurrentTime + ", features=" + this.features + ")";
    }
}
