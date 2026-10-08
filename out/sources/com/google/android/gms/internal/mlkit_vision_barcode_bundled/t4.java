package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f30243a;

    static {
        char[] cArr = new char[80];
        f30243a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(r4 r4Var, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        d(r4Var, sb5, 0);
        return sb5.toString();
    }

    static void b(StringBuilder sb5, int i15, String str, Object obj) {
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
        c(i15, sb5);
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
        if (obj instanceof String) {
            sb5.append(": \"");
            sb5.append(w5.a(new i2(((String) obj).getBytes(t3.f30241a))));
            sb5.append('\"');
            return;
        }
        if (obj instanceof j2) {
            sb5.append(": \"");
            sb5.append(w5.a((j2) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof l3) {
            sb5.append(" {");
            d((l3) obj, sb5, i15 + 2);
            sb5.append("\n");
            c(i15, sb5);
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
        c(i15, sb5);
        sb5.append("}");
    }

    private static void c(int i15, StringBuilder sb5) {
        while (i15 > 0) {
            int i16 = 80;
            if (i15 <= 80) {
                i16 = i15;
            }
            sb5.append(f30243a, 0, i16);
            i15 -= i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void d(r4 r4Var, StringBuilder sb5, int i15) {
        int i16;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = r4Var.getClass().getDeclaredMethods();
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
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 4), l3.t(method2, r4Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 3), l3.t(method, r4Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objT = l3.t(method4, r4Var, new Object[0]);
                    if (method5 == null) {
                        if (objT instanceof Boolean) {
                            if (((Boolean) objT).booleanValue()) {
                                b(sb5, i15, strSubstring, objT);
                            }
                        } else if (objT instanceof Integer) {
                            if (((Integer) objT).intValue() != 0) {
                                b(sb5, i15, strSubstring, objT);
                            }
                        } else if (objT instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objT).floatValue()) != 0) {
                                b(sb5, i15, strSubstring, objT);
                            }
                        } else if (!(objT instanceof Double)) {
                            if (objT instanceof String) {
                                zEquals = objT.equals("");
                            } else if (objT instanceof j2) {
                                zEquals = objT.equals(j2.f29738b);
                            } else if (objT instanceof r4) {
                                if (objT != ((r4) objT).b()) {
                                    b(sb5, i15, strSubstring, objT);
                                }
                            } else if (!(objT instanceof Enum) || ((Enum) objT).ordinal() != 0) {
                                b(sb5, i15, strSubstring, objT);
                            }
                            if (!zEquals) {
                                b(sb5, i15, strSubstring, objT);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objT).doubleValue()) != 0) {
                            b(sb5, i15, strSubstring, objT);
                        }
                    } else if (((Boolean) l3.t(method5, r4Var, new Object[0])).booleanValue()) {
                        b(sb5, i15, strSubstring, objT);
                    }
                }
            }
            i16 = 3;
        }
        if (r4Var instanceof i3) {
            Iterator itF = ((i3) r4Var).zzb.f();
            while (itF.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itF.next();
                b(sb5, i15, "[" + ((j3) entry2.getKey()).f29740a + "]", entry2.getValue());
            }
        }
        z5 z5Var = ((l3) r4Var).zzc;
        if (z5Var != null) {
            z5Var.i(sb5, i15);
        }
    }
}
