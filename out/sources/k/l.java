package k;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000f"}, d2 = {"Lk/l;", "Lk/d0;", "Lsu/a;", "mutex", "<init>", "(Lsu/a;)V", "", "b", "()Z", "a", "Lsu/a;", "Liu/a;", "Liu/a;", "_released", "released", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iu.a _released = iu.b.a(false);

    public l(su.a aVar) {
        this.mutex = aVar;
    }

    @Override // k.d0
    public boolean a() {
        return this._released.b();
    }

    @Override // k.d0
    public boolean b() {
        if (!this._released.a(false, true)) {
            return false;
        }
        su.a.C4762a.c(this.mutex, null, 1, null);
        return true;
    }
}
