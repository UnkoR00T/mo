package vr0;

import fr.t;
import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, d2 = {"Lvr0/j;", "", "", CMSAttributeTableGenerator.CONTENT_TYPE, "redirectUrl", "requestBody", "", "successUrls", "errorUrls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getContentType", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BERedirect {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redirectUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requestBody;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> successUrls;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> errorUrls;

    public BERedirect(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.contentType = str;
        this.redirectUrl = str2;
        this.requestBody = str3;
        this.successUrls = list;
        this.errorUrls = list2;
    }

    public final List<String> a() {
        return this.errorUrls;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    public final List<String> d() {
        return this.successUrls;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BERedirect)) {
            return false;
        }
        BERedirect bERedirect = (BERedirect) other;
        return t.c(this.contentType, bERedirect.contentType) && t.c(this.redirectUrl, bERedirect.redirectUrl) && t.c(this.requestBody, bERedirect.requestBody) && t.c(this.successUrls, bERedirect.successUrls) && t.c(this.errorUrls, bERedirect.errorUrls);
    }

    public int hashCode() {
        return (((((((this.contentType.hashCode() * 31) + this.redirectUrl.hashCode()) * 31) + this.requestBody.hashCode()) * 31) + this.successUrls.hashCode()) * 31) + this.errorUrls.hashCode();
    }

    public String toString() {
        return "BERedirect(contentType=" + this.contentType + ", redirectUrl=" + this.redirectUrl + ", requestBody=" + this.requestBody + ", successUrls=" + this.successUrls + ", errorUrls=" + this.errorUrls + ")";
    }
}
