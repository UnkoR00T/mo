package ss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f183849a = new f0();

    private f0() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(String str) {
        return f183849a.c(str);
    }

    public final String[] b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> d(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String str, String... strArr) {
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> f(String str, String... strArr) {
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        return "java/lang/" + str;
    }

    public final String i(String str) {
        return "java/util/" + str;
    }

    public final String j(String str) {
        return "java/util/concurrent/atomic/" + str;
    }

    public final String k(String str, List<String> list, String str2) {
        return str + '(' + pq.v.v0(list, "", null, null, 0, null, e0.f183848a, 30, null) + ')' + c(str2);
    }

    public final String m(String str, String str2) {
        return str + '.' + str2;
    }
}
