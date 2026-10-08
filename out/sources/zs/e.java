package zs;

import fr.t;
import fu.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.p;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f236649a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f236649a = iArr;
        }
    }

    public static final <V> V a(c cVar, Map<c, ? extends V> map) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<c, ? extends V> entry : map.entrySet()) {
            c key = entry.getKey();
            if (t.c(cVar, key) || b(cVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).a().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c cVar2) {
        return t.c(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        return r.V(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c cVar2) {
        if (t.c(cVar, cVar2) || cVar2.c()) {
            return true;
        }
        return c(cVar.a(), cVar2.a());
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            int i16 = a.f236649a[kVar.ordinal()];
            if (i16 == 1 || i16 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else {
                if (i16 != 3) {
                    throw new p();
                }
                if (cCharAt == '.') {
                    kVar = k.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.AFTER_DOT;
    }

    public static final c f(c cVar) {
        if (cVar.c()) {
            return null;
        }
        return cVar.d();
    }

    public static final c g(c cVar, c cVar2) {
        if (!d(cVar, cVar2) || cVar2.c()) {
            return cVar;
        }
        return t.c(cVar, cVar2) ? c.f236639d : new c(cVar.a().substring(cVar2.a().length() + 1));
    }
}
