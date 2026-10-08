package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jg.s;
import kg.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f28989n = f.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f28994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f28996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f28997h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List f28998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f28999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f29000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f29001m = new HashSet();

    GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j15, String str6, List list, String str7, String str8) {
        this.f28990a = str;
        this.f28991b = str2;
        this.f28992c = str3;
        this.f28993d = str4;
        this.f28994e = uri;
        this.f28995f = str5;
        this.f28996g = j15;
        this.f28997h = str6;
        this.f28998j = list;
        this.f28999k = str7;
        this.f29000l = str8;
    }

    public static GoogleSignInAccount J(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j15 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i15 = 0; i15 < length; i15++) {
            hashSet.add(new Scope(jSONArray.getString(i15)));
        }
        GoogleSignInAccount googleSignInAccountK = K(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j15), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountK.f28995f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountK;
    }

    public static GoogleSignInAccount K(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l15, String str7, Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, l15.longValue(), s.f(str7), new ArrayList((Collection) s.l(set)), str5, str6);
    }

    public String C() {
        return this.f28991b;
    }

    public Uri E() {
        return this.f28994e;
    }

    public Set<Scope> H() {
        HashSet hashSet = new HashSet(this.f28998j);
        hashSet.addAll(this.f29001m);
        return hashSet;
    }

    public String I() {
        return this.f28995f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f28997h.equals(this.f28997h) && googleSignInAccount.H().equals(H());
    }

    public Account h() {
        String str = this.f28992c;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f28997h.hashCode() + 527) * 31) + H().hashCode();
    }

    public String m() {
        return this.f28993d;
    }

    public String p() {
        return this.f28992c;
    }

    public String r() {
        return this.f29000l;
    }

    public String u() {
        return this.f28999k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.u(parcel, 2, y(), false);
        c.u(parcel, 3, C(), false);
        c.u(parcel, 4, p(), false);
        c.u(parcel, 5, m(), false);
        c.t(parcel, 6, E(), i15, false);
        c.u(parcel, 7, I(), false);
        c.r(parcel, 8, this.f28996g);
        c.u(parcel, 9, this.f28997h, false);
        c.y(parcel, 10, this.f28998j, false);
        c.u(parcel, 11, u(), false);
        c.u(parcel, 12, r(), false);
        c.b(parcel, iA);
    }

    public String y() {
        return this.f28990a;
    }
}
