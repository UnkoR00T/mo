package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class cp0 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31923c;

    public cp0(List list) {
        this.f31921a = list;
    }

    final /* synthetic */ boolean a() {
        return this.f31922b;
    }

    final /* synthetic */ String b() {
        return this.f31923c;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = hp0.f32506a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f31922b = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.f31921a;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (this.f31921a.contains(list.get(i15))) {
                        String str = (String) list.get(i15);
                        this.f31923c = str;
                        return str;
                    }
                }
                String str2 = (String) this.f31921a.get(0);
                this.f31923c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f31923c = (String) objArr[0];
        return null;
    }
}
