package yb;

import ac.n;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import er.p;
import java.util.List;
import ju.d2;
import ju.l0;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016*$\b\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¨\u0006\u001c"}, d2 = {"Lyb/l;", "Lcc/i0;", "spec", "Lju/l0;", "dispatcher", "Lyb/i;", "listener", "Lju/d2;", "e", "(Lyb/l;Lcc/i0;Lju/l0;Lyb/i;)Lju/d2;", "Lac/n;", "trackers", "", "Lzb/e;", "d", "(Lac/n;)Ljava/util/List;", "Landroid/content/Context;", "context", "Lyb/g;", "a", "(Landroid/content/Context;)Lyb/g;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lyb/b;", "Loq/i0;", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f225949a = w.i("WorkConstraintsTracker");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l f225951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ cc.i0 f225952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f225953h;

        /* JADX INFO: renamed from: yb.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C6054a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f225954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ cc.i0 f225955b;

            C6054a(i iVar, cc.i0 i0Var) {
                this.f225954a = iVar;
                this.f225955b = i0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(b bVar, tq.e<? super i0> eVar) {
                this.f225954a.a(this.f225955b, bVar);
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, cc.i0 i0Var, i iVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f225951f = lVar;
            this.f225952g = i0Var;
            this.f225953h = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225950e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<b> gVarA = this.f225951f.a(this.f225952g);
                C6054a c6054a = new C6054a(this.f225953h, this.f225952g);
                this.f225950e = 1;
                if (gVarA.a(c6054a, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f225951f, this.f225952g, this.f225953h, eVar);
        }
    }

    public static final g a(Context context) {
        return new g((ConnectivityManager) context.getSystemService("connectivity"), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<zb.e> d(n nVar) {
        List<zb.e> listT = v.t(new zb.c(nVar.a()), new zb.d(nVar.getBatteryNotLowTracker()), new zb.j(nVar.e()));
        if (Build.VERSION.SDK_INT >= 28) {
            listT.add(a(nVar.getContext()));
            return listT;
        }
        listT.addAll(v.q(new zb.f(nVar.d()), new zb.i(nVar.d()), new zb.h(nVar.d()), new zb.g(nVar.d())));
        return listT;
    }

    public static final d2 e(l lVar, cc.i0 i0Var, l0 l0Var, i iVar) {
        return ju.k.d(q0.a(l0Var), null, null, new a(lVar, i0Var, iVar, null), 3, null);
    }
}
