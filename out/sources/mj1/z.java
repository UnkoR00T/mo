package mj1;

import android.text.TextUtils;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import xw.PhoneNumber;
import zp0.BERegisterForDefenceTraining;
import zp0.BEUserRegisteredDefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B{\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020$*\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J+\u0010.\u001a\b\u0012\u0004\u0012\u00020$0-2\u0006\u0010*\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0+H\u0002¢\u0006\u0004\b.\u0010/J1\u00103\u001a\b\u0012\u0004\u0012\u00020$0-2\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0+H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b:\u00109J\u0017\u0010;\u001a\u0002072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b;\u00109J\u0017\u0010=\u001a\u00020<2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u0004\u0018\u00010@*\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u0002072\u0006\u0010C\u001a\u00020 H\u0016¢\u0006\u0004\bD\u0010EJ\u0018\u0010H\u001a\u0002072\u0006\u0010G\u001a\u00020FH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000207H\u0096\u0001¢\u0006\u0004\bJ\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010o\u001a\b\u0012\u0004\u0012\u00020j0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030p8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR \u0010,\u001a\b\u0012\u0004\u0012\u00020<0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020|0{8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010}¨\u0006\u007f"}, d2 = {"Lmj1/z;", "Ll00/g;", "Lmj1/c;", "Lmj1/a;", "Lmj1/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lnj1/f;", "mapper", "Lui0/a;", "contactDetailsDownloadManager", "Lwi1/a;", "downloadContactDetailsDataUC", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "loaderUseCase", "Lwi1/e;", "registerForDefenceTrainingUC", "Lmx/c;", "labelProvider", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lmj1/b;", "setupData", "<init>", "(Lyy/a;Lnj1/f;Lui0/a;Lwi1/a;Lj14/n;Lj14/a;Lhb4/d;Lib4/c;Lac4/a;Lwi1/e;Lmx/c;La14/w;Li70/n;Lmj1/b;)V", "Lmj1/c$a;", "H9", "()Lmj1/c$a;", "ba", "(Lmj1/c$a;Ltq/e;)Ljava/lang/Object;", "Lxi0/e;", "contactDetails", "Lk10/c0;", "state", "Lk10/l;", "S9", "(Lxi0/e;Lk10/c0;)Lk10/l;", "", "Lvi1/a;", "children", "Q9", "(Ljava/util/List;Lk10/c0;)Lk10/l;", "Lmj1/g;", "fields", "Loq/i0;", "N9", "(Lmj1/g;)V", "P9", "O9", "Lmj1/d$a;", "J9", "(Lmj1/c;)Lmj1/d$a;", "Ldx/b;", "Ljb4/f;", "I9", "(Ldx/b;)Ljb4/f;", "data", "U9", "(Lmj1/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lnj1/f;", "c", "Lui0/a;", "d", "Lwi1/a;", "e", "Lj14/n;", "f", "Lj14/a;", "g", "Lhb4/d;", "h", "Lib4/c;", "j", "Lac4/a;", "k", "Lwi1/e;", "l", "Lmx/c;", "m", "La14/w;", "n", "Li70/n;", "p", "Lmj1/b;", "q", "Lmj1/c$a;", "initialState", "Lxw/b;", "Lmj1/a$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<mj1.c, mj1.a> implements mj1.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nj1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wi1.a downloadContactDetailsDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wi1.e registerForDefenceTrainingUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mj1.c.a initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mj1.a.e> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mj1.c, mj1.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<mj1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<mj1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f126844b;

        /* JADX INFO: renamed from: mj1.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3127a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f126846b;

            /* JADX INFO: renamed from: mj1.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3128a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126847d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126848e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126849f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126851h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126852j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126853k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126854l;

                public C3128a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126847d = obj;
                    this.f126848e |= PKIFailureInfo.systemUnavail;
                    return C3127a.this.F(null, this);
                }
            }

            public C3127a(mu.h hVar, z zVar) {
                this.f126845a = hVar;
                this.f126846b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3128a c3128a;
                if (eVar instanceof C3128a) {
                    c3128a = (C3128a) eVar;
                    int i15 = c3128a.f126848e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3128a.f126848e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3128a = new C3128a(eVar);
                    }
                } else {
                    c3128a = new C3128a(eVar);
                }
                Object obj2 = c3128a.f126847d;
                Object objE = uq.b.e();
                int i16 = c3128a.f126848e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f126845a;
                    mj1.d.a aVarJ9 = this.f126846b.J9((mj1.c) obj);
                    c3128a.f126849f = vq.j.a(obj);
                    c3128a.f126851h = vq.j.a(c3128a);
                    c3128a.f126852j = vq.j.a(obj);
                    c3128a.f126853k = vq.j.a(hVar);
                    c3128a.f126854l = 0;
                    c3128a.f126848e = 1;
                    if (hVar.F(aVarJ9, c3128a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f126843a = gVar;
            this.f126844b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mj1.d.a> hVar, tq.e eVar) {
            Object objA = this.f126843a.a(new C3127a(hVar, this.f126844b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmj1/a$e;", "action", "Lmj1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmj1/a$e;Lmj1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<mj1.a.e, mj1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126856f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.e eVar = (mj1.a.e) this.f126856f;
            Object objE = uq.b.e();
            int i15 = this.f126855e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mj1.a.e> bVarY1 = z.this.Y1();
                this.f126856f = vq.j.a(eVar);
                this.f126855e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(mj1.a.e eVar, mj1.c cVar, tq.e<? super oq.i0> eVar2) {
            b bVar = z.this.new b(eVar2);
            bVar.f126856f = eVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmj1/a$j;", "action", "Lmj1/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmj1/a$j;Lmj1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<mj1.a.OpenUrl, mj1.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126859f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.OpenUrl openUrl = (mj1.a.OpenUrl) this.f126859f;
            Object objE = uq.b.e();
            int i15 = this.f126858e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = z.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f126859f = vq.j.a(openUrl);
                this.f126858e = 1;
                obj = wVar.c(params, this);
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
            z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                zVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.OpenUrl openUrl, mj1.c.a aVar, tq.e<? super oq.i0> eVar) {
            c cVar = z.this.new c(eVar);
            cVar.f126859f = openUrl;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$g;", "action", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<mj1.a.OnChildrenFetched, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126863g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.OnChildrenFetched onChildrenFetched = (mj1.a.OnChildrenFetched) this.f126862f;
            k10.c0 c0Var = (k10.c0) this.f126863g;
            uq.b.e();
            if (this.f126861e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return z.this.Q9(onChildrenFetched.a(), c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.OnChildrenFetched onChildrenFetched, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            d dVar = z.this.new d(eVar);
            dVar.f126862f = onChildrenFetched;
            dVar.f126863g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$h;", "action", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mj1.a.OnContactDetailsFetched, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126867g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.OnContactDetailsFetched onContactDetailsFetched = (mj1.a.OnContactDetailsFetched) this.f126866f;
            k10.c0 c0Var = (k10.c0) this.f126867g;
            uq.b.e();
            if (this.f126865e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return z.this.S9(onContactDetailsFetched.getContactDetails(), c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.OnContactDetailsFetched onContactDetailsFetched, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f126866f = onContactDetailsFetched;
            eVar2.f126867g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$m;", "<unused var>", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mj1.a.m, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126870f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a O(List list, mj1.c.a aVar) {
            return aVar.a(ContactDetailsFields.b(aVar.getFields(), null, null, null, null, list, 15, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126870f;
            uq.b.e();
            if (this.f126869e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List<ChildParticipant> children = z.this.setupData.getContract().getChildren();
            if (children == null) {
                return c0Var.c();
            }
            px.f.f163100a.b("Updating children from contract", px.c.a(z.this));
            return c0Var.b(new er.l() { // from class: mj1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.O(children, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.m mVar, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f126870f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$k;", "action", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mj1.a.RemoveSelectedChild, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126874g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a O(ContactDetailsFields contactDetailsFields, mj1.c.a aVar) {
            return aVar.a(contactDetailsFields);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.RemoveSelectedChild removeSelectedChild = (mj1.a.RemoveSelectedChild) this.f126873f;
            k10.c0 c0Var = (k10.c0) this.f126874g;
            uq.b.e();
            if (this.f126872e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List listI1 = pq.v.i1(((mj1.c.a) c0Var.a()).getFields().d());
            int index = removeSelectedChild.getIndex();
            if (index < 0 || index >= listI1.size()) {
                return c0Var.c();
            }
            ChildParticipant childParticipant = (ChildParticipant) listI1.get(index);
            if (childParticipant.getIsAddedManually()) {
                vq.b.a(listI1.remove(childParticipant));
            } else {
                listI1.set(removeSelectedChild.getIndex(), ChildParticipant.b(childParticipant, null, null, null, false, false, false, 47, null));
            }
            final ContactDetailsFields contactDetailsFieldsB = ContactDetailsFields.b(((mj1.c.a) c0Var.a()).getFields(), null, null, null, null, listI1, 15, null);
            z.this.O9(contactDetailsFieldsB);
            return c0Var.b(new er.l() { // from class: mj1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(contactDetailsFieldsB, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.RemoveSelectedChild removeSelectedChild, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f126873f = removeSelectedChild;
            gVar.f126874g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$c;", "action", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mj1.a.EditFields, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126878g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a O(mj1.a.EditFields editFields, mj1.c.a aVar) {
            return aVar.a(editFields.getFields());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mj1.a.EditFields editFields = (mj1.a.EditFields) this.f126877f;
            k10.c0 c0Var = (k10.c0) this.f126878g;
            uq.b.e();
            if (this.f126876e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.N9(editFields.getFields());
            return c0Var.b(new er.l() { // from class: mj1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.O(editFields, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.EditFields editFields, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f126877f = editFields;
            hVar.f126878g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$a;", "<unused var>", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mj1.a.C3121a, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126881f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a O(mj1.c.a aVar) {
            return aVar.a(ContactDetailsFields.b(aVar.getFields(), null, null, null, null, null, 23, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126881f;
            uq.b.e();
            if (this.f126880e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(mj1.a.e.c.f126736a);
            return c0Var.b(new er.l() { // from class: mj1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O((c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.C3121a c3121a, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f126881f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$f;", "<unused var>", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mj1.a.f, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126884f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a V(mj1.c.a aVar, mj1.c.a aVar2) {
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a X(mj1.c.a aVar, mj1.c.a aVar2) {
            return aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126884f;
            Object objE = uq.b.e();
            int i15 = this.f126883e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                mj1.c.a aVar = (mj1.c.a) c0Var.a();
                this.f126884f = c0Var;
                this.f126883e = 1;
                obj = zVar.ba(aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final mj1.c.a aVar2 = (mj1.c.a) obj;
            if (!aVar2.getFields().j()) {
                return c0Var.b(new er.l() { // from class: mj1.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.j.V(aVar2, (c.a) obj2);
                    }
                });
            }
            z.this.d9(mj1.a.l.f126744a);
            return c0Var.b(new er.l() { // from class: mj1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.j.X(aVar2, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.f fVar, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f126884f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$l;", "<unused var>", "Lk10/c0;", "Lmj1/c$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mj1.a.l, k10.c0<mj1.c.a>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f126886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f126887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f126888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f126889h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f126890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f126891k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f126892l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f126893m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126894n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f126895p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzp0/u;", "<anonymous>", "()Lzp0/u;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super BEUserRegisteredDefenceTraining>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f126897e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f126898f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ex.b<dx.b> f126899g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ z f126900h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<mj1.c.a> f126901j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ex.b<? super dx.b> bVar, z zVar, k10.c0<mj1.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f126899g = bVar;
                this.f126900h = zVar;
                this.f126901j = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                ex.b<dx.b> bVar;
                Object objE = uq.b.e();
                int i15 = this.f126898f;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ex.b<dx.b> bVar2 = this.f126899g;
                    wi1.e eVar = this.f126900h.registerForDefenceTrainingUC;
                    int iIntValue = ((Number) this.f126899g.a(this.f126900h.setupData.getContract().V5())).intValue();
                    iy.b0 value = this.f126901j.a().getFields().getEmail().getValue();
                    PhoneNumber value2 = this.f126901j.a().getFields().getPhoneNumber().getValue();
                    List<ChildParticipant> listD = this.f126901j.a().getFields().d();
                    ArrayList<ChildParticipant> arrayList = new ArrayList();
                    for (Object obj2 : listD) {
                        if (((ChildParticipant) obj2).getIsSelected()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
                    for (ChildParticipant childParticipant : arrayList) {
                        arrayList2.add(new BERegisterForDefenceTraining.BEChildParticipant(childParticipant.getFirstName(), childParticipant.getLastName(), childParticipant.getPesel(), null));
                    }
                    wi1.e.Params params = new wi1.e.Params(new BERegisterForDefenceTraining(iIntValue, value, value2, arrayList2));
                    this.f126897e = bVar2;
                    this.f126898f = 1;
                    Object objE2 = eVar.e(params, this);
                    if (objE2 == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                    obj = objE2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) this.f126897e;
                    oq.u.b(obj);
                }
                return bVar.a((dx.i) obj);
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f126899g, this.f126900h, this.f126901j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super BEUserRegisteredDefenceTraining> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.Error V(final z zVar, dx.b bVar, final String str, mj1.c.a aVar) {
            return new mj1.c.Error(zVar.errorVMSFactory.a(zVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: mj1.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return z.k.X(zVar, str, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(z zVar, String str, ib4.c.b bVar) {
            zVar.d9(new mj1.a.HandleErrorAction(str));
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00be  */
        /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:62:0x012e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [dx.j, java.lang.Object] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Exception exc;
            ?? r15;
            String message;
            dx.i iVarA;
            Object objB;
            dx.i left;
            ex.c cVar;
            k10.c0 c0Var = (k10.c0) this.f126895p;
            Object objE = uq.b.e();
            ?? A = this.f126894n;
            try {
                try {
                    if (A == 0) {
                        oq.u.b(obj);
                        z.this.N9(((mj1.c.a) c0Var.a()).getFields());
                        z zVar = z.this;
                        A = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            ac4.a aVar2 = zVar.loaderUseCase;
                            a aVar3 = new a(aVar, zVar, c0Var, null);
                            this.f126895p = c0Var;
                            this.f126886e = A;
                            this.f126887f = vq.j.a(aVar);
                            this.f126888g = vq.j.a(aVar);
                            this.f126889h = 0;
                            this.f126890j = 0;
                            this.f126891k = 0;
                            this.f126892l = 0;
                            this.f126893m = 0;
                            this.f126894n = 1;
                            this = this;
                            try {
                                obj = ac4.a.a(aVar2, null, aVar3, this, 1, null);
                                if (obj == objE) {
                                    return objE;
                                }
                            } catch (ex.c e15) {
                                e = e15;
                                cVar = e;
                                left = new dx.i.Left((dx.b) ex.d.a(cVar));
                            } catch (CancellationException e16) {
                                e = e16;
                                throw e;
                            }
                        } catch (ex.c e17) {
                            e = e17;
                            this = this;
                            cVar = e;
                            left = new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e18) {
                            e = e18;
                            throw e;
                        } catch (Exception e19) {
                            e = e19;
                            exc = e;
                            r15 = A;
                            px.f fVar = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    } else {
                        if (A != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dx.j jVar = (dx.j) this.f126886e;
                        try {
                            oq.u.b(obj);
                            this = this;
                        } catch (ex.c e25) {
                            cVar = e25;
                            this = this;
                            left = new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e26) {
                            throw e26;
                        } catch (Exception e27) {
                            exc = e27;
                            r15 = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                        }
                    }
                    left = new dx.i.Right((BEUserRegisteredDefenceTraining) obj);
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
            final z zVar2 = z.this;
            if (left instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) left).b();
                PayloadErrorData payloadErrorDataI9 = zVar2.I9(bVar);
                final String code = payloadErrorDataI9 != null ? payloadErrorDataI9.getCode() : null;
                return c0Var.d(new er.l() { // from class: mj1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.k.V(zVar2, bVar, code, (c.a) obj2);
                    }
                });
            }
            if (!(left instanceof dx.i.Right)) {
                throw new oq.p();
            }
            zVar2.d9(new mj1.a.e.GoToSuccess((BEUserRegisteredDefenceTraining) ((dx.i.Right) left).b()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.l lVar, k10.c0<mj1.c.a> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f126895p = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmj1/a$b;", "<unused var>", "Lmj1/c$a;", "Loq/i0;", "<anonymous>", "(Lmj1/a$b;Lmj1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<mj1.a.b, mj1.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126902e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f126902e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(mj1.a.e.b.f126735a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.b bVar, mj1.c.a aVar, tq.e<? super oq.i0> eVar) {
            return z.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwi1/a$b;", "event", "Lk10/c0;", "Lmj1/c$a$a;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lwi1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<wi1.a.b, k10.c0<mj1.c.a.Loading>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126906g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a.NotLoading O(mj1.c.a.Loading loading) {
            return new mj1.c.a.NotLoading(loading.getFields());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wi1.a.b bVar = (wi1.a.b) this.f126905f;
            k10.c0 c0Var = (k10.c0) this.f126906g;
            uq.b.e();
            if (this.f126904e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            px.f.f163100a.b("Collected event: " + bVar, px.c.a(z.this));
            if (bVar instanceof wi1.a.b.Children) {
                z.this.d9(new mj1.a.OnChildrenFetched(((wi1.a.b.Children) bVar).a()));
                return c0Var.c();
            }
            if (bVar instanceof wi1.a.b.RdkData) {
                z.this.d9(new mj1.a.OnContactDetailsFetched(((wi1.a.b.RdkData) bVar).getRdkContactDetails()));
                return c0Var.c();
            }
            if (fr.t.c(bVar, wi1.a.b.C5643b.f213585a)) {
                return c0Var.d(new er.l() { // from class: mj1.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.m.O((c.a.Loading) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wi1.a.b bVar, k10.c0<mj1.c.a.Loading> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f126905f = bVar;
            mVar.f126906g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmj1/a;", "action", "Lmj1/c$a$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmj1/a;Lmj1/c$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<mj1.a, mj1.c.a.Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126909f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a aVar = (mj1.a) this.f126909f;
            Object objE = uq.b.e();
            int i15 = this.f126908e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!(aVar instanceof mj1.a.OnContactDetailsFetched) && !(aVar instanceof mj1.a.OnChildrenFetched)) {
                    px.f.f163100a.b("Cancelling download by " + aVar, px.c.a(z.this));
                    ui0.a aVar2 = z.this.contactDetailsDownloadManager;
                    this.f126909f = vq.j.a(aVar);
                    this.f126908e = 1;
                    if (aVar2.a(this) == objE) {
                        return objE;
                    }
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
        public final Object w(mj1.a aVar, mj1.c.a.Loading loading, tq.e<? super oq.i0> eVar) {
            n nVar = z.this.new n(eVar);
            nVar.f126909f = aVar;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmj1/a$d;", "action", "Lk10/c0;", "Lmj1/c$b;", "state", "Lk10/l;", "Lmj1/c;", "<anonymous>", "(Lmj1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<mj1.a.HandleErrorAction, k10.c0<mj1.c.Error>, tq.e<? super k10.l<? extends mj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126913g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mj1.c.a O(z zVar, mj1.c.Error error) {
            return zVar.H9();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mj1.a.HandleErrorAction handleErrorAction = (mj1.a.HandleErrorAction) this.f126912f;
            k10.c0 c0Var = (k10.c0) this.f126913g;
            uq.b.e();
            if (this.f126911e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(handleErrorAction.getBusinessCode(), "DEFENCE_TRAINING_REJECTED")) {
                z.this.d9(mj1.a.e.b.f126735a);
                return c0Var.c();
            }
            final z zVar = z.this;
            return c0Var.d(new er.l() { // from class: mj1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O(zVar, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mj1.a.HandleErrorAction handleErrorAction, k10.c0<mj1.c.Error> c0Var, tq.e<? super k10.l<? extends mj1.c>> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f126912f = handleErrorAction;
            oVar.f126913g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f126915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f126916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f126917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f126918g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f126919h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f126920j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f126921k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f126923m;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f126921k = obj;
            this.f126923m |= PKIFailureInfo.systemUnavail;
            return z.this.ba(null, this);
        }
    }

    public z(yy.a aVar, nj1.f fVar, ui0.a aVar2, wi1.a aVar3, j14.n nVar, j14.a aVar4, hb4.d dVar, ib4.c cVar, ac4.a aVar5, wi1.e eVar, mx.c cVar2, a14.w wVar, i70.n nVar2, SetupData setupData) {
        this.mapper = fVar;
        this.contactDetailsDownloadManager = aVar2;
        this.downloadContactDetailsDataUC = aVar3;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar4;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.loaderUseCase = aVar5;
        this.registerForDefenceTrainingUC = eVar;
        this.labelProvider = cVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar2;
        this.setupData = setupData;
        mj1.c.a aVarH9 = H9();
        this.initialState = aVarH9;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVarH9, new er.l() { // from class: mj1.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.V9(this.f126814a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), J9(aVarH9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mj1.c.a H9() {
        ContactDetailsData contactDetailsDataZ0 = this.setupData.getContract().z0();
        List<ChildParticipant> children = this.setupData.getContract().getChildren();
        if (contactDetailsDataZ0 != null && children != null) {
            return new mj1.c.a.NotLoading(new ContactDetailsFields(new ContactDetailsFields.a.EmailTextInput(null, contactDetailsDataZ0.getEmail(), 1, null), new ContactDetailsFields.a.PhoneNumberInput(null, null, contactDetailsDataZ0.getPhoneNumber(), 3, null), null, null, children, 12, null));
        }
        if (contactDetailsDataZ0 != null) {
            return new mj1.c.a.Loading(false, true, new ContactDetailsFields(new ContactDetailsFields.a.EmailTextInput(null, contactDetailsDataZ0.getEmail(), 1, null), new ContactDetailsFields.a.PhoneNumberInput(null, null, contactDetailsDataZ0.getPhoneNumber(), 3, null), null, null, null, 28, null));
        }
        return children != null ? new mj1.c.a.Loading(true, false, new ContactDetailsFields(null, null, null, null, children, 15, null)) : new mj1.c.a.Loading(true, true, new ContactDetailsFields(null, null, null, null, null, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData I9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mj1.d.a J9(mj1.c state) {
        return this.mapper.b(new nj1.f.Params(state, b9(mj1.a.e.C3122a.f126734a), b9(mj1.a.C3121a.f126730a), b9(mj1.a.f.f126738a), b9(mj1.a.i.f126741a), new er.l() { // from class: mj1.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.K9(this.f126813a, (ContactDetailsFields) obj);
            }
        }, b9(mj1.a.b.f126731a), new er.l() { // from class: mj1.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f126815a, (String) obj);
            }
        }, new er.l() { // from class: mj1.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9(this.f126816a, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(z zVar, ContactDetailsFields contactDetailsFields) {
        zVar.d9(new mj1.a.EditFields(contactDetailsFields));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(z zVar, String str) {
        zVar.d9(new mj1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(z zVar, int i15) {
        zVar.d9(new mj1.a.RemoveSelectedChild(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N9(ContactDetailsFields fields) {
        P9(fields);
        O9(fields);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9(ContactDetailsFields fields) {
        this.setupData.getContract().G(fields.d());
    }

    private final void P9(ContactDetailsFields fields) {
        this.setupData.getContract().r5(new ContactDetailsData(fields.getEmail().getValue(), fields.getPhoneNumber().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<mj1.c.a> Q9(final List<ChildParticipant> children, k10.c0<mj1.c.a> state) {
        return state.b(new er.l() { // from class: mj1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9(children, this, (c.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mj1.c.a R9(List list, z zVar, mj1.c.a aVar) {
        mj1.c.a aVarA = aVar.a(ContactDetailsFields.b(aVar.getFields(), null, null, null, null, list, 15, null));
        zVar.O9(aVarA.getFields());
        return aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<mj1.c.a> S9(final ContactDetails contactDetails, k10.c0<mj1.c.a> state) {
        return state.b(new er.l() { // from class: mj1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(contactDetails, this, (c.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final mj1.c.a T9(ContactDetails contactDetails, z zVar, mj1.c.a aVar) {
        iy.b0 value;
        iy.b0 b0VarG;
        iy.b0 b0VarH;
        Object next;
        ContactDetail emailData = contactDetails.getEmailData();
        if (emailData != null) {
            value = emailData.getValue();
            if (emailData.getStatus() != xi0.c.IN_REGISTRY) {
                value = null;
            }
        } else {
            value = null;
        }
        ContactDetail phoneData = contactDetails.getPhoneData();
        if (phoneData != null) {
            b0VarG = phoneData.getValue();
            if (phoneData.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarG = null;
            }
        } else {
            b0VarG = null;
        }
        ContactDetail phoneData2 = contactDetails.getPhoneData();
        if (phoneData2 != null) {
            Iterator<T> it = phoneData2.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
            b0VarH = contactDetailAdditionalValue != null ? contactDetailAdditionalValue.getValue() : null;
            if (phoneData2.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarH = null;
            }
            if (b0VarH != null) {
                String strE = iy.c0.e(b0VarH);
                if (TextUtils.isDigitsOnly(strE)) {
                    b0VarH = iy.c0.g('+' + strE);
                }
            } else {
                b0VarH = null;
            }
        } else {
            b0VarH = null;
        }
        ContactDetailsFields fields = aVar.getFields();
        ContactDetailsFields.a.EmailTextInput emailTextInput = value != null ? new ContactDetailsFields.a.EmailTextInput(null, value, 1, null) : aVar.getFields().getEmail();
        if (b0VarH == null) {
            b0VarH = aVar.getFields().getPhoneNumber().getValue().h();
        }
        iy.b0 b0VarC = PhoneNumber.c.c(b0VarH);
        if (b0VarG == null) {
            b0VarG = aVar.getFields().getPhoneNumber().getValue().g();
        }
        mj1.c.a aVarA = aVar.a(ContactDetailsFields.b(fields, emailTextInput, new ContactDetailsFields.a.PhoneNumberInput(null, null, new PhoneNumber(b0VarC, PhoneNumber.b.c(b0VarG), null), 3, null), null, null, null, 28, null));
        zVar.P9(aVarA.getFields());
        return aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(mj1.c.class), new er.l() { // from class: mj1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.W9(this.f126817a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mj1.c.a.class), new er.l() { // from class: mj1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.X9(this.f126818a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mj1.c.a.Loading.class), new er.l() { // from class: mj1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.Y9(this.f126819a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mj1.c.Error.class), new er.l() { // from class: mj1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.aa(this.f126820a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        zVar2.x(q0.c(mj1.a.e.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(z zVar, k10.z zVar2) {
        d dVar = zVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(mj1.a.OnChildrenFetched.class), oVar, dVar);
        zVar2.v(q0.c(mj1.a.OnContactDetailsFetched.class), oVar, zVar.new e(null));
        zVar2.v(q0.c(mj1.a.m.class), oVar, zVar.new f(null));
        zVar2.v(q0.c(mj1.a.RemoveSelectedChild.class), oVar, zVar.new g(null));
        zVar2.v(q0.c(mj1.a.EditFields.class), oVar, zVar.new h(null));
        zVar2.v(q0.c(mj1.a.C3121a.class), oVar, zVar.new i(null));
        zVar2.v(q0.c(mj1.a.f.class), oVar, zVar.new j(null));
        zVar2.v(q0.c(mj1.a.l.class), oVar, zVar.new k(null));
        zVar2.x(q0.c(mj1.a.b.class), oVar, zVar.new l(null));
        zVar2.x(q0.c(mj1.a.OpenUrl.class), oVar, zVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(final z zVar, k10.z zVar2) {
        k10.k.l(zVar2, new er.l() { // from class: mj1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.Z9(this.f126821a, (c.a.Loading) obj);
            }
        }, null, zVar.new m(null), 2, null);
        n nVar = zVar.new n(null);
        zVar2.x(q0.c(mj1.a.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g Z9(z zVar, mj1.c.a.Loading loading) {
        return zVar.downloadContactDetailsDataUC.f(new wi1.a.Params(loading.getDownloadChildren(), loading.getDownloadContactDetails()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(z zVar, k10.z zVar2) {
        o oVar = zVar.new o(null);
        zVar2.v(q0.c(mj1.a.HandleErrorAction.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x013b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0168  */
    /* JADX WARN: Code duplicated, block: B:33:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x016d  */
    /* JADX WARN: Code duplicated, block: B:37:0x018e  */
    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object ba(mj1.c.a aVar, tq.e<? super mj1.c.a> eVar) throws Throwable {
        p pVar;
        ContactDetailsFields fields;
        ContactDetailsFields.a.EmailTextInput email;
        hz.b.Companion companion;
        mj1.c.a aVar2;
        hz.b.Companion companion2;
        ContactDetailsFields.a.EmailTextInput emailTextInput;
        mj1.c.a aVar3;
        ContactDetailsFields.a.PhoneNumberInput phoneNumberInput;
        hz.b bVarA;
        hz.b.Companion companion3;
        Object objC;
        hz.b bVar;
        hz.b.Companion companion4;
        ContactDetailsFields contactDetailsFields;
        mj1.c.a aVar4;
        boolean isChecked;
        hz.b invalid;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i15 = pVar.f126923m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f126923m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object objC2 = pVar.f126921k;
        Object objE = uq.b.e();
        int i16 = pVar.f126923m;
        if (i16 == 0) {
            oq.u.b(objC2);
            fields = aVar.getFields();
            email = aVar.getFields().getEmail();
            companion = hz.b.INSTANCE;
            j14.a aVar5 = this.checkEmailCorrectUC;
            j14.a.Params params = new j14.a.Params(aVar.getFields().getEmail().getValue(), false, null, 6, null);
            aVar2 = aVar;
            pVar.f126915d = aVar2;
            pVar.f126916e = fields;
            pVar.f126917f = email;
            pVar.f126918g = companion;
            pVar.f126923m = 1;
            objC2 = aVar5.c(params, pVar);
            if (objC2 != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            companion = (hz.b.Companion) pVar.f126918g;
            email = (ContactDetailsFields.a.EmailTextInput) pVar.f126917f;
            fields = (ContactDetailsFields) pVar.f126916e;
            aVar2 = (mj1.c.a) pVar.f126915d;
            oq.u.b(objC2);
        } else {
            if (i16 == 2) {
                hz.b.Companion companion5 = (hz.b.Companion) pVar.f126919h;
                ContactDetailsFields.a.EmailTextInput emailTextInput2 = (ContactDetailsFields.a.EmailTextInput) pVar.f126918g;
                fields = (ContactDetailsFields) pVar.f126917f;
                phoneNumberInput = (ContactDetailsFields.a.PhoneNumberInput) pVar.f126916e;
                aVar3 = (mj1.c.a) pVar.f126915d;
                oq.u.b(objC2);
                companion2 = companion5;
                emailTextInput = emailTextInput2;
                bVarA = companion2.a((hz.g) objC2);
                companion3 = hz.b.INSTANCE;
                j14.n nVar = this.checkPhoneNumberCorrectUC;
                j14.n.a.CheckNumber checkNumber = new j14.n.a.CheckNumber(aVar3.getFields().getPhoneNumber().getValue(), false, 2, null);
                pVar.f126915d = aVar3;
                pVar.f126916e = phoneNumberInput;
                pVar.f126917f = bVarA;
                pVar.f126918g = fields;
                pVar.f126919h = emailTextInput;
                pVar.f126920j = companion3;
                pVar.f126923m = 3;
                objC = nVar.c(checkNumber, pVar);
                if (objC != objE) {
                    bVar = bVarA;
                    objC2 = objC;
                    companion4 = companion3;
                    contactDetailsFields = fields;
                    aVar4 = aVar3;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion4 = (hz.b.Companion) pVar.f126920j;
            emailTextInput = (ContactDetailsFields.a.EmailTextInput) pVar.f126919h;
            ContactDetailsFields contactDetailsFields2 = (ContactDetailsFields) pVar.f126918g;
            hz.b bVar2 = (hz.b) pVar.f126917f;
            ContactDetailsFields.a.PhoneNumberInput phoneNumberInput2 = (ContactDetailsFields.a.PhoneNumberInput) pVar.f126916e;
            aVar4 = (mj1.c.a) pVar.f126915d;
            oq.u.b(objC2);
            bVar = bVar2;
            phoneNumberInput = phoneNumberInput2;
            contactDetailsFields = contactDetailsFields2;
        }
        ContactDetailsFields.a.EmailTextInput emailTextInput3 = emailTextInput;
        ContactDetailsFields.a.PhoneNumberInput phoneNumberInputC = ContactDetailsFields.a.PhoneNumberInput.c(phoneNumberInput, companion4.a((hz.g) objC2), bVar, null, 4, null);
        ContactDetailsFields.a.StatementCheckBox statement = aVar4.getFields().getStatement();
        isChecked = aVar4.getFields().getStatement().getIsChecked();
        if (isChecked) {
            invalid = hz.b.d.f86848c;
        } else {
            if (!isChecked) {
                throw new oq.p();
            }
            invalid = new hz.b.Invalid(this.labelProvider.c(ri1.b.A));
        }
        ContactDetailsFields contactDetailsFieldsB = ContactDetailsFields.b(contactDetailsFields, emailTextInput3, phoneNumberInputC, ContactDetailsFields.a.StatementCheckBox.c(statement, false, invalid, 1, null), null, null, 24, null);
        ContactDetailsFields.b bVarF = contactDetailsFieldsB.f();
        return aVar4.a(ContactDetailsFields.b(contactDetailsFieldsB, null, null, null, bVarF != null ? new d60.j(bVarF) : null, null, 23, null));
        ContactDetailsFields.a.EmailTextInput emailTextInputC = ContactDetailsFields.a.EmailTextInput.c(email, companion.a((hz.g) objC2), null, 2, null);
        ContactDetailsFields.a.PhoneNumberInput phoneNumber = aVar2.getFields().getPhoneNumber();
        companion2 = hz.b.INSTANCE;
        j14.n nVar2 = this.checkPhoneNumberCorrectUC;
        j14.n.a.CheckPrefix checkPrefix = new j14.n.a.CheckPrefix(aVar2.getFields().getPhoneNumber().getValue(), false, 2, null);
        pVar.f126915d = aVar2;
        pVar.f126916e = phoneNumber;
        pVar.f126917f = fields;
        pVar.f126918g = emailTextInputC;
        pVar.f126919h = companion2;
        pVar.f126923m = 2;
        Object objC3 = nVar2.c(checkPrefix, pVar);
        if (objC3 != objE) {
            emailTextInput = emailTextInputC;
            objC2 = objC3;
            aVar3 = aVar2;
            phoneNumberInput = phoneNumber;
            bVarA = companion2.a((hz.g) objC2);
            companion3 = hz.b.INSTANCE;
            j14.n nVar3 = this.checkPhoneNumberCorrectUC;
            j14.n.a.CheckNumber checkNumber2 = new j14.n.a.CheckNumber(aVar3.getFields().getPhoneNumber().getValue(), false, 2, null);
            pVar.f126915d = aVar3;
            pVar.f126916e = phoneNumberInput;
            pVar.f126917f = bVarA;
            pVar.f126918g = fields;
            pVar.f126919h = emailTextInput;
            pVar.f126920j = companion3;
            pVar.f126923m = 3;
            objC = nVar3.c(checkNumber2, pVar);
            if (objC != objE) {
                bVar = bVarA;
                objC2 = objC;
                companion4 = companion3;
                contactDetailsFields = fields;
                aVar4 = aVar3;
                ContactDetailsFields.a.EmailTextInput emailTextInput4 = emailTextInput;
                ContactDetailsFields.a.PhoneNumberInput phoneNumberInputC2 = ContactDetailsFields.a.PhoneNumberInput.c(phoneNumberInput, companion4.a((hz.g) objC2), bVar, null, 4, null);
                ContactDetailsFields.a.StatementCheckBox statement2 = aVar4.getFields().getStatement();
                isChecked = aVar4.getFields().getStatement().getIsChecked();
                if (isChecked) {
                    invalid = hz.b.d.f86848c;
                } else {
                    if (!isChecked) {
                        throw new oq.p();
                    }
                    invalid = new hz.b.Invalid(this.labelProvider.c(ri1.b.A));
                }
                ContactDetailsFields contactDetailsFieldsB2 = ContactDetailsFields.b(contactDetailsFields, emailTextInput4, phoneNumberInputC2, ContactDetailsFields.a.StatementCheckBox.c(statement2, false, invalid, 1, null), null, null, 24, null);
                ContactDetailsFields.b bVarF2 = contactDetailsFieldsB2.f();
                return aVar4.a(ContactDetailsFields.b(contactDetailsFieldsB2, null, null, null, bVarF2 != null ? new d60.j(bVarF2) : null, null, 23, null));
            }
        }
        return objE;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: U9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        if (data.getShouldUpdateChildrenInSetupMethod()) {
            d9(mj1.a.m.f126745a);
        }
    }

    @Override // zx.b
    public xw.b<mj1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mj1.c, mj1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mj1.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
