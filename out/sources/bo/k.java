package bo;

import ao.b0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import yn.a0;
import yn.x;
import yn.y;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends z<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a0 f20494c = f(x.f228084a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yn.f f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f20496b;

    class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f20497a;

        a(y yVar) {
            this.f20497a = yVar;
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            a aVar2 = null;
            if (aVar.d() == Object.class) {
                return new k(fVar, this.f20497a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20498a;

        static {
            int[] iArr = new int[ho.b.values().length];
            f20498a = iArr;
            try {
                iArr[ho.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20498a[ho.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20498a[ho.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20498a[ho.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20498a[ho.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20498a[ho.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ k(yn.f fVar, y yVar, a aVar) {
        this(fVar, yVar);
    }

    public static a0 e(y yVar) {
        return yVar == x.f228084a ? f20494c : f(yVar);
    }

    private static a0 f(y yVar) {
        return new a(yVar);
    }

    private Object g(ho.a aVar, ho.b bVar) throws IOException {
        int i15 = b.f20498a[bVar.ordinal()];
        if (i15 == 3) {
            return aVar.q2();
        }
        if (i15 == 4) {
            return this.f20496b.b(aVar);
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

    private Object h(ho.a aVar, ho.b bVar) throws IOException {
        int i15 = b.f20498a[bVar.ordinal()];
        if (i15 == 1) {
            aVar.h();
            return new ArrayList();
        }
        if (i15 != 2) {
            return null;
        }
        aVar.Y();
        return new b0();
    }

    @Override // yn.z
    public Object b(ho.a aVar) throws IOException {
        ho.b bVarA0 = aVar.a0();
        Object objH = h(aVar, bVarA0);
        if (objH == null) {
            return g(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.I()) {
                String strH1 = objH instanceof Map ? aVar.h1() : null;
                ho.b bVarA1 = aVar.a0();
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

    @Override // yn.z
    public void d(ho.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        z zVarL = this.f20495a.l(obj.getClass());
        if (!(zVarL instanceof k)) {
            zVarL.d(cVar, obj);
        } else {
            cVar.r();
            cVar.C();
        }
    }

    private k(yn.f fVar, y yVar) {
        this.f20495a = fVar;
        this.f20496b = yVar;
    }
}
