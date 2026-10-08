package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f8321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f8322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f8323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8325h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f8326j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z15) {
        this.f8320c = context;
        this.f8321d = actionBarContextView;
        this.f8322e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f8326j = eVarT;
        eVarT.S(this);
        this.f8325h = z15;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f8322e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f8321d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f8324g) {
            return;
        }
        this.f8324g = true;
        this.f8322e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f8323f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f8326j;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f8321d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f8321d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f8321d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f8322e.d(this, this.f8326j);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f8321d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f8321d.setCustomView(view);
        this.f8323f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i15) {
        o(this.f8320c.getString(i15));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f8321d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i15) {
        r(this.f8320c.getString(i15));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f8321d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z15) {
        super.s(z15);
        this.f8321d.setTitleOptional(z15);
    }
}
