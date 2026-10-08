package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectTypeAdapter extends a0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f36742c = f(y.f36874a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f36744b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36746a;

        static {
            int[] iArr = new int[zl.b.values().length];
            f36746a = iArr;
            try {
                iArr[zl.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36746a[zl.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36746a[zl.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36746a[zl.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36746a[zl.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36746a[zl.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static b0 e(z zVar) {
        return zVar == y.f36874a ? f36742c : f(zVar);
    }

    private static b0 f(final z zVar) {
        return new b0() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.b0
            public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
                if (aVar.c() == Object.class) {
                    return new ObjectTypeAdapter(fVar, zVar);
                }
                return null;
            }
        };
    }

    private Object g(zl.a aVar, zl.b bVar) throws IOException {
        int i15 = a.f36746a[bVar.ordinal()];
        if (i15 == 3) {
            return aVar.q2();
        }
        if (i15 == 4) {
            return this.f36744b.b(aVar);
        }
        if (i15 == 5) {
            return Boolean.valueOf(aVar.M());
        }
        if (i15 == 6) {
            aVar.O();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(zl.a aVar, zl.b bVar) throws IOException {
        int i15 = a.f36746a[bVar.ordinal()];
        if (i15 == 1) {
            aVar.h();
            return new ArrayList();
        }
        if (i15 != 2) {
            return null;
        }
        aVar.Y();
        return new wl.a0();
    }

    @Override // com.google.gson.a0
    public Object b(zl.a aVar) throws IOException {
        zl.b bVarA0 = aVar.a0();
        Object objH = h(aVar, bVarA0);
        if (objH == null) {
            return g(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.I()) {
                String strH1 = objH instanceof Map ? aVar.h1() : null;
                zl.b bVarA1 = aVar.a0();
                Object objH2 = h(aVar, bVarA1);
                boolean z15 = objH2 != null;
                if (objH2 == null) {
                    objH2 = g(aVar, bVarA1);
                }
                if (objH instanceof List) {
                    ((List) objH).add(objH2);
                } else {
                    ((Map) objH).put(strH1, objH2);
                }
                if (z15) {
                    arrayDeque.addLast(objH);
                    objH = objH2;
                }
            } else {
                if (objH instanceof List) {
                    aVar.u();
                } else {
                    aVar.h0();
                }
                if (arrayDeque.isEmpty()) {
                    return objH;
                }
                objH = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.a0
    public void d(zl.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        a0 a0VarM = this.f36743a.m(obj.getClass());
        if (!(a0VarM instanceof ObjectTypeAdapter)) {
            a0VarM.d(cVar, obj);
        } else {
            cVar.r();
            cVar.C();
        }
    }

    private ObjectTypeAdapter(f fVar, z zVar) {
        this.f36743a = fVar;
        this.f36744b = zVar;
    }
}
