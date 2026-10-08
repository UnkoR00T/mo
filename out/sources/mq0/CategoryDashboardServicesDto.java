package mq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmq0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "name", "", "Lmq0/m;", "b", "Ljava/util/List;", "()Ljava/util/List;", "services", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryDashboardServicesDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("services")
    private final List<DashboardServiceEntryDto> services;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<DashboardServiceEntryDto> b() {
        return this.services;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryDashboardServicesDto)) {
            return false;
        }
        CategoryDashboardServicesDto categoryDashboardServicesDto = (CategoryDashboardServicesDto) other;
        return fr.t.c(this.name, categoryDashboardServicesDto.name) && fr.t.c(this.services, categoryDashboardServicesDto.services);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.services.hashCode();
    }

    public String toString() {
        return "CategoryDashboardServicesDto(name=" + this.name + ", services=" + this.services + ')';
    }
}
