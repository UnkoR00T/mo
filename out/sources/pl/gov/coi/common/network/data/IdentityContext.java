package pl.gov.coi.common.network.data;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import vl.c;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lpl/gov/coi/common/network/data/IdentityContext;", "", "samlArt", "", "ticket", "mwId", "securityToken", "documentId", "loginType", "Lpl/gov/coi/common/network/data/IdentityContext$LoginType;", "customIdpList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/common/network/data/IdentityContext$LoginType;Ljava/lang/Boolean;)V", "getSamlArt", "()Ljava/lang/String;", "getTicket", "getMwId", "getSecurityToken", "getDocumentId", "getLoginType", "()Lpl/gov/coi/common/network/data/IdentityContext$LoginType;", "getCustomIdpList", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/common/network/data/IdentityContext$LoginType;Ljava/lang/Boolean;)Lpl/gov/coi/common/network/data/IdentityContext;", "equals", "other", "hashCode", "", "toString", "LoginType", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityContext {

    @c("customIdpList")
    private final Boolean customIdpList;

    @c("documentId")
    private final String documentId;

    @c("loginType")
    private final LoginType loginType;

    @c("mwId")
    private final String mwId;

    @c("samlArt")
    private final String samlArt;

    @c("securityToken")
    private final String securityToken;

    @c("ticket")
    private final String ticket;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lpl/gov/coi/common/network/data/IdentityContext$LoginType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WK", "TOKEN", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum LoginType {
        WK("WK"),
        TOKEN("TOKEN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        LoginType(String str) {
            this.value = str;
        }

        public static a<LoginType> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public IdentityContext() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public static /* synthetic */ IdentityContext copy$default(IdentityContext identityContext, String str, String str2, String str3, String str4, String str5, LoginType loginType, Boolean bool, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = identityContext.samlArt;
        }
        if ((i15 & 2) != 0) {
            str2 = identityContext.ticket;
        }
        if ((i15 & 4) != 0) {
            str3 = identityContext.mwId;
        }
        if ((i15 & 8) != 0) {
            str4 = identityContext.securityToken;
        }
        if ((i15 & 16) != 0) {
            str5 = identityContext.documentId;
        }
        if ((i15 & 32) != 0) {
            loginType = identityContext.loginType;
        }
        if ((i15 & 64) != 0) {
            bool = identityContext.customIdpList;
        }
        LoginType loginType2 = loginType;
        Boolean bool2 = bool;
        String str6 = str5;
        String str7 = str3;
        return identityContext.copy(str, str2, str7, str4, str6, loginType2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSamlArt() {
        return this.samlArt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMwId() {
        return this.mwId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LoginType getLoginType() {
        return this.loginType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getCustomIdpList() {
        return this.customIdpList;
    }

    public final IdentityContext copy(String samlArt, String ticket, String mwId, String securityToken, String documentId, LoginType loginType, Boolean customIdpList) {
        return new IdentityContext(samlArt, ticket, mwId, securityToken, documentId, loginType, customIdpList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityContext)) {
            return false;
        }
        IdentityContext identityContext = (IdentityContext) other;
        return t.c(this.samlArt, identityContext.samlArt) && t.c(this.ticket, identityContext.ticket) && t.c(this.mwId, identityContext.mwId) && t.c(this.securityToken, identityContext.securityToken) && t.c(this.documentId, identityContext.documentId) && this.loginType == identityContext.loginType && t.c(this.customIdpList, identityContext.customIdpList);
    }

    public final Boolean getCustomIdpList() {
        return this.customIdpList;
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final LoginType getLoginType() {
        return this.loginType;
    }

    public final String getMwId() {
        return this.mwId;
    }

    public final String getSamlArt() {
        return this.samlArt;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        String str = this.samlArt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ticket;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mwId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.securityToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LoginType loginType = this.loginType;
        int iHashCode6 = (iHashCode5 + (loginType == null ? 0 : loginType.hashCode())) * 31;
        Boolean bool = this.customIdpList;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "IdentityContext(samlArt=" + this.samlArt + ", ticket=" + this.ticket + ", mwId=" + this.mwId + ", securityToken=" + this.securityToken + ", documentId=" + this.documentId + ", loginType=" + this.loginType + ", customIdpList=" + this.customIdpList + ')';
    }

    public IdentityContext(String str, String str2, String str3, String str4, String str5, LoginType loginType, Boolean bool) {
        this.samlArt = str;
        this.ticket = str2;
        this.mwId = str3;
        this.securityToken = str4;
        this.documentId = str5;
        this.loginType = loginType;
        this.customIdpList = bool;
    }

    public /* synthetic */ IdentityContext(String str, String str2, String str3, String str4, String str5, LoginType loginType, Boolean bool, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : loginType, (i15 & 64) != 0 ? null : bool);
    }
}
