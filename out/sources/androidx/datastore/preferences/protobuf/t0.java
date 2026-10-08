package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f12135a;

    static {
        char[] cArr = new char[80];
        f12135a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i15, StringBuilder sb5) {
        while (i15 > 0) {
            char[] cArr = f12135a;
            int length = i15 > cArr.length ? cArr.length : i15;
            sb5.append(cArr, 0, length);
            i15 -= length;
        }
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof g) {
            return obj.equals(g.f11949b);
        }
        if (obj instanceof r0) {
            return obj == ((r0) obj).i();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Character.toLowerCase(str.charAt(0)));
        for (int i15 = 1; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isUpperCase(cCharAt)) {
                sb5.append("_");
            }
            sb5.append(Character.toLowerCase(cCharAt));
        }
        return sb5.toString();
    }

    static void d(StringBuilder sb5, int i15, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb5, i15, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it4 = ((Map) obj).entrySet().iterator();
            while (it4.hasNext()) {
                d(sb5, i15, str, (Map.Entry) it4.next());
            }
            return;
        }
        sb5.append('\n');
        a(i15, sb5);
        sb5.append(c(str));
        if (obj instanceof String) {
            sb5.append(": \"");
            sb5.append(l1.c((String) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof g) {
            sb5.append(": \"");
            sb5.append(l1.a((g) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof x) {
            sb5.append(" {");
            e((x) obj, sb5, i15 + 2);
            sb5.append("\n");
            a(i15, sb5);
            sb5.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb5.append(": ");
            sb5.append(obj);
            return;
        }
        sb5.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i16 = i15 + 2;
        d(sb5, i16, "key", entry.getKey());
        d(sb5, i16, "value", entry.getValue());
        sb5.append("\n");
        a(i15, sb5);
        sb5.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    private static void e(r0 r0Var, StringBuilder sb5, int i15) {
        int i16;
        int i17;
        Method method;
        Method method2;
        Object objF;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = r0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i18 = 0;
        while (true) {
            i16 = 3;
            if (i18 >= length) {
                break;
            }
            Method method5 = declaredMethods[i18];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i18++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i16);
            if (!strSubstring.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) || strSubstring.endsWith("OrBuilderList") || strSubstring.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) || (method4 = (Method) entry.getValue()) == null) {
                i17 = i16;
            } else {
                i17 = i16;
                if (method4.getReturnType().equals(List.class)) {
                    d(sb5, i15, strSubstring.substring(0, strSubstring.length() - 4), x.F(method4, r0Var, new Object[0]));
                }
                i16 = i17;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objF = x.F(method, r0Var, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) x.F(method2, r0Var, new Object[0])).booleanValue();
                                } else if (b(objF)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    d(sb5, i15, strSubstring, objF);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objF = x.F(method, r0Var, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) x.F(method2, r0Var, new Object[0])).booleanValue();
                            } else if (b(objF)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                d(sb5, i15, strSubstring, objF);
                            }
                        }
                    }
                }
            } else {
                d(sb5, i15, strSubstring.substring(0, strSubstring.length() - 3), x.F(method3, r0Var, new Object[0]));
            }
            i16 = i17;
        }
        if (r0Var instanceof x.c) {
            Iterator<Map.Entry<T, Object>> itT = ((x.c) r0Var).extensions.t();
            while (itT.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itT.next();
                d(sb5, i15, "[" + ((x.d) entry2.getKey()).h() + "]", entry2.getValue());
            }
        }
        o1 o1Var = ((x) r0Var).unknownFields;
        if (o1Var != null) {
            o1Var.m(sb5, i15);
        }
    }

    static String f(r0 r0Var, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        e(r0Var, sb5, 0);
        return sb5.toString();
    }
}
