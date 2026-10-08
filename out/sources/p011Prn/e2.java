package p011Prn;

import a6.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class e2 extends c2 implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f1006d;

    public e2(Context context, a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1006d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f1006d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i15, int i16, int i17, ComponentName componentName, Intent[] intentArr, Intent intent, int i18, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f1006d.addIntentOptions(i15, i16, i17, componentName, intentArr, intent, i18, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i19 = 0; i19 < length; i19++) {
                menuItemArr[i19] = c(menuItemArr2[i19]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f1006d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f1006d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1006d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i15) {
        return c(this.f1006d.findItem(i15));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i15) {
        return c(this.f1006d.getItem(i15));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1006d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i15, KeyEvent keyEvent) {
        return this.f1006d.isShortcutKey(i15, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i15, int i16) {
        return this.f1006d.performIdentifierAction(i15, i16);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i15, KeyEvent keyEvent, int i16) {
        return this.f1006d.performShortcut(i15, keyEvent, i16);
    }

    @Override // android.view.Menu
    public void removeGroup(int i15) {
        f(i15);
        this.f1006d.removeGroup(i15);
    }

    @Override // android.view.Menu
    public void removeItem(int i15) {
        g(i15);
        this.f1006d.removeItem(i15);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i15, boolean z15, boolean z16) {
        this.f1006d.setGroupCheckable(i15, z15, z16);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i15, boolean z15) {
        this.f1006d.setGroupEnabled(i15, z15);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i15, boolean z15) {
        this.f1006d.setGroupVisible(i15, z15);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z15) {
        this.f1006d.setQwertyMode(z15);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1006d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i15) {
        return c(this.f1006d.add(i15));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15) {
        return d(this.f1006d.addSubMenu(i15));
    }

    @Override // android.view.Menu
    public MenuItem add(int i15, int i16, int i17, CharSequence charSequence) {
        return c(this.f1006d.add(i15, i16, i17, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15, int i16, int i17, CharSequence charSequence) {
        return d(this.f1006d.addSubMenu(i15, i16, i17, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i15, int i16, int i17, int i18) {
        return c(this.f1006d.add(i15, i16, i17, i18));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15, int i16, int i17, int i18) {
        return d(this.f1006d.addSubMenu(i15, i16, i17, i18));
    }
}
