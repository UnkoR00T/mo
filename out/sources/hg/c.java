package hg;

import android.text.TextUtils;
import java.util.ArrayList;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0.a f84300a;

    public c(r0.a aVar) {
        this.f84300a = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        r0.a aVar = this.f84300a;
        boolean z15 = true;
        for (ig.b bVar : aVar.keySet()) {
            gg.a aVar2 = (gg.a) s.l((gg.a) aVar.get(bVar));
            z15 &= !aVar2.y();
            String strB = bVar.b();
            String strValueOf = String.valueOf(aVar2);
            StringBuilder sb5 = new StringBuilder(String.valueOf(strB).length() + 2 + strValueOf.length());
            sb5.append(strB);
            sb5.append(": ");
            sb5.append(strValueOf);
            arrayList.add(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder();
        if (z15) {
            sb6.append("None of the queried APIs are available. ");
        } else {
            sb6.append("Some of the queried APIs are unavailable. ");
        }
        sb6.append(TextUtils.join("; ", arrayList));
        return sb6.toString();
    }
}
