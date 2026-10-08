package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class e extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager2.i f13708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f13709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView f13710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f13711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f13714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13720m;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f13722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13723c;

        a() {
        }

        void a() {
            this.f13721a = -1;
            this.f13722b = 0.0f;
            this.f13723c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f13709b = viewPager2;
        RecyclerView recyclerView = viewPager2.f13669k;
        this.f13710c = recyclerView;
        this.f13711d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f13714g = new a();
        n();
    }

    private void c(int i15, float f15, int i16) {
        ViewPager2.i iVar = this.f13708a;
        if (iVar != null) {
            iVar.b(i15, f15, i16);
        }
    }

    private void d(int i15) {
        ViewPager2.i iVar = this.f13708a;
        if (iVar != null) {
            iVar.c(i15);
        }
    }

    private void e(int i15) {
        if ((this.f13712e == 3 && this.f13713f == 0) || this.f13713f == i15) {
            return;
        }
        this.f13713f = i15;
        ViewPager2.i iVar = this.f13708a;
        if (iVar != null) {
            iVar.a(i15);
        }
    }

    private int f() {
        return this.f13711d.c2();
    }

    private boolean k() {
        int i15 = this.f13712e;
        return i15 == 1 || i15 == 4;
    }

    private void n() {
        this.f13712e = 0;
        this.f13713f = 0;
        this.f13714g.a();
        this.f13715h = -1;
        this.f13716i = -1;
        this.f13717j = false;
        this.f13718k = false;
        this.f13720m = false;
        this.f13719l = false;
    }

    private void p(boolean z15) {
        this.f13720m = z15;
        this.f13712e = z15 ? 4 : 1;
        int i15 = this.f13716i;
        if (i15 != -1) {
            this.f13715h = i15;
            this.f13716i = -1;
        } else if (this.f13715h == -1) {
            this.f13715h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f13714g;
        int iC2 = this.f13711d.c2();
        aVar.f13721a = iC2;
        if (iC2 == -1) {
            aVar.a();
            return;
        }
        View viewH = this.f13711d.H(iC2);
        if (viewH == null) {
            aVar.a();
            return;
        }
        int iE0 = this.f13711d.e0(viewH);
        int iN0 = this.f13711d.n0(viewH);
        int iQ0 = this.f13711d.q0(viewH);
        int iM = this.f13711d.M(viewH);
        ViewGroup.LayoutParams layoutParams = viewH.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iE0 += marginLayoutParams.leftMargin;
            iN0 += marginLayoutParams.rightMargin;
            iQ0 += marginLayoutParams.topMargin;
            iM += marginLayoutParams.bottomMargin;
        }
        int height = viewH.getHeight() + iQ0 + iM;
        int width = viewH.getWidth() + iE0 + iN0;
        if (this.f13711d.p2() == 0) {
            top = (viewH.getLeft() - iE0) - this.f13710c.getPaddingLeft();
            if (this.f13709b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewH.getTop() - iQ0) - this.f13710c.getPaddingTop();
        }
        int i15 = -top;
        aVar.f13723c = i15;
        if (i15 >= 0) {
            aVar.f13722b = height == 0 ? 0.0f : i15 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f13711d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f13723c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i15) {
        if (!(this.f13712e == 1 && this.f13713f == 1) && i15 == 1) {
            p(false);
            return;
        }
        if (k() && i15 == 2) {
            if (this.f13718k) {
                e(2);
                this.f13717j = true;
                return;
            }
            return;
        }
        if (k() && i15 == 0) {
            q();
            if (this.f13718k) {
                a aVar = this.f13714g;
                if (aVar.f13723c == 0) {
                    int i16 = this.f13715h;
                    int i17 = aVar.f13721a;
                    if (i16 != i17) {
                        d(i17);
                    }
                }
            } else {
                int i18 = this.f13714g.f13721a;
                if (i18 != -1) {
                    c(i18, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f13712e == 2 && i15 == 0 && this.f13719l) {
            q();
            a aVar2 = this.f13714g;
            if (aVar2.f13723c == 0) {
                int i19 = this.f13716i;
                int i25 = aVar2.f13721a;
                if (i19 != i25) {
                    if (i25 == -1) {
                        i25 = 0;
                    }
                    d(i25);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void b(RecyclerView recyclerView, int i15, int i16) {
        a aVar;
        int i17;
        this.f13718k = true;
        q();
        if (this.f13717j) {
            this.f13717j = false;
            if (i16 > 0) {
                aVar = this.f13714g;
                if (aVar.f13723c != 0) {
                    i17 = aVar.f13721a + 1;
                } else {
                    i17 = this.f13714g.f13721a;
                }
            } else {
                if (i16 == 0) {
                    if ((i15 < 0) == this.f13709b.d()) {
                        aVar = this.f13714g;
                        if (aVar.f13723c != 0) {
                            i17 = aVar.f13721a + 1;
                        }
                    }
                }
                i17 = this.f13714g.f13721a;
            }
            this.f13716i = i17;
            if (this.f13715h != i17) {
                d(i17);
            }
        } else if (this.f13712e == 0) {
            int i18 = this.f13714g.f13721a;
            if (i18 == -1) {
                i18 = 0;
            }
            d(i18);
        }
        a aVar2 = this.f13714g;
        int i19 = aVar2.f13721a;
        if (i19 == -1) {
            i19 = 0;
        }
        c(i19, aVar2.f13722b, aVar2.f13723c);
        a aVar3 = this.f13714g;
        int i25 = aVar3.f13721a;
        int i26 = this.f13716i;
        if ((i25 == i26 || i26 == -1) && aVar3.f13723c == 0 && this.f13713f != 1) {
            e(0);
            n();
        }
    }

    double g() {
        q();
        a aVar = this.f13714g;
        return ((double) aVar.f13721a) + ((double) aVar.f13722b);
    }

    int h() {
        return this.f13713f;
    }

    boolean i() {
        return this.f13720m;
    }

    boolean j() {
        return this.f13713f == 0;
    }

    void l() {
        this.f13719l = true;
    }

    void m(int i15, boolean z15) {
        this.f13712e = z15 ? 2 : 3;
        this.f13720m = false;
        boolean z16 = this.f13716i != i15;
        this.f13716i = i15;
        e(2);
        if (z16) {
            d(i15);
        }
    }

    void o(ViewPager2.i iVar) {
        this.f13708a = iVar;
    }
}
