package gj;

import android.content.res.Resources;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a<View> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f73273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f73274g;

    public b(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f73273f = resources.getDimension(ri.d.f173956j);
        this.f73274g = resources.getDimension(ri.d.f173958k);
    }
}
