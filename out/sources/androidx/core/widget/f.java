package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ListView f11899v;

    public f(ListView listView) {
        super(listView);
        this.f11899v = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i15) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i15) {
        ListView listView = this.f11899v;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i16 = firstVisiblePosition + childCount;
        if (i15 > 0) {
            if (i16 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i15 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void j(int i15, int i16) {
        this.f11899v.scrollListBy(i16);
    }
}
