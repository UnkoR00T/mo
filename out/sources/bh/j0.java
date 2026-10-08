package bh;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f19438a;

    public j0(Context context, i0 i0Var) {
        ArrayList arrayList = new ArrayList();
        this.f19438a = arrayList;
        if (i0Var.c()) {
            arrayList.add(new r0(context, i0Var));
        }
    }
}
