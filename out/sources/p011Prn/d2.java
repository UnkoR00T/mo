package p011Prn;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import io.sentry.android.core.c2;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class d2 extends c2 implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a6.b f996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f997e;

    private class a extends j6.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j6.b.InterfaceC2340b f998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f999e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f999e = actionProvider;
        }

        @Override // j6.b
        public boolean a() {
            return this.f999e.hasSubMenu();
        }

        @Override // j6.b
        public boolean b() {
            return this.f999e.isVisible();
        }

        @Override // j6.b
        public View c() {
            return this.f999e.onCreateActionView();
        }

        @Override // j6.b
        public View d(MenuItem menuItem) {
            return this.f999e.onCreateActionView(menuItem);
        }

        @Override // j6.b
        public boolean e() {
            return this.f999e.onPerformDefaultAction();
        }

        @Override // j6.b
        public void f(SubMenu subMenu) {
            this.f999e.onPrepareSubMenu(d2.this.d(subMenu));
        }

        @Override // j6.b
        public boolean g() {
            return this.f999e.overridesItemVisibility();
        }

        @Override // j6.b
        public void j(j6.b.InterfaceC2340b interfaceC2340b) {
            this.f998d = interfaceC2340b;
            this.f999e.setVisibilityListener(interfaceC2340b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z15) {
            j6.b.InterfaceC2340b interfaceC2340b = this.f998d;
            if (interfaceC2340b != null) {
                interfaceC2340b.onActionProviderVisibilityChanged(z15);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f1001a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f1001a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f1001a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f1001a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f1001a.onActionViewExpanded();
        }
    }

    private class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f1002a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1002a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1002a.onMenuItemActionCollapse(d2.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1002a.onMenuItemActionExpand(d2.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f1004a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1004a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1004a.onMenuItemClick(d2.this.c(menuItem));
        }
    }

    public d2(Context context, a6.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f996d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f996d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f996d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        j6.b bVarB = this.f996d.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).f999e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f996d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f996d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f996d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f996d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f996d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f996d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f996d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f996d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f996d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f996d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f996d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f996d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f996d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f996d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f996d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f996d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f996d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f996d.getTooltipText();
    }

    public void h(boolean z15) {
        try {
            if (this.f997e == null) {
                this.f997e = this.f996d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f997e.invoke(this.f996d, Boolean.valueOf(z15));
        } catch (Exception e15) {
            c2.h("MenuItemWrapper", "Error while calling setExclusiveCheckable", e15);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f996d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f996d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f996d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f996d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f996d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f996d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f993a, actionProvider);
        a6.b bVar = this.f996d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f996d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15) {
        this.f996d.setAlphabeticShortcut(c15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z15) {
        this.f996d.setCheckable(z15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z15) {
        this.f996d.setChecked(z15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f996d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z15) {
        this.f996d.setEnabled(z15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f996d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f996d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f996d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f996d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c15) {
        this.f996d.setNumericShortcut(c15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f996d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f996d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16) {
        this.f996d.setShortcut(c15, c16);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i15) {
        this.f996d.setShowAsAction(i15);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i15) {
        this.f996d.setShowAsActionFlags(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f996d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f996d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f996d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z15) {
        return this.f996d.setVisible(z15);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15, int i15) {
        this.f996d.setAlphabeticShortcut(c15, i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i15) {
        this.f996d.setIcon(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c15, int i15) {
        this.f996d.setNumericShortcut(c15, i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16, int i15, int i16) {
        this.f996d.setShortcut(c15, c16, i15, i16);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i15) {
        this.f996d.setTitle(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i15) {
        this.f996d.setActionView(i15);
        View actionView = this.f996d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f996d.setActionView(new b(actionView));
        }
        return this;
    }
}
