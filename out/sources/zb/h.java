package zb;

import cc.i0;
import fr.k;
import p071kotlin.Metadata;
import ub.w;
import ub.x;
import yb.NetworkState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lzb/h;", "Lzb/b;", "Lyb/h;", "Lac/h;", "tracker", "<init>", "(Lac/h;)V", "Lcc/i0;", "workSpec", "", "b", "(Lcc/i0;)Z", "value", "f", "(Lyb/h;)Z", "", "I", "d", "()I", "reason", "c", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends b<NetworkState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f234023c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f234024d = w.i("NetworkNotRoamingCtrlr");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzb/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public h(ac.h<NetworkState> hVar) {
        super(hVar);
        this.reason = 7;
    }

    @Override // zb.e
    public boolean b(i0 workSpec) {
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiredNetworkType() == x.NOT_ROAMING;
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
        return (value.getIsConnected() && value.getIsNotRoaming() && !value.getIsBlocked()) ? false : true;
    }
}
