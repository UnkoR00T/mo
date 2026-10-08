package js;

import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private static /* synthetic */ void a(int i15) {
        Object[] objArr = new Object[3];
        if (i15 == 1 || i15 == 2) {
            objArr[0] = "companionObject";
        } else if (i15 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i15 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i15 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i15 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(vr.b bVar) {
        vr.w wVarA0;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof z0) && (wVarA0 = ((z0) bVar).A0()) != null && wVarA0.getAnnotations().d2(i0.f104650b)) {
            return true;
        }
        return bVar.getAnnotations().d2(i0.f104650b);
    }

    public static boolean c(vr.m mVar) {
        if (mVar == null) {
            a(1);
        }
        return dt.i.x(mVar) && dt.i.w(mVar.b()) && !d((vr.e) mVar);
    }

    public static boolean d(vr.e eVar) {
        if (eVar == null) {
            a(2);
        }
        return sr.e.a(sr.d.f183551a, eVar);
    }

    public static boolean e(z0 z0Var) {
        if (z0Var == null) {
            a(0);
        }
        if (z0Var.k() == vr.b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(z0Var.b())) {
            return true;
        }
        return dt.i.x(z0Var.b()) && b(z0Var);
    }
}
