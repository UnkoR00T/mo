package eh;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hd implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f50640a;

    public hd(Context context, gd gdVar) {
        ArrayList arrayList = new ArrayList();
        this.f50640a = arrayList;
        if (gdVar.c()) {
            arrayList.add(new yd(context, gdVar));
        }
    }

    @Override // eh.pd
    public final void a(ed edVar) {
        Iterator it = this.f50640a.iterator();
        while (it.hasNext()) {
            ((pd) it.next()).a(edVar);
        }
    }
}
