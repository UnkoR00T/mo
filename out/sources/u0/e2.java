package u0;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001az\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001at\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001aj\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0080@¢\u0006\u0004\b \u0010!\u001aJ\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000b\"\b\b\u0002\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Lu0/l;", "animationSpec", "Lkotlin/Function2;", "Loq/i0;", "block", "j", "(FFFLu0/l;Ler/p;Ltq/e;)Ljava/lang/Object;", "T", "Lu0/t;", "V", "Lu0/y2;", "typeConverter", "l", "(Lu0/y2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lu0/l;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lu0/n;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lu0/k;", "x", "(Lu0/n;Ljava/lang/Object;Lu0/l;ZLer/l;Ltq/e;)Ljava/lang/Object;", "Lu0/c0;", "u", "(Lu0/n;Lu0/c0;ZLer/l;Ltq/e;)Ljava/lang/Object;", "Lu0/g;", "animation", "", "startTimeNanos", "k", "(Lu0/n;Lu0/g;JLer/l;Ltq/e;)Ljava/lang/Object;", "R", "onFrame", "A", "(Lu0/g;Ler/l;Ltq/e;)Ljava/lang/Object;", "state", "F", "(Lu0/k;Lu0/n;)V", "frameTimeNanos", "durationScale", "anim", ip.a.f96138c, "(Lu0/k;JFLu0/g;Lu0/n;Ler/l;)V", "playTimeNanos", "C", "(Lu0/k;JJLu0/g;Lu0/n;Ler/l;)V", "Ltq/i;", "E", "(Ltq/i;)F", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T, V extends t> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f193591h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193592j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193591h = obj;
            this.f193592j |= PKIFailureInfo.systemUnavail;
            return e2.k(null, null, 0L, null, this);
        }
    }

    private static final <R, T, V extends t> Object A(g<T, V> gVar, final er.l<? super Long, ? extends R> lVar, tq.e<? super R> eVar) {
        return gVar.getIsInfinite() ? p0.a(lVar, eVar) : p076m2.n2.c(new er.l() { // from class: u0.d2
            @Override // er.l
            public final Object b(Object obj) {
                return e2.B(lVar, ((Long) obj).longValue());
            }
        }, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(er.l lVar, long j15) {
        return lVar.b(Long.valueOf(j15));
    }

    private static final <T, V extends t> void C(k<T, V> kVar, long j15, long j16, g<T, V> gVar, AnimationState<T, V> animationState, er.l<? super k<T, V>, oq.i0> lVar) {
        kVar.j(j15);
        kVar.l(gVar.f(j16));
        kVar.m(gVar.b(j16));
        if (gVar.c(j16)) {
            kVar.i(kVar.getLastFrameTimeNanos());
            kVar.k(false);
        }
        F(kVar, animationState);
        lVar.b(kVar);
    }

    private static final <T, V extends t> void D(k<T, V> kVar, long j15, float f15, g<T, V> gVar, AnimationState<T, V> animationState, er.l<? super k<T, V>, oq.i0> lVar) {
        C(kVar, j15, f15 == 0.0f ? gVar.getDurationNanos() : (long) ((j15 - kVar.getStartTimeNanos()) / f15), gVar, animationState, lVar);
    }

    public static final float E(tq.i iVar) {
        f3.o oVar = (f3.o) iVar.m(f3.o.INSTANCE);
        float fZ = oVar != null ? oVar.Z() : 1.0f;
        if (!(fZ >= 0.0f)) {
            h1.b("negative scale factor");
        }
        return fZ;
    }

    public static final <T, V extends t> void F(k<T, V> kVar, AnimationState<T, V> animationState) {
        animationState.E(kVar.e());
        u.f(animationState.z(), kVar.g());
        animationState.B(kVar.getFinishedTimeNanos());
        animationState.C(kVar.getLastFrameTimeNanos());
        animationState.D(kVar.h());
    }

    public static final Object j(float f15, float f16, float f17, l<Float> lVar, er.p<? super Float, ? super Float, oq.i0> pVar, tq.e<? super oq.i0> eVar) {
        Object objL = l(s3.P(fr.m.f66405a), vq.b.d(f15), vq.b.d(f16), vq.b.d(f17), lVar, pVar, eVar);
        return objL == uq.b.e() ? objL : oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, u0.k] */
    public static final <T, V extends t> Object k(final AnimationState<T, V> animationState, g<T, V> gVar, long j15, final er.l<? super k<T, V>, oq.i0> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        final fr.p0 p0Var;
        final AnimationState<T, V> animationState2;
        AnimationState<T, V> animationState3;
        fr.p0 p0Var2;
        er.l<? super k<T, V>, oq.i0> lVar2;
        k kVar;
        k kVar2;
        final g<T, V> gVar2 = gVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193592j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193592j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f193591h;
        Object objE = uq.b.e();
        int i16 = aVar2.f193592j;
        if (i16 == 0) {
            oq.u.b(obj);
            final T tF = gVar2.f(0L);
            final t tVarB = gVar2.b(0L);
            p0Var = new fr.p0();
            if (j15 == Long.MIN_VALUE) {
                try {
                    final float fE = E(aVar2.getContext());
                    animationState2 = animationState;
                    try {
                        er.l lVar3 = new er.l() { // from class: u0.x1
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return e2.q(p0Var, tF, gVar2, tVarB, animationState2, fE, lVar, ((Long) obj2).longValue());
                            }
                        };
                        p0Var2 = p0Var;
                        try {
                            aVar2.f193587d = animationState2;
                            aVar2.f193588e = gVar2;
                            aVar2.f193589f = lVar;
                            aVar2.f193590g = p0Var2;
                            aVar2.f193592j = 1;
                            if (A(gVar2, lVar3, aVar2) != objE) {
                                animationState3 = animationState2;
                                lVar2 = lVar;
                                p0Var = p0Var2;
                            }
                            return objE;
                        } catch (CancellationException e15) {
                            e = e15;
                            animationState3 = animationState2;
                            p0Var = p0Var2;
                            kVar = (k) p0Var.f66410a;
                            if (kVar != null) {
                                kVar.k(false);
                            }
                            kVar2 = (k) p0Var.f66410a;
                            if (kVar2 != null) {
                                animationState3.D(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e16) {
                        e = e16;
                        animationState3 = animationState2;
                        kVar = (k) p0Var.f66410a;
                        if (kVar != null) {
                            kVar.k(false);
                        }
                        kVar2 = (k) p0Var.f66410a;
                        if (kVar2 != null) {
                            animationState3.D(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e17) {
                    e = e17;
                    animationState2 = animationState;
                }
            } else {
                p0Var2 = p0Var;
                try {
                    ?? r15 = (T) new k(tF, gVar2.e(), tVarB, j15, gVar2.g(), j15, true, new er.a() { // from class: u0.y1
                        @Override // er.a
                        public final Object a() {
                            return e2.s(animationState);
                        }
                    });
                    D(r15, j15, E(aVar2.getContext()), gVar2, animationState, lVar);
                    p0Var2.f66410a = r15;
                    animationState3 = animationState;
                    gVar2 = gVar;
                    lVar2 = lVar;
                    p0Var = p0Var2;
                } catch (CancellationException e18) {
                    e = e18;
                    animationState3 = animationState;
                    p0Var = p0Var2;
                    kVar = (k) p0Var.f66410a;
                    if (kVar != null) {
                        kVar.k(false);
                    }
                    kVar2 = (k) p0Var.f66410a;
                    if (kVar2 != null && kVar2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                        animationState3.D(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i16 != 1 && i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (fr.p0) aVar2.f193590g;
            lVar2 = (er.l) aVar2.f193589f;
            gVar2 = (g) aVar2.f193588e;
            animationState3 = (AnimationState) aVar2.f193587d;
            try {
                oq.u.b(obj);
            } catch (CancellationException e19) {
                e = e19;
                kVar = (k) p0Var.f66410a;
                if (kVar != null) {
                    kVar.k(false);
                }
                kVar2 = (k) p0Var.f66410a;
                if (kVar2 != null) {
                    animationState3.D(false);
                }
                throw e;
            }
        }
        while (((k) p0Var.f66410a).h()) {
            final float fE2 = E(aVar2.getContext());
            final fr.p0 p0Var3 = p0Var;
            final er.l<? super k<T, V>, oq.i0> lVar4 = lVar2;
            final g<T, V> gVar3 = gVar2;
            final AnimationState<T, V> animationState4 = animationState3;
            try {
                er.l lVar5 = new er.l() { // from class: u0.z1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e2.t(p0Var3, fE2, gVar3, animationState4, lVar4, ((Long) obj2).longValue());
                    }
                };
                p0Var = p0Var3;
                gVar2 = gVar3;
                animationState3 = animationState4;
                lVar2 = lVar4;
                aVar2.f193587d = animationState3;
                aVar2.f193588e = gVar2;
                aVar2.f193589f = lVar2;
                aVar2.f193590g = p0Var;
                aVar2.f193592j = 2;
                if (A(gVar2, lVar5, aVar2) == objE) {
                    return objE;
                }
            } catch (CancellationException e25) {
                e = e25;
                p0Var = p0Var3;
                animationState3 = animationState4;
                kVar = (k) p0Var.f66410a;
                if (kVar != null) {
                    kVar.k(false);
                }
                kVar2 = (k) p0Var.f66410a;
                if (kVar2 != null) {
                    animationState3.D(false);
                }
                throw e;
            }
        }
        return oq.i0.f148189a;
    }

    public static final <T, V extends t> Object l(final y2<T, V> y2Var, T t15, T t16, T t17, l<T> lVar, final er.p<? super T, ? super T, oq.i0> pVar, tq.e<? super oq.i0> eVar) {
        V vG;
        if (t17 == null || (vG = y2Var.a().b(t17)) == null) {
            vG = u.g(y2Var.a().b(t15));
        }
        t tVar = vG;
        Object objN = n(new AnimationState(y2Var, t15, tVar, 0L, 0L, false, 56, null), new f2(lVar, y2Var, t15, t16, tVar), 0L, new er.l() { // from class: u0.w1
            @Override // er.l
            public final Object b(Object obj) {
                return e2.o(pVar, y2Var, (k) obj);
            }
        }, eVar, 2, null);
        return objN == uq.b.e() ? objN : oq.i0.f148189a;
    }

    public static /* synthetic */ Object m(float f15, float f16, float f17, l lVar, er.p pVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i15 & 8) != 0) {
            lVar = m.j(0.0f, 0.0f, null, 7, null);
        }
        return j(f15, f16, f17, lVar, pVar, eVar);
    }

    public static /* synthetic */ Object n(AnimationState animationState, g gVar, long j15, er.l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j15;
        if ((i15 & 4) != 0) {
            lVar = new er.l() { // from class: u0.a2
                @Override // er.l
                public final Object b(Object obj2) {
                    return e2.p((k) obj2);
                }
            };
        }
        return k(animationState, gVar, j16, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(er.p pVar, y2 y2Var, k kVar) {
        pVar.B(kVar.e(), y2Var.b().b(kVar.g()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(k kVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, u0.k] */
    public static final oq.i0 q(fr.p0 p0Var, Object obj, g gVar, t tVar, final AnimationState animationState, float f15, er.l lVar, long j15) {
        ?? kVar = new k(obj, gVar.e(), tVar, j15, gVar.g(), j15, true, new er.a() { // from class: u0.c2
            @Override // er.a
            public final Object a() {
                return e2.r(animationState);
            }
        });
        D(kVar, j15, f15, gVar, animationState, lVar);
        p0Var.f66410a = kVar;
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(AnimationState animationState) {
        animationState.D(false);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(AnimationState animationState) {
        animationState.D(false);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 t(fr.p0 p0Var, float f15, g gVar, AnimationState animationState, er.l lVar, long j15) {
        D((k) p0Var.f66410a, j15, f15, gVar, animationState, lVar);
        return oq.i0.f148189a;
    }

    public static final <T, V extends t> Object u(AnimationState<T, V> animationState, c0<T> c0Var, boolean z15, er.l<? super k<T, V>, oq.i0> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objK = k(animationState, new b0(c0Var, animationState.t(), animationState.getValue(), animationState.z()), z15 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, eVar);
        return objK == uq.b.e() ? objK : oq.i0.f148189a;
    }

    public static /* synthetic */ Object v(AnimationState animationState, c0 c0Var, boolean z15, er.l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            lVar = new er.l() { // from class: u0.v1
                @Override // er.l
                public final Object b(Object obj2) {
                    return e2.w((k) obj2);
                }
            };
        }
        return u(animationState, c0Var, z15, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(k kVar) {
        return oq.i0.f148189a;
    }

    public static final <T, V extends t> Object x(AnimationState<T, V> animationState, T t15, l<T> lVar, boolean z15, er.l<? super k<T, V>, oq.i0> lVar2, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objK = k(animationState, new f2(lVar, animationState.t(), animationState.getValue(), t15, animationState.z()), z15 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar2, eVar);
        return objK == uq.b.e() ? objK : oq.i0.f148189a;
    }

    public static /* synthetic */ Object y(AnimationState animationState, Object obj, l lVar, boolean z15, er.l lVar2, tq.e eVar, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            lVar = m.j(0.0f, 0.0f, null, 7, null);
        }
        l lVar3 = lVar;
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        boolean z16 = z15;
        if ((i15 & 8) != 0) {
            lVar2 = new er.l() { // from class: u0.b2
                @Override // er.l
                public final Object b(Object obj3) {
                    return e2.z((k) obj3);
                }
            };
        }
        return x(animationState, obj, lVar3, z16, lVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(k kVar) {
        return oq.i0.f148189a;
    }
}
