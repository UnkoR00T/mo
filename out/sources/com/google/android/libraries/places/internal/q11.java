package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vd.o f33372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b21 f33373b;

    q11(vd.o oVar, b21 b21Var) {
        this.f33372a = oVar;
        this.f33373b = b21Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(vh.m mVar, vd.u uVar) {
        try {
            mVar.d(ow0.a(uVar));
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void b(Class cls, vh.m mVar, JSONObject jSONObject) {
        try {
            try {
                mVar.e((z11) this.f33373b.a(jSONObject.toString(), cls));
            } catch (a21 e15) {
                mVar.d(new hg.b(new Status(8, e15.getMessage())));
            }
        } catch (Error | RuntimeException e16) {
            n41.b(e16);
            throw e16;
        }
    }

    public final vh.l a(y11 y11Var, final Class cls) {
        String strD = y11Var.d();
        Map mapC = y11Var.c();
        vh.a aVarB = y11Var.b();
        final vh.m mVar = aVarB != null ? new vh.m(aVarB) : new vh.m();
        final m11 m11Var = new m11(this, 0, strD, null, new vd.p.b() { // from class: com.google.android.libraries.places.internal.o11
            @Override // vd.p.b
            public final /* synthetic */ void a(Object obj) {
                this.f33120a.b(cls, mVar, (JSONObject) obj);
            }
        }, new vd.p.a() { // from class: com.google.android.libraries.places.internal.n11
            @Override // vd.p.a
            public final /* synthetic */ void a(vd.u uVar) {
                q11.d(mVar, uVar);
            }
        }, mapC);
        if (aVarB != null) {
            aVarB.b(new vh.i() { // from class: com.google.android.libraries.places.internal.p11
                @Override // vh.i
                public final /* synthetic */ void b() {
                    m11Var.g();
                }
            });
        }
        this.f33372a.a(m11Var);
        return mVar.a();
    }
}
