package ja;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ja.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0019\u0010\u001dR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lja/i;", "", "Lja/w;", "refresh", "prepend", "append", "Lja/x;", "source", "mediator", "<init>", "(Lja/w;Lja/w;Lja/w;Lja/x;Lja/x;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lja/w;", "d", "()Lja/w;", "b", "c", "Lja/x;", "e", "()Lja/x;", "f", "Z", "isIdle", "()Z", "g", "hasError", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CombinedLoadStates {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final w refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final w prepend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final w append;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LoadStates source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LoadStates mediator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isIdle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean hasError;

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public CombinedLoadStates(w wVar, w wVar2, w wVar3, LoadStates loadStates, LoadStates loadStates2) {
        boolean z15;
        boolean z16;
        this.refresh = wVar;
        this.prepend = wVar2;
        this.append = wVar3;
        this.source = loadStates;
        this.mediator = loadStates2;
        if (loadStates.getIsIdle()) {
            if (loadStates2 != null ? loadStates2.getIsIdle() : true) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        this.isIdle = z15;
        if (!loadStates.getHasError()) {
            z16 = loadStates2 != null ? loadStates2.getHasError() : false;
        }
        this.hasError = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w getAppend() {
        return this.append;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LoadStates getMediator() {
        return this.mediator;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final w getPrepend() {
        return this.prepend;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w getRefresh() {
        return this.refresh;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LoadStates getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || CombinedLoadStates.class != other.getClass()) {
            return false;
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) other;
        return fr.t.c(this.refresh, combinedLoadStates.refresh) && fr.t.c(this.prepend, combinedLoadStates.prepend) && fr.t.c(this.append, combinedLoadStates.append) && fr.t.c(this.source, combinedLoadStates.source) && fr.t.c(this.mediator, combinedLoadStates.mediator);
    }

    public int hashCode() {
        int iHashCode = ((((((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode()) * 31) + this.source.hashCode()) * 31;
        LoadStates loadStates = this.mediator;
        return iHashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }

    public /* synthetic */ CombinedLoadStates(w wVar, w wVar2, w wVar3, LoadStates loadStates, LoadStates loadStates2, int i15, fr.k kVar) {
        this(wVar, wVar2, wVar3, loadStates, (i15 & 16) != 0 ? null : loadStates2);
    }
}
