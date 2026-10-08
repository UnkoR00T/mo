package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32918a = new HashMap();

    public m31(i31 i31Var) {
    }

    public final vh.l a(vh.l lVar, vh.a aVar, long j15, String str) {
        final vh.m mVar = aVar == null ? new vh.m() : new vh.m(aVar);
        Map map = this.f32918a;
        if (!map.containsKey(mVar)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(mVar, handlerThread);
            final String str2 = "Location timeout.";
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.l31
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32785a.d(new hg.b(new Status(15, "Location timeout.")));
                }
            }, j15);
        }
        lVar.k(new vh.c(this) { // from class: com.google.android.libraries.places.internal.j31
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar2) {
                vh.m mVar2 = mVar;
                Exception excL = lVar2.l();
                if (lVar2.q()) {
                    mVar2.c(lVar2.m());
                } else if (!lVar2.o() && excL != null) {
                    mVar2.b(excL);
                }
                return mVar2.a();
            }
        });
        mVar.a().c(new vh.f() { // from class: com.google.android.libraries.places.internal.k31
            @Override // vh.f
            public final /* synthetic */ void a(vh.l lVar2) {
                this.f32698a.b(mVar, lVar2);
            }
        });
        return mVar.a();
    }

    final /* synthetic */ void b(vh.m mVar, vh.l lVar) {
        HandlerThread handlerThread = (HandlerThread) this.f32918a.remove(mVar);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }
}
