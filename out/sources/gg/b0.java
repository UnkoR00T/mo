package gg;

import android.content.Context;
import io.sentry.android.core.c2;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z f72717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final z f72718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final z f72719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final z f72720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final z f72721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final z f72722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f72723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Context f72724h;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        f72717a = new r("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset));
        f72718b = new s("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset));
        f72719c = new t("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset));
        f72720d = new u("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset));
        f72721e = new v("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset));
        f72722f = new w("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset));
        f72723g = new Object();
    }

    static synchronized void a(Context context) {
        if (f72724h != null) {
            c2.g("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f72724h = context.getApplicationContext();
        }
    }
}
