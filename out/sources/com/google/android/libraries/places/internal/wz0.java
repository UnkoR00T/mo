package com.google.android.libraries.places.internal;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class wz0 implements com.google.common.util.concurrent.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d20 f34220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c01 f34221b;

    wz0(c01 c01Var, d20 d20Var) {
        this.f34220a = d20Var;
        Objects.requireNonNull(c01Var);
        this.f34221b = c01Var;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        c01 c01Var = this.f34221b;
        c01Var.f(false);
        String strI = ((o20) obj).I();
        d20 d20Var = this.f34220a;
        try {
            c01Var.f31838e = strI;
            List<String> listH = zj.t.e('.').h(strI);
            if (listH.size() < 2) {
                throw new IllegalStateException("Invalid JWT format");
            }
            c01Var.f31839f = Long.valueOf(Long.parseLong(new JSONObject(new String(Base64.decode(listH.get(1), 8), StandardCharsets.UTF_8)).get("exp").toString()));
            c01Var.f31840g = d20Var;
        } catch (Exception e15) {
            throw new IllegalStateException("Couldn't decode JWT payload", e15);
        }
    }

    @Override // com.google.common.util.concurrent.j
    public final void b(Throwable th4) {
        c01 c01Var = this.f34221b;
        c01Var.f(false);
        c01Var.f31838e = null;
        c01Var.f31839f = null;
        c01Var.f31840g = this.f34220a;
    }
}
