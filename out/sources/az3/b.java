package az3;

import er.l;
import java.util.Map;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Laz3/b;", "Lxy3/a;", "Lzy3/a;", "setPasswordApplicationLockInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lxy3/b;", "validatePasswordUC", "Lzy3/c;", "setPasswordUserInteractor", "Lzy3/b;", "setPasswordBiometricInteractor", "<init>", "(Lzy3/a;Lac4/a;Lxy3/b;Lzy3/c;Lzy3/b;)V", "Lxy3/a$a;", "params", "Lxy3/a$b;", "g", "(Lxy3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzy3/a;", "b", "Lac4/a;", "c", "Lxy3/b;", "d", "Lzy3/c;", "e", "Lzy3/b;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xy3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zy3.a setPasswordApplicationLockInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xy3.b validatePasswordUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zy3.c setPasswordUserInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zy3.b setPasswordBiometricInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15527f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15529h;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15527f = obj;
            this.f15529h |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: az3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxy3/a$b;", "<anonymous>", "()Lxy3/a$b;"}, k = 3, mv = {2, 2, 0})
    static final class C0365b extends k implements l<e<? super xy3.a.b>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f15530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15531f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ xy3.a.Params f15533h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0365b(xy3.a.Params params, e<? super C0365b> eVar) {
            super(1, eVar);
            this.f15533h = params;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (r8 == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        
            if (r8 == r0) goto L38;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: az3.b.C0365b.J(java.lang.Object):java.lang.Object");
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new C0365b(this.f15533h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super xy3.a.b> eVar) {
            return ((C0365b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(zy3.a aVar, ac4.a aVar2, xy3.b bVar, zy3.c cVar, zy3.b bVar2) {
        this.setPasswordApplicationLockInteractor = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.validatePasswordUC = bVar;
        this.setPasswordUserInteractor = cVar;
        this.setPasswordBiometricInteractor = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(xy3.a.Params params, e<? super xy3.a.b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f15529h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f15529h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objC = aVar2.f15527f;
        Object objE = uq.b.e();
        int i16 = aVar2.f15529h;
        if (i16 == 0) {
            u.b(objC);
            xy3.b bVar = this.validatePasswordUC;
            xy3.b.Params params2 = new xy3.b.Params(params.getPassword(), null, 2, null);
            aVar2.f15525d = params;
            aVar2.f15529h = 1;
            objC = bVar.c(params2, aVar2);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
            return objC;
        }
        params = (xy3.a.Params) aVar2.f15525d;
        u.b(objC);
        Map map = (Map) objC;
        if (!wy3.b.a(map)) {
            return xy3.a.b.c.f222407a;
        }
        ac4.a aVar3 = this.callActionWithLoaderUseCase;
        C0365b c0365b = new C0365b(params, null);
        aVar2.f15525d = j.a(params);
        aVar2.f15526e = j.a(map);
        aVar2.f15529h = 2;
        Object objA = ac4.a.a(aVar3, null, c0365b, aVar2, 1, null);
        return objA == objE ? objE : objA;
    }
}
