package androidx.fragment.app;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a extends c0 implements FragmentManager.j, FragmentManager.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final FragmentManager f12385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f12386u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f12387v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f12388w;

    a(FragmentManager fragmentManager) {
        super(fragmentManager.w0(), fragmentManager.y0() != null ? fragmentManager.y0().getContext().getClassLoader() : null);
        this.f12387v = -1;
        this.f12388w = false;
        this.f12385t = fragmentManager;
    }

    public void A(String str, PrintWriter printWriter, boolean z15) {
        String str2;
        if (z15) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f12427k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f12387v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f12386u);
            if (this.f12424h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f12424h));
            }
            if (this.f12420d != 0 || this.f12421e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12420d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12421e));
            }
            if (this.f12422f != 0 || this.f12423g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12422f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12423g));
            }
            if (this.f12428l != 0 || this.f12429m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12428l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f12429m);
            }
            if (this.f12430n != 0 || this.f12431o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12430n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f12431o);
            }
        }
        if (this.f12419c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f12419c.size();
        for (int i15 = 0; i15 < size; i15++) {
            c0.a aVar = this.f12419c.get(i15);
            switch (aVar.f12436a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f12436a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i15);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f12437b);
            if (z15) {
                if (aVar.f12439d != 0 || aVar.f12440e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f12439d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f12440e));
                }
                if (aVar.f12441f != 0 || aVar.f12442g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f12441f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f12442g));
                }
            }
        }
    }

    void B() {
        int size = this.f12419c.size();
        for (int i15 = 0; i15 < size; i15++) {
            c0.a aVar = this.f12419c.get(i15);
            o oVar = aVar.f12437b;
            if (oVar != null) {
                oVar.f12604q = this.f12388w;
                oVar.K1(false);
                oVar.J1(this.f12424h);
                oVar.M1(this.f12432p, this.f12433q);
            }
            switch (aVar.f12436a) {
                case 1:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, false);
                    this.f12385t.j(oVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f12436a);
                case 3:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.i1(oVar);
                    break;
                case 4:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.I0(oVar);
                    break;
                case 5:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, false);
                    this.f12385t.v1(oVar);
                    break;
                case 6:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.x(oVar);
                    break;
                case 7:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, false);
                    this.f12385t.n(oVar);
                    break;
                case 8:
                    this.f12385t.t1(oVar);
                    break;
                case 9:
                    this.f12385t.t1(null);
                    break;
                case 10:
                    aVar.f12443h = oVar.f12612u0;
                    this.f12385t.s1(oVar, aVar.f12444i);
                    break;
            }
        }
    }

    void C() {
        for (int size = this.f12419c.size() - 1; size >= 0; size--) {
            c0.a aVar = this.f12419c.get(size);
            o oVar = aVar.f12437b;
            if (oVar != null) {
                oVar.f12604q = this.f12388w;
                oVar.K1(true);
                oVar.J1(FragmentManager.m1(this.f12424h));
                oVar.M1(this.f12433q, this.f12432p);
            }
            switch (aVar.f12436a) {
                case 1:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, true);
                    this.f12385t.i1(oVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f12436a);
                case 3:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.j(oVar);
                    break;
                case 4:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.v1(oVar);
                    break;
                case 5:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, true);
                    this.f12385t.I0(oVar);
                    break;
                case 6:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.n(oVar);
                    break;
                case 7:
                    oVar.E1(aVar.f12439d, aVar.f12440e, aVar.f12441f, aVar.f12442g);
                    this.f12385t.q1(oVar, true);
                    this.f12385t.x(oVar);
                    break;
                case 8:
                    this.f12385t.t1(null);
                    break;
                case 9:
                    this.f12385t.t1(oVar);
                    break;
                case 10:
                    aVar.f12444i = oVar.f12612u0;
                    this.f12385t.s1(oVar, aVar.f12443h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    o D(ArrayList<o> arrayList, o oVar) {
        o oVar2 = oVar;
        int i15 = 0;
        while (i15 < this.f12419c.size()) {
            c0.a aVar = this.f12419c.get(i15);
            int i16 = aVar.f12436a;
            if (i16 == 1) {
                arrayList.add(aVar.f12437b);
            } else if (i16 == 2) {
                o oVar3 = aVar.f12437b;
                int i17 = oVar3.D;
                boolean z15 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o oVar4 = arrayList.get(size);
                    if (oVar4.D == i17) {
                        if (oVar4 == oVar3) {
                            z15 = true;
                        } else {
                            if (oVar4 == oVar2) {
                                this.f12419c.add(i15, new c0.a(9, oVar4, true));
                                i15++;
                                oVar2 = null;
                            }
                            c0.a aVar2 = new c0.a(3, oVar4, true);
                            aVar2.f12439d = aVar.f12439d;
                            aVar2.f12441f = aVar.f12441f;
                            aVar2.f12440e = aVar.f12440e;
                            aVar2.f12442g = aVar.f12442g;
                            this.f12419c.add(i15, aVar2);
                            arrayList.remove(oVar4);
                            i15++;
                        }
                    }
                }
                if (z15) {
                    this.f12419c.remove(i15);
                    i15--;
                } else {
                    aVar.f12436a = 1;
                    aVar.f12438c = true;
                    arrayList.add(oVar3);
                }
            } else if (i16 == 3 || i16 == 6) {
                arrayList.remove(aVar.f12437b);
                o oVar5 = aVar.f12437b;
                if (oVar5 == oVar2) {
                    this.f12419c.add(i15, new c0.a(9, oVar5));
                    i15++;
                    oVar2 = null;
                }
            } else if (i16 == 7) {
                arrayList.add(aVar.f12437b);
            } else if (i16 == 8) {
                this.f12419c.add(i15, new c0.a(9, oVar2, true));
                aVar.f12438c = true;
                i15++;
                oVar2 = aVar.f12437b;
            }
            i15++;
        }
        return oVar2;
    }

    public void E() {
        if (this.f12435s != null) {
            for (int i15 = 0; i15 < this.f12435s.size(); i15++) {
                this.f12435s.get(i15).run();
            }
            this.f12435s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    o F(ArrayList<o> arrayList, o oVar) {
        for (int size = this.f12419c.size() - 1; size >= 0; size--) {
            c0.a aVar = this.f12419c.get(size);
            int i15 = aVar.f12436a;
            if (i15 == 1) {
                arrayList.remove(aVar.f12437b);
            } else if (i15 != 3) {
                switch (i15) {
                    case 6:
                        arrayList.add(aVar.f12437b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f12437b);
                        break;
                    case 8:
                        oVar = null;
                        break;
                    case 9:
                        oVar = aVar.f12437b;
                        break;
                    case 10:
                        aVar.f12444i = aVar.f12443h;
                        break;
                }
            } else {
                arrayList.add(aVar.f12437b);
            }
        }
        return oVar;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.L0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f12425i) {
            return true;
        }
        this.f12385t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public String getName() {
        return this.f12427k;
    }

    @Override // androidx.fragment.app.c0
    public int h() {
        return y(false, true);
    }

    @Override // androidx.fragment.app.c0
    public int i() {
        return y(true, true);
    }

    @Override // androidx.fragment.app.c0
    public void j() {
        l();
        this.f12385t.c0(this, false);
    }

    @Override // androidx.fragment.app.c0
    public void k() {
        l();
        this.f12385t.c0(this, true);
    }

    @Override // androidx.fragment.app.c0
    void m(int i15, o oVar, String str, int i16) {
        super.m(i15, oVar, str, i16);
        oVar.f12619y = this.f12385t;
    }

    @Override // androidx.fragment.app.c0
    public boolean n() {
        return this.f12419c.isEmpty();
    }

    @Override // androidx.fragment.app.c0
    public c0 o(o oVar) {
        FragmentManager fragmentManager = oVar.f12619y;
        if (fragmentManager == null || fragmentManager == this.f12385t) {
            return super.o(oVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.c0
    public c0 t(o oVar, androidx.lifecycle.j.b bVar) {
        if (oVar.f12619y != this.f12385t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f12385t);
        }
        if (bVar == androidx.lifecycle.j.b.INITIALIZED && oVar.f12589a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != androidx.lifecycle.j.b.DESTROYED) {
            return super.t(oVar, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(128);
        sb5.append("BackStackEntry{");
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f12387v >= 0) {
            sb5.append(" #");
            sb5.append(this.f12387v);
        }
        if (this.f12427k != null) {
            sb5.append(" ");
            sb5.append(this.f12427k);
        }
        sb5.append("}");
        return sb5.toString();
    }

    @Override // androidx.fragment.app.c0
    public c0 v(o oVar) {
        FragmentManager fragmentManager = oVar.f12619y;
        if (fragmentManager == null || fragmentManager == this.f12385t) {
            return super.v(oVar);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    void w(int i15) {
        if (this.f12425i) {
            if (FragmentManager.L0(2)) {
                toString();
            }
            int size = this.f12419c.size();
            for (int i16 = 0; i16 < size; i16++) {
                c0.a aVar = this.f12419c.get(i16);
                o oVar = aVar.f12437b;
                if (oVar != null) {
                    oVar.f12617x += i15;
                    if (FragmentManager.L0(2)) {
                        Objects.toString(aVar.f12437b);
                        int i17 = aVar.f12437b.f12617x;
                    }
                }
            }
        }
    }

    void x() {
        int size = this.f12419c.size() - 1;
        while (size >= 0) {
            c0.a aVar = this.f12419c.get(size);
            if (aVar.f12438c) {
                if (aVar.f12436a == 8) {
                    aVar.f12438c = false;
                    this.f12419c.remove(size - 1);
                    size--;
                } else {
                    int i15 = aVar.f12437b.D;
                    aVar.f12436a = 2;
                    aVar.f12438c = false;
                    for (int i16 = size - 1; i16 >= 0; i16--) {
                        c0.a aVar2 = this.f12419c.get(i16);
                        if (aVar2.f12438c && aVar2.f12437b.D == i15) {
                            this.f12419c.remove(i16);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int y(boolean z15, boolean z16) {
        if (this.f12386u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.L0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
            z("  ", printWriter);
            printWriter.close();
        }
        this.f12386u = true;
        if (this.f12425i) {
            this.f12387v = this.f12385t.l();
        } else {
            this.f12387v = -1;
        }
        if (z16) {
            this.f12385t.Z(this, z15);
        }
        return this.f12387v;
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}
