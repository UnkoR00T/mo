package pf0;

import eg0.s;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import xy.AccessToken;

/* JADX INFO: renamed from: pf0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpf0/a;", "", "Lxy/a;", "accessToken", "", "certificateRenewalRequired", "", "Leg0/s$a;", "documentsToRefresh", "<init>", "(Lxy/a;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxy/a;", "()Lxy/a;", "b", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadAccessTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean certificateRenewalRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<s.RefreshDocumentData> documentsToRefresh;

    public LoadAccessTokenResult(AccessToken accessToken, boolean z15, List<s.RefreshDocumentData> list) {
        this.accessToken = accessToken;
        this.certificateRenewalRequired = z15;
        this.documentsToRefresh = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCertificateRenewalRequired() {
        return this.certificateRenewalRequired;
    }

    public final List<s.RefreshDocumentData> c() {
        return this.documentsToRefresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadAccessTokenResult)) {
            return false;
        }
        LoadAccessTokenResult loadAccessTokenResult = (LoadAccessTokenResult) other;
        return t.c(this.accessToken, loadAccessTokenResult.accessToken) && this.certificateRenewalRequired == loadAccessTokenResult.certificateRenewalRequired && t.c(this.documentsToRefresh, loadAccessTokenResult.documentsToRefresh);
    }

    public int hashCode() {
        return (((this.accessToken.hashCode() * 31) + Boolean.hashCode(this.certificateRenewalRequired)) * 31) + this.documentsToRefresh.hashCode();
    }

    public String toString() {
        return "LoadAccessTokenResult(accessToken=" + this.accessToken + ", certificateRenewalRequired=" + this.certificateRenewalRequired + ", documentsToRefresh=" + this.documentsToRefresh + ")";
    }
}
