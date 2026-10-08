package j1;

import f3.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lj1/h;", "Lf3/m$c;", "Lj1/a;", "requester", "<init>", "(Lj1/a;)V", "Loq/i0;", "n3", "()V", "W2", "o3", "X2", "r", "Lj1/a;", "", "s", "Z", "R2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends m.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private a requester;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public h(a aVar) {
        this.requester = aVar;
    }

    private final void n3() {
        a aVar = this.requester;
        if (aVar instanceof d) {
            ((d) aVar).e().t(this);
        }
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // f3.m.c
    public void W2() {
        o3(this.requester);
    }

    @Override // f3.m.c
    public void X2() {
        n3();
    }

    public final void o3(a requester) {
        n3();
        if (requester instanceof d) {
            ((d) requester).e().d(this);
        }
        this.requester = requester;
    }
}
