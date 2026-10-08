package p011Prn;

import a6.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y5.a;

/* JADX INFO: loaded from: classes.dex */
public class b2 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f979g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f981i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f987o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f980h = PKIFailureInfo.certConfirmed;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f982j = PKIFailureInfo.certConfirmed;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f988p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f989q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f990r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f991s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f992t = 16;

    public b2(Context context, int i15, int i16, int i17, int i18, CharSequence charSequence) {
        this.f984l = context;
        this.f973a = i16;
        this.f974b = i15;
        this.f975c = i18;
        this.f976d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f983k;
        if (drawable != null) {
            if (this.f990r || this.f991s) {
                Drawable drawableR = a.r(drawable);
                this.f983k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f983k = drawableMutate;
                if (this.f990r) {
                    a.o(drawableMutate, this.f988p);
                }
                if (this.f991s) {
                    a.p(this.f983k, this.f989q);
                }
            }
        }
    }

    @Override // a6.b
    public b a(j6.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a6.b
    public j6.b b() {
        return null;
    }

    @Override // a6.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // a6.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i15) {
        setShowAsAction(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a6.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // a6.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f982j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f981i;
    }

    @Override // a6.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f986n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f974b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f983k;
    }

    @Override // a6.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f988p;
    }

    @Override // a6.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f989q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f978f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f973a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a6.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f980h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f979g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f975c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f976d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f977e;
        return charSequence != null ? charSequence : this.f976d;
    }

    @Override // a6.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f987o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // a6.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f992t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f992t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f992t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f992t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15) {
        this.f981i = Character.toLowerCase(c15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z15) {
        this.f992t = (z15 ? 1 : 0) | (this.f992t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z15) {
        this.f992t = (z15 ? 2 : 0) | (this.f992t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z15) {
        this.f992t = (z15 ? 16 : 0) | (this.f992t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f983k = drawable;
        c();
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f988p = colorStateList;
        this.f990r = true;
        c();
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f989q = mode;
        this.f991s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f978f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c15) {
        this.f979g = c15;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f985m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16) {
        this.f979g = c15;
        this.f981i = Character.toLowerCase(c16);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public void setShowAsAction(int i15) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f976d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f977e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z15) {
        this.f992t = (this.f992t & 8) | (z15 ? 0 : 8);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15, int i15) {
        this.f981i = Character.toLowerCase(c15);
        this.f982j = KeyEvent.normalizeMetaState(i15);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f986n = charSequence;
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c15, int i15) {
        this.f979g = c15;
        this.f980h = KeyEvent.normalizeMetaState(i15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i15) {
        this.f976d = this.f984l.getResources().getString(i15);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f987o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i15) {
        this.f983k = u5.a.f(this.f984l, i15);
        c();
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16, int i15, int i16) {
        this.f979g = c15;
        this.f980h = KeyEvent.normalizeMetaState(i15);
        this.f981i = Character.toLowerCase(c16);
        this.f982j = KeyEvent.normalizeMetaState(i16);
        return this;
    }
}
