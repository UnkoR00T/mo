package y6;

import er.p;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu6/i;", "Ly6/h;", "Lkotlin/Function2;", "Ly6/d;", "Ltq/e;", "Loq/i0;", "", "transform", "a", "(Lu6/i;Ler/p;Ltq/e;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6/h;", "it", "<anonymous>", "(Ly6/h;)Ly6/h;"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements p<h, tq.e<? super h>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<d, tq.e<? super i0>, Object> f224386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f224386g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224384e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d dVar = (d) this.f224385f;
                u.b(obj);
                return dVar;
            }
            u.b(obj);
            d dVarC = ((h) this.f224385f).c();
            p<d, tq.e<? super i0>, Object> pVar = this.f224386g;
            this.f224385f = dVarC;
            this.f224384e = 1;
            return pVar.B(dVarC, this) == objE ? objE : dVarC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h hVar, tq.e<? super h> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f224386g, eVar);
            aVar.f224385f = obj;
            return aVar;
        }
    }

    public static final Object a(u6.i<h> iVar, p<? super d, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super h> eVar) {
        return iVar.a(new a(pVar, null), eVar);
    }
}
