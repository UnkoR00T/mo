package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0019"}, d2 = {"Llp0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorCode", "errorCode", "b", "getErrorDetails", "errorDetails", "c", "getErrorMessage", "errorMessage", "d", "getErrorSource", "errorSource", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("errorCode")
    private final String errorCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("errorDetails")
    private final String errorDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("errorMessage")
    private final String errorMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("errorSource")
    private final String errorSource;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDto)) {
            return false;
        }
        ErrorDto errorDto = (ErrorDto) other;
        return fr.t.c(this.errorCode, errorDto.errorCode) && fr.t.c(this.errorDetails, errorDto.errorDetails) && fr.t.c(this.errorMessage, errorDto.errorMessage) && fr.t.c(this.errorSource, errorDto.errorSource);
    }

    public int hashCode() {
        return (((((this.errorCode.hashCode() * 31) + this.errorDetails.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.errorSource.hashCode();
    }

    public String toString() {
        return "ErrorDto(errorCode=" + this.errorCode + ", errorDetails=" + this.errorDetails + ", errorMessage=" + this.errorMessage + ", errorSource=" + this.errorSource + ')';
    }
}
