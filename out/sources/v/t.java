package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static final class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<s> f202847a = new ArrayList();

        a(List<s> list) {
            for (s sVar : list) {
                if (!(sVar instanceof b)) {
                    this.f202847a.add(sVar);
                }
            }
        }

        @Override // v.s
        public void a(int i15) {
            Iterator<s> it = this.f202847a.iterator();
            while (it.hasNext()) {
                it.next().a(i15);
            }
        }

        @Override // v.s
        public void b(int i15, c0 c0Var) {
            Iterator<s> it = this.f202847a.iterator();
            while (it.hasNext()) {
                it.next().b(i15, c0Var);
            }
        }

        @Override // v.s
        public void c(int i15, u uVar) {
            Iterator<s> it = this.f202847a.iterator();
            while (it.hasNext()) {
                it.next().c(i15, uVar);
            }
        }

        @Override // v.s
        public void d(int i15, int i16) {
            Iterator<s> it = this.f202847a.iterator();
            while (it.hasNext()) {
                it.next().d(i15, i16);
            }
        }

        @Override // v.s
        public void e(int i15) {
            Iterator<s> it = this.f202847a.iterator();
            while (it.hasNext()) {
                it.next().e(i15);
            }
        }
    }

    static final class b extends s {
        b() {
        }

        @Override // v.s
        public void b(int i15, c0 c0Var) {
        }

        @Override // v.s
        public void c(int i15, u uVar) {
        }

        @Override // v.s
        public void e(int i15) {
        }
    }

    static s a(List<s> list) {
        if (list.isEmpty()) {
            return c();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    public static s b(s... sVarArr) {
        return a(Arrays.asList(sVarArr));
    }

    public static s c() {
        return new b();
    }
}
