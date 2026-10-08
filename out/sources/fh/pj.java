package fh;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pj implements mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f63461a;

    public pj(Context context, oj ojVar) {
        ArrayList arrayList = new ArrayList();
        this.f63461a = arrayList;
        if (ojVar.c()) {
            arrayList.add(new fk(context, ojVar));
        }
    }

    @Override // fh.mj
    public final void a(lj ljVar) {
        Iterator it = this.f63461a.iterator();
        while (it.hasNext()) {
            ((mj) it.next()).a(ljVar);
        }
    }
}
