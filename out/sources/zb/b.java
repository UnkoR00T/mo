package zb;

import er.p;
import lu.w;
import oq.i0;
import oq.u;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128$X¤\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzb/b;", "T", "Lzb/e;", "Lac/h;", "tracker", "<init>", "(Lac/h;)V", "value", "", "e", "(Ljava/lang/Object;)Z", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "Lmu/g;", "Lyb/b;", "a", "(Lub/d;)Lmu/g;", "Lac/h;", "", "d", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lyb/b;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<w<? super yb.b>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f234013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b<T> f234014g;

        /* JADX INFO: renamed from: zb.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"zb/b$a$a", "Lyb/a;", "newValue", "Loq/i0;", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C6307a implements yb.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<T> f234015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w<yb.b> f234016b;

            /* JADX WARN: Multi-variable type inference failed */
            C6307a(b<T> bVar, w<? super yb.b> wVar) {
                this.f234015a = bVar;
                this.f234016b = wVar;
            }

            @Override // yb.a
            public void a(T newValue) {
                this.f234016b.H().d(this.f234015a.e(newValue) ? new yb.b.ConstraintsNotMet(this.f234015a.d()) : yb.b.a.f225911a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f234014g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(b bVar, C6307a c6307a) {
            bVar.tracker.g(c6307a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234012e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = (w) this.f234013f;
                final C6307a c6307a = new C6307a(this.f234014g, wVar);
                ((b) this.f234014g).tracker.c(c6307a);
                final b<T> bVar = this.f234014g;
                er.a aVar = new er.a() { // from class: zb.a
                    @Override // er.a
                    public final Object a() {
                        return b.a.O(bVar, c6307a);
                    }
                };
                this.f234012e = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super yb.b> wVar, tq.e<? super i0> eVar) {
            return ((a) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f234014g, eVar);
            aVar.f234013f = obj;
            return aVar;
        }
    }

    public b(ac.h<T> hVar) {
        this.tracker = hVar;
    }

    @Override // zb.e
    public mu.g<yb.b> a(ub.d constraints) {
        return mu.i.e(new a(this, null));
    }

    /* JADX INFO: renamed from: d */
    protected abstract int getReason();

    protected abstract boolean e(T value);
}
