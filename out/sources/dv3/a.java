package dv3;

import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ldv3/a;", "Lty/b;", "Loq/i0;", "Lmx/a;", "Lez/g;", "ticker", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lez/g;Lez/a;Lez/e;)V", "f", "()Lmx/a;", "a", "Lez/a;", "getCurrentTimeProvider", "()Lez/a;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "Lxw/b;", "c", "Lxw/b;", "getEvent", "()Lxw/b;", "event", "d", "getCommand", "command", "Lmu/g;", "e", "Lmu/g;", "g", "()Lmu/g;", "state", "documentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ty.b<i0, Label, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i0> event = new xw.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i0> command = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mu.g<Label> state;

    /* JADX INFO: renamed from: dv3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1014a implements mu.g<Label> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f44678b;

        /* JADX INFO: renamed from: dv3.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1015a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44679a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f44680b;

            /* JADX INFO: renamed from: dv3.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1016a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44681d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44682e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44683f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44685h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44686j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44687k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44688l;

                public C1016a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44681d = obj;
                    this.f44682e |= PKIFailureInfo.systemUnavail;
                    return C1015a.this.F(null, this);
                }
            }

            public C1015a(mu.h hVar, a aVar) {
                this.f44679a = hVar;
                this.f44680b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1016a c1016a;
                if (eVar instanceof C1016a) {
                    c1016a = (C1016a) eVar;
                    int i15 = c1016a.f44682e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1016a.f44682e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1016a = new C1016a(eVar);
                    }
                } else {
                    c1016a = new C1016a(eVar);
                }
                Object obj2 = c1016a.f44681d;
                Object objE = uq.b.e();
                int i16 = c1016a.f44682e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f44679a;
                    ((gu.b) obj).getRawValue();
                    Label labelF = this.f44680b.f();
                    c1016a.f44683f = vq.j.a(obj);
                    c1016a.f44685h = vq.j.a(c1016a);
                    c1016a.f44686j = vq.j.a(obj);
                    c1016a.f44687k = vq.j.a(hVar);
                    c1016a.f44688l = 0;
                    c1016a.f44682e = 1;
                    if (hVar.F(labelF, c1016a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public C1014a(mu.g gVar, a aVar) {
            this.f44677a = gVar;
            this.f44678b = aVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Label> hVar, tq.e eVar) {
            Object objA = this.f44677a.a(new C1015a(hVar, this.f44678b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public a(ez.g gVar, ez.a aVar, ez.e eVar) {
        this.currentTimeProvider = aVar;
        this.dateFormatter = eVar;
        this.state = new C1014a(ez.g.b(gVar, 0L, 1, null), this);
    }

    public final Label f() {
        return c70.a.f23835a.a().n(this.dateFormatter.d(new fz.b.OffsetDateTime(this.currentTimeProvider.f()), fz.c.DOTTED_TIME_PLUS_DATE));
    }

    public mu.g<Label> g() {
        return this.state;
    }
}
