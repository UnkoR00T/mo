package yb;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: yb.h, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"Lyb/h;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "isBlocked", "<init>", "(ZZZZZ)V", "a", "(ZZZZZ)Lyb/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "g", "c", "e", "f", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NetworkState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isConnected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValidated;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMetered;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNotRoaming;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBlocked;

    public NetworkState(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.isConnected = z15;
        this.isValidated = z16;
        this.isMetered = z17;
        this.isNotRoaming = z18;
        this.isBlocked = z19;
    }

    public static /* synthetic */ NetworkState b(NetworkState networkState, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = networkState.isConnected;
        }
        if ((i15 & 2) != 0) {
            z16 = networkState.isValidated;
        }
        if ((i15 & 4) != 0) {
            z17 = networkState.isMetered;
        }
        if ((i15 & 8) != 0) {
            z18 = networkState.isNotRoaming;
        }
        if ((i15 & 16) != 0) {
            z19 = networkState.isBlocked;
        }
        boolean z25 = z19;
        boolean z26 = z17;
        return networkState.a(z15, z16, z26, z18, z25);
    }

    public final NetworkState a(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming, boolean isBlocked) {
        return new NetworkState(isConnected, isValidated, isMetered, isNotRoaming, isBlocked);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) other;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming && this.isBlocked == networkState.isBlocked;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsNotRoaming() {
        return this.isNotRoaming;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsValidated() {
        return this.isValidated;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isConnected) * 31) + Boolean.hashCode(this.isValidated)) * 31) + Boolean.hashCode(this.isMetered)) * 31) + Boolean.hashCode(this.isNotRoaming)) * 31) + Boolean.hashCode(this.isBlocked);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ", isBlocked=" + this.isBlocked + ')';
    }
}
