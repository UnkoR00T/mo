package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vk.e f36507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f36508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.c f36509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kl.b<tl.i> f36510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl.b<il.j> f36511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ll.e f36512f;

    d0(vk.e eVar, i0 i0Var, kl.b<tl.i> bVar, kl.b<il.j> bVar2, ll.e eVar2) {
        this(eVar, i0Var, new fg.c(eVar.j()), bVar, bVar2, eVar2);
    }

    public static /* synthetic */ String a(d0 d0Var, vh.l lVar) {
        d0Var.getClass();
        return d0Var.h((Bundle) lVar.n(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private vh.l<String> d(vh.l<Bundle> lVar) {
        return lVar.h(new ma.b(), new vh.c() { // from class: com.google.firebase.messaging.c0
            @Override // vh.c
            public final Object a(vh.l lVar2) {
                return d0.a(this.f36496a, lVar2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f36507a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        c2.h("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        il.j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f36507a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f36508b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f36508b.a());
        bundle.putString("app_ver_name", this.f36508b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) vh.o.a(this.f36512f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                c2.g("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e15) {
            e = e15;
            c2.f("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e16) {
            e = e16;
            c2.f("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) vh.o.a(this.f36512f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        il.j jVar = this.f36511e.get();
        tl.i iVar = this.f36510d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == il.j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.e()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private vh.l<Bundle> l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f36509c.c(bundle);
        } catch (InterruptedException | ExecutionException e15) {
            return vh.o.e(e15);
        }
    }

    vh.l<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(i0.c(this.f36507a), "*", bundle));
    }

    vh.l<fg.a> f() {
        return this.f36509c.a();
    }

    vh.l<String> g() {
        return d(l(i0.c(this.f36507a), "*", new Bundle()));
    }

    vh.l<Void> k(boolean z15) {
        return this.f36509c.d(z15);
    }

    vh.l<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    vh.l<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    d0(vk.e eVar, i0 i0Var, fg.c cVar, kl.b<tl.i> bVar, kl.b<il.j> bVar2, ll.e eVar2) {
        this.f36507a = eVar;
        this.f36508b = i0Var;
        this.f36509c = cVar;
        this.f36510d = bVar;
        this.f36511e = bVar2;
        this.f36512f = eVar2;
    }
}
