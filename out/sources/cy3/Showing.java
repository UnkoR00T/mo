package cy3;

import dy3.PaymentCardRequiredData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cy3.j, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lcy3/j;", "", "", "id", "baseUrl", "Liy/a0;", "body", "Ldy3/c;", "paymentCardRequiredData", "", "successUrls", "errorUrls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liy/a0;Ldy3/c;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "Liy/a0;", "d", "()Liy/a0;", "Ldy3/c;", "g", "()Ldy3/c;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Showing implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.a0 body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardRequiredData paymentCardRequiredData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> successUrls;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> errorUrls;

    public Showing(String str, String str2, iy.a0 a0Var, PaymentCardRequiredData paymentCardRequiredData, List<String> list, List<String> list2) {
        this.id = str;
        this.baseUrl = str2;
        this.body = a0Var;
        this.paymentCardRequiredData = paymentCardRequiredData;
        this.successUrls = list;
        this.errorUrls = list2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.a0 getBody() {
        return this.body;
    }

    public final List<String> e() {
        return this.errorUrls;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Showing)) {
            return false;
        }
        Showing showing = (Showing) other;
        return fr.t.c(this.id, showing.id) && fr.t.c(this.baseUrl, showing.baseUrl) && fr.t.c(this.body, showing.body) && fr.t.c(this.paymentCardRequiredData, showing.paymentCardRequiredData) && fr.t.c(this.successUrls, showing.successUrls) && fr.t.c(this.errorUrls, showing.errorUrls);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PaymentCardRequiredData getPaymentCardRequiredData() {
        return this.paymentCardRequiredData;
    }

    public final List<String> h() {
        return this.successUrls;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.baseUrl.hashCode()) * 31) + this.body.hashCode()) * 31) + this.paymentCardRequiredData.hashCode()) * 31) + this.successUrls.hashCode()) * 31) + this.errorUrls.hashCode();
    }

    public String toString() {
        return "Showing(id=" + this.id + ", baseUrl=" + this.baseUrl + ", body=" + this.body + ", paymentCardRequiredData=" + this.paymentCardRequiredData + ", successUrls=" + this.successUrls + ", errorUrls=" + this.errorUrls + ')';
    }
}
