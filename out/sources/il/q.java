package il;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.i0;

/* JADX INFO: loaded from: classes4.dex */
class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y6.h.a<Long> f93253b = y6.k.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y6.h.a<Long> f93254c = y6.k.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y6.h.a<String> f93255d = y6.k.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final al.c f93256a;

    public q(Context context, String str) {
        this.f93256a = new al.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ i0 a(long j15, y6.d dVar) {
        dVar.k(f93253b, Long.valueOf(j15));
        return null;
    }

    public static /* synthetic */ i0 b(q qVar, String str, String str2, y6.h.a aVar, y6.d dVar) {
        qVar.getClass();
        y6.h.a<String> aVar2 = f93255d;
        if (((String) al.d.a(dVar, aVar2, "")).equals(str)) {
            y6.h.a<Set<String>> aVarI = qVar.i(dVar, str);
            if (aVarI == null || aVarI.getName().equals(str2)) {
                return null;
            }
            qVar.q(dVar, aVar, str);
            return null;
        }
        y6.h.a<Long> aVar3 = f93254c;
        long jLongValue = ((Long) al.d.a(dVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = qVar.e(dVar);
        }
        HashSet hashSet = new HashSet((Collection) al.d.a(dVar, aVar, new HashSet()));
        hashSet.add(str);
        dVar.k(aVar, hashSet);
        dVar.k(aVar3, Long.valueOf(jLongValue + 1));
        dVar.k(aVar2, str);
        return null;
    }

    public static /* synthetic */ i0 c(q qVar, y6.d dVar) {
        qVar.getClass();
        long j15 = 0;
        for (Map.Entry<y6.h.a<?>, Object> entry : dVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                y6.h.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = qVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    dVar.k(key, l.a(new Object[]{strH}));
                    j15++;
                } else {
                    dVar.j(key);
                }
            }
        }
        if (j15 == 0) {
            dVar.j(f93254c);
            return null;
        }
        dVar.k(f93254c, Long.valueOf(j15));
        return null;
    }

    public static /* synthetic */ i0 d(q qVar, String str, y6.d dVar) {
        qVar.getClass();
        dVar.k(f93255d, str);
        qVar.l(dVar, str);
        return null;
    }

    private synchronized long e(y6.d dVar) {
        long j15;
        try {
            long jLongValue = ((Long) al.d.a(dVar, f93254c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<y6.h.a<?>, Object> entry : dVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            dVar.k(y6.k.h(name), hashSet2);
            j15 = jLongValue - 1;
            dVar.k(f93254c, Long.valueOf(j15));
        } catch (Throwable th4) {
            throw th4;
        }
        return j15;
    }

    private synchronized String h(long j15) {
        return new Date(j15).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized y6.h.a<Set<String>> i(y6.d dVar, String str) {
        for (Map.Entry<y6.h.a<?>, Object> entry : dVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return y6.k.h(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(y6.d dVar, String str) {
        try {
            y6.h.a<Set<String>> aVarI = i(dVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) al.d.a(dVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                dVar.j(aVarI);
            } else {
                dVar.k(aVarI, hashSet);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private synchronized void q(y6.d dVar, y6.h.a<Set<String>> aVar, String str) {
        l(dVar, str);
        HashSet hashSet = new HashSet((Collection) al.d.a(dVar, aVar, new HashSet()));
        hashSet.add(str);
        dVar.k(aVar, hashSet);
    }

    synchronized void f() {
        this.f93256a.g(new er.l() { // from class: il.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.c(this.f93251a, (y6.d) obj);
            }
        });
    }

    synchronized List<r> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry<y6.h.a<?>, Object> entry : this.f93256a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(r.a(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th4) {
            throw th4;
        }
        return arrayList;
    }

    synchronized boolean j(long j15, long j16) {
        return h(j15).equals(h(j16));
    }

    synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f93256a.g(new er.l() { // from class: il.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.d(this.f93249a, strH, (y6.d) obj);
            }
        });
    }

    synchronized boolean m(long j15) {
        return n(f93253b, j15);
    }

    synchronized boolean n(y6.h.a<Long> aVar, long j15) {
        if (j(((Long) this.f93256a.j(aVar, -1L)).longValue(), j15)) {
            return false;
        }
        this.f93256a.k(aVar, Long.valueOf(j15));
        return true;
    }

    synchronized void o(long j15, final String str) {
        final String strH = h(j15);
        final y6.h.a<Set<String>> aVarH = y6.k.h(str);
        this.f93256a.g(new er.l() { // from class: il.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.b(this.f93245a, strH, str, aVarH, (y6.d) obj);
            }
        });
    }

    synchronized void p(final long j15) {
        this.f93256a.g(new er.l() { // from class: il.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.a(j15, (y6.d) obj);
            }
        });
    }
}
