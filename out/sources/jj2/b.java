package jj2;

import android.app.Activity;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes8.dex */
public class b {
    public static void a(Activity activity, Boolean bool) {
        if (!sh2.a.e().a(gz.b.a.C1792a.f78542a).booleanValue()) {
            sh2.a.f().c(new po2.a.ToOnboarding());
            return;
        }
        sh2.a.a((c) activity);
        if (bool.booleanValue()) {
            sh2.a.f().c(l74.a.b.f116926a);
        } else {
            sh2.a.f().c(new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.Default()));
        }
    }
}
