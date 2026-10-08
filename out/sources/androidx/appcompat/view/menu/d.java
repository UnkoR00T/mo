package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f8463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8464b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f8467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8468f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z15, int i15) {
        this.f8466d = z15;
        this.f8467e = layoutInflater;
        this.f8463a = eVar;
        this.f8468f = i15;
        a();
    }

    void a() {
        g gVarV = this.f8463a.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f8463a.z();
            int size = arrayListZ.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (arrayListZ.get(i15) == gVarV) {
                    this.f8464b = i15;
                    return;
                }
            }
        }
        this.f8464b = -1;
    }

    public e b() {
        return this.f8463a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i15) {
        ArrayList<g> arrayListZ = this.f8466d ? this.f8463a.z() : this.f8463a.E();
        int i16 = this.f8464b;
        if (i16 >= 0 && i15 >= i16) {
            i15++;
        }
        return arrayListZ.get(i15);
    }

    public void d(boolean z15) {
        this.f8465c = z15;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f8466d ? this.f8463a.z() : this.f8463a.E();
        return this.f8464b < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i15) {
        return i15;
    }

    @Override // android.widget.Adapter
    public View getView(int i15, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8467e.inflate(this.f8468f, viewGroup, false);
        }
        int groupId = getItem(i15).getGroupId();
        int i16 = i15 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f8463a.G() && groupId != (i16 >= 0 ? getItem(i16).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f8465c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i15), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
