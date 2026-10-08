package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class kw0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f32761c = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32762d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu0 f32763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32764b;

    kw0(Context context, xu0 xu0Var) {
        this.f32764b = context;
        this.f32763a = xu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    public final ak.n0 a(String str) {
        boolean z15;
        WifiManager wifiManager = (WifiManager) this.f32764b.getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return ak.n0.C();
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.isEmpty()) {
            return ak.n0.C();
        }
        ak.n0 n0VarC = ak.n1.b(jw0.f32676a).c(scanResults);
        ArrayList arrayList = new ArrayList();
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        int size = n0VarC.size();
        for (int i15 = 0; i15 < size; i15++) {
            ScanResult scanResult = (ScanResult) n0VarC.get(i15);
            if (scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                long jZzb = (this.f32763a.zzb() * 1000) - scanResult.timestamp;
                long j15 = f32761c;
                String str2 = scanResult.SSID;
                if (str2 == null) {
                    throw new IllegalArgumentException("Null SSID.");
                }
                if (str2.indexOf(95) < 0) {
                    z15 = false;
                } else {
                    String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                    z15 = true;
                    if (!lowerCase.contains("_nomap") && !lowerCase.contains("_optout")) {
                        z15 = false;
                    }
                }
                if (jZzb <= j15 && !z15) {
                    arrayList.add(new iw0(connectionInfo, scanResult));
                }
            }
        }
        return ak.n0.v(arrayList);
    }
}
