package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.a6;
import com.google.android.gms.internal.vision.h;
import com.google.android.gms.internal.vision.l2;
import com.google.android.gms.internal.vision.m;
import com.google.android.gms.internal.vision.p;
import com.google.android.gms.internal.vision.q;
import com.google.android.gms.internal.vision.u;
import com.google.android.gms.internal.vision.v;
import java.util.ArrayList;
import java.util.List;
import qg.d;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class LogUtils {
    public static v zza(long j15, int i15, String str, String str2, List<u> list, a6 a6Var) {
        p.a aVarX = p.x();
        m.b bVarY = m.x().x(str2).v(j15).y(i15);
        bVarY.w(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((m) ((l2) bVarY.f()));
        return (v) ((l2) v.x().v((p) ((l2) aVarX.w(arrayList).v((q) ((l2) q.x().w(a6Var.f30965b).v(a6Var.f30964a).x(a6Var.f30966c).y(a6Var.f30967d).f())).f())).f());
    }

    private static String zzb(Context context) {
        try {
            return d.a(context).e(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e15) {
            wh.a.b(e15, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static h zza(Context context) {
        h.a aVarV = h.x().v(context.getPackageName());
        String strZzb = zzb(context);
        if (strZzb != null) {
            aVarV.w(strZzb);
        }
        return (h) ((l2) aVarV.f());
    }
}
