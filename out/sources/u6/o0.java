package u6;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lu6/o0;", "Lu6/d0;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Ltq/e;", "", "block", "e", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "b", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "c", "Ljava/lang/String;", "Lsu/a;", "Lsu/a;", "mutex", "Lu6/b;", "Lu6/b;", "version", "Lmu/g;", "Loq/i0;", "d", "Lmu/g;", "()Lmu/g;", "updateNotifications", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String filePath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u6.b version = new u6.b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<oq.i0> updateNotifications = mu.i.I(new c(null));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195722f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195724h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195722f = obj;
            this.f195724h |= PKIFailureInfo.systemUnavail;
            return o0.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f195726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195727f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195729h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195727f = obj;
            this.f195729h |= PKIFailureInfo.systemUnavail;
            return o0.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends vq.k implements er.p<mu.h<? super oq.i0>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195730e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f195730e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super oq.i0> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(eVar);
        }
    }

    public o0(String str) {
        this.filePath = str;
    }

    @Override // u6.d0
    public Object a(tq.e<? super Integer> eVar) {
        return vq.b.e(this.version.b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.d0
    public <T> Object b(er.p<? super Boolean, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        b bVar;
        su.a aVar;
        Throwable th4;
        boolean z15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f195729h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f195729h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f195727f;
        Object objE = uq.b.e();
        int i16 = bVar.f195729h;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = bVar.f195726e;
            aVar = (su.a) bVar.f195725d;
            try {
                oq.u.b(obj);
                if (z15) {
                    aVar.r(null);
                }
                return obj;
            } catch (Throwable th5) {
                th4 = th5;
                if (z15) {
                    aVar.r(null);
                }
                throw th4;
            }
        }
        oq.u.b(obj);
        su.a aVar2 = this.mutex;
        boolean zM = aVar2.m(null);
        try {
            Boolean boolA = vq.b.a(zM);
            bVar.f195725d = aVar2;
            bVar.f195726e = zM;
            bVar.f195729h = 1;
            Object objB = pVar.B(boolA, bVar);
            if (objB == objE) {
                return objE;
            }
            aVar = aVar2;
            obj = objB;
            z15 = zM;
            if (z15) {
                aVar.r(null);
            }
            return obj;
        } catch (Throwable th6) {
            aVar = aVar2;
            th4 = th6;
            z15 = zM;
            if (z15) {
                aVar.r(null);
            }
            throw th4;
        }
    }

    @Override // u6.d0
    public Object c(tq.e<? super Integer> eVar) {
        return vq.b.e(this.version.d());
    }

    @Override // u6.d0
    public mu.g<oq.i0> d() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.d0
    public <T> Object e(er.l<? super tq.e<? super T>, ? extends Object> lVar, tq.e<? super T> eVar) throws Throwable {
        a aVar;
        su.a aVar2;
        Throwable th4;
        su.a aVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f195724h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f195724h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f195722f;
        Object objE = uq.b.e();
        int i16 = aVar.f195724h;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                aVar2 = this.mutex;
                aVar.f195720d = lVar;
                aVar.f195721e = aVar2;
                aVar.f195724h = 1;
                if (aVar2.h(null, aVar) != objE) {
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (su.a) aVar.f195720d;
                try {
                    oq.u.b(obj);
                    aVar3.r(null);
                    return obj;
                } catch (Throwable th5) {
                    th4 = th5;
                    aVar3.r(null);
                    throw th4;
                }
            }
            su.a aVar4 = (su.a) aVar.f195721e;
            er.l<? super tq.e<? super T>, ? extends Object> lVar2 = (er.l) aVar.f195720d;
            oq.u.b(obj);
            aVar2 = aVar4;
            lVar = lVar2;
            aVar.f195720d = aVar2;
            aVar.f195721e = null;
            aVar.f195724h = 2;
            Object objB = lVar.b(aVar);
            if (objB != objE) {
                su.a aVar5 = aVar2;
                obj = objB;
                aVar3 = aVar5;
                aVar3.r(null);
                return obj;
            }
            return objE;
        } catch (Throwable th6) {
            su.a aVar6 = aVar2;
            th4 = th6;
            aVar3 = aVar6;
            aVar3.r(null);
            throw th4;
        }
    }
}
