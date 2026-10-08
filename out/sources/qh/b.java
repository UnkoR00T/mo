package qh;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final hg.a.g<gh.e> f166444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final hg.a.AbstractC1948a<gh.e, hg.a.d.c> f166445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final hg.a<hg.a.d.c> f166446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final i f166447d;

    /* JADX WARN: Type inference failed for: r0v1, types: [gh.d, qh.i] */
    static {
        hg.a.g<gh.e> gVar = new hg.a.g<>();
        f166444a = gVar;
        h hVar = new h();
        f166445b = hVar;
        f166446c = new hg.a<>("Phenotype.API", hVar, gVar);
        f166447d = new gh.d();
    }

    public static Uri a(String str) {
        String strValueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
