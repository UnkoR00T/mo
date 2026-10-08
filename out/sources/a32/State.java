package a32;

import eo0.Recipient;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a32.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"La32/b;", "", "", "isSearchActive", "", "query", "", "Leo0/k0;", "recipients", "Ldx/b;", "domainError", "userHasActiveEdorInbox", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ldx/b;Z)V", "a", "(ZLjava/lang/String;Ljava/util/List;Ldx/b;Z)La32/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Ljava/lang/String;", "d", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ldx/b;", "()Ldx/b;", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Recipient> recipients;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final dx.b domainError;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean userHasActiveEdorInbox;

    public State(boolean z15, String str, List<Recipient> list, dx.b bVar, boolean z16) {
        this.isSearchActive = z15;
        this.query = str;
        this.recipients = list;
        this.domainError = bVar;
        this.userHasActiveEdorInbox = z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, boolean z15, String str, List list, dx.b bVar, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.isSearchActive;
        }
        if ((i15 & 2) != 0) {
            str = state.query;
        }
        if ((i15 & 4) != 0) {
            list = state.recipients;
        }
        if ((i15 & 8) != 0) {
            bVar = state.domainError;
        }
        if ((i15 & 16) != 0) {
            z16 = state.userHasActiveEdorInbox;
        }
        boolean z17 = z16;
        List list2 = list;
        return state.a(z15, str, list2, bVar, z17);
    }

    public final State a(boolean isSearchActive, String query, List<Recipient> recipients, dx.b domainError, boolean userHasActiveEdorInbox) {
        return new State(isSearchActive, query, recipients, domainError, userHasActiveEdorInbox);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final dx.b getDomainError() {
        return this.domainError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<Recipient> e() {
        return this.recipients;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isSearchActive == state.isSearchActive && fr.t.c(this.query, state.query) && fr.t.c(this.recipients, state.recipients) && fr.t.c(this.domainError, state.domainError) && this.userHasActiveEdorInbox == state.userHasActiveEdorInbox;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUserHasActiveEdorInbox() {
        return this.userHasActiveEdorInbox;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isSearchActive) * 31) + this.query.hashCode()) * 31;
        List<Recipient> list = this.recipients;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        dx.b bVar = this.domainError;
        return ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.userHasActiveEdorInbox);
    }

    public String toString() {
        return "State(isSearchActive=" + this.isSearchActive + ", query=" + this.query + ", recipients=" + this.recipients + ", domainError=" + this.domainError + ", userHasActiveEdorInbox=" + this.userHasActiveEdorInbox + ')';
    }

    public /* synthetic */ State(boolean z15, String str, List list, dx.b bVar, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? null : list, (i15 & 8) != 0 ? null : bVar, z16);
    }
}
