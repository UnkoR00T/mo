package zj;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    private static class b<T> implements q<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends q<? super T>> f235417a;

        @Override // zj.q
        public boolean apply(T t15) {
            for (int i15 = 0; i15 < this.f235417a.size(); i15++) {
                if (!this.f235417a.get(i15).apply(t15)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f235417a.equals(((b) obj).f235417a);
            }
            return false;
        }

        public int hashCode() {
            return this.f235417a.hashCode() + 306654252;
        }

        public String toString() {
            return r.e("and", this.f235417a);
        }

        private b(List<? extends q<? super T>> list) {
            this.f235417a = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class c implements q<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f235418a = new a("ALWAYS_TRUE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f235419b = new b("ALWAYS_FALSE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f235420c = new C6352c("IS_NULL", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f235421d = new d("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f235422e = b();

        final enum a extends c {
            a(String str, int i15) {
                super(str, i15);
            }

            @Override // zj.q
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        final enum b extends c {
            b(String str, int i15) {
                super(str, i15);
            }

            @Override // zj.q
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* JADX INFO: renamed from: zj.r$c$c, reason: collision with other inner class name */
        final enum C6352c extends c {
            C6352c(String str, int i15) {
                super(str, i15);
            }

            @Override // zj.q
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        final enum d extends c {
            d(String str, int i15) {
                super(str, i15);
            }

            @Override // zj.q
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private c(String str, int i15) {
            super(str, i15);
        }

        private static /* synthetic */ c[] b() {
            return new c[]{f235418a, f235419b, f235420c, f235421d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f235422e.clone();
        }

        <T> q<T> e() {
            return this;
        }
    }

    public static <T> q<T> b() {
        return c.f235418a.e();
    }

    public static <T> q<T> c(q<? super T> qVar, q<? super T> qVar2) {
        return new b(d((q) p.q(qVar), (q) p.q(qVar2)));
    }

    private static <T> List<q<? super T>> d(q<? super T> qVar, q<? super T> qVar2) {
        return Arrays.asList(qVar, qVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, Iterable<?> iterable) {
        StringBuilder sb5 = new StringBuilder("Predicates.");
        sb5.append(str);
        sb5.append('(');
        boolean z15 = true;
        for (Object obj : iterable) {
            if (!z15) {
                sb5.append(',');
            }
            sb5.append(obj);
            z15 = false;
        }
        sb5.append(')');
        return sb5.toString();
    }
}
