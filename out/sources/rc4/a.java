package rc4;

import dx.i;
import g21.ConversationData;
import g21.RateAnswerModel;
import g21.f;
import iy.b0;
import mu.h;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ri0.BEConversationData;
import ri0.j;
import ti0.c;
import ti0.e;
import ti0.g;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\f0\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lrc4/a;", "Le21/a;", "Lti0/a;", "getConversationDataUC", "Lti0/c;", "messageStreamingUC", "Lti0/e;", "rateAnswerUC", "Lti0/g;", "sendConversationRatingUC", "<init>", "(Lti0/a;Lti0/c;Lti0/e;Lti0/g;)V", "Ldx/i;", "Ldx/b;", "Lg21/b;", "b", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "conversationId", "", "question", "Lmu/g;", "Lg21/i;", "a", "(Liy/b0;Ljava/lang/String;)Lmu/g;", "responseId", "Lg21/d;", "rateAnswerModel", "Loq/i0;", "c", "(Liy/b0;Liy/b0;Lg21/d;Ltq/e;)Ljava/lang/Object;", "Lg21/f;", "ratingScale", "userReview", "d", "(Liy/b0;Lg21/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lti0/a;", "Lti0/c;", "Lti0/e;", "Lti0/g;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e21.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ti0.a getConversationDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c messageStreamingUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e rateAnswerUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g sendConversationRatingUC;

    /* JADX INFO: renamed from: rc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4421a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f173153d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173155f;

        C4421a(tq.e<? super C4421a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173153d = obj;
            this.f173155f |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i<? extends dx.b, ? extends g21.i>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f173156a;

        /* JADX INFO: renamed from: rc4.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4422a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f173157a;

            /* JADX INFO: renamed from: rc4.a$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4423a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f173158d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f173159e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f173160f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f173162h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f173163j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f173164k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f173165l;

                public C4423a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f173158d = obj;
                    this.f173159e |= PKIFailureInfo.systemUnavail;
                    return C4422a.this.F(null, this);
                }
            }

            public C4422a(h hVar) {
                this.f173157a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4423a c4423a;
                if (eVar instanceof C4423a) {
                    c4423a = (C4423a) eVar;
                    int i15 = c4423a.f173159e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4423a.f173159e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4423a = new C4423a(eVar);
                    }
                } else {
                    c4423a = new C4423a(eVar);
                }
                Object obj2 = c4423a.f173158d;
                Object objE = uq.b.e();
                int i16 = c4423a.f173159e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f173157a;
                    i right = (i) obj;
                    if (!(right instanceof i.Left)) {
                        if (!(right instanceof i.Right)) {
                            throw new p();
                        }
                        right = new i.Right(rc4.b.n((j) ((i.Right) right).b()));
                    }
                    c4423a.f173160f = vq.j.a(obj);
                    c4423a.f173162h = vq.j.a(c4423a);
                    c4423a.f173163j = vq.j.a(obj);
                    c4423a.f173164k = vq.j.a(hVar);
                    c4423a.f173165l = 0;
                    c4423a.f173159e = 1;
                    if (hVar.F(right, c4423a) == objE) {
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

        public b(mu.g gVar) {
            this.f173156a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super i<? extends dx.b, ? extends g21.i>> hVar, tq.e eVar) {
            Object objA = this.f173156a.a(new C4422a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public a(ti0.a aVar, c cVar, e eVar, g gVar) {
        this.getConversationDataUC = aVar;
        this.messageStreamingUC = cVar;
        this.rateAnswerUC = eVar;
        this.sendConversationRatingUC = gVar;
    }

    @Override // e21.a
    public mu.g<i<dx.b, g21.i>> a(b0 conversationId, String question) {
        return new b(this.messageStreamingUC.a(new c.Params(conversationId, question)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e21.a
    public Object b(tq.e<? super i<? extends dx.b, ConversationData>> eVar) throws Throwable {
        C4421a c4421a;
        if (eVar instanceof C4421a) {
            c4421a = (C4421a) eVar;
            int i15 = c4421a.f173155f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4421a.f173155f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4421a = new C4421a(eVar);
            }
        } else {
            c4421a = new C4421a(eVar);
        }
        Object objC = c4421a.f173153d;
        Object objE = uq.b.e();
        int i16 = c4421a.f173155f;
        if (i16 == 0) {
            u.b(objC);
            ti0.a aVar = this.getConversationDataUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c4421a.f173155f = 1;
            objC = aVar.c(c1792a, c4421a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(rc4.b.j((BEConversationData) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // e21.a
    public Object c(b0 b0Var, b0 b0Var2, RateAnswerModel rateAnswerModel, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.rateAnswerUC.c(new e.Params(b0Var, b0Var2, rc4.b.e(rateAnswerModel)), eVar);
    }

    @Override // e21.a
    public Object d(b0 b0Var, f fVar, String str, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.sendConversationRatingUC.c(new g.Params(b0Var, rc4.b.g(fVar), str), eVar);
    }
}
