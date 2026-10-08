package jb;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.WeakHashMap;
import kb.j;
import kb.k;
import kb.l;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f101266a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f101267b = Uri.parse("");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<WebView, Object> f101268c = new WeakHashMap<>();

    public static PackageInfo a() {
        return kb.b.a();
    }

    private static l b() {
        return k.d();
    }

    public static boolean c() {
        if (j.S.d()) {
            return b().getStatics().isMultiProcessEnabled();
        }
        throw j.a();
    }
}
