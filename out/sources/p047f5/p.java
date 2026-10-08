package p047f5;

import android.os.Handler;
import android.os.Looper;
import c3.m0;
import er.l;
import fr.t;
import fr.w;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p036e4.v0;
import p071kotlin.Metadata;
import p076m2.u4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\"\u0010$\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lf5/p;", "Lf5/o;", "Lm2/u4;", "Lf5/l;", "scope", "<init>", "(Lf5/l;)V", "Lf5/d0;", "state", "", "Le4/v0;", "measurables", "Loq/i0;", "b", "(Lf5/d0;Ljava/util/List;)V", "", "a", "(Ljava/util/List;)Z", "c", "()V", "e", "d", "Lf5/l;", "i", "()Lf5/l;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lc3/m0;", "Lc3/m0;", "observer", "Z", "getKnownDirty", "()Z", "j", "(Z)V", "knownDirty", "Lkotlin/Function1;", "Ler/l;", "onCommitAffectingConstrainLambdas", "", "Lf5/k;", "f", "Ljava/util/List;", "previousDatas", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p implements o, u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 observer = new m0(new Function0());

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean knownDirty = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<i0, i0> onCommitAffectingConstrainLambdas = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<k> previousDatas = new ArrayList();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<v0> f59246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f59247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f59248d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends v0> list, p pVar, d0 d0Var) {
            super(0);
            this.f59246b = list;
            this.f59247c = pVar;
            this.f59248d = d0Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            List<v0> list = this.f59246b;
            p pVar = this.f59247c;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object parentData = list.get(i15).getParentData();
                k kVar = parentData instanceof k ? (k) parentData : null;
                if (kVar != null) {
                    f ref = kVar.getRef();
                    kVar.a().b(new e(ref.getId(), pVar.getScope().b(ref)));
                }
                pVar.previousDatas.add(kVar);
            }
            this.f59247c.getScope().a(this.f59248d);
        }
    }

    /* JADX INFO: renamed from: f5.p$b, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "it", "e", "(Ler/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class Function0 extends w implements l<er.a<? extends i0>, i0> {
        Function0() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(er.a aVar) {
            aVar.a();
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(er.a<? extends i0> aVar) {
            e(aVar);
            return i0.f148189a;
        }

        public final void e(final er.a<i0> aVar) {
            if (t.c(Looper.myLooper(), Looper.getMainLooper())) {
                aVar.a();
                return;
            }
            Handler handler = p.this.handler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                p.this.handler = handler;
            }
            handler.post(new Runnable() { // from class: f5.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.Function0.f(aVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loq/i0;", "<anonymous parameter 0>", "c", "(Loq/i0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends w implements l<i0, i0> {
        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(i0 i0Var) {
            p.this.j(true);
        }
    }

    public p(l lVar) {
        this.scope = lVar;
    }

    @Override // p047f5.o
    public boolean a(List<? extends v0> measurables) {
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object parentData = measurables.get(i15).getParentData();
            if (!t.c(parentData instanceof k ? (k) parentData : null, this.previousDatas.get(i15))) {
                return true;
            }
        }
        return false;
    }

    @Override // p047f5.o
    public void b(d0 state, List<? extends v0> measurables) {
        this.previousDatas.clear();
        this.observer.k(i0.f148189a, this.onCommitAffectingConstrainLambdas, new a(measurables, this, state));
        this.knownDirty = false;
    }

    @Override // p076m2.u4
    public void c() {
        this.observer.q();
    }

    @Override // p076m2.u4
    public void d() {
    }

    @Override // p076m2.u4
    public void e() {
        this.observer.r();
        this.observer.f();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final l getScope() {
        return this.scope;
    }

    public final void j(boolean z15) {
        this.knownDirty = z15;
    }
}
