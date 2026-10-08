package am2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: am2.l, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lam2/l;", "", "", "showNotificationsAlert", "knowledgeBaseEnabled", "notificationsSettingsChangePending", "<init>", "(ZZZ)V", "a", "(ZZZ)Lam2/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "c", "d", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showNotificationsAlert;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean knowledgeBaseEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean notificationsSettingsChangePending;

    public State(boolean z15, boolean z16, boolean z17) {
        this.showNotificationsAlert = z15;
        this.knowledgeBaseEnabled = z16;
        this.notificationsSettingsChangePending = z17;
    }

    public static /* synthetic */ State b(State state, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.showNotificationsAlert;
        }
        if ((i15 & 2) != 0) {
            z16 = state.knowledgeBaseEnabled;
        }
        if ((i15 & 4) != 0) {
            z17 = state.notificationsSettingsChangePending;
        }
        return state.a(z15, z16, z17);
    }

    public final State a(boolean showNotificationsAlert, boolean knowledgeBaseEnabled, boolean notificationsSettingsChangePending) {
        return new State(showNotificationsAlert, knowledgeBaseEnabled, notificationsSettingsChangePending);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getKnowledgeBaseEnabled() {
        return this.knowledgeBaseEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNotificationsSettingsChangePending() {
        return this.notificationsSettingsChangePending;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowNotificationsAlert() {
        return this.showNotificationsAlert;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.showNotificationsAlert == state.showNotificationsAlert && this.knowledgeBaseEnabled == state.knowledgeBaseEnabled && this.notificationsSettingsChangePending == state.notificationsSettingsChangePending;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.showNotificationsAlert) * 31) + Boolean.hashCode(this.knowledgeBaseEnabled)) * 31) + Boolean.hashCode(this.notificationsSettingsChangePending);
    }

    public String toString() {
        return "State(showNotificationsAlert=" + this.showNotificationsAlert + ", knowledgeBaseEnabled=" + this.knowledgeBaseEnabled + ", notificationsSettingsChangePending=" + this.notificationsSettingsChangePending + ')';
    }
}
