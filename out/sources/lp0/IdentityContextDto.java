package lp0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Llp0/u;", "", "", "customIdpList", "", "documentId", "Llp0/u$a;", "loginType", "mwId", "samlArt", "securityToken", "ticket", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Llp0/u$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getCustomIdpList", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "getDocumentId", "c", "Llp0/u$a;", "getLoginType", "()Llp0/u$a;", "d", "getMwId", "e", "getSamlArt", "f", "getSecurityToken", "g", "getTicket", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityContextDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("customIdpList")
    private final Boolean customIdpList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("loginType")
    private final a loginType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mwId")
    private final String mwId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("samlArt")
    private final String samlArt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("securityToken")
    private final String securityToken;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("ticket")
    private final String ticket;

    /* JADX INFO: renamed from: lp0.u$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Llp0/u$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        WK("WK"),
        TOKEN("TOKEN"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f119347f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public IdentityContextDto() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityContextDto)) {
            return false;
        }
        IdentityContextDto identityContextDto = (IdentityContextDto) other;
        return fr.t.c(this.customIdpList, identityContextDto.customIdpList) && fr.t.c(this.documentId, identityContextDto.documentId) && this.loginType == identityContextDto.loginType && fr.t.c(this.mwId, identityContextDto.mwId) && fr.t.c(this.samlArt, identityContextDto.samlArt) && fr.t.c(this.securityToken, identityContextDto.securityToken) && fr.t.c(this.ticket, identityContextDto.ticket);
    }

    public int hashCode() {
        Boolean bool = this.customIdpList;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.documentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.loginType;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.mwId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.samlArt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.securityToken;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ticket;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityContextDto(customIdpList=" + this.customIdpList + ", documentId=" + this.documentId + ", loginType=" + this.loginType + ", mwId=" + this.mwId + ", samlArt=" + this.samlArt + ", securityToken=" + this.securityToken + ", ticket=" + this.ticket + ')';
    }

    public IdentityContextDto(Boolean bool, String str, a aVar, String str2, String str3, String str4, String str5) {
        this.customIdpList = bool;
        this.documentId = str;
        this.loginType = aVar;
        this.mwId = str2;
        this.samlArt = str3;
        this.securityToken = str4;
        this.ticket = str5;
    }

    public /* synthetic */ IdentityContextDto(Boolean bool, String str, a aVar, String str2, String str3, String str4, String str5, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : bool, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5);
    }
}
