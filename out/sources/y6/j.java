package y6;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import u6.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ly6/j;", "Lu6/l0;", "Ly6/h;", "<init>", "()V", "", "value", "Lx6/j;", "f", "(Ljava/lang/Object;)Lx6/j;", "", "name", "Ly6/d;", "mutablePreferences", "Loq/i0;", "d", "(Ljava/lang/String;Lx6/j;Ly6/d;)V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Ltq/e;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "g", "(Ly6/h;Ljava/io/OutputStream;Ltq/e;)Ljava/lang/Object;", "e", "()Ly6/h;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements l0<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f224382a = new j();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224383a;

        static {
            int[] iArr = new int[x6.j.b.values().length];
            try {
                iArr[x6.j.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x6.j.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x6.j.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x6.j.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x6.j.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x6.j.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x6.j.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x6.j.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x6.j.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f224383a = iArr;
        }
    }

    private j() {
    }

    private final void d(String name, x6.j value, d mutablePreferences) throws u6.d {
        x6.j.b bVarM0 = value.m0();
        switch (bVarM0 == null ? -1 : a.f224383a[bVarM0.ordinal()]) {
            case -1:
                throw new u6.d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new p();
            case 1:
                mutablePreferences.k(k.a(name), Boolean.valueOf(value.d0()));
                return;
            case 2:
                mutablePreferences.k(k.d(name), Float.valueOf(value.h0()));
                return;
            case 3:
                mutablePreferences.k(k.c(name), Double.valueOf(value.g0()));
                return;
            case 4:
                mutablePreferences.k(k.e(name), Integer.valueOf(value.i0()));
                return;
            case 5:
                mutablePreferences.k(k.f(name), Long.valueOf(value.j0()));
                return;
            case 6:
                mutablePreferences.k(k.g(name), value.k0());
                return;
            case 7:
                mutablePreferences.k(k.h(name), v.k1(value.l0().Z()));
                return;
            case 8:
                mutablePreferences.k(k.b(name), value.e0().B());
                return;
            case 9:
                throw new u6.d("Value not set.", null, 2, null);
        }
    }

    private final x6.j f(Object value) {
        if (value instanceof Boolean) {
            return x6.j.n0().I(((Boolean) value).booleanValue()).build();
        }
        if (value instanceof Float) {
            return x6.j.n0().N(((Number) value).floatValue()).build();
        }
        if (value instanceof Double) {
            return x6.j.n0().K(((Number) value).doubleValue()).build();
        }
        if (value instanceof Integer) {
            return x6.j.n0().O(((Number) value).intValue()).build();
        }
        if (value instanceof Long) {
            return x6.j.n0().P(((Number) value).longValue()).build();
        }
        if (value instanceof String) {
            return x6.j.n0().Q((String) value).build();
        }
        if (value instanceof Set) {
            return x6.j.n0().R(x6.i.a0().I((Set) value)).build();
        }
        if (value instanceof byte[]) {
            return x6.j.n0().J(androidx.datastore.preferences.protobuf.g.i((byte[]) value)).build();
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // u6.l0
    public Object c(InputStream inputStream, tq.e<? super h> eVar) throws u6.d {
        x6.h hVarA = x6.f.INSTANCE.a(inputStream);
        d dVarB = i.b(new h.b[0]);
        for (Map.Entry<String, x6.j> entry : hVarA.X().entrySet()) {
            f224382a.d(entry.getKey(), entry.getValue(), dVarB);
        }
        return dVarB.d();
    }

    @Override // u6.l0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h b() {
        return i.a();
    }

    @Override // u6.l0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object a(h hVar, OutputStream outputStream, tq.e<? super i0> eVar) {
        Map<h.a<?>, Object> mapA = hVar.a();
        x6.h.a aVarA0 = x6.h.a0();
        for (Map.Entry<h.a<?>, Object> entry : mapA.entrySet()) {
            aVarA0.I(entry.getKey().getName(), f(entry.getValue()));
        }
        aVarA0.build().o(outputStream);
        return i0.f148189a;
    }
}
