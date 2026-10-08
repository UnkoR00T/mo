package pl.gov.coi.mobywatel.feature.dashboard.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;", "", "Lrq0/c;", "type", "", "supplementOrigin", "<init>", "(Lrq0/c;Ljava/lang/String;)V", "component1", "()Lrq0/c;", "component2", "()Ljava/lang/String;", "copy", "(Lrq0/c;Ljava/lang/String;)Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrq0/c;", "getType", "Ljava/lang/String;", "getSupplementOrigin", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServiceEntryDto {
    public static final int $stable = 0;

    @c("supplementOrigin")
    private final String supplementOrigin;

    @c("type")
    private final rq0.c type;

    public ServiceEntryDto(rq0.c cVar, String str) {
        this.type = cVar;
        this.supplementOrigin = str;
    }

    public static /* synthetic */ ServiceEntryDto copy$default(ServiceEntryDto serviceEntryDto, rq0.c cVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = serviceEntryDto.type;
        }
        if ((i15 & 2) != 0) {
            str = serviceEntryDto.supplementOrigin;
        }
        return serviceEntryDto.copy(cVar, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final rq0.c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    public final ServiceEntryDto copy(rq0.c type, String supplementOrigin) {
        return new ServiceEntryDto(type, supplementOrigin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceEntryDto)) {
            return false;
        }
        ServiceEntryDto serviceEntryDto = (ServiceEntryDto) other;
        return this.type == serviceEntryDto.type && t.c(this.supplementOrigin, serviceEntryDto.supplementOrigin);
    }

    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    public final rq0.c getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.supplementOrigin;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ServiceEntryDto(type=" + this.type + ", supplementOrigin=" + this.supplementOrigin + ')';
    }
}
