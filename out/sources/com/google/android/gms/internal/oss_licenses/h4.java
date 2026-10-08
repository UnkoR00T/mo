package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 {
    public static p3 a(vh.l lVar, vh.b bVar) {
        final f4 f4Var = new f4(lVar, null);
        lVar.b(q3.a(), new vh.f() { // from class: com.google.android.gms.internal.oss_licenses.g4
            @Override // vh.f
            public final /* synthetic */ void a(vh.l lVar2) {
                f4 f4Var2 = f4Var;
                if (lVar2.o()) {
                    f4Var2.cancel(false);
                    return;
                }
                if (lVar2.q()) {
                    f4Var2.j(lVar2.m());
                    return;
                }
                Exception excL = lVar2.l();
                if (excL == null) {
                    throw new IllegalStateException();
                }
                f4Var2.k(excL);
            }
        });
        return f4Var;
    }
}
