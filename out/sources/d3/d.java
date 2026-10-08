package d3;

import c3.l;
import c3.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n2.f;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.e1;
import r0.h1;
import t2.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0016\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"$\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u0010 \u0012\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lt2/e;", "Ld3/b;", "Lc3/l;", "parent", "", "readonly", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "writeObserver", "Loq/r;", "Ld3/a;", "", "g", "(Lt2/e;Lc3/l;ZLer/l;Ler/l;)Loq/r;", "a", "b", "f", "(Ler/l;Ler/l;)Ler/l;", "result", "observerMap", "c", "(Lt2/e;Lc3/l;Lc3/l;Ljava/util/Map;)V", "snapshot", "e", "(Lc3/l;)V", "Lr0/h1;", "Lc3/u0;", "changes", "d", "(Lc3/l;Lr0/h1;)V", "Lt2/e;", "getObservers$annotations", "()V", "observers", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e<? extends b> f39530a;

    public static final void c(e<? extends b> eVar, l lVar, l lVar2, Map<b, a> map) {
        int size = eVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = eVar.get(i15);
            bVar.b(lVar2, lVar, map != null ? map.get(bVar) : null);
        }
    }

    public static final void d(l lVar, h1<u0> h1Var) {
        Set<? extends Object> setE;
        e<? extends b> eVar = f39530a;
        if (eVar == null || eVar.isEmpty()) {
            return;
        }
        if (h1Var == null || (setE = f.a(h1Var)) == null) {
            setE = e1.e();
        }
        int size = eVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            eVar.get(i15).c(lVar, setE);
        }
    }

    public static final void e(l lVar) {
        e<? extends b> eVar = f39530a;
        if (eVar != null) {
            int size = eVar.size();
            for (int i15 = 0; i15 < size; i15++) {
                eVar.get(i15).d(lVar);
            }
        }
    }

    private static final er.l<Object, i0> f(final er.l<Object, i0> lVar, final er.l<Object, i0> lVar2) {
        if (lVar == null || lVar2 == null) {
            return lVar == null ? lVar2 : lVar;
        }
        return new er.l() { // from class: d3.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.h(lVar, lVar2, obj);
            }
        };
    }

    public static final r<a, Map<b, a>> g(e<? extends b> eVar, l lVar, boolean z15, er.l<Object, i0> lVar2, er.l<Object, i0> lVar3) {
        int size = eVar.size();
        LinkedHashMap linkedHashMap = null;
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = eVar.get(i15);
            a aVarA = bVar.a(lVar, z15);
            if (aVarA != null) {
                lVar2 = f(aVarA.a(), lVar2);
                lVar3 = f(aVarA.b(), lVar3);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(bVar, aVarA);
            }
        }
        return y.a(new a(lVar2, lVar3), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.l lVar, er.l lVar2, Object obj) {
        lVar.b(obj);
        lVar2.b(obj);
        return i0.f148189a;
    }
}
