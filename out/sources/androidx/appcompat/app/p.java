package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class p {
    private static e6.h a(e6.h hVar, e6.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i15 = 0;
        while (i15 < hVar.g() + hVar2.g()) {
            Locale localeC = i15 < hVar.g() ? hVar.c(i15) : hVar2.c(i15 - hVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i15++;
        }
        return e6.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static e6.h b(e6.h hVar, e6.h hVar2) {
        return (hVar == null || hVar.f()) ? e6.h.e() : a(hVar, hVar2);
    }
}
