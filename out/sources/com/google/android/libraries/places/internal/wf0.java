package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f34152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34154c;

    public wf0(List list) {
        this.f34152a = list;
    }

    public final boolean a() {
        return this.f34153b < this.f34152a.size();
    }

    public final boolean b() {
        return this.f34153b == 0 && this.f34154c == 0;
    }

    public final void c() {
        p50 p50Var = (p50) this.f34152a.get(this.f34153b);
        int i15 = this.f34154c + 1;
        this.f34154c = i15;
        if (i15 >= p50Var.a().size()) {
            this.f34153b++;
            this.f34154c = 0;
        }
    }

    public final void d() {
        this.f34153b = 0;
        this.f34154c = 0;
    }

    public final SocketAddress e() {
        return (SocketAddress) ((p50) this.f34152a.get(this.f34153b)).a().get(this.f34154c);
    }

    public final b40 f() {
        return ((p50) this.f34152a.get(this.f34153b)).b();
    }

    public final void g(List list) {
        this.f34152a = list;
        d();
    }

    public final boolean h(SocketAddress socketAddress) {
        for (int i15 = 0; i15 < this.f34152a.size(); i15++) {
            int iIndexOf = ((p50) this.f34152a.get(i15)).a().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f34153b = i15;
                this.f34154c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
