package hc4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhc4/c;", "Lbc4/c;", "Lbc4/b;", "checkFileSizeUseCase", "<init>", "(Lbc4/b;)V", "Lbc4/c$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lbc4/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bc4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f83306h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f83307j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83308k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f83309l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f83310m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f83311n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83313q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83311n = obj;
            this.f83313q |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f83315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ bc4.c.Params f83316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f83317h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c f83318j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f83319e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ex.b<dx.b> f83320f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f83321g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f83322h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ bc4.c.Params f83323j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ex.b<? super dx.b> bVar, c cVar, float f15, bc4.c.Params params, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f83320f = bVar;
                this.f83321g = cVar;
                this.f83322h = f15;
                this.f83323j = params;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f83319e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                this.f83320f.a((dx.i) this.f83321g.checkFileSizeUseCase.a(new bc4.b.Params(this.f83322h, this.f83323j.getSizePolicy().getMaxSize())));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f83320f, this.f83321g, this.f83322h, this.f83323j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(bc4.c.Params params, ex.b<? super dx.b> bVar, c cVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f83316g = params;
            this.f83317h = bVar;
            this.f83318j = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objA;
            p0 p0Var = (p0) this.f83315f;
            Object objE = uq.b.e();
            int i15 = this.f83314e;
            if (i15 == 0) {
                u.b(obj);
                bc4.j.b sizePolicy = this.f83316g.getSizePolicy();
                if (sizePolicy instanceof bc4.j.b.Total) {
                    ex.b<dx.b> bVar = this.f83317h;
                    bc4.b bVar2 = this.f83318j.checkFileSizeUseCase;
                    List<xw.a> listB = this.f83316g.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(vq.b.d(((xw.a) it.next()).getValue()));
                    }
                    bVar.a((dx.i) bVar2.a(new bc4.b.Params(v.V0(arrayList), this.f83316g.getSizePolicy().getMaxSize())));
                } else {
                    if (!(sizePolicy instanceof bc4.j.b.PerFile)) {
                        throw new oq.p();
                    }
                    List<xw.a> listB2 = this.f83316g.b();
                    ex.b<dx.b> bVar3 = this.f83317h;
                    c cVar = this.f83318j;
                    bc4.c.Params params = this.f83316g;
                    ArrayList arrayList2 = new ArrayList(v.y(listB2, 10));
                    Iterator<T> it4 = listB2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(ju.k.b(p0Var, null, null, new a(bVar3, cVar, ((xw.a) it4.next()).getValue(), params, null), 3, null));
                    }
                    this.f83315f = vq.j.a(p0Var);
                    this.f83314e = 1;
                    objA = ju.f.a(arrayList2, this);
                    if (objA == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            objA = obj;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f83316g, this.f83317h, this.f83318j, eVar);
            bVar.f83315f = obj;
            return bVar;
        }
    }

    public c(bc4.b bVar) {
        this.checkFileSizeUseCase = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [bc4.c$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.c.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f83313q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83313q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f83311n;
        Object objE = uq.b.e();
        int i16 = aVar.f83313q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        b bVar = new b(params, aVar2, this, null);
                        aVar.f83302d = vq.j.a(params);
                        aVar.f83303e = jVarA;
                        aVar.f83304f = vq.j.a(aVar2);
                        aVar.f83305g = vq.j.a(aVar2);
                        aVar.f83306h = 0;
                        aVar.f83307j = 0;
                        aVar.f83308k = 0;
                        aVar.f83309l = 0;
                        aVar.f83310m = 0;
                        aVar.f83313q = 1;
                        if (q0.e(bVar, aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        params = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(params));
                        dx.i iVarA = params.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }
}
