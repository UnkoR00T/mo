package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f9047b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9048a;

    public t(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
        a(context, attributeSet, i15, i16);
    }

    private void a(Context context, AttributeSet attributeSet, int i15, int i16) {
        z0 z0VarV = z0.v(context, attributeSet, p007NuL.v.Y1, i15, i16);
        if (z0VarV.s(p007NuL.v.f440a2)) {
            b(z0VarV.a(p007NuL.v.f440a2, false));
        }
        setBackgroundDrawable(z0VarV.g(p007NuL.v.Z1));
        z0VarV.x();
    }

    private void b(boolean z15) {
        if (f9047b) {
            this.f9048a = z15;
        } else {
            androidx.core.widget.g.a(this, z15);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i15, int i16) {
        if (f9047b && this.f9048a) {
            i16 -= view.getHeight();
        }
        super.showAsDropDown(view, i15, i16);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i15, int i16, int i17, int i18) {
        if (f9047b && this.f9048a) {
            i16 -= view.getHeight();
        }
        super.update(view, i15, i16, i17, i18);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i15, int i16, int i17) {
        if (f9047b && this.f9048a) {
            i16 -= view.getHeight();
        }
        super.showAsDropDown(view, i15, i16, i17);
    }
}
