package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class j00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f32622a;

    static {
        char[] cArr = new char[80];
        f32622a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(g00 g00Var, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        c(g00Var, sb5, 0);
        return sb5.toString();
    }

    static void b(StringBuilder sb5, int i15, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb5, i15, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it4 = ((Map) obj).entrySet().iterator();
            while (it4.hasNext()) {
                b(sb5, i15, str, (Map.Entry) it4.next());
            }
            return;
        }
        sb5.append('\n');
        d(i15, sb5);
        if (!str.isEmpty()) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(Character.toLowerCase(str.charAt(0)));
            for (int i16 = 1; i16 < str.length(); i16++) {
                char cCharAt = str.charAt(i16);
                if (Character.isUpperCase(cCharAt)) {
                    sb6.append("_");
                }
                sb6.append(Character.toLowerCase(cCharAt));
            }
            str = sb6.toString();
        }
        sb5.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof tx) {
                sb5.append(": \"");
                sb5.append(d10.a(((tx) obj).t()));
                sb5.append('\"');
                return;
            }
            if (obj instanceof az) {
                sb5.append(" {");
                c((az) obj, sb5, i15 + 2);
                sb5.append("\n");
                d(i15, sb5);
                sb5.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb5.append(": ");
                sb5.append(obj);
                return;
            }
            int i17 = i15 + 2;
            sb5.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            b(sb5, i17, "key", entry.getKey());
            b(sb5, i17, "value", entry.getValue());
            sb5.append("\n");
            d(i15, sb5);
            sb5.append("}");
            return;
        }
        sb5.append(": \"");
        String strReplace2 = (String) obj;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i18 = 0; i18 < strReplace2.length(); i18++) {
            char cCharAt2 = strReplace2.charAt(i18);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = d10.a(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb5.append(strReplace);
                sb5.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z17 = true;
                } else if (cCharAt2 == '\'') {
                    z16 = true;
                } else if (cCharAt2 == '\\') {
                    z15 = true;
                }
            }
        }
        if (z15) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z16 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z17) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb5.append(strReplace);
        sb5.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    private static void c(g00 g00Var, StringBuilder sb5, int i15) {
        int i16;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = g00Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i17 = 0;
        while (true) {
            i16 = 3;
            if (i17 >= length) {
                break;
            }
            Method method3 = declaredMethods[i17];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i17++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i16);
            if (strSubstring.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 4), az.v(method2, g00Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 3), az.v(method, g00Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objV = az.v(method4, g00Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) az.v(method5, g00Var, new Object[0])).booleanValue();
                    } else if (objV instanceof Boolean) {
                        if (((Boolean) objV).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objV instanceof Integer) {
                        if (((Integer) objV).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objV instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objV).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objV instanceof Double)) {
                        if (objV instanceof String) {
                            zEquals = objV.equals("");
                        } else if (objV instanceof tx) {
                            zEquals = objV.equals(tx.f33820b);
                        } else if (!(objV instanceof g00) ? !((objV instanceof Enum) && ((Enum) objV).ordinal() == 0) : objV != ((g00) objV).n()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        b(sb5, i15, strSubstring, objV);
                    }
                }
            }
            i16 = 3;
        }
        if (g00Var instanceof xy) {
            Iterator itD = ((xy) g00Var).zzb.d();
            while (itD.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itD.next();
                b(sb5, i15, "[525004180]", entry2.getValue());
            }
        }
        j10 j10Var = ((az) g00Var).zzc;
        if (j10Var != null) {
            j10Var.j(sb5, i15);
        }
    }

    private static void d(int i15, StringBuilder sb5) {
        while (i15 > 0) {
            int i16 = 80;
            if (i15 <= 80) {
                i16 = i15;
            }
            sb5.append(f32622a, 0, i16);
            i15 -= i16;
        }
    }
}
