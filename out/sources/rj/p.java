package rj;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class p extends sj.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f174592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ vh.m f174593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ s f174594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(s sVar, vh.m mVar, String str, vh.m mVar2) {
        super(mVar);
        this.f174594d = sVar;
        this.f174592b = str;
        this.f174593c = mVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, sj.k] */
    @Override // sj.q
    protected final void a() {
        try {
            ?? E = this.f174594d.f174602a.e();
            s sVar = this.f174594d;
            E.y(sVar.f174603b, s.b(sVar, this.f174592b), new r(this.f174594d, this.f174593c, this.f174592b));
        } catch (RemoteException e15) {
            s.f174600e.b(e15, "requestUpdateInfo(%s)", this.f174592b);
            this.f174593c.d(new RuntimeException(e15));
        }
    }
}
