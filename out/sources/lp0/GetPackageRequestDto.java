package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0007\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Llp0/r;", "", "", "institutionId", "", "packageToken", "", "isSigned", "requestData", "Llp0/g0;", "requestHeader", "securityClass", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Llp0/g0;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getInstitutionId", "b", "Ljava/lang/String;", "getPackageToken", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d", "getRequestData", "e", "Llp0/g0;", "getRequestHeader", "()Llp0/g0;", "f", "Ljava/lang/Integer;", "getSecurityClass", "()Ljava/lang/Integer;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetPackageRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final int institutionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("packageToken")
    private final String packageToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isSigned")
    private final Boolean isSigned;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestData")
    private final String requestData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestHeader")
    private final RequestHeaderDto requestHeader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("securityClass")
    private final Integer securityClass;

    public GetPackageRequestDto(int i15, String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num) {
        this.institutionId = i15;
        this.packageToken = str;
        this.isSigned = bool;
        this.requestData = str2;
        this.requestHeader = requestHeaderDto;
        this.securityClass = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPackageRequestDto)) {
            return false;
        }
        GetPackageRequestDto getPackageRequestDto = (GetPackageRequestDto) other;
        return this.institutionId == getPackageRequestDto.institutionId && fr.t.c(this.packageToken, getPackageRequestDto.packageToken) && fr.t.c(this.isSigned, getPackageRequestDto.isSigned) && fr.t.c(this.requestData, getPackageRequestDto.requestData) && fr.t.c(this.requestHeader, getPackageRequestDto.requestHeader) && fr.t.c(this.securityClass, getPackageRequestDto.securityClass);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.institutionId) * 31) + this.packageToken.hashCode()) * 31;
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
        return "GetPackageRequestDto(institutionId=" + this.institutionId + ", packageToken=" + this.packageToken + ", isSigned=" + this.isSigned + ", requestData=" + this.requestData + ", requestHeader=" + this.requestHeader + ", securityClass=" + this.securityClass + ')';
    }

    public /* synthetic */ GetPackageRequestDto(int i15, String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num, int i16, fr.k kVar) {
        this(i15, str, (i16 & 4) != 0 ? null : bool, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : requestHeaderDto, (i16 & 32) != 0 ? null : num);
    }
}
