package ot;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f149868a = new a();

    static class a implements w {
        a() {
        }

        private static /* synthetic */ void c(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i15 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ot.w
        public void a(vr.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // ot.w
        public void b(vr.e eVar, List<String> list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(vr.b bVar);

    void b(vr.e eVar, List<String> list);
}
