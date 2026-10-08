package dh;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sb implements pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f42228a;

    public sb(Context context, rb rbVar) {
        ArrayList arrayList = new ArrayList();
        this.f42228a = arrayList;
        if (rbVar.c()) {
            arrayList.add(new cc(context, rbVar));
        }
    }

    @Override // dh.pb
    public final void a(ob obVar) {
        Iterator it = this.f42228a.iterator();
        while (it.hasNext()) {
            ((pb) it.next()).a(obVar);
        }
    }
}
