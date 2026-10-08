package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import j6.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements a6.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f8470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f8473e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f8481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f8482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f8483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f8484p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f8492x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8494z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8480l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8485q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8486r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8487s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8488t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8489u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f8490v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f8491w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8493y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f8474f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f8475g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8476h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f8477i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f8478j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8479k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f8469a = context;
        this.f8470b = context.getResources();
        c0(true);
    }

    private static int B(int i15) {
        int i16 = ((-65536) & i15) >> 16;
        if (i16 >= 0) {
            int[] iArr = A;
            if (i16 < iArr.length) {
                return (i15 & 65535) | (iArr[i16] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i15, boolean z15) {
        if (i15 < 0 || i15 >= this.f8474f.size()) {
            return;
        }
        this.f8474f.remove(i15);
        if (z15) {
            L(true);
        }
    }

    private void X(int i15, CharSequence charSequence, int i16, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f8484p = view;
            this.f8482n = null;
            this.f8483o = null;
        } else {
            if (i15 > 0) {
                this.f8482n = resourcesC.getText(i15);
            } else if (charSequence != null) {
                this.f8482n = charSequence;
            }
            if (i16 > 0) {
                this.f8483o = u5.a.f(u(), i16);
            } else if (drawable != null) {
                this.f8483o = drawable;
            }
            this.f8484p = null;
        }
        L(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void c0(boolean z15) {
        boolean z16;
        if (z15) {
            z16 = this.f8470b.getConfiguration().keyboard != 1 && o0.j(ViewConfiguration.get(this.f8469a), this.f8469a);
        }
        this.f8472d = z16;
    }

    private g g(int i15, int i16, int i17, int i18, CharSequence charSequence, int i19) {
        return new g(this, i15, i16, i17, i18, charSequence, i19);
    }

    private void i(boolean z15) {
        if (this.f8491w.isEmpty()) {
            return;
        }
        e0();
        for (WeakReference<j> weakReference : this.f8491w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f8491w.remove(weakReference);
            } else {
                jVar.g(z15);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f8491w.isEmpty()) {
            return false;
        }
        boolean zF = jVar != null ? jVar.f(mVar) : false;
        for (WeakReference<j> weakReference : this.f8491w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f8491w.remove(weakReference);
            } else if (!zF) {
                zF = jVar2.f(mVar);
            }
        }
        return zF;
    }

    private static int n(ArrayList<g> arrayList, int i15) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i15) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f8488t;
    }

    Resources C() {
        return this.f8470b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f8476h) {
            return this.f8475g;
        }
        this.f8475g.clear();
        int size = this.f8474f.size();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = this.f8474f.get(i15);
            if (gVar.isVisible()) {
                this.f8475g.add(gVar);
            }
        }
        this.f8476h = false;
        this.f8479k = true;
        return this.f8475g;
    }

    public boolean F() {
        return !this.f8485q;
    }

    public boolean G() {
        return this.f8493y;
    }

    boolean H() {
        return this.f8471c;
    }

    public boolean I() {
        return this.f8472d;
    }

    void J(g gVar) {
        this.f8479k = true;
        L(true);
    }

    void K(g gVar) {
        this.f8476h = true;
        L(true);
    }

    public void L(boolean z15) {
        if (this.f8485q) {
            this.f8486r = true;
            if (z15) {
                this.f8487s = true;
                return;
            }
            return;
        }
        if (z15) {
            this.f8476h = true;
            this.f8479k = true;
        }
        i(z15);
    }

    public boolean M(MenuItem menuItem, int i15) {
        return N(menuItem, null, i15);
    }

    public boolean N(MenuItem menuItem, j jVar, int i15) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        j6.b bVarB = gVar.b();
        boolean z15 = bVarB != null && bVarB.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z15) {
            if ((i15 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i15 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(u(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z15) {
            bVarB.f(mVar);
        }
        boolean zJ = j(mVar, jVar) | zK;
        if (!zJ) {
            e(true);
        }
        return zJ;
    }

    public void P(j jVar) {
        for (WeakReference<j> weakReference : this.f8491w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f8491w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem item = getItem(i15);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i16 = bundle.getInt("android:menu:expandedactionview");
        if (i16 <= 0 || (menuItemFindItem = findItem(i16)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem item = getItem(i15);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f8473e = aVar;
    }

    public e T(int i15) {
        this.f8480l = i15;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f8474f.size();
        e0();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = this.f8474f.get(i15);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    protected e V(int i15) {
        X(0, null, i15, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i15) {
        X(i15, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i15, int i16, int i17, CharSequence charSequence) {
        int iB = B(i17);
        g gVarG = g(i15, i16, i17, iB, charSequence, this.f8480l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f8481m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f8474f;
        arrayList.add(n(arrayList, iB), gVarG);
        L(true);
        return gVarG;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i15, int i16, int i17, ComponentName componentName, Intent[] intentArr, Intent intent, int i18, MenuItem[] menuItemArr) {
        int i19;
        PackageManager packageManager = this.f8469a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i18 & 1) == 0) {
            removeGroup(i15);
        }
        for (int i25 = 0; i25 < size; i25++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i25);
            int i26 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i26 < 0 ? intent : intentArr[i26]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i15, i16, i17, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i19 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i19] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f8469a);
    }

    public void b0(boolean z15) {
        this.f8494z = z15;
    }

    public void c(j jVar, Context context) {
        this.f8491w.add(new WeakReference<>(jVar));
        jVar.j(context, this);
        this.f8479k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f8492x;
        if (gVar != null) {
            f(gVar);
        }
        this.f8474f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f8483o = null;
        this.f8482n = null;
        this.f8484p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f8473e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f8485q = false;
        if (this.f8486r) {
            this.f8486r = false;
            L(this.f8487s);
        }
    }

    public final void e(boolean z15) {
        if (this.f8489u) {
            return;
        }
        this.f8489u = true;
        for (WeakReference<j> weakReference : this.f8491w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f8491w.remove(weakReference);
            } else {
                jVar.c(this, z15);
            }
        }
        this.f8489u = false;
    }

    public void e0() {
        if (this.f8485q) {
            return;
        }
        this.f8485q = true;
        this.f8486r = false;
        this.f8487s = false;
    }

    public boolean f(g gVar) {
        boolean zI = false;
        if (!this.f8491w.isEmpty() && this.f8492x == gVar) {
            e0();
            for (WeakReference<j> weakReference : this.f8491w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zI = jVar.i(this, gVar);
                    if (zI) {
                        break;
                    }
                } else {
                    this.f8491w.remove(weakReference);
                }
            }
            d0();
            if (zI) {
                this.f8492x = null;
            }
        }
        return zI;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i15) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = this.f8474f.get(i16);
            if (gVar.getItemId() == i15) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i15)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i15) {
        return this.f8474f.get(i15);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f8473e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f8494z) {
            return true;
        }
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f8474f.get(i15).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i15, KeyEvent keyEvent) {
        return p(i15, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zD = false;
        if (this.f8491w.isEmpty()) {
            return false;
        }
        e0();
        for (WeakReference<j> weakReference : this.f8491w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zD = jVar.d(this, gVar);
                if (zD) {
                    break;
                }
            } else {
                this.f8491w.remove(weakReference);
            }
        }
        d0();
        if (zD) {
            this.f8492x = gVar;
        }
        return zD;
    }

    public int l(int i15) {
        return m(i15, 0);
    }

    public int m(int i15, int i16) {
        int size = size();
        if (i16 < 0) {
            i16 = 0;
        }
        while (i16 < size) {
            if (this.f8474f.get(i16).getGroupId() == i15) {
                return i16;
            }
            i16++;
        }
        return -1;
    }

    public int o(int i15) {
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            if (this.f8474f.get(i16).getItemId() == i15) {
                return i16;
            }
        }
        return -1;
    }

    g p(int i15, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f8490v;
        arrayList.clear();
        q(arrayList, i15, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zH = H();
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = arrayList.get(i16);
            char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zH && alphabeticShortcut == '\b' && i15 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i15, int i16) {
        return M(findItem(i15), i16);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i15, KeyEvent keyEvent, int i16) {
        g gVarP = p(i15, keyEvent);
        boolean zM = gVarP != null ? M(gVarP, i16) : false;
        if ((i16 & 2) != 0) {
            e(true);
        }
        return zM;
    }

    void q(List<g> list, int i15, KeyEvent keyEvent) {
        boolean zH = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i15 == 67) {
            int size = this.f8474f.size();
            for (int i16 = 0; i16 < size; i16++) {
                g gVar = this.f8474f.get(i16);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i15, keyEvent);
                }
                char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zH ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zH && alphabeticShortcut == '\b' && i15 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> arrayListE = E();
        if (this.f8479k) {
            boolean zH = false;
            for (WeakReference<j> weakReference : this.f8491w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f8491w.remove(weakReference);
                } else {
                    zH |= jVar.h();
                }
            }
            if (zH) {
                this.f8477i.clear();
                this.f8478j.clear();
                int size = arrayListE.size();
                for (int i15 = 0; i15 < size; i15++) {
                    g gVar = arrayListE.get(i15);
                    if (gVar.l()) {
                        this.f8477i.add(gVar);
                    } else {
                        this.f8478j.add(gVar);
                    }
                }
            } else {
                this.f8477i.clear();
                this.f8478j.clear();
                this.f8478j.addAll(E());
            }
            this.f8479k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i15) {
        int iL = l(i15);
        if (iL >= 0) {
            int size = this.f8474f.size() - iL;
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                if (i16 >= size || this.f8474f.get(iL).getGroupId() != i15) {
                    break;
                }
                O(iL, false);
                i16 = i17;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i15) {
        O(o(i15), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f8477i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i15, boolean z15, boolean z16) {
        int size = this.f8474f.size();
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = this.f8474f.get(i16);
            if (gVar.getGroupId() == i15) {
                gVar.t(z16);
                gVar.setCheckable(z15);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z15) {
        this.f8493y = z15;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i15, boolean z15) {
        int size = this.f8474f.size();
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = this.f8474f.get(i16);
            if (gVar.getGroupId() == i15) {
                gVar.setEnabled(z15);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i15, boolean z15) {
        int size = this.f8474f.size();
        boolean z16 = false;
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = this.f8474f.get(i16);
            if (gVar.getGroupId() == i15 && gVar.y(z15)) {
                z16 = true;
            }
        }
        if (z16) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z15) {
        this.f8471c = z15;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f8474f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f8469a;
    }

    public g v() {
        return this.f8492x;
    }

    public Drawable w() {
        return this.f8483o;
    }

    public CharSequence x() {
        return this.f8482n;
    }

    public View y() {
        return this.f8484p;
    }

    public ArrayList<g> z() {
        r();
        return this.f8478j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i15) {
        return a(0, 0, 0, this.f8470b.getString(i15));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15) {
        return addSubMenu(0, 0, 0, this.f8470b.getString(i15));
    }

    @Override // android.view.Menu
    public MenuItem add(int i15, int i16, int i17, CharSequence charSequence) {
        return a(i15, i16, i17, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15, int i16, int i17, CharSequence charSequence) {
        g gVar = (g) a(i15, i16, i17, charSequence);
        m mVar = new m(this.f8469a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i15, int i16, int i17, int i18) {
        return a(i15, i16, i17, this.f8470b.getString(i18));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i15, int i16, int i17, int i18) {
        return addSubMenu(i15, i16, i17, this.f8470b.getString(i18));
    }
}
