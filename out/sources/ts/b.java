package ts;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import js.j0;
import ss.x;
import vr.h1;
import zs.f;

/* JADX INFO: loaded from: classes4.dex */
public class b implements x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f191781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<zs.b, ts.a.EnumC5006a> f191782k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f191783a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f191784b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f191785c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f191786d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f191787e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f191788f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f191789g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ts.a.EnumC5006a f191790h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f191791i = null;

    /* JADX INFO: renamed from: ts.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC5008b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f191792a = new ArrayList();

        private static /* synthetic */ void f(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i15 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i15 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i15 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i15 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ss.x.b
        public void a() {
            g((String[]) this.f191792a.toArray(new String[0]));
        }

        @Override // ss.x.b
        public void b(zs.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // ss.x.b
        public x.a c(zs.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // ss.x.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f191792a.add((String) obj);
            }
        }

        @Override // ss.x.b
        public void e(ft.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    private class c implements x.a {

        class a extends AbstractC5008b {
            a() {
            }

            private static /* synthetic */ void f(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // ts.b.AbstractC5008b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f191787e = strArr;
            }
        }

        /* JADX INFO: renamed from: ts.b$c$b, reason: collision with other inner class name */
        class C5009b extends AbstractC5008b {
            C5009b() {
            }

            private static /* synthetic */ void f(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // ts.b.AbstractC5008b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f191788f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "enumClassId";
            } else if (i15 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i15 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i15 == 1 || i15 == 2) {
                objArr[2] = "visitEnum";
            } else if (i15 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C5009b();
        }

        @Override // ss.x.a
        public void a() {
        }

        @Override // ss.x.a
        public x.a b(f fVar, zs.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ss.x.a
        public void c(f fVar, zs.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ss.x.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strE = fVar.e();
            if ("k".equals(strE)) {
                if (obj instanceof Integer) {
                    b.this.f191790h = ts.a.EnumC5006a.g(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strE)) {
                if (obj instanceof int[]) {
                    b.this.f191783a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strE)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f191784b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strE)) {
                if (obj instanceof Integer) {
                    b.this.f191785c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strE) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f191786d = str2;
            }
        }

        @Override // ss.x.a
        public x.b e(f fVar) {
            String strE = fVar != null ? fVar.e() : null;
            if ("d1".equals(strE)) {
                return h();
            }
            if ("d2".equals(strE)) {
                return i();
            }
            return null;
        }

        @Override // ss.x.a
        public void f(f fVar, ft.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }
    }

    private class d implements x.a {

        class a extends AbstractC5008b {
            a() {
            }

            private static /* synthetic */ void f(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // ts.b.AbstractC5008b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f191791i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "enumClassId";
            } else if (i15 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i15 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i15 == 1 || i15 == 2) {
                objArr[2] = "visitEnum";
            } else if (i15 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // ss.x.a
        public void a() {
        }

        @Override // ss.x.a
        public x.a b(f fVar, zs.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ss.x.a
        public void c(f fVar, zs.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ss.x.a
        public void d(f fVar, Object obj) {
        }

        @Override // ss.x.a
        public x.b e(f fVar) {
            if ("b".equals(fVar != null ? fVar.e() : null)) {
                return h();
            }
            return null;
        }

        @Override // ss.x.a
        public void f(f fVar, ft.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }
    }

    private class e implements x.a {

        class a extends AbstractC5008b {
            a() {
            }

            private static /* synthetic */ void f(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // ts.b.AbstractC5008b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f191787e = strArr;
            }
        }

        /* JADX INFO: renamed from: ts.b$e$b, reason: collision with other inner class name */
        class C5010b extends AbstractC5008b {
            C5010b() {
            }

            private static /* synthetic */ void f(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // ts.b.AbstractC5008b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f191788f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "enumClassId";
            } else if (i15 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i15 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i15 == 1 || i15 == 2) {
                objArr[2] = "visitEnum";
            } else if (i15 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C5010b();
        }

        @Override // ss.x.a
        public void a() {
        }

        @Override // ss.x.a
        public x.a b(f fVar, zs.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ss.x.a
        public void c(f fVar, zs.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ss.x.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strE = fVar.e();
            if ("version".equals(strE)) {
                if (obj instanceof int[]) {
                    b.this.f191783a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strE)) {
                b.this.f191784b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // ss.x.a
        public x.b e(f fVar) {
            String strE = fVar != null ? fVar.e() : null;
            if ("data".equals(strE) || "filePartClassNames".equals(strE)) {
                return h();
            }
            if ("strings".equals(strE)) {
                return i();
            }
            return null;
        }

        @Override // ss.x.a
        public void f(f fVar, ft.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }
    }

    static {
        try {
            f191781j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f191781j = false;
        }
        HashMap map = new HashMap();
        f191782k = map;
        map.put(zs.b.k(new zs.c("kotlin.jvm.internal.KotlinClass")), ts.a.EnumC5006a.CLASS);
        map.put(zs.b.k(new zs.c("kotlin.jvm.internal.KotlinFileFacade")), ts.a.EnumC5006a.FILE_FACADE);
        map.put(zs.b.k(new zs.c("kotlin.jvm.internal.KotlinMultifileClass")), ts.a.EnumC5006a.MULTIFILE_CLASS);
        map.put(zs.b.k(new zs.c("kotlin.jvm.internal.KotlinMultifileClassPart")), ts.a.EnumC5006a.MULTIFILE_CLASS_PART);
        map.put(zs.b.k(new zs.c("kotlin.jvm.internal.KotlinSyntheticClass")), ts.a.EnumC5006a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i15) {
        Object[] objArr = new Object[3];
        if (i15 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        ts.a.EnumC5006a enumC5006a = this.f191790h;
        return enumC5006a == ts.a.EnumC5006a.CLASS || enumC5006a == ts.a.EnumC5006a.FILE_FACADE || enumC5006a == ts.a.EnumC5006a.MULTIFILE_CLASS_PART;
    }

    @Override // ss.x.c
    public void a() {
    }

    @Override // ss.x.c
    public x.a b(zs.b bVar, h1 h1Var) {
        ts.a.EnumC5006a enumC5006a;
        if (bVar == null) {
            d(0);
        }
        if (h1Var == null) {
            d(1);
        }
        zs.c cVarA = bVar.a();
        if (cVarA.equals(j0.f104660a)) {
            return new c();
        }
        if (cVarA.equals(j0.f104679t)) {
            return new d();
        }
        if (f191781j || this.f191790h != null || (enumC5006a = f191782k.get(bVar)) == null) {
            return null;
        }
        this.f191790h = enumC5006a;
        return new e();
    }

    public ts.a m(ws.c cVar) {
        if (this.f191790h == null || this.f191783a == null) {
            return null;
        }
        ws.c cVar2 = new ws.c(this.f191783a, (this.f191785c & 8) != 0);
        if (!cVar2.h(cVar)) {
            this.f191789g = this.f191787e;
            this.f191787e = null;
        } else if (o() && this.f191787e == null) {
            return null;
        }
        String[] strArr = this.f191791i;
        return new ts.a(this.f191790h, cVar2, this.f191787e, this.f191789g, this.f191788f, this.f191784b, this.f191785c, this.f191786d, strArr != null ? ys.a.e(strArr) : null);
    }

    public ts.a n() {
        return m(ws.c.f214749i);
    }
}
