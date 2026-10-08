package uw3;

import cw3.IdentityPhotoData;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import yw3.SetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006O"}, d2 = {"Luw3/l;", "Ll00/g;", "Luw3/b;", "Luw3/a;", "Luw3/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lvw3/d;", "mapper", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/d;", "checkPhotoResolutionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La00/b;", "pickedFileToAndroidMapper", "Lvw3/c;", "filePickerErrorMapper", "globalSnackBarManager", "Lcw3/a;", "data", "<init>", "(Lyy/a;Lvw3/d;Lbc4/l;Lbc4/d;Lac4/a;La00/b;Lvw3/c;Li70/e;Lcw3/a;)V", "state", "Luw3/c$a;", "t9", "(Luw3/b;)Luw3/c$a;", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "r9", "(Ldx/b;Luw3/a;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lvw3/d;", "c", "Lbc4/l;", "d", "Lbc4/d;", "e", "Lac4/a;", "f", "La00/b;", "g", "Lvw3/c;", "h", "Li70/e;", "j", "Lcw3/a;", "k", "Luw3/b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Luw3/a$a;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<uw3.b, uw3.a> implements uw3.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vw3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.d checkPhotoResolutionUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final vw3.c filePickerErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final IdentityPhotoData data;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final uw3.b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<uw3.b, uw3.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uw3.a.InterfaceC5251a> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<uw3.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<uw3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f202039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f202040b;

        /* JADX INFO: renamed from: uw3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5254a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f202041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f202042b;

            /* JADX INFO: renamed from: uw3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5255a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f202043d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f202044e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f202045f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f202047h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f202048j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f202049k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f202050l;

                public C5255a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f202043d = obj;
                    this.f202044e |= PKIFailureInfo.systemUnavail;
                    return C5254a.this.F(null, this);
                }
            }

            public C5254a(mu.h hVar, l lVar) {
                this.f202041a = hVar;
                this.f202042b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5255a c5255a;
                if (eVar instanceof C5255a) {
                    c5255a = (C5255a) eVar;
                    int i15 = c5255a.f202044e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5255a.f202044e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5255a = new C5255a(eVar);
                    }
                } else {
                    c5255a = new C5255a(eVar);
                }
                Object obj2 = c5255a.f202043d;
                Object objE = uq.b.e();
                int i16 = c5255a.f202044e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f202041a;
                    uw3.c.Data dataT9 = this.f202042b.t9((uw3.b) obj);
                    c5255a.f202045f = vq.j.a(obj);
                    c5255a.f202047h = vq.j.a(c5255a);
                    c5255a.f202048j = vq.j.a(obj);
                    c5255a.f202049k = vq.j.a(hVar);
                    c5255a.f202050l = 0;
                    c5255a.f202044e = 1;
                    if (hVar.F(dataT9, c5255a) == objE) {
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
            this.f202039a = gVar;
            this.f202040b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super uw3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f202039a.a(new C5254a(hVar, this.f202040b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luw3/a$b;", "<unused var>", "Luw3/b;", "Loq/i0;", "<anonymous>", "(Luw3/a$b;Luw3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<uw3.a.b, uw3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202051e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f202051e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<uw3.a.InterfaceC5251a> bVarY1 = l.this.Y1();
                uw3.a.InterfaceC5251a.C5252a c5252a = uw3.a.InterfaceC5251a.C5252a.f202001a;
                this.f202051e = 1;
                if (bVarY1.F(c5252a, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw3.a.b bVar, uw3.b bVar2, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luw3/a$c;", "action", "Luw3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luw3/a$c;Luw3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<uw3.a.c, uw3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f202053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f202054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f202055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f202056h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f202057j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f202058k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzz/h;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends zz.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f202060e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f202061f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ bc4.l.Result f202062g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, bc4.l.Result result, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f202061f = lVar;
                this.f202062g = result;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f202060e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                a00.b bVar = this.f202061f.pickedFileToAndroidMapper;
                a00.b.Params params = new a00.b.Params(this.f202062g.getImageFile());
                this.f202060e = 1;
                Object objA = bVar.a(params, this);
                return objA == objE ? objE : objA;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f202061f, this.f202062g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends zz.h>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00da  */
        /* JADX WARN: Code duplicated, block: B:32:0x00de  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:41:0x0100  */
        /* JADX WARN: Code duplicated, block: B:43:0x0105  */
        /* JADX WARN: Code duplicated, block: B:47:0x0138  */
        /* JADX WARN: Code duplicated, block: B:49:0x013c  */
        /* JADX WARN: Code duplicated, block: B:52:0x0152  */
        /* JADX WARN: Code duplicated, block: B:55:0x017a  */
        /* JADX WARN: Code duplicated, block: B:57:0x017e  */
        /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:64:0x01db  */
        /* JADX WARN: Code duplicated, block: B:66:0x01e1  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
        
            if (r0 == r7) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
        
            if (r1.r9(r2, r6, r18) == r7) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01cf, code lost:
        
            if (r4.F(r5, r18) == r7) goto L59;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uw3.l.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw3.a.c cVar, uw3.b bVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f202058k = cVar;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luw3/a$d;", "<unused var>", "Luw3/b;", "Loq/i0;", "<anonymous>", "(Luw3/a$d;Luw3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<uw3.a.d, uw3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202063e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f202063e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<uw3.a.InterfaceC5251a> bVarY1 = l.this.Y1();
                uw3.a.InterfaceC5251a.ToTakePhoto toTakePhoto = new uw3.a.InterfaceC5251a.ToTakePhoto(new SetupData(l.this.data.getRequirements(), l.this.data.getMaskType(), l.this.data.getIsUnderGuardianship()));
                this.f202063e = 1;
                if (bVarY1.F(toTakePhoto, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uw3.a.d dVar, uw3.b bVar, tq.e<? super i0> eVar) {
            return l.this.new d(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, vw3.d dVar, bc4.l lVar, bc4.d dVar2, ac4.a aVar2, a00.b bVar, vw3.c cVar, i70.e eVar, IdentityPhotoData identityPhotoData) {
        this.mapper = dVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.checkPhotoResolutionUseCase = dVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.filePickerErrorMapper = cVar;
        this.globalSnackBarManager = eVar;
        this.data = identityPhotoData;
        uw3.b bVar2 = uw3.b.f202009a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: uw3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.v9(this.f202026a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(dx.b bVar, final uw3.a aVar, tq.e<? super i0> eVar) {
        vw3.c.b bVarB = this.filePickerErrorMapper.b(new vw3.c.Params(bVar, new er.a() { // from class: uw3.j
            @Override // er.a
            public final Object a() {
                return l.s9(this.f202024a, aVar);
            }
        }));
        if (bVarB != null) {
            if (bVarB instanceof vw3.c.b.Dialog) {
                Object objF = F(new uw3.a.InterfaceC5251a.NavigationDialog(((vw3.c.b.Dialog) bVarB).getDialogData()), eVar);
                if (objF == uq.b.e()) {
                    return objF;
                }
            } else {
                if (!(bVarB instanceof vw3.c.b.FullPage)) {
                    throw new p();
                }
                Object objF2 = F(new uw3.a.InterfaceC5251a.Error(((vw3.c.b.FullPage) bVarB).getData()), eVar);
                if (objF2 == uq.b.e()) {
                    return objF2;
                }
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(l lVar, uw3.a aVar) {
        lVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uw3.c.Data t9(uw3.b state) {
        return this.mapper.b(new vw3.d.Params(state, b9(uw3.a.c.f202007a), b9(uw3.a.d.f202008a), b9(uw3.a.b.f202006a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final l lVar, v vVar) {
        vVar.c(q0.c(uw3.b.class), new er.l() { // from class: uw3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.w9(this.f202023a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(uw3.a.b.class), oVar, bVar);
        zVar.x(q0.c(uw3.a.c.class), oVar, lVar.new c(null));
        zVar.x(q0.c(uw3.a.d.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<uw3.a.InterfaceC5251a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<uw3.b, uw3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<uw3.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(uw3.a.InterfaceC5251a interfaceC5251a, tq.e<? super i0> eVar) {
        return super.F(interfaceC5251a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(IdentityPhotoData identityPhotoData) {
        super.P5(identityPhotoData);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
