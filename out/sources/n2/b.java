package n2;

import er.l;
import fr.k;
import fr.t;
import fr.w0;
import lr.i;
import lr.m;
import p071kotlin.Metadata;
import pq.n;
import r0.a1;
import r0.b1;
import r0.q0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006+"}, d2 = {"Ln2/b;", "", "K", "V", "Lr0/t0;", "map", "d", "(Lr0/t0;)Lr0/t0;", "key", "value", "Loq/i0;", "a", "(Lr0/t0;Ljava/lang/Object;Ljava/lang/Object;)V", "c", "(Lr0/t0;)V", "", "f", "(Lr0/t0;Ljava/lang/Object;)Z", "Lr0/a1;", "h", "(Lr0/t0;Ljava/lang/Object;)Lr0/a1;", "j", "(Lr0/t0;)Z", "k", "m", "(Lr0/t0;Ljava/lang/Object;)Ljava/lang/Object;", "l", "q", "(Lr0/t0;)Lr0/a1;", "Lkotlin/Function1;", "condition", "n", "(Lr0/t0;Ljava/lang/Object;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lr0/t0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> map;

    private /* synthetic */ b(t0 t0Var) {
        this.map = t0Var;
    }

    public static final void a(t0<Object, Object> t0Var, K k15, V v15) {
        int iN = t0Var.n(k15);
        boolean z15 = iN < 0;
        Object obj = z15 ? null : t0Var.values[iN];
        w0.p(obj);
        if (obj != null) {
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                q0Var.n(v15);
                v15 = (V) q0Var;
            } else {
                v15 = (V) b1.h(obj, v15);
            }
        }
        if (!z15) {
            t0Var.values[iN] = v15;
            return;
        }
        int i15 = ~iN;
        t0Var.keys[i15] = k15;
        t0Var.values[i15] = v15;
    }

    public static final /* synthetic */ b b(t0 t0Var) {
        return new b(t0Var);
    }

    public static final void c(t0<Object, Object> t0Var) {
        t0Var.k();
    }

    public static <K, V> t0<Object, Object> d(t0<Object, Object> t0Var) {
        return t0Var;
    }

    public static /* synthetic */ t0 e(t0 t0Var, int i15, k kVar) {
        if ((i15 & 1) != 0) {
            t0Var = new t0(0, 1, null);
        }
        return d(t0Var);
    }

    public static final boolean f(t0<Object, Object> t0Var, K k15) {
        return t0Var.b(k15);
    }

    public static boolean g(t0<Object, Object> t0Var, Object obj) {
        return (obj instanceof b) && t.c(t0Var, ((b) obj).getMap());
    }

    public static final a1<V> h(t0<Object, Object> t0Var, K k15) {
        Object objE = t0Var.e(k15);
        if (objE == null) {
            return b1.f();
        }
        return objE instanceof q0 ? (a1) objE : b1.i(objE);
    }

    public static int i(t0<Object, Object> t0Var) {
        return t0Var.hashCode();
    }

    public static final boolean j(t0<Object, Object> t0Var) {
        return t0Var.h();
    }

    public static final boolean k(t0<Object, Object> t0Var) {
        return t0Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V l(t0<Object, Object> t0Var, K k15) {
        V v15 = (V) t0Var.e(k15);
        if (v15 == 0) {
            return null;
        }
        if (!(v15 instanceof q0)) {
            t0Var.u(k15);
            return v15;
        }
        q0 q0Var = (q0) v15;
        V v16 = (V) q0Var.B(0);
        if (q0Var.g()) {
            t0Var.u(k15);
        }
        if (q0Var.get_size() == 1) {
            t0Var.x(k15, q0Var.c());
        }
        return v16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V m(t0<Object, Object> t0Var, K k15) {
        V v15 = (V) t0Var.e(k15);
        if (v15 == 0) {
            return null;
        }
        if (!(v15 instanceof q0)) {
            t0Var.u(k15);
            return v15;
        }
        q0 q0Var = (q0) v15;
        V v16 = (V) a.b(q0Var);
        if (q0Var.g()) {
            t0Var.u(k15);
        }
        if (q0Var.get_size() == 1) {
            t0Var.x(k15, q0Var.c());
        }
        return v16;
    }

    public static final void n(t0<Object, Object> t0Var, K k15, l<? super V, Boolean> lVar) {
        Object objE = t0Var.e(k15);
        if (objE != null) {
            if (!(objE instanceof q0)) {
                if (lVar.b(objE).booleanValue()) {
                    t0Var.u(k15);
                    return;
                }
                return;
            }
            q0 q0Var = (q0) objE;
            int i15 = q0Var._size;
            Object[] objArr = q0Var.content;
            int i16 = 0;
            i iVarW = m.w(0, i15);
            int first = iVarW.getFirst();
            int last = iVarW.getLast();
            if (first <= last) {
                while (true) {
                    objArr[first - i16] = objArr[first];
                    if (lVar.b(objArr[first]).booleanValue()) {
                        i16++;
                    }
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            n.z(objArr, null, i15 - i16, i15);
            q0Var._size -= i16;
            if (q0Var.g()) {
                t0Var.u(k15);
            }
            if (q0Var.get_size() == 0) {
                t0Var.x(k15, q0Var.c());
            }
        }
    }

    public static String o(t0<Object, Object> t0Var) {
        return "MultiValueMap(map=" + t0Var + ')';
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005c A[LOOP:0: B:9:0x001d->B:22:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[EDGE_INSN: B:25:0x005f->B:23:0x005f BREAK  A[LOOP:0: B:9:0x001d->B:22:0x005c], SYNTHETIC] */
    public static final a1<V> q(t0<Object, Object> t0Var) {
        if (t0Var.h()) {
            return b1.f();
        }
        q0 q0Var = new q0(0, 1, null);
        Object[] objArr = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            Object obj = objArr[(i15 << 3) + i17];
                            if (obj instanceof q0) {
                                q0Var.r((q0) obj);
                            } else {
                                q0Var.n(obj);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return q0Var;
    }

    public boolean equals(Object other) {
        return g(this.map, other);
    }

    public int hashCode() {
        return i(this.map);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ t0 getMap() {
        return this.map;
    }

    public String toString() {
        return o(this.map);
    }
}
