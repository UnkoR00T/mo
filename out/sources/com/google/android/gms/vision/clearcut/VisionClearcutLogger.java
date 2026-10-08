package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.d;
import com.google.android.gms.internal.vision.v;
import com.google.android.gms.internal.vision.y1;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class VisionClearcutLogger {
    private final eg.a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new eg.a(context, "VISION", null);
    }

    public final void zza(int i15, v vVar) {
        byte[] bArrK = vVar.k();
        if (i15 < 0 || i15 > 3) {
            wh.a.c("Illegal event code: %d", Integer.valueOf(i15));
            return;
        }
        try {
            if (this.zzb) {
                this.zza.a(bArrK).b(i15).a();
                return;
            }
            v.a aVarX = v.x();
            try {
                aVarX.l(bArrK, 0, bArrK.length, y1.c());
                wh.a.a("Would have logged:\n%s", aVarX.toString());
            } catch (Exception e15) {
                wh.a.b(e15, "Parsing error", new Object[0]);
            }
        } catch (Exception e16) {
            d.b(e16);
            wh.a.b(e16, "Failed to log", new Object[0]);
        }
    }
}
