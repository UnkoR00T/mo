package vr0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lvr0/l;", "", "", "institutionId", "", "paymentIds", "Lvr0/k;", "redirectRequestInfo", "Lvr0/i;", "cardToken", "", "registerCardToken", "<init>", "(Ljava/lang/String;Ljava/util/List;Lvr0/k;Lvr0/i;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lvr0/k;", "d", "()Lvr0/k;", "Lvr0/i;", "()Lvr0/i;", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEStartCardPaymentRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BERedirectRequestInfo redirectRequestInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECardToken cardToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean registerCardToken;

    public BEStartCardPaymentRequest(String str, List<String> list, BERedirectRequestInfo bERedirectRequestInfo, BECardToken bECardToken, Boolean bool) {
        this.institutionId = str;
        this.paymentIds = list;
        this.redirectRequestInfo = bERedirectRequestInfo;
        this.cardToken = bECardToken;
        this.registerCardToken = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BECardToken getCardToken() {
        return this.cardToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final List<String> c() {
        return this.paymentIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BERedirectRequestInfo getRedirectRequestInfo() {
        return this.redirectRequestInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getRegisterCardToken() {
        return this.registerCardToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEStartCardPaymentRequest)) {
            return false;
        }
        BEStartCardPaymentRequest bEStartCardPaymentRequest = (BEStartCardPaymentRequest) other;
        return t.c(this.institutionId, bEStartCardPaymentRequest.institutionId) && t.c(this.paymentIds, bEStartCardPaymentRequest.paymentIds) && t.c(this.redirectRequestInfo, bEStartCardPaymentRequest.redirectRequestInfo) && t.c(this.cardToken, bEStartCardPaymentRequest.cardToken) && t.c(this.registerCardToken, bEStartCardPaymentRequest.registerCardToken);
    }

    public int hashCode() {
        int iHashCode = ((((this.institutionId.hashCode() * 31) + this.paymentIds.hashCode()) * 31) + this.redirectRequestInfo.hashCode()) * 31;
        BECardToken bECardToken = this.cardToken;
        int iHashCode2 = (iHashCode + (bECardToken == null ? 0 : bECardToken.hashCode())) * 31;
        Boolean bool = this.registerCardToken;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BEStartCardPaymentRequest(institutionId=" + this.institutionId + ", paymentIds=" + this.paymentIds + ", redirectRequestInfo=" + this.redirectRequestInfo + ", cardToken=" + this.cardToken + ", registerCardToken=" + this.registerCardToken + ")";
    }
}
