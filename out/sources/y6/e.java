package y6;

import er.p;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly6/e;", "Lu6/i;", "Ly6/h;", "delegate", "<init>", "(Lu6/i;)V", "Lkotlin/Function2;", "Ltq/e;", "", "transform", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "Lu6/i;", "Lmu/g;", "getData", "()Lmu/g;", "data", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements u6.i<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u6.i<h> delegate;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6/h;", "it", "<anonymous>", "(Ly6/h;)Ly6/h;"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements p<h, tq.e<? super h>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<h, tq.e<? super h>, Object> f224376g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super h, ? super tq.e<? super h>, ? extends Object> pVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f224376g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224374e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = (h) this.f224375f;
                p<h, tq.e<? super h>, Object> pVar = this.f224376g;
                this.f224374e = 1;
                obj = pVar.B(hVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            h hVar2 = (h) obj;
            ((d) hVar2).h();
            return hVar2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h hVar, tq.e<? super h> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f224376g, eVar);
            aVar.f224375f = obj;
            return aVar;
        }
    }

    public e(u6.i<h> iVar) {
        this.delegate = iVar;
    }

    @Override // u6.i
    public Object a(p<? super h, ? super tq.e<? super h>, ? extends Object> pVar, tq.e<? super h> eVar) {
        return this.delegate.a(new a(pVar, null), eVar);
    }

    @Override // u6.i
    public mu.g<h> getData() {
        return this.delegate.getData();
    }
}
