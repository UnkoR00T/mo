package u4;

import java.util.List;
import ju.d2;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lu4/u;", "", "Lu4/h;", "asyncTypefaceCache", "Ltq/i;", "injectedContext", "<init>", "(Lu4/h;Ltq/i;)V", "Lu4/x0;", "typefaceRequest", "Lu4/k0;", "platformFontLoader", "Lkotlin/Function1;", "Lu4/a1$b;", "Loq/i0;", "onAsyncCompletion", "createDefaultTypeface", "Lu4/a1;", "a", "(Lu4/x0;Lu4/k0;Ler/l;Ler/l;)Lu4/a1;", "Lu4/h;", "Lju/p0;", "b", "Lju/p0;", "asyncLoadScope", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f195289d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x f195290e = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ju.m0 f195291f = new c(ju.m0.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h asyncTypefaceCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ju.p0 asyncLoadScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f195295f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f195295f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195294e;
            if (i15 == 0) {
                oq.u.b(obj);
                g gVar = this.f195295f;
                this.f195294e = 1;
                if (gVar.t(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f195295f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"u4/u$c", "Ltq/a;", "Lju/m0;", "Ltq/i;", "context", "", "exception", "Loq/i0;", "i1", "(Ltq/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends tq.a implements ju.m0 {
        public c(ju.m0.Companion companion) {
            super(companion);
        }

        @Override // ju.m0
        public void i1(tq.i context, Throwable exception) {
        }
    }

    public u(h hVar, tq.i iVar) {
        this.asyncTypefaceCache = hVar;
        this.asyncLoadScope = ju.q0.a(f195291f.n0(y4.o.a()).n0(iVar).n0(z2.a((d2) iVar.m(d2.INSTANCE))));
    }

    public a1 a(TypefaceRequest typefaceRequest, k0 platformFontLoader, er.l<? super a1.b, oq.i0> onAsyncCompletion, er.l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        oq.r rVarB = v.b(f195290e.a(((FontListFontFamily) typefaceRequest.getFontFamily()).i(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) rVarB.a();
        Object objB = rVarB.b();
        if (list == null) {
            return new a1.b(objB, false, 2, null);
        }
        g gVar = new g(list, objB, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        ju.k.d(this.asyncLoadScope, null, ju.r0.UNDISPATCHED, new b(gVar, null), 1, null);
        return new a1.a(gVar);
    }

    public /* synthetic */ u(h hVar, tq.i iVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new h() : hVar, (i15 & 2) != 0 ? tq.j.f191408a : iVar);
    }
}
