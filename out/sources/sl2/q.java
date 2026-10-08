package sl2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import pl2.EntryDetailsData;
import sq0.BENationalCourtRegisterEntry;
import sq0.BESubscription;
import ul2.ContentModel;
import xi0.ContactDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0001\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0019\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$*\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030F8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010X\u001a\b\u0012\u0004\u0012\u00020(0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lsl2/q;", "Ll00/g;", "Lsl2/b;", "Lsl2/a;", "Lsl2/c;", "", "Lyy/a;", "stateMachineFactory", "Lez/a;", "currentTimeProvider", "Ltl2/c;", "mapper", "Lj14/a;", "checkEmailCorrectUC", "Lac4/a;", "loaderUseCase", "Lfj0/g;", "getContactDetailsUseCase", "Lml2/f;", "sendSubscriptionUC", "callActionWithLoaderUC", "Lib4/c;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lmx/c;", "labelProvider", "Li70/e;", "globalSnackBarManager", "Lcb4/j;", "dialogVMSFactory", "Lpl2/a;", "entry", "<init>", "(Lyy/a;Lez/a;Ltl2/c;Lj14/a;Lac4/a;Lfj0/g;Lml2/f;Lac4/a;Lib4/c;Lhb4/d;Lmx/c;Li70/e;Lcb4/j;Lpl2/a;)V", "Lul2/a;", "", "Lsq0/a;", "B9", "(Lul2/a;)Ljava/util/List;", "Lsl2/c$a;", "C9", "(Lsl2/b;)Lsl2/c$a;", "b", "Ltl2/c;", "c", "Lj14/a;", "d", "Lac4/a;", "e", "Lfj0/g;", "f", "Lml2/f;", "g", "h", "Lib4/c;", "j", "Lhb4/d;", "k", "Lmx/c;", "l", "Li70/e;", "m", "Lcb4/j;", "n", "Lpl2/a;", "Lsl2/b$a;", "p", "Lsl2/b$a;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsl2/a$b;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<sl2.b, sl2.a> implements sl2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fj0.g getContactDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ml2.f sendSubscriptionUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EntryDetailsData entry;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final sl2.b.Content initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sl2.b, sl2.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sl2.a.b> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<sl2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sl2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f182276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f182277b;

        /* JADX INFO: renamed from: sl2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4697a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f182278a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f182279b;

            /* JADX INFO: renamed from: sl2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4698a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f182280d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f182281e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f182282f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f182284h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f182285j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f182286k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f182287l;

                public C4698a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f182280d = obj;
                    this.f182281e |= PKIFailureInfo.systemUnavail;
                    return C4697a.this.F(null, this);
                }
            }

            public C4697a(mu.h hVar, q qVar) {
                this.f182278a = hVar;
                this.f182279b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4698a c4698a;
                if (eVar instanceof C4698a) {
                    c4698a = (C4698a) eVar;
                    int i15 = c4698a.f182281e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4698a.f182281e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4698a = new C4698a(eVar);
                    }
                } else {
                    c4698a = new C4698a(eVar);
                }
                Object obj2 = c4698a.f182280d;
                Object objE = uq.b.e();
                int i16 = c4698a.f182281e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f182278a;
                    sl2.c.a aVarC9 = this.f182279b.C9((sl2.b) obj);
                    c4698a.f182282f = vq.j.a(obj);
                    c4698a.f182284h = vq.j.a(c4698a);
                    c4698a.f182285j = vq.j.a(obj);
                    c4698a.f182286k = vq.j.a(hVar);
                    c4698a.f182287l = 0;
                    c4698a.f182281e = 1;
                    if (hVar.F(aVarC9, c4698a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f182276a = gVar;
            this.f182277b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sl2.c.a> hVar, tq.e eVar) {
            Object objA = this.f182276a.a(new C4697a(hVar, this.f182277b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsl2/a$b;", "action", "Lsl2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsl2/a$b;Lsl2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<sl2.a.b, sl2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182289f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sl2.a.b bVar = (sl2.a.b) this.f182289f;
            Object objE = uq.b.e();
            int i15 = this.f182288e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sl2.a.b> bVarY1 = q.this.Y1();
                this.f182289f = vq.j.a(bVar);
                this.f182288e = 1;
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
        public final Object w(sl2.a.b bVar, sl2.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = q.this.new b(eVar);
            bVar3.f182289f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$d;", "<unused var>", "Lk10/c0;", "Lsl2/b$a;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sl2.a.d, k10.c0<sl2.b.Content>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182292f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content O(sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, !content.getData().getSelectedNotificationsInApp(), false, null, null, null, null, null, null, 509, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f182292f;
            uq.b.e();
            if (this.f182291e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sl2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O((b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.d dVar, k10.c0<sl2.b.Content> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            c cVar = new c(eVar);
            cVar.f182292f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$c;", "<unused var>", "Lk10/c0;", "Lsl2/b$a;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sl2.a.c, k10.c0<sl2.b.Content>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f182294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f182295g;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.k implements er.l<tq.e<? super String>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f182297e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f182298f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f182298f = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                iy.b0 registeredEmail;
                String strE;
                Object objE = uq.b.e();
                int i15 = this.f182297e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    fj0.g gVar = this.f182298f.getContactDetailsUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f182297e = 1;
                    obj = gVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                ContactDetails contactDetails = (ContactDetails) ((dx.i) obj).a();
                return (contactDetails == null || (registeredEmail = contactDetails.getRegisteredEmail()) == null || (strE = iy.c0.e(registeredEmail)) == null) ? "" : strE;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f182298f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super String> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content V(String str, sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, false, true, null, null, null, str, null, null, 443, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content X(boolean z15, sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, false, z15, null, null, null, null, null, null, 507, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f182295g;
            Object objE = uq.b.e();
            int i15 = this.f182294f;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean selectedNotificationsByEmail = ((sl2.b.Content) c0Var.a()).getData().getSelectedNotificationsByEmail();
                final boolean z15 = !selectedNotificationsByEmail;
                if (((sl2.b.Content) c0Var.a()).getData().getEmail() != null || selectedNotificationsByEmail) {
                    return c0Var.d(new er.l() { // from class: sl2.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.d.X(z15, (b.Content) obj2);
                        }
                    });
                }
                ac4.a aVar = q.this.loaderUseCase;
                a aVar2 = new a(q.this, null);
                this.f182295g = c0Var;
                this.f182293e = z15 ? 1 : 0;
                this.f182294f = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final String str = (String) obj;
            return c0Var.d(new er.l() { // from class: sl2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.V(str, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.c cVar, k10.c0<sl2.b.Content> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f182295g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$g;", "action", "Lk10/c0;", "Lsl2/b$a;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sl2.a.OnEmailChanged, k10.c0<sl2.b.Content>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f182301g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content O(sl2.a.OnEmailChanged onEmailChanged, sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, false, false, null, null, null, onEmailChanged.getEmail(), hz.b.C2039b.f86846c, null, 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sl2.a.OnEmailChanged onEmailChanged = (sl2.a.OnEmailChanged) this.f182300f;
            k10.c0 c0Var = (k10.c0) this.f182301g;
            uq.b.e();
            if (this.f182299e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sl2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(onEmailChanged, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.OnEmailChanged onEmailChanged, k10.c0<sl2.b.Content> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f182300f = onEmailChanged;
            eVar2.f182301g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsl2/a$f;", "<unused var>", "Lsl2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lsl2/a$f;Lsl2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sl2.a.f, sl2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182303f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(q qVar, fz.b.LocalDate localDate) {
            qVar.d9(new sl2.a.OnDateChanged(localDate));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sl2.b.Content content = (sl2.b.Content) this.f182303f;
            uq.b.e();
            if (this.f182302e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q qVar = q.this;
            fz.b.LocalDate selectedDate = content.getData().getSelectedDate();
            fz.b.LocalDate minDate = content.getData().getMinDate();
            fz.b.LocalDate maxDate = content.getData().getMaxDate();
            final q qVar2 = q.this;
            qVar.d9(new sl2.a.b.ShowDatePicker(selectedDate, minDate, maxDate, new er.l() { // from class: sl2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(qVar2, (fz.b.LocalDate) obj2);
                }
            }));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.f fVar, sl2.b.Content content, tq.e<? super i0> eVar) {
            f fVar2 = q.this.new f(eVar);
            fVar2.f182303f = content;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$e;", "action", "Lk10/c0;", "Lsl2/b$a;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sl2.a.OnDateChanged, k10.c0<sl2.b.Content>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f182307g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content O(sl2.a.OnDateChanged onDateChanged, sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, false, false, onDateChanged.getDate(), null, null, null, null, null, 503, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sl2.a.OnDateChanged onDateChanged = (sl2.a.OnDateChanged) this.f182306f;
            k10.c0 c0Var = (k10.c0) this.f182307g;
            uq.b.e();
            if (this.f182305e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sl2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(onDateChanged, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.OnDateChanged onDateChanged, k10.c0<sl2.b.Content> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f182306f = onDateChanged;
            gVar.f182307g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$h;", "<unused var>", "Lk10/c0;", "Lsl2/b$a;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sl2.a.h, k10.c0<sl2.b.Content>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f182308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f182309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f182310g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Saving X(sl2.b.Content content) {
            return new sl2.b.Saving(content.getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Saving Y(sl2.b.Content content) {
            return new sl2.b.Saving(content.getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content Z(hz.g gVar, sl2.b.Content content) {
            return content.a(ContentModel.b(content.getData(), null, false, false, null, null, null, null, gVar.a(), new d60.j(ul2.b.f198968a), CertificateBody.profileType, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f182310g;
            Object objE = uq.b.e();
            int i15 = this.f182309f;
            if (i15 == 0) {
                oq.u.b(obj);
                ContentModel data = ((sl2.b.Content) c0Var.a()).getData();
                if (!data.getSelectedNotificationsByEmail()) {
                    return c0Var.d(new er.l() { // from class: sl2.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.h.X((b.Content) obj2);
                        }
                    });
                }
                j14.a aVar = q.this.checkEmailCorrectUC;
                String email = data.getEmail();
                if (email == null) {
                    email = "";
                }
                j14.a.Params params = new j14.a.Params(iy.c0.g(email), false, null, 6, null);
                this.f182310g = c0Var;
                this.f182308e = vq.j.a(data);
                this.f182309f = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            return gVar instanceof hz.g.b ? c0Var.d(new er.l() { // from class: sl2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.Y((b.Content) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: sl2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.Z(gVar, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.h hVar, k10.c0<sl2.b.Content> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            h hVar2 = q.this.new h(eVar);
            hVar2.f182310g = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsl2/b$d;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<sl2.b.Saving>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182313f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsl2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sl2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f182315e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f182316f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<sl2.b.Saving> f182317g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ q f182318h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<sl2.b.Saving> c0Var, q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f182317g = c0Var;
                this.f182318h = qVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sl2.b.Error X(ContentModel contentModel, final q qVar, dx.b bVar, sl2.b.Saving saving) {
                return new sl2.b.Error(contentModel, qVar.errorVMSFactory.a(qVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sl2.c0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.i.a.Y(qVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Y(q qVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    qVar.d9(sl2.a.i.f182220a);
                } else {
                    qVar.d9(sl2.a.b.C4693a.f182207a);
                }
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final ContentModel contentModel;
                Object objE = uq.b.e();
                int i15 = this.f182316f;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ContentModel data = this.f182317g.a().getData();
                    ml2.f fVar = this.f182318h.sendSubscriptionUC;
                    BENationalCourtRegisterEntry entry = data.getEntry().getEntry();
                    fz.b.LocalDate selectedDate = data.getSelectedDate();
                    List listB9 = this.f182318h.B9(data);
                    String email = data.getEmail();
                    if (!data.getSelectedNotificationsByEmail()) {
                        email = null;
                    }
                    ml2.f.Params params = new ml2.f.Params(entry, selectedDate, listB9, email);
                    this.f182315e = data;
                    this.f182316f = 1;
                    Object objG = fVar.g(params, this);
                    if (objG == objE) {
                        return objE;
                    }
                    contentModel = data;
                    obj = objG;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    contentModel = (ContentModel) this.f182315e;
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<sl2.b.Saving> c0Var = this.f182317g;
                final q qVar = this.f182318h;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: sl2.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.i.a.X(contentModel, qVar, bVar, (b.Saving) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                if (((ml2.f.b) ((dx.i.Right) iVar).b()) instanceof ml2.f.b.C3134b) {
                    qVar.globalSnackBarManager.y(new p50.a.Default(qVar.labelProvider.c(hl2.a.f85258c), false, null, 6, null));
                }
                qVar.d9(sl2.a.b.C4693a.f182207a);
                return c0Var.c();
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f182317g, this.f182318h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sl2.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Dialog O(q qVar, k10.c0 c0Var, sl2.b.Saving saving) {
            return new sl2.b.Dialog(saving.getData(), qVar.dialogVMSFactory.a(new DialogData(cb4.h.b.f24985a, qVar.labelProvider.c(hl2.a.f85278w), qVar.labelProvider.e(hl2.a.f85277v, Integer.valueOf(((sl2.b.Saving) c0Var.a()).getData().getEntry().getMaxNumberOfSubscriptionPerPesel())), new DialogButtonTextData(qVar.labelProvider.c(hl2.a.f85259d), null, qVar.b9(sl2.a.C4692a.f182206a), 2, null), null, null, null, 112, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f182313f;
            Object objE = uq.b.e();
            int i15 = this.f182312e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!((sl2.b.Saving) c0Var.a()).getData().getEntry().getCanAddSubscription() && ((sl2.b.Saving) c0Var.a()).getData().getEntry().getEntry().getSubscription() == null) {
                    final q qVar = q.this;
                    return c0Var.d(new er.l() { // from class: sl2.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.i.O(qVar, c0Var, (b.Saving) obj2);
                        }
                    });
                }
                ac4.a aVar = q.this.callActionWithLoaderUC;
                a aVar2 = new a(c0Var, q.this, null);
                this.f182313f = vq.j.a(c0Var);
                this.f182312e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sl2.b.Saving> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            return ((i) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f182313f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$i;", "<unused var>", "Lk10/c0;", "Lsl2/b$c;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sl2.a.i, k10.c0<sl2.b.Error>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182320f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Saving O(sl2.b.Error error) {
            return new sl2.b.Saving(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f182320f;
            uq.b.e();
            if (this.f182319e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sl2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.i iVar, k10.c0<sl2.b.Error> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f182320f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsl2/a$a;", "<unused var>", "Lk10/c0;", "Lsl2/b$b;", "state", "Lk10/l;", "Lsl2/b;", "<anonymous>", "(Lsl2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sl2.a.C4692a, k10.c0<sl2.b.Dialog>, tq.e<? super k10.l<? extends sl2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f182322f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sl2.b.Content O(sl2.b.Dialog dialog) {
            return new sl2.b.Content(dialog.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f182322f;
            uq.b.e();
            if (this.f182321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sl2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O((b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sl2.a.C4692a c4692a, k10.c0<sl2.b.Dialog> c0Var, tq.e<? super k10.l<? extends sl2.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f182322f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ez.a aVar2, tl2.c cVar, j14.a aVar3, ac4.a aVar4, fj0.g gVar, ml2.f fVar, ac4.a aVar5, ib4.c cVar2, hb4.d dVar, mx.c cVar3, i70.e eVar, cb4.j jVar, EntryDetailsData entryDetailsData) {
        fz.b.OffsetDateTime endDate;
        this.mapper = cVar;
        this.checkEmailCorrectUC = aVar3;
        this.loaderUseCase = aVar4;
        this.getContactDetailsUseCase = gVar;
        this.sendSubscriptionUC = fVar;
        this.callActionWithLoaderUC = aVar5;
        this.errorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.labelProvider = cVar3;
        this.globalSnackBarManager = eVar;
        this.dialogVMSFactory = jVar;
        this.entry = entryDetailsData;
        fz.b.LocalDate localDate = new fz.b.LocalDate(aVar2.c().plusDays(entryDetailsData.getMaxNumberOfDaysForSubscription()));
        boolean zH = entryDetailsData.getEntry().h();
        boolean zI = entryDetailsData.getEntry().i();
        BESubscription subscription = entryDetailsData.getEntry().getSubscription();
        fz.b.LocalDate localDateI = (subscription == null || (endDate = subscription.getEndDate()) == null || (localDateI = ez.d.i(endDate)) == null) ? localDate : localDateI;
        fz.b.LocalDate localDate2 = new fz.b.LocalDate(aVar2.c().plusDays(1L));
        BESubscription subscription2 = entryDetailsData.getEntry().getSubscription();
        sl2.b.Content content = new sl2.b.Content(new ContentModel(entryDetailsData, zH, zI, localDateI, localDate2, localDate, subscription2 != null ? subscription2.getEmail() : null, null, null, MLKEMEngine.KyberPolyBytes, null));
        this.initialState = content;
        this.stateMachine = aVar.a(content, new er.l() { // from class: sl2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9(this.f182259a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), C9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<sq0.a> B9(ContentModel contentModel) {
        ArrayList arrayList = new ArrayList();
        if (contentModel.getSelectedNotificationsInApp()) {
            arrayList.add(sq0.a.MOBYWATEL);
        }
        if (contentModel.getSelectedNotificationsByEmail()) {
            arrayList.add(sq0.a.EMAIL);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sl2.c.a C9(sl2.b bVar) {
        return this.mapper.b(new tl2.c.Params(bVar, b9(sl2.a.d.f182214a), b9(sl2.a.c.f182213a), b9(sl2.a.f.f182217a), new er.l() { // from class: sl2.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f182255a, (String) obj);
            }
        }, b9(sl2.a.h.f182219a), b9(sl2.a.b.C4693a.f182207a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, String str) {
        qVar.d9(new sl2.a.OnEmailChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(sl2.b.class), new er.l() { // from class: sl2.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.G9(this.f182256a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sl2.b.Content.class), new er.l() { // from class: sl2.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.H9(this.f182257a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sl2.b.Saving.class), new er.l() { // from class: sl2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.I9(this.f182258a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sl2.b.Error.class), new er.l() { // from class: sl2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.J9((k10.z) obj);
            }
        });
        vVar.c(q0.c(sl2.b.Dialog.class), new er.l() { // from class: sl2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.K9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(q qVar, k10.z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(sl2.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(q qVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sl2.a.d.class), oVar, cVar);
        zVar.v(q0.c(sl2.a.c.class), oVar, qVar.new d(null));
        zVar.v(q0.c(sl2.a.OnEmailChanged.class), oVar, new e(null));
        zVar.x(q0.c(sl2.a.f.class), oVar, qVar.new f(null));
        zVar.v(q0.c(sl2.a.OnDateChanged.class), oVar, new g(null));
        zVar.v(q0.c(sl2.a.h.class), oVar, qVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(q qVar, k10.z zVar) {
        zVar.A(qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(q0.c(sl2.a.i.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(k10.z zVar) {
        k kVar = new k(null);
        zVar.v(q0.c(sl2.a.C4692a.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(EntryDetailsData entryDetailsData) {
        super.P5(entryDetailsData);
    }

    @Override // zx.b
    public xw.b<sl2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sl2.b, sl2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sl2.c.a> getState() {
        return this.state;
    }
}
