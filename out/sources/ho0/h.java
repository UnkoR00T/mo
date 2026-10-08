package ho0;

import ge4.x;
import ie4.o;
import ie4.t;
import jo0.CentralTokenDto;
import jo0.OwTokenDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JH\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u000bJ@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lho0/h;", "", "", "grantType", "subjectToken", "requestedTokenType", "requestedIssuer", "clientId", "Lge4/x;", "Ljo0/t;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "code", "redirectUri", "codeVerifier", "Ljo0/i1;", "a", "refreshToken", "loginHint", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    static /* synthetic */ Object b(h hVar, String str, String str2, String str3, String str4, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshOwToken");
        }
        if ((i15 & 1) != 0) {
            str = "refresh_token";
        }
        if ((i15 & 2) != 0) {
            str2 = "mObywatel";
        }
        if ((i15 & 8) != 0) {
            str4 = null;
        }
        return hVar.f(str, str2, str3, str4, eVar);
    }

    static /* synthetic */ Object d(h hVar, String str, String str2, String str3, String str4, String str5, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCentralToken");
        }
        if ((i15 & 1) != 0) {
            str = "urn:ietf:params:oauth:grant-type:token-exchange";
        }
        if ((i15 & 4) != 0) {
            str3 = "urn:ietf:params:oauth:token-type:access_token";
        }
        if ((i15 & 8) != 0) {
            str4 = "keycloak-oidc";
        }
        if ((i15 & 16) != 0) {
            str5 = "mObywatel";
        }
        return hVar.c(str, str2, str3, str4, str5, eVar);
    }

    static /* synthetic */ Object e(h hVar, String str, String str2, String str3, String str4, String str5, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOwToken");
        }
        if ((i15 & 1) != 0) {
            str = "authorization_code";
        }
        if ((i15 & 4) != 0) {
            str3 = "mobywatel://app/edelivery";
        }
        if ((i15 & 8) != 0) {
            str4 = "mObywatel";
        }
        if ((i15 & 16) != 0) {
            str5 = null;
        }
        return hVar.a(str, str2, str3, str4, str5, eVar);
    }

    @o("./.")
    @ie4.e
    Object a(@ie4.c("grant_type") String str, @ie4.c("code") String str2, @ie4.c("redirect_uri") String str3, @ie4.c("client_id") String str4, @ie4.c("code_verifier") String str5, tq.e<? super x<OwTokenDto>> eVar);

    @o(".")
    @ie4.e
    Object c(@ie4.c("grant_type") String str, @ie4.c("subject_token") String str2, @ie4.c("requested_token_type") String str3, @ie4.c("requested_issuer") String str4, @ie4.c("client_id") String str5, tq.e<? super x<CentralTokenDto>> eVar);

    @o("./")
    @ie4.e
    Object f(@ie4.c("grant_type") String str, @ie4.c("client_id") String str2, @ie4.c("refresh_token") String str3, @t("login_hint") String str4, tq.e<? super x<OwTokenDto>> eVar);
}
