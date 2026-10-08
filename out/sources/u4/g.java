package u4;

import java.util.List;
import java.util.concurrent.CancellationException;
import ju.g2;
import ju.g3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lu4/g;", "Lm2/f6;", "", "", "Lu4/k;", "fontList", "initialType", "Lu4/x0;", "typefaceRequest", "Lu4/h;", "asyncTypefaceCache", "Lkotlin/Function1;", "Lu4/a1$b;", "Loq/i0;", "onCompletion", "Lu4/k0;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Lu4/x0;Lu4/h;Ler/l;Lu4/k0;)V", "t", "(Ltq/e;)Ljava/lang/Object;", "y", "(Lu4/k;Ltq/e;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "Lu4/x0;", "c", "Lu4/h;", "d", "Ler/l;", "e", "Lu4/k0;", "<set-?>", "f", "Lm2/a3;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "l", "()Z", "setCacheable$ui_text", "(Z)V", "cacheable", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f6<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<k> fontList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h asyncTypefaceCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<a1.b, oq.i0> onCompletion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 platformFontLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f195229h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f195231k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195229h = obj;
            this.f195231k |= PKIFailureInfo.systemUnavail;
            return g.this.t(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.k implements er.l<tq.e<? super Object>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195232e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f195234g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f195234g = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195232e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            g gVar = g.this;
            k kVar = this.f195234g;
            this.f195232e = 1;
            Object objY = gVar.y(kVar, this);
            return objY == objE ? objE : objY;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return g.this.new b(this.f195234g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<Object> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195236e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195238g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195236e = obj;
            this.f195238g |= PKIFailureInfo.systemUnavail;
            return g.this.y(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super Object>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195239e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f195241g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f195241g = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195239e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            k0 k0Var = g.this.platformFontLoader;
            k kVar = this.f195241g;
            this.f195239e = 1;
            Object objC = k0Var.c(kVar, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<Object> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new d(this.f195241g, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends k> list, Object obj, TypefaceRequest typefaceRequest, h hVar, er.l<? super a1.b, oq.i0> lVar, k0 k0Var) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = hVar;
        this.onCompletion = lVar;
        this.platformFontLoader = k0Var;
        this.value = c6.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // p076m2.f6
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #0 {all -> 0x00e9, blocks: (B:27:0x0067, B:29:0x007e), top: B:48:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:14:0x0034, B:34:0x00a0, B:37:0x00d4, B:21:0x0050, B:24:0x005a), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:14:0x0034, B:34:0x00a0, B:37:0x00d4, B:21:0x0050, B:24:0x005a), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007c -> B:43:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e2 -> B:40:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(tq.e<? super oq.i0> r15) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.g.t(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(k kVar, tq.e<Object> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f195238g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f195238g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f195236e;
        Object objE = uq.b.e();
        int i16 = cVar.f195238g;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            d dVar = new d(kVar, null);
            cVar.f195235d = kVar;
            cVar.f195238g = 1;
            Object objE2 = g3.e(15000L, dVar, cVar);
            return objE2 == objE ? objE : objE2;
        } catch (CancellationException e15) {
            if (!g2.n(cVar.getContext())) {
                throw e15;
            }
            return null;
        } catch (Exception e16) {
            ju.m0 m0Var = (ju.m0) cVar.getContext().m(ju.m0.INSTANCE);
            if (m0Var != null) {
                m0Var.i1(cVar.getContext(), new IllegalStateException("Unable to load font " + kVar, e16));
            }
            return null;
        }
    }
}
