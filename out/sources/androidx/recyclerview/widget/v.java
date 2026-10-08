package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f13423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f13424b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13425a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13429e;

        a() {
        }

        void a(int i15) {
            this.f13425a = i15 | this.f13425a;
        }

        boolean b() {
            int i15 = this.f13425a;
            if ((i15 & 7) != 0 && (i15 & c(this.f13428d, this.f13426b)) == 0) {
                return false;
            }
            int i16 = this.f13425a;
            if ((i16 & 112) != 0 && (i16 & (c(this.f13428d, this.f13427c) << 4)) == 0) {
                return false;
            }
            int i17 = this.f13425a;
            if ((i17 & 1792) != 0 && (i17 & (c(this.f13429e, this.f13426b) << 8)) == 0) {
                return false;
            }
            int i18 = this.f13425a;
            return (i18 & 28672) == 0 || (i18 & (c(this.f13429e, this.f13427c) << 12)) != 0;
        }

        int c(int i15, int i16) {
            if (i15 > i16) {
                return 1;
            }
            return i15 == i16 ? 2 : 4;
        }

        void d() {
            this.f13425a = 0;
        }

        void e(int i15, int i16, int i17, int i18) {
            this.f13426b = i15;
            this.f13427c = i16;
            this.f13428d = i17;
            this.f13429e = i18;
        }
    }

    interface b {
        View a(int i15);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.f13423a = bVar;
    }

    View a(int i15, int i16, int i17, int i18) {
        int iC = this.f13423a.c();
        int iD = this.f13423a.d();
        int i19 = i16 > i15 ? 1 : -1;
        View view = null;
        while (i15 != i16) {
            View viewA = this.f13423a.a(i15);
            this.f13424b.e(iC, iD, this.f13423a.b(viewA), this.f13423a.e(viewA));
            if (i17 != 0) {
                this.f13424b.d();
                this.f13424b.a(i17);
                if (this.f13424b.b()) {
                    return viewA;
                }
            }
            if (i18 != 0) {
                this.f13424b.d();
                this.f13424b.a(i18);
                if (this.f13424b.b()) {
                    view = viewA;
                }
            }
            i15 += i19;
        }
        return view;
    }

    boolean b(View view, int i15) {
        this.f13424b.e(this.f13423a.c(), this.f13423a.d(), this.f13423a.b(view), this.f13423a.e(view));
        if (i15 == 0) {
            return false;
        }
        this.f13424b.d();
        this.f13424b.a(i15);
        return this.f13424b.b();
    }
}
