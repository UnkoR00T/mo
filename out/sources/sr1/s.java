package sr1;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.z0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lsr1/s;", "Ll00/g;", "Lsr1/b;", "Lsr1/a;", "Lsr1/c;", "", "Lyy/a;", "stateMachineFactory", "Ltr1/b;", "mapper", "Lez/a;", "currentTimeProvider", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Ltr1/b;Lez/a;Lac4/a;)V", "", "", "q9", "()Ljava/util/List;", "Lsr1/c$a;", "r9", "(Lsr1/b;)Lsr1/c$a;", "b", "Ltr1/b;", "c", "Lez/a;", "d", "Lac4/a;", "Lsr1/b$a;", "e", "Lsr1/b$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsr1/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<sr1.b, sr1.a> implements sr1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tr1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sr1.b.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sr1.b, sr1.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sr1.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<sr1.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sr1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f183757b;

        /* JADX INFO: renamed from: sr1.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4729a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f183759b;

            /* JADX INFO: renamed from: sr1.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4730a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183760d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183761e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183762f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183764h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183765j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183766k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183767l;

                public C4730a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183760d = obj;
                    this.f183761e |= PKIFailureInfo.systemUnavail;
                    return C4729a.this.F(null, this);
                }
            }

            public C4729a(mu.h hVar, s sVar) {
                this.f183758a = hVar;
                this.f183759b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4730a c4730a;
                if (eVar instanceof C4730a) {
                    c4730a = (C4730a) eVar;
                    int i15 = c4730a.f183761e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4730a.f183761e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4730a = new C4730a(eVar);
                    }
                } else {
                    c4730a = new C4730a(eVar);
                }
                Object obj2 = c4730a.f183760d;
                Object objE = uq.b.e();
                int i16 = c4730a.f183761e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f183758a;
                    sr1.c.a aVarR9 = this.f183759b.r9((sr1.b) obj);
                    c4730a.f183762f = vq.j.a(obj);
                    c4730a.f183764h = vq.j.a(c4730a);
                    c4730a.f183765j = vq.j.a(obj);
                    c4730a.f183766k = vq.j.a(hVar);
                    c4730a.f183767l = 0;
                    c4730a.f183761e = 1;
                    if (hVar.F(aVarR9, c4730a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, s sVar) {
            this.f183756a = gVar;
            this.f183757b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sr1.c.a> hVar, tq.e eVar) {
            Object objA = this.f183756a.a(new C4729a(hVar, this.f183757b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsr1/a$b;", "action", "Lsr1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsr1/a$b;Lsr1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sr1.a.b, sr1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183769f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sr1.a.b bVar = (sr1.a.b) this.f183769f;
            Object objE = uq.b.e();
            int i15 = this.f183768e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sr1.a.b> bVarY1 = s.this.Y1();
                this.f183769f = vq.j.a(bVar);
                this.f183768e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sr1.a.b bVar, sr1.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = s.this.new b(eVar);
            bVar3.f183769f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsr1/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lsr1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<sr1.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183771e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f183771e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(sr1.a.C4725a.f183718a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sr1.b.a aVar, tq.e<? super i0> eVar) {
            return ((c) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsr1/a$a;", "<unused var>", "Lk10/c0;", "Lsr1/b;", "state", "Lk10/l;", "<anonymous>", "(Lsr1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sr1.a.C4725a, c0<sr1.b>, tq.e<? super k10.l<? extends sr1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183774f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsr1/b$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sr1.b.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f183776e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f183777f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<sr1.b> f183778g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<sr1.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f183777f = sVar;
                this.f183778g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sr1.b.Initialized V(s sVar, List list, List list2, sr1.b bVar) {
                return new sr1.b.Initialized(new fz.b.OffsetDateTime(sVar.currentTimeProvider.f()), false, pq.v.L0(list, list2));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final List listN;
                List<String> listC;
                Object objE = uq.b.e();
                int i15 = this.f183776e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    this.f183776e = 1;
                    if (z0.b(500L, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                final List listQ9 = this.f183777f.q9();
                sr1.b bVarA = this.f183778g.a();
                sr1.b.Initialized initialized = bVarA instanceof sr1.b.Initialized ? (sr1.b.Initialized) bVarA : null;
                if (initialized == null || (listC = initialized.c()) == null) {
                    listN = pq.v.n();
                } else {
                    List<String> list = listC;
                    listN = new ArrayList(pq.v.y(list, 10));
                    for (String str : list) {
                        listN.add("Not new");
                    }
                }
                c0<sr1.b> c0Var = this.f183778g;
                final s sVar = this.f183777f;
                return c0Var.d(new er.l() { // from class: sr1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.d.a.V(sVar, listQ9, listN, (b) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f183777f, this.f183778g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<sr1.b.Initialized>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f183774f;
            Object objE = uq.b.e();
            int i15 = this.f183773e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, null);
            this.f183774f = vq.j.a(c0Var);
            this.f183773e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sr1.a.C4725a c4725a, c0<sr1.b> c0Var, tq.e<? super k10.l<? extends sr1.b>> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f183774f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsr1/a$c;", "<unused var>", "Lk10/c0;", "Lsr1/b$b;", "state", "Lk10/l;", "Lsr1/b;", "<anonymous>", "(Lsr1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sr1.a.c, c0<sr1.b.Initialized>, tq.e<? super k10.l<? extends sr1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183780f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sr1.b.Initialized O(c0 c0Var, sr1.b.Initialized initialized) {
            return sr1.b.Initialized.b((sr1.b.Initialized) c0Var.a(), null, true, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f183780f;
            uq.b.e();
            if (this.f183779e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(sr1.a.C4725a.f183718a);
            return c0Var.b(new er.l() { // from class: sr1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sr1.a.c cVar, c0<sr1.b.Initialized> c0Var, tq.e<? super k10.l<? extends sr1.b>> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f183780f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, tr1.b bVar, ez.a aVar2, ac4.a aVar3) {
        this.mapper = bVar;
        this.currentTimeProvider = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        sr1.b.a aVar4 = sr1.b.a.f183721a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: sr1.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f183744a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), r9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> q9() {
        List listF1 = pq.v.f1(new lr.i(0, lr.m.s(new lr.i(0, 2), jr.c.INSTANCE)));
        ArrayList arrayList = new ArrayList(pq.v.y(listF1, 10));
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            arrayList.add("New");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sr1.c.a r9(sr1.b bVar) {
        return this.mapper.b(new tr1.b.Params(bVar, b9(sr1.a.c.f183720a), b9(sr1.a.b.C4726a.f183719a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(sr1.b.class), new er.l() { // from class: sr1.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f183745a, (z) obj);
            }
        });
        vVar.c(q0.c(sr1.b.a.class), new er.l() { // from class: sr1.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f183746a, (z) obj);
            }
        });
        vVar.c(q0.c(sr1.b.class), new er.l() { // from class: sr1.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f183747a, (z) obj);
            }
        });
        vVar.c(q0.c(sr1.b.Initialized.class), new er.l() { // from class: sr1.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f183748a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(sr1.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, z zVar) {
        zVar.C(sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, z zVar) {
        d dVar = sVar.new d(null);
        zVar.v(q0.c(sr1.a.C4725a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, z zVar) {
        e eVar = sVar.new e(null);
        zVar.v(q0.c(sr1.a.c.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sr1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sr1.b, sr1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sr1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
