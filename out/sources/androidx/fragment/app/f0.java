package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"UnknownNullness"})
public abstract class f0 {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f12517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f12518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f12519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f12520e;

        a(int i15, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f12516a = i15;
            this.f12517b = arrayList;
            this.f12518c = arrayList2;
            this.f12519d = arrayList3;
            this.f12520e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i15 = 0; i15 < this.f12516a; i15++) {
                j6.l0.u0((View) this.f12517b.get(i15), (String) this.f12518c.get(i15));
                j6.l0.u0((View) this.f12519d.get(i15), (String) this.f12520e.get(i15));
            }
        }
    }

    protected static void f(List<View> list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (j6.l0.E(view) != null) {
            list.add(view);
        }
        for (int i15 = size; i15 < list.size(); i15++) {
            View view2 = list.get(i15);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = viewGroup.getChildAt(i16);
                    if (!i(list, childAt, size) && j6.l0.E(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean i(List<View> list, View view, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (list.get(i16) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    protected void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        FragmentManager.L0(4);
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    ArrayList<String> q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = arrayList.get(i15);
            arrayList2.add(j6.l0.E(view));
            j6.l0.u0(view, null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public void t(Object obj, float f15) {
    }

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(o oVar, Object obj, e6.d dVar, Runnable runnable) {
        x(oVar, obj, dVar, null, runnable);
    }

    public void x(o oVar, Object obj, e6.d dVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = arrayList.get(i15);
            String strE = j6.l0.E(view2);
            arrayList4.add(strE);
            if (strE != null) {
                j6.l0.u0(view2, null);
                String str = map.get(strE);
                for (int i16 = 0; i16 < size; i16++) {
                    if (str.equals(arrayList3.get(i16))) {
                        j6.l0.u0(arrayList2.get(i16), strE);
                        break;
                    }
                }
            }
        }
        j6.b0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
