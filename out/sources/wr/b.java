package wr;

/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f214519a;

    public b(h hVar) {
        if (hVar == null) {
            m0(0);
        }
        this.f214519a = hVar;
    }

    private static /* synthetic */ void m0(int i15) {
        String str = i15 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 1 ? 3 : 2];
        if (i15 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i15 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i15 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // wr.a
    public h getAnnotations() {
        h hVar = this.f214519a;
        if (hVar == null) {
            m0(1);
        }
        return hVar;
    }
}
