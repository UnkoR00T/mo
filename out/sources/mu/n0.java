package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmu/n0;", "Lmu/l0;", "<init>", "()V", "Lmu/p0;", "", "subscriptionCount", "Lmu/g;", "Lmu/j0;", "a", "(Lmu/p0;)Lmu/g;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n0 implements l0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Lmu/j0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<h<? super j0>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f128241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0<Integer> f128242g;

        /* JADX INFO: renamed from: mu.n0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C3168a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fr.l0 f128243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h<j0> f128244b;

            /* JADX INFO: renamed from: mu.n0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class C3169a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128245d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ C3168a<T> f128246e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f128247f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C3169a(C3168a<? super T> c3168a, tq.e<? super C3169a> eVar) {
                    super(eVar);
                    this.f128246e = c3168a;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128245d = obj;
                    this.f128247f |= PKIFailureInfo.systemUnavail;
                    return this.f128246e.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C3168a(fr.l0 l0Var, h<? super j0> hVar) {
                this.f128243a = l0Var;
                this.f128244b = hVar;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Number) obj).intValue(), eVar);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i15, tq.e<? super oq.i0> eVar) throws Throwable {
                C3169a c3169a;
                if (eVar instanceof C3169a) {
                    c3169a = (C3169a) eVar;
                    int i16 = c3169a.f128247f;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        c3169a.f128247f = i16 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3169a = new C3169a(this, eVar);
                    }
                } else {
                    c3169a = new C3169a(this, eVar);
                }
                Object obj = c3169a.f128245d;
                Object objE = uq.b.e();
                int i17 = c3169a.f128247f;
                if (i17 == 0) {
                    oq.u.b(obj);
                    if (i15 > 0) {
                        fr.l0 l0Var = this.f128243a;
                        if (!l0Var.f66404a) {
                            l0Var.f66404a = true;
                            h<j0> hVar = this.f128244b;
                            j0 j0Var = j0.START;
                            c3169a.f128247f = 1;
                            if (hVar.F(j0Var, c3169a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return oq.i0.f148189a;
                }
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0<Integer> p0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f128242g = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128240e;
            if (i15 == 0) {
                oq.u.b(obj);
                h hVar = (h) this.f128241f;
                fr.l0 l0Var = new fr.l0();
                p0<Integer> p0Var = this.f128242g;
                C3168a c3168a = new C3168a(l0Var, hVar);
                this.f128240e = 1;
                if (p0Var.a(c3168a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h<? super j0> hVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f128242g, eVar);
            aVar.f128241f = obj;
            return aVar;
        }
    }

    @Override // mu.l0
    public g<j0> a(p0<Integer> subscriptionCount) {
        return i.I(new a(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
