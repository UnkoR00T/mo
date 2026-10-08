package ov;

import fr.k;
import fr.t;
import fv.a0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u0015B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Lov/e;", "Lov/h;", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lfv/a0;", "protocols", "Loq/i0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "g", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "d", "Ljava/lang/reflect/Method;", "f", "Ljava/lang/Class;", "h", "i", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Method putMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Method getMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Method removeMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Class<?> clientProviderClass;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Class<?> serverProviderClass;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lov/e$a;", "Ljava/lang/reflect/InvocationHandler;", "", "", "protocols", "<init>", "(Ljava/util/List;)V", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/List;", "", "b", "Z", "()Z", "setUnsupported", "(Z)V", "unsupported", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "selected", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> protocols;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean unsupported;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String selected;

        public a(List<String> list) {
            this.protocols = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            if (args == null) {
                args = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (t.c(name, "supports") && t.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (t.c(name, "unsupported") && t.c(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (t.c(name, "protocols") && args.length == 0) {
                return this.protocols;
            }
            if ((t.c(name, "selectProtocol") || t.c(name, "select")) && t.c(String.class, returnType) && args.length == 1) {
                Object obj = args[0];
                if (obj instanceof List) {
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i15 = 0;
                        while (true) {
                            String str = (String) list.get(i15);
                            if (this.protocols.contains(str)) {
                                this.selected = str;
                                return str;
                            }
                            if (i15 != size) {
                                i15++;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!t.c(name, "protocolSelected") && !t.c(name, "selected")) || args.length != 1) {
                return method.invoke(this, Arrays.copyOf(args, args.length));
            }
            this.selected = (String) args[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: ov.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov/e$b;", "", "<init>", "()V", "Lov/h;", "a", "()Lov/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final h a() {
            try {
                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // ov.h
    public void b(SSLSocket sslSocket) {
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException e15) {
            throw new AssertionError("failed to remove ALPN", e15);
        } catch (InvocationTargetException e16) {
            throw new AssertionError("failed to remove ALPN", e16);
        }
    }

    @Override // ov.h
    public void e(SSLSocket sslSocket, String hostname, List<? extends a0> protocols) {
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new a(h.INSTANCE.b(protocols))));
        } catch (IllegalAccessException e15) {
            throw new AssertionError("failed to set ALPN", e15);
        } catch (InvocationTargetException e16) {
            throw new AssertionError("failed to set ALPN", e16);
        }
    }

    @Override // ov.h
    public String g(SSLSocket sslSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            if (!aVar.getUnsupported() && aVar.getSelected() == null) {
                h.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.getUnsupported()) {
                return null;
            }
            return aVar.getSelected();
        } catch (IllegalAccessException e15) {
            throw new AssertionError("failed to get ALPN selected protocol", e15);
        } catch (InvocationTargetException e16) {
            throw new AssertionError("failed to get ALPN selected protocol", e16);
        }
    }
}
