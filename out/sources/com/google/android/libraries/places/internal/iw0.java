package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hw0 f32612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32614e;

    public iw0(WifiInfo wifiInfo, ScanResult scanResult) {
        hw0 hw0Var;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i15 = scanResult.level;
        int i16 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            hw0Var = hw0.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            hw0Var = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? hw0.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? hw0.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? hw0.EAP : hw0.OTHER;
        }
        boolean z15 = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z15 = true;
        }
        this.f32610a = str;
        this.f32611b = i15;
        this.f32612c = hw0Var;
        this.f32613d = z15;
        this.f32614e = i16;
    }

    public final String a() {
        return this.f32610a;
    }

    public final int b() {
        return this.f32611b;
    }

    public final hw0 c() {
        return this.f32612c;
    }

    public final boolean d() {
        return this.f32613d;
    }

    public final int e() {
        return this.f32614e;
    }
}
