package th0;

import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\f¨\u0006\u001d"}, d2 = {"Lth0/l;", "", "Liy/b0;", "externalToken", "", "Lth0/g;", "externalDomains", "", "successRedirectUrl", "<init>", "(Liy/b0;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/util/List;", "getExternalDomains", "()Ljava/util/List;", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitExternalAuthMobileResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 externalToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ExternalCert> externalDomains;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String successRedirectUrl;

    public InitExternalAuthMobileResponse(b0 b0Var, List<ExternalCert> list, String str) {
        this.externalToken = b0Var;
        this.externalDomains = list;
        this.successRedirectUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getExternalToken() {
        return this.externalToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSuccessRedirectUrl() {
        return this.successRedirectUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitExternalAuthMobileResponse)) {
            return false;
        }
        InitExternalAuthMobileResponse initExternalAuthMobileResponse = (InitExternalAuthMobileResponse) other;
        return fr.t.c(this.externalToken, initExternalAuthMobileResponse.externalToken) && fr.t.c(this.externalDomains, initExternalAuthMobileResponse.externalDomains) && fr.t.c(this.successRedirectUrl, initExternalAuthMobileResponse.successRedirectUrl);
    }

    public int hashCode() {
        return (((this.externalToken.hashCode() * 31) + this.externalDomains.hashCode()) * 31) + this.successRedirectUrl.hashCode();
    }

    public String toString() {
        return "InitExternalAuthMobileResponse(externalToken=" + this.externalToken + ", externalDomains=" + this.externalDomains + ", successRedirectUrl=" + this.successRedirectUrl + ")";
    }
}
