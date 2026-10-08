package ks;

import java.util.Collections;
import java.util.List;
import qs.r;
import st.t0;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f112331a = new a();

    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i15) {
            Object[] objArr = new Object[3];
            switch (i15) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i15 == 5 || i15 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ks.o
        public void a(vr.b bVar, List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // ks.o
        public b b(r rVar, vr.e eVar, t0 t0Var, t0 t0Var2, List<t1> list, List<m1> list2) {
            if (rVar == null) {
                c(0);
            }
            if (eVar == null) {
                c(1);
            }
            if (t0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(t0Var, t0Var2, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t0 f112332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t0 f112333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<t1> f112334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<m1> f112335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<String> f112336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f112337f;

        public b(t0 t0Var, t0 t0Var2, List<t1> list, List<m1> list2, List<String> list3, boolean z15) {
            if (t0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f112332a = t0Var;
            this.f112333b = t0Var2;
            this.f112334c = list;
            this.f112335d = list2;
            this.f112336e = list3;
            this.f112337f = z15;
        }

        private static /* synthetic */ void a(int i15) {
            String str = (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? 2 : 3];
            switch (i15) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i15 == 4) {
                objArr[1] = "getReturnType";
            } else if (i15 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i15 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i15 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i15 != 4 && i15 != 5 && i15 != 6 && i15 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 != 4 && i15 != 5 && i15 != 6 && i15 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List<String> b() {
            List<String> list = this.f112336e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public t0 c() {
            return this.f112333b;
        }

        public t0 d() {
            t0 t0Var = this.f112332a;
            if (t0Var == null) {
                a(4);
            }
            return t0Var;
        }

        public List<m1> e() {
            List<m1> list = this.f112335d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<t1> f() {
            List<t1> list = this.f112334c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f112337f;
        }
    }

    void a(vr.b bVar, List<String> list);

    b b(r rVar, vr.e eVar, t0 t0Var, t0 t0Var2, List<t1> list, List<m1> list2);
}
