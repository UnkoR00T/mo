package n4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u001b\u001a\u00020\u00022:\u0010\u0019\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00180\u00160\tj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00180\u0016`\n2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\u001ej\b\u0012\u0004\u0012\u00020\u0000`\u001f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006'"}, d2 = {"Ln4/w;", "Lkotlin/Function1;", "", "isVisible", "isFocusableContainer", "", "listToSort", "f", "(Ln4/w;Ler/l;Ler/l;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "geometryList", "Lr0/j0;", "containerMapToChildren", "Loq/i0;", "b", "(Ln4/w;Ljava/util/ArrayList;Ler/l;Ler/l;Lr0/j0;)V", "parentListToSort", "Lr0/q;", "containerChildrenMapping", "d", "(Ln4/w;Ljava/util/List;Ler/l;Lr0/q;)Ljava/util/List;", "Loq/r;", "Lm3/g;", "", "rowGroupings", "node", "c", "(Ljava/util/ArrayList;Ln4/w;)Z", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "[Ljava/util/Comparator;", "semanticComparators", "Lkotlin/Function2;", "", "Ler/p;", "UnmergedConfigComparator", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<w>[] f131265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final er.p<w, w, Integer> f131266b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln4/w;", "a", "b", "", "c", "(Ln4/w;Ln4/w;)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<w, w, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f131267b = new a();

        /* JADX INFO: renamed from: n4.m0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class C3252a extends fr.w implements er.a<Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C3252a f131268b = new C3252a();

            C3252a() {
                super(0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float a() {
                return Float.valueOf(0.0f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class b extends fr.w implements er.a<Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f131269b = new b();

            b() {
                super(0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float a() {
                return Float.valueOf(0.0f);
            }
        }

        a() {
            super(2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer B(w wVar, w wVar2) {
            SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
            c0 c0Var = c0.f131174a;
            return Integer.valueOf(Float.compare(((Number) unmergedConfig.n(c0Var.R(), C3252a.f131268b)).floatValue(), ((Number) wVar2.getUnmergedConfig().n(c0Var.R(), b.f131269b)).floatValue()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f131270b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f131271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f131272b;

        public c(Comparator comparator, Comparator comparator2) {
            this.f131271a = comparator;
            this.f131272b = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            int iCompare = this.f131271a.compare(t15, t16);
            return iCompare != 0 ? iCompare : this.f131272b.compare(((w) t15).getLayoutNode(), ((w) t16).getLayoutNode());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f131273a;

        public d(Comparator comparator) {
            this.f131273a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            int iCompare = this.f131273a.compare(t15, t16);
            return iCompare != 0 ? iCompare : sq.a.e(Integer.valueOf(((w) t15).getId()), Integer.valueOf(((w) t16).getId()));
        }
    }

    static {
        Comparator<w>[] comparatorArr = new Comparator[2];
        int i15 = 0;
        while (i15 < 2) {
            comparatorArr[i15] = new d(new c(i15 == 0 ? m.f131264a : j.f131246a, androidx.compose.ui.node.g.INSTANCE.b()));
            i15++;
        }
        f131265a = comparatorArr;
        f131266b = a.f131267b;
    }

    private static final void b(w wVar, ArrayList<w> arrayList, er.l<? super w, Boolean> lVar, er.l<? super w, Boolean> lVar2, r0.j0<List<w>> j0Var) {
        boolean zBooleanValue = ((Boolean) wVar.getUnmergedConfig().n(c0.f131174a.y(), b.f131270b)).booleanValue();
        if ((zBooleanValue || lVar2.b(wVar).booleanValue()) && lVar.b(wVar).booleanValue()) {
            arrayList.add(wVar);
        }
        if (zBooleanValue) {
            j0Var.r(wVar.getId(), f(wVar, lVar, lVar2, wVar.m()));
            return;
        }
        List<w> listM = wVar.m();
        int size = listM.size();
        for (int i15 = 0; i15 < size; i15++) {
            b(listM.get(i15), arrayList, lVar, lVar2, j0Var);
        }
    }

    private static final boolean c(ArrayList<oq.r<m3.g, List<w>>> arrayList, w wVar) {
        float top = wVar.l().getTop();
        float bottom = wVar.l().getBottom();
        boolean z15 = top >= bottom;
        int iP = pq.v.p(arrayList);
        if (iP >= 0) {
            int i15 = 0;
            while (true) {
                m3.g gVarC = arrayList.get(i15).c();
                boolean z16 = gVarC.getTop() >= gVarC.getBottom();
                if (!z15 && !z16 && Math.max(top, gVarC.getTop()) < Math.min(bottom, gVarC.getBottom())) {
                    arrayList.set(i15, new oq.r<>(gVarC.p(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i15).d()));
                    arrayList.get(i15).d().add(wVar);
                    return true;
                }
                if (i15 != iP) {
                    i15++;
                }
            }
        }
        return false;
    }

    public static final List<w> d(w wVar, List<w> list, er.l<? super w, Boolean> lVar, r0.q<List<w>> qVar) {
        int size = 0;
        char c15 = wVar.r().getLayoutDirection() == c5.t.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iP = pq.v.p(list);
        if (iP >= 0) {
            int i15 = 0;
            while (true) {
                w wVar2 = list.get(i15);
                if (i15 == 0 || !c(arrayList, wVar2)) {
                    arrayList.add(new oq.r(wVar2.l(), pq.v.t(wVar2)));
                }
                if (i15 == iP) {
                    break;
                }
                i15++;
            }
        }
        pq.v.C(arrayList, n0.f131277a);
        ArrayList arrayList2 = new ArrayList();
        Comparator<w> comparator = f131265a[c15 ^ 1];
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            oq.r rVar = (oq.r) arrayList.get(i16);
            pq.v.C((List) rVar.d(), comparator);
            arrayList2.addAll((Collection) rVar.d());
        }
        final er.p<w, w, Integer> pVar = f131266b;
        pq.v.C(arrayList2, new Comparator() { // from class: n4.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m0.e(pVar, obj, obj2);
            }
        });
        while (size <= pq.v.p(arrayList2)) {
            List<w> listB = qVar.b(((w) arrayList2.get(size)).getId());
            if (listB != null) {
                if (lVar.b(arrayList2.get(size)).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, listB);
                size += listB.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(er.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.B(obj, obj2)).intValue();
    }

    public static final List<w> f(w wVar, er.l<? super w, Boolean> lVar, er.l<? super w, Boolean> lVar2, List<w> list) {
        r0.j0 j0VarC = r0.r.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            b(list.get(i15), arrayList, lVar, lVar2, j0VarC);
        }
        return d(wVar, arrayList, lVar2, j0VarC);
    }
}
