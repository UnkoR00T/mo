package po1;

import org.conscrypt.BuildConfig;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: po1.s, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lpo1/s;", "", "", "appVersion", "buildType", "currentCommitSha", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpo1/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentCommitSha;

    public State() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ State b(State state, String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.appVersion;
        }
        if ((i15 & 2) != 0) {
            str2 = state.buildType;
        }
        if ((i15 & 4) != 0) {
            str3 = state.currentCommitSha;
        }
        return state.a(str, str2, str3);
    }

    public final State a(String appVersion, String buildType, String currentCommitSha) {
        return new State(appVersion, buildType, currentCommitSha);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBuildType() {
        return this.buildType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrentCommitSha() {
        return this.currentCommitSha;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.appVersion, state.appVersion) && fr.t.c(this.buildType, state.buildType) && fr.t.c(this.currentCommitSha, state.currentCommitSha);
    }

    public int hashCode() {
        String str = this.appVersion;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.buildType.hashCode()) * 31) + this.currentCommitSha.hashCode();
    }

    public String toString() {
        return "State(appVersion=" + this.appVersion + ", buildType=" + this.buildType + ", currentCommitSha=" + this.currentCommitSha + ')';
    }

    public State(String str, String str2, String str3) {
        this.appVersion = str;
        this.buildType = str2;
        this.currentCommitSha = str3;
    }

    public /* synthetic */ State(String str, String str2, String str3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? BuildConfig.BUILD_TYPE : str2, (i15 & 4) != 0 ? "adaa50b23" : str3);
    }
}
