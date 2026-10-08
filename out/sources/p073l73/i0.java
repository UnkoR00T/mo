package p073l73;

import android.graphics.Bitmap;
import androidx.p016lifecycle.u0;
import er.p;
import er.q;
import fr.q0;
import h64.r;
import ib4.c;
import java.util.List;
import k10.c0;
import k10.l;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import k73.Document;
import k73.StudentCardData;
import mu.p0;
import n20.State;
import n20.a;
import o20.t2;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 J2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001KBQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R,\u0010D\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Ll73/i0;", "Ll00/g;", "Ln20/b;", "Ll73/j;", "Ln20/a;", "Ll73/k;", "", "Ln20/j;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lm73/b;", "studentCardDialogMapper", "Lm73/g;", "studentCardDocumentMapper", "Lo20/t2$a;", "deps", "Lh64/r;", "loadServicesUseCase", "Lj73/a;", "studentCardContainersInteractor", "Lwz/a;", "barcodeGenerator", "<init>", "(Ln20/j;Lib4/c;Lac4/a;Lm73/b;Lm73/g;Lo20/t2$a;Lh64/r;Lj73/a;Lwz/a;)V", "state", "Ll73/k$a;", "y9", "(Ln20/b;)Ll73/k$a;", "Ldx/b;", "domainError", "Loq/i0;", "w9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lib4/c;", "c", "Lac4/a;", "d", "Lm73/b;", "e", "Lm73/g;", "f", "Lo20/t2$a;", "g", "Lh64/r;", "h", "Lj73/a;", "j", "Lwz/a;", "Ll73/j$a;", "k", "Ll73/j$a;", "initialState", "Lxw/b;", "Ll73/g;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "p", "a", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 extends l00.g<State<p073l73.j>, a> implements p073l73.k, zx.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f116806q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m73.b studentCardDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m73.g studentCardDocumentMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r loadServicesUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final j73.a studentCardContainersInteractor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l73.j.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p073l73.g> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t<State<p073l73.j>, a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<l73.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<l73.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f116819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f116820b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f116821a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f116822b;

            /* JADX INFO: renamed from: l73.i0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2825a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f116823d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f116824e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f116825f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f116827h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f116828j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f116829k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f116830l;

                public C2825a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f116823d = obj;
                    this.f116824e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i0 i0Var) {
                this.f116821a = hVar;
                this.f116822b = i0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2825a c2825a;
                if (eVar instanceof C2825a) {
                    c2825a = (C2825a) eVar;
                    int i15 = c2825a.f116824e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2825a.f116824e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2825a = new C2825a(eVar);
                    }
                } else {
                    c2825a = new C2825a(eVar);
                }
                Object obj2 = c2825a.f116823d;
                Object objE = uq.b.e();
                int i16 = c2825a.f116824e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f116821a;
                    l73.k.a aVarY9 = this.f116822b.y9((State) obj);
                    c2825a.f116825f = vq.j.a(obj);
                    c2825a.f116827h = vq.j.a(c2825a);
                    c2825a.f116828j = vq.j.a(obj);
                    c2825a.f116829k = vq.j.a(hVar);
                    c2825a.f116830l = 0;
                    c2825a.f116824e = 1;
                    if (hVar.F(aVarY9, c2825a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, i0 i0Var) {
            this.f116819a = gVar;
            this.f116820b = i0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super l73.k.a> hVar, tq.e eVar) {
            Object objA = this.f116819a.a(new a(hVar, this.f116820b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll73/a;", "<unused var>", "Ll73/j;", "Loq/i0;", "<anonymous>", "(Ll73/a;Ll73/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<a, p073l73.j, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116831e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116831e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p073l73.g> bVarY1 = i0.this.Y1();
                l73.g.a aVar = l73.g.a.f116796a;
                this.f116831e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, p073l73.j jVar, tq.e<? super oq.i0> eVar) {
            return i0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ll73/j$a;", "state", "Lk10/l;", "Ll73/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<c0<l73.j.a>, tq.e<? super l<? extends p073l73.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116836h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f116837j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f116838k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f116839l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f116840m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116841n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f116842p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f116843q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f116844r;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p073l73.j.Initialized O(List list, k73.b bVar, StudentCardData studentCardData, String str, Bitmap bitmap, l73.j.a aVar) {
            return new p073l73.j.Initialized(studentCardData, bVar, bVar.e(), iq0.q.a(list, rq0.c.SAFE_BUS), str, bitmap);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:24:0x011d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0121  */
        /* JADX WARN: Code duplicated, block: B:28:0x0134  */
        /* JADX WARN: Code duplicated, block: B:29:0x0139  */
        /* JADX WARN: Code duplicated, block: B:33:0x0161  */
        /* JADX WARN: Code duplicated, block: B:36:0x016a  */
        /* JADX WARN: Code duplicated, block: B:41:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:46:0x01df  */
        /* JADX WARN: Code duplicated, block: B:50:0x0214  */
        /* JADX WARN: Code duplicated, block: B:54:0x027e  */
        /* JADX WARN: Code duplicated, block: B:57:0x0295  */
        /* JADX WARN: Code duplicated, block: B:59:0x029b  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0114, code lost:
        
            if (r7.w9(r3, r23) == r2) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x019c, code lost:
        
            if (r7.w9(r10, r23) == r2) goto L53;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 694
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l73.i0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<l73.j.a> c0Var, tq.e<? super l<? extends p073l73.j>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = i0.this.new d(eVar);
            dVar.f116844r = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll73/f;", "<unused var>", "Ll73/j$b;", "state", "Loq/i0;", "<anonymous>", "(Ll73/f;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<p073l73.f, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116847f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p073l73.j.Initialized initialized = (p073l73.j.Initialized) this.f116847f;
            Object objE = uq.b.e();
            int i15 = this.f116846e;
            if (i15 == 0) {
                u.b(obj);
                if (initialized.getStatus().e()) {
                    xw.b<p073l73.g> bVarY1 = i0.this.Y1();
                    l73.g.e eVar = l73.g.e.f116800a;
                    this.f116847f = vq.j.a(initialized);
                    this.f116846e = 1;
                    if (bVarY1.F(eVar, this) == objE) {
                        return objE;
                    }
                } else {
                    i0.this.d9(p073l73.i.f116804a);
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.f fVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar) {
            e eVar2 = i0.this.new e(eVar);
            eVar2.f116847f = initialized;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll73/e;", "<unused var>", "Ll73/j$b;", "Loq/i0;", "<anonymous>", "(Ll73/e;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<p073l73.e, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f116852h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116853j;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x009a  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            if (r8 == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (r1.F(r2, r7) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        
            if (r1.F(r3, r7) == r0) goto L39;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l73.i0.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.e eVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            return i0.this.new f(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll73/i;", "<unused var>", "Ll73/j$b;", "Loq/i0;", "<anonymous>", "(Ll73/i;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<p073l73.i, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116855e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116855e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p073l73.g> bVarY1 = i0.this.Y1();
                p073l73.g.ShowDialog showDialog = new p073l73.g.ShowDialog(i0.this.studentCardDialogMapper.b(new m73.c.Refresh(i0.this.b9(p073l73.e.f116792a))));
                this.f116855e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.i iVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return i0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll73/h;", "<unused var>", "Ll73/j$b;", "Loq/i0;", "<anonymous>", "(Ll73/h;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<p073l73.h, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116859g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f116860h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116861j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f116861j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f116858f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f116857e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L6c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L40
            L26:
                oq.u.b(r6)
                l73.i0 r6 = p073l73.i0.this
                j73.a r6 = p073l73.i0.r9(r6)
                l73.i0 r1 = p073l73.i0.this
                l73.c r4 = p073l73.c.f116788a
                er.a r1 = p073l73.i0.m9(r1, r4)
                r5.f116861j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                l73.i0 r1 = p073l73.i0.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                l73.g$f r4 = new l73.g$f
                r4.<init>(r3)
                r5.f116857e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f116858f = r6
                r6 = 0
                r5.f116859g = r6
                r5.f116860h = r6
                r5.f116861j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l73.i0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.h hVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return i0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll73/d;", "<unused var>", "Ll73/j$b;", "Loq/i0;", "<anonymous>", "(Ll73/d;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements q<p073l73.d, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116865g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f116866h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116867j;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f116867j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f116864f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f116864f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f116863e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                l73.i0 r8 = p073l73.i0.this
                j73.a r8 = p073l73.i0.r9(r8)
                rq0.c r1 = rq0.c.SAFE_BUS
                r7.f116867j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                l73.i0 r1 = p073l73.i0.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                l73.g$c r4 = new l73.g$c
                l03.a$a r6 = l03.a.C2766a.f113996a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f116863e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f116864f = r8
                r7.f116865g = r5
                r7.f116866h = r5
                r7.f116867j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                l73.g$f r4 = new l73.g$f
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f116863e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f116864f = r8
                r7.f116865g = r5
                r7.f116866h = r5
                r7.f116867j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l73.i0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.d dVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return i0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll73/c;", "<unused var>", "Ll73/j$b;", "state", "Loq/i0;", "<anonymous>", "(Ll73/c;Ll73/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements q<p073l73.c, p073l73.j.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116870f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f116872e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i0 f116873f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p073l73.j.Initialized f116874g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i0 i0Var, p073l73.j.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f116873f = i0Var;
                this.f116874g = initialized;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f116872e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                j73.a aVar = this.f116873f.studentCardContainersInteractor;
                Document document = this.f116874g.getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                rq0.b.d dVar = rq0.b.d.STUDENT_CARD;
                this.f116872e = 1;
                Object objB = aVar.b(documentId, dVar, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f116873f, this.f116874g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (r12.F(r2, r11) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f116870f
                l73.j$b r0 = (p073l73.j.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f116869e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                r8 = r11
                goto L5f
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                r8 = r11
                goto L48
            L24:
                oq.u.b(r12)
                l73.i0 r12 = p073l73.i0.this
                ac4.a r5 = p073l73.i0.p9(r12)
                l73.i0$j$a r7 = new l73.i0$j$a
                l73.i0 r12 = p073l73.i0.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f116870f = r12
                r11.f116869e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5e
            L48:
                l73.i0 r12 = p073l73.i0.this
                xw.b r12 = r12.Y1()
                l73.g$a r2 = l73.g.a.f116796a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f116870f = r0
                r8.f116869e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5f
            L5e:
                return r1
            L5f:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: l73.i0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.c cVar, p073l73.j.Initialized initialized, tq.e<? super oq.i0> eVar) {
            j jVar = i0.this.new j(eVar);
            jVar.f116870f = initialized;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll73/b;", "<unused var>", "Lk10/c0;", "Ll73/j$b;", "state", "Lk10/l;", "Ll73/j;", "<anonymous>", "(Ll73/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements q<p073l73.b, c0<p073l73.j.Initialized>, tq.e<? super l<? extends p073l73.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116876f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p073l73.j.Initialized O(p073l73.j.Initialized initialized) {
            return p073l73.j.Initialized.b(initialized, null, null, false, false, null, null, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f116876f;
            uq.b.e();
            if (this.f116875e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: l73.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return i0.k.O((j.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p073l73.b bVar, c0<p073l73.j.Initialized> c0Var, tq.e<? super l<? extends p073l73.j>> eVar) {
            k kVar = new k(eVar);
            kVar.f116876f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    public i0(n20.j jVar, ib4.c cVar, ac4.a aVar, m73.b bVar, m73.g gVar, t2.a aVar2, r rVar, j73.a aVar3, wz.a aVar4) {
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar;
        this.studentCardDialogMapper = bVar;
        this.studentCardDocumentMapper = gVar;
        this.deps = aVar2;
        this.loadServicesUseCase = rVar;
        this.studentCardContainersInteractor = aVar3;
        this.barcodeGenerator = aVar4;
        l73.j.a aVar5 = l73.j.a.f116877a;
        this.initialState = aVar5;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(aVar5, new er.l() { // from class: l73.c0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.B9(this.f116789a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), y9(new State<>(aVar5, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(final i0 i0Var, v vVar) {
        vVar.c(q0.c(p073l73.j.class), new er.l() { // from class: l73.d0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.C9(this.f116791a, (z) obj);
            }
        });
        vVar.c(q0.c(l73.j.a.class), new er.l() { // from class: l73.e0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.D9(this.f116793a, (z) obj);
            }
        });
        vVar.c(q0.c(p073l73.j.Initialized.class), new er.l() { // from class: l73.f0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.E9(this.f116795a, (z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(i0 i0Var, z zVar) {
        c cVar = i0Var.new c(null);
        zVar.x(q0.c(a.class), o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(i0 i0Var, z zVar) {
        zVar.A(i0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(i0 i0Var, z zVar) {
        e eVar = i0Var.new e(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p073l73.f.class), oVar, eVar);
        zVar.x(q0.c(p073l73.e.class), oVar, i0Var.new f(null));
        zVar.x(q0.c(p073l73.i.class), oVar, i0Var.new g(null));
        zVar.x(q0.c(p073l73.h.class), oVar, i0Var.new h(null));
        zVar.x(q0.c(p073l73.d.class), oVar, i0Var.new i(null));
        zVar.x(q0.c(p073l73.c.class), oVar, i0Var.new j(null));
        zVar.v(q0.c(p073l73.b.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new p073l73.g.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: l73.h0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.x9((c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Close) {
            a aVar = a.f116784a;
        } else if (bVar instanceof ib4.c.b.a.Primary) {
            p073l73.c cVar = p073l73.c.f116788a;
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            a aVar2 = a.f116784a;
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l73.k.a y9(State<p073l73.j> state) {
        m73.g gVar = this.studentCardDocumentMapper;
        er.a<oq.i0> aVarB9 = b9(p073l73.f.f116794a);
        er.a<oq.i0> aVarB10 = b9(p073l73.e.f116792a);
        er.a<oq.i0> aVarB11 = b9(p073l73.h.f116803a);
        er.a<oq.i0> aVarB12 = b9(a.f116784a);
        er.a<oq.i0> aVarB13 = b9(p073l73.b.f116787a);
        return gVar.b(new m73.g.Params(state, new t2(this.deps, u0.a(this)), aVarB9, b9(p073l73.d.f116790a), aVarB10, aVarB11, aVarB12, aVarB13, new er.l() { // from class: l73.g0
            @Override // er.l
            public final Object b(Object obj) {
                return i0.z9(this.f116802a, (a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(i0 i0Var, a aVar) {
        i0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<p073l73.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State<p073l73.j>, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l73.k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p073l73.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }
}
