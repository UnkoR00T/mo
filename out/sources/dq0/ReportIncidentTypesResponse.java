package dq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ldq0/c0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldq0/d0;", "a", "Ldq0/d0;", "()Ldq0/d0;", "imageConfig", "", "Ldq0/f0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "incidentTypes", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportIncidentTypesResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("imageConfig")
    private final ReportIncidentTypesResponseImageConfiguration imageConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("incidentTypes")
    private final List<ReportIncidentTypesResponseIncidentTypeConfig> incidentTypes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ReportIncidentTypesResponseImageConfiguration getImageConfig() {
        return this.imageConfig;
    }

    public final List<ReportIncidentTypesResponseIncidentTypeConfig> b() {
        return this.incidentTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportIncidentTypesResponse)) {
            return false;
        }
        ReportIncidentTypesResponse reportIncidentTypesResponse = (ReportIncidentTypesResponse) other;
        return fr.t.c(this.imageConfig, reportIncidentTypesResponse.imageConfig) && fr.t.c(this.incidentTypes, reportIncidentTypesResponse.incidentTypes);
    }

    public int hashCode() {
        return (this.imageConfig.hashCode() * 31) + this.incidentTypes.hashCode();
    }

    public String toString() {
        return "ReportIncidentTypesResponse(imageConfig=" + this.imageConfig + ", incidentTypes=" + this.incidentTypes + ')';
    }
}
