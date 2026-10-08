package zg2;

import fr.q0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lzg2/s;", "Ll00/g;", "Lzg2/h;", "", "Lzg2/i;", "Lyy/a;", "stateMachineFactory", "Lah2/c;", "mapper", "La14/g;", "dialIntentUseCase", "La14/d;", "copyToClipboardUseCase", "<init>", "(Lyy/a;Lah2/c;La14/g;La14/d;)V", "Lzg2/i$a;", "n9", "(Lzg2/h;)Lzg2/i$a;", "b", "Lah2/c;", "c", "La14/g;", "d", "La14/d;", "e", "Lzg2/h;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzg2/g;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<h, Object> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ah2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<i.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f235175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f235176b;

        /* JADX INFO: renamed from: zg2.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6335a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f235177a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f235178b;

            /* JADX INFO: renamed from: zg2.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6336a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f235179d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f235180e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f235181f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f235183h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f235184j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f235185k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f235186l;

                public C6336a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f235179d = obj;
                    this.f235180e |= PKIFailureInfo.systemUnavail;
                    return C6335a.this.F(null, this);
                }
            }

            public C6335a(mu.h hVar, s sVar) {
                this.f235177a = hVar;
                this.f235178b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6336a c6336a;
                if (eVar instanceof C6336a) {
                    c6336a = (C6336a) eVar;
                    int i15 = c6336a.f235180e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6336a.f235180e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6336a = new C6336a(eVar);
                    }
                } else {
                    c6336a = new C6336a(eVar);
                }
                Object obj2 = c6336a.f235179d;
                Object objE = uq.b.e();
                int i16 = c6336a.f235180e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f235177a;
                    i.Data dataN9 = this.f235178b.n9((h) obj);
                    c6336a.f235181f = vq.j.a(obj);
                    c6336a.f235183h = vq.j.a(c6336a);
                    c6336a.f235184j = vq.j.a(obj);
                    c6336a.f235185k = vq.j.a(hVar);
                    c6336a.f235186l = 0;
                    c6336a.f235180e = 1;
                    if (hVar.F(dataN9, c6336a) == objE) {
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
            this.f235175a = gVar;
            this.f235176b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.Data> hVar, tq.e eVar) {
            Object objA = this.f235175a.a(new C6335a(hVar, this.f235176b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg2/d;", "<unused var>", "Lzg2/h;", "Loq/i0;", "<anonymous>", "(Lzg2/d;Lzg2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zg2.d, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235187e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235187e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g> bVarY1 = s.this.Y1();
                g.a aVar = g.a.f235153a;
                this.f235187e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(zg2.d dVar, h hVar, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg2/f;", "action", "Lzg2/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzg2/f;Lzg2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<CopyEmail, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235190f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CopyEmail copyEmail = (CopyEmail) this.f235190f;
            Object objE = uq.b.e();
            int i15 = this.f235189e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d dVar = s.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(copyEmail.getEmail(), copyEmail.getLabel());
                this.f235190f = vq.j.a(copyEmail);
                this.f235189e = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(CopyEmail copyEmail, h hVar, tq.e<? super i0> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f235190f = copyEmail;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg2/e;", "action", "Lzg2/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzg2/e;Lzg2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<Call, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f235193f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Call call = (Call) this.f235193f;
            Object objE = uq.b.e();
            int i15 = this.f235192e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.g gVar = s.this.dialIntentUseCase;
                a14.g.Params params = new a14.g.Params(call.getPhoneNumber());
                this.f235193f = vq.j.a(call);
                this.f235192e = 1;
                if (gVar.c(params, this) == objE) {
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
        public final Object w(Call call, h hVar, tq.e<? super i0> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f235193f = call;
            return dVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, ah2.c cVar, a14.g gVar, a14.d dVar) {
        this.mapper = cVar;
        this.dialIntentUseCase = gVar;
        this.copyToClipboardUseCase = dVar;
        h hVar = h.f235154a;
        this.initialState = hVar;
        this.stateMachine = aVar.a(hVar, new er.l() { // from class: zg2.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9(this.f235164a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.Data n9(h hVar) {
        return this.mapper.b(new ah2.c.Params(hVar, b9(zg2.d.f235149a), new er.p() { // from class: zg2.q
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return s.o9(this.f235166a, (String) obj, (Label) obj2);
            }
        }, new er.l() { // from class: zg2.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.p9(this.f235167a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(s sVar, String str, Label label) {
        sVar.d9(new CopyEmail(str, label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(s sVar, String str) {
        sVar.d9(new Call(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(h.class), new er.l() { // from class: zg2.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.s9(this.f235165a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zg2.d.class), oVar, bVar);
        zVar.x(q0.c(CopyEmail.class), oVar, sVar.new c(null));
        zVar.x(q0.c(Call.class), oVar, sVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
