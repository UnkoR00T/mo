package o20;

import java.time.OffsetDateTime;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017R\u0018\u0010\u001c\u001a\u00020\u000b*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/t2;", "Lo20/s2;", "Lo20/t2$a;", "deps", "Lju/p0;", "scope", "<init>", "(Lo20/t2$a;Lju/p0;)V", "a", "Lo20/t2$a;", "Lmu/p0;", "Lmx/a;", "b", "Lmu/p0;", "()Lmu/p0;", "currentTime", "Lmu/g;", "", "c", "Lmu/g;", "w", "()Lmu/g;", "rotation", "()Lmx/a;", "currentTimeLabel", "Ljava/time/OffsetDateTime;", "d", "(Ljava/time/OffsetDateTime;)Lmx/a;", AnnotatedPrivateKey.LABEL, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t2 implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a deps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<Label> currentTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mu.g<Float> rotation;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo20/t2$a;", "", "Lez/g;", "ticker", "Luy/a;", "accelerometerManager", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lez/g;Luy/a;Lez/a;Lez/e;)V", "a", "Lez/g;", "d", "()Lez/g;", "b", "Luy/a;", "()Luy/a;", "c", "Lez/a;", "()Lez/a;", "Lez/e;", "()Lez/e;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ez.g ticker;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final uy.a accelerometerManager;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ez.a currentTimeProvider;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ez.e dateFormatter;

        public a(ez.g gVar, uy.a aVar, ez.a aVar2, ez.e eVar) {
            this.ticker = gVar;
            this.accelerometerManager = aVar;
            this.currentTimeProvider = aVar2;
            this.dateFormatter = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final uy.a getAccelerometerManager() {
            return this.accelerometerManager;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ez.a getCurrentTimeProvider() {
            return this.currentTimeProvider;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ez.e getDateFormatter() {
            return this.dateFormatter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ez.g getTicker() {
            return this.ticker;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<Label> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f141009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t2 f141010b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f141011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t2 f141012b;

            /* JADX INFO: renamed from: o20.t2$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3483a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f141013d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f141014e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f141015f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f141017h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f141018j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f141019k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f141020l;

                public C3483a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f141013d = obj;
                    this.f141014e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t2 t2Var) {
                this.f141011a = hVar;
                this.f141012b = t2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3483a c3483a;
                if (eVar instanceof C3483a) {
                    c3483a = (C3483a) eVar;
                    int i15 = c3483a.f141014e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3483a.f141014e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3483a = new C3483a(eVar);
                    }
                } else {
                    c3483a = new C3483a(eVar);
                }
                Object obj2 = c3483a.f141013d;
                Object objE = uq.b.e();
                int i16 = c3483a.f141014e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f141011a;
                    ((gu.b) obj).getRawValue();
                    Label labelC = this.f141012b.c();
                    c3483a.f141015f = vq.j.a(obj);
                    c3483a.f141017h = vq.j.a(c3483a);
                    c3483a.f141018j = vq.j.a(obj);
                    c3483a.f141019k = vq.j.a(hVar);
                    c3483a.f141020l = 0;
                    c3483a.f141014e = 1;
                    if (hVar.F(labelC, c3483a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, t2 t2Var) {
            this.f141009a = gVar;
            this.f141010b = t2Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super Label> hVar, tq.e eVar) {
            Object objA = this.f141009a.a(new a(hVar, this.f141010b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public t2(a aVar, ju.p0 p0Var) {
        this.deps = aVar;
        this.currentTime = mu.i.b0(new b(ez.g.b(aVar.getTicker(), 0L, 1, null), this), p0Var, mu.l0.Companion.b(mu.l0.INSTANCE, 0L, 0L, 3, null), c());
        this.rotation = aVar.getAccelerometerManager().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label c() {
        return d(this.deps.getCurrentTimeProvider().f());
    }

    private final Label d(OffsetDateTime offsetDateTime) {
        return c70.a.f23835a.a().n(this.deps.getDateFormatter().d(new fz.b.OffsetDateTime(offsetDateTime), fz.c.DOTTED_TIME_PLUS_DATE));
    }

    @Override // o20.s2
    public mu.p0<Label> a() {
        return this.currentTime;
    }

    @Override // o20.s2
    public mu.g<Float> w() {
        return this.rotation;
    }
}
