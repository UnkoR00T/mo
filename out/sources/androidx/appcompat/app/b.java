package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public class b extends m implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AlertController f8162g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f8163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8164b;

        public a(Context context) {
            this(context, b.u(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8163a;
            bVar.f8144w = listAdapter;
            bVar.f8145x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f8163a.f8128g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f8163a.f8125d = drawable;
            return this;
        }

        public b create() {
            b bVar = new b(this.f8163a.f8122a, this.f8164b);
            this.f8163a.a(bVar.f8162g);
            bVar.setCancelable(this.f8163a.f8139r);
            if (this.f8163a.f8139r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f8163a.f8140s);
            bVar.setOnDismissListener(this.f8163a.f8141t);
            DialogInterface.OnKeyListener onKeyListener = this.f8163a.f8142u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8163a;
            bVar.f8133l = charSequence;
            bVar.f8135n = onClickListener;
            return this;
        }

        public a e(DialogInterface.OnKeyListener onKeyListener) {
            this.f8163a.f8142u = onKeyListener;
            return this;
        }

        public a f(ListAdapter listAdapter, int i15, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8163a;
            bVar.f8144w = listAdapter;
            bVar.f8145x = onClickListener;
            bVar.I = i15;
            bVar.H = true;
            return this;
        }

        public Context getContext() {
            return this.f8163a.f8122a;
        }

        public a setNegativeButton(int i15, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8163a;
            bVar.f8133l = bVar.f8122a.getText(i15);
            this.f8163a.f8135n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i15, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8163a;
            bVar.f8130i = bVar.f8122a.getText(i15);
            this.f8163a.f8132k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f8163a.f8127f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f8163a;
            bVar.f8147z = view;
            bVar.f8146y = 0;
            bVar.E = false;
            return this;
        }

        public a(Context context, int i15) {
            this.f8163a = new AlertController.b(new ContextThemeWrapper(context, b.u(context, i15)));
            this.f8164b = i15;
        }
    }

    protected b(Context context, int i15) {
        super(context, u(context, i15));
        this.f8162g = new AlertController(getContext(), this, getWindow());
    }

    static int u(Context context, int i15) {
        if (((i15 >>> 24) & GF2Field.MASK) >= 1) {
            return i15;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p007NuL.m.f322o, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.m, CON.w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8162g.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i15, KeyEvent keyEvent) {
        if (this.f8162g.f(i15, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i15, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i15, KeyEvent keyEvent) {
        if (this.f8162g.g(i15, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i15, keyEvent);
    }

    @Override // androidx.appcompat.app.m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f8162g.p(charSequence);
    }

    public ListView t() {
        return this.f8162g.d();
    }
}
