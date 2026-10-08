package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p007NuL.p;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f8528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f8532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f8535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f8536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f8537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f8538l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z15, int i15) {
        this(context, eVar, view, z15, i15, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f8527a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f8527a.getResources().getDimensionPixelSize(p.f345c) ? new b(this.f8527a, this.f8532f, this.f8530d, this.f8531e, this.f8529c) : new l(this.f8527a, this.f8528b, this.f8532f, this.f8530d, this.f8531e, this.f8529c);
        bVar.k(this.f8528b);
        bVar.u(this.f8538l);
        bVar.o(this.f8532f);
        bVar.e(this.f8535i);
        bVar.r(this.f8534h);
        bVar.s(this.f8533g);
        return bVar;
    }

    private void l(int i15, int i16, boolean z15, boolean z16) {
        h hVarC = c();
        hVarC.v(z16);
        if (z15) {
            if ((j6.k.b(this.f8533g, this.f8532f.getLayoutDirection()) & 7) == 5) {
                i15 -= this.f8532f.getWidth();
            }
            hVarC.t(i15);
            hVarC.w(i16);
            int i17 = (int) ((this.f8527a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i15 - i17, i16 - i17, i15 + i17, i16 + i17));
        }
        hVarC.a();
    }

    public void b() {
        if (d()) {
            this.f8536j.dismiss();
        }
    }

    public h c() {
        if (this.f8536j == null) {
            this.f8536j = a();
        }
        return this.f8536j;
    }

    public boolean d() {
        h hVar = this.f8536j;
        return hVar != null && hVar.b();
    }

    protected void e() {
        this.f8536j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8537k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f8532f = view;
    }

    public void g(boolean z15) {
        this.f8534h = z15;
        h hVar = this.f8536j;
        if (hVar != null) {
            hVar.r(z15);
        }
    }

    public void h(int i15) {
        this.f8533g = i15;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f8537k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f8535i = aVar;
        h hVar = this.f8536j;
        if (hVar != null) {
            hVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f8532f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i15, int i16) {
        if (d()) {
            return true;
        }
        if (this.f8532f == null) {
            return false;
        }
        l(i15, i16, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z15, int i15, int i16) {
        this.f8533g = 8388611;
        this.f8538l = new a();
        this.f8527a = context;
        this.f8528b = eVar;
        this.f8532f = view;
        this.f8529c = z15;
        this.f8530d = i15;
        this.f8531e = i16;
    }
}
