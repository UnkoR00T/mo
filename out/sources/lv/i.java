package lv;

import fv.b0;
import fv.v;
import java.net.Proxy;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llv/i;", "", "<init>", "()V", "Lfv/b0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(Lfv/b0;Ljava/net/Proxy$Type;)Z", "", "a", "(Lfv/b0;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lfv/v;", "url", "c", "(Lfv/v;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f120567a = new i();

    private i() {
    }

    private final boolean b(b0 request, Proxy.Type proxyType) {
        return !request.g() && proxyType == Proxy.Type.HTTP;
    }

    public final String a(b0 request, Proxy.Type proxyType) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(request.getMethod());
        sb5.append(' ');
        i iVar = f120567a;
        if (iVar.b(request, proxyType)) {
            sb5.append(request.getUrl());
        } else {
            sb5.append(iVar.c(request.getUrl()));
        }
        sb5.append(" HTTP/1.1");
        return sb5.toString();
    }

    public final String c(v url) {
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
