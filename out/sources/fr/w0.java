package fr;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class w0 {
    public static Collection a(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.b)) {
            u(obj, "kotlin.collections.MutableCollection");
        }
        return h(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.c)) {
            u(obj, "kotlin.collections.MutableIterable");
        }
        return i(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.d)) {
            u(obj, "kotlin.collections.MutableList");
        }
        return j(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.e)) {
            u(obj, "kotlin.collections.MutableMap");
        }
        return k(obj);
    }

    public static Map.Entry e(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.e.a)) {
            u(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return l(obj);
    }

    public static Set f(Object obj) {
        if ((obj instanceof gr.a) && !(obj instanceof gr.f)) {
            u(obj, "kotlin.collections.MutableSet");
        }
        return m(obj);
    }

    public static Object g(Object obj, int i15) {
        if (obj != null && !o(obj, i15)) {
            u(obj, "kotlin.jvm.functions.Function" + i15);
        }
        return obj;
    }

    public static Collection h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static Iterable i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static List j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static Map k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static Map.Entry l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static Set m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e15) {
            throw t(e15);
        }
    }

    public static int n(Object obj) {
        if (obj instanceof o) {
            return ((o) obj).getArity();
        }
        if (obj instanceof er.a) {
            return 0;
        }
        if (obj instanceof er.l) {
            return 1;
        }
        if (obj instanceof er.p) {
            return 2;
        }
        if (obj instanceof er.q) {
            return 3;
        }
        if (obj instanceof er.r) {
            return 4;
        }
        if (obj instanceof er.s) {
            return 5;
        }
        if (obj instanceof er.t) {
            return 6;
        }
        if (obj instanceof er.u) {
            return 7;
        }
        if (obj instanceof er.v) {
            return 8;
        }
        if (obj instanceof er.w) {
            return 9;
        }
        if (obj instanceof er.b) {
            return 10;
        }
        if (obj instanceof er.c) {
            return 11;
        }
        if (obj instanceof er.d) {
            return 12;
        }
        if (obj instanceof er.e) {
            return 13;
        }
        if (obj instanceof er.f) {
            return 14;
        }
        if (obj instanceof er.g) {
            return 15;
        }
        if (obj instanceof er.h) {
            return 16;
        }
        if (obj instanceof er.i) {
            return 17;
        }
        if (obj instanceof er.j) {
            return 18;
        }
        if (obj instanceof er.k) {
            return 19;
        }
        if (obj instanceof er.m) {
            return 20;
        }
        if (obj instanceof er.n) {
            return 21;
        }
        return obj instanceof er.o ? 22 : -1;
    }

    public static boolean o(Object obj, int i15) {
        return (obj instanceof oq.e) && n(obj) == i15;
    }

    public static boolean p(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof gr.a) || (obj instanceof gr.d);
        }
        return false;
    }

    public static boolean q(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof gr.a) || (obj instanceof gr.e.a);
        }
        return false;
    }

    public static boolean r(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof gr.a) || (obj instanceof gr.f);
        }
        return false;
    }

    private static <T extends Throwable> T s(T t15) {
        return (T) t.g(t15, w0.class.getName());
    }

    public static ClassCastException t(ClassCastException classCastException) {
        throw ((ClassCastException) s(classCastException));
    }

    public static void u(Object obj, String str) {
        v((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void v(String str) {
        throw t(new ClassCastException(str));
    }
}
