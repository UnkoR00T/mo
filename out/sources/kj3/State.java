package kj3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import tj3.AbroadDetailsPayload;

/* JADX INFO: renamed from: kj3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkj3/e;", "", "", "isInfoExpanded", "showImportantInfo", "", "Ltj3/a;", "services", "<init>", "(ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInfoExpanded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showImportantInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AbroadDetailsPayload> services;

    public State() {
        this(false, false, null, 7, null);
    }

    public final List<AbroadDetailsPayload> a() {
        return this.services;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowImportantInfo() {
        return this.showImportantInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isInfoExpanded == state.isInfoExpanded && this.showImportantInfo == state.showImportantInfo && t.c(this.services, state.services);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isInfoExpanded) * 31) + Boolean.hashCode(this.showImportantInfo)) * 31) + this.services.hashCode();
    }

    public String toString() {
        return "State(isInfoExpanded=" + this.isInfoExpanded + ", showImportantInfo=" + this.showImportantInfo + ", services=" + this.services + ')';
    }

    public State(boolean z15, boolean z16, List<AbroadDetailsPayload> list) {
        this.isInfoExpanded = z15;
        this.showImportantInfo = z16;
        this.services = list;
    }

    public /* synthetic */ State(boolean z15, boolean z16, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? v.n() : list);
    }
}
