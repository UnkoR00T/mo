package com.google.android.libraries.places.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class f40 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f40 f32247h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j50 f32248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f32249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[][] f32250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f32251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f32252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f32253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f32254g;

    static {
        d40 d40Var = new d40();
        d40Var.f31966c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        d40Var.f31967d = Collections.EMPTY_LIST;
        f32247h = new f40(d40Var, null);
    }

    /* synthetic */ f40(d40 d40Var, byte[] bArr) {
        this.f32248a = d40Var.f31964a;
        this.f32249b = d40Var.f31965b;
        this.f32250c = d40Var.f31966c;
        this.f32251d = d40Var.f31967d;
        this.f32252e = d40Var.f31968e;
        this.f32253f = d40Var.f31969f;
        this.f32254g = d40Var.f31970g;
    }

    private static d40 p(f40 f40Var) {
        d40 d40Var = new d40();
        d40Var.f31964a = f40Var.f32248a;
        d40Var.f31965b = f40Var.f32249b;
        d40Var.f31966c = f40Var.f32250c;
        d40Var.f31967d = f40Var.f32251d;
        d40Var.f31968e = f40Var.f32252e;
        d40Var.f31969f = f40Var.f32253f;
        d40Var.f31970g = f40Var.f32254g;
        return d40Var;
    }

    public final f40 a(j50 j50Var) {
        d40 d40VarP = p(this);
        d40VarP.f31964a = j50Var;
        return new f40(d40VarP, null);
    }

    public final j50 b() {
        return this.f32248a;
    }

    public final f40 c() {
        d40 d40VarP = p(this);
        d40VarP.f31968e = Boolean.TRUE;
        return new f40(d40VarP, null);
    }

    public final f40 d() {
        d40 d40VarP = p(this);
        d40VarP.f31968e = Boolean.FALSE;
        return new f40(d40VarP, null);
    }

    public final f40 e(Executor executor) {
        d40 d40VarP = p(this);
        d40VarP.f31965b = executor;
        return new f40(d40VarP, null);
    }

    public final f40 f(p40 p40Var) {
        List list = this.f32251d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(p40Var);
        d40 d40VarP = p(this);
        d40VarP.f31967d = Collections.unmodifiableList(arrayList);
        return new f40(d40VarP, null);
    }

    public final List g() {
        return this.f32251d;
    }

    public final f40 h(e40 e40Var, Object obj) {
        Object[][] objArr;
        int length;
        zj.p.r(e40Var, "key");
        zj.p.r(obj, "value");
        d40 d40VarP = p(this);
        int i15 = 0;
        while (true) {
            objArr = this.f32250c;
            length = objArr.length;
            if (i15 >= length) {
                i15 = -1;
                break;
            }
            if (e40Var.equals(objArr[i15][0])) {
                break;
            }
            i15++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, (i15 == -1 ? 1 : 0) + length, 2);
        d40VarP.f31966c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        if (i15 == -1) {
            d40VarP.f31966c[length] = new Object[]{e40Var, obj};
        } else {
            d40VarP.f31966c[i15] = new Object[]{e40Var, obj};
        }
        return new f40(d40VarP, null);
    }

    public final Object i(e40 e40Var) {
        zj.p.r(e40Var, "key");
        int i15 = 0;
        while (true) {
            Object[][] objArr = this.f32250c;
            if (i15 >= objArr.length) {
                return null;
            }
            if (e40Var.equals(objArr[i15][0])) {
                return objArr[i15][1];
            }
            i15++;
        }
    }

    public final Executor j() {
        return this.f32249b;
    }

    public final boolean k() {
        return Boolean.TRUE.equals(this.f32252e);
    }

    public final f40 l(int i15) {
        zj.p.h(i15 >= 0, "invalid maxsize %s", i15);
        d40 d40VarP = p(this);
        d40VarP.f31969f = Integer.valueOf(i15);
        return new f40(d40VarP, null);
    }

    public final f40 m(int i15) {
        zj.p.h(i15 >= 0, "invalid maxsize %s", i15);
        d40 d40VarP = p(this);
        d40VarP.f31970g = Integer.valueOf(i15);
        return new f40(d40VarP, null);
    }

    public final Integer n() {
        return this.f32253f;
    }

    public final Integer o() {
        return this.f32254g;
    }

    public final String toString() {
        zj.j.b bVarD = zj.j.c(this).d("deadline", this.f32248a).d("authority", null).d("callCredentials", null);
        Executor executor = this.f32249b;
        return bVarD.d("executor", executor != null ? executor.getClass() : null).d("compressorName", null).d("customOptions", Arrays.deepToString(this.f32250c)).e("waitForReady", k()).d("maxInboundMessageSize", this.f32253f).d("maxOutboundMessageSize", this.f32254g).d("onReadyThreshold", null).d("streamTracerFactories", this.f32251d).toString();
    }
}
