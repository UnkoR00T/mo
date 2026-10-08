package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p011Prn.f2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements f2, j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f8526a;

    h() {
    }

    protected static int n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i15) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i16 = 0;
        int i17 = 0;
        View view = null;
        for (int i18 = 0; i18 < count; i18++) {
            int itemViewType = listAdapter.getItemViewType(i18);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i18, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i15) {
                return i15;
            }
            if (measuredWidth > i16) {
                i16 = measuredWidth;
            }
        }
        return i16;
    }

    protected static boolean x(e eVar) {
        int size = eVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem item = eVar.getItem(i15);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static d y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
    }

    public abstract void k(e eVar);

    protected boolean l() {
        return true;
    }

    public Rect m() {
        return this.f8526a;
    }

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f8463a.N((MenuItem) listAdapter.getItem(i15), this, l() ? 0 : 4);
    }

    public void q(Rect rect) {
        this.f8526a = rect;
    }

    public abstract void r(boolean z15);

    public abstract void s(int i15);

    public abstract void t(int i15);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z15);

    public abstract void w(int i15);
}
