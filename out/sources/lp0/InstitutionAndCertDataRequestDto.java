package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\b\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Llp0/v;", "", "", "idType", "institutionTypeId", "", "internalId", "", "isSigned", "requestData", "Llp0/g0;", "requestHeader", "securityClass", "<init>", "(IILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Llp0/g0;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIdType", "b", "getInstitutionTypeId", "c", "Ljava/lang/String;", "getInternalId", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getRequestData", "f", "Llp0/g0;", "getRequestHeader", "()Llp0/g0;", "g", "Ljava/lang/Integer;", "getSecurityClass", "()Ljava/lang/Integer;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionAndCertDataRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("idType")
    private final int idType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionTypeId")
    private final int institutionTypeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("internalId")
    private final String internalId;

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

    public InstitutionAndCertDataRequestDto(int i15, int i16, String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num) {
        this.idType = i15;
        this.institutionTypeId = i16;
        this.internalId = str;
        this.isSigned = bool;
        this.requestData = str2;
        this.requestHeader = requestHeaderDto;
        this.securityClass = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionAndCertDataRequestDto)) {
            return false;
        }
        InstitutionAndCertDataRequestDto institutionAndCertDataRequestDto = (InstitutionAndCertDataRequestDto) other;
        return this.idType == institutionAndCertDataRequestDto.idType && this.institutionTypeId == institutionAndCertDataRequestDto.institutionTypeId && fr.t.c(this.internalId, institutionAndCertDataRequestDto.internalId) && fr.t.c(this.isSigned, institutionAndCertDataRequestDto.isSigned) && fr.t.c(this.requestData, institutionAndCertDataRequestDto.requestData) && fr.t.c(this.requestHeader, institutionAndCertDataRequestDto.requestHeader) && fr.t.c(this.securityClass, institutionAndCertDataRequestDto.securityClass);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.idType) * 31) + Integer.hashCode(this.institutionTypeId)) * 31) + this.internalId.hashCode()) * 31;
        Boolean bool = this.isSigned;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.requestData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        RequestHeaderDto requestHeaderDto = this.requestHeader;
        int iHashCode4 = (iHashCode3 + (requestHeaderDto == null ? 0 : requestHeaderDto.hashCode())) * 31;
        Integer num = this.securityClass;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "InstitutionAndCertDataRequestDto(idType=" + this.idType + ", institutionTypeId=" + this.institutionTypeId + ", internalId=" + this.internalId + ", isSigned=" + this.isSigned + ", requestData=" + this.requestData + ", requestHeader=" + this.requestHeader + ", securityClass=" + this.securityClass + ')';
    }

    public /* synthetic */ InstitutionAndCertDataRequestDto(int i15, int i16, String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num, int i17, fr.k kVar) {
        this(i15, i16, str, (i17 & 8) != 0 ? null : bool, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? null : requestHeaderDto, (i17 & 64) != 0 ? null : num);
    }
}
