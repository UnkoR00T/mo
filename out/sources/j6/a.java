package j6;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f99577c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f99578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f99579b;

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    static final class C2337a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f99580a;

        C2337a(a aVar) {
            this.f99580a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f99580a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            k6.q qVarB = this.f99580a.b(view);
            if (qVarB != null) {
                return (AccessibilityNodeProvider) qVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f99580a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            k6.p pVarF1 = k6.p.f1(accessibilityNodeInfo);
            pVarF1.P0(l0.O(view));
            pVarF1.A0(l0.L(view));
            pVarF1.J0(l0.o(view));
            pVarF1.U0(l0.D(view));
            this.f99580a.g(view, pVarF1);
            pVarF1.e(accessibilityNodeInfo.getText(), view);
            List<k6.p.a> listC = a.c(view);
            for (int i15 = 0; i15 < listC.size(); i15++) {
                pVarF1.b(listC.get(i15));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f99580a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f99580a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i15, Bundle bundle) {
            return this.f99580a.j(view, i15, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i15) {
            this.f99580a.l(view, i15);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f99580a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f99577c);
    }

    static List<k6.p.a> c(View view) {
        List<k6.p.a> list = (List) view.getTag(r5.e.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrR = k6.p.r(view.createAccessibilityNodeInfo().getText());
            for (int i15 = 0; clickableSpanArrR != null && i15 < clickableSpanArrR.length; i15++) {
                if (clickableSpan.equals(clickableSpanArrR[i15])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i15, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(r5.e.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i15)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f99578a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public k6.q b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f99578a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new k6.q(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f99579b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f99578a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, k6.p pVar) {
        this.f99578a.onInitializeAccessibilityNodeInfo(view, pVar.e1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f99578a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f99578a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i15, Bundle bundle) {
        List<k6.p.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i16 = 0; i16 < listC.size(); i16++) {
            k6.p.a aVar = listC.get(i16);
            if (aVar.b() == i15) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f99578a.performAccessibilityAction(view, i15, bundle);
        }
        return (zPerformAccessibilityAction || i15 != r5.e.f171804a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i15) {
        this.f99578a.sendAccessibilityEvent(view, i15);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f99578a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f99578a = accessibilityDelegate;
        this.f99579b = new C2337a(this);
    }
}
