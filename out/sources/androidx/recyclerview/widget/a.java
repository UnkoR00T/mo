package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i6.f<b> f13214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f13215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<b> f13216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0276a f13217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f13218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f13219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o f13220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13221h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0276a {
        void a(int i15, int i16);

        void b(b bVar);

        void c(b bVar);

        void d(int i15, int i16);

        void e(int i15, int i16, Object obj);

        RecyclerView.f0 f(int i15);

        void g(int i15, int i16);

        void h(int i15, int i16);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f13224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13225d;

        b(int i15, int i16, int i17, Object obj) {
            this.f13222a = i15;
            this.f13223b = i16;
            this.f13225d = i17;
            this.f13224c = obj;
        }

        String a() {
            int i15 = this.f13222a;
            if (i15 == 1) {
                return "add";
            }
            if (i15 == 2) {
                return "rm";
            }
            if (i15 != 4) {
                return i15 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i15 = this.f13222a;
            if (i15 != bVar.f13222a) {
                return false;
            }
            if (i15 == 8 && Math.abs(this.f13225d - this.f13223b) == 1 && this.f13225d == bVar.f13223b && this.f13223b == bVar.f13225d) {
                return true;
            }
            if (this.f13225d != bVar.f13225d || this.f13223b != bVar.f13223b) {
                return false;
            }
            Object obj2 = this.f13224c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f13224c)) {
                    return false;
                }
            } else if (bVar.f13224c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f13222a * 31) + this.f13223b) * 31) + this.f13225d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f13223b + "c:" + this.f13225d + ",p:" + this.f13224c + "]";
        }
    }

    a(InterfaceC0276a interfaceC0276a) {
        this(interfaceC0276a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z15;
        byte b15;
        int i15 = bVar.f13223b;
        int i16 = bVar.f13225d + i15;
        byte b16 = -1;
        int i17 = i15;
        int i18 = 0;
        while (i17 < i16) {
            if (this.f13217d.f(i17) != null || h(i17)) {
                if (b16 == 0) {
                    k(a(2, i15, i18, null));
                    z15 = true;
                } else {
                    z15 = false;
                }
                b15 = 1;
            } else {
                if (b16 == 1) {
                    v(a(2, i15, i18, null));
                    z15 = true;
                } else {
                    z15 = false;
                }
                b15 = 0;
            }
            if (z15) {
                i17 -= i18;
                i16 -= i18;
                i18 = 1;
            } else {
                i18++;
            }
            i17++;
            b16 = b15;
        }
        if (i18 != bVar.f13225d) {
            b(bVar);
            bVar = a(2, i15, i18, null);
        }
        if (b16 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i15 = bVar.f13223b;
        int i16 = bVar.f13225d + i15;
        int i17 = 0;
        byte b15 = -1;
        int i18 = i15;
        while (i15 < i16) {
            if (this.f13217d.f(i15) != null || h(i15)) {
                if (b15 == 0) {
                    k(a(4, i18, i17, bVar.f13224c));
                    i18 = i15;
                    i17 = 0;
                }
                b15 = 1;
            } else {
                if (b15 == 1) {
                    v(a(4, i18, i17, bVar.f13224c));
                    i18 = i15;
                    i17 = 0;
                }
                b15 = 0;
            }
            i17++;
            i15++;
        }
        if (i17 != bVar.f13225d) {
            Object obj = bVar.f13224c;
            b(bVar);
            bVar = a(4, i18, i17, obj);
        }
        if (b15 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i15) {
        int size = this.f13216c.size();
        for (int i16 = 0; i16 < size; i16++) {
            b bVar = this.f13216c.get(i16);
            int i17 = bVar.f13222a;
            if (i17 == 8) {
                if (n(bVar.f13225d, i16 + 1) == i15) {
                    return true;
                }
            } else if (i17 == 1) {
                int i18 = bVar.f13223b;
                int i19 = bVar.f13225d + i18;
                while (i18 < i19) {
                    if (n(i18, i16 + 1) == i15) {
                        return true;
                    }
                    i18++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i15;
        int i16 = bVar.f13222a;
        if (i16 == 1 || i16 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f13223b, i16);
        int i17 = bVar.f13223b;
        int i18 = bVar.f13222a;
        if (i18 == 2) {
            i15 = 0;
        } else {
            if (i18 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i15 = 1;
        }
        int i19 = 1;
        for (int i25 = 1; i25 < bVar.f13225d; i25++) {
            int iZ2 = z(bVar.f13223b + (i15 * i25), bVar.f13222a);
            int i26 = bVar.f13222a;
            if (i26 == 2 ? iZ2 != iZ : !(i26 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i26, iZ, i19, bVar.f13224c);
                l(bVarA, i17);
                b(bVarA);
                if (bVar.f13222a == 4) {
                    i17 += i19;
                }
                i19 = 1;
                iZ = iZ2;
            } else {
                i19++;
            }
        }
        Object obj = bVar.f13224c;
        b(bVar);
        if (i19 > 0) {
            b bVarA2 = a(bVar.f13222a, iZ, i19, obj);
            l(bVarA2, i17);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f13216c.add(bVar);
        int i15 = bVar.f13222a;
        if (i15 == 1) {
            this.f13217d.g(bVar.f13223b, bVar.f13225d);
            return;
        }
        if (i15 == 2) {
            this.f13217d.d(bVar.f13223b, bVar.f13225d);
            return;
        }
        if (i15 == 4) {
            this.f13217d.e(bVar.f13223b, bVar.f13225d, bVar.f13224c);
        } else {
            if (i15 == 8) {
                this.f13217d.a(bVar.f13223b, bVar.f13225d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i15, int i16) {
        int i17;
        int i18;
        for (int size = this.f13216c.size() - 1; size >= 0; size--) {
            b bVar = this.f13216c.get(size);
            int i19 = bVar.f13222a;
            if (i19 == 8) {
                int i25 = bVar.f13223b;
                int i26 = bVar.f13225d;
                if (i25 < i26) {
                    i18 = i25;
                    i17 = i26;
                } else {
                    i17 = i25;
                    i18 = i26;
                }
                if (i15 < i18 || i15 > i17) {
                    if (i15 < i25) {
                        if (i16 == 1) {
                            bVar.f13223b = i25 + 1;
                            bVar.f13225d = i26 + 1;
                        } else if (i16 == 2) {
                            bVar.f13223b = i25 - 1;
                            bVar.f13225d = i26 - 1;
                        }
                    }
                } else if (i18 == i25) {
                    if (i16 == 1) {
                        bVar.f13225d = i26 + 1;
                    } else if (i16 == 2) {
                        bVar.f13225d = i26 - 1;
                    }
                    i15++;
                } else {
                    if (i16 == 1) {
                        bVar.f13223b = i25 + 1;
                    } else if (i16 == 2) {
                        bVar.f13223b = i25 - 1;
                    }
                    i15--;
                }
            } else {
                int i27 = bVar.f13223b;
                if (i27 <= i15) {
                    if (i19 == 1) {
                        i15 -= bVar.f13225d;
                    } else if (i19 == 2) {
                        i15 += bVar.f13225d;
                    }
                } else if (i16 == 1) {
                    bVar.f13223b = i27 + 1;
                } else if (i16 == 2) {
                    bVar.f13223b = i27 - 1;
                }
            }
        }
        for (int size2 = this.f13216c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f13216c.get(size2);
            if (bVar2.f13222a == 8) {
                int i28 = bVar2.f13225d;
                if (i28 == bVar2.f13223b || i28 < 0) {
                    this.f13216c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f13225d <= 0) {
                this.f13216c.remove(size2);
                b(bVar2);
            }
        }
        return i15;
    }

    @Override // androidx.recyclerview.widget.o.a
    public b a(int i15, int i16, int i17, Object obj) {
        b bVarZ = this.f13214a.z();
        if (bVarZ == null) {
            return new b(i15, i16, i17, obj);
        }
        bVarZ.f13222a = i15;
        bVarZ.f13223b = i16;
        bVarZ.f13225d = i17;
        bVarZ.f13224c = obj;
        return bVarZ;
    }

    @Override // androidx.recyclerview.widget.o.a
    public void b(b bVar) {
        if (this.f13219f) {
            return;
        }
        bVar.f13224c = null;
        this.f13214a.A(bVar);
    }

    public int e(int i15) {
        int size = this.f13215b.size();
        for (int i16 = 0; i16 < size; i16++) {
            b bVar = this.f13215b.get(i16);
            int i17 = bVar.f13222a;
            if (i17 != 1) {
                if (i17 == 2) {
                    int i18 = bVar.f13223b;
                    if (i18 <= i15) {
                        int i19 = bVar.f13225d;
                        if (i18 + i19 > i15) {
                            return -1;
                        }
                        i15 -= i19;
                    } else {
                        continue;
                    }
                } else if (i17 == 8) {
                    int i25 = bVar.f13223b;
                    if (i25 == i15) {
                        i15 = bVar.f13225d;
                    } else {
                        if (i25 < i15) {
                            i15--;
                        }
                        if (bVar.f13225d <= i15) {
                            i15++;
                        }
                    }
                }
            } else if (bVar.f13223b <= i15) {
                i15 += bVar.f13225d;
            }
        }
        return i15;
    }

    void i() {
        int size = this.f13216c.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f13217d.c(this.f13216c.get(i15));
        }
        x(this.f13216c);
        this.f13221h = 0;
    }

    void j() {
        i();
        int size = this.f13215b.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = this.f13215b.get(i15);
            int i16 = bVar.f13222a;
            if (i16 == 1) {
                this.f13217d.c(bVar);
                this.f13217d.g(bVar.f13223b, bVar.f13225d);
            } else if (i16 == 2) {
                this.f13217d.c(bVar);
                this.f13217d.h(bVar.f13223b, bVar.f13225d);
            } else if (i16 == 4) {
                this.f13217d.c(bVar);
                this.f13217d.e(bVar.f13223b, bVar.f13225d, bVar.f13224c);
            } else if (i16 == 8) {
                this.f13217d.c(bVar);
                this.f13217d.a(bVar.f13223b, bVar.f13225d);
            }
            Runnable runnable = this.f13218e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f13215b);
        this.f13221h = 0;
    }

    void l(b bVar, int i15) {
        this.f13217d.b(bVar);
        int i16 = bVar.f13222a;
        if (i16 == 2) {
            this.f13217d.h(i15, bVar.f13225d);
        } else {
            if (i16 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f13217d.e(i15, bVar.f13225d, bVar.f13224c);
        }
    }

    int m(int i15) {
        return n(i15, 0);
    }

    int n(int i15, int i16) {
        int size = this.f13216c.size();
        while (i16 < size) {
            b bVar = this.f13216c.get(i16);
            int i17 = bVar.f13222a;
            if (i17 == 8) {
                int i18 = bVar.f13223b;
                if (i18 == i15) {
                    i15 = bVar.f13225d;
                } else {
                    if (i18 < i15) {
                        i15--;
                    }
                    if (bVar.f13225d <= i15) {
                        i15++;
                    }
                }
            } else {
                int i19 = bVar.f13223b;
                if (i19 > i15) {
                    continue;
                } else if (i17 == 2) {
                    int i25 = bVar.f13225d;
                    if (i15 < i19 + i25) {
                        return -1;
                    }
                    i15 -= i25;
                } else if (i17 == 1) {
                    i15 += bVar.f13225d;
                }
            }
            i16++;
        }
        return i15;
    }

    boolean o(int i15) {
        return (i15 & this.f13221h) != 0;
    }

    boolean p() {
        return this.f13215b.size() > 0;
    }

    boolean q() {
        return (this.f13216c.isEmpty() || this.f13215b.isEmpty()) ? false : true;
    }

    boolean r(int i15, int i16, Object obj) {
        if (i16 < 1) {
            return false;
        }
        this.f13215b.add(a(4, i15, i16, obj));
        this.f13221h |= 4;
        return this.f13215b.size() == 1;
    }

    boolean s(int i15, int i16) {
        if (i16 < 1) {
            return false;
        }
        this.f13215b.add(a(1, i15, i16, null));
        this.f13221h |= 1;
        return this.f13215b.size() == 1;
    }

    boolean t(int i15, int i16, int i17) {
        if (i15 == i16) {
            return false;
        }
        if (i17 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f13215b.add(a(8, i15, i16, null));
        this.f13221h |= 8;
        return this.f13215b.size() == 1;
    }

    boolean u(int i15, int i16) {
        if (i16 < 1) {
            return false;
        }
        this.f13215b.add(a(2, i15, i16, null));
        this.f13221h |= 2;
        return this.f13215b.size() == 1;
    }

    void w() {
        this.f13220g.b(this.f13215b);
        int size = this.f13215b.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = this.f13215b.get(i15);
            int i16 = bVar.f13222a;
            if (i16 == 1) {
                c(bVar);
            } else if (i16 == 2) {
                f(bVar);
            } else if (i16 == 4) {
                g(bVar);
            } else if (i16 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f13218e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f13215b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            b(list.get(i15));
        }
        list.clear();
    }

    void y() {
        x(this.f13215b);
        x(this.f13216c);
        this.f13221h = 0;
    }

    a(InterfaceC0276a interfaceC0276a, boolean z15) {
        this.f13214a = new i6.g(30);
        this.f13215b = new ArrayList<>();
        this.f13216c = new ArrayList<>();
        this.f13221h = 0;
        this.f13217d = interfaceC0276a;
        this.f13219f = z15;
        this.f13220g = new o(this);
    }
}
