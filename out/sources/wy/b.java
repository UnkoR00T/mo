package wy;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import iy.b0;
import java.util.Map;
import p071kotlin.Metadata;
import xy.AccessToken;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lwy/b;", "Lwy/c;", "", "serviceIssuerKey", "Lxy/a;", "token", "Loq/i0;", "h0", "(Ljava/lang/String;Lxy/a;)V", "R", "()V", "", "J", "(Ljava/lang/String;)Z", "Liy/b0;", "a0", "(Ljava/lang/String;)Liy/b0;", "Lwy/e;", "refreshTokenLoader", "Ldx/i;", "Ldx/b;", "I", "(Lwy/e;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", i.f37094u, "()Ljava/util/Map;", "setSessionToken", "(Ljava/util/Map;)V", "sessionToken", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends c {
    static /* synthetic */ void F(b bVar, String str, AccessToken accessToken, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToken");
        }
        if ((i15 & 1) != 0) {
            str = "default-service-issuer";
        }
        bVar.h0(str, accessToken);
    }

    static /* synthetic */ Object N(b bVar, e eVar, String str, tq.e eVar2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshToken");
        }
        if ((i15 & 2) != 0) {
            str = "default-service-issuer";
        }
        return bVar.I(eVar, str, eVar2);
    }

    static /* synthetic */ b0 q(b bVar, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeIfAccessTokenIsValid");
        }
        if ((i15 & 1) != 0) {
            str = "default-service-issuer";
        }
        return bVar.a0(str);
    }

    static /* synthetic */ boolean s(b bVar, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSessionAllowed");
        }
        if ((i15 & 1) != 0) {
            str = "default-service-issuer";
        }
        return bVar.J(str);
    }

    Object I(e eVar, String str, tq.e<? super dx.i<? extends dx.b, AccessToken>> eVar2);

    boolean J(String serviceIssuerKey);

    Map<String, AccessToken> L();

    void R();

    b0 a0(String serviceIssuerKey);

    void h0(String serviceIssuerKey, AccessToken token);
}
