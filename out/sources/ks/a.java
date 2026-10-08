package ks;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oq.i0;
import ot.w;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: ks.a$a, reason: collision with other inner class name */
    static class C2719a extends dt.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f112299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f112300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f112301c;

        /* JADX INFO: renamed from: ks.a$a$a, reason: collision with other inner class name */
        class C2720a implements er.l<vr.b, i0> {
            C2720a() {
            }

            private static /* synthetic */ void c(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // er.l
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public i0 b(vr.b bVar) {
                if (bVar == null) {
                    c(0);
                }
                C2719a.this.f112299a.a(bVar);
                return i0.f148189a;
            }
        }

        C2719a(w wVar, Set set, boolean z15) {
            this.f112299a = wVar;
            this.f112300b = set;
            this.f112301c = z15;
        }

        private static /* synthetic */ void f(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "fromSuper";
            } else if (i15 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i15 == 3) {
                objArr[0] = "member";
            } else if (i15 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i15 == 1 || i15 == 2) {
                objArr[2] = "conflict";
            } else if (i15 == 3 || i15 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // dt.n
        public void a(vr.b bVar) {
            if (bVar == null) {
                f(0);
            }
            dt.o.K(bVar, new C2720a());
            this.f112300b.add(bVar);
        }

        @Override // dt.n
        public void d(vr.b bVar, Collection<? extends vr.b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f112301c || bVar.k() == vr.b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // dt.m
        public void e(vr.b bVar, vr.b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i15) {
        String str = i15 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 18 ? 3 : 2];
        switch (i15) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i15 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i15) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static t1 b(zs.f fVar, vr.e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<vr.d> collectionP = eVar.p();
        if (collectionP.size() != 1) {
            return null;
        }
        for (t1 t1Var : collectionP.iterator().next().l()) {
            if (t1Var.getName().equals(fVar)) {
                return t1Var;
            }
        }
        return null;
    }

    private static <D extends vr.b> Collection<D> c(zs.f fVar, Collection<D> collection, Collection<D> collection2, vr.e eVar, w wVar, dt.o oVar, boolean z15) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (wVar == null) {
            a(16);
        }
        if (oVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.v(fVar, collection, collection2, eVar, new C2719a(wVar, linkedHashSet, z15));
        return linkedHashSet;
    }

    public static <D extends vr.b> Collection<D> d(zs.f fVar, Collection<D> collection, Collection<D> collection2, vr.e eVar, w wVar, dt.o oVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (wVar == null) {
            a(4);
        }
        if (oVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, false);
    }

    public static <D extends vr.b> Collection<D> e(zs.f fVar, Collection<D> collection, Collection<D> collection2, vr.e eVar, w wVar, dt.o oVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (wVar == null) {
            a(10);
        }
        if (oVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, true);
    }
}
