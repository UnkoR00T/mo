package ep;

import bp.m;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Long, c> f52636a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f52637b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f52638c = null;

    public enum b {
        TABLE,
        STREAM
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected bp.d f52642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f52643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<m, Long> f52644c;

        public void d() {
            this.f52644c.clear();
        }

        private c() {
            this.f52642a = null;
            this.f52644c = new HashMap();
            this.f52643b = b.TABLE;
        }
    }

    public bp.d a() {
        return this.f52637b.f52642a;
    }

    public bp.d b() {
        c cVar = this.f52638c;
        if (cVar == null) {
            return null;
        }
        return cVar.f52642a;
    }

    public Map<m, Long> c() {
        c cVar = this.f52638c;
        if (cVar == null) {
            return null;
        }
        return cVar.f52644c;
    }

    public b d() {
        c cVar = this.f52638c;
        if (cVar == null) {
            return null;
        }
        return cVar.f52643b;
    }

    public void e(long j15, b bVar) {
        this.f52637b = new c();
        this.f52636a.put(Long.valueOf(j15), this.f52637b);
        this.f52637b.f52643b = bVar;
    }

    protected void f() {
        Iterator<c> it = this.f52636a.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f52637b = null;
        this.f52638c = null;
    }

    public void g(long j15) {
        if (this.f52638c != null) {
            c2.g("PdfBox-Android", "Method must be called only ones with last startxref value.");
            return;
        }
        c cVar = new c();
        this.f52638c = cVar;
        cVar.f52642a = new bp.d();
        c cVar2 = this.f52636a.get(Long.valueOf(j15));
        ArrayList arrayList = new ArrayList();
        if (cVar2 == null) {
            c2.g("PdfBox-Android", "Did not found XRef object at specified startxref position " + j15);
            arrayList.addAll(this.f52636a.keySet());
            Collections.sort(arrayList);
        } else {
            this.f52638c.f52643b = cVar2.f52643b;
            arrayList.add(Long.valueOf(j15));
            do {
                bp.d dVar = cVar2.f52642a;
                if (dVar == null) {
                    break;
                }
                long jG4 = dVar.G4(bp.i.X6, -1L);
                if (jG4 == -1) {
                    break;
                }
                cVar2 = this.f52636a.get(Long.valueOf(jG4));
                if (cVar2 == null) {
                    c2.g("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + jG4);
                    break;
                }
                arrayList.add(Long.valueOf(jG4));
            } while (arrayList.size() < this.f52636a.size());
            Collections.reverse(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar3 = this.f52636a.get((Long) it.next());
            bp.d dVar2 = cVar3.f52642a;
            if (dVar2 != null) {
                this.f52638c.f52642a.i3(dVar2);
            }
            this.f52638c.f52644c.putAll(cVar3.f52644c);
        }
    }

    public void h(bp.d dVar) {
        c cVar = this.f52637b;
        if (cVar == null) {
            c2.g("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
        } else {
            cVar.f52642a = dVar;
        }
    }

    public void i(m mVar, long j15) {
        c cVar = this.f52637b;
        if (cVar != null) {
            if (cVar.f52644c.containsKey(mVar)) {
                return;
            }
            this.f52637b.f52644c.put(mVar, Long.valueOf(j15));
        } else {
            c2.g("PdfBox-Android", "Cannot add XRef entry for '" + mVar.g() + "' because XRef start was not signalled.");
        }
    }
}
