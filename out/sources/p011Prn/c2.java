package p011Prn;

import a6.b;
import a6.c;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r0.l1;

/* JADX INFO: loaded from: classes.dex */
abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l1<b, MenuItem> f994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1<c, SubMenu> f995c;

    c2(Context context) {
        this.f993a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f994b == null) {
            this.f994b = new l1<>();
        }
        MenuItem menuItem2 = this.f994b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        d2 d2Var = new d2(this.f993a, bVar);
        this.f994b.put(bVar, d2Var);
        return d2Var;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f995c == null) {
            this.f995c = new l1<>();
        }
        SubMenu subMenu2 = this.f995c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g2 g2Var = new g2(this.f993a, cVar);
        this.f995c.put(cVar, g2Var);
        return g2Var;
    }

    final void e() {
        l1<b, MenuItem> l1Var = this.f994b;
        if (l1Var != null) {
            l1Var.clear();
        }
        l1<c, SubMenu> l1Var2 = this.f995c;
        if (l1Var2 != null) {
            l1Var2.clear();
        }
    }

    final void f(int i15) {
        if (this.f994b == null) {
            return;
        }
        int i16 = 0;
        while (i16 < this.f994b.getSize()) {
            if (this.f994b.f(i16).getGroupId() == i15) {
                this.f994b.h(i16);
                i16--;
            }
            i16++;
        }
    }

    final void g(int i15) {
        if (this.f994b == null) {
            return;
        }
        for (int i16 = 0; i16 < this.f994b.getSize(); i16++) {
            if (this.f994b.f(i16).getItemId() == i15) {
                this.f994b.h(i16);
                return;
            }
        }
    }
}
