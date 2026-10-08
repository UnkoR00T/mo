package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.l3;
import io.sentry.protocol.p;
import io.sentry.q7;
import io.sentry.s7;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends b implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f95648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f95649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f95650f;

    public h() {
        super(c.Custom);
        this.f95648d = new HashMap();
        this.f95647c = "options";
    }

    private void g(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("tag").h(this.f95647c);
        l3Var.f("payload");
        h(l3Var, v0Var);
        Map<String, Object> map = this.f95650f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95650f.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    private void h(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        Map<String, Object> map = this.f95648d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95648d.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        g(l3Var, v0Var);
        Map<String, Object> map = this.f95649e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95649e.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public h(q7 q7Var) {
        this();
        p sdkVersion = q7Var.getSdkVersion();
        if (sdkVersion != null) {
            this.f95648d.put("nativeSdkName", sdkVersion.e());
            this.f95648d.put("nativeSdkVersion", sdkVersion.g());
        }
        s7 sessionReplay = q7Var.getSessionReplay();
        this.f95648d.put("errorSampleRate", sessionReplay.g());
        this.f95648d.put("sessionSampleRate", sessionReplay.k());
        this.f95648d.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains("android.widget.ImageView")));
        this.f95648d.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains("android.widget.TextView")));
        this.f95648d.put("quality", sessionReplay.h().serializedName());
        this.f95648d.put("maskedViewClasses", sessionReplay.e());
        this.f95648d.put("unmaskedViewClasses", sessionReplay.m());
    }
}
