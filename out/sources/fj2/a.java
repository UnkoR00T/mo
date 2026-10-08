package fj2;

import ay.j;
import dx.b;
import dx.i;
import er.p;
import fr.q0;
import ju.g1;
import ju.p0;
import k34.WruDocumentData;
import kj2.LocalDocumentDataWrapped;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lfj2/a;", "Lpi2/a;", "Lay/j;", "jsonSerializer", "<init>", "(Lay/j;)V", "", "data", "Ldx/i;", "Ldx/b;", "Lk34/k0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lay/j;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements pi2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: fj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lk34/k0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C1433a extends k implements p<p0, e<? super i<? extends b.Generic, ? extends WruDocumentData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64277e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f64279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1433a(String str, e<? super C1433a> eVar) {
            super(2, eVar);
            this.f64279g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f64277e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                return new i.Right(gj2.a.a((LocalDocumentDataWrapped) a.this.jsonSerializer.a(this.f64279g, q0.n(LocalDocumentDataWrapped.class))));
            } catch (Exception e15) {
                return new i.Left(new b.Generic(e15));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<b.Generic, WruDocumentData>> eVar) {
            return ((C1433a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return a.this.new C1433a(this.f64279g, eVar);
        }
    }

    public a(j jVar) {
        this.jsonSerializer = jVar;
    }

    @Override // pi2.a
    public Object a(String str, e<? super i<? extends b, WruDocumentData>> eVar) {
        return ju.i.g(g1.b(), new C1433a(str, null), eVar);
    }
}
