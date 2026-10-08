package j21;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lj21/m1;", "Lk10/t;", "Lj21/j1;", "Lj21/a;", "Lj21/m1$c$a;", "data", "Le21/a;", "interactor", "Lk21/p;", "streamMessagesMapper", "<init>", "(Lj21/m1$c$a;Le21/a;Lk21/p;)V", "f", "Lj21/m1$c$a;", "g", "Le21/a;", "h", "Lk21/p;", "c", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m1 extends k10.t<j1, j21.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f98788i = k10.t.f107399e | iy.b0.f97726c;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.SetupData data;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e21.a interactor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k21.p streamMessagesMapper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldx/i;", "Ldx/b;", "Lj21/h1$a;", "acc", "Lg21/i;", "item", "<anonymous>", "(Ldx/i;Ldx/i;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<dx.i<? extends dx.b, ? extends h1.a>, dx.i<? extends dx.b, ? extends g21.i>, tq.e<? super dx.i<? extends dx.b, ? extends h1.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98794g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f98793f;
            dx.i iVar2 = (dx.i) this.f98794g;
            uq.b.e();
            if (this.f98792e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m1 m1Var = m1.this;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            h1.a aVar = (h1.a) ((dx.i.Right) iVar).b();
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return m1Var.streamMessagesMapper.b(new k21.p.Params(aVar, (g21.i) ((dx.i.Right) iVar2).b(), m1Var.data.getLastMessageCount()));
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, ? extends h1.a> iVar, dx.i<? extends dx.b, ? extends g21.i> iVar2, tq.e<? super dx.i<? extends dx.b, ? extends h1.a>> eVar) {
            a aVar = m1.this.new a(eVar);
            aVar.f98793f = iVar;
            aVar.f98794g = iVar2;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ldx/i;", "Ldx/b;", "Lj21/h1$a;", "result", "Lk10/c0;", "Lj21/j1$a;", "state", "Lk10/l;", "Lj21/j1;", "<anonymous>", "(Ldx/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<dx.i<? extends dx.b, ? extends h1.a>, k10.c0<j1.a>, tq.e<? super k10.l<? extends j1>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98798g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j1.Error V(dx.b bVar, m1 m1Var, j1.a aVar) {
            return new j1.Error(bVar, m1Var.data.getQuestion());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j1.a.Answer X(h1.a aVar, j1.a aVar2) {
            return new j1.a.Answer(aVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f98797f;
            k10.c0 c0Var = (k10.c0) this.f98798g;
            uq.b.e();
            if (this.f98796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final m1 m1Var = m1.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: j21.n1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m1.b.V(bVar, m1Var, (j1.a) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final h1.a aVar = (h1.a) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: j21.o1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.b.X(aVar, (j1.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, ? extends h1.a> iVar, k10.c0<j1.a> c0Var, tq.e<? super k10.l<? extends j1>> eVar) {
            b bVar = m1.this.new b(eVar);
            bVar.f98797f = iVar;
            bVar.f98798g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lj21/m1$c;", "", "Lj21/m1$c$a;", "data", "Lj21/m1;", "a", "(Lj21/m1$c$a;)Lj21/m1;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: j21.m1$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, d2 = {"Lj21/m1$c$a;", "", "Liy/b0;", "conversationId", "", "question", "", "lastMessageCount", "<init>", "(Liy/b0;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "c", "I", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f98800d = iy.b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 conversationId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String question;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int lastMessageCount;

            public SetupData(iy.b0 b0Var, String str, int i15) {
                this.conversationId = b0Var;
                this.question = str;
                this.lastMessageCount = i15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final iy.b0 getConversationId() {
                return this.conversationId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getLastMessageCount() {
                return this.lastMessageCount;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getQuestion() {
                return this.question;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupData)) {
                    return false;
                }
                SetupData setupData = (SetupData) other;
                return fr.t.c(this.conversationId, setupData.conversationId) && fr.t.c(this.question, setupData.question) && this.lastMessageCount == setupData.lastMessageCount;
            }

            public int hashCode() {
                return (((this.conversationId.hashCode() * 31) + this.question.hashCode()) * 31) + Integer.hashCode(this.lastMessageCount);
            }

            public String toString() {
                return "SetupData(conversationId=" + this.conversationId + ", question=" + this.question + ", lastMessageCount=" + this.lastMessageCount + ')';
            }
        }

        m1 a(SetupData data);
    }

    public m1(c.SetupData setupData, e21.a aVar, k21.p pVar) {
        super(j1.a.b.f98771a);
        this.data = setupData;
        this.interactor = aVar;
        this.streamMessagesMapper = pVar;
        g(new er.l() { // from class: j21.k1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.j(this.f98777a, (k10.v) obj);
            }
        });
    }

    public static oq.i0 i(m1 m1Var, k10.z zVar) {
        k10.k.m(zVar, mu.i.r(mu.i.Y(m1Var.interactor.a(m1Var.data.getConversationId(), m1Var.data.getQuestion()), new dx.i.Right(new h1.a.Part("")), m1Var.new a(null)), 1), null, m1Var.new b(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final m1 m1Var, k10.v vVar) {
        vVar.c(fr.q0.c(j1.a.class), new er.l() { // from class: j21.l1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.i(this.f98782a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }
}
