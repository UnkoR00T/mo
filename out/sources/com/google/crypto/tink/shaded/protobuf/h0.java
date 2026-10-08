package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f36070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f36071b;

    private static final class b extends h0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?> f36072c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j15) {
            return (List) r1.C(obj, j15);
        }

        private static <L> List<L> g(Object obj, long j15, int i15) {
            List<L> listD0;
            List<L> listF = f(obj, j15);
            if (listF.isEmpty()) {
                if (listF instanceof g0) {
                    listD0 = new f0(i15);
                } else {
                    listD0 = ((listF instanceof a1) && (listF instanceof a0.i)) ? ((a0.i) listF).d0(i15) : new ArrayList<>(i15);
                }
                r1.R(obj, j15, listD0);
                return listD0;
            }
            if (f36072c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i15);
                arrayList.addAll(listF);
                r1.R(obj, j15, arrayList);
                return arrayList;
            }
            if (listF instanceof q1) {
                f0 f0Var = new f0(listF.size() + i15);
                f0Var.addAll((q1) listF);
                r1.R(obj, j15, f0Var);
                return f0Var;
            }
            if ((listF instanceof a1) && (listF instanceof a0.i)) {
                a0.i iVar = (a0.i) listF;
                if (!iVar.c0()) {
                    a0.i iVarD0 = iVar.d0(listF.size() + i15);
                    r1.R(obj, j15, iVarD0);
                    return iVarD0;
                }
            }
            return listF;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        void c(Object obj, long j15) {
            Object objUnmodifiableList;
            List list = (List) r1.C(obj, j15);
            if (list instanceof g0) {
                objUnmodifiableList = ((g0) list).n0();
            } else {
                if (f36072c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a1) && (list instanceof a0.i)) {
                    a0.i iVar = (a0.i) list;
                    if (iVar.c0()) {
                        iVar.O();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            r1.R(obj, j15, objUnmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        <E> void d(Object obj, Object obj2, long j15) {
            List listF = f(obj2, j15);
            List listG = g(obj, j15, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            r1.R(obj, j15, listF);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        <L> List<L> e(Object obj, long j15) {
            return g(obj, j15, 10);
        }
    }

    private static final class c extends h0 {
        private c() {
            super();
        }

        static <E> a0.i<E> f(Object obj, long j15) {
            return (a0.i) r1.C(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        void c(Object obj, long j15) {
            f(obj, j15).O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        <E> void d(Object obj, Object obj2, long j15) {
            a0.i iVarF = f(obj, j15);
            a0.i iVarF2 = f(obj2, j15);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.c0()) {
                    iVarF = iVarF.d0(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            r1.R(obj, j15, iVarF2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0
        <L> List<L> e(Object obj, long j15) {
            a0.i iVarF = f(obj, j15);
            if (iVarF.c0()) {
                return iVarF;
            }
            int size = iVarF.size();
            a0.i iVarD0 = iVarF.d0(size == 0 ? 10 : size * 2);
            r1.R(obj, j15, iVarD0);
            return iVarD0;
        }
    }

    static {
        f36070a = new b();
        f36071b = new c();
    }

    static h0 a() {
        return f36070a;
    }

    static h0 b() {
        return f36071b;
    }

    abstract void c(Object obj, long j15);

    abstract <L> void d(Object obj, Object obj2, long j15);

    abstract <L> List<L> e(Object obj, long j15);

    private h0() {
    }
}
