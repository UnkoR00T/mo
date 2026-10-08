package dc4;

import fc4.ServerTimeData;
import fc4.b;
import mu.b0;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ldc4/a;", "Lfc4/b;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Lfz/b$f;", "serverCurrentTime", "Loq/i0;", "o", "(Lfz/b$f;)V", "clear", "()V", "a", "Lez/a;", "Lmu/b0;", "Lfc4/a;", "b", "Lmu/b0;", "_serverTimeData", "Lmu/p0;", "c", "Lmu/p0;", "f", "()Lmu/p0;", "serverTimeData", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0<ServerTimeData> _serverTimeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0<ServerTimeData> serverTimeData;

    public a(ez.a aVar) {
        this.currentTimeProvider = aVar;
        b0<ServerTimeData> b0VarA = r0.a(null);
        this._serverTimeData = b0VarA;
        this.serverTimeData = b0VarA;
    }

    @Override // wy.c
    public void clear() {
        b0<ServerTimeData> b0Var = this._serverTimeData;
        while (!b0Var.s(b0Var.getValue(), null)) {
        }
    }

    @Override // fc4.b
    public p0<ServerTimeData> f() {
        return this.serverTimeData;
    }

    @Override // fc4.b
    public void o(fz.b.OffsetDateTime serverCurrentTime) {
        b0<ServerTimeData> b0Var = this._serverTimeData;
        while (!b0Var.s(b0Var.getValue(), new ServerTimeData(serverCurrentTime, this.currentTimeProvider.e()))) {
        }
    }
}
