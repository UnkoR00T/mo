package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f13257a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f13261e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13260d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f13258b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f13259c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f13262a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f13263b;

        a() {
        }

        private void c() {
            if (this.f13263b == null) {
                this.f13263b = new a();
            }
        }

        void a(int i15) {
            if (i15 < 64) {
                this.f13262a &= ~(1 << i15);
                return;
            }
            a aVar = this.f13263b;
            if (aVar != null) {
                aVar.a(i15 - 64);
            }
        }

        int b(int i15) {
            a aVar = this.f13263b;
            if (aVar == null) {
                return i15 >= 64 ? Long.bitCount(this.f13262a) : Long.bitCount(this.f13262a & ((1 << i15) - 1));
            }
            return i15 < 64 ? Long.bitCount(this.f13262a & ((1 << i15) - 1)) : aVar.b(i15 - 64) + Long.bitCount(this.f13262a);
        }

        boolean d(int i15) {
            if (i15 < 64) {
                return (this.f13262a & (1 << i15)) != 0;
            }
            c();
            return this.f13263b.d(i15 - 64);
        }

        void e(int i15, boolean z15) {
            if (i15 >= 64) {
                c();
                this.f13263b.e(i15 - 64, z15);
                return;
            }
            long j15 = this.f13262a;
            boolean z16 = (Long.MIN_VALUE & j15) != 0;
            long j16 = (1 << i15) - 1;
            this.f13262a = ((j15 & (~j16)) << 1) | (j15 & j16);
            if (z15) {
                h(i15);
            } else {
                a(i15);
            }
            if (z16 || this.f13263b != null) {
                c();
                this.f13263b.e(0, z16);
            }
        }

        boolean f(int i15) {
            if (i15 >= 64) {
                c();
                return this.f13263b.f(i15 - 64);
            }
            long j15 = 1 << i15;
            long j16 = this.f13262a;
            boolean z15 = (j16 & j15) != 0;
            long j17 = j16 & (~j15);
            this.f13262a = j17;
            long j18 = j15 - 1;
            this.f13262a = (j17 & j18) | Long.rotateRight((~j18) & j17, 1);
            a aVar = this.f13263b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f13263b.f(0);
            }
            return z15;
        }

        void g() {
            this.f13262a = 0L;
            a aVar = this.f13263b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i15) {
            if (i15 < 64) {
                this.f13262a |= 1 << i15;
            } else {
                c();
                this.f13263b.h(i15 - 64);
            }
        }

        public String toString() {
            if (this.f13263b == null) {
                return Long.toBinaryString(this.f13262a);
            }
            return this.f13263b.toString() + "xx" + Long.toBinaryString(this.f13262a);
        }
    }

    interface b {
        View a(int i15);

        void b(View view);

        int c();

        RecyclerView.f0 d(View view);

        void e(int i15);

        void f(View view, int i15);

        void g();

        int h(View view);

        void i(View view);

        void j(int i15);

        void k(View view, int i15, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.f13257a = bVar;
    }

    private int h(int i15) {
        if (i15 < 0) {
            return -1;
        }
        int iC = this.f13257a.c();
        int i16 = i15;
        while (i16 < iC) {
            int iB = i15 - (i16 - this.f13258b.b(i16));
            if (iB == 0) {
                while (this.f13258b.d(i16)) {
                    i16++;
                }
                return i16;
            }
            i16 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f13259c.add(view);
        this.f13257a.b(view);
    }

    private boolean t(View view) {
        if (!this.f13259c.remove(view)) {
            return false;
        }
        this.f13257a.i(view);
        return true;
    }

    void a(View view, int i15, boolean z15) {
        int iC = i15 < 0 ? this.f13257a.c() : h(i15);
        this.f13258b.e(iC, z15);
        if (z15) {
            l(view);
        }
        this.f13257a.f(view, iC);
    }

    void b(View view, boolean z15) {
        a(view, -1, z15);
    }

    void c(View view, int i15, ViewGroup.LayoutParams layoutParams, boolean z15) {
        int iC = i15 < 0 ? this.f13257a.c() : h(i15);
        this.f13258b.e(iC, z15);
        if (z15) {
            l(view);
        }
        this.f13257a.k(view, iC, layoutParams);
    }

    void d(int i15) {
        int iH = h(i15);
        this.f13258b.f(iH);
        this.f13257a.e(iH);
    }

    View e(int i15) {
        int size = this.f13259c.size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = this.f13259c.get(i16);
            RecyclerView.f0 f0VarD = this.f13257a.d(view);
            if (f0VarD.o() == i15 && !f0VarD.v() && !f0VarD.x()) {
                return view;
            }
        }
        return null;
    }

    View f(int i15) {
        return this.f13257a.a(h(i15));
    }

    int g() {
        return this.f13257a.c() - this.f13259c.size();
    }

    View i(int i15) {
        return this.f13257a.a(i15);
    }

    int j() {
        return this.f13257a.c();
    }

    void k(View view) {
        int iH = this.f13257a.h(view);
        if (iH >= 0) {
            this.f13258b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iH = this.f13257a.h(view);
        if (iH == -1 || this.f13258b.d(iH)) {
            return -1;
        }
        return iH - this.f13258b.b(iH);
    }

    boolean n(View view) {
        return this.f13259c.contains(view);
    }

    void o() {
        this.f13258b.g();
        for (int size = this.f13259c.size() - 1; size >= 0; size--) {
            this.f13257a.i(this.f13259c.get(size));
            this.f13259c.remove(size);
        }
        this.f13257a.g();
    }

    void p(View view) {
        int i15 = this.f13260d;
        if (i15 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i15 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f13260d = 1;
            this.f13261e = view;
            int iH = this.f13257a.h(view);
            if (iH >= 0) {
                if (this.f13258b.f(iH)) {
                    t(view);
                }
                this.f13257a.j(iH);
            }
        } finally {
            this.f13260d = 0;
            this.f13261e = null;
        }
    }

    void q(int i15) {
        int i16 = this.f13260d;
        if (i16 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i16 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i15);
            View viewA = this.f13257a.a(iH);
            if (viewA != null) {
                this.f13260d = 1;
                this.f13261e = viewA;
                if (this.f13258b.f(iH)) {
                    t(viewA);
                }
                this.f13257a.j(iH);
            }
        } finally {
            this.f13260d = 0;
            this.f13261e = null;
        }
    }

    boolean r(View view) {
        int i15 = this.f13260d;
        if (i15 == 1) {
            if (this.f13261e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i15 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f13260d = 2;
            int iH = this.f13257a.h(view);
            if (iH == -1) {
                t(view);
                return true;
            }
            if (!this.f13258b.d(iH)) {
                return false;
            }
            this.f13258b.f(iH);
            t(view);
            this.f13257a.j(iH);
            return true;
        } finally {
            this.f13260d = 0;
        }
    }

    void s(View view) {
        int iH = this.f13257a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f13258b.d(iH)) {
            this.f13258b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f13258b.toString() + ", hidden list:" + this.f13259c.size();
    }
}
