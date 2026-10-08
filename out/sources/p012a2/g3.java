package p012a2;

import a4.k0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import b3.x;
import c5.b;
import c5.h;
import c5.y;
import d1.h0;
import d1.i;
import er.l;
import er.p;
import er.q;
import ju.p0;
import lr.m;
import m3.e;
import n3.y2;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p143z0.a2;
import p143z0.b3;
import p3.f;
import tq.j;
import u0.x2;
import vq.k;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0081\u0001\u0010\u001d\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0006\u0010#\u001a\u00020\u0006H\u0003¢\u0006\u0004\b$\u0010%\u001a#\u0010+\u001a\u00020*2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\"\u0014\u00103\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.¨\u00065²\u0006\f\u00104\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"La2/n3;", "initialValue", "Lu0/l;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "skipHalfExpanded", "La2/m3;", "J", "(La2/n3;Lu0/l;Ler/l;ZLm2/r;II)La2/m3;", "Ld1/h0;", "Loq/i0;", "sheetContent", "Lf3/m;", "modifier", "sheetState", "sheetGesturesEnabled", "Ln3/y2;", "sheetShape", "Lc5/h;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "q", "(Ler/q;Lf3/m;La2/m3;ZLn3/y2;FJJJLer/p;Lm2/r;II)V", "G", "(Lf3/m;La2/m3;)Lf3/m;", "color", "onDismiss", "visible", "y", "(JLer/a;ZLm2/r;I)V", "La2/i;", "state", "Lz0/a2;", "orientation", "Lz3/a;", "p", "(La2/i;Lz0/a2;)Lz3/a;", "a", "F", "ModalBottomSheetPositionalThreshold", "b", "ModalBottomSheetVelocityThreshold", "c", "MaxModalBottomSheetWidth", "alpha", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1566a = h.n(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f1567b = h.n(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f1568c = h.n(640);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"a2/g3$a", "Lz3/a;", "", "Lm3/e;", "b", "(F)J", "Lc5/y;", "c", "(J)F", "a", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "r2", "(JLtq/e;)Ljava/lang/Object;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<?> f1569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f1570b;

        /* JADX INFO: renamed from: a2.g3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0023a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f1571d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f1572e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1574g;

            C0023a(tq.e<? super C0023a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f1572e = obj;
                this.f1574g |= PKIFailureInfo.systemUnavail;
                return a.this.W0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f1575d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f1576e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1578g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f1576e = obj;
                this.f1578g |= PKIFailureInfo.systemUnavail;
                return a.this.r2(0L, this);
            }
        }

        a(i<?> iVar, a2 a2Var) {
            this.f1569a = iVar;
            this.f1570b = a2Var;
        }

        private final float a(long j15) {
            return Float.intBitsToFloat((int) (this.f1570b == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
        }

        private final long b(float f15) {
            a2 a2Var = this.f1570b;
            float f16 = a2Var == a2.Horizontal ? f15 : 0.0f;
            if (a2Var != a2.Vertical) {
                f15 = 0.0f;
            }
            return m3.e.e((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        }

        private final float c(long j15) {
            return this.f1570b == a2.Horizontal ? y.h(j15) : y.i(j15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object W0(long j15, long j16, tq.e<? super y> eVar) throws Throwable {
            C0023a c0023a;
            if (eVar instanceof C0023a) {
                c0023a = (C0023a) eVar;
                int i15 = c0023a.f1574g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c0023a.f1574g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c0023a = new C0023a(eVar);
                }
            } else {
                c0023a = new C0023a(eVar);
            }
            Object obj = c0023a.f1572e;
            Object objE = uq.b.e();
            int i16 = c0023a.f1574g;
            if (i16 == 0) {
                u.b(obj);
                i<?> iVar = this.f1569a;
                float fC = c(j16);
                c0023a.f1571d = j16;
                c0023a.f1574g = 1;
                if (iVar.I(fC, c0023a) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = c0023a.f1571d;
                u.b(obj);
            }
            return y.b(j16);
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            return z3.g.d(source, z3.g.INSTANCE.b()) ? b(this.f1569a.o(a(available))) : m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public long h2(long available, int source) {
            float fA = a(available);
            return (fA >= 0.0f || !z3.g.d(source, z3.g.INSTANCE.b())) ? m3.e.INSTANCE.c() : b(this.f1569a.o(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object r2(long j15, tq.e<? super y> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f1578g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f1578g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f1576e;
            Object objE = uq.b.e();
            int i16 = bVar.f1578g;
            if (i16 == 0) {
                u.b(obj);
                float fC = c(j15);
                float fC2 = this.f1569a.C();
                if (fC >= 0.0f || fC2 <= this.f1569a.p().e()) {
                    j15 = y.INSTANCE.a();
                } else {
                    i<?> iVar = this.f1569a;
                    bVar.f1575d = j15;
                    bVar.f1578g = 1;
                    if (iVar.I(fC, bVar) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = bVar.f1575d;
                u.b(obj);
            }
            return y.b(j15);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3 f1580f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m3 m3Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f1580f = m3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1579e;
            if (i15 == 0) {
                u.b(obj);
                m3 m3Var = this.f1580f;
                this.f1579e = 1;
                if (m3Var.m(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f1580f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3 f1582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m3 m3Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f1582f = m3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1581e;
            if (i15 == 0) {
                u.b(obj);
                m3 m3Var = this.f1582f;
                this.f1581e = 1;
                if (m3Var.m(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f1582f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3 f1584f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m3 m3Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f1584f = m3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1583e;
            if (i15 == 0) {
                u.b(obj);
                m3 m3Var = this.f1584f;
                this.f1583e = 1;
                if (m3Var.g(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f1584f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3 f1586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m3 m3Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f1586f = m3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1585e;
            if (i15 == 0) {
                u.b(obj);
                m3 m3Var = this.f1586f;
                this.f1585e = 1;
                if (m3Var.l(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f1586f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f1587a;

        f(er.a<i0> aVar) {
            this.f1587a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(er.a aVar, m3.e eVar) {
            aVar.a();
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            final er.a<i0> aVar = this.f1587a;
            Object objI = b3.i(k0Var, null, null, null, new l() { // from class: a2.h3
                @Override // er.l
                public final Object b(Object obj) {
                    return g3.f.b(aVar, (e) obj);
                }
            }, eVar, 7, null);
            return objI == uq.b.e() ? objI : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1588a;

        static {
            int[] iArr = new int[n3.values().length];
            try {
                iArr[n3.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n3.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1588a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(String str, final er.a aVar, n4.i0 i0Var) {
        f0.c0(i0Var, str);
        f0.y(i0Var, null, new er.a() { // from class: a2.t2
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(g3.B(aVar));
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(er.a aVar) {
        aVar.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(long j15, f6 f6Var, p3.f fVar) {
        p3.f.c2(fVar, j15, 0L, 0L, m.m(z(f6Var), 0.0f, 1.0f), null, null, 0, 118, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(long j15, er.a aVar, boolean z15, int i15, r rVar, int i16) {
        y(j15, aVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final f3.m G(f3.m mVar, final m3 m3Var) {
        return p012a2.c.h(mVar, m3Var.h(), a2.Vertical, new p() { // from class: a2.d3
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g3.H(m3Var, (c5.r) obj, (b) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.r H(final m3 m3Var, final c5.r rVar, c5.b bVar) {
        final float fK = c5.b.k(bVar.getValue());
        r1 r1VarA = p012a2.c.a(new l() { // from class: a2.u2
            @Override // er.l
            public final Object b(Object obj) {
                return g3.I(fK, m3Var, rVar, (s1) obj);
            }
        });
        boolean z15 = m3Var.h().p().getSize() > 0;
        n3 n3VarI = m3Var.i();
        if (z15 || !r1VarA.d(n3VarI)) {
            int i15 = g.f1588a[m3Var.k().ordinal()];
            if (i15 == 1) {
                n3VarI = n3.Hidden;
            } else {
                if (i15 != 2 && i15 != 3) {
                    throw new oq.p();
                }
                n3 n3Var = n3.HalfExpanded;
                if (!r1VarA.d(n3Var)) {
                    n3Var = n3.Expanded;
                    if (!r1VarA.d(n3Var)) {
                        n3Var = n3.Hidden;
                    }
                }
                n3VarI = n3Var;
            }
        }
        return oq.y.a(r1VarA, n3VarI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(float f15, m3 m3Var, c5.r rVar, s1 s1Var) {
        s1Var.a(n3.Hidden, f15);
        float f16 = f15 / 2.0f;
        if (!m3Var.n() && ((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)) > f16) {
            s1Var.a(n3.HalfExpanded, f16);
        }
        if (((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)) != 0) {
            s1Var.a(n3.Expanded, Math.max(0.0f, f15 - ((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax))));
        }
        return i0.f148189a;
    }

    public static final m3 J(final n3 n3Var, u0.l<Float> lVar, l<? super n3, Boolean> lVar2, boolean z15, r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = q2.f1887a.a();
        }
        final u0.l<Float> lVar3 = lVar;
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: a2.v2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(g3.K((n3) obj));
                    }
                };
                rVar.v(objE);
            }
            lVar2 = (l) objE;
        }
        final l<? super n3, Boolean> lVar4 = lVar2;
        final boolean z16 = (i16 & 8) != 0 ? false : z15;
        if (t.k()) {
            t.o(-126412120, i15, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final c5.d dVar = (c5.d) rVar.N(g1.f());
        rVar.J(-1222944377, n3Var);
        Object[] objArr = {n3Var, lVar3, Boolean.valueOf(z16), lVar4, dVar};
        x<m3, ?> xVarC = m3.f1789d.c(lVar3, lVar4, z16, dVar);
        boolean z17 = true;
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar.c(n3Var.ordinal())) || (i15 & 6) == 4) | rVar.W(dVar) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(lVar4)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256) | rVar.G(lVar3);
        if ((((i15 & 7168) ^ 3072) <= 2048 || !rVar.a(z16)) && (i15 & 3072) != 2048) {
            z17 = false;
        }
        boolean z18 = zW | z17;
        Object objE2 = rVar.E();
        if (z18 || objE2 == r.INSTANCE.a()) {
            Object obj = new er.a() { // from class: a2.w2
                @Override // er.a
                public final Object a() {
                    return g3.L(n3Var, dVar, lVar4, lVar3, z16);
                }
            };
            rVar.v(obj);
            objE2 = obj;
        }
        m3 m3Var = (m3) b3.f.i(objArr, xVarC, (er.a) objE2, rVar, 0);
        rVar.U();
        if (t.k()) {
            t.n();
        }
        return m3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(n3 n3Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3 L(n3 n3Var, c5.d dVar, l lVar, u0.l lVar2, boolean z15) {
        return new m3(n3Var, dVar, lVar, lVar2, z15);
    }

    private static final z3.a p(i<?> iVar, a2 a2Var) {
        return new a(iVar, a2Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x018c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:160:0x0219  */
    /* JADX WARN: Code duplicated, block: B:163:0x0231  */
    /* JADX WARN: Code duplicated, block: B:166:0x0243  */
    /* JADX WARN: Code duplicated, block: B:169:0x0276  */
    /* JADX WARN: Code duplicated, block: B:172:0x0282  */
    /* JADX WARN: Code duplicated, block: B:173:0x0286  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x0302  */
    /* JADX WARN: Code duplicated, block: B:185:0x0306  */
    /* JADX WARN: Code duplicated, block: B:190:0x0335  */
    /* JADX WARN: Code duplicated, block: B:195:0x036a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0380  */
    /* JADX WARN: Code duplicated, block: B:199:0x0382  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x0405  */
    /* JADX WARN: Code duplicated, block: B:217:0x0425  */
    /* JADX WARN: Code duplicated, block: B:221:0x0440  */
    /* JADX WARN: Code duplicated, block: B:223:0x0455  */
    /* JADX WARN: Code duplicated, block: B:226:0x049b  */
    /* JADX WARN: Code duplicated, block: B:228:0x04af  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void q(final q<? super h0, ? super r, ? super Integer, i0> qVar, f3.m mVar, m3 m3Var, boolean z15, y2 y2Var, float f15, long j15, long j16, long j17, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m3 m3Var2;
        int i18;
        boolean z16;
        int i19;
        y2 y2Var2;
        float f16;
        long j18;
        int i25;
        boolean z17;
        final f3.m mVar2;
        final m3 m3Var3;
        final long j19;
        final boolean z18;
        final y2 y2Var3;
        final float f17;
        final long j25;
        final long j26;
        d5 d5VarM;
        f3.m mVar3;
        int i26;
        boolean z19;
        final m3 m3VarJ;
        y2 large;
        float fB;
        long jL;
        long jD;
        int i27;
        long jC;
        int i28;
        f3.m mVar4;
        ?? r15;
        Object objE;
        r.Companion companion;
        final p0 p0Var;
        a2 a2Var;
        int iA;
        er.a<androidx.compose.ui.node.c> aVarB;
        r rVarC;
        p<androidx.compose.ui.node.c, Integer, i0> pVarC;
        f3.m mVarD;
        int iA2;
        er.a<androidx.compose.ui.node.c> aVarB2;
        r rVarC2;
        p<androidx.compose.ui.node.c, Integer, i0> pVarC2;
        boolean zG;
        Object objE2;
        n3 n3VarY;
        n3 n3Var;
        boolean z25;
        f3.m mVarB;
        boolean z26;
        boolean zG2;
        Object objE3;
        boolean zW;
        Object objE4;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        r rVarH = rVar.h(-336264970);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                i17 |= rVarH.W(mVar) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    m3Var2 = m3Var;
                    int i45 = rVarH.G(m3Var2) ? 256 : 128;
                    i17 |= i45;
                } else {
                    m3Var2 = m3Var;
                }
                i17 |= i45;
            } else {
                m3Var2 = m3Var;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                i17 |= 3072;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i15 & 3072) == 0) {
                    if (rVarH.a(z16)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
            }
            if ((i15 & 24576) == 0) {
                y2Var2 = y2Var;
                if ((i16 & 16) == 0 || !rVarH.W(y2Var2)) {
                    i38 = PKIFailureInfo.certRevoked;
                } else {
                    i38 = 16384;
                }
                i17 |= i38;
            } else {
                y2Var2 = y2Var;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i37;
                } else {
                    f16 = f15;
                }
                i37 = PKIFailureInfo.notAuthorized;
                i17 |= i37;
            } else {
                f16 = f15;
            }
            if ((i15 & 1572864) == 0) {
                j18 = j15;
                if ((i16 & 64) == 0 || !rVarH.d(j18)) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.badCertTemplate;
                }
                i17 |= i36;
            } else {
                j18 = j15;
            }
            if ((12582912 & i15) != 0) {
                if ((i16 & 128) == 0 || !rVarH.d(j16)) {
                    i35 = 4194304;
                } else {
                    i35 = 8388608;
                }
                i17 |= i35;
            }
            if ((100663296 & i15) == 0) {
                if ((i16 & 256) == 0) {
                    i25 = i39;
                    int i46 = rVarH.d(j17) ? 67108864 : 33554432;
                    i17 |= i46;
                } else {
                    i25 = i39;
                }
                i17 |= i46;
            } else {
                i25 = i39;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i29 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i29 = 268435456;
                }
                i17 |= i29;
            }
            if ((i17 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i25 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i16 & 4) != 0) {
                        int i47 = i17;
                        z19 = false;
                        m3VarJ = J(n3.Hidden, null, null, false, rVarH, 6, 14);
                        i26 = i47 & (-897);
                    } else {
                        i26 = i17;
                        z19 = false;
                        m3VarJ = m3Var2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 16) != 0) {
                        large = m2.f1788a.b(rVarH, 6).getLarge();
                        i26 &= -57345;
                    } else {
                        large = y2Var2;
                    }
                    if ((i16 & 32) != 0) {
                        fB = q2.f1887a.b();
                        i26 &= -458753;
                    } else {
                        fB = f15;
                    }
                    if ((i16 & 64) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i26 &= -3670017;
                    } else {
                        jL = j18;
                    }
                    if ((i16 & 128) != 0) {
                        jD = c1.d(jL, rVarH, (i26 >> 18) & 14);
                        i26 &= -29360129;
                    } else {
                        jD = j16;
                    }
                    if ((i16 & 256) != 0) {
                        jC = q2.f1887a.c(rVarH, z19 ? 1 : 0);
                        i28 = i26 & (-234881025);
                        i27 = -336264970;
                    } else {
                        i27 = -336264970;
                        jC = j17;
                        i28 = i26;
                    }
                    mVar4 = mVar3;
                    r15 = z19;
                } else {
                    rVarH.O();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        i17 &= -29360129;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                    }
                    m3 m3Var4 = m3Var2;
                    i28 = i17;
                    m3VarJ = m3Var4;
                    mVar4 = mVar;
                    jD = j16;
                    r15 = 0;
                    fB = f16;
                    jL = j18;
                    large = y2Var2;
                    i27 = -336264970;
                    jC = j17;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i27, i28, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                a2Var = a2.Vertical;
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarI = d1.r.i(companion2.o(), r15);
                iA = p076m2.m.a(rVarH, r15);
                e0 e0VarT = rVarH.t();
                long j27 = jC;
                f3.m mVarE = f3.j.e(rVarH, mVar4);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                f3.m mVar5 = mVar4;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                pVarC = companion3.c();
                if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                    rVarC.v(Integer.valueOf(iA));
                    rVarC.j(Integer.valueOf(iA), pVarC);
                }
                n6.i(rVarC, mVarE, companion3.e());
                d1.x xVar = d1.x.f39368a;
                mVarD = f3.m.INSTANCE;
                int i48 = i28;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(mVarD, 0.0f, 1, null);
                w0 w0VarI2 = d1.r.i(companion2.o(), false);
                iA2 = p076m2.m.a(rVarH, 0);
                e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarF);
                aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                pVarC2 = companion3.c();
                if (rVarC2.getInserting() || !fr.t.c(rVarC2.E(), Integer.valueOf(iA2))) {
                    rVarC2.v(Integer.valueOf(iA2));
                    rVarC2.j(Integer.valueOf(iA2), pVarC2);
                }
                n6.i(rVarC2, mVarE2, companion3.e());
                pVar.B(rVarH, Integer.valueOf((i48 >> 27) & 14));
                zG = rVarH.G(m3VarJ) | rVarH.G(p0Var);
                objE2 = rVarH.E();
                if (zG || objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: a2.r2
                        @Override // er.a
                        public final Object a() {
                            return g3.r(m3VarJ, p0Var);
                        }
                    };
                    rVarH.v(objE2);
                }
                er.a aVar = (er.a) objE2;
                n3VarY = m3VarJ.h().y();
                n3Var = n3.Hidden;
                if (n3VarY != n3Var) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                y(j27, aVar, z25, rVarH, (i48 >> 24) & 14);
                rVarH.x();
                f3.m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(xVar.d(mVarD, companion2.m()), 0.0f, f1568c, 1, null), 0.0f, 1, null);
                if (z16) {
                    rVarH.X(351375666);
                    zW = rVarH.W(m3VarJ.h());
                    objE4 = rVarH.E();
                    if (zW || objE4 == companion.a()) {
                        objE4 = p(m3VarJ.h(), a2Var);
                        rVarH.v(objE4);
                    }
                    mVarB = z3.d.b(mVarD, (z3.a) objE4, null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1258275768);
                    rVarH.R();
                    mVarB = mVarD;
                }
                f3.m mVarG = G(mVarH.u(mVarB), m3VarJ);
                i<n3> iVarH = m3VarJ.h();
                if (z16 || m3VarJ.h().t() == n3Var) {
                    z26 = false;
                } else {
                    z26 = true;
                }
                f3.m mVarE3 = p012a2.c.e(mVarG, iVarH, a2Var, z26, false, null, false, 56, null);
                if (z16) {
                    rVarH.X(352377090);
                    zG2 = rVarH.G(m3VarJ) | rVarH.G(p0Var);
                    objE3 = rVarH.E();
                    if (zG2 || objE3 == companion.a()) {
                        objE3 = new l() { // from class: a2.x2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g3.s(m3VarJ, p0Var, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    mVarD = v.d(mVarD, false, (l) objE3, 1, null);
                    rVarH.R();
                } else {
                    rVarH.X(1258354200);
                    rVarH.R();
                }
                int i49 = i48 >> 12;
                f5.f(mVarE3.u(mVarD), large, jL, jD, null, fB, y2.m.d(-1557535116, true, new p() { // from class: a2.y2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.w(qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, ((i48 >> 9) & 112) | 1572864 | (i49 & 896) | (i49 & 7168) | (i48 & 458752), 16);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                m3Var3 = m3VarJ;
                z18 = z16;
                y2Var3 = large;
                j19 = jL;
                j25 = jD;
                f17 = fB;
                j26 = j27;
                mVar2 = mVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                m3Var3 = m3Var2;
                j19 = j18;
                z18 = z16;
                y2Var3 = y2Var2;
                f17 = f15;
                j25 = j16;
                j26 = j17;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.z2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.x(qVar, mVar2, m3Var3, z18, y2Var3, f17, j19, j25, j26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                m3Var2 = m3Var;
                if (rVarH.G(m3Var2)) {
                }
                i17 |= i45;
            } else {
                m3Var2 = m3Var;
            }
            i17 |= i45;
        } else {
            m3Var2 = m3Var;
        }
        i18 = i16 & 8;
        if (i18 != 0) {
            i17 |= 3072;
            z16 = z15;
        } else {
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if (rVarH.a(z16)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
        }
        if ((i15 & 24576) == 0) {
            y2Var2 = y2Var;
            if ((i16 & 16) == 0) {
                i38 = PKIFailureInfo.certRevoked;
            } else {
                i38 = PKIFailureInfo.certRevoked;
            }
            i17 |= i38;
        } else {
            y2Var2 = y2Var;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                f16 = f15;
                if (rVarH.b(f16)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i37;
            } else {
                f16 = f15;
            }
            i37 = PKIFailureInfo.notAuthorized;
            i17 |= i37;
        } else {
            f16 = f15;
        }
        if ((i15 & 1572864) == 0) {
            j18 = j15;
            if ((i16 & 64) == 0) {
                i36 = PKIFailureInfo.signerNotTrusted;
            } else {
                i36 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i36;
        } else {
            j18 = j15;
        }
        if ((12582912 & i15) != 0) {
            if ((i16 & 128) == 0) {
                i35 = 4194304;
            } else {
                i35 = 4194304;
            }
            i17 |= i35;
        }
        if ((100663296 & i15) == 0) {
            if ((i16 & 256) == 0) {
                i25 = i39;
                if (rVarH.d(j17)) {
                }
                i17 |= i46;
            } else {
                i25 = i39;
            }
            i17 |= i46;
        } else {
            i25 = i39;
        }
        if ((i15 & 805306368) == 0) {
            if (rVarH.G(pVar)) {
                i29 = PKIFailureInfo.duplicateCertReq;
            } else {
                i29 = 268435456;
            }
            i17 |= i29;
        }
        if ((i17 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i25 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if ((i16 & 4) != 0) {
                    int i410 = i17;
                    z19 = false;
                    m3VarJ = J(n3.Hidden, null, null, false, rVarH, 6, 14);
                    i26 = i410 & (-897);
                } else {
                    i26 = i17;
                    z19 = false;
                    m3VarJ = m3Var2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 16) != 0) {
                    large = m2.f1788a.b(rVarH, 6).getLarge();
                    i26 &= -57345;
                } else {
                    large = y2Var2;
                }
                if ((i16 & 32) != 0) {
                    fB = q2.f1887a.b();
                    i26 &= -458753;
                } else {
                    fB = f15;
                }
                if ((i16 & 64) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i26 &= -3670017;
                } else {
                    jL = j18;
                }
                if ((i16 & 128) != 0) {
                    jD = c1.d(jL, rVarH, (i26 >> 18) & 14);
                    i26 &= -29360129;
                } else {
                    jD = j16;
                }
                if ((i16 & 256) != 0) {
                    jC = q2.f1887a.c(rVarH, z19 ? 1 : 0);
                    i28 = i26 & (-234881025);
                    i27 = -336264970;
                } else {
                    i27 = -336264970;
                    jC = j17;
                    i28 = i26;
                }
                mVar4 = mVar3;
                r15 = z19;
            } else {
                if (i25 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if ((i16 & 4) != 0) {
                    int i411 = i17;
                    z19 = false;
                    m3VarJ = J(n3.Hidden, null, null, false, rVarH, 6, 14);
                    i26 = i411 & (-897);
                } else {
                    i26 = i17;
                    z19 = false;
                    m3VarJ = m3Var2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 16) != 0) {
                    large = m2.f1788a.b(rVarH, 6).getLarge();
                    i26 &= -57345;
                } else {
                    large = y2Var2;
                }
                if ((i16 & 32) != 0) {
                    fB = q2.f1887a.b();
                    i26 &= -458753;
                } else {
                    fB = f15;
                }
                if ((i16 & 64) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i26 &= -3670017;
                } else {
                    jL = j18;
                }
                if ((i16 & 128) != 0) {
                    jD = c1.d(jL, rVarH, (i26 >> 18) & 14);
                    i26 &= -29360129;
                } else {
                    jD = j16;
                }
                if ((i16 & 256) != 0) {
                    jC = q2.f1887a.c(rVarH, z19 ? 1 : 0);
                    i28 = i26 & (-234881025);
                    i27 = -336264970;
                } else {
                    i27 = -336264970;
                    jC = j17;
                    i28 = i26;
                }
                mVar4 = mVar3;
                r15 = z19;
            }
            rVarH.y();
            if (t.k()) {
                t.o(i27, i28, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(j.f191408a, rVarH);
                rVarH.v(objE);
            }
            p0Var = (p0) objE;
            a2Var = a2.Vertical;
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarI3 = d1.r.i(companion4.o(), r15);
            iA = p076m2.m.a(rVarH, r15);
            e0 e0VarT3 = rVarH.t();
            long j28 = jC;
            f3.m mVarE4 = f3.j.e(rVarH, mVar4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            f3.m mVar6 = mVar4;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI3, companion5.d());
            n6.i(rVarC, e0VarT3, companion5.f());
            pVarC = companion5.c();
            if (rVarC.getInserting()) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            } else {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE4, companion5.e());
            d1.x xVar2 = d1.x.f39368a;
            mVarD = f3.m.INSTANCE;
            int i412 = i28;
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(mVarD, 0.0f, 1, null);
            w0 w0VarI4 = d1.r.i(companion4.o(), false);
            iA2 = p076m2.m.a(rVarH, 0);
            e0 e0VarT4 = rVarH.t();
            f3.m mVarE5 = f3.j.e(rVarH, mVarF2);
            aVarB2 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI4, companion5.d());
            n6.i(rVarC2, e0VarT4, companion5.f());
            pVarC2 = companion5.c();
            if (rVarC2.getInserting()) {
                rVarC2.v(Integer.valueOf(iA2));
                rVarC2.j(Integer.valueOf(iA2), pVarC2);
            } else {
                rVarC2.v(Integer.valueOf(iA2));
                rVarC2.j(Integer.valueOf(iA2), pVarC2);
            }
            n6.i(rVarC2, mVarE5, companion5.e());
            pVar.B(rVarH, Integer.valueOf((i412 >> 27) & 14));
            zG = rVarH.G(m3VarJ) | rVarH.G(p0Var);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new er.a() { // from class: a2.r2
                    @Override // er.a
                    public final Object a() {
                        return g3.r(m3VarJ, p0Var);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.a() { // from class: a2.r2
                    @Override // er.a
                    public final Object a() {
                        return g3.r(m3VarJ, p0Var);
                    }
                };
                rVarH.v(objE2);
            }
            er.a aVar2 = (er.a) objE2;
            n3VarY = m3VarJ.h().y();
            n3Var = n3.Hidden;
            if (n3VarY != n3Var) {
                z25 = true;
            } else {
                z25 = false;
            }
            y(j28, aVar2, z25, rVarH, (i412 >> 24) & 14);
            rVarH.x();
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(xVar2.d(mVarD, companion4.m()), 0.0f, f1568c, 1, null), 0.0f, 1, null);
            if (z16) {
                rVarH.X(351375666);
                zW = rVarH.W(m3VarJ.h());
                objE4 = rVarH.E();
                if (zW) {
                    objE4 = p(m3VarJ.h(), a2Var);
                    rVarH.v(objE4);
                } else {
                    objE4 = p(m3VarJ.h(), a2Var);
                    rVarH.v(objE4);
                }
                mVarB = z3.d.b(mVarD, (z3.a) objE4, null, 2, null);
                rVarH.R();
            } else {
                rVarH.X(1258275768);
                rVarH.R();
                mVarB = mVarD;
            }
            f3.m mVarG2 = G(mVarH2.u(mVarB), m3VarJ);
            i<n3> iVarH2 = m3VarJ.h();
            if (z16) {
                z26 = false;
            } else {
                z26 = false;
            }
            f3.m mVarE6 = p012a2.c.e(mVarG2, iVarH2, a2Var, z26, false, null, false, 56, null);
            if (z16) {
                rVarH.X(352377090);
                zG2 = rVarH.G(m3VarJ) | rVarH.G(p0Var);
                objE3 = rVarH.E();
                if (zG2) {
                    objE3 = new l() { // from class: a2.x2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g3.s(m3VarJ, p0Var, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: a2.x2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g3.s(m3VarJ, p0Var, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                mVarD = v.d(mVarD, false, (l) objE3, 1, null);
                rVarH.R();
            } else {
                rVarH.X(1258354200);
                rVarH.R();
            }
            int i413 = i412 >> 12;
            f5.f(mVarE6.u(mVarD), large, jL, jD, null, fB, y2.m.d(-1557535116, true, new p() { // from class: a2.y2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.w(qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ((i412 >> 9) & 112) | 1572864 | (i413 & 896) | (i413 & 7168) | (i412 & 458752), 16);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            m3Var3 = m3VarJ;
            z18 = z16;
            y2Var3 = large;
            j19 = jL;
            j25 = jD;
            f17 = fB;
            j26 = j28;
            mVar2 = mVar6;
        } else {
            rVarH.O();
            mVar2 = mVar;
            m3Var3 = m3Var2;
            j19 = j18;
            z18 = z16;
            y2Var3 = y2Var2;
            f17 = f15;
            j25 = j16;
            j26 = j17;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.z2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.x(qVar, mVar2, m3Var3, z18, y2Var3, f17, j19, j25, j26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(m3 m3Var, p0 p0Var) {
        if (m3Var.h().s().b(n3.Hidden).booleanValue()) {
            ju.k.d(p0Var, null, null, new b(m3Var, null), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final m3 m3Var, final p0 p0Var, n4.i0 i0Var) {
        if (m3Var.o()) {
            f0.l(i0Var, null, new er.a() { // from class: a2.e3
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(g3.t(m3Var, p0Var));
                }
            }, 1, null);
            if (m3Var.h().t() == n3.HalfExpanded) {
                f0.o(i0Var, null, new er.a() { // from class: a2.f3
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(g3.u(m3Var, p0Var));
                    }
                }, 1, null);
            } else if (m3Var.j()) {
                f0.d(i0Var, null, new er.a() { // from class: a2.s2
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(g3.v(m3Var, p0Var));
                    }
                }, 1, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(m3 m3Var, p0 p0Var) {
        if (!m3Var.h().s().b(n3.Hidden).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var, null, null, new c(m3Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(m3 m3Var, p0 p0Var) {
        if (!m3Var.h().s().b(n3.Expanded).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var, null, null, new d(m3Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(m3 m3Var, p0 p0Var) {
        if (!m3Var.h().s().b(n3.HalfExpanded).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var, null, null, new e(m3Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1557535116, i15, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = companion2.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion2.e());
            qVar.w(d1.i0.f39176a, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(q qVar, f3.m mVar, m3 m3Var, boolean z15, y2 y2Var, float f15, long j15, long j16, long j17, p pVar, int i15, int i16, r rVar, int i17) {
        q(qVar, mVar, m3Var, z15, y2Var, f15, j15, j16, j17, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void y(final long j15, final er.a<i0> aVar, final boolean z15, r rVar, final int i15) {
        int i16;
        f3.m mVarC;
        r rVarH = rVar.h(-526532668);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-526532668, i16, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j15 != 16) {
                rVarH.X(-714029408);
                int i17 = i16;
                final f6<Float> f6VarE = u0.f.e(z15 ? 1.0f : 0.0f, new x2(0, 0, null, 7, null), 0.0f, null, null, rVarH, 48, 28);
                final String strA = z4.a(y4.INSTANCE.b(), rVarH, 6);
                if (z15) {
                    rVarH.X(-713811509);
                    f3.m.Companion companion = f3.m.INSTANCE;
                    int i18 = i17 & 112;
                    boolean z16 = i18 == 32;
                    Object objE = rVarH.E();
                    if (z16 || objE == r.INSTANCE.a()) {
                        objE = new f(aVar);
                        rVarH.v(objE);
                    }
                    f3.m mVarC2 = a4.w0.c(companion, aVar, (PointerInputEventHandler) objE);
                    boolean zW = (i18 == 32) | rVarH.W(strA);
                    Object objE2 = rVarH.E();
                    if (zW || objE2 == r.INSTANCE.a()) {
                        objE2 = new l() { // from class: a2.a3
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g3.A(strA, aVar, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarC = v.c(mVarC2, true, (l) objE2);
                    rVarH.R();
                } else {
                    rVarH.X(-713447786);
                    rVarH.R();
                    mVarC = f3.m.INSTANCE;
                }
                f3.m mVarU = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null).u(mVarC);
                boolean zW2 = rVarH.W(f6VarE) | ((i17 & 14) == 4);
                Object objE3 = rVarH.E();
                if (zW2 || objE3 == r.INSTANCE.a()) {
                    objE3 = new l() { // from class: a2.b3
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g3.C(j15, f6VarE, (f) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                z.b(mVarU, (l) objE3, rVarH, 0);
            } else {
                rVarH.X(-734934754);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.c3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.D(j15, aVar, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float z(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }
}
