package vj;

import android.os.Bundle;
import wj.t;

/* JADX INFO: loaded from: classes4.dex */
class k extends wj.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final wj.i f207110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final vh.m f207111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f207112f;

    k(m mVar, wj.i iVar, vh.m mVar2) {
        this.f207112f = mVar;
        this.f207110d = iVar;
        this.f207111e = mVar2;
    }

    @Override // wj.h
    public void x(Bundle bundle) {
        t tVar = this.f207112f.f207114a;
        if (tVar != null) {
            tVar.u(this.f207111e);
        }
        this.f207110d.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
