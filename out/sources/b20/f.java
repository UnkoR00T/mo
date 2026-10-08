package b20;

import er.p;
import mu.h;
import mu.i;
import oq.i0;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb20/f;", "Lez/g;", "<init>", "()V", "Lgu/b;", "tick", "Lmu/g;", "a", "(J)Lmu/g;", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ez.g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Lgu/b;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<h<? super gu.b>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f16141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f16143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f16144h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j15, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f16144h = j15;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0039  */
        /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r5
          0x004a: PHI (r5v1 long) = (r5v2 long), (r5v5 long) binds: [B:14:0x0047, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0060  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (ju.z0.c(r7, r9) == r1) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:19:0x0059). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f16143g
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f16142f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                long r5 = r9.f16141e
                oq.u.b(r10)
                goto L59
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                long r5 = r9.f16141e
                oq.u.b(r10)
                goto L4a
            L26:
                oq.u.b(r10)
                gu.b$a r10 = gu.b.INSTANCE
                long r5 = r10.d()
            L2f:
                tq.i r10 = r9.getContext()
                boolean r10 = ju.g2.n(r10)
                if (r10 == 0) goto L60
                gu.b r10 = gu.b.o(r5)
                r9.f16143g = r0
                r9.f16141e = r5
                r9.f16142f = r4
                java.lang.Object r10 = r0.F(r10, r9)
                if (r10 != r1) goto L4a
                goto L58
            L4a:
                long r7 = r9.f16144h
                r9.f16143g = r0
                r9.f16141e = r5
                r9.f16142f = r3
                java.lang.Object r10 = ju.z0.c(r7, r9)
                if (r10 != r1) goto L59
            L58:
                return r1
            L59:
                long r7 = r9.f16144h
                long r5 = gu.b.W(r5, r7)
                goto L2f
            L60:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: b20.f.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h<? super gu.b> hVar, tq.e<? super i0> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f16144h, eVar);
            aVar.f16143g = obj;
            return aVar;
        }
    }

    @Override // ez.g
    public mu.g<gu.b> a(long tick) {
        return i.I(new a(tick, null));
    }
}
