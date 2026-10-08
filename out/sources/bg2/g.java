package bg2;

import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import lr.m;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import tq0.OrderedDocumentByNumber;
import tq0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbg2/g;", "Lbg2/f;", "Lmx/c;", "labelProvider", "Llg2/d;", "statusMapper", "<init>", "(Lmx/c;Llg2/d;)V", "Lbg2/f$a;", "params", "", "Ltq0/v;", "b", "(Lbg2/f$a;)Ljava/util/List;", "a", "Lmx/c;", "Llg2/d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lg2.d statusMapper;

    public g(mx.c cVar, lg2.d dVar) {
        this.labelProvider = cVar;
        this.statusMapper = dVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<OrderedDocumentByNumber> a(f.Params params) {
        String lowerCase = params.getQuery().toLowerCase(Locale.ROOT);
        wq.a<tq0.g> aVarE = tq0.g.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
        for (tq0.g gVar : aVarE) {
            linkedHashMap.put(gVar, this.labelProvider.c(lg2.c.a(gVar)).getText().toLowerCase(Locale.ROOT));
        }
        List<OrderedDocumentByNumber> listA = params.a();
        ArrayList arrayList = new ArrayList();
        for (OrderedDocumentByNumber orderedDocumentByNumberB : listA) {
            if (!r.d0(orderedDocumentByNumberB.getNumber().toLowerCase(Locale.ROOT), lowerCase, false, 2, null)) {
                List<k> listD = orderedDocumentByNumberB.d();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = listD.iterator();
                while (true) {
                    boolean z15 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    k kVar = (k) next;
                    String strH = kVar.h();
                    Locale locale = Locale.ROOT;
                    if (!r.d0(strH.toLowerCase(locale), lowerCase, false, 2, null)) {
                        String str = (String) linkedHashMap.get(kVar.getType());
                        if (!(str != null ? r.d0(str, lowerCase, false, 2, null) : false) && !r.d0(this.statusMapper.b(kVar).getText().toLowerCase(locale), lowerCase, false, 2, null)) {
                            z15 = false;
                        }
                    }
                    if (z15) {
                        arrayList2.add(next);
                    }
                }
                orderedDocumentByNumberB = arrayList2.isEmpty() ? null : OrderedDocumentByNumber.b(orderedDocumentByNumberB, null, arrayList2, 1, null);
            }
            if (orderedDocumentByNumberB != null) {
                arrayList.add(orderedDocumentByNumberB);
            }
        }
        return arrayList;
    }
}
