package js0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.t0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ljs0/t0;", "", "", "institutionId", "", "paymentIds", "Ljs0/o0;", "redirectRequestInfo", "Ljs0/o;", "cardToken", "", "registerCardToken", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljs0/o0;Ljs0/o;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInstitutionId", "b", "Ljava/util/List;", "getPaymentIds", "()Ljava/util/List;", "c", "Ljs0/o0;", "getRedirectRequestInfo", "()Ljs0/o0;", "d", "Ljs0/o;", "getCardToken", "()Ljs0/o;", "e", "Ljava/lang/Boolean;", "getRegisterCardToken", "()Ljava/lang/Boolean;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StartCardPaymentRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentIds")
    private final List<String> paymentIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("redirectRequestInfo")
    private final RedirectRequestInfoDto redirectRequestInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardToken")
    private final CardTokenDto cardToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registerCardToken")
    private final Boolean registerCardToken;

    public StartCardPaymentRequest(String str, List<String> list, RedirectRequestInfoDto redirectRequestInfoDto, CardTokenDto cardTokenDto, Boolean bool) {
        this.institutionId = str;
        this.paymentIds = list;
        this.redirectRequestInfo = redirectRequestInfoDto;
        this.cardToken = cardTokenDto;
        this.registerCardToken = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartCardPaymentRequest)) {
            return false;
        }
        StartCardPaymentRequest startCardPaymentRequest = (StartCardPaymentRequest) other;
        return fr.t.c(this.institutionId, startCardPaymentRequest.institutionId) && fr.t.c(this.paymentIds, startCardPaymentRequest.paymentIds) && fr.t.c(this.redirectRequestInfo, startCardPaymentRequest.redirectRequestInfo) && fr.t.c(this.cardToken, startCardPaymentRequest.cardToken) && fr.t.c(this.registerCardToken, startCardPaymentRequest.registerCardToken);
    }

    public int hashCode() {
        int iHashCode = ((((this.institutionId.hashCode() * 31) + this.paymentIds.hashCode()) * 31) + this.redirectRequestInfo.hashCode()) * 31;
        CardTokenDto cardTokenDto = this.cardToken;
        int iHashCode2 = (iHashCode + (cardTokenDto == null ? 0 : cardTokenDto.hashCode())) * 31;
        Boolean bool = this.registerCardToken;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "StartCardPaymentRequest(institutionId=" + this.institutionId + ", paymentIds=" + this.paymentIds + ", redirectRequestInfo=" + this.redirectRequestInfo + ", cardToken=" + this.cardToken + ", registerCardToken=" + this.registerCardToken + ')';
    }
}
