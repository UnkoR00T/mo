package p6;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, p6.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f153167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f153168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f153169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f153170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f153171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C3768a f153172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f153173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.b f153174h;

    /* JADX INFO: renamed from: p6.a$a, reason: collision with other inner class name */
    private class C3768a extends ContentObserver {
        C3768a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z15) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f153167a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f153167a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z15) {
        e(context, cursor, z15 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // p6.b.a
    public Cursor c() {
        return this.f153169c;
    }

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i15) {
        if ((i15 & 1) == 1) {
            i15 |= 2;
            this.f153168b = true;
        } else {
            this.f153168b = false;
        }
        boolean z15 = cursor != null;
        this.f153169c = cursor;
        this.f153167a = z15;
        this.f153170d = context;
        this.f153171e = z15 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i15 & 2) == 2) {
            this.f153172f = new C3768a();
            this.f153173g = new b();
        } else {
            this.f153172f = null;
            this.f153173g = null;
        }
        if (z15) {
            C3768a c3768a = this.f153172f;
            if (c3768a != null) {
                cursor.registerContentObserver(c3768a);
            }
            DataSetObserver dataSetObserver = this.f153173g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f153167a || (cursor = this.f153169c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i15, View view, ViewGroup viewGroup) {
        if (!this.f153167a) {
            return null;
        }
        this.f153169c.moveToPosition(i15);
        if (view == null) {
            view = f(this.f153170d, this.f153169c, viewGroup);
        }
        d(view, this.f153170d, this.f153169c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f153174h == null) {
            this.f153174h = new p6.b(this);
        }
        return this.f153174h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i15) {
        Cursor cursor;
        if (!this.f153167a || (cursor = this.f153169c) == null) {
            return null;
        }
        cursor.moveToPosition(i15);
        return this.f153169c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i15) {
        Cursor cursor;
        if (this.f153167a && (cursor = this.f153169c) != null && cursor.moveToPosition(i15)) {
            return this.f153169c.getLong(this.f153171e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i15, View view, ViewGroup viewGroup) {
        if (!this.f153167a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f153169c.moveToPosition(i15)) {
            if (view == null) {
                view = g(this.f153170d, this.f153169c, viewGroup);
            }
            d(view, this.f153170d, this.f153169c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i15);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f153168b || (cursor = this.f153169c) == null || cursor.isClosed()) {
            return;
        }
        this.f153167a = this.f153169c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f153169c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C3768a c3768a = this.f153172f;
            if (c3768a != null) {
                cursor2.unregisterContentObserver(c3768a);
            }
            DataSetObserver dataSetObserver = this.f153173g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f153169c = cursor;
        if (cursor == null) {
            this.f153171e = -1;
            this.f153167a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C3768a c3768a2 = this.f153172f;
        if (c3768a2 != null) {
            cursor.registerContentObserver(c3768a2);
        }
        DataSetObserver dataSetObserver2 = this.f153173g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f153171e = cursor.getColumnIndexOrThrow("_id");
        this.f153167a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
