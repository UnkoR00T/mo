package oi0;

import ay.j;
import dx.i;
import er.l;
import fr.q0;
import fu.r;
import ge4.x;
import iy.b0;
import iy.c0;
import mu.g;
import mu.h;
import mu.m;
import ni0.ConversationDto;
import ni0.ConversationRatingDto;
import ni0.MessageDto;
import ni0.MessageReplyRatingDto;
import ni0.StreamMessageResponseDto;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ri0.BEConversationData;
import ri0.BERateAnswerModel;
import ri0.BERateConversationModel;
import ri0.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0\u000e0!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Loi0/b;", "Lsi0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lqi0/a;", "sseConnector", "Lri0/k;", "chatServiceEndpoints", "<init>", "(Lpl/gov/coi/common/network/w;Lay/j;Lpl/gov/coi/common/network/g0;Lqi0/a;Lri0/k;)V", "Ldx/i;", "Ldx/b;", "Lri0/b;", "b", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "conversationId", "responseId", "Lri0/d;", "rateAnswerModel", "Loq/i0;", "c", "(Liy/b0;Liy/b0;Lri0/d;Ltq/e;)Ljava/lang/Object;", "Lri0/e;", "rateConversationModel", "d", "(Liy/b0;Lri0/e;Ltq/e;)Ljava/lang/Object;", "", "question", "Lmu/g;", "Lri0/j;", "a", "(Liy/b0;Ljava/lang/String;)Lmu/g;", "Lay/j;", "Lpl/gov/coi/common/network/g0;", "Lqi0/a;", "Lri0/k;", "Lli0/a;", "e", "Loq/k;", "i", "()Lli0/a;", "client", "f", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements si0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f145906f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qi0.a sseConnector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k chatServiceEndpoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loi0/b$a;", "", "<init>", "()V", "", "CONVERSATION_PARAMETER", "Ljava/lang/String;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: oi0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3624b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f145912d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f145914f;

        C3624b(tq.e<? super C3624b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145912d = obj;
            this.f145914f |= PKIFailureInfo.systemUnavail;
            return b.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lni0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super x<ConversationDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145915e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145915e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            li0.a aVarI = b.this.i();
            this.f145915e = 1;
            Object objA = aVarI.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ConversationDto>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements g<i<? extends dx.b, ? extends ri0.j>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f145917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f145918b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f145919a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f145920b;

            /* JADX INFO: renamed from: oi0.b$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3625a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145921d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145922e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145923f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145925h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145926j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145927k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145928l;

                public C3625a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145921d = obj;
                    this.f145922e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, b bVar) {
                this.f145919a = hVar;
                this.f145920b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3625a c3625a;
                if (eVar instanceof C3625a) {
                    c3625a = (C3625a) eVar;
                    int i15 = c3625a.f145922e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3625a.f145922e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3625a = new C3625a(eVar);
                    }
                } else {
                    c3625a = new C3625a(eVar);
                }
                Object obj2 = c3625a.f145921d;
                Object objE = uq.b.e();
                int i16 = c3625a.f145922e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f145919a;
                    i<dx.b, ri0.j> iVarA = (i) obj;
                    if (!(iVarA instanceof i.Left)) {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        iVarA = mi0.a.a((StreamMessageResponseDto) this.f145920b.jsonSerializer.a((String) ((i.Right) iVarA).b(), q0.n(StreamMessageResponseDto.class)));
                    }
                    c3625a.f145923f = vq.j.a(obj);
                    c3625a.f145925h = vq.j.a(c3625a);
                    c3625a.f145926j = vq.j.a(obj);
                    c3625a.f145927k = vq.j.a(hVar);
                    c3625a.f145928l = 0;
                    c3625a.f145922e = 1;
                    if (hVar.F(iVarA, c3625a) == objE) {
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

        public d(g gVar, b bVar) {
            this.f145917a = gVar;
            this.f145918b = bVar;
        }

        @Override // mu.g
        public Object a(h<? super i<? extends dx.b, ? extends ri0.j>> hVar, tq.e eVar) {
            Object objA = this.f145917a.a(new a(hVar, this.f145918b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145929e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f145931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f145932h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ BERateAnswerModel f145933j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b0 b0Var, b0 b0Var2, BERateAnswerModel bERateAnswerModel, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f145931g = b0Var;
            this.f145932h = b0Var2;
            this.f145933j = bERateAnswerModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145929e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            li0.a aVarI = b.this.i();
            String strE = c0.e(this.f145931g);
            String strE2 = c0.e(this.f145932h);
            MessageReplyRatingDto messageReplyRatingDtoJ = mi0.a.j(this.f145933j);
            this.f145929e = 1;
            Object objC = aVarI.c(strE, strE2, messageReplyRatingDtoJ, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new e(this.f145931g, this.f145932h, this.f145933j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145934e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f145936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BERateConversationModel f145937h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b0 b0Var, BERateConversationModel bERateConversationModel, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f145936g = b0Var;
            this.f145937h = bERateConversationModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145934e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            li0.a aVarI = b.this.i();
            String strE = c0.e(this.f145936g);
            ConversationRatingDto conversationRatingDtoI = mi0.a.i(this.f145937h);
            this.f145934e = 1;
            Object objB = aVarI.b(strE, conversationRatingDtoI, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f145936g, this.f145937h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, j jVar, g0 g0Var, qi0.a aVar, k kVar) {
        this.jsonSerializer = jVar;
        this.networkCallMediator = g0Var;
        this.sseConnector = aVar;
        this.chatServiceEndpoints = kVar;
        this.client = oq.l.a(new er.a() { // from class: oi0.a
            @Override // er.a
            public final Object a() {
                return b.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li0.a h(w wVar) {
        return (li0.a) w.b(wVar, null, li0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final li0.a i() {
        return (li0.a) this.client.getValue();
    }

    @Override // si0.a
    public g<i<dx.b, ri0.j>> a(b0 conversationId, String question) {
        return new d(m.b(qi0.a.b(this.sseConnector, r.P(this.chatServiceEndpoints.h0(), "{conversationId}", c0.e(conversationId), false, 4, null), new qi0.a.b.Post(this.jsonSerializer.b(new MessageDto(question, null, 2, null), q0.n(MessageDto.class))), 0L, 4, null), Integer.MAX_VALUE, null, 2, null), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // si0.a
    public Object b(tq.e<? super i<? extends dx.b, BEConversationData>> eVar) throws Throwable {
        C3624b c3624b;
        if (eVar instanceof C3624b) {
            c3624b = (C3624b) eVar;
            int i15 = c3624b.f145914f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3624b.f145914f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3624b = new C3624b(eVar);
            }
        } else {
            c3624b = new C3624b(eVar);
        }
        Object objB = c3624b.f145912d;
        Object objE = uq.b.e();
        int i16 = c3624b.f145914f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            c cVar = new c(null);
            c3624b.f145914f = 1;
            objB = g0Var.b(cVar, c3624b);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(mi0.a.d((ConversationDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // si0.a
    public Object c(b0 b0Var, b0 b0Var2, BERateAnswerModel bERateAnswerModel, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new e(b0Var, b0Var2, bERateAnswerModel, null), eVar);
    }

    @Override // si0.a
    public Object d(b0 b0Var, BERateConversationModel bERateConversationModel, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new f(b0Var, bERateConversationModel, null), eVar);
    }
}
