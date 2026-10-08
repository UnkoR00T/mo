package rg;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;
import jg.d0;
import rg.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f173719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f173720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList f173721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f173722d = new f(this);

    public static void j(FrameLayout frameLayout) {
        gg.d dVarN = gg.d.n();
        Context context = frameLayout.getContext();
        int iG = dVarN.g(context);
        String strC = d0.c(context, iG);
        String strE = d0.e(context, iG);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = dVarN.b(context, iG, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strE);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, intentB));
        }
    }

    private final void o(int i15) {
        while (!this.f173721c.isEmpty() && ((k) this.f173721c.getLast()).a() >= i15) {
            this.f173721c.removeLast();
        }
    }

    private final void p(Bundle bundle, k kVar) {
        c cVar = this.f173719a;
        if (cVar != null) {
            kVar.b(cVar);
            return;
        }
        if (this.f173721c == null) {
            this.f173721c = new LinkedList();
        }
        this.f173721c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f173720b;
            if (bundle2 == null) {
                this.f173720b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f173722d);
    }

    protected abstract void a(e<T> eVar);

    public T b() {
        return (T) this.f173719a;
    }

    public void c(Bundle bundle) {
        p(bundle, new g(this, bundle));
    }

    public void d() {
        c cVar = this.f173719a;
        if (cVar != null) {
            cVar.g();
        } else {
            o(1);
        }
    }

    public void e() {
        c cVar = this.f173719a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public void f() {
        c cVar = this.f173719a;
        if (cVar != null) {
            cVar.h();
        } else {
            o(5);
        }
    }

    public void g() {
        p(null, new j(this));
    }

    public void h() {
        p(null, new i(this));
    }

    public void i() {
        c cVar = this.f173719a;
        if (cVar != null) {
            cVar.e();
        } else {
            o(4);
        }
    }

    final /* synthetic */ c k() {
        return this.f173719a;
    }

    final /* synthetic */ void l(c cVar) {
        this.f173719a = cVar;
    }

    final /* synthetic */ void m(Bundle bundle) {
        this.f173720b = null;
    }

    final /* synthetic */ LinkedList n() {
        return this.f173721c;
    }
}
