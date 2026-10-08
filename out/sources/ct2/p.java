package ct2;

import fr.q0;
import java.time.LocalDate;
import k10.c0;
import k10.z;
import mt2.PeselRestrictionHistoryFilterNavParams;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lct2/p;", "Ll00/g;", "Lct2/b;", "Lct2/a;", "Lct2/c;", "", "Lyy/a;", "stateMachineFactory", "Let2/e;", "mapper", "Lws2/e;", "getDatePickerDataUseCase", "Lws2/b;", "checkDatePickerFieldUseCase", "Lmt2/a;", "setupData", "<init>", "(Lyy/a;Let2/e;Lws2/e;Lws2/b;Lmt2/a;)V", "state", "Lct2/c$a;", "q9", "(Lct2/b;)Lct2/c$a;", "Lhz/g;", "Lhz/b;", "t9", "(Lhz/g;)Lhz/b;", "data", "Loq/i0;", "u9", "(Lmt2/a;)V", "b", "Let2/e;", "c", "Lws2/e;", "d", "Lws2/b;", "e", "Lmt2/a;", "Lct2/b$a;", "f", "Lct2/b$a;", "initialState", "Lxw/b;", "Lct2/a$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<ct2.b, ct2.a> implements ct2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final et2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ws2.e getDatePickerDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ws2.b checkDatePickerFieldUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private PeselRestrictionHistoryFilterNavParams setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ct2.b.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ct2.a.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ct2.b, ct2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<ct2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ct2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f37797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f37798b;

        /* JADX INFO: renamed from: ct2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0802a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f37799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f37800b;

            /* JADX INFO: renamed from: ct2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0803a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37801d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f37802e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f37803f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f37805h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f37806j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f37807k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f37808l;

                public C0803a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f37801d = obj;
                    this.f37802e |= PKIFailureInfo.systemUnavail;
                    return C0802a.this.F(null, this);
                }
            }

            public C0802a(mu.h hVar, p pVar) {
                this.f37799a = hVar;
                this.f37800b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0803a c0803a;
                if (eVar instanceof C0803a) {
                    c0803a = (C0803a) eVar;
                    int i15 = c0803a.f37802e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0803a.f37802e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0803a = new C0803a(eVar);
                    }
                } else {
                    c0803a = new C0803a(eVar);
                }
                Object obj2 = c0803a.f37801d;
                Object objE = uq.b.e();
                int i16 = c0803a.f37802e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f37799a;
                    ct2.c.a aVarQ9 = this.f37800b.q9((ct2.b) obj);
                    c0803a.f37803f = vq.j.a(obj);
                    c0803a.f37805h = vq.j.a(c0803a);
                    c0803a.f37806j = vq.j.a(obj);
                    c0803a.f37807k = vq.j.a(hVar);
                    c0803a.f37808l = 0;
                    c0803a.f37802e = 1;
                    if (hVar.F(aVarQ9, c0803a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f37797a = gVar;
            this.f37798b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ct2.c.a> hVar, tq.e eVar) {
            Object objA = this.f37797a.a(new C0802a(hVar, this.f37798b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lct2/a$g;", "action", "Lk10/c0;", "Lct2/b$a;", "state", "Lk10/l;", "Lct2/b;", "<anonymous>", "(Lct2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ct2.a.Setup, c0<ct2.b.a>, tq.e<? super k10.l<? extends ct2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37811g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ct2.b.Initialized O(ct2.a.Setup setup, ws2.e.Result result, ct2.b.a aVar) {
            ft2.b bVar;
            boolean z15 = (setup.getDateFrom() == null || setup.getDateTo() == null) ? false : true;
            if (z15) {
                bVar = ft2.b.C1503b.f67010a;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                bVar = ft2.b.a.f67009a;
            }
            return new ct2.b.Initialized(bVar, setup.getPeselRestrictionHistoryControllerState(), result, setup.getDateFrom(), null, setup.getDateTo(), null, 80, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ct2.a.Setup setup = (ct2.a.Setup) this.f37810f;
            c0 c0Var = (c0) this.f37811g;
            uq.b.e();
            if (this.f37809e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final ws2.e.Result resultH = p.this.getDatePickerDataUseCase.h(new ws2.e.Params(setup.getDateFrom(), setup.getDateTo()));
            return c0Var.d(new er.l() { // from class: ct2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.b.O(setup, resultH, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ct2.a.Setup setup, c0<ct2.b.a> c0Var, tq.e<? super k10.l<? extends ct2.b>> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f37810f = setup;
            bVar.f37811g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lct2/a$b;", "<unused var>", "Lct2/b$b;", "Loq/i0;", "<anonymous>", "(Lct2/a$b;Lct2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ct2.a.b, ct2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37813e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37813e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ct2.a.c> bVarY1 = p.this.Y1();
                ct2.a.c.b bVar = ct2.a.c.b.f37750a;
                this.f37813e = 1;
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
        public final Object w(ct2.a.b bVar, ct2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lct2/a$a;", "<unused var>", "Lk10/c0;", "Lct2/b$b;", "state", "Lk10/l;", "Lct2/b;", "<anonymous>", "(Lct2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ct2.a.C0797a, c0<ct2.b.Initialized>, tq.e<? super k10.l<? extends ct2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f37815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f37816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f37817g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f37818h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ct2.b.Initialized O(hz.b bVar, hz.b bVar2, ct2.b.Initialized initialized) {
            return ct2.b.Initialized.b(initialized, null, null, null, null, bVar, null, bVar2, 47, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
        
            if (r2.F(r4, r11) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
        
            if (r12.F(r2, r11) == r1) goto L43;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ct2.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ct2.a.C0797a c0797a, c0<ct2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ct2.b>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f37818h = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lct2/a$e;", "<destruct>", "Lk10/c0;", "Lct2/b$b;", "state", "Lk10/l;", "Lct2/b;", "<anonymous>", "(Lct2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ct2.a.SelectedRadioButton, c0<ct2.b.Initialized>, tq.e<? super k10.l<? extends ct2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37822g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ct2.b.Initialized O(ft2.b bVar, c0 c0Var, ct2.b.Initialized initialized) {
            if (fr.t.c(bVar, ft2.b.a.f67009a)) {
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                return ct2.b.Initialized.b(initialized, bVar, null, null, null, c2039b, null, c2039b, 6, null);
            }
            LocalDate fromDate = ((ct2.b.Initialized) c0Var.a()).getFromDate();
            if (fromDate == null) {
                fromDate = ((ct2.b.Initialized) c0Var.a()).getDatePickerResult().getFromCurrentDate();
            }
            LocalDate localDate = fromDate;
            LocalDate fromDate2 = ((ct2.b.Initialized) c0Var.a()).getFromDate();
            if (fromDate2 == null) {
                fromDate2 = ((ct2.b.Initialized) c0Var.a()).getDatePickerResult().getToCurrentDate();
            }
            return ct2.b.Initialized.b(initialized, bVar, null, null, localDate, null, fromDate2, null, 86, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ct2.a.SelectedRadioButton selectedRadioButton = (ct2.a.SelectedRadioButton) this.f37821f;
            final c0 c0Var = (c0) this.f37822g;
            uq.b.e();
            if (this.f37820e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final ft2.b id5 = selectedRadioButton.getId();
            return c0Var.b(new er.l() { // from class: ct2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(id5, c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ct2.a.SelectedRadioButton selectedRadioButton, c0<ct2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ct2.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f37821f = selectedRadioButton;
            eVar2.f37822g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lct2/a$d;", "<destruct>", "Lct2/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lct2/a$d;Lct2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ct2.a.OnDateFieldClick, ct2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f37823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f37824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f37825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f37826h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f37827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f37828k;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(p pVar, ft2.a aVar, LocalDate localDate) {
            pVar.d9(new ct2.a.SetDateForField(localDate, aVar));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(p pVar, ft2.a aVar, LocalDate localDate) {
            pVar.d9(new ct2.a.SetDateForField(localDate, aVar));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ct2.a.c.OpenDatePicker openDatePicker;
            ct2.a.OnDateFieldClick onDateFieldClick = (ct2.a.OnDateFieldClick) this.f37827j;
            ct2.b.Initialized initialized = (ct2.b.Initialized) this.f37828k;
            Object objE = uq.b.e();
            int i15 = this.f37826h;
            if (i15 == 0) {
                oq.u.b(obj);
                final ft2.a id5 = onDateFieldClick.getId();
                if (fr.t.c(id5, ft2.a.C1502a.f67007a)) {
                    LocalDate fromCurrentDate = initialized.getDatePickerResult().getFromCurrentDate();
                    LocalDate fromMinDate = initialized.getDatePickerResult().getFromMinDate();
                    LocalDate fromMaxDate = initialized.getDatePickerResult().getFromMaxDate();
                    final p pVar = p.this;
                    openDatePicker = new ct2.a.c.OpenDatePicker(id5, fromCurrentDate, fromMinDate, fromMaxDate, new er.l() { // from class: ct2.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.V(pVar, id5, (LocalDate) obj2);
                        }
                    });
                } else {
                    if (!fr.t.c(id5, ft2.a.b.f67008a)) {
                        throw new oq.p();
                    }
                    LocalDate toCurrentDate = initialized.getDatePickerResult().getToCurrentDate();
                    LocalDate toMinDate = initialized.getDatePickerResult().getToMinDate();
                    LocalDate toMaxDate = initialized.getDatePickerResult().getToMaxDate();
                    final p pVar2 = p.this;
                    openDatePicker = new ct2.a.c.OpenDatePicker(id5, toCurrentDate, toMinDate, toMaxDate, new er.l() { // from class: ct2.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.X(pVar2, id5, (LocalDate) obj2);
                        }
                    });
                }
                xw.b<ct2.a.c> bVarY1 = p.this.Y1();
                this.f37827j = vq.j.a(onDateFieldClick);
                this.f37828k = vq.j.a(initialized);
                this.f37823e = vq.j.a(id5);
                this.f37824f = vq.j.a(openDatePicker);
                this.f37825g = 0;
                this.f37826h = 1;
                if (bVarY1.F(openDatePicker, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ct2.a.OnDateFieldClick onDateFieldClick, ct2.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f37827j = onDateFieldClick;
            fVar.f37828k = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lct2/a$f;", "<destruct>", "Lk10/c0;", "Lct2/b$b;", "state", "Lk10/l;", "Lct2/b;", "<anonymous>", "(Lct2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ct2.a.SetDateForField, c0<ct2.b.Initialized>, tq.e<? super k10.l<? extends ct2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37832g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ct2.b.Initialized O(ft2.a aVar, p pVar, LocalDate localDate, c0 c0Var, ct2.b.Initialized initialized) {
            if (fr.t.c(aVar, ft2.a.C1502a.f67007a)) {
                ws2.e.Result resultH = pVar.getDatePickerDataUseCase.h(new ws2.e.Params(localDate, ((ct2.b.Initialized) c0Var.a()).getToDate()));
                return ct2.b.Initialized.b(initialized, null, null, resultH, resultH.getFromCurrentDate(), hz.b.C2039b.f86846c, null, null, 99, null);
            }
            if (!fr.t.c(aVar, ft2.a.b.f67008a)) {
                throw new oq.p();
            }
            ws2.e.Result resultH2 = pVar.getDatePickerDataUseCase.h(new ws2.e.Params(((ct2.b.Initialized) c0Var.a()).getFromDate(), localDate));
            return ct2.b.Initialized.b(initialized, null, null, resultH2, null, null, resultH2.getToCurrentDate(), hz.b.C2039b.f86846c, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ct2.a.SetDateForField setDateForField = (ct2.a.SetDateForField) this.f37831f;
            final c0 c0Var = (c0) this.f37832g;
            uq.b.e();
            if (this.f37830e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final LocalDate date = setDateForField.getDate();
            final ft2.a id5 = setDateForField.getId();
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: ct2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(id5, pVar, date, c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ct2.a.SetDateForField setDateForField, c0<ct2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ct2.b>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f37831f = setDateForField;
            gVar.f37832g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, et2.e eVar, ws2.e eVar2, ws2.b bVar, PeselRestrictionHistoryFilterNavParams peselRestrictionHistoryFilterNavParams) {
        this.mapper = eVar;
        this.getDatePickerDataUseCase = eVar2;
        this.checkDatePickerFieldUseCase = bVar;
        this.setupData = peselRestrictionHistoryFilterNavParams;
        ct2.b.a aVar2 = ct2.b.a.f37763a;
        this.initialState = aVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: ct2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f37788a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ct2.c.a q9(ct2.b state) {
        return this.mapper.b(new et2.e.Params(state, new er.l() { // from class: ct2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f37786a, (ft2.b) obj);
            }
        }, b9(ct2.a.C0797a.f37747a), b9(ct2.a.b.f37748a), new er.l() { // from class: ct2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f37787a, (ft2.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, ft2.b bVar) {
        pVar.d9(new ct2.a.SelectedRadioButton(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, ft2.a aVar) {
        pVar.d9(new ct2.a.OnDateFieldClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b t9(hz.g gVar) {
        if (gVar instanceof hz.g.Invalid) {
            return new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
        }
        if (fr.t.c(gVar, hz.g.b.f86853b)) {
            return hz.b.d.f86848c;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(ct2.b.a.class), new er.l() { // from class: ct2.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f37784a, (z) obj);
            }
        });
        vVar.c(q0.c(ct2.b.Initialized.class), new er.l() { // from class: ct2.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f37785a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.v(q0.c(ct2.a.Setup.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ct2.a.b.class), oVar, cVar);
        zVar.v(q0.c(ct2.a.C0797a.class), oVar, pVar.new d(null));
        zVar.v(q0.c(ct2.a.SelectedRadioButton.class), oVar, new e(null));
        zVar.x(q0.c(ct2.a.OnDateFieldClick.class), oVar, pVar.new f(null));
        zVar.v(q0.c(ct2.a.SetDateForField.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ct2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ct2.b, ct2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ct2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public void P5(PeselRestrictionHistoryFilterNavParams data) {
        this.setupData = data;
        d9(new ct2.a.Setup(data.getPeselRestrictionHistoryControllerState(), data.getFilterDateFrom(), data.getFilterDateTo()));
    }
}
