package we3;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020**\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010N\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010!\u001a\b\u0012\u0004\u0012\u00020*0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lwe3/p;", "Ll00/g;", "Lwe3/b;", "Lwe3/a;", "Lwe3/c;", "", "Lyy/a;", "stateMachineFactory", "Lae3/e;", "downloadImageUC", "Lib4/c;", "domainErrorMapper", "Lxe3/c;", "mapper", "Lae3/q;", "requestStoragePermissionUC", "Lac4/a;", "loaderUseCase", "Lb00/c;", "imageConverter", "Lde3/b;", "isDownloadTokenExpiredErrorUC", "Lde3/a;", "createDownloadTokenExpiredErrorUC", "Lye3/b;", "setupData", "<init>", "(Lyy/a;Lae3/e;Lib4/c;Lxe3/c;Lae3/q;Lac4/a;Lb00/c;Lde3/b;Lde3/a;Lye3/b;)V", "Loq/i0;", "D9", "(Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Lwe3/b$b;", "state", "Lk10/l;", "x9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "retryAction", "A9", "(Ldx/b;Lwe3/a;)V", "Lwe3/c$a;", "B9", "(Lwe3/b;)Lwe3/c$a;", "b", "Lae3/e;", "c", "Lib4/c;", "d", "Lxe3/c;", "e", "Lae3/q;", "f", "Lac4/a;", "g", "Lb00/c;", "h", "Lde3/b;", "j", "Lde3/a;", "k", "Lye3/b;", "l", "Lwe3/b$b;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwe3/a$b;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<we3.b, we3.a> implements we3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ae3.e downloadImageUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xe3.c mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ae3.q requestStoragePermissionUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final de3.b isDownloadTokenExpiredErrorUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final de3.a createDownloadTokenExpiredErrorUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PhotosDetailsSetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final we3.b.C5623b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<we3.b, we3.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<we3.a.b> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<we3.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212868h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212869j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f212870k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f212871l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f212872m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f212873n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212874p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212875q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f212876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f212877s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f212879v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212877s = obj;
            this.f212879v |= PKIFailureInfo.systemUnavail;
            return p.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212880e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f212882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ we3.a f212883h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dx.b bVar, we3.a aVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f212882g = bVar;
            this.f212883h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(p pVar, ib4.c.b bVar) {
            pVar.d9(we3.a.e.f212826a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(we3.a aVar, p pVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) && aVar != null) {
                pVar.d9(aVar);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ib4.c.Params params;
            Object objE = uq.b.e();
            int i15 = this.f212880e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                ib4.c cVar = p.this.domainErrorMapper;
                if (p.this.isDownloadTokenExpiredErrorUC.b(new de3.b.Params(this.f212882g)).booleanValue()) {
                    dx.b.Business businessB = p.this.createDownloadTokenExpiredErrorUC.b(de3.a.InterfaceC0924a.c.f41293a);
                    final p pVar2 = p.this;
                    params = new ib4.c.Params(businessB, false, new er.l() { // from class: we3.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.b.X(pVar2, (ib4.c.b) obj2);
                        }
                    }, 2, null);
                } else {
                    dx.b bVar = this.f212882g;
                    final we3.a aVar = this.f212883h;
                    final p pVar3 = p.this;
                    params = new ib4.c.Params(bVar, false, new er.l() { // from class: we3.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.b.Y(aVar, pVar3, (ib4.c.b) obj2);
                        }
                    }, 2, null);
                }
                we3.a.b.ShowError showError = new we3.a.b.ShowError(cVar.b(params));
                this.f212880e = 1;
                if (pVar.F(showError, this) == objE) {
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

        public final tq.e<i0> O(tq.e<?> eVar) {
            return p.this.new b(this.f212882g, this.f212883h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) O(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f212884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f212886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212888h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212889j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f212890k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f212891l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f212892m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f212893n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f212894p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f212896r;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212894p = obj;
            this.f212896r |= PKIFailureInfo.systemUnavail;
            return p.this.D9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<we3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f212897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f212898b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f212899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f212900b;

            /* JADX INFO: renamed from: we3.p$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5625a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f212901d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f212902e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f212903f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f212905h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f212906j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f212907k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f212908l;

                public C5625a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f212901d = obj;
                    this.f212902e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f212899a = hVar;
                this.f212900b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5625a c5625a;
                if (eVar instanceof C5625a) {
                    c5625a = (C5625a) eVar;
                    int i15 = c5625a.f212902e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5625a.f212902e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5625a = new C5625a(eVar);
                    }
                } else {
                    c5625a = new C5625a(eVar);
                }
                Object obj2 = c5625a.f212901d;
                Object objE = uq.b.e();
                int i16 = c5625a.f212902e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f212899a;
                    we3.c.a aVarB9 = this.f212900b.B9((we3.b) obj);
                    c5625a.f212903f = vq.j.a(obj);
                    c5625a.f212905h = vq.j.a(c5625a);
                    c5625a.f212906j = vq.j.a(obj);
                    c5625a.f212907k = vq.j.a(hVar);
                    c5625a.f212908l = 0;
                    c5625a.f212902e = 1;
                    if (hVar.F(aVarB9, c5625a) == objE) {
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

        public d(mu.g gVar, p pVar) {
            this.f212897a = gVar;
            this.f212898b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super we3.c.a> hVar, tq.e eVar) {
            Object objA = this.f212897a.a(new a(hVar, this.f212898b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe3/a$a;", "<unused var>", "Lwe3/b;", "Loq/i0;", "<anonymous>", "(Lwe3/a$a;Lwe3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<we3.a.C5620a, we3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212909e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212909e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                we3.a.b.C5621a c5621a = we3.a.b.C5621a.f212817a;
                this.f212909e = 1;
                if (pVar.F(c5621a, this) == objE) {
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
        public final Object w(we3.a.C5620a c5620a, we3.b bVar, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe3/a$e;", "<unused var>", "Lwe3/b;", "Loq/i0;", "<anonymous>", "(Lwe3/a$e;Lwe3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<we3.a.e, we3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212911e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212911e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we3.a.b> bVarY1 = p.this.Y1();
                we3.a.b.RefreshDownloadToken refreshDownloadToken = new we3.a.b.RefreshDownloadToken(p.this.setupData.getEnteredFrom(), p.this.setupData.getProcessId());
                this.f212911e = 1;
                if (bVarY1.F(refreshDownloadToken, this) == objE) {
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
        public final Object w(we3.a.e eVar, we3.b bVar, tq.e<? super i0> eVar2) {
            return p.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwe3/b$b;", "state", "Lk10/l;", "Lwe3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<we3.b.C5623b>, tq.e<? super k10.l<? extends we3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212914f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwe3/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends we3.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212916e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f212917f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<we3.b.C5623b> f212918g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<we3.b.C5623b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212917f = pVar;
                this.f212918g = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f212916e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                p pVar = this.f212917f;
                c0<we3.b.C5623b> c0Var = this.f212918g;
                this.f212916e = 1;
                Object objX9 = pVar.x9(c0Var, this);
                return objX9 == objE ? objE : objX9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f212917f, this.f212918g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends we3.b>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f212914f;
            Object objE = uq.b.e();
            int i15 = this.f212913e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.loaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f212914f = vq.j.a(c0Var);
            this.f212913e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<we3.b.C5623b> c0Var, tq.e<? super k10.l<? extends we3.b>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f212914f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwe3/a$d;", "action", "Lwe3/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwe3/a$d;Lwe3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<we3.a.OnPhotoClick, we3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212920f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f212922e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f212923f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f212924g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f212925h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f212926j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ p f212927k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ we3.a.OnPhotoClick f212928l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, we3.a.OnPhotoClick onPhotoClick, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212927k = pVar;
                this.f212928l = onPhotoClick;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0096  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                dx.i iVar2;
                p pVar;
                we3.a.OnPhotoClick onPhotoClick;
                Object objE = uq.b.e();
                int i15 = this.f212926j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ae3.e eVar = this.f212927k.downloadImageUC;
                    ae3.e.Params params = new ae3.e.Params(this.f212927k.setupData.getImageConfiguration(), this.f212928l.getFile().getFile());
                    this.f212926j = 1;
                    obj = eVar.f(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = (dx.i) this.f212922e;
                    oq.u.b(obj);
                }
                iVar = iVar2;
                pVar = this.f212927k;
                onPhotoClick = this.f212928l;
                if (iVar instanceof dx.i.Left) {
                    pVar.A9((dx.b) ((dx.i.Left) iVar).b(), onPhotoClick);
                }
                return i0.f148189a;
                iVar = (dx.i) obj;
                p pVar2 = this.f212927k;
                we3.a.OnPhotoClick onPhotoClick2 = this.f212928l;
                if (iVar instanceof dx.i.Right) {
                    FileContent fileContent = (FileContent) ((dx.i.Right) iVar).b();
                    we3.a.b.ShowImagePreview showImagePreview = new we3.a.b.ShowImagePreview(new dx3.a.Content(onPhotoClick2.getFile().getName(), fileContent));
                    this.f212922e = iVar;
                    this.f212923f = vq.j.a(fileContent);
                    this.f212924g = 0;
                    this.f212925h = 0;
                    this.f212926j = 2;
                    if (pVar2.F(showImagePreview, this) != objE) {
                        iVar2 = iVar;
                        iVar = iVar2;
                    }
                    return objE;
                }
                pVar = this.f212927k;
                onPhotoClick = this.f212928l;
                if (iVar instanceof dx.i.Left) {
                    pVar.A9((dx.b) ((dx.i.Left) iVar).b(), onPhotoClick);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f212927k, this.f212928l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            we3.a.OnPhotoClick onPhotoClick = (we3.a.OnPhotoClick) this.f212920f;
            Object objE = uq.b.e();
            int i15 = this.f212919e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p.this.loaderUseCase;
                a aVar2 = new a(p.this, onPhotoClick, null);
                this.f212920f = vq.j.a(onPhotoClick);
                this.f212919e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(we3.a.OnPhotoClick onPhotoClick, we3.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f212920f = onPhotoClick;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe3/a$c;", "<unused var>", "Lwe3/b$a;", "Loq/i0;", "<anonymous>", "(Lwe3/a$c;Lwe3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<we3.a.c, we3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212929e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212929e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f212929e = 1;
                if (pVar.D9(this) == objE) {
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
        public final Object w(we3.a.c cVar, we3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ae3.e eVar, ib4.c cVar, xe3.c cVar2, ae3.q qVar, ac4.a aVar2, b00.c cVar3, de3.b bVar, de3.a aVar3, PhotosDetailsSetupData photosDetailsSetupData) {
        this.downloadImageUC = eVar;
        this.domainErrorMapper = cVar;
        this.mapper = cVar2;
        this.requestStoragePermissionUC = qVar;
        this.loaderUseCase = aVar2;
        this.imageConverter = cVar3;
        this.isDownloadTokenExpiredErrorUC = bVar;
        this.createDownloadTokenExpiredErrorUC = aVar3;
        this.setupData = photosDetailsSetupData;
        we3.b.C5623b c5623b = we3.b.C5623b.f212829a;
        this.initialState = c5623b;
        this.stateMachine = aVar.a(c5623b, new er.l() { // from class: we3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.F9(this.f212850a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), B9(c5623b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A9(dx.b domainError, we3.a retryAction) {
        i00.a.a(this, new b(domainError, retryAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final we3.c.a B9(we3.b bVar) {
        xe3.c cVar = this.mapper;
        er.a<i0> aVarB9 = b9(we3.a.C5620a.f212816a);
        return cVar.b(new xe3.c.Params(bVar, new er.l() { // from class: we3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f212844a, (xe3.c.PhotoClicked) obj);
            }
        }, b9(we3.a.c.f212824a), aVarB9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, xe3.c.PhotoClicked photoClicked) {
        pVar.d9(new we3.a.OnPhotoClick(photoClicked));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[Catch: Exception -> 0x0070, c -> 0x0074, CancellationException -> 0x0078, TryCatch #7 {c -> 0x0074, CancellationException -> 0x0078, Exception -> 0x0070, blocks: (B:25:0x006c, B:38:0x00b7, B:40:0x00c1, B:44:0x0114, B:46:0x011c, B:51:0x015e, B:52:0x0163), top: B:81:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114 A[Catch: Exception -> 0x0070, c -> 0x0074, CancellationException -> 0x0078, TryCatch #7 {c -> 0x0074, CancellationException -> 0x0078, Exception -> 0x0070, blocks: (B:25:0x006c, B:38:0x00b7, B:40:0x00c1, B:44:0x0114, B:46:0x011c, B:51:0x015e, B:52:0x0163), top: B:81:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[Catch: Exception -> 0x0070, c -> 0x0074, CancellationException -> 0x0078, TRY_LEAVE, TryCatch #7 {c -> 0x0074, CancellationException -> 0x0078, Exception -> 0x0070, blocks: (B:25:0x006c, B:38:0x00b7, B:40:0x00c1, B:44:0x0114, B:46:0x011c, B:51:0x015e, B:52:0x0163), top: B:81:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015e A[Catch: Exception -> 0x0070, c -> 0x0074, CancellationException -> 0x0078, TRY_ENTER, TryCatch #7 {c -> 0x0074, CancellationException -> 0x0078, Exception -> 0x0070, blocks: (B:25:0x006c, B:38:0x00b7, B:40:0x00c1, B:44:0x0114, B:46:0x011c, B:51:0x015e, B:52:0x0163), top: B:81:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0153, code lost:
    
        if (r6.F(r8, r2) == r3) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [ae3.q] */
    /* JADX WARN: Type inference failed for: r18v0, types: [we3.p] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [tq.e, we3.p$c] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [xw.b] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D9(tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we3.p.D9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final p pVar, v vVar) {
        vVar.c(q0.c(we3.b.class), new er.l() { // from class: we3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.G9(this.f212845a, (z) obj);
            }
        });
        vVar.c(q0.c(we3.b.C5623b.class), new er.l() { // from class: we3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.H9(this.f212846a, (z) obj);
            }
        });
        vVar.c(q0.c(we3.b.Initialized.class), new er.l() { // from class: we3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.I9(this.f212847a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(p pVar, z zVar) {
        e eVar = pVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(we3.a.C5620a.class), oVar, eVar);
        zVar.x(q0.c(we3.a.e.class), oVar, pVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(p pVar, z zVar) {
        zVar.A(pVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(p pVar, z zVar) {
        h hVar = pVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(we3.a.OnPhotoClick.class), oVar, hVar);
        zVar.x(q0.c(we3.a.c.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:22:0x010c  */
    /* JADX WARN: Code duplicated, block: B:25:0x011e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0137  */
    /* JADX WARN: Code duplicated, block: B:29:0x0140  */
    /* JADX WARN: Code duplicated, block: B:31:0x014e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0152  */
    /* JADX WARN: Code duplicated, block: B:36:0x019a  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0140 -> B:30:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x019a -> B:37:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x9(k10.c0<we3.b.C5623b> r19, tq.e<? super k10.l<? extends we3.b>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we3.p.x9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final we3.b.Initialized y9(p pVar, List list, we3.b.C5623b c5623b) {
        return new we3.b.Initialized(pVar.setupData, list);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PhotosDetailsSetupData photosDetailsSetupData) {
        super.P5(photosDetailsSetupData);
    }

    @Override // zx.b
    public xw.b<we3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<we3.b, we3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<we3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(we3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
