package vk;

import android.content.Context;
import android.text.TextUtils;
import jg.r;
import jg.s;
import jg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f207150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f207151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f207152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f207153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f207154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f207155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f207156g;

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.p(!com.google.android.gms.common.util.l.a(str), "ApplicationId must be set.");
        this.f207151b = str;
        this.f207150a = str2;
        this.f207152c = str3;
        this.f207153d = str4;
        this.f207154e = str5;
        this.f207155f = str6;
        this.f207156g = str7;
    }

    public static k a(Context context) {
        v vVar = new v(context);
        String strA = vVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.f207150a;
    }

    public String c() {
        return this.f207151b;
    }

    public String d() {
        return this.f207154e;
    }

    public String e() {
        return this.f207156g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return r.a(this.f207151b, kVar.f207151b) && r.a(this.f207150a, kVar.f207150a) && r.a(this.f207152c, kVar.f207152c) && r.a(this.f207153d, kVar.f207153d) && r.a(this.f207154e, kVar.f207154e) && r.a(this.f207155f, kVar.f207155f) && r.a(this.f207156g, kVar.f207156g);
    }

    public int hashCode() {
        return r.b(this.f207151b, this.f207150a, this.f207152c, this.f207153d, this.f207154e, this.f207155f, this.f207156g);
    }

    public String toString() {
        return r.c(this).a("applicationId", this.f207151b).a("apiKey", this.f207150a).a("databaseUrl", this.f207152c).a("gcmSenderId", this.f207154e).a("storageBucket", this.f207155f).a("projectId", this.f207156g).toString();
    }
}
