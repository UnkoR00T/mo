package lp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.h0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\r\u0010\u0004R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001f¨\u00060"}, d2 = {"Llp0/h0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llp0/p;", "a", "Llp0/p;", "getError", "()Llp0/p;", "error", "Llp0/u;", "b", "Llp0/u;", "getIdentityContext", "()Llp0/u;", "identityContext", "c", "Ljava/lang/String;", "requestId", "", "d", "Ljava/util/List;", "getServersRoute", "()Ljava/util/List;", "serversRoute", "e", "getStatus", "status", "Llp0/o;", "f", "Llp0/o;", "getDomainCertResponse", "()Llp0/o;", "domainCertResponse", "g", "getInfo", "info", "h", "getOptionalServices", "optionalServices", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResponseHeaderDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("error")
    private final ErrorDto error;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("identityContext")
    private final IdentityContextDto identityContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestId")
    private final String requestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serversRoute")
    private final List<String> serversRoute;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final String status;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("domainCertResponse")
    private final DomainCertResponseDto domainCertResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("info")
    private final List<Object> info;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("optionalServices")
    private final List<String> optionalServices;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseHeaderDto)) {
            return false;
        }
        ResponseHeaderDto responseHeaderDto = (ResponseHeaderDto) other;
        return fr.t.c(this.error, responseHeaderDto.error) && fr.t.c(this.identityContext, responseHeaderDto.identityContext) && fr.t.c(this.requestId, responseHeaderDto.requestId) && fr.t.c(this.serversRoute, responseHeaderDto.serversRoute) && fr.t.c(this.status, responseHeaderDto.status) && fr.t.c(this.domainCertResponse, responseHeaderDto.domainCertResponse) && fr.t.c(this.info, responseHeaderDto.info) && fr.t.c(this.optionalServices, responseHeaderDto.optionalServices);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.error.hashCode() * 31) + this.identityContext.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.serversRoute.hashCode()) * 31) + this.status.hashCode()) * 31;
        DomainCertResponseDto domainCertResponseDto = this.domainCertResponse;
        int iHashCode2 = (iHashCode + (domainCertResponseDto == null ? 0 : domainCertResponseDto.hashCode())) * 31;
        List<Object> list = this.info;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.optionalServices;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ResponseHeaderDto(error=" + this.error + ", identityContext=" + this.identityContext + ", requestId=" + this.requestId + ", serversRoute=" + this.serversRoute + ", status=" + this.status + ", domainCertResponse=" + this.domainCertResponse + ", info=" + this.info + ", optionalServices=" + this.optionalServices + ')';
    }
}
