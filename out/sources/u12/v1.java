package u12;

import o02.Epuap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z02.MessageDetailsPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00032\u00020\u0004B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R,\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\u0012\u001a\u0004\b3\u00104R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0>8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010\u0012\u001a\u0004\bA\u0010BR\u001c\u0010I\u001a\u00020D8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010U\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010[\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010^\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lu12/v1;", "Ll00/g;", "Lu12/s;", "", "Lm22/h;", "Lyy/a;", "stateMachineFactory", "dataSourceContract", "Lz02/a;", "entryData", "<init>", "(Lyy/a;Lm22/h;Lz02/a;)V", "state", "Lu12/t;", "l9", "(Lu12/s;)Lu12/t;", "Loq/i0;", "j9", "()V", "k9", "reset", "Lo02/c;", "result", "r6", "(Lo02/c;)V", "Lo02/d;", "j3", "(Lo02/d;)V", "Lo02/b$a;", "k6", "(Lo02/b$a;)V", "Lo02/b$c;", "F7", "(Lo02/b$c;)V", "Lo02/b$d;", "N3", "(Lo02/b$d;)V", "Lo02/b$e;", "N4", "(Lo02/b$e;)V", "Lo02/b$b;", "b3", "(Lo02/b$b;)V", "c", "Lz02/a;", "d", "Lu12/s;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lu12/r;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lo02/b$f;", "v6", "()Lo02/b$f;", "n3", "(Lo02/b$f;)V", "messageFormEntryData", "I1", "()Lo02/c;", "edorMessageFormResult", "p1", "()Lo02/d;", "epuapMessageFormResult", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37093t, "()Lo02/b$a;", "getAddRecipientFormResult", "a7", "()Lo02/b$c;", "contactDetailsResult", "T7", "()Lo02/b$d;", "contactMethodResult", "y0", "()Lo02/b$e;", "correspondenceAddress", "v5", "()Lo02/b$b;", "getChooseMessageTypeResult", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v1 extends l00.g<s, Object> implements l00.e, zx.d, m22.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ m22.h f194294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z02.a entryData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<s, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<t> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f194300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1 f194301b;

        /* JADX INFO: renamed from: u12.v1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5057a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f194302a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1 f194303b;

            /* JADX INFO: renamed from: u12.v1$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5058a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f194304d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f194305e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f194306f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f194308h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f194309j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f194310k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f194311l;

                public C5058a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f194304d = obj;
                    this.f194305e |= PKIFailureInfo.systemUnavail;
                    return C5057a.this.F(null, this);
                }
            }

            public C5057a(mu.h hVar, v1 v1Var) {
                this.f194302a = hVar;
                this.f194303b = v1Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5058a c5058a;
                if (eVar instanceof C5058a) {
                    c5058a = (C5058a) eVar;
                    int i15 = c5058a.f194305e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5058a.f194305e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5058a = new C5058a(eVar);
                    }
                } else {
                    c5058a = new C5058a(eVar);
                }
                Object obj2 = c5058a.f194304d;
                Object objE = uq.b.e();
                int i16 = c5058a.f194305e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f194302a;
                    t tVarL9 = this.f194303b.l9((s) obj);
                    c5058a.f194306f = vq.j.a(obj);
                    c5058a.f194308h = vq.j.a(c5058a);
                    c5058a.f194309j = vq.j.a(obj);
                    c5058a.f194310k = vq.j.a(hVar);
                    c5058a.f194311l = 0;
                    c5058a.f194305e = 1;
                    if (hVar.F(tVarL9, c5058a) == objE) {
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

        public a(mu.g gVar, v1 v1Var) {
            this.f194300a = gVar;
            this.f194301b = v1Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super t> hVar, tq.e eVar) {
            Object objA = this.f194300a.a(new C5057a(hVar, this.f194301b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu12/p;", "<unused var>", "Lu12/s;", "Loq/i0;", "<anonymous>", "(Lu12/p;Lu12/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<p, s, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194312e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194312e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r> bVarY1 = v1.this.Y1();
                r.a aVar = r.a.f194249a;
                this.f194312e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(p pVar, s sVar, tq.e<? super oq.i0> eVar) {
            return v1.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu12/q;", "<unused var>", "Lu12/s;", "Loq/i0;", "<anonymous>", "(Lu12/q;Lu12/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<q, s, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f194314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f194315f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194315f;
            if (i15 == 0) {
                oq.u.b(obj);
                z02.a entryPoint = v1.this.v6().getEntryPoint();
                if (entryPoint instanceof z02.a.EditDraft) {
                    xw.b<r> bVarY1 = v1.this.Y1();
                    z02.a.EditDraft editDraft = (z02.a.EditDraft) entryPoint;
                    r.ExitToInbox exitToInbox = new r.ExitToInbox(new MessageDetailsPayload(editDraft.getMessageDetails().getDeliveryMessage(), editDraft.getDirectoryId(), editDraft.getDirectoryType(), editDraft.getDirectoryName(), null));
                    this.f194314e = vq.j.a(entryPoint);
                    this.f194315f = 1;
                    if (bVarY1.F(exitToInbox, this) == objE) {
                        return objE;
                    }
                } else if (!(entryPoint instanceof z02.a.ForwardMessage) && !fr.t.c(entryPoint, z02.a.c.f231893a) && !(entryPoint instanceof z02.a.Reply)) {
                    throw new oq.p();
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
        public final Object w(q qVar, s sVar, tq.e<? super oq.i0> eVar) {
            return v1.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    public v1(yy.a aVar, m22.h hVar, z02.a aVar2) {
        this.f194294b = hVar;
        this.entryData = aVar2;
        s sVar = s.f194262a;
        this.initialState = sVar;
        n3(new o02.b.Start(aVar2));
        this.stateMachine = aVar.a(sVar, new er.l() { // from class: u12.u1
            @Override // er.l
            public final Object b(Object obj) {
                return v1.n9(this.f194280a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t l9(s state) {
        return t.f194266a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n9(final v1 v1Var, k10.v vVar) {
        vVar.c(fr.q0.c(s.class), new er.l() { // from class: u12.t1
            @Override // er.l
            public final Object b(Object obj) {
                return v1.o9(this.f194272a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(v1 v1Var, k10.z zVar) {
        b bVar = v1Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(p.class), oVar, bVar);
        zVar.x(fr.q0.c(q.class), oVar, v1Var.new c(null));
        return oq.i0.f148189a;
    }

    @Override // m22.c
    public void F7(o02.b.ContactDetails result) {
        this.f194294b.F7(result);
    }

    @Override // m22.a
    public o02.b.AddRecipients H6() {
        return this.f194294b.H6();
    }

    @Override // m22.f
    public o02.c I1() {
        return this.f194294b.I1();
    }

    @Override // m22.d
    public void N3(o02.b.ContactMethod result) {
        this.f194294b.N3(result);
    }

    @Override // m22.e
    public void N4(o02.b.CorrespondenceAddress result) {
        this.f194294b.N4(result);
    }

    @Override // m22.d
    public o02.b.ContactMethod T7() {
        return this.f194294b.T7();
    }

    @Override // zx.b
    public xw.b<r> Y1() {
        return this.navAction;
    }

    @Override // m22.c
    public o02.b.ContactDetails a7() {
        return this.f194294b.a7();
    }

    @Override // m22.b
    public void b3(o02.b.ChooseMessageType result) {
        this.f194294b.b3(result);
    }

    @Override // l00.g
    protected k10.t<s, Object> e9() {
        return this.stateMachine;
    }

    @Override // m22.g
    public void j3(Epuap result) {
        this.f194294b.j3(result);
    }

    public final void j9() {
        d9(p.f194233a);
    }

    @Override // m22.a
    public void k6(o02.b.AddRecipients result) {
        this.f194294b.k6(result);
    }

    public final void k9() {
        d9(q.f194240a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(z02.a aVar) {
        super.P5(aVar);
    }

    @Override // m22.j
    public void n3(o02.b.Start start) {
        this.f194294b.n3(start);
    }

    @Override // m22.g
    public Epuap p1() {
        return this.f194294b.p1();
    }

    @Override // m22.f
    public void r6(o02.c result) {
        this.f194294b.r6(result);
    }

    @Override // m22.h
    public void reset() {
        this.f194294b.reset();
    }

    @Override // m22.b
    public o02.b.ChooseMessageType v5() {
        return this.f194294b.v5();
    }

    @Override // m22.j
    public o02.b.Start v6() {
        return this.f194294b.v6();
    }

    @Override // m22.e
    public o02.b.CorrespondenceAddress y0() {
        return this.f194294b.y0();
    }
}
