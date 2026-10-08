package to0;

import ge4.x;
import java.util.List;
import oo0.EndedIdeaVoteRound;
import oo0.EndedRoundVotingResult;
import oo0.IdeaVoteRound;
import oo0.IdeaVoteRounds;
import oo0.IdeasRoundDetails;
import oo0.RoundSummaryModel;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import so0.AddIdeaRequestDto;
import so0.EndedIdeaVoteRoundResponseDto;
import so0.EndedIdeaVoteRoundVotingResultResponseDto;
import so0.IdeaVoteRoundDtoDto;
import so0.IdeaVoteRoundResponseDto;
import so0.IdeaVoteRoundSummaryDtoDto;
import so0.IdeasResponseDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\bH\u0096@¢\u0006\u0004\b\u0013\u0010\fJ4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\bH\u0097@¢\u0006\u0004\b\u001c\u0010\fJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\bH\u0096@¢\u0006\u0004\b\u001e\u0010\fJ\"\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\bH\u0096@¢\u0006\u0004\b!\u0010\fJ$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\b2\u0006\u0010\"\u001a\u00020\rH\u0096@¢\u0006\u0004\b$\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lto0/b;", "Lvo0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Loo0/r;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "ideaId", "Loq/i0;", "f", "(JLtq/e;)Ljava/lang/Object;", "Loo0/t;", "d", "", "topic", "description", "Loo0/k;", "category", "h", "(Ljava/lang/String;Ljava/lang/String;Loo0/k;Ltq/e;)Ljava/lang/Object;", "Loo0/q;", "c", "Loo0/n;", "g", "", "Loo0/e;", "a", "roundId", "Loo0/f;", "b", "Lpl/gov/coi/common/network/g0;", "Lqo0/a;", "Loq/k;", "l", "()Lqo0/a;", "client", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements vo0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191228d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191230f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191228d = obj;
            this.f191230f |= PKIFailureInfo.systemUnavail;
            return b.this.c(this);
        }
    }

    /* JADX INFO: renamed from: to0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C4998b extends vq.k implements er.l<tq.e<? super x<IdeaVoteRoundResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191231e;

        C4998b(tq.e<? super C4998b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191231e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            this.f191231e = 1;
            Object objH = aVarL.h(this);
            return objH == objE ? objE : objH;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C4998b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<IdeaVoteRoundResponseDto>> eVar) {
            return ((C4998b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191233d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191235f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191233d = obj;
            this.f191235f |= PKIFailureInfo.systemUnavail;
            return b.this.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/r;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<IdeaVoteRoundDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191236e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191236e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            this.f191236e = 1;
            Object objC = aVarL.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<IdeaVoteRoundDtoDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191238d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191240f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191238d = obj;
            this.f191240f |= PKIFailureInfo.systemUnavail;
            return b.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/v;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<IdeasResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191241e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191241e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            this.f191241e = 1;
            Object objE2 = aVarL.e(this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<IdeasResponseDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191243d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191245f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191243d = obj;
            this.f191245f |= PKIFailureInfo.systemUnavail;
            return b.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/t;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<IdeaVoteRoundSummaryDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191246e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191246e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            this.f191246e = 1;
            Object objF = aVarL.f(this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<IdeaVoteRoundSummaryDtoDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f191248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191249e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191251g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191249e = obj;
            this.f191251g |= PKIFailureInfo.systemUnavail;
            return b.this.b(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<EndedIdeaVoteRoundVotingResultResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191252e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f191254g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j15, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f191254g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191252e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            long j15 = this.f191254g;
            this.f191252e = 1;
            Object objB = aVarL.b(j15, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new j(this.f191254g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EndedIdeaVoteRoundVotingResultResponseDto>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191255d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191257f;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191255d = obj;
            this.f191257f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/h;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<EndedIdeaVoteRoundResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191258e;

        l(tq.e<? super l> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191258e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            this.f191258e = 1;
            Object objA = aVarL.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new l(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EndedIdeaVoteRoundResponseDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f191260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ oo0.k f191262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f191263h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f191264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b f191265k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(oo0.k kVar, String str, String str2, b bVar, tq.e<? super m> eVar) {
            super(1, eVar);
            this.f191262g = kVar;
            this.f191263h = str;
            this.f191264j = str2;
            this.f191265k = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191261f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            AddIdeaRequestDto addIdeaRequestDtoC = ro0.a.c(this.f191262g, this.f191263h, this.f191264j);
            qo0.a aVarL = this.f191265k.l();
            this.f191260e = vq.j.a(addIdeaRequestDtoC);
            this.f191261f = 1;
            Object objD = aVarL.d(addIdeaRequestDtoC, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new m(this.f191262g, this.f191263h, this.f191264j, this.f191265k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191266e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f191268g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j15, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f191268g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191266e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.a aVarL = b.this.l();
            long j15 = this.f191268g;
            this.f191266e = 1;
            Object objG = aVarL.g(j15, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new n(this.f191268g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: to0.a
            @Override // er.a
            public final Object a() {
                return b.k(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qo0.a k(w wVar) {
        return (qo0.a) w.b(wVar, null, qo0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qo0.a l() {
        return (qo0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<EndedIdeaVoteRound>>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f191257f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f191257f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f191255d;
        Object objE = uq.b.e();
        int i16 = kVar.f191257f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(null);
            kVar.f191257f = 1;
            objB = g0Var.b(lVar, kVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.d((EndedIdeaVoteRoundResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    public Object b(long j15, tq.e<? super dx.i<? extends dx.b, EndedRoundVotingResult>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f191251g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f191251g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f191249e;
        Object objE = uq.b.e();
        int i16 = iVar.f191251g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(j15, null);
            iVar.f191248d = j15;
            iVar.f191251g = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.e((EndedIdeaVoteRoundVotingResultResponseDto) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    @oq.a
    public Object c(tq.e<? super dx.i<? extends dx.b, IdeaVoteRounds>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f191230f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f191230f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f191228d;
        Object objE = uq.b.e();
        int i16 = aVar.f191230f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C4998b c4998b = new C4998b(null);
            aVar.f191230f = 1;
            objB = g0Var.b(c4998b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.m((IdeaVoteRoundResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    public Object d(tq.e<? super dx.i<? extends dx.b, RoundSummaryModel>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f191245f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f191245f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f191243d;
        Object objE = uq.b.e();
        int i16 = gVar.f191245f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f191245f = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.p((IdeaVoteRoundSummaryDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    public Object e(tq.e<? super dx.i<? extends dx.b, IdeasRoundDetails>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f191240f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f191240f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f191238d;
        Object objE = uq.b.e();
        int i16 = eVar2.f191240f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(null);
            eVar2.f191240f = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.n((IdeasResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // vo0.a
    public Object f(long j15, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new n(j15, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.a
    public Object g(tq.e<? super dx.i<? extends dx.b, IdeaVoteRound>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f191235f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f191235f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f191233d;
        Object objE = uq.b.e();
        int i16 = cVar.f191235f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f191235f = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ro0.a.j((IdeaVoteRoundDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // vo0.a
    public Object h(String str, String str2, oo0.k kVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new m(kVar, str, str2, this, null), eVar);
    }
}
