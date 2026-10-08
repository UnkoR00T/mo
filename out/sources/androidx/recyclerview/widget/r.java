package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import j6.l0;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class r extends j6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f13413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f13414e;

    public static class a extends j6.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final r f13415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<View, j6.a> f13416e = new WeakHashMap();

        public a(r rVar) {
            this.f13415d = rVar;
        }

        @Override // j6.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            j6.a aVar = this.f13416e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // j6.a
        public k6.q b(View view) {
            j6.a aVar = this.f13416e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // j6.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // j6.a
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) k6.p pVar) {
            if (this.f13415d.o() || this.f13415d.f13413d.getLayoutManager() == null) {
                super.g(view, pVar);
                return;
            }
            this.f13415d.f13413d.getLayoutManager().S0(view, pVar);
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                aVar.g(view, pVar);
            } else {
                super.g(view, pVar);
            }
        }

        @Override // j6.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // j6.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            j6.a aVar = this.f13416e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // j6.a
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i15, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f13415d.o() || this.f13415d.f13413d.getLayoutManager() == null) {
                return super.j(view, i15, bundle);
            }
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i15, bundle)) {
                    return true;
                }
            } else if (super.j(view, i15, bundle)) {
                return true;
            }
            return this.f13415d.f13413d.getLayoutManager().m1(view, i15, bundle);
        }

        @Override // j6.a
        public void l(View view, int i15) {
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                aVar.l(view, i15);
            } else {
                super.l(view, i15);
            }
        }

        @Override // j6.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            j6.a aVar = this.f13416e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        j6.a n(View view) {
            return this.f13416e.remove(view);
        }

        void o(View view) {
            j6.a aVarL = l0.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f13416e.put(view, aVarL);
        }
    }

    public r(RecyclerView recyclerView) {
        this.f13413d = recyclerView;
        j6.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f13414e = new a(this);
        } else {
            this.f13414e = (a) aVarN;
        }
    }

    @Override // j6.a
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // j6.a
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) k6.p pVar) {
        super.g(view, pVar);
        if (o() || this.f13413d.getLayoutManager() == null) {
            return;
        }
        this.f13413d.getLayoutManager().R0(pVar);
    }

    @Override // j6.a
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i15, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i15, bundle)) {
            return true;
        }
        if (o() || this.f13413d.getLayoutManager() == null) {
            return false;
        }
        return this.f13413d.getLayoutManager().k1(i15, bundle);
    }

    public j6.a n() {
        return this.f13414e;
    }

    boolean o() {
        return this.f13413d.s0();
    }
}
