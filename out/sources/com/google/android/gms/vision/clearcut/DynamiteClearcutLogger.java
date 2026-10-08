package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.l1;
import com.google.android.gms.internal.vision.v;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = com.google.android.gms.internal.vision.a.a().k(2, l1.f31123a);
    private b zzb = new b(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i15, v vVar) {
        if (i15 != 3 || this.zzb.a()) {
            zza.execute(new a(this, i15, vVar));
        } else {
            wh.a.d("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
