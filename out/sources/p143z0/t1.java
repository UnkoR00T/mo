package p143z0;

import a4.PointerInputChange;
import a4.o;
import c5.d;
import c5.y;
import er.p;
import java.util.List;
import ju.p0;
import ju.z2;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0014\u001a\u00020\u00072\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e\"\u0004\b\u001f\u0010\u000eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lz0/t1;", "", "Lz0/a3;", "scrollingLogic", "Lkotlin/Function2;", "Lc5/y;", "Ltq/e;", "Loq/i0;", "onScrollStopped", "Lc5/d;", "density", "<init>", "(Lz0/a3;Ler/p;Lc5/d;)V", "g", "(Lc5/d;)V", "La4/o;", "a", "(La4/o;)V", "Lz0/s1;", "block", "h", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "Lz0/a3;", "d", "()Lz0/a3;", "b", "Ler/p;", "c", "()Ler/p;", "Lc5/d;", "()Lc5/d;", "setDensity", "", "Z", "f", "()Z", "setScrolling$foundation", "(Z)V", "isScrolling", "Lz0/k0;", "e", "Lz0/k0;", "()Lz0/k0;", "velocityTracker", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 scrollingLogic;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<y, e<? super i0>, Object> onScrollStopped;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d density;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isScrolling;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 velocityTracker = new k0();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231713d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231715f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231713d = obj;
            this.f231715f |= PKIFailureInfo.systemUnavail;
            return t1.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231716e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<s1, e<? super i0>, Object> f231718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super s1, ? super e<? super i0>, ? extends Object> pVar, e<? super b> eVar) {
            super(2, eVar);
            this.f231718g = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231716e;
            if (i15 == 0) {
                u.b(obj);
                a3 scrollingLogic = t1.this.getScrollingLogic();
                z1 z1Var = z1.UserInput;
                p<s1, e<? super i0>, Object> pVar = this.f231718g;
                this.f231716e = 1;
                if (scrollingLogic.B(z1Var, pVar, this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return t1.this.new b(this.f231718g, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t1(a3 a3Var, p<? super y, ? super e<? super i0>, ? extends Object> pVar, d dVar) {
        this.scrollingLogic = a3Var;
        this.onScrollStopped = pVar;
        this.density = dVar;
    }

    public final void a(o oVar) {
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            listC.get(i15).a();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected final d getDensity() {
        return this.density;
    }

    protected final p<y, e<? super i0>, Object> c() {
        return this.onScrollStopped;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final a3 getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k0 getVelocityTracker() {
        return this.velocityTracker;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsScrolling() {
        return this.isScrolling;
    }

    public final void g(d density) {
        this.density = density;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(p<? super s1, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231715f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231715f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f231713d;
        Object objE = uq.b.e();
        int i16 = aVar.f231715f;
        if (i16 == 0) {
            u.b(obj);
            this.isScrolling = true;
            b bVar = new b(pVar, null);
            aVar.f231715f = 1;
            if (z2.c(bVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.isScrolling = false;
        return i0.f148189a;
    }
}
