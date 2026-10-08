package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lgm0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "description", "Lgm0/i;", "Lgm0/i;", "c", "()Lgm0/i;", "type", "Lgm0/g;", "Lgm0/g;", "()Lgm0/g;", "applicationReasonInfoTip", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationReasonDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final i type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationReasonInfoTip")
    private final ApplicationReasonInfoTipDto applicationReasonInfoTip;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ApplicationReasonInfoTipDto getApplicationReasonInfoTip() {
        return this.applicationReasonInfoTip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationReasonDto)) {
            return false;
        }
        ApplicationReasonDto applicationReasonDto = (ApplicationReasonDto) other;
        return fr.t.c(this.description, applicationReasonDto.description) && this.type == applicationReasonDto.type && fr.t.c(this.applicationReasonInfoTip, applicationReasonDto.applicationReasonInfoTip);
    }

    public int hashCode() {
        int iHashCode = ((this.description.hashCode() * 31) + this.type.hashCode()) * 31;
        ApplicationReasonInfoTipDto applicationReasonInfoTipDto = this.applicationReasonInfoTip;
        return iHashCode + (applicationReasonInfoTipDto == null ? 0 : applicationReasonInfoTipDto.hashCode());
    }

    public String toString() {
        return "ApplicationReasonDto(description=" + this.description + ", type=" + this.type + ", applicationReasonInfoTip=" + this.applicationReasonInfoTip + ')';
    }
}
