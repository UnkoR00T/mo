package p136y9;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Ly9/v1;", "", "<init>", "()V", "", "a", "Z", "()Z", "setInclusive", "(Z)V", "inclusive", "b", "c", "saveState", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean saveState;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInclusive() {
        return this.inclusive;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSaveState() {
        return this.saveState;
    }

    public final void c(boolean z15) {
        this.saveState = z15;
    }
}
