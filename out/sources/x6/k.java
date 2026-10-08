package x6;

import android.content.Context;
import er.p;
import er.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "", "sharedPreferencesName", "", "keysToMigrate", "Lw6/b;", "Ly6/h;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lw6/b;", "Lkotlin/Function3;", "Lw6/d;", "Ltq/e;", "", "d", "()Ler/q;", "Lkotlin/Function2;", "", "e", "(Ljava/util/Set;)Ler/p;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f216971a = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw6/d;", "sharedPrefs", "Ly6/h;", "currentData", "<anonymous>", "(Lw6/d;Ly6/h;)Ly6/h;"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements q<w6.d, y6.h, tq.e<? super y6.h>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216974g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f216972e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            w6.d dVar = (w6.d) this.f216973f;
            y6.h hVar = (y6.h) this.f216974g;
            Set<y6.h.a<?>> setKeySet = hVar.a().keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((y6.h.a) it.next()).getName());
            }
            Map<String, Object> mapA = dVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            y6.d dVarC = hVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    dVarC.k(y6.k.a(str), value);
                } else if (value instanceof Float) {
                    dVarC.k(y6.k.d(str), value);
                } else if (value instanceof Integer) {
                    dVarC.k(y6.k.e(str), value);
                } else if (value instanceof Long) {
                    dVarC.k(y6.k.f(str), value);
                } else if (value instanceof String) {
                    dVarC.k(y6.k.g(str), value);
                } else if (value instanceof Set) {
                    dVarC.k(y6.k.h(str), (Set) value);
                }
            }
            return dVarC.d();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w6.d dVar, y6.h hVar, tq.e<? super y6.h> eVar) {
            a aVar = new a(eVar);
            aVar.f216973f = dVar;
            aVar.f216974g = hVar;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/h;", "prefs", "", "<anonymous>", "(Ly6/h;)Z"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements p<y6.h, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<String> f216977g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f216977g = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f216975e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Set<y6.h.a<?>> setKeySet = ((y6.h) this.f216976f).a().keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((y6.h.a) it.next()).getName());
            }
            boolean z15 = true;
            if (this.f216977g != k.c()) {
                Set<String> set = this.f216977g;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z15 = false;
                } else {
                    Iterator<T> it4 = set.iterator();
                    while (it4.hasNext()) {
                        if (!arrayList.contains((String) it4.next())) {
                        }
                    }
                    z15 = false;
                }
            }
            return vq.b.a(z15);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(y6.h hVar, tq.e<? super Boolean> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f216977g, eVar);
            bVar.f216976f = obj;
            return bVar;
        }
    }

    public static final w6.b<y6.h> a(Context context, String str, Set<String> set) {
        if (set != f216971a) {
            return new w6.b<>(context, str, set, e(set), d());
        }
        return new w6.b<>(context, str, null, e(set), d(), 4, null);
    }

    public static /* synthetic */ w6.b b(Context context, String str, Set set, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            set = f216971a;
        }
        return a(context, str, set);
    }

    public static final Set<String> c() {
        return f216971a;
    }

    private static final q<w6.d, y6.h, tq.e<? super y6.h>, Object> d() {
        return new a(null);
    }

    private static final p<y6.h, tq.e<? super Boolean>, Object> e(Set<String> set) {
        return new b(set, null);
    }
}
