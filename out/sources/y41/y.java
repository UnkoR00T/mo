package y41;

import bl0.BEChildBirthRegistrationBirth;
import bl0.BEChildBirthRegistrationInitial;
import bl0.BEChildBirthRegistrationMarital;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt3.AddressSearchData;
import wi0.CitizenshipDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\"2\u0006\u0010!\u001a\u00020 2\u0010\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0'H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020**\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030G8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010Y\u001a\b\u0012\u0004\u0012\u00020*0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Ly41/y;", "Ll00/g;", "Ly41/b;", "Ly41/a;", "Ly41/c;", "", "Lyy/a;", "stateMachineFactory", "La51/d;", "mapper", "Lib4/c;", "genericErrorMapper", "Lez/a;", "currentTimeProvider", "Lac4/a;", "callActionWithLoaderUseCase", "Lej0/a;", "getCitizenshipDictionaryUseCase", "Lo31/c;", "validDataParentsFieldUseCase", "Lj14/m;", "checkPeselNumberCorrectUC", "Lg14/a;", "getInfoFromPeselUC", "Lq31/c;", "exitDialogMapper", "Lhb4/d;", "errorVMSFactory", "Lz41/a;", "contract", "<init>", "(Lyy/a;La51/d;Lib4/c;Lez/a;Lac4/a;Lej0/a;Lo31/c;Lj14/m;Lg14/a;Lq31/c;Lhb4/d;Lz41/a;)V", "", "pesel", "", "Lb51/a;", "sections", "L9", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "F9", "()Ljava/util/List;", "Ly41/c$a;", "A9", "(Ly41/b;)Ly41/c$a;", "b", "La51/d;", "c", "Lib4/c;", "d", "Lez/a;", "e", "Lac4/a;", "f", "Lej0/a;", "g", "Lo31/c;", "h", "Lj14/m;", "j", "Lg14/a;", "k", "Lq31/c;", "l", "Lhb4/d;", "m", "Lz41/a;", "Ly41/b$b;", "n", "Ly41/b$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ly41/a$b;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<y41.b, y41.a> implements y41.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a51.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ej0.a getCitizenshipDictionaryUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o31.c validDataParentsFieldUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z41.a contract;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final y41.b.C5985b initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y41.b, y41.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y41.a.b> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<y41.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<y41.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f223982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f223983b;

        /* JADX INFO: renamed from: y41.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5992a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f223984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f223985b;

            /* JADX INFO: renamed from: y41.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5993a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f223986d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f223987e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f223988f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f223990h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f223991j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f223992k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f223993l;

                public C5993a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f223986d = obj;
                    this.f223987e |= PKIFailureInfo.systemUnavail;
                    return C5992a.this.F(null, this);
                }
            }

            public C5992a(mu.h hVar, y yVar) {
                this.f223984a = hVar;
                this.f223985b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5993a c5993a;
                if (eVar instanceof C5993a) {
                    c5993a = (C5993a) eVar;
                    int i15 = c5993a.f223987e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5993a.f223987e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5993a = new C5993a(eVar);
                    }
                } else {
                    c5993a = new C5993a(eVar);
                }
                Object obj2 = c5993a.f223986d;
                Object objE = uq.b.e();
                int i16 = c5993a.f223987e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f223984a;
                    y41.c.a aVarA9 = this.f223985b.A9((y41.b) obj);
                    c5993a.f223988f = vq.j.a(obj);
                    c5993a.f223990h = vq.j.a(c5993a);
                    c5993a.f223991j = vq.j.a(obj);
                    c5993a.f223992k = vq.j.a(hVar);
                    c5993a.f223993l = 0;
                    c5993a.f223987e = 1;
                    if (hVar.F(aVarA9, c5993a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, y yVar) {
            this.f223982a = gVar;
            this.f223983b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super y41.c.a> hVar, tq.e eVar) {
            Object objA = this.f223982a.a(new C5992a(hVar, this.f223983b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly41/a$j;", "<unused var>", "Ly41/b;", "Loq/i0;", "<anonymous>", "(Ly41/a$j;Ly41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<y41.a.j, y41.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223994e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f223996e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f223997f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f223997f = yVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f223996e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<y41.a.b> bVarY1 = this.f223997f.Y1();
                    y41.a.b.C5984b c5984b = y41.a.b.C5984b.f223868a;
                    this.f223996e = 1;
                    if (bVarY1.F(c5984b, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f223997f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar) {
            i00.a.a(yVar, new a(yVar, null));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f223994e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y41.a.b> bVarY1 = y.this.Y1();
                q31.c cVar = y.this.exitDialogMapper;
                final y yVar = y.this;
                y41.a.b.ShowDialog showDialog = new y41.a.b.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: y41.z
                    @Override // er.a
                    public final Object a() {
                        return y.b.O(yVar);
                    }
                })));
                this.f223994e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.j jVar, y41.b bVar, tq.e<? super oq.i0> eVar) {
            return y.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly41/a$b;", "action", "Ly41/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly41/a$b;Ly41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<y41.a.b, y41.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223999f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.a.b bVar = (y41.a.b) this.f223999f;
            Object objE = uq.b.e();
            int i15 = this.f223998e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y41.a.b> bVarY1 = y.this.Y1();
                this.f223999f = vq.j.a(bVar);
                this.f223998e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.b bVar, y41.b bVar2, tq.e<? super oq.i0> eVar) {
            c cVar = y.this.new c(eVar);
            cVar.f223999f = bVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly41/b$b;", "it", "Loq/i0;", "<anonymous>", "(Ly41/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<y41.b.C5985b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224001e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f224001e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(y41.a.i.f223885a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(y41.b.C5985b c5985b, tq.e<? super oq.i0> eVar) {
            return ((d) v(c5985b, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$i;", "action", "Lk10/c0;", "Ly41/b$b;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<y41.a.i, k10.c0<y41.b.C5985b>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224004f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ly41/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends y41.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f224006e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f224007f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<y41.b.C5985b> f224008g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<y41.b.C5985b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f224007f = yVar;
                this.f224008g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y41.b.Error Y(final y yVar, dx.b bVar, y41.b.C5985b c5985b) {
                return new y41.b.Error(yVar.errorVMSFactory.a(yVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: y41.c0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y.e.a.Z(yVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Z(y yVar, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    yVar.d9(y41.a.h.f223884a);
                } else {
                    yVar.d9(y41.a.b.C5983a.f223867a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y41.b.Initialized a0(y yVar, List list, y41.b.C5985b c5985b) {
                return new y41.b.Initialized(yVar.contract.x(), yVar.F9(), list, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f224006e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ej0.a aVar = this.f224007f.getCitizenshipDictionaryUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f224006e = 1;
                    obj = aVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<y41.b.C5985b> c0Var = this.f224008g;
                final y yVar = this.f224007f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: y41.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.e.a.Y(yVar, bVar, (b.C5985b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: y41.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.e.a.a0(yVar, list, (b.C5985b) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f224007f, this.f224008g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends y41.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224004f;
            Object objE = uq.b.e();
            int i15 = this.f224003e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f224004f = vq.j.a(c0Var);
            this.f224003e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.i iVar, k10.c0<y41.b.C5985b> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            e eVar2 = y.this.new e(eVar);
            eVar2.f224004f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$f;", "action", "Lk10/c0;", "Ly41/b$c;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<y41.a.OnDropDownClicked, k10.c0<y41.b.Initialized>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224011g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.Initialized O(y41.b.Initialized initialized) {
            return y41.b.Initialized.b(initialized, null, null, null, null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.a.OnDropDownClicked onDropDownClicked = (y41.a.OnDropDownClicked) this.f224010f;
            k10.c0 c0Var = (k10.c0) this.f224011g;
            uq.b.e();
            if (this.f224009e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(new y41.a.b.GoToSearch(onDropDownClicked.getModel()));
            return c0Var.b(new er.l() { // from class: y41.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.f.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.OnDropDownClicked onDropDownClicked, k10.c0<y41.b.Initialized> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            f fVar = y.this.new f(eVar);
            fVar.f224010f = onDropDownClicked;
            fVar.f224011g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$a;", "<unused var>", "Lk10/c0;", "Ly41/b$c;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<y41.a.C5982a, k10.c0<y41.b.Initialized>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224014f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.Initialized O(List list, y41.b.Initialized initialized) {
            Object next;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, ((b51.a) it.next()).b().entrySet());
            }
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!(((b51.a.FieldData) ((Map.Entry) next).getValue()).getValidationState() instanceof hz.b.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return y41.b.Initialized.b(initialized, null, list, null, entry != null ? new d60.j(entry.getKey()) : null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224014f;
            Object objE = uq.b.e();
            int i15 = this.f224013e;
            if (i15 == 0) {
                oq.u.b(obj);
                o31.c cVar = y.this.validDataParentsFieldUseCase;
                o31.c.Params params = new o31.c.Params(((y41.b.Initialized) c0Var.a()).f());
                this.f224014f = c0Var;
                this.f224013e = 1;
                obj = cVar.e(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final List list = (List) obj;
            if (r0.f(list)) {
                y.this.contract.f2(((y41.b.Initialized) c0Var.a()).f());
                y.this.d9(y41.a.b.d.f223869a);
            }
            return c0Var.b(new er.l() { // from class: y41.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O(list, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.C5982a c5982a, k10.c0<y41.b.Initialized> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            g gVar = y.this.new g(eVar);
            gVar.f224014f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly41/a$e;", "action", "Ly41/b$c;", "state", "Loq/i0;", "<anonymous>", "(Ly41/a$e;Ly41/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<y41.a.e, y41.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224017f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar, fz.b.LocalDate localDate) {
            yVar.d9(new y41.a.OnDateChanged(b51.a.SecondDataParent.EnumC0405a.DateOfBirth, localDate));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.b.Initialized initialized = (y41.b.Initialized) this.f224017f;
            uq.b.e();
            if (this.f224016e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y yVar = y.this;
            fz.b.LocalDate localDateE = r0.e(initialized.f(), b51.a.SecondDataParent.EnumC0405a.DateOfBirth);
            if (localDateE == null) {
                localDateE = new fz.b.LocalDate(y.this.currentTimeProvider.c().minusDays(1L));
            }
            fz.b.LocalDate localDate = new fz.b.LocalDate(y.this.currentTimeProvider.c().minusDays(1L));
            final y yVar2 = y.this;
            yVar.d9(new y41.a.b.ShowDataPicker(localDateE, localDate, new er.l() { // from class: y41.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h.O(yVar2, (fz.b.LocalDate) obj2);
                }
            }));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.e eVar, y41.b.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            h hVar = y.this.new h(eVar2);
            hVar.f224017f = initialized;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$g;", "action", "Lk10/c0;", "Ly41/b$c;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<y41.a.OnFieldValueChanged, k10.c0<y41.b.Initialized>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224021g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.Initialized O(fr.p0 p0Var, y41.b.Initialized initialized) {
            return y41.b.Initialized.b(initialized, null, (List) p0Var.f66410a, null, null, 13, null);
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.util.List] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.a.OnFieldValueChanged onFieldValueChanged = (y41.a.OnFieldValueChanged) this.f224020f;
            k10.c0 c0Var = (k10.c0) this.f224021g;
            uq.b.e();
            if (this.f224019e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final fr.p0 p0Var = new fr.p0();
            p0Var.f66410a = pq.v.i1(((y41.b.Initialized) c0Var.a()).f());
            if (onFieldValueChanged.getField() == b51.a.SecondDataParent.EnumC0405a.PESEL) {
                p0Var.f66410a = y.this.L9(onFieldValueChanged.getValue(), (List) p0Var.f66410a);
            }
            List list = (List) p0Var.f66410a;
            r0.k(list, onFieldValueChanged.getField(), onFieldValueChanged.getValue());
            r0.n(list, onFieldValueChanged.getField(), hz.b.C2039b.f86846c, false, 4, null);
            return c0Var.b(new er.l() { // from class: y41.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.i.O(p0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.OnFieldValueChanged onFieldValueChanged, k10.c0<y41.b.Initialized> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f224020f = onFieldValueChanged;
            iVar.f224021g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$d;", "action", "Lk10/c0;", "Ly41/b$c;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<y41.a.OnDateChanged, k10.c0<y41.b.Initialized>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224025g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.Initialized O(List list, y41.b.Initialized initialized) {
            return y41.b.Initialized.b(initialized, null, list, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.a.OnDateChanged onDateChanged = (y41.a.OnDateChanged) this.f224024f;
            k10.c0 c0Var = (k10.c0) this.f224025g;
            uq.b.e();
            if (this.f224023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List listI1 = pq.v.i1(((y41.b.Initialized) c0Var.a()).f());
            r0.i(listI1, onDateChanged.getField(), onDateChanged.getDate());
            r0.n(listI1, onDateChanged.getField(), hz.b.C2039b.f86846c, false, 4, null);
            return c0Var.b(new er.l() { // from class: y41.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.j.O(listI1, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.OnDateChanged onDateChanged, k10.c0<y41.b.Initialized> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f224024f = onDateChanged;
            jVar.f224025g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$c;", "action", "Lk10/c0;", "Ly41/b$c;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<y41.a.OnCitizenshipSelected, k10.c0<y41.b.Initialized>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224028g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.Initialized O(List list, y41.b.Initialized initialized) {
            return y41.b.Initialized.b(initialized, null, list, null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y41.a.OnCitizenshipSelected onCitizenshipSelected = (y41.a.OnCitizenshipSelected) this.f224027f;
            k10.c0 c0Var = (k10.c0) this.f224028g;
            uq.b.e();
            if (this.f224026e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List listI1 = pq.v.i1(((y41.b.Initialized) c0Var.a()).f());
            r0.g(listI1, onCitizenshipSelected.getCitizenshipDictionary());
            r0.n(listI1, b51.a.SecondDataParent.EnumC0405a.Citizenship, hz.b.C2039b.f86846c, false, 4, null);
            return c0Var.b(new er.l() { // from class: y41.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.k.O(listI1, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.OnCitizenshipSelected onCitizenshipSelected, k10.c0<y41.b.Initialized> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f224027f = onCitizenshipSelected;
            kVar.f224028g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly41/a$h;", "<unused var>", "Lk10/c0;", "Ly41/b$a;", "state", "Lk10/l;", "Ly41/b;", "<anonymous>", "(Ly41/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<y41.a.h, k10.c0<y41.b.Error>, tq.e<? super k10.l<? extends y41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224030f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y41.b.C5985b O(y41.b.Error error) {
            return y41.b.C5985b.f223890a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224030f;
            uq.b.e();
            if (this.f224029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: y41.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.l.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y41.a.h hVar, k10.c0<y41.b.Error> c0Var, tq.e<? super k10.l<? extends y41.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f224030f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    public y(yy.a aVar, a51.d dVar, ib4.c cVar, ez.a aVar2, ac4.a aVar3, ej0.a aVar4, o31.c cVar2, j14.m mVar, g14.a aVar5, q31.c cVar3, hb4.d dVar2, z41.a aVar6) {
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.currentTimeProvider = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.getCitizenshipDictionaryUseCase = aVar4;
        this.validDataParentsFieldUseCase = cVar2;
        this.checkPeselNumberCorrectUC = mVar;
        this.getInfoFromPeselUC = aVar5;
        this.exitDialogMapper = cVar3;
        this.errorVMSFactory = dVar2;
        this.contract = aVar6;
        y41.b.C5985b c5985b = y41.b.C5985b.f223890a;
        this.initialState = c5985b;
        this.stateMachine = aVar.a(c5985b, new er.l() { // from class: y41.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.G9(this.f223966a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), A9(c5985b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y41.c.a A9(y41.b bVar) {
        return this.mapper.b(new a51.d.Params(bVar, b9(y41.a.C5982a.f223866a), new er.p() { // from class: y41.u
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return y.B9(this.f223963a, (b51.a.c) obj, (String) obj2);
            }
        }, b9(y41.a.e.f223880a), new er.l() { // from class: y41.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.C9(this.f223964a, (AddressSearchData) obj);
            }
        }, new er.l() { // from class: y41.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.D9(this.f223965a, (CitizenshipDictionary) obj);
            }
        }, b9(y41.a.j.f223886a), b9(y41.a.b.C5983a.f223867a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(y yVar, b51.a.c cVar, String str) {
        yVar.d9(new y41.a.OnFieldValueChanged(cVar, str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(y yVar, AddressSearchData addressSearchData) {
        yVar.d9(new y41.a.OnDropDownClicked(addressSearchData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(y yVar, CitizenshipDictionary citizenshipDictionary) {
        yVar.d9(new y41.a.OnCitizenshipSelected(citizenshipDictionary));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<b51.a<?>> F9() {
        bl0.d dVarV0 = this.contract.V0();
        List<b51.a<?>> listK8 = this.contract.k8();
        if (listK8 == null) {
            listK8 = s0.f223961a.c(this.contract.x(), this.contract.V0());
        }
        BEChildBirthRegistrationInitial bEChildBirthRegistrationInitialI = this.contract.i();
        BEChildBirthRegistrationMarital maritalData = bEChildBirthRegistrationInitialI != null ? bEChildBirthRegistrationInitialI.getMaritalData() : null;
        BEChildBirthRegistrationInitial bEChildBirthRegistrationInitialI2 = this.contract.i();
        BEChildBirthRegistrationBirth birth = bEChildBirthRegistrationInitialI2 != null ? bEChildBirthRegistrationInitialI2.getBirth() : null;
        List<b51.a<?>> list = listK8;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (b51.a<?> aVarA : list) {
            if ((aVarA instanceof b51.a.MarriageCertificate) && maritalData != null) {
                aVarA = s0.f223961a.b((b51.a.MarriageCertificate) aVarA, dVarV0, maritalData);
            } else if ((aVarA instanceof b51.a.YourBirthCertificate) && birth != null) {
                aVarA = s0.f223961a.a((b51.a.YourBirthCertificate) aVarA, birth);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final y yVar, k10.v vVar) {
        vVar.c(fr.q0.c(y41.b.class), new er.l() { // from class: y41.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.H9(this.f223950a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(y41.b.C5985b.class), new er.l() { // from class: y41.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.I9(this.f223953a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(y41.b.Initialized.class), new er.l() { // from class: y41.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.J9(this.f223960a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(y41.b.Error.class), new er.l() { // from class: y41.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.K9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(y yVar, k10.z zVar) {
        b bVar = yVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(y41.a.j.class), oVar, bVar);
        zVar.x(fr.q0.c(y41.a.b.class), oVar, yVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(y yVar, k10.z zVar) {
        zVar.C(yVar.new d(null));
        e eVar = yVar.new e(null);
        zVar.v(fr.q0.c(y41.a.i.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(y yVar, k10.z zVar) {
        f fVar = yVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(y41.a.OnDropDownClicked.class), oVar, fVar);
        zVar.v(fr.q0.c(y41.a.C5982a.class), oVar, yVar.new g(null));
        zVar.x(fr.q0.c(y41.a.e.class), oVar, yVar.new h(null));
        zVar.v(fr.q0.c(y41.a.OnFieldValueChanged.class), oVar, yVar.new i(null));
        zVar.v(fr.q0.c(y41.a.OnDateChanged.class), oVar, new j(null));
        zVar.v(fr.q0.c(y41.a.OnCitizenshipSelected.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(y41.a.h.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<b51.a<?>> L9(String pesel, List<b51.a<?>> sections) {
        hz.g gVarA = this.checkPeselNumberCorrectUC.a(new j14.m.Params(pesel, true));
        if (gVarA instanceof hz.g.Invalid) {
            b51.a.SecondDataParent.EnumC0405a enumC0405a = b51.a.SecondDataParent.EnumC0405a.DateOfBirth;
            r0.i(sections, enumC0405a, null);
            r0.m(sections, enumC0405a, hz.b.C2039b.f86846c, true);
            return sections;
        }
        if (!fr.t.c(gVarA, hz.g.b.f86853b)) {
            throw new oq.p();
        }
        g14.a.b bVarA = this.getInfoFromPeselUC.a(new g14.a.Params(xw.g.c(iy.c0.g(pesel)), null));
        if (bVarA instanceof g14.a.b.Success) {
            b51.a.SecondDataParent.EnumC0405a enumC0405a2 = b51.a.SecondDataParent.EnumC0405a.DateOfBirth;
            r0.i(sections, enumC0405a2, new fz.b.LocalDate(((g14.a.b.Success) bVarA).getBirthDate()));
            r0.m(sections, enumC0405a2, hz.b.C2039b.f86846c, false);
        }
        return sections;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(z41.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<y41.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<y41.b, y41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<y41.c.a> getState() {
        return this.state;
    }
}
