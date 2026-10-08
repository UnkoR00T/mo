package gp;

import bp.l;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import lp.r;

/* JADX INFO: loaded from: classes4.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<l, SoftReference<r>> f75772a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<l, SoftReference<op.b>> f75773b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<l, SoftReference<np.c>> f75774c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<l, SoftReference<Object>> f75775d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<l, SoftReference<Object>> f75776e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<l, SoftReference<Object>> f75777f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<l, SoftReference<com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.b>> f75778g = new HashMap();

    @Override // gp.j
    public r a(l lVar) {
        SoftReference<r> softReference = this.f75772a.get(lVar);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // gp.j
    public void b(l lVar, op.b bVar) {
        this.f75773b.put(lVar, new SoftReference<>(bVar));
    }

    @Override // gp.j
    public op.b c(l lVar) {
        SoftReference<op.b> softReference = this.f75773b.get(lVar);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // gp.j
    public void d(l lVar, r rVar) {
        this.f75772a.put(lVar, new SoftReference<>(rVar));
    }
}
