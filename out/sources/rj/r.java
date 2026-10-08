package rj;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class r extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f174598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ s f174599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, vh.m mVar, String str) {
        super(sVar, new sj.p("OnRequestInstallCallback"), mVar);
        this.f174599h = sVar;
        this.f174598g = str;
    }

    @Override // rj.q, sj.m
    public final void F2(Bundle bundle) {
        super.F2(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f174596e.d(new tj.a(bundle.getInt("error.code", -2)));
        } else {
            this.f174596e.e(s.d(this.f174599h, bundle, this.f174598g));
        }
    }
}
