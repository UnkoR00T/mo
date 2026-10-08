package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vd.o f34101a;

    w11(vd.o oVar) {
        this.f34101a = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(vh.m mVar, vd.u uVar) {
        hg.b bVarA;
        try {
            vd.k kVar = uVar.f206221a;
            if (kVar != null) {
                int i15 = kVar.f206176a;
                if (i15 != 400) {
                    bVarA = i15 != 403 ? ow0.a(uVar) : new hg.b(new Status(9011, "The provided API key is invalid."));
                } else {
                    bVarA = new hg.b(new Status(9012, "The provided parameters are invalid (did you include a max width or height?)."));
                }
            }
            mVar.d(bVarA);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(v01 v01Var, vh.m mVar, Bitmap bitmap) {
        try {
            v01Var.b(bitmap);
            mVar.e(v01Var.a());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public final vh.l b(y11 y11Var, final v01 v01Var) {
        String strD = y11Var.d();
        Map mapC = y11Var.c();
        vh.a aVarB = y11Var.b();
        final vh.m mVar = aVarB != null ? new vh.m(aVarB) : new vh.m();
        final s11 s11Var = new s11(this, strD, new vd.p.b() { // from class: com.google.android.libraries.places.internal.u11
            @Override // vd.p.b
            public final /* synthetic */ void a(Object obj) {
                w11.e(v01Var, mVar, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new vd.p.a() { // from class: com.google.android.libraries.places.internal.t11
            @Override // vd.p.a
            public final /* synthetic */ void a(vd.u uVar) {
                w11.d(mVar, uVar);
            }
        }, mapC);
        if (aVarB != null) {
            aVarB.b(new vh.i() { // from class: com.google.android.libraries.places.internal.v11
                @Override // vh.i
                public final /* synthetic */ void b() {
                    s11Var.g();
                }
            });
        }
        this.f34101a.a(s11Var);
        return mVar.a();
    }
}
