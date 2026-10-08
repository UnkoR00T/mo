package p6;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f153178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f153179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LayoutInflater f153180l;

    @Deprecated
    public c(Context context, int i15, Cursor cursor, boolean z15) {
        super(context, cursor, z15);
        this.f153179k = i15;
        this.f153178j = i15;
        this.f153180l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p6.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f153180l.inflate(this.f153179k, viewGroup, false);
    }

    @Override // p6.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f153180l.inflate(this.f153178j, viewGroup, false);
    }
}
