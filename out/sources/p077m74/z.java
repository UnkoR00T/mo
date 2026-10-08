package p077m74;

import androidx.p016lifecycle.u0;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import er.p;
import fr.q0;
import ju.h2;
import k10.c0;
import k10.l;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import nx.b;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import oz.q;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001(B9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0096\u0001¢\u0006\u0004\b'\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030@8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lm74/z;", "Ll00/g;", "Lm74/b;", "Lm74/a;", "Lm74/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lk74/a;", "applicationLockInteractor", "Loz/q;", "ownerViewLifecycleManager", "Ln74/a;", "mapper", "Lyw/b;", "accessibilityTalkBackManager", "<init>", "(Lyy/a;Lmx/c;Lk74/a;Loz/q;Ln74/a;Lyw/b;)V", "state", "Lm74/c$a;", "t9", "(Lm74/b;)Lm74/c$a;", "Lgu/b;", "timeLeft", "Loq/i0;", "s9", "(J)V", "Ll74/b;", "lockEntryPoint", "u9", "(Ll74/b;)V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lmx/c;", "c", "Lk74/a;", "d", "Loz/q;", "e", "Ln74/a;", "f", "Lyw/b;", "Lm74/b$a;", "g", "Lm74/b$a;", "initialState", "Loz/j;", "h", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Ltq/i;", "j", "Ltq/i;", "timerCoroutineContext", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lm74/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "n", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<b, p077m74.a> implements p077m74.c, zx.d, b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f124210p = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k74.a applicationLockInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n74.a mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b.Empty initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private tq.i timerCoroutineContext;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<b, p077m74.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m74.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<m74.c.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124222e;

        /* JADX INFO: renamed from: m74.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3049a extends k implements p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f124224e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f124225f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ z f124226g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3049a(z zVar, tq.e<? super C3049a> eVar) {
                super(2, eVar);
                this.f124226g = zVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f124225f;
                uq.b.e();
                if (this.f124224e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f124226g.d9(m74.a.e.f124138a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C3049a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C3049a c3049a = new C3049a(this.f124226g, eVar);
                c3049a.f124225f = obj;
                return c3049a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124222e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarS = mu.i.S(z.this.x8(), new C3049a(z.this, null));
                this.f124222e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<m74.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f124227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f124228b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f124229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f124230b;

            /* JADX INFO: renamed from: m74.z$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3050a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f124231d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f124232e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f124233f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f124235h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f124236j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f124237k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f124238l;

                public C3050a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f124231d = obj;
                    this.f124232e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f124229a = hVar;
                this.f124230b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3050a c3050a;
                if (eVar instanceof C3050a) {
                    c3050a = (C3050a) eVar;
                    int i15 = c3050a.f124232e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3050a.f124232e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3050a = new C3050a(eVar);
                    }
                } else {
                    c3050a = new C3050a(eVar);
                }
                Object obj2 = c3050a.f124231d;
                Object objE = uq.b.e();
                int i16 = c3050a.f124232e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f124229a;
                    m74.c.a aVarT9 = this.f124230b.t9((b) obj);
                    c3050a.f124233f = vq.j.a(obj);
                    c3050a.f124235h = vq.j.a(c3050a);
                    c3050a.f124236j = vq.j.a(obj);
                    c3050a.f124237k = vq.j.a(hVar);
                    c3050a.f124238l = 0;
                    c3050a.f124232e = 1;
                    if (hVar.F(aVarT9, c3050a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, z zVar) {
            this.f124227a = gVar;
            this.f124228b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m74.c.a> hVar, tq.e eVar) {
            Object objA = this.f124227a.a(new a(hVar, this.f124228b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm74/a$a;", "<unused var>", "Lm74/b;", "Loq/i0;", "<anonymous>", "(Lm74/a$a;Lm74/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements er.q<p077m74.a.C3044a, b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124239e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f124239e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L41
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L30
            L1e:
                oq.u.b(r5)
                m74.z r5 = p077m74.z.this
                k74.a r5 = p077m74.z.n9(r5)
                r4.f124239e = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L40
            L30:
                m74.z r5 = p077m74.z.this
                xw.b r5 = r5.Y1()
                m74.a$b$a r1 = m74.a.b.C3045a.f124133a
                r4.f124239e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: m74.z.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p077m74.a.C3044a c3044a, b bVar, tq.e<? super i0> eVar) {
            return z.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm74/a$c;", "<unused var>", "Lm74/b;", "Loq/i0;", "<anonymous>", "(Lm74/a$c;Lm74/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements er.q<m74.a.c, b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124241e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124241e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m74.a.b> bVarY1 = z.this.Y1();
                m74.a.b.C3046b c3046b = m74.a.b.C3046b.f124134a;
                this.f124241e = 1;
                if (bVarY1.F(c3046b, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m74.a.c cVar, b bVar, tq.e<? super i0> eVar) {
            return z.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm74/a$d;", "<unused var>", "Lm74/b;", "Loq/i0;", "<anonymous>", "(Lm74/a$d;Lm74/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends k implements er.q<m74.a.d, b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124243e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124243e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m74.a.b> bVarY1 = z.this.Y1();
                Label labelC = z.this.labelProvider.c(k74.b.f109043h);
                Label labelC2 = z.this.labelProvider.c(k74.b.f109044i);
                DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(z.this.labelProvider.c(k74.b.f109038c), null, new er.a() { // from class: m74.a0
                    @Override // er.a
                    public final Object a() {
                        return z.f.O();
                    }
                }, 2, null);
                m74.a.b.NavigateToInfoDialog navigateToInfoDialog = new m74.a.b.NavigateToInfoDialog(new DialogData(cb4.h.b.f24985a, labelC, labelC2, new DialogButtonTextData(z.this.labelProvider.c(k74.b.f109036a), null, z.this.b9(m74.a.c.f124136a), 2, null), dialogButtonTextData, null, null, 96, null));
                this.f124243e = 1;
                if (bVarY1.F(navigateToInfoDialog, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m74.a.d dVar, b bVar, tq.e<? super i0> eVar) {
            return z.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm74/a$f;", "action", "Lk10/c0;", "Lm74/b$a;", "state", "Lk10/l;", "Lm74/b;", "<anonymous>", "(Lm74/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends k implements er.q<p077m74.a.Setup, c0<b.Empty>, tq.e<? super l<? extends b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f124247g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b.Initialized O(p077m74.a.Setup setup, long j15, b.Empty empty) {
            return new b.Initialized(setup.getLockOrigin(), j15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p077m74.a.Setup setup = (p077m74.a.Setup) this.f124246f;
            c0 c0Var = (c0) this.f124247g;
            Object objE = uq.b.e();
            int i15 = this.f124245e;
            if (i15 == 0) {
                u.b(obj);
                k74.a aVar = z.this.applicationLockInteractor;
                this.f124246f = setup;
                this.f124247g = c0Var;
                this.f124245e = 1;
                obj = aVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final long rawValue = ((gu.b) obj).getRawValue();
            return c0Var.d(new er.l() { // from class: m74.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(setup, rawValue, (b.Empty) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p077m74.a.Setup setup, c0<b.Empty> c0Var, tq.e<? super l<? extends b>> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f124246f = setup;
            gVar.f124247g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends k implements p<mu.h<? super Boolean>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f124250f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002e  */
        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f124250f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f124249e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L2e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L4a
            L22:
                oq.u.b(r8)
                m74.z r8 = p077m74.z.this
                tq.i r2 = r7.getContext()
                p077m74.z.r9(r8, r2)
            L2e:
                m74.z r8 = p077m74.z.this
                tq.i r8 = p077m74.z.p9(r8)
                if (r8 != 0) goto L37
                r8 = 0
            L37:
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L59
                r7.f124250f = r0
                r7.f124249e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L4a
                goto L58
            L4a:
                java.lang.Boolean r8 = vq.b.a(r4)
                r7.f124250f = r0
                r7.f124249e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L2e
            L58:
                return r1
            L59:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: m74.z.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Boolean> hVar, tq.e<? super i0> eVar) {
            return ((h) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f124250f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<unused var>", "Lm74/b$b;", "Loq/i0;", "<anonymous>", "(ZLm74/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends k implements er.q<Boolean, b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124252e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f124252e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            z.this.d9(m74.a.e.f124138a);
            return i0.f148189a;
        }

        public final Object M(boolean z15, b.Initialized initialized, tq.e<? super i0> eVar) {
            return z.this.new i(eVar).J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, b.Initialized initialized, tq.e<? super i0> eVar) {
            return M(bool.booleanValue(), initialized, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm74/a$e;", "<unused var>", "Lk10/c0;", "Lm74/b$b;", "state", "Lk10/l;", "Lm74/b;", "<anonymous>", "(Lm74/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends k implements er.q<m74.a.e, c0<b.Initialized>, tq.e<? super l<? extends b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124255f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b.Initialized O(long j15, b.Initialized initialized) {
            return b.Initialized.b(initialized, null, j15, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f124255f;
            Object objE = uq.b.e();
            int i15 = this.f124254e;
            if (i15 == 0) {
                u.b(obj);
                k74.a aVar = z.this.applicationLockInteractor;
                this.f124255f = c0Var;
                this.f124254e = 1;
                obj = aVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final long rawValue = ((gu.b) obj).getRawValue();
            if (gu.b.T(rawValue)) {
                z.this.s9(rawValue);
                return c0Var.b(new er.l() { // from class: m74.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.j.O(rawValue, (b.Initialized) obj2);
                    }
                });
            }
            z.this.d9(p077m74.a.C3044a.f124132a);
            tq.i iVar = z.this.timerCoroutineContext;
            if (iVar == null) {
                iVar = null;
            }
            h2.f(iVar, null, 1, null);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m74.a.e eVar, c0<b.Initialized> c0Var, tq.e<? super l<? extends b>> eVar2) {
            j jVar = z.this.new j(eVar2);
            jVar.f124255f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, mx.c cVar, k74.a aVar2, q qVar, n74.a aVar3, yw.b bVar) {
        this.labelProvider = cVar;
        this.applicationLockInteractor = aVar2;
        this.ownerViewLifecycleManager = qVar;
        this.mapper = aVar3;
        this.accessibilityTalkBackManager = bVar;
        b.Empty empty = new b.Empty(l74.b.LOGIN);
        this.initialState = empty;
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(empty, new er.l() { // from class: m74.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.w9(this.f124205a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), t9(empty));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s9(long timeLeft) {
        long jF = gu.b.F(timeLeft);
        if (jF <= 30) {
            if (jF % 10 != 0) {
                return;
            }
        } else if (jF % 30 != 0) {
            return;
        }
        this.accessibilityTalkBackManager.a(this.labelProvider.e(k74.b.f109046k, Long.valueOf(gu.b.B(timeLeft)), Long.valueOf(jF % 60)).getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m74.c.a t9(b state) {
        return this.mapper.b(new n74.a.Params(state, b9(p077m74.a.C3044a.f124132a), b9(m74.a.d.f124137a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final z zVar, v vVar) {
        vVar.c(q0.c(b.class), new er.l() { // from class: m74.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.x9(this.f124206a, (z) obj);
            }
        });
        vVar.c(q0.c(b.Empty.class), new er.l() { // from class: m74.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.y9(this.f124207a, (z) obj);
            }
        });
        vVar.c(q0.c(b.Initialized.class), new er.l() { // from class: m74.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.z9(this.f124208a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(z zVar, k10.z zVar2) {
        d dVar = zVar.new d(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(p077m74.a.C3044a.class), oVar, dVar);
        zVar2.x(q0.c(m74.a.c.class), oVar, zVar.new e(null));
        zVar2.x(q0.c(m74.a.d.class), oVar, zVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(z zVar, k10.z zVar2) {
        g gVar = zVar.new g(null);
        zVar2.v(q0.c(p077m74.a.Setup.class), o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(z zVar, k10.z zVar2) {
        k10.k.s(zVar2, mu.i.I(zVar.new h(null)), null, zVar.new i(null), 2, null);
        j jVar = zVar.new j(null);
        zVar2.v(q0.c(m74.a.e.class), o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<m74.a.b> Y1() {
        return this.navAction;
    }

    @Override // p077m74.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected t<b, p077m74.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m74.c.a> getState() {
        return this.state;
    }

    public final void u9(l74.b lockEntryPoint) {
        d9(new p077m74.a.Setup(lockEntryPoint));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
