package bp;

import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e extends b implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f20665f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f20668j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private dp.i f20671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20672n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20661b = 1.4f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<m, l> f20662c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<m, Long> f20663d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<o> f20664e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20666g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20667h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20669k = false;

    public e(dp.i iVar) {
        this.f20671m = iVar;
    }

    public o A3() {
        o oVar = new o(this.f20671m);
        this.f20664e.add(oVar);
        return oVar;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.E(this);
    }

    public o J3(d dVar) {
        o oVar = new o(this.f20671m);
        for (Map.Entry<i, b> entry : dVar.entrySet()) {
            oVar.Y4(entry.getKey(), entry.getValue());
        }
        return oVar;
    }

    public a N3() {
        return k4().j4(i.f20826o4);
    }

    public d X3() {
        return this.f20665f.k4(i.f20766i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20669k) {
            return;
        }
        Iterator<l> it = i4().iterator();
        IOException iOExceptionA = null;
        while (it.hasNext()) {
            b bVarX3 = it.next().X3();
            if (bVarX3 instanceof o) {
                iOExceptionA = dp.a.a((o) bVarX3, "COSStream", iOExceptionA);
            }
        }
        Iterator<o> it4 = this.f20664e.iterator();
        while (it4.hasNext()) {
            iOExceptionA = dp.a.a(it4.next(), "COSStream", iOExceptionA);
        }
        dp.i iVar = this.f20671m;
        if (iVar != null) {
            iOExceptionA = dp.a.a(iVar, "ScratchFile", iOExceptionA);
        }
        this.f20669k = true;
        if (iOExceptionA != null) {
            throw iOExceptionA;
        }
    }

    protected void finalize() throws IOException {
        if (this.f20669k) {
            return;
        }
        if (this.f20666g) {
            c2.g("PdfBox-Android", "Warning: You did not close a PDF Document");
        }
        close();
    }

    public long g4() {
        return this.f20672n;
    }

    public l h4(m mVar) {
        l lVar = mVar != null ? this.f20662c.get(mVar) : null;
        if (lVar == null) {
            lVar = new l(null);
            if (mVar != null) {
                lVar.j4(mVar.g());
                lVar.h4(mVar.e());
                this.f20662c.put(mVar, lVar);
            }
        }
        return lVar;
    }

    public void i3(Map<m, Long> map) {
        this.f20663d.putAll(map);
    }

    public List<l> i4() {
        return new ArrayList(this.f20662c.values());
    }

    public boolean isClosed() {
        return this.f20669k;
    }

    public long j4() {
        return this.f20668j;
    }

    public d k4() {
        return this.f20665f;
    }

    public float l4() {
        return this.f20661b;
    }

    public Map<m, Long> m4() {
        return this.f20663d;
    }

    public boolean n4() {
        d dVar = this.f20665f;
        if (dVar != null) {
            return dVar.p4(i.f20766i3) instanceof d;
        }
        return false;
    }

    public boolean o4() {
        return this.f20670l;
    }

    public void p4() {
        this.f20667h = true;
    }

    public void q4(a aVar) {
        k4().Y4(i.f20826o4, aVar);
    }

    public void r4(d dVar) {
        this.f20665f.Y4(i.f20766i3, dVar);
    }

    public void s4(long j15) {
        this.f20672n = j15;
    }

    public void t4(boolean z15) {
        this.f20670l = z15;
    }

    public void u4(long j15) {
        this.f20668j = j15;
    }

    public void v4(d dVar) {
        this.f20665f = dVar;
    }

    public void w4(float f15) {
        this.f20661b = f15;
    }
}
