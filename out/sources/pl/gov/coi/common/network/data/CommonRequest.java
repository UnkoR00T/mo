package pl.gov.coi.common.network.data;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/common/network/data/CommonRequest;", "T", "", "requestId", "", "appInfo", "Lpl/gov/coi/common/network/data/AppInfo;", "requestData", "Lpl/gov/coi/common/network/data/CommonRequestData;", "<init>", "(Ljava/lang/String;Lpl/gov/coi/common/network/data/AppInfo;Lpl/gov/coi/common/network/data/CommonRequestData;)V", "getRequestId", "()Ljava/lang/String;", "getAppInfo", "()Lpl/gov/coi/common/network/data/AppInfo;", "getRequestData", "()Lpl/gov/coi/common/network/data/CommonRequestData;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CommonRequest<T> {

    @c("appInfo")
    private final AppInfo appInfo;

    @c("requestData")
    private final CommonRequestData<T> requestData;

    @c("requestId")
    private final String requestId;

    public CommonRequest(String str, AppInfo appInfo, CommonRequestData<T> commonRequestData) {
        this.requestId = str;
        this.appInfo = appInfo;
        this.requestData = commonRequestData;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final CommonRequestData<T> getRequestData() {
        return this.requestData;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
