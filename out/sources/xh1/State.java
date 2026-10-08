package xh1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xh1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lxh1/c;", "", "", "Lk34/g;", "documentsList", "", "isCertValid", "isCertExpired", "Ld60/j;", "Lah1/a$b;", "scrollTo", "<init>", "(Ljava/util/List;ZZLd60/j;)V", "a", "(Ljava/util/List;ZZLd60/j;)Lxh1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "f", "()Z", "e", "d", "Ld60/j;", "()Ld60/j;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k34.g> documentsList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCertValid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCertExpired;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<ah1.a.b> scrollTo;

    public State() {
        this(null, false, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, boolean z15, boolean z16, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.documentsList;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isCertValid;
        }
        if ((i15 & 4) != 0) {
            z16 = state.isCertExpired;
        }
        if ((i15 & 8) != 0) {
            jVar = state.scrollTo;
        }
        return state.a(list, z15, z16, jVar);
    }

    public final State a(List<? extends k34.g> documentsList, boolean isCertValid, boolean isCertExpired, d60.j<ah1.a.b> scrollTo) {
        return new State(documentsList, isCertValid, isCertExpired, scrollTo);
    }

    public final List<k34.g> c() {
        return this.documentsList;
    }

    public final d60.j<ah1.a.b> d() {
        return this.scrollTo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCertExpired() {
        return this.isCertExpired;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.documentsList, state.documentsList) && this.isCertValid == state.isCertValid && this.isCertExpired == state.isCertExpired && fr.t.c(this.scrollTo, state.scrollTo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCertValid() {
        return this.isCertValid;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentsList.hashCode() * 31) + Boolean.hashCode(this.isCertValid)) * 31) + Boolean.hashCode(this.isCertExpired)) * 31;
        d60.j<ah1.a.b> jVar = this.scrollTo;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(documentsList=" + this.documentsList + ", isCertValid=" + this.isCertValid + ", isCertExpired=" + this.isCertExpired + ", scrollTo=" + this.scrollTo + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public State(List<? extends k34.g> list, boolean z15, boolean z16, d60.j<ah1.a.b> jVar) {
        this.documentsList = list;
        this.isCertValid = z15;
        this.isCertExpired = z16;
        this.scrollTo = jVar;
    }

    public /* synthetic */ State(List list, boolean z15, boolean z16, d60.j jVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? pq.v.n() : list, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? null : jVar);
    }
}
