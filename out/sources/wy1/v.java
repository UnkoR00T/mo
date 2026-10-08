package wy1;

import fr.q0;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import yi0.ElectionsArea;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BK\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lwy1/v;", "Ll00/g;", "Lwy1/f;", "", "Lwy1/g;", "Lyy/a;", "stateMachineFactory", "La14/a;", "addEventToCalendarUseCase", "Lwy1/j;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lmx/c;", "labelProvider", "La14/d;", "copyToClipboardUseCase", "Li70/e;", "globalSnackBarManager", "Lwy1/e;", "setupData", "<init>", "(Lyy/a;La14/a;Lwy1/j;La14/w;Lmx/c;La14/d;Li70/e;Lwy1/e;)V", "state", "Lwy1/g$a;", "v9", "(Lwy1/f;)Lwy1/g$a;", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "z9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "value", "t9", "Lyi0/e;", "electionsArea", "s9", "(Lyi0/e;)V", "u9", "(Lyi0/e;)Ljava/lang/String;", "b", "La14/a;", "c", "Lwy1/j;", "d", "La14/w;", "e", "Lmx/c;", "f", "La14/d;", "g", "Li70/e;", "h", "Lwy1/e;", "j", "Lwy1/f;", "initialState", "Lxw/b;", "Lwy1/c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.a addEventToCalendarUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ElectoralEventDetailsModel setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wy1.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215940e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ElectionsArea f215942g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ElectionsArea electionsArea, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f215942g = electionsArea;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215940e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.a aVar = v.this.addEventToCalendarUseCase;
                String electionsName = this.f215942g.getElectionsName();
                LocalDate electionsDate = this.f215942g.getElectionsDate();
                LocalTime localTime = LocalTime.NOON;
                long epochMilli = electionsDate.atTime(localTime).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                long epochMilli2 = this.f215942g.getElectionsDate().atTime(localTime).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                String text = ez1.a.a(this.f215942g.getOkwAddress().getPostalCode(), this.f215942g.getOkwAddress().getCity(), this.f215942g.getOkwAddress().getStreet(), this.f215942g.getOkwAddress().getBuildingNumber(), this.f215942g.getOkwAddress().getApartmentNumber()).getText();
                a14.a.Params params = new a14.a.Params(electionsName, epochMilli, vq.b.f(epochMilli2), true, v.this.u9(this.f215942g), text);
                this.f215940e = 1;
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
            dx.i iVar = (dx.i) obj;
            v vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                vVar.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new a(this.f215942g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f215943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f215944e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f215946g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f215944e = obj;
            this.f215946g |= PKIFailureInfo.systemUnavail;
            return v.this.z9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f215947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f215948b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f215949a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f215950b;

            /* JADX INFO: renamed from: wy1.v$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5734a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f215951d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f215952e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f215953f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f215955h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f215956j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f215957k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f215958l;

                public C5734a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f215951d = obj;
                    this.f215952e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f215949a = hVar;
                this.f215950b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5734a c5734a;
                if (eVar instanceof C5734a) {
                    c5734a = (C5734a) eVar;
                    int i15 = c5734a.f215952e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5734a.f215952e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5734a = new C5734a(eVar);
                    }
                } else {
                    c5734a = new C5734a(eVar);
                }
                Object obj2 = c5734a.f215951d;
                Object objE = uq.b.e();
                int i16 = c5734a.f215952e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f215949a;
                    g.Data dataV9 = this.f215950b.v9((State) obj);
                    c5734a.f215953f = vq.j.a(obj);
                    c5734a.f215955h = vq.j.a(c5734a);
                    c5734a.f215956j = vq.j.a(obj);
                    c5734a.f215957k = vq.j.a(hVar);
                    c5734a.f215958l = 0;
                    c5734a.f215952e = 1;
                    if (hVar.F(dataV9, c5734a) == objE) {
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

        public c(mu.g gVar, v vVar) {
            this.f215947a = gVar;
            this.f215948b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f215947a.a(new a(hVar, this.f215948b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwy1/a;", "<unused var>", "Lwy1/f;", "Loq/i0;", "<anonymous>", "(Lwy1/a;Lwy1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wy1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215959e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215959e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wy1.c> bVarY1 = v.this.Y1();
                wy1.c.a aVar = wy1.c.a.f215896a;
                this.f215959e = 1;
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
        public final Object w(wy1.a aVar, State state, tq.e<? super i0> eVar) {
            return v.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwy1/d;", "action", "Lwy1/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwy1/d;Lwy1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215962f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f215962f;
            Object objE = uq.b.e();
            int i15 = this.f215961e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                String url = openUrl.getUrl();
                this.f215962f = vq.j.a(openUrl);
                this.f215961e = 1;
                if (vVar.z9(url, this) == objE) {
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
        public final Object w(OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f215962f = openUrl;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwy1/b;", "action", "Lwy1/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwy1/b;Lwy1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<CopyToClipboard, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215965f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CopyToClipboard copyToClipboard = (CopyToClipboard) this.f215965f;
            Object objE = uq.b.e();
            int i15 = this.f215964e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                String value = copyToClipboard.getValue();
                this.f215965f = vq.j.a(copyToClipboard);
                this.f215964e = 1;
                if (vVar.t9(value, this) == objE) {
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
        public final Object w(CopyToClipboard copyToClipboard, State state, tq.e<? super i0> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f215965f = copyToClipboard;
            return fVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, a14.a aVar2, j jVar, a14.w wVar, mx.c cVar, a14.d dVar, i70.e eVar, ElectoralEventDetailsModel electoralEventDetailsModel) {
        this.addEventToCalendarUseCase = aVar2;
        this.mapper = jVar;
        this.openUrlIntentUseCase = wVar;
        this.labelProvider = cVar;
        this.copyToClipboardUseCase = dVar;
        this.globalSnackBarManager = eVar;
        this.setupData = electoralEventDetailsModel;
        State state = new State(electoralEventDetailsModel);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: wy1.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f215928a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), v9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(State.class), new er.l() { // from class: wy1.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f215926a, (z) obj);
            }
        });
        vVar2.c(q0.c(State.class), new er.l() { // from class: wy1.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f215927a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(v vVar, z zVar) {
        d dVar = vVar.new d(null);
        zVar.x(q0.c(wy1.a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(v vVar, z zVar) {
        e eVar = vVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(OpenUrl.class), oVar, eVar);
        zVar.x(q0.c(CopyToClipboard.class), oVar, vVar.new f(null));
        return i0.f148189a;
    }

    private final void s9(ElectionsArea electionsArea) {
        i00.a.a(this, new a(electionsArea, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t9(String str, tq.e<? super i0> eVar) {
        Object objC = this.copyToClipboardUseCase.c(new a14.d.Params(str, this.labelProvider.c(qy1.a.f169498c)), eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final String u9(ElectionsArea electionsArea) {
        mx.c cVar = this.labelProvider;
        int i15 = qy1.a.f169506g;
        String temporaryOkwName = electionsArea.getTemporaryOkwName();
        if (temporaryOkwName == null) {
            temporaryOkwName = electionsArea.getOkwName();
        } else {
            if (fu.r.t0(temporaryOkwName)) {
                temporaryOkwName = electionsArea.getOkwName();
            }
            if (temporaryOkwName == null) {
                temporaryOkwName = electionsArea.getOkwName();
            }
        }
        return cVar.e(i15, temporaryOkwName).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data v9(State state) {
        return this.mapper.b(new j.Params(state, new er.l() { // from class: wy1.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.w9(this.f215923a, (String) obj);
            }
        }, new er.l() { // from class: wy1.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.x9(this.f215924a, (String) obj);
            }
        }, new er.l() { // from class: wy1.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.y9(this.f215925a, (ElectionsArea) obj);
            }
        }, b9(wy1.a.f215894a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(v vVar, String str) {
        vVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(v vVar, String str) {
        vVar.d9(new CopyToClipboard(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(v vVar, ElectionsArea electionsArea) {
        vVar.s9(electionsArea);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f215946g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f215946g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f215944e;
        Object objE = uq.b.e();
        int i16 = bVar.f215946g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            bVar.f215943d = vq.j.a(str);
            bVar.f215946g = 1;
            objC = wVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
        }
        return iVar;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ElectoralEventDetailsModel electoralEventDetailsModel) {
        super.P5(electoralEventDetailsModel);
    }

    @Override // zx.b
    public xw.b<wy1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }
}
