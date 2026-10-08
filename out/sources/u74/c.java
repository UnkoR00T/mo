package u74;

import mu.b0;
import mu.g;
import mu.h;
import mu.i;
import mu.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu74/c;", "Lz74/b;", "<init>", "()V", "Loq/i0;", "c", "d", "", "newValue", "a", "(I)V", "Lmu/b0;", "Lmu/b0;", "unreadNotificationsCount", "Lmu/g;", "", "b", "Lmu/g;", "()Lmu/g;", "hasUnreadNotifications", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements z74.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<Integer> unreadNotificationsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g<Boolean> hasUnreadNotifications;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements g<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f196260a;

        /* JADX INFO: renamed from: u74.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5107a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f196261a;

            /* JADX INFO: renamed from: u74.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5108a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196262d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196263e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196264f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196266h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196267j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196268k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196269l;

                public C5108a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196262d = obj;
                    this.f196263e |= PKIFailureInfo.systemUnavail;
                    return C5107a.this.F(null, this);
                }
            }

            public C5107a(h hVar) {
                this.f196261a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5108a c5108a;
                if (eVar instanceof C5108a) {
                    c5108a = (C5108a) eVar;
                    int i15 = c5108a.f196263e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5108a.f196263e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5108a = new C5108a(eVar);
                    }
                } else {
                    c5108a = new C5108a(eVar);
                }
                Object obj2 = c5108a.f196262d;
                Object objE = uq.b.e();
                int i16 = c5108a.f196263e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f196261a;
                    Boolean boolA = vq.b.a(((Number) obj).intValue() > 0);
                    c5108a.f196264f = j.a(obj);
                    c5108a.f196266h = j.a(c5108a);
                    c5108a.f196267j = j.a(obj);
                    c5108a.f196268k = j.a(hVar);
                    c5108a.f196269l = 0;
                    c5108a.f196263e = 1;
                    if (hVar.F(boolA, c5108a) == objE) {
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

        public a(g gVar) {
            this.f196260a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super Boolean> hVar, tq.e eVar) {
            Object objA = this.f196260a.a(new C5107a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public c() {
        b0<Integer> b0VarA = r0.a(0);
        this.unreadNotificationsCount = b0VarA;
        this.hasUnreadNotifications = i.p(new a(b0VarA));
    }

    @Override // z74.b
    public void a(int newValue) {
        Integer value;
        b0<Integer> b0Var = this.unreadNotificationsCount;
        do {
            value = b0Var.getValue();
            value.intValue();
        } while (!b0Var.s(value, Integer.valueOf(newValue)));
    }

    @Override // z74.b
    public g<Boolean> b() {
        return this.hasUnreadNotifications;
    }

    @Override // z74.b
    public void c() {
        Integer value;
        b0<Integer> b0Var = this.unreadNotificationsCount;
        do {
            value = b0Var.getValue();
        } while (!b0Var.s(value, Integer.valueOf(value.intValue() + 1)));
    }

    @Override // z74.b
    public void d() {
        Integer value;
        b0<Integer> b0Var = this.unreadNotificationsCount;
        do {
            value = b0Var.getValue();
        } while (!b0Var.s(value, Integer.valueOf(value.intValue() - 1)));
    }
}
