package hn;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f85819a = Charset.defaultCharset();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f85820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f85821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f85822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f85823e;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f85820b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f85821c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f85822d = charsetForName3;
        Charset charset = f85820b;
        f85823e = (charset != null && charset.equals(f85819a)) || (charsetForName3 != null && charsetForName3.equals(f85819a));
    }
}
