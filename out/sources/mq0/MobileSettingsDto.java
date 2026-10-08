package mq0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\b\u0012\u0004\u0012\u00020!0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u0019\u0010&R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u001c\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-¨\u0006/"}, d2 = {"Lmq0/u;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lmq0/m;", "a", "Ljava/util/List;", "getDashboardServices", "()Ljava/util/List;", "getDashboardServices$annotations", "()V", "dashboardServices", "Lmq0/r;", "b", "featureFlags", "Lmq0/q;", "c", "features", "Ljava/time/OffsetDateTime;", "d", "Ljava/time/OffsetDateTime;", "e", "()Ljava/time/OffsetDateTime;", "serverCurrentTime", "Lmq0/l;", "f", "serviceCategories", "Lmq0/v;", "Lmq0/v;", "()Lmq0/v;", "rateConfiguration", "Lmq0/w;", "g", "roles", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "updateRecommended", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileSettingsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dashboardServices")
    private final List<DashboardServiceEntryDto> dashboardServices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("featureFlags")
    private final List<FeatureFlagDto> featureFlags;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("features")
    private final List<FeatureEntryDto> features;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serverCurrentTime")
    private final OffsetDateTime serverCurrentTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serviceCategories")
    private final List<CategoryDashboardServicesDto> serviceCategories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rateConfiguration")
    private final RateConfigurationDto rateConfiguration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("roles")
    private final List<w> roles;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("updateRecommended")
    private final Boolean updateRecommended;

    public final List<FeatureFlagDto> a() {
        return this.featureFlags;
    }

    public final List<FeatureEntryDto> b() {
        return this.features;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RateConfigurationDto getRateConfiguration() {
        return this.rateConfiguration;
    }

    public final List<w> d() {
        return this.roles;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getServerCurrentTime() {
        return this.serverCurrentTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileSettingsDto)) {
            return false;
        }
        MobileSettingsDto mobileSettingsDto = (MobileSettingsDto) other;
        return fr.t.c(this.dashboardServices, mobileSettingsDto.dashboardServices) && fr.t.c(this.featureFlags, mobileSettingsDto.featureFlags) && fr.t.c(this.features, mobileSettingsDto.features) && fr.t.c(this.serverCurrentTime, mobileSettingsDto.serverCurrentTime) && fr.t.c(this.serviceCategories, mobileSettingsDto.serviceCategories) && fr.t.c(this.rateConfiguration, mobileSettingsDto.rateConfiguration) && fr.t.c(this.roles, mobileSettingsDto.roles) && fr.t.c(this.updateRecommended, mobileSettingsDto.updateRecommended);
    }

    public final List<CategoryDashboardServicesDto> f() {
        return this.serviceCategories;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getUpdateRecommended() {
        return this.updateRecommended;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.dashboardServices.hashCode() * 31) + this.featureFlags.hashCode()) * 31) + this.features.hashCode()) * 31) + this.serverCurrentTime.hashCode()) * 31) + this.serviceCategories.hashCode()) * 31;
        RateConfigurationDto rateConfigurationDto = this.rateConfiguration;
        int iHashCode2 = (iHashCode + (rateConfigurationDto == null ? 0 : rateConfigurationDto.hashCode())) * 31;
        List<w> list = this.roles;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.updateRecommended;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "MobileSettingsDto(dashboardServices=" + this.dashboardServices + ", featureFlags=" + this.featureFlags + ", features=" + this.features + ", serverCurrentTime=" + this.serverCurrentTime + ", serviceCategories=" + this.serviceCategories + ", rateConfiguration=" + this.rateConfiguration + ", roles=" + this.roles + ", updateRecommended=" + this.updateRecommended + ')';
    }
}
