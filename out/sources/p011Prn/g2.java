package p011Prn;

import a6.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class g2 extends e2 implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f1007e;

    g2(Context context, c cVar) {
        super(context, cVar);
        this.f1007e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1007e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f1007e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i15) {
        this.f1007e.setHeaderIcon(i15);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i15) {
        this.f1007e.setHeaderTitle(i15);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1007e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i15) {
        this.f1007e.setIcon(i15);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1007e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1007e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1007e.setIcon(drawable);
        return this;
    }
}
