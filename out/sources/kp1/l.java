package kp1;

import k10.t;
import k10.v;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkp1/l;", "Ll00/g;", "Lkp1/i;", "", "Lkp1/j;", "Lyy/a;", "stateMachineFactory", "Lkp1/f;", "mapper", "<init>", "(Lyy/a;Lkp1/f;)V", "Lkp1/j$a;", "i9", "()Lkp1/j$a;", "b", "Lkp1/f;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<i, Object> implements j, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<i, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<j.Data> state = a9(new a(e9().getState(), this), i9());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<Object> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f112160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f112161b;

        /* JADX INFO: renamed from: kp1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2707a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f112162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f112163b;

            /* JADX INFO: renamed from: kp1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2708a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f112164d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f112165e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f112166f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f112168h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f112169j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f112170k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f112171l;

                public C2708a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f112164d = obj;
                    this.f112165e |= PKIFailureInfo.systemUnavail;
                    return C2707a.this.F(null, this);
                }
            }

            public C2707a(mu.h hVar, l lVar) {
                this.f112162a = hVar;
                this.f112163b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2708a c2708a;
                if (eVar instanceof C2708a) {
                    c2708a = (C2708a) eVar;
                    int i15 = c2708a.f112165e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2708a.f112165e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2708a = new C2708a(eVar);
                    }
                } else {
                    c2708a = new C2708a(eVar);
                }
                Object obj2 = c2708a.f112164d;
                Object objE = uq.b.e();
                int i16 = c2708a.f112165e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f112162a;
                    j.Data dataI9 = this.f112163b.i9();
                    c2708a.f112166f = vq.j.a(obj);
                    c2708a.f112168h = vq.j.a(c2708a);
                    c2708a.f112169j = vq.j.a(obj);
                    c2708a.f112170k = vq.j.a(hVar);
                    c2708a.f112171l = 0;
                    c2708a.f112165e = 1;
                    if (hVar.F(dataI9, c2708a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f112160a = gVar;
            this.f112161b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.Data> hVar, tq.e eVar) {
            Object objA = this.f112160a.a(new C2707a(hVar, this.f112161b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public l(yy.a aVar, f fVar) {
        this.mapper = fVar;
        this.stateMachine = aVar.a(i.f112151a, new er.l() { // from class: kp1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.k9((v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.Data i9() {
        return this.mapper.b(f.a.f112146a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(v vVar) {
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<Object> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(j.Data data) {
        super.P5(data);
    }
}
