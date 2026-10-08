package l00;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.u0;
import er.l;
import k10.t;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00028\u0001H\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012\"\u0004\b\u0002\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ll00/g;", "", "STATE", "ACTION", "Landroidx/lifecycle/t0;", "<init>", "()V", "event", "Loq/i0;", "f9", "(Ljava/lang/Object;)V", "d9", "Lkotlin/Function0;", "b9", "(Ljava/lang/Object;)Ler/a;", "T", "Lmu/g;", "initialState", "Lmu/p0;", "a9", "(Lmu/g;Ljava/lang/Object;)Lmu/p0;", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g<STATE, ACTION> extends t0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g<STATE, ACTION> f113956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ACTION f113957g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<STATE, ACTION> gVar, ACTION action, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f113956f = gVar;
            this.f113957g = action;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113955e;
            if (i15 == 0) {
                u.b(obj);
                t<STATE, ACTION> tVarE9 = this.f113956f.e9();
                ACTION action = this.f113957g;
                this.f113955e = 1;
                if (tVarE9.a(action, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new a(this.f113956f, this.f113957g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c9(g gVar, Object obj) {
        gVar.f9(obj);
        return i0.f148189a;
    }

    private final void f9(ACTION event) {
        i00.a.a(this, new a(this, event, null));
    }

    protected final <T> p0<T> a9(mu.g<? extends T> gVar, T t15) {
        return g00.b.a(gVar, t15, u0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final er.a<i0> b9(final ACTION action) {
        return new er.a() { // from class: l00.f
            @Override // er.a
            public final Object a() {
                return g.c9(this.f113953a, action);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d9(ACTION action) {
        f9(action);
    }

    protected abstract t<STATE, ACTION> e9();
}
