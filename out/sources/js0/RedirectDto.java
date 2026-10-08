package js0;

import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.n0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"Ljs0/n0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "b", "Ljava/util/List;", "()Ljava/util/List;", "errorUrls", "c", "redirectUrl", "d", "requestBody", "e", "successUrls", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RedirectDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(CMSAttributeTableGenerator.CONTENT_TYPE)
    private final String contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("errorUrls")
    private final List<String> errorUrls;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("redirectUrl")
    private final String redirectUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestBody")
    private final String requestBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("successUrls")
    private final List<String> successUrls;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public final List<String> b() {
        return this.errorUrls;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    public final List<String> e() {
        return this.successUrls;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectDto)) {
            return false;
        }
        RedirectDto redirectDto = (RedirectDto) other;
        return fr.t.c(this.contentType, redirectDto.contentType) && fr.t.c(this.errorUrls, redirectDto.errorUrls) && fr.t.c(this.redirectUrl, redirectDto.redirectUrl) && fr.t.c(this.requestBody, redirectDto.requestBody) && fr.t.c(this.successUrls, redirectDto.successUrls);
    }

    public int hashCode() {
        return (((((((this.contentType.hashCode() * 31) + this.errorUrls.hashCode()) * 31) + this.redirectUrl.hashCode()) * 31) + this.requestBody.hashCode()) * 31) + this.successUrls.hashCode();
    }

    public String toString() {
        return "RedirectDto(contentType=" + this.contentType + ", errorUrls=" + this.errorUrls + ", redirectUrl=" + this.redirectUrl + ", requestBody=" + this.requestBody + ", successUrls=" + this.successUrls + ')';
    }
}
