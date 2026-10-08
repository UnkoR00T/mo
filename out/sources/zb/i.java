package zb;

import cc.i0;
import p071kotlin.Metadata;
import ub.x;
import yb.NetworkState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lzb/i;", "Lzb/b;", "Lyb/h;", "Lac/h;", "tracker", "<init>", "(Lac/h;)V", "Lcc/i0;", "workSpec", "", "b", "(Lcc/i0;)Z", "value", "f", "(Lyb/h;)Z", "", "I", "d", "()I", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends b<NetworkState> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public i(ac.h<NetworkState> hVar) {
        super(hVar);
        this.reason = 7;
    }

    @Override // zb.e
    public boolean b(i0 workSpec) {
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiredNetworkType() == x.UNMETERED;
    }

    @Override // zb.b
    /* JADX INFO: renamed from: d, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zb.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(NetworkState value) {
        return !value.getIsConnected() || value.getIsMetered() || value.getIsBlocked();
    }
}
