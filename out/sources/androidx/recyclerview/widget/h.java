package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f13315a = new a();

    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f13318a - dVar2.f13318a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i15, int i16);

        public abstract boolean b(int i15, int i16);

        public abstract Object c(int i15, int i16);

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f13316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13317b;

        c(int i15) {
            int[] iArr = new int[i15];
            this.f13316a = iArr;
            this.f13317b = iArr.length / 2;
        }

        int[] a() {
            return this.f13316a;
        }

        int b(int i15) {
            return this.f13316a[i15 + this.f13317b];
        }

        void c(int i15, int i16) {
            this.f13316a[i15 + this.f13317b] = i16;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13320c;

        d(int i15, int i16, int i17) {
            this.f13318a = i15;
            this.f13319b = i16;
            this.f13320c = i17;
        }

        int a() {
            return this.f13318a + this.f13320c;
        }

        int b() {
            return this.f13319b + this.f13320c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f13321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f13322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f13323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f13324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f13325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f13326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f13327g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z15) {
            this.f13321a = list;
            this.f13322b = iArr;
            this.f13323c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f13324d = bVar;
            this.f13325e = bVar.e();
            this.f13326f = bVar.d();
            this.f13327g = z15;
            a();
            d();
        }

        private void a() {
            d dVar = this.f13321a.isEmpty() ? null : this.f13321a.get(0);
            if (dVar == null || dVar.f13318a != 0 || dVar.f13319b != 0) {
                this.f13321a.add(0, new d(0, 0, 0));
            }
            this.f13321a.add(new d(this.f13325e, this.f13326f, 0));
        }

        private void c(int i15) {
            int size = this.f13321a.size();
            int iB = 0;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar = this.f13321a.get(i16);
                while (iB < dVar.f13319b) {
                    if (this.f13323c[iB] == 0 && this.f13324d.b(i15, iB)) {
                        int i17 = this.f13324d.a(i15, iB) ? 8 : 4;
                        this.f13322b[i15] = (iB << 4) | i17;
                        this.f13323c[iB] = (i15 << 4) | i17;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void d() {
            for (d dVar : this.f13321a) {
                for (int i15 = 0; i15 < dVar.f13320c; i15++) {
                    int i16 = dVar.f13318a + i15;
                    int i17 = dVar.f13319b + i15;
                    int i18 = this.f13324d.a(i16, i17) ? 1 : 2;
                    this.f13322b[i16] = (i17 << 4) | i18;
                    this.f13323c[i17] = (i16 << 4) | i18;
                }
            }
            if (this.f13327g) {
                e();
            }
        }

        private void e() {
            int iA = 0;
            for (d dVar : this.f13321a) {
                while (iA < dVar.f13318a) {
                    if (this.f13322b[iA] == 0) {
                        c(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static g f(Collection<g> collection, int i15, boolean z15) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f13328a == i15 && next.f13330c == z15) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z15) {
                    next2.f13329b--;
                } else {
                    next2.f13329b++;
                }
            }
            return next;
        }

        public void b(n nVar) {
            int i15;
            androidx.recyclerview.widget.e eVar = nVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) nVar : new androidx.recyclerview.widget.e(nVar);
            int i16 = this.f13325e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i17 = this.f13325e;
            int i18 = this.f13326f;
            for (int size = this.f13321a.size() - 1; size >= 0; size--) {
                d dVar = this.f13321a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i17 <= iA) {
                        break;
                    }
                    i17--;
                    int i19 = this.f13322b[i17];
                    if ((i19 & 12) != 0) {
                        int i25 = i19 >> 4;
                        g gVarF = f(arrayDeque, i25, false);
                        if (gVarF != null) {
                            int i26 = (i16 - gVarF.f13329b) - 1;
                            eVar.d(i17, i26);
                            if ((i19 & 4) != 0) {
                                eVar.c(i26, 1, this.f13324d.c(i17, i25));
                            }
                        } else {
                            arrayDeque.add(new g(i17, (i16 - i17) - 1, true));
                        }
                    } else {
                        eVar.b(i17, 1);
                        i16--;
                    }
                }
                while (i18 > iB) {
                    i18--;
                    int i27 = this.f13323c[i18];
                    if ((i27 & 12) != 0) {
                        int i28 = i27 >> 4;
                        g gVarF2 = f(arrayDeque, i28, true);
                        if (gVarF2 == null) {
                            arrayDeque.add(new g(i18, i16 - i17, false));
                        } else {
                            eVar.d((i16 - gVarF2.f13329b) - 1, i17);
                            if ((i27 & 4) != 0) {
                                eVar.c(i17, 1, this.f13324d.c(i28, i18));
                            }
                        }
                    } else {
                        eVar.a(i17, 1);
                        i16++;
                    }
                }
                int i29 = dVar.f13318a;
                int i35 = dVar.f13319b;
                for (i15 = 0; i15 < dVar.f13320c; i15++) {
                    if ((this.f13322b[i29] & 15) == 2) {
                        eVar.c(i29, 1, this.f13324d.c(i29, i35));
                    }
                    i29++;
                    i35++;
                }
                i17 = dVar.f13318a;
                i18 = dVar.f13319b;
            }
            eVar.e();
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(T t15, T t16);

        public abstract boolean b(T t15, T t16);

        public Object c(T t15, T t16) {
            return null;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13330c;

        g(int i15, int i16, boolean z15) {
            this.f13328a = i15;
            this.f13329b = i16;
            this.f13330c = z15;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    static class C0279h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13334d;

        public C0279h() {
        }

        int a() {
            return this.f13334d - this.f13333c;
        }

        int b() {
            return this.f13332b - this.f13331a;
        }

        public C0279h(int i15, int i16, int i17, int i18) {
            this.f13331a = i15;
            this.f13332b = i16;
            this.f13333c = i17;
            this.f13334d = i18;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13339e;

        i() {
        }

        int a() {
            return Math.min(this.f13337c - this.f13335a, this.f13338d - this.f13336b);
        }

        boolean b() {
            return this.f13338d - this.f13336b != this.f13337c - this.f13335a;
        }

        boolean c() {
            return this.f13338d - this.f13336b > this.f13337c - this.f13335a;
        }

        d d() {
            if (!b()) {
                int i15 = this.f13335a;
                return new d(i15, this.f13336b, this.f13337c - i15);
            }
            if (this.f13339e) {
                return new d(this.f13335a, this.f13336b, a());
            }
            return c() ? new d(this.f13335a, this.f13336b + 1, a()) : new d(this.f13335a + 1, this.f13336b, a());
        }
    }

    private static i a(C0279h c0279h, b bVar, c cVar, c cVar2, int i15) {
        int iB;
        int i16;
        int i17;
        boolean z15 = (c0279h.b() - c0279h.a()) % 2 == 0;
        int iB2 = c0279h.b() - c0279h.a();
        int i18 = -i15;
        for (int i19 = i18; i19 <= i15; i19 += 2) {
            if (i19 == i18 || (i19 != i15 && cVar2.b(i19 + 1) < cVar2.b(i19 - 1))) {
                iB = cVar2.b(i19 + 1);
                i16 = iB;
            } else {
                iB = cVar2.b(i19 - 1);
                i16 = iB - 1;
            }
            int i25 = c0279h.f13334d - ((c0279h.f13332b - i16) - i19);
            int i26 = (i15 == 0 || i16 != iB) ? i25 : i25 + 1;
            while (i16 > c0279h.f13331a && i25 > c0279h.f13333c && bVar.b(i16 - 1, i25 - 1)) {
                i16--;
                i25--;
            }
            cVar2.c(i19, i16);
            if (z15 && (i17 = iB2 - i19) >= i18 && i17 <= i15 && cVar.b(i17) >= i16) {
                i iVar = new i();
                iVar.f13335a = i16;
                iVar.f13336b = i25;
                iVar.f13337c = iB;
                iVar.f13338d = i26;
                iVar.f13339e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z15) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0279h(0, iE, 0, iD));
        int i15 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i15);
        c cVar2 = new c(i15);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0279h c0279h = (C0279h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c0279h, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                C0279h c0279h2 = arrayList3.isEmpty() ? new C0279h() : (C0279h) arrayList3.remove(arrayList3.size() - 1);
                c0279h2.f13331a = c0279h.f13331a;
                c0279h2.f13333c = c0279h.f13333c;
                c0279h2.f13332b = iVarE.f13335a;
                c0279h2.f13334d = iVarE.f13336b;
                arrayList2.add(c0279h2);
                c0279h.f13332b = c0279h.f13332b;
                c0279h.f13334d = c0279h.f13334d;
                c0279h.f13331a = iVarE.f13337c;
                c0279h.f13333c = iVarE.f13338d;
                arrayList2.add(c0279h);
            } else {
                arrayList3.add(c0279h);
            }
        }
        Collections.sort(arrayList, f13315a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z15);
    }

    private static i d(C0279h c0279h, b bVar, c cVar, c cVar2, int i15) {
        int iB;
        int i16;
        int i17;
        boolean z15 = Math.abs(c0279h.b() - c0279h.a()) % 2 == 1;
        int iB2 = c0279h.b() - c0279h.a();
        int i18 = -i15;
        for (int i19 = i18; i19 <= i15; i19 += 2) {
            if (i19 == i18 || (i19 != i15 && cVar.b(i19 + 1) > cVar.b(i19 - 1))) {
                iB = cVar.b(i19 + 1);
                i16 = iB;
            } else {
                iB = cVar.b(i19 - 1);
                i16 = iB + 1;
            }
            int i25 = (c0279h.f13333c + (i16 - c0279h.f13331a)) - i19;
            int i26 = (i15 == 0 || i16 != iB) ? i25 : i25 - 1;
            while (i16 < c0279h.f13332b && i25 < c0279h.f13334d && bVar.b(i16, i25)) {
                i16++;
                i25++;
            }
            cVar.c(i19, i16);
            if (z15 && (i17 = iB2 - i19) >= i18 + 1 && i17 <= i15 - 1 && cVar2.b(i17) <= i16) {
                i iVar = new i();
                iVar.f13335a = iB;
                iVar.f13336b = i26;
                iVar.f13337c = i16;
                iVar.f13338d = i25;
                iVar.f13339e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0279h c0279h, b bVar, c cVar, c cVar2) {
        if (c0279h.b() >= 1 && c0279h.a() >= 1) {
            int iB = ((c0279h.b() + c0279h.a()) + 1) / 2;
            cVar.c(1, c0279h.f13331a);
            cVar2.c(1, c0279h.f13332b);
            for (int i15 = 0; i15 < iB; i15++) {
                i iVarD = d(c0279h, bVar, cVar, cVar2, i15);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c0279h, bVar, cVar, cVar2, i15);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
