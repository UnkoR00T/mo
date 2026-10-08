package pl.gov.coi.common.network.data;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/common/network/data/HeaderDomain;", "", "requestId", "", "appInfo", "Lpl/gov/coi/common/network/data/AppInfo;", "<init>", "(Ljava/lang/String;Lpl/gov/coi/common/network/data/AppInfo;)V", "getRequestId", "()Ljava/lang/String;", "getAppInfo", "()Lpl/gov/coi/common/network/data/AppInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HeaderDomain {

    @c("appInfo")
    private final AppInfo appInfo;

    @c("requestId")
    private final String requestId;

    public HeaderDomain(String str, AppInfo appInfo) {
        this.requestId = str;
        this.appInfo = appInfo;
    }

    public static /* synthetic */ HeaderDomain copy$default(HeaderDomain headerDomain, String str, AppInfo appInfo, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = headerDomain.requestId;
        }
        if ((i15 & 2) != 0) {
            appInfo = headerDomain.appInfo;
        }
        return headerDomain.copy(str, appInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final HeaderDomain copy(String requestId, AppInfo appInfo) {
        return new HeaderDomain(requestId, appInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDomain)) {
            return false;
        }
        HeaderDomain headerDomain = (HeaderDomain) other;
        return t.c(this.requestId, headerDomain.requestId) && t.c(this.appInfo, headerDomain.appInfo);
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int iHashCode = this.requestId.hashCode() * 31;
        AppInfo appInfo = this.appInfo;
        return iHashCode + (appInfo == null ? 0 : appInfo.hashCode());
    }

    public String toString() {
        return "HeaderDomain(requestId=" + this.requestId + ", appInfo=" + this.appInfo + ')';
    }

    public /* synthetic */ HeaderDomain(String str, AppInfo appInfo, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? null : appInfo);
    }
}
