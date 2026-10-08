package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Llp0/h;", "", "Llp0/a;", "appInfo", "Llp0/d;", "requestData", "", "requestId", "<init>", "(Llp0/a;Llp0/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llp0/a;", "getAppInfo", "()Llp0/a;", "b", "Llp0/d;", "getRequestData", "()Llp0/d;", "c", "Ljava/lang/String;", "getRequestId", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonRequestGetPackageRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("appInfo")
    private final AppInfoDto appInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestData")
    private final CommonRequestDataGetPackageRequestDto requestData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("requestId")
    private final String requestId;

    public CommonRequestGetPackageRequestDto() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestGetPackageRequestDto)) {
            return false;
        }
        CommonRequestGetPackageRequestDto commonRequestGetPackageRequestDto = (CommonRequestGetPackageRequestDto) other;
        return fr.t.c(this.appInfo, commonRequestGetPackageRequestDto.appInfo) && fr.t.c(this.requestData, commonRequestGetPackageRequestDto.requestData) && fr.t.c(this.requestId, commonRequestGetPackageRequestDto.requestId);
    }

    public int hashCode() {
        AppInfoDto appInfoDto = this.appInfo;
        int iHashCode = (appInfoDto == null ? 0 : appInfoDto.hashCode()) * 31;
        CommonRequestDataGetPackageRequestDto commonRequestDataGetPackageRequestDto = this.requestData;
        int iHashCode2 = (iHashCode + (commonRequestDataGetPackageRequestDto == null ? 0 : commonRequestDataGetPackageRequestDto.hashCode())) * 31;
        String str = this.requestId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CommonRequestGetPackageRequestDto(appInfo=" + this.appInfo + ", requestData=" + this.requestData + ", requestId=" + this.requestId + ')';
    }

    public CommonRequestGetPackageRequestDto(AppInfoDto appInfoDto, CommonRequestDataGetPackageRequestDto commonRequestDataGetPackageRequestDto, String str) {
        this.appInfo = appInfoDto;
        this.requestData = commonRequestDataGetPackageRequestDto;
        this.requestId = str;
    }

    public /* synthetic */ CommonRequestGetPackageRequestDto(AppInfoDto appInfoDto, CommonRequestDataGetPackageRequestDto commonRequestDataGetPackageRequestDto, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : appInfoDto, (i15 & 2) != 0 ? null : commonRequestDataGetPackageRequestDto, (i15 & 4) != 0 ? null : str);
    }
}
