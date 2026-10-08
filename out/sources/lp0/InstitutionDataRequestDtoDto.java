package lp0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0007\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006*"}, d2 = {"Llp0/a0;", "", "", "base64CertData", "", "cardId", "institutionId", "isSigned", "", "requestData", "Llp0/g0;", "requestHeader", "securityClass", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Llp0/g0;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getBase64CertData", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Integer;", "getCardId", "()Ljava/lang/Integer;", "c", "getInstitutionId", "d", "e", "Ljava/lang/String;", "getRequestData", "f", "Llp0/g0;", "getRequestHeader", "()Llp0/g0;", "g", "getSecurityClass", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionDataRequestDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("base64CertData")
    private final Boolean base64CertData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardId")
    private final Integer cardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final Integer institutionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isSigned")
    private final Boolean isSigned;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestData")
    private final String requestData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestHeader")
    private final RequestHeaderDto requestHeader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("securityClass")
    private final Integer securityClass;

    public InstitutionDataRequestDtoDto() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionDataRequestDtoDto)) {
            return false;
        }
        InstitutionDataRequestDtoDto institutionDataRequestDtoDto = (InstitutionDataRequestDtoDto) other;
        return fr.t.c(this.base64CertData, institutionDataRequestDtoDto.base64CertData) && fr.t.c(this.cardId, institutionDataRequestDtoDto.cardId) && fr.t.c(this.institutionId, institutionDataRequestDtoDto.institutionId) && fr.t.c(this.isSigned, institutionDataRequestDtoDto.isSigned) && fr.t.c(this.requestData, institutionDataRequestDtoDto.requestData) && fr.t.c(this.requestHeader, institutionDataRequestDtoDto.requestHeader) && fr.t.c(this.securityClass, institutionDataRequestDtoDto.securityClass);
    }

    public int hashCode() {
        Boolean bool = this.base64CertData;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.cardId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.institutionId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isSigned;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.requestData;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        RequestHeaderDto requestHeaderDto = this.requestHeader;
        int iHashCode6 = (iHashCode5 + (requestHeaderDto == null ? 0 : requestHeaderDto.hashCode())) * 31;
        Integer num3 = this.securityClass;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "InstitutionDataRequestDtoDto(base64CertData=" + this.base64CertData + ", cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", isSigned=" + this.isSigned + ", requestData=" + this.requestData + ", requestHeader=" + this.requestHeader + ", securityClass=" + this.securityClass + ')';
    }

    public InstitutionDataRequestDtoDto(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, RequestHeaderDto requestHeaderDto, Integer num3) {
        this.base64CertData = bool;
        this.cardId = num;
        this.institutionId = num2;
        this.isSigned = bool2;
        this.requestData = str;
        this.requestHeader = requestHeaderDto;
        this.securityClass = num3;
    }

    public /* synthetic */ InstitutionDataRequestDtoDto(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, RequestHeaderDto requestHeaderDto, Integer num3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : bool, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : num2, (i15 & 8) != 0 ? null : bool2, (i15 & 16) != 0 ? null : str, (i15 & 32) != 0 ? null : requestHeaderDto, (i15 & 64) != 0 ? null : num3);
    }
}
