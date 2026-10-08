package com.google.android.datatransport.cct;

import af.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f28857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f28858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<ye.c> f28860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28862h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28864b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f28857c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f28858d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f28859e = strA3;
        f28860f = Collections.unmodifiableSet(new HashSet(Arrays.asList(ye.c.b("proto"), ye.c.b("json"))));
        f28861g = new a(strA, null);
        f28862h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f28863a = str;
        this.f28864b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // af.g
    public Set<ye.c> a() {
        return f28860f;
    }

    public byte[] b() {
        String str = this.f28864b;
        if (str == null && this.f28863a == null) {
            return null;
        }
        String str2 = this.f28863a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f28864b;
    }

    public String e() {
        return this.f28863a;
    }

    @Override // af.f
    public byte[] getExtras() {
        return b();
    }

    @Override // af.f
    public String getName() {
        return "cct";
    }
}
