package com.google.android.gms.internal.vision;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class z3 {
    static String a(u3 u3Var, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        c(u3Var, sb5, 0);
        return sb5.toString();
    }

    private static final String b(String str) {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isUpperCase(cCharAt)) {
                sb5.append("_");
            }
            sb5.append(Character.toLowerCase(cCharAt));
        }
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    private static void c(u3 u3Var, StringBuilder sb5, int i15) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : u3Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d)) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb5, i15, b(strConcat), l2.r(method2, u3Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    d(sb5, i15, b(strConcat2), l2.r(method3, u3Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objR = l2.r(method4, u3Var, new Object[0]);
                    if (method5 == null) {
                        if (objR instanceof Boolean) {
                            if (((Boolean) objR).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objR instanceof Integer) {
                            if (((Integer) objR).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objR instanceof Float) {
                            if (((Float) objR).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objR instanceof Double) {
                            if (((Double) objR).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objR instanceof String) {
                            zEquals = objR.equals("");
                        } else if (objR instanceof e1) {
                            zEquals = objR.equals(e1.f30998b);
                        } else if (!(objR instanceof u3) ? !((objR instanceof Enum) && ((Enum) objR).ordinal() == 0) : objR != ((u3) objR).e()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) l2.r(method5, u3Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        d(sb5, i15, b(strConcat3), objR);
                    }
                }
            }
        }
        if (u3Var instanceof l2.c) {
            Iterator<Map.Entry<T, Object>> itO = ((l2.c) u3Var).zzc.o();
            while (itO.hasNext()) {
                Map.Entry entry = (Map.Entry) itO.next();
                int i16 = ((l2.e) entry.getKey()).f31131a;
                StringBuilder sb6 = new StringBuilder(13);
                sb6.append("[");
                sb6.append(i16);
                sb6.append("]");
                d(sb5, i15, sb6.toString(), entry.getValue());
            }
        }
        f5 f5Var = ((l2) u3Var).zzb;
        if (f5Var != null) {
            f5Var.f(sb5, i15);
        }
    }

    static final void d(StringBuilder sb5, int i15, String str, Object obj) {
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
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            sb5.append(' ');
        }
        sb5.append(str);
        if (obj instanceof String) {
            sb5.append(": \"");
            sb5.append(y4.a(e1.j((String) obj)));
            sb5.append('\"');
            return;
        }
        if (obj instanceof e1) {
            sb5.append(": \"");
            sb5.append(y4.a((e1) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof l2) {
            sb5.append(" {");
            c((l2) obj, sb5, i15 + 2);
            sb5.append("\n");
            while (i16 < i15) {
                sb5.append(' ');
                i16++;
            }
            sb5.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb5.append(": ");
            sb5.append(obj.toString());
            return;
        }
        sb5.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i18 = i15 + 2;
        d(sb5, i18, "key", entry.getKey());
        d(sb5, i18, "value", entry.getValue());
        sb5.append("\n");
        while (i16 < i15) {
            sb5.append(' ');
            i16++;
        }
        sb5.append("}");
    }
}
