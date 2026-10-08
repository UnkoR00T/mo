package mq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Lmq0/m;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "name", "Lmq0/n;", "b", "Lmq0/n;", "d", "()Lmq0/n;", "type", "c", "supplementOrigin", "Lmq0/f0;", "Lmq0/f0;", "()Lmq0/f0;", "temporaryInterruption", "e", "webUrl", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final /* data */ class DashboardServiceEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final n type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("supplementOrigin")
    private final String supplementOrigin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryInterruption")
    private final TemporaryInterruptionDto temporaryInterruption;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("webUrl")
    private final String webUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TemporaryInterruptionDto getTemporaryInterruption() {
        return this.temporaryInterruption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardServiceEntryDto)) {
            return false;
        }
        DashboardServiceEntryDto dashboardServiceEntryDto = (DashboardServiceEntryDto) other;
        return fr.t.c(this.name, dashboardServiceEntryDto.name) && this.type == dashboardServiceEntryDto.type && fr.t.c(this.supplementOrigin, dashboardServiceEntryDto.supplementOrigin) && fr.t.c(this.temporaryInterruption, dashboardServiceEntryDto.temporaryInterruption) && fr.t.c(this.webUrl, dashboardServiceEntryDto.webUrl);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.supplementOrigin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TemporaryInterruptionDto temporaryInterruptionDto = this.temporaryInterruption;
        int iHashCode3 = (iHashCode2 + (temporaryInterruptionDto == null ? 0 : temporaryInterruptionDto.hashCode())) * 31;
        String str2 = this.webUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DashboardServiceEntryDto(name=" + this.name + ", type=" + this.type + ", supplementOrigin=" + this.supplementOrigin + ", temporaryInterruption=" + this.temporaryInterruption + ", webUrl=" + this.webUrl + ')';
    }
}
