package iq;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f96181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f96182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f96183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f96184d;

    class a implements n {
        a() {
        }

        @Override // androidx.p016lifecycle.n
        public void m(q qVar, j.a aVar) {
            if (aVar == j.a.ON_DESTROY) {
                i.this.f96181a = null;
                i.this.f96182b = null;
                i.this.f96183c = null;
            }
        }
    }

    i(Context context, o oVar) {
        super((Context) lq.d.a(context));
        a aVar = new a();
        this.f96184d = aVar;
        this.f96182b = null;
        o oVar2 = (o) lq.d.a(oVar);
        this.f96181a = oVar2;
        oVar2.getLifecycleRegistry().a(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f96183c == null) {
            if (this.f96182b == null) {
                this.f96182b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f96183c = this.f96182b.cloneInContext(this);
        }
        return this.f96183c;
    }

    i(LayoutInflater layoutInflater, o oVar) {
        super((Context) lq.d.a(((LayoutInflater) lq.d.a(layoutInflater)).getContext()));
        a aVar = new a();
        this.f96184d = aVar;
        this.f96182b = layoutInflater;
        o oVar2 = (o) lq.d.a(oVar);
        this.f96181a = oVar2;
        oVar2.getLifecycleRegistry().a(aVar);
    }
}
