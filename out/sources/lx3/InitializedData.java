package lx3;

import iy.b0;
import java.util.List;
import p071kotlin.Metadata;
import w70.ExecutionData;

/* JADX INFO: renamed from: lx3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jz\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b%\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b-\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b\"\u0010/¨\u00060"}, d2 = {"Llx3/b;", "", "", "timeOutLeftTimeSec", "", "scheme", "url", "customUserAgent", "iamOwTokenUrl", "", "Lw70/a;", "scriptsList", "", "sslEnabled", "isProcessVisibleForUser", "stateParameterValue", "Liy/b0;", "codeVerifier", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Liy/b0;)V", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Liy/b0;)Llx3/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "j", "b", "Ljava/lang/String;", "f", "c", "k", "d", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "Z", "h", "()Z", "l", "i", "Liy/b0;", "()Liy/b0;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int timeOutLeftTimeSec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customUserAgent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iamOwTokenUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ExecutionData> scriptsList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sslEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProcessVisibleForUser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stateParameterValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 codeVerifier;

    public InitializedData(int i15, String str, String str2, String str3, String str4, List<ExecutionData> list, boolean z15, boolean z16, String str5, b0 b0Var) {
        this.timeOutLeftTimeSec = i15;
        this.scheme = str;
        this.url = str2;
        this.customUserAgent = str3;
        this.iamOwTokenUrl = str4;
        this.scriptsList = list;
        this.sslEnabled = z15;
        this.isProcessVisibleForUser = z16;
        this.stateParameterValue = str5;
        this.codeVerifier = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializedData b(InitializedData initializedData, int i15, String str, String str2, String str3, String str4, List list, boolean z15, boolean z16, String str5, b0 b0Var, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = initializedData.timeOutLeftTimeSec;
        }
        if ((i16 & 2) != 0) {
            str = initializedData.scheme;
        }
        if ((i16 & 4) != 0) {
            str2 = initializedData.url;
        }
        if ((i16 & 8) != 0) {
            str3 = initializedData.customUserAgent;
        }
        if ((i16 & 16) != 0) {
            str4 = initializedData.iamOwTokenUrl;
        }
        if ((i16 & 32) != 0) {
            list = initializedData.scriptsList;
        }
        if ((i16 & 64) != 0) {
            z15 = initializedData.sslEnabled;
        }
        if ((i16 & 128) != 0) {
            z16 = initializedData.isProcessVisibleForUser;
        }
        if ((i16 & 256) != 0) {
            str5 = initializedData.stateParameterValue;
        }
        if ((i16 & 512) != 0) {
            b0Var = initializedData.codeVerifier;
        }
        String str6 = str5;
        b0 b0Var2 = b0Var;
        boolean z17 = z15;
        boolean z18 = z16;
        String str7 = str4;
        List list2 = list;
        return initializedData.a(i15, str, str2, str3, str7, list2, z17, z18, str6, b0Var2);
    }

    public final InitializedData a(int timeOutLeftTimeSec, String scheme, String url, String customUserAgent, String iamOwTokenUrl, List<ExecutionData> scriptsList, boolean sslEnabled, boolean isProcessVisibleForUser, String stateParameterValue, b0 codeVerifier) {
        return new InitializedData(timeOutLeftTimeSec, scheme, url, customUserAgent, iamOwTokenUrl, scriptsList, sslEnabled, isProcessVisibleForUser, stateParameterValue, codeVerifier);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getCodeVerifier() {
        return this.codeVerifier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCustomUserAgent() {
        return this.customUserAgent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIamOwTokenUrl() {
        return this.iamOwTokenUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedData)) {
            return false;
        }
        InitializedData initializedData = (InitializedData) other;
        return this.timeOutLeftTimeSec == initializedData.timeOutLeftTimeSec && fr.t.c(this.scheme, initializedData.scheme) && fr.t.c(this.url, initializedData.url) && fr.t.c(this.customUserAgent, initializedData.customUserAgent) && fr.t.c(this.iamOwTokenUrl, initializedData.iamOwTokenUrl) && fr.t.c(this.scriptsList, initializedData.scriptsList) && this.sslEnabled == initializedData.sslEnabled && this.isProcessVisibleForUser == initializedData.isProcessVisibleForUser && fr.t.c(this.stateParameterValue, initializedData.stateParameterValue) && fr.t.c(this.codeVerifier, initializedData.codeVerifier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final List<ExecutionData> g() {
        return this.scriptsList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSslEnabled() {
        return this.sslEnabled;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.timeOutLeftTimeSec) * 31) + this.scheme.hashCode()) * 31) + this.url.hashCode()) * 31) + this.customUserAgent.hashCode()) * 31) + this.iamOwTokenUrl.hashCode()) * 31) + this.scriptsList.hashCode()) * 31) + Boolean.hashCode(this.sslEnabled)) * 31) + Boolean.hashCode(this.isProcessVisibleForUser)) * 31) + this.stateParameterValue.hashCode()) * 31) + this.codeVerifier.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStateParameterValue() {
        return this.stateParameterValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTimeOutLeftTimeSec() {
        return this.timeOutLeftTimeSec;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsProcessVisibleForUser() {
        return this.isProcessVisibleForUser;
    }

    public String toString() {
        return "InitializedData(timeOutLeftTimeSec=" + this.timeOutLeftTimeSec + ", scheme=" + this.scheme + ", url=" + this.url + ", customUserAgent=" + this.customUserAgent + ", iamOwTokenUrl=" + this.iamOwTokenUrl + ", scriptsList=" + this.scriptsList + ", sslEnabled=" + this.sslEnabled + ", isProcessVisibleForUser=" + this.isProcessVisibleForUser + ", stateParameterValue=" + this.stateParameterValue + ", codeVerifier=" + this.codeVerifier + ')';
    }
}
