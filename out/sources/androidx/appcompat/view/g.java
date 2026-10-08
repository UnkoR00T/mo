package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z0;
import io.sentry.android.core.c2;
import j6.q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007NuL.v;
import p011Prn.d2;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f8333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f8334f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f8337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f8338d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f8339c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f8340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f8341b;

        public a(Object obj, String str) {
            this.f8340a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8341b = cls.getMethod(str, f8339c);
            } catch (Exception e15) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e15);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8341b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8341b.invoke(this.f8340a, menuItem)).booleanValue();
                }
                this.f8341b.invoke(this.f8340a, menuItem);
                return true;
            } catch (Exception e15) {
                throw new RuntimeException(e15);
            }
        }
    }

    private class b {
        j6.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f8342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f8348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8349h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8350i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8351j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f8352k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f8353l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f8354m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f8355n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f8356o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f8357p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f8358q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f8359r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f8360s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8361t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f8362u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f8363v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f8364w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f8365x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f8366y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f8367z;

        public b(Menu menu) {
            this.f8342a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f8337c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e15) {
                c2.h("SupportMenuInflater", "Cannot instantiate class: " + str, e15);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z15 = false;
            menuItem.setChecked(this.f8360s).setVisible(this.f8361t).setEnabled(this.f8362u).setCheckable(this.f8359r >= 1).setTitleCondensed(this.f8353l).setIcon(this.f8354m);
            int i15 = this.f8363v;
            if (i15 >= 0) {
                menuItem.setShowAsAction(i15);
            }
            if (this.f8367z != null) {
                if (g.this.f8337c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f8367z));
            }
            if (this.f8359r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof d2) {
                    ((d2) menuItem).h(true);
                }
            }
            String str = this.f8365x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f8333e, g.this.f8335a));
                z15 = true;
            }
            int i16 = this.f8364w;
            if (i16 > 0) {
                if (z15) {
                    c2.g("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i16);
                }
            }
            j6.b bVar = this.A;
            if (bVar != null) {
                q.a(menuItem, bVar);
            }
            q.c(menuItem, this.B);
            q.g(menuItem, this.C);
            q.b(menuItem, this.f8355n, this.f8356o);
            q.f(menuItem, this.f8357p, this.f8358q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                q.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                q.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f8349h = true;
            i(this.f8342a.add(this.f8343b, this.f8350i, this.f8351j, this.f8352k));
        }

        public SubMenu b() {
            this.f8349h = true;
            SubMenu subMenuAddSubMenu = this.f8342a.addSubMenu(this.f8343b, this.f8350i, this.f8351j, this.f8352k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f8349h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f8337c.obtainStyledAttributes(attributeSet, v.f509o1);
            this.f8343b = typedArrayObtainStyledAttributes.getResourceId(v.f519q1, 0);
            this.f8344c = typedArrayObtainStyledAttributes.getInt(v.f529s1, 0);
            this.f8345d = typedArrayObtainStyledAttributes.getInt(v.f534t1, 0);
            this.f8346e = typedArrayObtainStyledAttributes.getInt(v.f538u1, 0);
            this.f8347f = typedArrayObtainStyledAttributes.getBoolean(v.f524r1, true);
            this.f8348g = typedArrayObtainStyledAttributes.getBoolean(v.f514p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 z0VarU = z0.u(g.this.f8337c, attributeSet, v.f542v1);
            this.f8350i = z0VarU.n(v.f554y1, 0);
            this.f8351j = (z0VarU.k(v.B1, this.f8344c) & (-65536)) | (z0VarU.k(v.C1, this.f8345d) & 65535);
            this.f8352k = z0VarU.p(v.D1);
            this.f8353l = z0VarU.p(v.E1);
            this.f8354m = z0VarU.n(v.f546w1, 0);
            this.f8355n = c(z0VarU.o(v.F1));
            this.f8356o = z0VarU.k(v.M1, PKIFailureInfo.certConfirmed);
            this.f8357p = c(z0VarU.o(v.G1));
            this.f8358q = z0VarU.k(v.Q1, PKIFailureInfo.certConfirmed);
            if (z0VarU.s(v.H1)) {
                this.f8359r = z0VarU.a(v.H1, false) ? 1 : 0;
            } else {
                this.f8359r = this.f8346e;
            }
            this.f8360s = z0VarU.a(v.f558z1, false);
            this.f8361t = z0VarU.a(v.A1, this.f8347f);
            this.f8362u = z0VarU.a(v.f550x1, this.f8348g);
            this.f8363v = z0VarU.k(v.R1, -1);
            this.f8367z = z0VarU.o(v.I1);
            this.f8364w = z0VarU.n(v.J1, 0);
            this.f8365x = z0VarU.o(v.L1);
            String strO = z0VarU.o(v.K1);
            this.f8366y = strO;
            boolean z15 = strO != null;
            if (z15 && this.f8364w == 0 && this.f8365x == null) {
                this.A = (j6.b) e(strO, g.f8334f, g.this.f8336b);
            } else {
                if (z15) {
                    c2.g("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = z0VarU.p(v.N1);
            this.C = z0VarU.p(v.S1);
            if (z0VarU.s(v.P1)) {
                this.E = h0.d(z0VarU.k(v.P1, -1), this.E);
            } else {
                this.E = null;
            }
            if (z0VarU.s(v.O1)) {
                this.D = z0VarU.c(v.O1);
            } else {
                this.D = null;
            }
            z0VarU.x();
            this.f8349h = false;
        }

        public void h() {
            this.f8343b = 0;
            this.f8344c = 0;
            this.f8345d = 0;
            this.f8346e = 0;
            this.f8347f = true;
            this.f8348g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f8333e = clsArr;
        f8334f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f8337c = context;
        Object[] objArr = {context};
        this.f8335a = objArr;
        this.f8336b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z15 = false;
        boolean z16 = false;
        String str = null;
        while (!z15) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z16 && name2.equals(str)) {
                        z16 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            j6.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z15 = true;
                    }
                }
            } else if (!z16) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z16 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f8338d == null) {
            this.f8338d = a(this.f8337c);
        }
        return this.f8338d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i15, Menu menu) {
        if (!(menu instanceof a6.a)) {
            super.inflate(i15, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z15 = false;
        try {
            try {
                layout = this.f8337c.getResources().getLayout(i15);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z15 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z15) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e15) {
                throw new InflateException("Error inflating menu XML", e15);
            } catch (XmlPullParserException e16) {
                throw new InflateException("Error inflating menu XML", e16);
            }
        } catch (Throwable th4) {
            if (z15) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th4;
        }
    }
}
