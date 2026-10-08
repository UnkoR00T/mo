package androidx.appcompat.app;

import CON.w;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class m extends w implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f8252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j6.m.a f8253f;

    public m(Context context, int i15) {
        super(context, n(context, i15));
        this.f8253f = new j6.m.a() { // from class: androidx.appcompat.app.l
            @Override // j6.m.a
            public final boolean l(KeyEvent keyEvent) {
                return this.f8251a.p(keyEvent);
            }
        };
        f fVarM = m();
        fVarM.N(n(context, i15));
        fVarM.y(null);
    }

    private static int n(Context context, int i15) {
        if (i15 != 0) {
            return i15;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p007NuL.m.B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // CON.w, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        m().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return j6.m.e(this.f8253f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i15) {
        return (T) m().l(i15);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m().v();
    }

    public f m() {
        if (this.f8252e == null) {
            this.f8252e = f.k(this, this);
        }
        return this.f8252e;
    }

    @Override // CON.w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m().u();
        super.onCreate(bundle);
        m().y(bundle);
    }

    @Override // CON.w, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m().E();
    }

    boolean p(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean q(int i15) {
        return m().H(i15);
    }

    @Override // androidx.appcompat.app.d
    public void r(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void s(androidx.appcompat.view.b bVar) {
    }

    @Override // CON.w, android.app.Dialog
    public void setContentView(int i15) {
        h();
        m().I(i15);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m().O(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b z(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // CON.w, android.app.Dialog
    public void setContentView(View view) {
        h();
        m().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i15) {
        super.setTitle(i15);
        m().O(getContext().getString(i15));
    }

    @Override // CON.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        m().K(view, layoutParams);
    }
}
