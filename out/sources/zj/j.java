package zj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f235408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6351b f235409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C6351b f235410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f235411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f235412e;

        private static final class a extends C6351b {
            private a() {
            }
        }

        /* JADX INFO: renamed from: zj.j$b$b, reason: collision with other inner class name */
        static class C6351b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f235413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f235414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C6351b f235415c;

            C6351b() {
            }
        }

        private C6351b f() {
            C6351b c6351b = new C6351b();
            this.f235410c.f235415c = c6351b;
            this.f235410c = c6351b;
            return c6351b;
        }

        private b g(Object obj) {
            f().f235414b = obj;
            return this;
        }

        private b h(String str, Object obj) {
            C6351b c6351bF = f();
            c6351bF.f235414b = obj;
            c6351bF.f235413a = (String) p.q(str);
            return this;
        }

        private a i() {
            a aVar = new a();
            this.f235410c.f235415c = aVar;
            this.f235410c = aVar;
            return aVar;
        }

        private b j(String str, Object obj) {
            a aVarI = i();
            aVarI.f235414b = obj;
            aVarI.f235413a = (String) p.q(str);
            return this;
        }

        private static boolean l(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof m) {
                return !((m) obj).b();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d15) {
            return j(str, String.valueOf(d15));
        }

        public b b(String str, int i15) {
            return j(str, String.valueOf(i15));
        }

        public b c(String str, long j15) {
            return j(str, String.valueOf(j15));
        }

        public b d(String str, Object obj) {
            return h(str, obj);
        }

        public b e(String str, boolean z15) {
            return j(str, String.valueOf(z15));
        }

        public b k(Object obj) {
            return g(obj);
        }

        public b m() {
            this.f235411d = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z15 = this.f235411d;
            boolean z16 = this.f235412e;
            StringBuilder sb5 = new StringBuilder(32);
            sb5.append(this.f235408a);
            sb5.append('{');
            String str2 = "";
            for (C6351b c6351b = this.f235409b.f235415c; c6351b != null; c6351b = c6351b.f235415c) {
                Object obj = c6351b.f235414b;
                if (c6351b instanceof a) {
                    sb5.append(str2);
                    str = c6351b.f235413a;
                    if (str != null) {
                        sb5.append(str);
                        sb5.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb5.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb5.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z15) {
                        sb5.append(str2);
                        str = c6351b.f235413a;
                        if (str != null) {
                            sb5.append(str);
                            sb5.append('=');
                        }
                        if (obj == null) {
                            sb5.append(obj);
                        } else {
                            sb5.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z16 || !l(obj)) {
                    sb5.append(str2);
                    str = c6351b.f235413a;
                    if (str != null) {
                        sb5.append(str);
                        sb5.append('=');
                    }
                    if (obj == null) {
                        sb5.append(obj);
                    } else {
                        sb5.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb5.append('}');
            return sb5.toString();
        }

        private b(String str) {
            C6351b c6351b = new C6351b();
            this.f235409b = c6351b;
            this.f235410c = c6351b;
            this.f235411d = false;
            this.f235412e = false;
            this.f235408a = (String) p.q(str);
        }
    }

    public static <T> T a(T t15, T t16) {
        if (t15 != null) {
            return t15;
        }
        if (t16 != null) {
            return t16;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
