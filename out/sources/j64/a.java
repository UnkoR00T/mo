package j64;

import mu.b0;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lj64/a;", "Lq64/b;", "<init>", "()V", "Loq/i0;", "clear", "E", "Lq64/a;", "remoteSettingsData", "j", "(Lq64/a;)V", "Lmu/b0;", "a", "Lmu/b0;", "_remoteSettings", "Lmu/p0;", "b", "Lmu/p0;", "j0", "()Lmu/p0;", "remoteSettings", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements q64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<RemoteSettingsData> _remoteSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<RemoteSettingsData> remoteSettings;

    public a() {
        b0<RemoteSettingsData> b0VarA = r0.a(null);
        this._remoteSettings = b0VarA;
        this.remoteSettings = b0VarA;
    }

    @Override // q64.b
    public void E() {
        b0<RemoteSettingsData> b0Var = this._remoteSettings;
        while (!b0Var.s(b0Var.getValue(), RemoteSettingsData.INSTANCE.a())) {
        }
    }

    @Override // wy.c
    public void clear() {
        b0<RemoteSettingsData> b0Var = this._remoteSettings;
        while (!b0Var.s(b0Var.getValue(), null)) {
        }
    }

    @Override // q64.b
    public void j(RemoteSettingsData remoteSettingsData) {
        b0<RemoteSettingsData> b0Var = this._remoteSettings;
        while (!b0Var.s(b0Var.getValue(), remoteSettingsData)) {
        }
    }

    @Override // q64.b
    public p0<RemoteSettingsData> j0() {
        return this.remoteSettings;
    }
}
