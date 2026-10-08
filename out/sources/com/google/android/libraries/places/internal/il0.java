package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class il0 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final jl0 f32573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ll0 f32574b;

    il0(ll0 ll0Var, jl0 jl0Var) {
        Objects.requireNonNull(ll0Var);
        this.f32574b = ll0Var;
        this.f32573a = jl0Var;
    }

    private static final Integer e(a80 a80Var) {
        String str = (String) a80Var.b(ll0.B);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void a(km0 km0Var) {
        ll0 ll0Var = this.f32574b;
        jl0 jl0Var = ll0Var.E().f31670f;
        zj.p.x(jl0Var != null, "Headers should be received prior to messages.");
        if (jl0Var != this.f32573a) {
            ze0.g(km0Var);
            return;
        }
        u90 u90Var = (u90) ll0Var.k();
        u90Var.c(new gl0(this, km0Var));
        u90Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01f4  */
    @Override // com.google.android.libraries.places.internal.ib0
    public final void b(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        boolean z15;
        uk0 uk0Var;
        String string;
        ll0 ll0Var = this.f32574b;
        synchronized (ll0Var.y()) {
            try {
                al0 al0VarE = ll0Var.E();
                jl0 jl0Var = this.f32573a;
                jl0Var.f32665b = true;
                Collection collection = al0VarE.f31667c;
                if (collection.contains(jl0Var)) {
                    ArrayList arrayList = new ArrayList(collection);
                    arrayList.remove(jl0Var);
                    al0VarE = new al0(al0VarE.f31666b, Collections.unmodifiableCollection(arrayList), al0VarE.f31668d, al0VarE.f31670f, al0VarE.f31671g, al0VarE.f31665a, al0VarE.f31672h, al0VarE.f31669e);
                }
                ll0Var.F(al0VarE);
                ll0Var.D().a(l90Var.g());
            } catch (Throwable th4) {
                throw th4;
            }
        }
        ll0 ll0Var2 = this.f32574b;
        if (ll0Var2.J().decrementAndGet() == Integer.MIN_VALUE) {
            u90 u90Var = (u90) ll0Var2.k();
            u90Var.c(new el0(this));
            u90Var.a();
            return;
        }
        jl0 jl0Var2 = this.f32573a;
        if (jl0Var2.f32666c) {
            ll0Var2.h0(jl0Var2);
            if (ll0Var2.E().f31670f == jl0Var2) {
                ll0Var2.f(l90Var, hb0Var, a80Var);
                return;
            }
            return;
        }
        hb0 hb0Var2 = hb0.MISCARRIED;
        if (hb0Var == hb0Var2 && ll0Var2.H().incrementAndGet() > 1000) {
            ll0Var2.h0(jl0Var2);
            if (ll0Var2.E().f31670f == jl0Var2) {
                i90 i90Var = i90.INTERNAL;
                w70 w70Var = ze0.f34495c;
                l90 l90VarB = i90Var.b();
                if (l90Var.h() == null) {
                    string = l90Var.g().toString();
                } else {
                    String strValueOf = String.valueOf(l90Var.g());
                    String strH = l90Var.h();
                    StringBuilder sb5 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strH).length());
                    sb5.append(strValueOf);
                    sb5.append(": ");
                    sb5.append(strH);
                    string = sb5.toString();
                }
                ll0Var2.f(l90VarB.e("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(string))).d(l90Var.i()), hb0Var, a80Var);
                return;
            }
            return;
        }
        if (ll0Var2.E().f31670f == null) {
            if (hb0Var == hb0Var2 || (hb0Var == hb0.REFUSED && ll0Var2.G().compareAndSet(false, true))) {
                ll0 ll0Var3 = this.f32574b;
                jl0 jl0Var3 = this.f32573a;
                jl0 jl0VarI0 = ll0Var3.i0(jl0Var3.f32667d, true, false);
                if (jl0VarI0 != null) {
                    if (ll0Var3.x()) {
                        synchronized (ll0Var3.y()) {
                            al0 al0VarE2 = ll0Var3.E();
                            ArrayList arrayList2 = new ArrayList(al0VarE2.f31668d);
                            arrayList2.remove(jl0Var3);
                            arrayList2.add(jl0VarI0);
                            ll0Var3.F(new al0(al0VarE2.f31666b, al0VarE2.f31667c, Collections.unmodifiableCollection(arrayList2), al0VarE2.f31670f, al0VarE2.f31671g, al0VarE2.f31665a, al0VarE2.f31672h, al0VarE2.f31669e));
                        }
                    }
                    this.f32574b.j().execute(new fl0(this, jl0VarI0));
                    return;
                }
                return;
            }
            if (hb0Var != hb0.DROPPED) {
                ll0Var2.G().set(true);
                if (ll0Var2.x()) {
                    Integer numE = e(a80Var);
                    ll0 ll0Var4 = this.f32574b;
                    boolean zContains = ll0Var4.w().f31617c.contains(l90Var.g());
                    boolean z16 = (ll0Var4.C() == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : !ll0Var4.C().b();
                    if (zContains && !z16 && !l90Var.j() && numE != null && numE.intValue() > 0) {
                        numE = 0;
                    }
                    boolean z17 = zContains && !z16;
                    if (z17) {
                        ll0Var4.k0(numE);
                    }
                    synchronized (ll0Var4.y()) {
                        try {
                            al0 al0VarE3 = ll0Var4.E();
                            jl0 jl0Var4 = this.f32573a;
                            ArrayList arrayList3 = new ArrayList(al0VarE3.f31668d);
                            arrayList3.remove(jl0Var4);
                            ll0Var4.F(new al0(al0VarE3.f31666b, al0VarE3.f31667c, Collections.unmodifiableCollection(arrayList3), al0VarE3.f31670f, al0VarE3.f31671g, al0VarE3.f31665a, al0VarE3.f31672h, al0VarE3.f31669e));
                            if (!z17 || (!ll0Var4.l0(ll0Var4.E()) && ll0Var4.E().f31668d.isEmpty())) {
                            }
                            return;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                long nanos = 0;
                if (ll0Var2.v() == null) {
                    z15 = false;
                } else {
                    boolean zContains2 = ll0Var2.v().f32960f.contains(l90Var.g());
                    Integer numE2 = e(a80Var);
                    boolean z18 = (ll0Var2.C() == null || (!zContains2 && (numE2 == null || numE2.intValue() >= 0))) ? false : !ll0Var2.C().b();
                    if (ll0Var2.v().f32955a <= jl0Var2.f32667d + 1 || z18) {
                        z15 = false;
                    } else if (numE2 == null) {
                        if (zContains2) {
                            ml0 ml0VarV = ll0Var2.v();
                            long jQ = ll0Var2.Q();
                            long jQ2 = ll0Var2.Q();
                            nanos = ll0.f0(jQ);
                            ll0Var2.R(Math.min((long) (jQ2 * ml0VarV.f32958d), ll0Var2.v().f32957c));
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else if (numE2.intValue() >= 0) {
                        nanos = TimeUnit.MILLISECONDS.toNanos(numE2.intValue());
                        ll0Var2.R(ll0Var2.v().f32956b);
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (z15) {
                    jl0 jl0VarI1 = ll0Var2.i0(jl0Var2.f32667d + 1, false, false);
                    if (jl0VarI1 != null) {
                        synchronized (ll0Var2.y()) {
                            uk0Var = new uk0(ll0Var2.y());
                            ll0Var2.O(uk0Var);
                        }
                        uk0Var.a(this.f32574b.l().schedule(new dl0(this, uk0Var, jl0VarI1), nanos, TimeUnit.NANOSECONDS));
                        return;
                    }
                    return;
                }
            } else if (ll0Var2.x()) {
                ll0Var2.c();
            }
        }
        ll0 ll0Var5 = this.f32574b;
        jl0 jl0Var5 = this.f32573a;
        ll0Var5.h0(jl0Var5);
        if (ll0Var5.E().f31670f == jl0Var5) {
            ll0Var5.f(l90Var, hb0Var, a80Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void c() {
        ll0 ll0Var = this.f32574b;
        if (ll0Var.q()) {
            u90 u90Var = (u90) ll0Var.k();
            u90Var.c(new hl0(this));
            u90Var.a();
        }
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void d(a80 a80Var) {
        AtomicInteger atomicInteger;
        int i15;
        int i16;
        jl0 jl0Var = this.f32573a;
        int i17 = jl0Var.f32667d;
        if (i17 > 0) {
            w70 w70Var = ll0.A;
            a80Var.d(w70Var);
            a80Var.c(w70Var, String.valueOf(i17));
        }
        ll0 ll0Var = this.f32574b;
        ll0Var.h0(jl0Var);
        if (ll0Var.E().f31670f == jl0Var) {
            if (ll0Var.C() != null) {
                kl0 kl0VarC = ll0Var.C();
                do {
                    atomicInteger = kl0VarC.f32750d;
                    i15 = atomicInteger.get();
                    i16 = kl0VarC.f32747a;
                    if (i15 == i16) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i15, Math.min(kl0VarC.f32749c + i15, i16)));
            }
            u90 u90Var = (u90) ll0Var.k();
            u90Var.c(new bl0(this, a80Var));
            u90Var.a();
        }
    }
}
