package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u0004R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u0004¨\u0006."}, d2 = {"Ljo0/t;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "accessToken", "b", "I", "getExpiresIn", "expiresIn", "", "c", "J", "getNotBeforePolicy", "()J", "notBeforePolicy", "d", "getRefreshExpiresIn", "refreshExpiresIn", "e", "getScope", "scope", "f", "getSessionState", "sessionState", "g", "getTokenType", "tokenType", "h", "getAccountLinkUrl", "accountLinkUrl", "i", "getIssuedTokenType", "issuedTokenType", "j", "getRefreshToken", "refreshToken", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CentralTokenDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("access_token")
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expires_in")
    private final int expiresIn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("not-before-policy")
    private final long notBeforePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("refresh_expires_in")
    private final int refreshExpiresIn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("scope")
    private final String scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("session_state")
    private final String sessionState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("token_type")
    private final String tokenType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("account-link-url")
    private final String accountLinkUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issued_token_type")
    private final String issuedTokenType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("refresh_token")
    private final String refreshToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CentralTokenDto)) {
            return false;
        }
        CentralTokenDto centralTokenDto = (CentralTokenDto) other;
        return fr.t.c(this.accessToken, centralTokenDto.accessToken) && this.expiresIn == centralTokenDto.expiresIn && this.notBeforePolicy == centralTokenDto.notBeforePolicy && this.refreshExpiresIn == centralTokenDto.refreshExpiresIn && fr.t.c(this.scope, centralTokenDto.scope) && fr.t.c(this.sessionState, centralTokenDto.sessionState) && fr.t.c(this.tokenType, centralTokenDto.tokenType) && fr.t.c(this.accountLinkUrl, centralTokenDto.accountLinkUrl) && fr.t.c(this.issuedTokenType, centralTokenDto.issuedTokenType) && fr.t.c(this.refreshToken, centralTokenDto.refreshToken);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.accessToken.hashCode() * 31) + Integer.hashCode(this.expiresIn)) * 31) + Long.hashCode(this.notBeforePolicy)) * 31) + Integer.hashCode(this.refreshExpiresIn)) * 31) + this.scope.hashCode()) * 31) + this.sessionState.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.accountLinkUrl.hashCode()) * 31) + this.issuedTokenType.hashCode()) * 31;
        String str = this.refreshToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CentralTokenDto(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", notBeforePolicy=" + this.notBeforePolicy + ", refreshExpiresIn=" + this.refreshExpiresIn + ", scope=" + this.scope + ", sessionState=" + this.sessionState + ", tokenType=" + this.tokenType + ", accountLinkUrl=" + this.accountLinkUrl + ", issuedTokenType=" + this.issuedTokenType + ", refreshToken=" + this.refreshToken + ')';
    }
}
