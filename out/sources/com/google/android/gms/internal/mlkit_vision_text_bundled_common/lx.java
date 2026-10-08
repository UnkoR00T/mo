package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

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
final class lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f30488a;

    static {
        char[] cArr = new char[80];
        f30488a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(jx jxVar, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("# ");
        sb5.append(str);
        d(jxVar, sb5, 0);
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
            sb5.append(iy.a(new xu(((String) obj).getBytes(kw.f30476a))));
            sb5.append('\"');
            return;
        }
        if (obj instanceof yu) {
            sb5.append(": \"");
            sb5.append(iy.a((yu) obj));
            sb5.append('\"');
            return;
        }
        if (obj instanceof bw) {
            sb5.append(" {");
            d((bw) obj, sb5, i15 + 2);
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
            sb5.append(f30488a, 0, i16);
            i15 -= i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void d(jx jxVar, StringBuilder sb5, int i15) {
        int i16;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = jxVar.getClass().getDeclaredMethods();
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
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 4), bw.D(method2, jxVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb5, i15, strSubstring.substring(0, strSubstring.length() - 3), bw.D(method, jxVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objD = bw.D(method4, jxVar, new Object[0]);
                    if (method5 == null) {
                        if (objD instanceof Boolean) {
                            if (((Boolean) objD).booleanValue()) {
                                b(sb5, i15, strSubstring, objD);
                            }
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() != 0) {
                                b(sb5, i15, strSubstring, objD);
                            }
                        } else if (objD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objD).floatValue()) != 0) {
                                b(sb5, i15, strSubstring, objD);
                            }
                        } else if (!(objD instanceof Double)) {
                            if (objD instanceof String) {
                                zEquals = objD.equals("");
                            } else if (objD instanceof yu) {
                                zEquals = objD.equals(yu.f30716b);
                            } else if (objD instanceof jx) {
                                if (objD != ((jx) objD).i()) {
                                    b(sb5, i15, strSubstring, objD);
                                }
                            } else if (!(objD instanceof Enum) || ((Enum) objD).ordinal() != 0) {
                                b(sb5, i15, strSubstring, objD);
                            }
                            if (!zEquals) {
                                b(sb5, i15, strSubstring, objD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objD).doubleValue()) != 0) {
                            b(sb5, i15, strSubstring, objD);
                        }
                    } else if (((Boolean) bw.D(method5, jxVar, new Object[0])).booleanValue()) {
                        b(sb5, i15, strSubstring, objD);
                    }
                }
            }
            i16 = 3;
        }
        if (jxVar instanceof yv) {
            Iterator itG = ((yv) jxVar).zbb.g();
            while (itG.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itG.next();
                b(sb5, i15, "[32149011]", entry2.getValue());
            }
        }
        ly lyVar = ((bw) jxVar).zbc;
        if (lyVar != null) {
            lyVar.i(sb5, i15);
        }
    }
}
