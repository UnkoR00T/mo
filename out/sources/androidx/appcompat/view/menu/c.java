package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p007NuL.s;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f8452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f8453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f8454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f8455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f8456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f8457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f8458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f8459h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f8460j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8461a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f8454c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f8454c.z();
                int size = arrayListZ.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (arrayListZ.get(i15) == gVarV) {
                        this.f8461a = i15;
                        return;
                    }
                }
            }
            this.f8461a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i15) {
            ArrayList<g> arrayListZ = c.this.f8454c.z();
            int i16 = i15 + c.this.f8456e;
            int i17 = this.f8461a;
            if (i17 >= 0 && i16 >= i17) {
                i16++;
            }
            return arrayListZ.get(i16);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f8454c.z().size() - c.this.f8456e;
            return this.f8461a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i15) {
            return i15;
        }

        @Override // android.widget.Adapter
        public View getView(int i15, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f8453b.inflate(cVar.f8458g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i15), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i15) {
        this(i15, 0);
        this.f8452a = context;
        this.f8453b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f8460j == null) {
            this.f8460j = new a();
        }
        return this.f8460j;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f8455d == null) {
            this.f8455d = (ExpandedMenuView) this.f8453b.inflate(s.f410g, viewGroup, false);
            if (this.f8460j == null) {
                this.f8460j = new a();
            }
            this.f8455d.setAdapter((ListAdapter) this.f8460j);
            this.f8455d.setOnItemClickListener(this);
        }
        return this.f8455d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z15) {
        j.a aVar = this.f8459h;
        if (aVar != null) {
            aVar.c(eVar, z15);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f8459h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f8459h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z15) {
        a aVar = this.f8460j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
        if (this.f8457f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f8457f);
            this.f8452a = contextThemeWrapper;
            this.f8453b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f8452a != null) {
            this.f8452a = context;
            if (this.f8453b == null) {
                this.f8453b = LayoutInflater.from(context);
            }
        }
        this.f8454c = eVar;
        a aVar = this.f8460j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
        this.f8454c.N(this.f8460j.getItem(i15), this, 0);
    }

    public c(int i15, int i16) {
        this.f8458g = i15;
        this.f8457f = i16;
    }
}
