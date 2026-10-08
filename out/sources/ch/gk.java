package ch;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gk implements dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f25910a;

    public gk(Context context, fk fkVar) {
        ArrayList arrayList = new ArrayList();
        this.f25910a = arrayList;
        if (fkVar.c()) {
            arrayList.add(new vk(context, fkVar));
        }
    }

    @Override // ch.dk
    public final void a(ck ckVar) {
        Iterator it = this.f25910a.iterator();
        while (it.hasNext()) {
            ((dk) it.next()).a(ckVar);
        }
    }
}
