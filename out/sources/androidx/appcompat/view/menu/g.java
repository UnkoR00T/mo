package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.sentry.android.core.c2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p007NuL.t;
import p082nUL.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a6.b {
    private View A;
    private j6.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f8503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f8504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f8505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f8506h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f8508j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f8510l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f8512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f8513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f8514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f8515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f8516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f8517s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8524z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8507i = PKIFailureInfo.certConfirmed;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8509k = PKIFailureInfo.certConfirmed;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8511m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f8518t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f8519u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8520v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8521w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8522x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f8523y = 16;
    private boolean D = false;

    class a implements j6.b.InterfaceC2340b {
        a() {
        }

        @Override // j6.b.InterfaceC2340b
        public void onActionProviderVisibilityChanged(boolean z15) {
            g gVar = g.this;
            gVar.f8512n.K(gVar);
        }
    }

    g(e eVar, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19) {
        this.f8512n = eVar;
        this.f8499a = i16;
        this.f8500b = i15;
        this.f8501c = i17;
        this.f8502d = i18;
        this.f8503e = charSequence;
        this.f8524z = i19;
    }

    private static void d(StringBuilder sb5, int i15, int i16, String str) {
        if ((i15 & i16) == i16) {
            sb5.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f8522x && (this.f8520v || this.f8521w)) {
            drawable = y5.a.r(drawable).mutate();
            if (this.f8520v) {
                y5.a.o(drawable, this.f8518t);
            }
            if (this.f8521w) {
                y5.a.p(drawable, this.f8519u);
            }
            this.f8522x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f8512n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f8524z & 4) == 4;
    }

    @Override // a6.b
    public a6.b a(j6.b bVar) {
        j6.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f8512n.L(true);
        j6.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // a6.b
    public j6.b b() {
        return this.B;
    }

    public void c() {
        this.f8512n.J(this);
    }

    @Override // a6.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f8524z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8512n.f(this);
        }
        return false;
    }

    @Override // a6.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8512n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f8502d;
    }

    char g() {
        return this.f8512n.H() ? this.f8508j : this.f8506h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a6.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        j6.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // a6.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8509k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8508j;
    }

    @Override // a6.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8516r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8500b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f8510l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f8511m == 0) {
            return null;
        }
        Drawable drawableB = y.b(this.f8512n.u(), this.f8511m);
        this.f8511m = 0;
        this.f8510l = drawableB;
        return e(drawableB);
    }

    @Override // a6.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8518t;
    }

    @Override // a6.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8519u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8505g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f8499a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // a6.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8507i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8506h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8501c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f8513o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f8503e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8504f;
        return charSequence != null ? charSequence : this.f8503e;
    }

    @Override // a6.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8517s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f8512n.u().getResources();
        StringBuilder sb5 = new StringBuilder();
        if (ViewConfiguration.get(this.f8512n.u()).hasPermanentMenuKey()) {
            sb5.append(resources.getString(t.f431k));
        }
        int i15 = this.f8512n.H() ? this.f8509k : this.f8507i;
        d(sb5, i15, PKIFailureInfo.notAuthorized, resources.getString(t.f427g));
        d(sb5, i15, PKIFailureInfo.certConfirmed, resources.getString(t.f423c));
        d(sb5, i15, 2, resources.getString(t.f422b));
        d(sb5, i15, 1, resources.getString(t.f428h));
        d(sb5, i15, 4, resources.getString(t.f430j));
        d(sb5, i15, 8, resources.getString(t.f426f));
        if (cG == '\b') {
            sb5.append(resources.getString(t.f424d));
        } else if (cG == '\n') {
            sb5.append(resources.getString(t.f425e));
        } else if (cG != ' ') {
            sb5.append(cG);
        } else {
            sb5.append(resources.getString(t.f429i));
        }
        return sb5.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f8513o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // a6.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8523y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8523y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8523y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        j6.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            return (this.f8523y & 8) == 0;
        }
        return (this.f8523y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        j6.b bVar;
        if ((this.f8524z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f8515q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f8512n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f8514p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f8505g != null) {
            try {
                this.f8512n.u().startActivity(this.f8505g);
                return true;
            } catch (ActivityNotFoundException e15) {
                c2.f("MenuItemImpl", "Can't find activity to handle intent; ignoring", e15);
            }
        }
        j6.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f8523y & 32) == 32;
    }

    public boolean m() {
        return (this.f8523y & 4) != 0;
    }

    public boolean n() {
        return (this.f8524z & 1) == 1;
    }

    public boolean o() {
        return (this.f8524z & 2) == 2;
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a6.b setActionView(int i15) {
        Context contextU = this.f8512n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i15, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a6.b setActionView(View view) {
        int i15;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i15 = this.f8499a) > 0) {
            view.setId(i15);
        }
        this.f8512n.J(this);
        return this;
    }

    public void r(boolean z15) {
        this.D = z15;
        this.f8512n.L(false);
    }

    void s(boolean z15) {
        int i15 = this.f8523y;
        int i16 = (z15 ? 2 : 0) | (i15 & (-3));
        this.f8523y = i16;
        if (i15 != i16) {
            this.f8512n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15) {
        if (this.f8508j == c15) {
            return this;
        }
        this.f8508j = Character.toLowerCase(c15);
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z15) {
        int i15 = this.f8523y;
        int i16 = (z15 ? 1 : 0) | (i15 & (-2));
        this.f8523y = i16;
        if (i15 != i16) {
            this.f8512n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z15) {
        if ((this.f8523y & 4) != 0) {
            this.f8512n.U(this);
            return this;
        }
        s(z15);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z15) {
        if (z15) {
            this.f8523y |= 16;
        } else {
            this.f8523y &= -17;
        }
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8511m = 0;
        this.f8510l = drawable;
        this.f8522x = true;
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8518t = colorStateList;
        this.f8520v = true;
        this.f8522x = true;
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8519u = mode;
        this.f8521w = true;
        this.f8522x = true;
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8505g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c15) {
        if (this.f8506h == c15) {
            return this;
        }
        this.f8506h = c15;
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8515q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16) {
        this.f8506h = c15;
        this.f8508j = Character.toLowerCase(c16);
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public void setShowAsAction(int i15) {
        int i16 = i15 & 3;
        if (i16 != 0 && i16 != 1 && i16 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8524z = i15;
        this.f8512n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8503e = charSequence;
        this.f8512n.L(false);
        m mVar = this.f8513o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8504f = charSequence;
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z15) {
        if (y(z15)) {
            this.f8512n.K(this);
        }
        return this;
    }

    public void t(boolean z15) {
        this.f8523y = (z15 ? 4 : 0) | (this.f8523y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f8503e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z15) {
        if (z15) {
            this.f8523y |= 32;
        } else {
            this.f8523y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // a6.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a6.b setShowAsActionFlags(int i15) {
        setShowAsAction(i15);
        return this;
    }

    public void x(m mVar) {
        this.f8513o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z15) {
        int i15 = this.f8523y;
        int i16 = (z15 ? 0 : 8) | (i15 & (-9));
        this.f8523y = i16;
        return i15 != i16;
    }

    public boolean z() {
        return this.f8512n.A();
    }

    @Override // a6.b, android.view.MenuItem
    public a6.b setContentDescription(CharSequence charSequence) {
        this.f8516r = charSequence;
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public a6.b setTooltipText(CharSequence charSequence) {
        this.f8517s = charSequence;
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c15, int i15) {
        if (this.f8508j == c15 && this.f8509k == i15) {
            return this;
        }
        this.f8508j = Character.toLowerCase(c15);
        this.f8509k = KeyEvent.normalizeMetaState(i15);
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c15, int i15) {
        if (this.f8506h == c15 && this.f8507i == i15) {
            return this;
        }
        this.f8506h = c15;
        this.f8507i = KeyEvent.normalizeMetaState(i15);
        this.f8512n.L(false);
        return this;
    }

    @Override // a6.b, android.view.MenuItem
    public MenuItem setShortcut(char c15, char c16, int i15, int i16) {
        this.f8506h = c15;
        this.f8507i = KeyEvent.normalizeMetaState(i15);
        this.f8508j = Character.toLowerCase(c16);
        this.f8509k = KeyEvent.normalizeMetaState(i16);
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i15) {
        this.f8510l = null;
        this.f8511m = i15;
        this.f8522x = true;
        this.f8512n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i15) {
        return setTitle(this.f8512n.u().getString(i15));
    }
}
