package lh;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import mh.r0;

/* JADX INFO: loaded from: classes3.dex */
final class p implements rg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f118231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mh.d f118232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f118233c;

    public p(ViewGroup viewGroup, mh.d dVar) {
        this.f118232b = (mh.d) jg.s.l(dVar);
        this.f118231a = (ViewGroup) jg.s.l(viewGroup);
    }

    public final void a(h hVar) {
        try {
            this.f118232b.Q0(new o(this, hVar));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void e() {
        try {
            this.f118232b.e();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void g() {
        try {
            this.f118232b.g();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void h() {
        try {
            this.f118232b.h();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void n() {
        try {
            this.f118232b.n();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void onLowMemory() {
        try {
            this.f118232b.onLowMemory();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void s() {
        try {
            this.f118232b.s();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    @Override // rg.c
    public final void w(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            r0.b(bundle, bundle2);
            mh.d dVar = this.f118232b;
            dVar.w(bundle2);
            r0.b(bundle2, bundle);
            this.f118233c = (View) rg.d.n3(dVar.m());
            ViewGroup viewGroup = this.f118231a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f118233c);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }
}
