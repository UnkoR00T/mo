package to0;

import dx.i;
import er.l;
import ge4.x;
import oo0.Topic;
import oq.i0;
import oq.k;
import oq.u;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import so0.AddSuggestionRequestDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lto0/d;", "Lvo0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Loo0/u$b;", "topicType", "", "description", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Loo0/u$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lqo0/b;", "b", "Loq/k;", "e", "()Lqo0/b;", "client", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements vo0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191272e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Topic.b f191274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f191275h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Topic.b bVar, String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f191274g = bVar;
            this.f191275h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191272e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.b bVarE = d.this.e();
            AddSuggestionRequestDto addSuggestionRequestDto = new AddSuggestionRequestDto(this.f191275h, ro0.b.h(this.f191274g));
            this.f191272e = 1;
            Object objA = bVarE.a(addSuggestionRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new a(this.f191274g, this.f191275h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: to0.c
            @Override // er.a
            public final Object a() {
                return d.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qo0.b d(w wVar) {
        return (qo0.b) w.b(wVar, null, qo0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qo0.b e() {
        return (qo0.b) this.client.getValue();
    }

    @Override // vo0.b
    public Object a(Topic.b bVar, String str, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(bVar, str, null), eVar);
    }
}
