package n2;

import er.l;
import fr.k;
import fr.t;
import fr.w0;
import oq.i0;
import p071kotlin.Metadata;
import r0.g1;
import r0.h1;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\nJ\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006*"}, d2 = {"Ln2/g;", "", "Key", "Scope", "Lr0/t0;", "map", "d", "(Lr0/t0;)Lr0/t0;", "key", "h", "(Lr0/t0;Ljava/lang/Object;)Ljava/lang/Object;", "scope", "Loq/i0;", "a", "(Lr0/t0;Ljava/lang/Object;Ljava/lang/Object;)V", "Lr0/h1;", "b", "(Lr0/t0;Ljava/lang/Object;Lr0/h1;)V", "value", "o", "element", "", "f", "(Lr0/t0;Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "g", "(Lr0/t0;Ler/l;)V", "c", "(Lr0/t0;)V", "j", "(Lr0/t0;)Z", "k", "l", "m", "(Lr0/t0;Ljava/lang/Object;Ljava/lang/Object;)Z", "n", "(Lr0/t0;Ljava/lang/Object;)V", "", "i", "(Lr0/t0;)I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<Key, Scope> {
    public static final void a(t0<Object, Object> t0Var, Key key, Scope scope) {
        int iN = t0Var.n(key);
        int i15 = 0;
        int i16 = 1;
        boolean z15 = iN < 0;
        k kVar = null;
        Object obj = z15 ? null : t0Var.values[iN];
        if (obj != null) {
            if (obj instanceof u0) {
                ((u0) obj).i(scope);
            } else if (obj != scope) {
                u0 u0Var = new u0(i15, i16, kVar);
                u0Var.i(obj);
                u0Var.i(scope);
                scope = (Scope) u0Var;
            }
            scope = (Scope) obj;
        }
        if (!z15) {
            t0Var.values[iN] = scope;
            return;
        }
        int i17 = ~iN;
        t0Var.keys[i17] = key;
        t0Var.values[i17] = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t0<Object, Object> t0Var, Key key, h1<Scope> h1Var) {
        Object obj;
        Object obj2;
        Object obj3;
        u0 u0Var;
        u0 u0VarB;
        int iN = t0Var.n(key);
        boolean z15 = iN < 0;
        if (z15) {
            obj2 = null;
        } else {
            obj = t0Var.values[iN];
        }
        if (obj2 == null) {
            obj2 = obj;
            u0VarB = i1.b();
            u0VarB.k(h1Var);
        } else {
            obj2 = obj;
            if (obj2 instanceof u0) {
                u0Var = (u0) obj2;
                u0Var.k(h1Var);
            } else if (h1Var.get_size() != 1 || !h1Var.a(obj2)) {
                obj3 = obj2;
                u0 u0VarB2 = i1.b();
                u0VarB2.k(h1Var);
                u0VarB2.i(obj2);
                obj3 = u0VarB2;
            }
        }
        if (!z15) {
            obj3 = u0Var;
            obj3 = u0VarB;
            t0Var.values[iN] = obj3;
        } else {
            obj3 = u0Var;
            obj3 = u0VarB;
            int i15 = ~iN;
            t0Var.keys[i15] = key;
            t0Var.values[i15] = obj3;
        }
    }

    public static final void c(t0<Object, Object> t0Var) {
        t0Var.k();
    }

    public static <Key, Scope> t0<Object, Object> d(t0<Object, Object> t0Var) {
        return t0Var;
    }

    public static /* synthetic */ t0 e(t0 t0Var, int i15, k kVar) {
        if ((i15 & 1) != 0) {
            t0Var = g1.c();
        }
        return d(t0Var);
    }

    public static final boolean f(t0<Object, Object> t0Var, Key key) {
        return t0Var.c(key);
    }

    public static final void g(t0<Object, Object> t0Var, l<? super Key, i0> lVar) {
        l lVar2 = (l) w0.g(lVar, 1);
        Object[] objArr = t0Var.keys;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        lVar2.b(objArr[(i15 << 3) + i17]);
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public static final Object h(t0<Object, Object> t0Var, Key key) {
        return t0Var.e(key);
    }

    public static final int i(t0<Object, Object> t0Var) {
        return t0Var.get_size();
    }

    public static final boolean j(t0<Object, Object> t0Var) {
        return t0Var.h();
    }

    public static final boolean k(t0<Object, Object> t0Var) {
        return t0Var.i();
    }

    public static final Object l(t0<Object, Object> t0Var, Key key) {
        return t0Var.u(key);
    }

    public static final boolean m(t0<Object, Object> t0Var, Key key, Scope scope) {
        Object objE = t0Var.e(key);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof u0)) {
            if (!t.c(objE, scope)) {
                return false;
            }
            t0Var.u(key);
            return true;
        }
        u0 u0Var = (u0) objE;
        boolean z15 = u0Var.z(scope);
        if (z15 && u0Var.e()) {
            t0Var.u(key);
        }
        return z15;
    }

    public static final void n(t0<Object, Object> t0Var, Scope scope) {
        boolean zE;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = t0Var.keys[i18];
                        Object obj2 = t0Var.values[i18];
                        if (obj2 instanceof u0) {
                            u0 u0Var = (u0) obj2;
                            u0Var.z(scope);
                            zE = u0Var.e();
                        } else {
                            zE = obj2 == scope;
                        }
                        if (zE) {
                            t0Var.v(i18);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public static final void o(t0<Object, Object> t0Var, Key key, Scope scope) {
        t0Var.x(key, scope);
    }
}
