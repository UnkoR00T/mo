package gj;

import android.content.res.Resources;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class d extends a<View> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f73275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f73276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f73277h;

    public d(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f73275f = resources.getDimension(ri.d.f173962m);
        this.f73276g = resources.getDimension(ri.d.f173960l);
        this.f73277h = resources.getDimension(ri.d.f173964n);
    }
}
