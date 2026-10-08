package p076m2;

import er.p;
import fr.w0;
import p071kotlin.Metadata;
import r0.i0;
import r0.q0;
import y2.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J5\u0010\u001d\u001a\u00020\u00072\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\nJ#\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\nR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\"\u00100\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b'\u0010.\"\u0004\b/\u0010\u0005¨\u00061"}, d2 = {"Lm2/s4;", "N", "Lm2/c;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Loq/i0;", "g", "j", "()V", "", "index", "count", "b", "(II)V", "from", "to", "c", "(III)V", "clear", "instance", "f", "(ILjava/lang/Object;)V", "d", "Lkotlin/Function2;", "", "block", "value", "k", "(Ler/p;Ljava/lang/Object;)V", "h", "applier", "Ly2/u;", "rememberManager", "m", "(Lm2/c;Ly2/u;)V", "l", "Lr0/i0;", "a", "Lr0/i0;", "operations", "Lr0/q0;", "Lr0/q0;", "instances", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setCurrent", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s4<N> implements c<N> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123146e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 operations = new i0(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0<Object> instances = new q0<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private N current;

    public s4(N n15) {
        this.current = n15;
    }

    @Override // p076m2.c
    public N a() {
        return this.current;
    }

    @Override // p076m2.c
    public void b(int index, int count) {
        this.operations.k(2);
        this.operations.k(index);
        this.operations.k(count);
    }

    @Override // p076m2.c
    public void c(int from, int to4, int count) {
        this.operations.k(3);
        this.operations.k(from);
        this.operations.k(to4);
        this.operations.k(count);
    }

    @Override // p076m2.c
    public void clear() {
        this.operations.k(4);
    }

    @Override // p076m2.c
    public void d(int index, N instance) {
        this.operations.k(6);
        this.operations.k(index);
        this.instances.n(instance);
    }

    @Override // p076m2.c
    public void f(int index, N instance) {
        this.operations.k(5);
        this.operations.k(index);
        this.instances.n(instance);
    }

    @Override // p076m2.c
    public void g(N node) {
        this.operations.k(1);
        this.instances.n(node);
    }

    @Override // p076m2.c
    public void h() {
        this.operations.k(8);
    }

    @Override // p076m2.c
    public void j() {
        this.operations.k(0);
    }

    @Override // p076m2.c
    public void k(p<? super N, Object, oq.i0> block, Object value) {
        this.operations.k(7);
        this.instances.n(block);
        this.instances.n(value);
    }

    public final void l() {
        this.operations.k(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(c<N> applier, u rememberManager) {
        Exception exc;
        int i15;
        i0 i0Var = this.operations;
        int i16 = i0Var._size;
        q0<Object> q0Var = this.instances;
        q0 q0Var2 = new q0(0, 1, null);
        applier.i();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int i19 = i17 + 1;
            try {
                try {
                    switch (i0Var.e(i17)) {
                        case 0:
                            applier.j();
                            i17 = i19;
                            break;
                        case 1:
                            int i25 = i18 + 1;
                            applier.g(q0Var.d(i18));
                            i18 = i25;
                            i17 = i19;
                            break;
                        case 2:
                            int i26 = i17 + 2;
                            i17 += 3;
                            applier.b(i0Var.e(i19), i0Var.e(i26));
                            break;
                        case 3:
                            int i27 = i17 + 2;
                            try {
                                int i28 = i17 + 3;
                                try {
                                    i17 += 4;
                                    applier.c(i0Var.e(i19), i0Var.e(i27), i0Var.e(i28));
                                } catch (Exception e15) {
                                    exc = e15;
                                    i17 = i28;
                                    throw new o(q0Var, q0Var2, i0Var, i17 - 1, exc);
                                }
                            } catch (Exception e16) {
                                exc = e16;
                                i17 = i27;
                            }
                            break;
                        case 4:
                            applier.clear();
                            i17 = i19;
                            break;
                        case 5:
                            i17 += 2;
                            i15 = i18 + 1;
                            applier.f(i0Var.e(i19), q0Var.d(i18));
                            i18 = i15;
                            break;
                        case 6:
                            i17 += 2;
                            try {
                                i15 = i18 + 1;
                                applier.d(i0Var.e(i19), q0Var.d(i18));
                                i18 = i15;
                            } catch (Exception e17) {
                                exc = e17;
                                throw new o(q0Var, q0Var2, i0Var, i17 - 1, exc);
                            }
                            break;
                        case 7:
                            int i29 = i18 + 1;
                            p pVar = (p) w0.g(q0Var.d(i18), 2);
                            i18 += 2;
                            applier.k(pVar, q0Var.d(i29));
                            i17 = i19;
                            break;
                        case 8:
                            Object objA = applier.a();
                            if (objA instanceof n) {
                                rememberManager.k((n) objA);
                            }
                            q0Var2.n(objA);
                            applier.h();
                            i17 = i19;
                            break;
                        default:
                            i17 = i19;
                            break;
                    }
                } catch (Exception e18) {
                    exc = e18;
                    i17 = i19;
                }
            } catch (Throwable th4) {
                applier.e();
                throw th4;
            }
        }
        if (!(i18 == q0Var.get_size())) {
            t.b("Applier operation size mismatch");
        }
        q0Var.u();
        i0Var.m();
        applier.e();
    }
}
