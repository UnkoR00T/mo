package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<o> f12411a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, a0> f12412b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f12413c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y f12414d;

    b0() {
    }

    void A(y yVar) {
        this.f12414d = yVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? this.f12413c.put(str, bundle) : this.f12413c.remove(str);
    }

    void a(o oVar) {
        if (this.f12411a.contains(oVar)) {
            throw new IllegalStateException("Fragment already added: " + oVar);
        }
        synchronized (this.f12411a) {
            this.f12411a.add(oVar);
        }
        oVar.f12601m = true;
    }

    void b() {
        this.f12412b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f12412b.get(str) != null;
    }

    void d(int i15) {
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                a0Var.t(i15);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f12412b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a0 a0Var : this.f12412b.values()) {
                printWriter.print(str);
                if (a0Var != null) {
                    o oVarK = a0Var.k();
                    printWriter.println(oVarK);
                    oVarK.m(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f12411a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i15 = 0; i15 < size; i15++) {
                o oVar = this.f12411a.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(oVar.toString());
            }
        }
    }

    o f(String str) {
        a0 a0Var = this.f12412b.get(str);
        if (a0Var != null) {
            return a0Var.k();
        }
        return null;
    }

    o g(int i15) {
        for (int size = this.f12411a.size() - 1; size >= 0; size--) {
            o oVar = this.f12411a.get(size);
            if (oVar != null && oVar.C == i15) {
                return oVar;
            }
        }
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                o oVarK = a0Var.k();
                if (oVarK.C == i15) {
                    return oVarK;
                }
            }
        }
        return null;
    }

    o h(String str) {
        if (str != null) {
            for (int size = this.f12411a.size() - 1; size >= 0; size--) {
                o oVar = this.f12411a.get(size);
                if (oVar != null && str.equals(oVar.E)) {
                    return oVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                o oVarK = a0Var.k();
                if (str.equals(oVarK.E)) {
                    return oVarK;
                }
            }
        }
        return null;
    }

    o i(String str) {
        o oVarQ;
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null && (oVarQ = a0Var.k().q(str)) != null) {
                return oVarQ;
            }
        }
        return null;
    }

    int j(o oVar) {
        View view;
        View view2;
        ViewGroup viewGroup = oVar.P;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f12411a.indexOf(oVar);
        for (int i15 = iIndexOf - 1; i15 >= 0; i15--) {
            o oVar2 = this.f12411a.get(i15);
            if (oVar2.P == viewGroup && (view2 = oVar2.R) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f12411a.size()) {
                return -1;
            }
            o oVar3 = this.f12411a.get(iIndexOf);
            if (oVar3.P == viewGroup && (view = oVar3.R) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<a0> k() {
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        return arrayList;
    }

    List<o> l() {
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                arrayList.add(a0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap<String, Bundle> m() {
        return this.f12413c;
    }

    a0 n(String str) {
        return this.f12412b.get(str);
    }

    List<o> o() {
        ArrayList arrayList;
        if (this.f12411a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f12411a) {
            arrayList = new ArrayList(this.f12411a);
        }
        return arrayList;
    }

    y p() {
        return this.f12414d;
    }

    Bundle q(String str) {
        return this.f12413c.get(str);
    }

    void r(a0 a0Var) {
        o oVarK = a0Var.k();
        if (c(oVarK.f12594f)) {
            return;
        }
        this.f12412b.put(oVarK.f12594f, a0Var);
        if (oVarK.I) {
            if (oVarK.H) {
                this.f12414d.Z8(oVarK);
            } else {
                this.f12414d.j9(oVarK);
            }
            oVarK.I = false;
        }
        if (FragmentManager.L0(2)) {
            oVarK.toString();
        }
    }

    void s(a0 a0Var) {
        o oVarK = a0Var.k();
        if (oVarK.H) {
            this.f12414d.j9(oVarK);
        }
        if (this.f12412b.get(oVarK.f12594f) == a0Var && this.f12412b.put(oVarK.f12594f, null) != null && FragmentManager.L0(2)) {
            oVarK.toString();
        }
    }

    void t() {
        Iterator<o> it = this.f12411a.iterator();
        while (it.hasNext()) {
            a0 a0Var = this.f12412b.get(it.next().f12594f);
            if (a0Var != null) {
                a0Var.m();
            }
        }
        for (a0 a0Var2 : this.f12412b.values()) {
            if (a0Var2 != null) {
                a0Var2.m();
                o oVarK = a0Var2.k();
                if (oVarK.f12602n && !oVarK.k0()) {
                    if (oVarK.f12604q && !this.f12413c.containsKey(oVarK.f12594f)) {
                        B(oVarK.f12594f, a0Var2.r());
                    }
                    s(a0Var2);
                }
            }
        }
    }

    void u(o oVar) {
        synchronized (this.f12411a) {
            this.f12411a.remove(oVar);
        }
        oVar.f12601m = false;
    }

    void v() {
        this.f12412b.clear();
    }

    void w(List<String> list) {
        this.f12411a.clear();
        if (list != null) {
            for (String str : list) {
                o oVarF = f(str);
                if (oVarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.L0(2)) {
                    oVarF.toString();
                }
                a(oVarF);
            }
        }
    }

    void x(HashMap<String, Bundle> map) {
        this.f12413c.clear();
        this.f12413c.putAll(map);
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f12412b.size());
        for (a0 a0Var : this.f12412b.values()) {
            if (a0Var != null) {
                o oVarK = a0Var.k();
                B(oVarK.f12594f, a0Var.r());
                arrayList.add(oVarK.f12594f);
                if (FragmentManager.L0(2)) {
                    oVarK.toString();
                    Objects.toString(oVarK.f12590b);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.f12411a) {
            try {
                if (this.f12411a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f12411a.size());
                for (o oVar : this.f12411a) {
                    arrayList.add(oVar.f12594f);
                    if (FragmentManager.L0(2)) {
                        oVar.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
