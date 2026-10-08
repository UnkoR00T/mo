package rj;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
class q extends sj.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final sj.p f174595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final vh.m f174596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f174597f;

    q(s sVar, sj.p pVar, vh.m mVar) {
        this.f174597f = sVar;
        this.f174595d = pVar;
        this.f174596e = mVar;
    }

    @Override // sj.m
    public void F2(Bundle bundle) {
        this.f174597f.f174602a.u(this.f174596e);
        this.f174595d.c("onRequestInfo", new Object[0]);
    }

    @Override // sj.m
    public void x(Bundle bundle) {
        this.f174597f.f174602a.u(this.f174596e);
        this.f174595d.c("onCompleteUpdate", new Object[0]);
    }
}
