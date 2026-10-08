package wr;

import java.util.Map;
import st.t0;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f214520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<zs.f, ft.g<?>> f214521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1 f214522c;

    public d(t0 t0Var, Map<zs.f, ft.g<?>> map, h1 h1Var) {
        if (t0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (h1Var == null) {
            b(2);
        }
        this.f214520a = t0Var;
        this.f214521b = map;
        this.f214522c = h1Var;
    }

    private static /* synthetic */ void b(int i15) {
        String str = (i15 == 3 || i15 == 4 || i15 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 3 || i15 == 4 || i15 == 5) ? 2 : 3];
        if (i15 == 1) {
            objArr[0] = "valueArguments";
        } else if (i15 == 2) {
            objArr[0] = "source";
        } else if (i15 == 3 || i15 == 4 || i15 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i15 == 3) {
            objArr[1] = "getType";
        } else if (i15 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i15 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i15 != 3 && i15 != 4 && i15 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 3 && i15 != 4 && i15 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // wr.c
    public Map<zs.f, ft.g<?>> a() {
        Map<zs.f, ft.g<?>> map = this.f214521b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // wr.c
    public zs.c g() {
        return c.a.a(this);
    }

    @Override // wr.c
    public t0 getType() {
        t0 t0Var = this.f214520a;
        if (t0Var == null) {
            b(3);
        }
        return t0Var;
    }

    @Override // wr.c
    public h1 m() {
        h1 h1Var = this.f214522c;
        if (h1Var == null) {
            b(5);
        }
        return h1Var;
    }

    public String toString() {
        return ct.n.f37666h.N(this, null);
    }
}
