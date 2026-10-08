package vc;

import kc.Extras;
import p071kotlin.Metadata;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000e\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkc/l$c;", "", "a", "Lkc/l$c;", "httpMethodKey", "Lvc/p;", "b", "httpHeadersKey", "Lvc/r;", "c", "httpBodyKey", "Lzc/n;", "(Lzc/n;)Ljava/lang/String;", "httpMethod", "(Lzc/n;)Lvc/p;", "httpHeaders", "(Lzc/n;)Lvc/r;", "httpBody", "coil-network-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<String> f205972a = new Extras.c<>("GET");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<NetworkHeaders> f205973b = new Extras.c<>(NetworkHeaders.f206014c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<r> f205974c = new Extras.c<>(null);

    public static final r a(Options options) {
        return (r) kc.m.b(options, f205974c);
    }

    public static final NetworkHeaders b(Options options) {
        return (NetworkHeaders) kc.m.b(options, f205973b);
    }

    public static final String c(Options options) {
        return (String) kc.m.b(options, f205972a);
    }
}
