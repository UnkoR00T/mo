package k10;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "R", "Lmu/g;", "Lk10/o;", "executionPolicy", "Lkotlin/Function2;", "Ltq/e;", "", "transform", "a", "(Lmu/g;Lk10/o;Ler/p;)Lmu/g;", "statemachine_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107332a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.CANCEL_PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.ORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.UNORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107332a = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class b<R, T> extends vq.k implements er.q<mu.h<? super R>, T, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f107334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f107335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p f107336h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f107337j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(er.p pVar, tq.e eVar) {
            super(3, eVar);
            this.f107336h = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        
            if (mu.i.u(r1, (mu.g) r7, r6) == r0) goto L16;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f107333e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f107334f
                mu.h r0 = (mu.h) r0
                oq.u.b(r7)
                goto L6d
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f107337j
                mu.h r1 = (mu.h) r1
                java.lang.Object r3 = r6.f107335g
                java.lang.Object r4 = r6.f107334f
                mu.h r4 = (mu.h) r4
                oq.u.b(r7)
                goto L53
            L2c:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f107334f
                r1 = r7
                mu.h r1 = (mu.h) r1
                java.lang.Object r7 = r6.f107335g
                er.p r4 = r6.f107336h
                java.lang.Object r5 = vq.j.a(r1)
                r6.f107334f = r5
                java.lang.Object r5 = vq.j.a(r7)
                r6.f107335g = r5
                r6.f107337j = r1
                r6.f107333e = r3
                java.lang.Object r3 = r4.B(r7, r6)
                if (r3 != r0) goto L4f
                goto L6c
            L4f:
                r4 = r3
                r3 = r7
                r7 = r4
                r4 = r1
            L53:
                mu.g r7 = (mu.g) r7
                java.lang.Object r4 = vq.j.a(r4)
                r6.f107334f = r4
                java.lang.Object r3 = vq.j.a(r3)
                r6.f107335g = r3
                r3 = 0
                r6.f107337j = r3
                r6.f107333e = r2
                java.lang.Object r7 = mu.i.u(r1, r7, r6)
                if (r7 != r0) goto L6d
            L6c:
                return r0
            L6d:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k10.p.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super R> hVar, T t15, tq.e<? super i0> eVar) {
            b bVar = new b(this.f107336h, eVar);
            bVar.f107334f = hVar;
            bVar.f107335g = t15;
            return bVar.J(i0.f148189a);
        }
    }

    public static final <T, R> mu.g<R> a(mu.g<? extends T> gVar, o oVar, er.p<? super T, ? super tq.e<? super mu.g<? extends R>>, ? extends Object> pVar) {
        int i15 = a.f107332a[oVar.ordinal()];
        if (i15 == 1) {
            return mu.i.d0(gVar, new b(pVar, null));
        }
        if (i15 == 2) {
            return mu.i.D(gVar, pVar);
        }
        if (i15 == 3) {
            return mu.v.c(gVar, 0, pVar, 1, null);
        }
        throw new oq.p();
    }
}
