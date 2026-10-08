package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class o2 {
    static String a(l2 l2Var, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        b(l2Var, sb5, 0);
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    private static void b(l2 l2Var, StringBuilder sb5, int i15) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : l2Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            Object obj = "";
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d) && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d)) {
                String strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb5, i15, d(strConcat), f1.m(method2, l2Var, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String strValueOf3 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb5, i15, d(strConcat2), f1.m(method3, l2Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strReplaceFirst.length() != 0 ? "set".concat(strReplaceFirst) : new String("set"))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strReplaceFirst.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strReplaceFirst.length() != 0 ? "get".concat(strReplaceFirst) : new String("get"));
                Method method5 = (Method) map.get(strReplaceFirst.length() != 0 ? "has".concat(strReplaceFirst) : new String("has"));
                if (method4 != null) {
                    Object objM = f1.m(method4, l2Var, new Object[0]);
                    if (method5 == null) {
                        if (objM instanceof Boolean) {
                            if (((Boolean) objM).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM instanceof Integer) {
                            if (((Integer) objM).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM instanceof Float) {
                            if (((Float) objM).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (!(objM instanceof Double)) {
                            if (!(objM instanceof String)) {
                                if (objM instanceof a0) {
                                    obj = a0.f29117b;
                                } else if (!(objM instanceof l2) ? !((objM instanceof Enum) && ((Enum) objM).ordinal() == 0) : objM != ((l2) objM).b()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                            }
                            zEquals = objM.equals(obj);
                        } else if (((Double) objM).doubleValue() == 0.0d) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) f1.m(method5, l2Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        c(sb5, i15, d(strConcat3), objM);
                    }
                }
            }
        }
        if (l2Var instanceof f1.c) {
            Iterator<Map.Entry<FieldDescriptorType, Object>> itE = ((f1.c) l2Var).zzjv.e();
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                int i16 = ((f1.d) entry.getKey()).f29318a;
                StringBuilder sb6 = new StringBuilder(13);
                sb6.append("[");
                sb6.append(i16);
                sb6.append("]");
                c(sb5, i15, sb6.toString(), entry.getValue());
            }
        }
        v3 v3Var = ((f1) l2Var).zzjp;
        if (v3Var != null) {
            v3Var.c(sb5, i15);
        }
    }

    static final void c(StringBuilder sb5, int i15, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb5, i15, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it4 = ((Map) obj).entrySet().iterator();
            while (it4.hasNext()) {
                c(sb5, i15, str, (Map.Entry) it4.next());
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
            sb5.append(q3.a(a0.o((String) obj)));
            sb5.append('\"');
            return;
        }
        if (obj instanceof a0) {
            sb5.append(": \"");
            sb5.append(q3.a((a0) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof f1) {
            sb5.append(" {");
            b((f1) obj, sb5, i15 + 2);
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
        c(sb5, i18, "key", entry.getKey());
        c(sb5, i18, "value", entry.getValue());
        sb5.append("\n");
        while (i16 < i15) {
            sb5.append(' ');
            i16++;
        }
        sb5.append("}");
    }

    private static final String d(String str) {
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
}
