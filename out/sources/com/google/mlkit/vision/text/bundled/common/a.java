package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import cn.j;
import cn.o;
import cn.p;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.aq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.fg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.op;
import jg.s;
import rg.b;

/* JADX INFO: loaded from: classes4.dex */
final class a extends op {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f36890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j f36895i;

    a(Context context, String str, String str2, String str3, boolean z15) {
        this.f36890d = context;
        this.f36891e = str;
        this.f36893g = str2;
        this.f36894h = str3;
        this.f36892f = z15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qp
    public final fg[] J2(b bVar, mp mpVar) throws RemoteException {
        throw new RemoteException("#recognizeBitmap should not be triggered from text thick client.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qp
    public final void Z() {
        j jVar = this.f36895i;
        if (jVar != null) {
            jVar.d();
            this.f36895i = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qp
    public final aq a0(b bVar, mp mpVar) throws RemoteException {
        j jVar = this.f36895i;
        if (jVar == null) {
            throw new RemoteException("Process is started without initiation.");
        }
        o oVarB = ((j) s.l(jVar)).b(bVar, mpVar, true);
        p pVarC = oVarB.c();
        if (pVarC.d()) {
            return oVarB.b();
        }
        throw ((RemoteException) pVarC.b().a());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.qp
    public final void r() throws RemoteException {
        if (this.f36895i == null) {
            System.loadLibrary("mlkit_google_ocr_pipeline");
            String str = this.f36894h;
            String str2 = (str == null || str.isEmpty()) ? "" : this.f36894h;
            String str3 = this.f36891e;
            String str4 = this.f36893g;
            boolean z15 = this.f36892f;
            cn.a.AbstractC0728a abstractC0728aA = cn.a.a(str3, str4, str2);
            abstractC0728aA.b(z15);
            j jVarA = j.a(this.f36890d, abstractC0728aA.a());
            this.f36895i = jVarA;
            p pVarC = jVarA.c();
            if (!pVarC.d()) {
                throw ((RemoteException) pVarC.b().a());
            }
        }
    }
}
