package ea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00022\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "T", "", "backStack", "Lea/o;", "entryDecorators", "Lkotlin/Function1;", "Lea/m;", "entryProvider", "s", "(Ljava/util/List;Ljava/util/List;Ler/l;Lm2/r;II)Ljava/util/List;", "entries", "t", "(Ljava/util/List;Ljava/util/List;Lm2/r;II)Ljava/util/List;", "entry", "decorators", "", "keysInBackstack", "keysInComposition", "n", "(Lea/m;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lm2/r;I)Lea/m;", "Loq/i0;", "f", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lm2/r;I)V", "latestDecorators", "latestEntries", "navigation3-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ea/f$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f48823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f48824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f48825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f6 f48826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f6 f48827e;

        public a(Object obj, Set set, Set set2, f6 f6Var, f6 f6Var2) {
            this.f48823a = obj;
            this.f48824b = set;
            this.f48825c = set2;
            this.f48826d = f6Var;
            this.f48827e = f6Var2;
        }

        @Override // p076m2.r0
        public void j() {
            ArrayList arrayList;
            List listG = f.g(this.f48826d);
            if (listG instanceof RandomAccess) {
                arrayList = new ArrayList(listG.size());
                int size = listG.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList.add(((NavEntry) listG.get(i15)).getContentKey());
                }
            } else {
                List list = listG;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NavEntry) it.next()).getContentKey());
                }
            }
            if (!(arrayList.contains(this.f48823a) ? false : this.f48824b.remove(this.f48823a)) || this.f48825c.contains(this.f48823a)) {
                return;
            }
            List listH = f.h(this.f48827e);
            if (!(listH instanceof RandomAccess)) {
                Iterator it4 = pq.v.N0(listH).iterator();
                while (it4.hasNext()) {
                    ((o) it4.next()).d().b(this.f48823a);
                }
                return;
            }
            int size2 = listH.size() - 1;
            if (size2 < 0) {
                return;
            }
            while (true) {
                int i16 = size2 - 1;
                ((o) listH.get(size2)).d().b(this.f48823a);
                if (i16 < 0) {
                    return;
                } else {
                    size2 = i16;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ea/f$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f48828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f48829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f48830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f6 f48831d;

        public b(Set set, Object obj, Set set2, f6 f6Var) {
            this.f48828a = set;
            this.f48829b = obj;
            this.f48830c = set2;
            this.f48831d = f6Var;
        }

        @Override // p076m2.r0
        public void j() {
            boolean zRemove = this.f48828a.remove(this.f48829b);
            if (this.f48830c.contains(this.f48829b) || !zRemove) {
                return;
            }
            List listO = f.o(this.f48831d);
            if (!(listO instanceof RandomAccess)) {
                Iterator it = pq.v.N0(listO).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).d().b(this.f48829b);
                }
                return;
            }
            int size = listO.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i15 = size - 1;
                ((o) listO.get(size)).d().b(this.f48829b);
                if (i15 < 0) {
                    return;
                } else {
                    size = i15;
                }
            }
        }
    }

    private static final <T> void f(final List<NavEntry<T>> list, final List<? extends o<T>> list2, final Set<Object> set, final Set<Object> set2, p076m2.r rVar, final int i15) {
        final Set<Object> set3 = set;
        final Set<Object> set4 = set2;
        p076m2.r rVarH = rVar.h(-720826424);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(set3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(set4) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-720826424, i16, -1, "androidx.navigation3.runtime.PrepareBackStack (DecoratedNavEntries.kt:246)");
            }
            final f6 f6VarP = x5.p(list, rVarH, i16 & 14);
            final f6 f6VarP2 = x5.p(list2, rVarH, (i16 >> 3) & 14);
            if (list instanceof RandomAccess) {
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    final Object contentKey = list.get(i17).getContentKey();
                    set3.add(contentKey);
                    List listF1 = pq.v.f1(list);
                    boolean zW = rVarH.W(f6VarP) | rVarH.G(contentKey) | rVarH.G(set3) | rVarH.G(set4) | rVarH.W(f6VarP2);
                    Object objE = rVarH.E();
                    if (zW || objE == p076m2.r.INSTANCE.a()) {
                        er.l lVar = new er.l() { // from class: ea.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.i(contentKey, set3, set4, f6VarP, f6VarP2, (s0) obj);
                            }
                        };
                        rVarH.v(lVar);
                        objE = lVar;
                    }
                    Function0.b(contentKey, listF1, (er.l) objE, rVarH, 0);
                }
            } else {
                List<NavEntry<T>> list3 = list;
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    final Object contentKey2 = ((NavEntry) it.next()).getContentKey();
                    set3.add(contentKey2);
                    List listF2 = pq.v.f1(list3);
                    boolean zW2 = rVarH.W(f6VarP) | rVarH.G(contentKey2) | rVarH.G(set3) | rVarH.G(set4) | rVarH.W(f6VarP2);
                    Object objE2 = rVarH.E();
                    if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                        er.l lVar2 = new er.l() { // from class: ea.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.i(contentKey2, set3, set4, f6VarP, f6VarP2, (s0) obj);
                            }
                        };
                        rVarH.v(lVar2);
                        objE2 = lVar2;
                    }
                    Function0.b(contentKey2, listF2, (er.l) objE2, rVarH, 0);
                    set3 = set;
                    set4 = set2;
                }
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ea.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.j(list, list2, set, set2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<NavEntry<T>> g(f6<? extends List<NavEntry<T>>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<o<T>> h(f6<? extends List<? extends o<T>>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 i(Object obj, Set set, Set set2, f6 f6Var, f6 f6Var2, s0 s0Var) {
        return new a(obj, set, set2, f6Var, f6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(List list, List list2, Set set, Set set2, int i15, p076m2.r rVar, int i16) {
        f(list, list2, set, set2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final <T> NavEntry<T> n(final NavEntry<T> navEntry, final List<? extends o<T>> list, final Set<Object> set, final Set<Object> set2, p076m2.r rVar, int i15) {
        rVar.X(-1239021605);
        if (p076m2.t.k()) {
            p076m2.t.o(-1239021605, i15, -1, "androidx.navigation3.runtime.decorateEntry (DecoratedNavEntries.kt:192)");
        }
        final f6 f6VarP = x5.p(list, rVar, (i15 >> 3) & 14);
        final Object contentKey = navEntry.getContentKey();
        rVar.J(-993800456, contentKey);
        NavEntry<T> navEntry2 = new NavEntry<>(navEntry, y2.m.d(-1349345695, true, new er.q() { // from class: ea.a
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f.p(set2, contentKey, set, f6VarP, list, navEntry, obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54));
        rVar.U();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return navEntry2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<o<T>> o(f6<? extends List<? extends o<T>>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final Set set, final Object obj, final Set set2, final f6 f6Var, List list, final NavEntry navEntry, Object obj2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1349345695, i15, -1, "androidx.navigation3.runtime.decorateEntry.<anonymous>.<anonymous> (DecoratedNavEntries.kt:203)");
            }
            boolean zG = rVar.G(set) | rVar.G(obj) | rVar.G(set2) | rVar.W(f6Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ea.d
                    @Override // er.l
                    public final Object b(Object obj3) {
                        return f.q(set, obj, set2, f6Var, (s0) obj3);
                    }
                };
                rVar.v(objE);
            }
            Function0.a(obj, (er.l) objE, rVar, 0);
            rVar.X(358947325);
            List listA = k.a(list);
            if (!listA.isEmpty()) {
                ListIterator listIterator = listA.listIterator(listA.size());
                while (listIterator.hasPrevious()) {
                    final o oVar = (o) listIterator.previous();
                    navEntry = new NavEntry(navEntry, y2.m.d(-330823412, true, new er.q() { // from class: ea.e
                        @Override // er.q
                        public final Object w(Object obj3, Object obj4, Object obj5) {
                            return f.r(oVar, navEntry, obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
                        }
                    }, rVar, 54));
                }
            }
            rVar.R();
            navEntry.b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 q(Set set, Object obj, Set set2, f6 f6Var, s0 s0Var) {
        set.add(obj);
        return new b(set, obj, set2, f6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(o oVar, NavEntry navEntry, Object obj, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-330823412, i15, -1, "androidx.navigation3.runtime.decorateEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoratedNavEntries.kt:226)");
            }
            oVar.c().w(navEntry, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final <T> List<NavEntry<T>> s(List<? extends T> list, List<o<T>> list2, er.l<? super T, NavEntry<T>> lVar, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            list2 = pq.v.n();
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-252980644, i15, -1, "androidx.navigation3.runtime.rememberDecoratedNavEntries (DecoratedNavEntries.kt:121)");
        }
        List<? extends T> list3 = list;
        boolean zW = rVar.W(pq.v.f1(list3));
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            if (list instanceof RandomAccess) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    arrayList.add(lVar.b(list.get(i17)));
                }
                objE = arrayList;
            } else {
                ArrayList arrayList2 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(lVar.b(it.next()));
                }
                objE = arrayList2;
            }
            rVar.v(objE);
        }
        List<NavEntry<T>> listT = t((List) objE, list2, rVar, i15 & 112, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return listT;
    }

    public static final <T> List<NavEntry<T>> t(List<NavEntry<T>> list, List<o<T>> list2, p076m2.r rVar, int i15, int i16) {
        p076m2.r rVar2;
        ArrayList arrayList;
        if ((i16 & 2) != 0) {
            list2 = pq.v.n();
        }
        List<o<T>> list3 = list2;
        if (p076m2.t.k()) {
            p076m2.t.o(-817760945, i15, -1, "androidx.navigation3.runtime.rememberDecoratedNavEntries (DecoratedNavEntries.kt:166)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = new LinkedHashSet();
            rVar.v(objE);
        }
        Set set = (Set) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = new LinkedHashSet();
            rVar.v(objE2);
        }
        Set set2 = (Set) objE2;
        rVar.X(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i17 = 0;
            while (i17 < size) {
                p076m2.r rVar3 = rVar;
                arrayList.add(n(list.get(i17), list3, set, set2, rVar3, i15 & 112));
                i17++;
                rVar = rVar3;
            }
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            List<NavEntry<T>> list4 = list;
            arrayList = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(n((NavEntry) it.next(), list3, set, set2, rVar2, i15 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        rVar2.R();
        f(arrayList2, list3, set, set2, rVar2, i15 & 112);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return arrayList2;
    }
}
