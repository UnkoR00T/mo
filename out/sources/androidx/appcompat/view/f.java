package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p011Prn.d2;
import p011Prn.e2;
import r0.l1;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f8327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f8328b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f8329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f8330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f8331c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final l1<Menu, Menu> f8332d = new l1<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f8330b = context;
            this.f8329a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f8332d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            e2 e2Var = new e2(this.f8330b, (a6.a) menu);
            this.f8332d.put(menu, e2Var);
            return e2Var;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f8329a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f8329a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f8329a.onActionItemClicked(e(bVar), new d2(this.f8330b, (a6.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f8329a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f8331c.size();
            for (int i15 = 0; i15 < size; i15++) {
                f fVar = this.f8331c.get(i15);
                if (fVar != null && fVar.f8328b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f8330b, bVar);
            this.f8331c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f8327a = context;
        this.f8328b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f8328b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f8328b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new e2(this.f8327a, (a6.a) this.f8328b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f8328b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f8328b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f8328b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f8328b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f8328b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f8328b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f8328b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f8328b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f8328b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f8328b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f8328b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z15) {
        this.f8328b.s(z15);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i15) {
        this.f8328b.n(i15);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i15) {
        this.f8328b.q(i15);
    }
}
