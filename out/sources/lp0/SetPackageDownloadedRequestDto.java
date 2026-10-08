package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Llp0/j0;", "", "", "packageToken", "", "isSigned", "requestData", "Llp0/g0;", "requestHeader", "", "securityClass", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Llp0/g0;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPackageToken", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "getRequestData", "d", "Llp0/g0;", "getRequestHeader", "()Llp0/g0;", "e", "Ljava/lang/Integer;", "getSecurityClass", "()Ljava/lang/Integer;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetPackageDownloadedRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("packageToken")
    private final String packageToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isSigned")
    private final Boolean isSigned;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestData")
    private final String requestData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestHeader")
    private final RequestHeaderDto requestHeader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("securityClass")
    private final Integer securityClass;

    public SetPackageDownloadedRequestDto(String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num) {
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
        if (!(other instanceof SetPackageDownloadedRequestDto)) {
            return false;
        }
        SetPackageDownloadedRequestDto setPackageDownloadedRequestDto = (SetPackageDownloadedRequestDto) other;
        return fr.t.c(this.packageToken, setPackageDownloadedRequestDto.packageToken) && fr.t.c(this.isSigned, setPackageDownloadedRequestDto.isSigned) && fr.t.c(this.requestData, setPackageDownloadedRequestDto.requestData) && fr.t.c(this.requestHeader, setPackageDownloadedRequestDto.requestHeader) && fr.t.c(this.securityClass, setPackageDownloadedRequestDto.securityClass);
    }

    public int hashCode() {
        int iHashCode = this.packageToken.hashCode() * 31;
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
        return "SetPackageDownloadedRequestDto(packageToken=" + this.packageToken + ", isSigned=" + this.isSigned + ", requestData=" + this.requestData + ", requestHeader=" + this.requestHeader + ", securityClass=" + this.securityClass + ')';
    }

    public /* synthetic */ SetPackageDownloadedRequestDto(String str, Boolean bool, String str2, RequestHeaderDto requestHeaderDto, Integer num, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? null : bool, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : requestHeaderDto, (i15 & 16) != 0 ? null : num);
    }
}
