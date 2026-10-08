package zb;

import cc.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lzb/j;", "Lzb/b;", "", "Lac/h;", "tracker", "<init>", "(Lac/h;)V", "Lcc/i0;", "workSpec", "b", "(Lcc/i0;)Z", "value", "f", "(Z)Z", "", "I", "d", "()I", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends b<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public j(ac.h<Boolean> hVar) {
        super(hVar);
        this.reason = 9;
    }

    @Override // zb.e
    public boolean b(i0 workSpec) {
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiresStorageNotLow();
    }

    @Override // zb.b
    /* JADX INFO: renamed from: d, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    @Override // zb.b
    public /* bridge */ /* synthetic */ boolean e(Boolean bool) {
        return f(bool.booleanValue());
    }

    protected boolean f(boolean value) {
        return !value;
    }
}
