package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zl0 {
    private zl0() {
    }

    static Set a(Map map) {
        Set setC = c(map, "retryableStatusCodes");
        zj.c0.a(setC != null, "%s is required in retry policy", "retryableStatusCodes");
        zj.c0.a(true ^ setC.contains(i90.OK), "%s must not contain OK", "retryableStatusCodes");
        return setC;
    }

    static Set b(Map map) {
        Set setC = c(map, "nonFatalStatusCodes");
        if (setC == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(i90.class));
        }
        zj.c0.a(!setC.contains(i90.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setC;
    }

    private static Set c(Map map, String str) {
        i90 i90VarG;
        List listA = fg0.a(map, str);
        if (listA == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(i90.class);
        for (Object obj : listA) {
            if (obj instanceof Double) {
                Double d15 = (Double) obj;
                int iIntValue = d15.intValue();
                zj.c0.a(((double) iIntValue) == d15.doubleValue(), "Status code %s is not integral", obj);
                i90VarG = l90.a(iIntValue).g();
                zj.c0.a(i90VarG.zza() == d15.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    String strValueOf = String.valueOf(obj);
                    String strValueOf2 = String.valueOf(obj.getClass());
                    StringBuilder sb5 = new StringBuilder(strValueOf.length() + 65 + strValueOf2.length());
                    sb5.append("Can not convert status code ");
                    sb5.append(strValueOf);
                    sb5.append(" to Status.Code, because its type is ");
                    sb5.append(strValueOf2);
                    throw new zj.d0(sb5.toString());
                }
                try {
                    i90 i90Var = i90.OK;
                    i90VarG = (i90) Enum.valueOf(i90.class, (String) obj);
                } catch (IllegalArgumentException e15) {
                    String strValueOf3 = String.valueOf(obj);
                    StringBuilder sb6 = new StringBuilder(strValueOf3.length() + 25);
                    sb6.append("Status code ");
                    sb6.append(strValueOf3);
                    sb6.append(" is not valid");
                    throw new zj.d0(sb6.toString(), e15);
                }
            }
            enumSetNoneOf.add(i90VarG);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
