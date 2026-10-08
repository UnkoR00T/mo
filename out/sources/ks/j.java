package ks;

import qs.q;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f112324a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i15) {
            Object[] objArr = new Object[3];
            switch (i15) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i15) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ks.j
        public void a(qs.g gVar, vr.e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }

        @Override // ks.j
        public void b(qs.n nVar, z0 z0Var) {
            if (nVar == null) {
                f(5);
            }
            if (z0Var == null) {
                f(6);
            }
        }

        @Override // ks.j
        public void c(qs.l lVar, vr.l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        @Override // ks.j
        public vr.e d(zs.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // ks.j
        public void e(q qVar, g1 g1Var) {
            if (qVar == null) {
                f(1);
            }
            if (g1Var == null) {
                f(2);
            }
        }
    }

    void a(qs.g gVar, vr.e eVar);

    void b(qs.n nVar, z0 z0Var);

    void c(qs.l lVar, vr.l lVar2);

    vr.e d(zs.c cVar);

    void e(q qVar, g1 g1Var);
}
