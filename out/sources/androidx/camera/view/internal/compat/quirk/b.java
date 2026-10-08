package androidx.camera.view.internal.compat.quirk;

import java.util.ArrayList;
import java.util.List;
import v.c3;
import v.d3;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static List<c3> a(d3 d3Var) {
        ArrayList arrayList = new ArrayList();
        if (d3Var.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.f())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (d3Var.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.c())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
