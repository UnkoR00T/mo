package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
final class ap0 extends ep0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f31704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f31705f;

    /* synthetic */ ap0(Provider provider, Method method, Method method2, byte[] bArr) {
        super(provider);
        this.f31704e = method;
        this.f31705f = method2;
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final void a(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp0 fp0Var = (fp0) it.next();
            if (fp0Var != fp0.HTTP_1_0) {
                arrayList.add(fp0Var.toString());
            }
        }
        try {
            this.f31704e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException(e16);
        }
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final String b(SSLSocket sSLSocket) {
        try {
            return (String) this.f31705f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException(e16);
        }
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final int c() {
        return 1;
    }
}
